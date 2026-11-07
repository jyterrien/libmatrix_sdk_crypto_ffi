# Projet parent + tests d'intégration : points à régler

## Structure cible

```
parent/                      (pom de packaging, <modules>)
├── crypto/                  (projet actuel : build Rust, bindings, .so, jar)
└── crypto-it/               (tests d'intégration, dépend du jar construit)
```

Avantage : `crypto-it` ne voit que le jar fini, exactement comme le fera la future lib cliente Matrix.

## 1. Le chargeur natif doit être dans le jar

- Aujourd'hui l'extraction du `.so` est dans `OlmMachineTest.NativeLib` (code de test).
- La lib cliente en aura besoin aussi : elle ne doit pas rester dans un test.
- Créer une petite classe écrite à la main dans `crypto/src/main/java` (par exemple `NativeLoader.load()`), appelée avant tout usage d'`OlmMachine`.
- Elle :
  - extrait le `.so` des ressources vers un fichier temporaire ;
  - pose `uniffi.component.<nom>.libraryOverride` pour les trois composants (`matrix_sdk_crypto_ffi`, `matrix_sdk_crypto`, `matrix_sdk_common`) ;
  - garde les surcharges `-Dolm.lib.path` et `-Dolm.lib.resource`.
- Les tests d'intégration vérifient alors le vrai chemin de production.

## 2. Failsafe plutôt que surefire dans `crypto-it`

- Nommer les classes `*IT.java`.
- Utiliser `maven-failsafe-plugin` (goals `integration-test` et `verify`).
- Reprendre l'`argLine` : `--enable-native-access=ALL-UNNAMED`.
- Lancer avec `mvn verify`. Le module IT reçoit alors le jar de la phase `package`. Avec `mvn test`, Maven fournit `target/classes`, ce qui ne prouve pas le packaging.
- Dépendances de test : JUnit 5 et Jackson (scope `test`).

## 3. Répartition des tests

| Module | Contenu |
|---|---|
| `crypto` (surefire) | Smoke test seulement : la lib se charge, la version est lisible. Échoue vite. |
| `crypto-it` (failsafe) | Alice → Bob, erreurs typées, callbacks, cycle de vie, multi-thread. |

À tester dans `crypto-it` (le pont Java ↔ Rust) :

- **Erreurs typées :** mauvaise passphrase → `CryptoStoreException` ; message sans clé → `DecryptionException`.
- **Conversions :** valeurs `null`, `Map`, `List`, enums, variantes de `Request`.
- **Callbacks :** `setLogger`, `ProgressListener` (`importRoomKeys`), `SasListener` (appels remontants Panama).
- **Cycle de vie :** `close()` deux fois ; usage après `close()` (exception propre, pas de plantage JVM).
- **Concurrence :** plusieurs threads qui chiffrent et déchiffrent.
- **Persistance :** machine rouverte sur le même dossier = même identité.
- **Version native figée :** un test sur `0.19.0` détecte une mise à jour accidentelle de `matrix-rust-sdk`.

## 4. Plateformes

- Un `.so` ne sert qu'à une plateforme.
- Deux stratégies possibles :
  - un artefact par plateforme (classifier `linux-x86_64`, `linux-aarch64`, `osx-aarch64`, etc.) ;
  - un seul jar avec `/native/<os>-<arch>/...`, où `NativeLoader` choisit selon `os.name` et `os.arch`.
- `crypto-it` doit tourner sur chaque plateforme livrée, sinon un échec de chargement propre à l'une d'elles reste invisible.
- Alpine (musl) ne charge pas un `.so` compilé avec glibc : à compiler séparément si ciblé.

## 5. Hors périmètre de ces deux modules

À traiter dans la lib cliente Matrix, pas dans le jar crypto :

- boucle `outgoingRequests` → HTTP → `markRequestAsSent` et interface `HomeserverClient` ;
- mise en attente et nouvel essai des messages reçus avant leur clé ;
- renouvellement des clés à usage unique ;
- politique de confiance (`TrustRequirement`, `onlyAllowTrustedDevices`) ;
- formats HTTP réels (par exemple l'enveloppe `"messages"` de `sendToDevice`) ;
- tests contre un vrai Synapse (Docker ou Testcontainers).

`FakeHomeserver` est un outil de test : il ne doit pas entrer dans le jar de production.

## À fournir pour la suite

- Le `pom.xml` actuel, au moins la partie qui compile le Rust et copie le `.so` dans les ressources.
- Une ou plusieurs plateformes cibles.

Livrables possibles ensuite : `pom.xml` parent, `pom.xml` de `crypto-it`, classe `NativeLoader`, `OlmMachineTest` renommé en `OlmMachineIT`.
