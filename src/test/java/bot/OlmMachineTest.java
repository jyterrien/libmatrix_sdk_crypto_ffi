package bot;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import uniffi.matrix_sdk_crypto.DecryptionSettings;
import uniffi.matrix_sdk_crypto.TrustRequirement;
import uniffi.matrix_sdk_crypto_ffi.DecryptedEvent;
import uniffi.matrix_sdk_crypto_ffi.DeviceLists;
import uniffi.matrix_sdk_crypto_ffi.EncryptionSettings;
import uniffi.matrix_sdk_crypto_ffi.EventEncryptionAlgorithm;
import uniffi.matrix_sdk_crypto_ffi.HistoryVisibility;
import uniffi.matrix_sdk_crypto_ffi.MatrixSdkCryptoFfi;
import uniffi.matrix_sdk_crypto_ffi.OlmMachine;
import uniffi.matrix_sdk_crypto_ffi.Request;
import uniffi.matrix_sdk_crypto_ffi.RequestType;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests de la couche crypto (OlmMachine) sans aucun serveur Matrix :
 * 1. la lib native se charge et la version correspond aux bindings
 * 2. création / persistance d'une OlmMachine
 * 3. échange chiffré Alice -> Bob via un "faux homeserver" en mémoire
 */
class OlmMachineTest {

    // Doit s'exécuter avant le premier accès aux classes uniffi (leur init charge la lib native).
    static { NativeLib.load(); }

    static final String ALICE = "@alice:example.org", ALICE_DEV = "ALICEDEV";
    static final String BOB = "@bob:example.org", BOB_DEV = "BOBDEV";
    static final String ROOM = "!room:example.org";

    // ---------------------------------------------------------------- 1. smoke

    @Test
    void nativeLibraryLoads() {
        // Si ça échoue ici : lib introuvable (java.library.path) ou bindings/lib de versions différentes
        // ("UniFFI contract version mismatch" / "API checksum mismatch").
        assertFalse(MatrixSdkCryptoFfi.version().isBlank());
        assertFalse(MatrixSdkCryptoFfi.vodozemacVersion().isBlank());
        System.out.println("matrix-sdk-crypto-ffi " + MatrixSdkCryptoFfi.version());
    }

    // ---------------------------------------------------------------- 2. machine

    @Test
    void machineIsCreatedAndExposesIdentity(@TempDir Path dir) throws Exception {
        try (OlmMachine m = new OlmMachine(ALICE, ALICE_DEV, dir.toString(), "passphrase")) {
            assertEquals(ALICE, m.userId());
            assertEquals(ALICE_DEV, m.deviceId());
            Map<String, String> keys = m.identityKeys();
            assertTrue(keys.containsKey("ed25519"));
            assertTrue(keys.containsKey("curve25519"));
            assertTrue(m.outgoingRequests().stream().anyMatch(r -> r instanceof Request.KeysUpload),
                    "une machine neuve doit vouloir uploader ses clés");
        }
    }

    @Test
    void identitySurvivesRestart(@TempDir Path dir) throws Exception {
        Map<String, String> before;
        try (OlmMachine m = new OlmMachine(ALICE, ALICE_DEV, dir.toString(), "pw")) {
            before = m.identityKeys();
        }
        try (OlmMachine m = new OlmMachine(ALICE, ALICE_DEV, dir.toString(), "pw")) {
            assertEquals(before, m.identityKeys());
        }
    }

    // ---------------------------------------------------------------- 3. E2E

    @Test
    void aliceEncryptsBobDecrypts(@TempDir Path dir) throws Exception {
        Files.createDirectories(dir.resolve("a"));
        Files.createDirectories(dir.resolve("b"));
        var settings = new DecryptionSettings(TrustRequirement.UNTRUSTED);
        var server = new FakeHomeserver();

        try (OlmMachine alice = new OlmMachine(ALICE, ALICE_DEV, dir.resolve("a").toString(), "pw");
             OlmMachine bob = new OlmMachine(BOB, BOB_DEV, dir.resolve("b").toString(), "pw")) {

            // 1) Upload des clés des deux appareils
            server.pump(alice);
            server.pump(bob);

            // 2) Alice suit Bob -> /keys/query
            alice.updateTrackedUsers(List.of(BOB));
            server.pump(alice);

            // 3) Alice récupère une one-time key de Bob -> /keys/claim
            Request claim = alice.getMissingSessions(List.of(BOB));
            if (claim != null) server.handle(alice, claim);

            // 4) Alice partage la clé de salon (to-device chiffrés) avec Bob
            var enc = new EncryptionSettings(EventEncryptionAlgorithm.MEGOLM_V1_AES_SHA2,
                    604_800L, 100L, HistoryVisibility.SHARED, false, false);
            for (Request r : alice.shareRoomKey(ROOM, List.of(BOB), enc)) server.handle(alice, r);

            // 5) Bob "reçoit son /sync" avec les to-device
            bob.receiveSyncChanges(server.takeInbox(BOB, BOB_DEV),
                    new DeviceLists(List.of(), List.of()),
                    Map.of("signed_curve25519", 50),
                    List.of(), "s1", settings);

            // 6) Alice chiffre, Bob déchiffre
            String plain = "{\"msgtype\":\"m.text\",\"body\":\"hello bob\"}";
            String encryptedContent = alice.encrypt(ROOM, "m.room.message", plain);

            ObjectMapper om = new ObjectMapper();
            ObjectNode event = om.createObjectNode();
            event.put("event_id", "$ev1");
            event.put("sender", ALICE);
            event.put("origin_server_ts", 1_700_000_000_000L);
            event.put("type", "m.room.encrypted");
            event.set("content", om.readTree(encryptedContent));

            DecryptedEvent dec = bob.decryptRoomEvent(event.toString(), ROOM, false, false, settings);
            JsonNode clear = om.readTree(dec.clearEvent());
            assertEquals("m.room.message", clear.get("type").asText());
            assertEquals("hello bob", clear.get("content").get("body").asText());
        }
    }

    // ------------------------------------------------- chargement de la lib native

    /**
     * Les bindings font System.loadLibrary("matrix_sdk_crypto_ffi"), qui ne cherche PAS dans le classpath.
     * Ici on extrait le .so depuis les ressources vers un fichier temporaire, puis on indique son chemin
     * absolu via la propriété uniffi.component.<nom>.libraryOverride prévue par les bindings.
     * Les trois packages (crypto_ffi, crypto, common) chargent la même lib, donc on pose les trois.
     *
     * Surcharges possibles : -Dolm.lib.path=/abs/libx.so  ou  -Dolm.lib.resource=/mon/chemin/libx.so
     * Si rien n'est trouvé, on laisse System.loadLibrary chercher dans java.library.path.
     */
    static final class NativeLib {
        private static final String[] COMPONENTS = {"matrix_sdk_crypto_ffi", "matrix_sdk_crypto", "matrix_sdk_common"};

        static synchronized void load() {
            try {
                String explicit = System.getProperty("olm.lib.path");
                Path lib = explicit != null ? Path.of(explicit) : extractFromClasspath();
                if (lib == null) return;
                for (String c : COMPONENTS) {
                    System.setProperty("uniffi.component." + c + ".libraryOverride", lib.toAbsolutePath().toString());
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static Path extractFromClasspath() throws IOException {
            String os = System.getProperty("os.name").toLowerCase();
            String file = os.contains("win") ? "matrix_sdk_crypto_ffi.dll"
                    : os.contains("mac") ? "libmatrix_sdk_crypto_ffi.dylib"
                    : "libmatrix_sdk_crypto_ffi.so";
            String custom = System.getProperty("olm.lib.resource");
            List<String> candidates = custom != null ? List.of(custom)
                    : List.of("/" + file, "/native/" + file, "/natives/" + file, "/lib/" + file);
            for (String c : candidates) {
                try (InputStream in = OlmMachineTest.class.getResourceAsStream(c)) {
                    if (in == null) continue;
                    Path tmp = Files.createTempDirectory("olm-native").resolve(file);
                    Files.copy(in, tmp);
                    tmp.toFile().deleteOnExit();
                    tmp.getParent().toFile().deleteOnExit();
                    System.out.println("lib native extraite depuis " + c + " -> " + tmp);
                    return tmp;
                }
            }
            return null;
        }
    }

    // ------------------------------------------------- faux homeserver (mémoire)

    /** Imite juste assez de l'API client-serveur : /keys/upload, /keys/query, /keys/claim, /sendToDevice. */
    static final class FakeHomeserver {
        private final ObjectMapper om = new ObjectMapper();
        private final Map<String, Map<String, JsonNode>> deviceKeys = new HashMap<>();   // user -> device -> device_keys
        private final Map<String, Deque<Map.Entry<String, JsonNode>>> otks = new HashMap<>(); // "user|device" -> clés
        private final Map<String, List<JsonNode>> inbox = new HashMap<>();               // "user|device" -> events

        /** Traite toutes les requêtes sortantes d'une machine (uploads d'abord). */
        void pump(OlmMachine m) throws Exception {
            List<Request> reqs = new ArrayList<>(m.outgoingRequests());
            reqs.sort(Comparator.comparingInt(r -> r instanceof Request.KeysUpload ? 0 : 1));
            for (Request r : reqs) handle(m, r);
        }

        void handle(OlmMachine m, Request r) throws Exception {
            String user = m.userId(), device = m.deviceId();
            if (r instanceof Request.KeysUpload u) {
                JsonNode body = om.readTree(u.body());
                JsonNode dk = body.get("device_keys");
                if (dk != null && !dk.isNull()) {
                    deviceKeys.computeIfAbsent(dk.get("user_id").asText(), k -> new HashMap<>())
                            .put(dk.get("device_id").asText(), dk);
                }
                Deque<Map.Entry<String, JsonNode>> q = otks.computeIfAbsent(user + "|" + device, k -> new ArrayDeque<>());
                JsonNode keys = body.get("one_time_keys");
                if (keys != null) keys.fields().forEachRemaining(e -> q.add(Map.entry(e.getKey(), e.getValue())));
                m.markRequestAsSent(u.requestId(), RequestType.KEYS_UPLOAD,
                        "{\"one_time_key_counts\":{\"signed_curve25519\":" + q.size() + "}}");

            } else if (r instanceof Request.KeysQuery q) {
                ObjectNode root = om.createObjectNode();
                ObjectNode dks = root.putObject("device_keys");
                for (String u : q.users()) {
                    Map<String, JsonNode> devs = deviceKeys.get(u);
                    if (devs == null) continue;
                    ObjectNode o = dks.putObject(u);
                    devs.forEach(o::set);
                }
                root.putObject("failures");
                m.markRequestAsSent(q.requestId(), RequestType.KEYS_QUERY, root.toString());

            } else if (r instanceof Request.KeysClaim c) {
                ObjectNode root = om.createObjectNode();
                ObjectNode out = root.putObject("one_time_keys");
                c.oneTimeKeys().forEach((u, devs) -> devs.forEach((d, algo) -> {
                    var q = otks.get(u + "|" + d);
                    if (q == null || q.isEmpty()) return;
                    var k = q.poll();
                    out.putObject(u).putObject(d).set(k.getKey(), k.getValue());
                }));
                root.putObject("failures");
                m.markRequestAsSent(c.requestId(), RequestType.KEYS_CLAIM, root.toString());

            } else if (r instanceof Request.ToDevice t) {
                // Le FFI fournit directement {user: {device: content}} ; l'API HTTP l'enveloppe dans "messages".
                JsonNode root = om.readTree(t.body());
                JsonNode messages = root.has("messages") ? root.get("messages") : root;
                messages.fields().forEachRemaining(ue -> ue.getValue().fields().forEachRemaining(de -> {
                    ObjectNode ev = om.createObjectNode();
                    ev.put("sender", user);
                    ev.put("type", t.eventType());
                    ev.set("content", de.getValue());
                    inbox.computeIfAbsent(ue.getKey() + "|" + de.getKey(), k -> new ArrayList<>()).add(ev);
                }));
                m.markRequestAsSent(t.requestId(), RequestType.TO_DEVICE, "{}");

            } else {
                throw new AssertionError("Requête non gérée par le faux serveur : " + r);
            }
        }

        /** Section to_device d'un /sync ({"events":[...]}), format attendu par receiveSyncChanges(). */
        String takeInbox(String user, String device) {
            ObjectNode root = om.createObjectNode();
            ArrayNode arr = root.putArray("events");
            List<JsonNode> list = inbox.remove(user + "|" + device);
            if (list != null) list.forEach(arr::add);
            return root.toString();
        }
    }
}
