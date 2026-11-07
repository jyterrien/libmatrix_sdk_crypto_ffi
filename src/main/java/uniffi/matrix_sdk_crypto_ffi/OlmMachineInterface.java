package uniffi.matrix_sdk_crypto_ffi;

/**
 * A high level state machine that handles E2EE for Matrix.
 */
public interface OlmMachineInterface {
    
    /**
     * Are we able to encrypt room keys.
     *
     * This returns true if we have an active `BackupKey` and backup version
     * registered with the state machine.
     */public boolean backupEnabled();
    
    /**
     * Encrypt a batch of room keys and return a request that needs to be sent
     * out to backup the room keys.
     */public Request backupRoomKeys() throws CryptoStoreException;
    
    /**
     * Create a new private cross signing identity and create a request to
     * upload the public part of it to the server.
     */public BootstrapCrossSigningResult bootstrapCrossSigning() throws BootstrapCrossSigningException;
    
    /**
     * Encrypt the given event with the given type and content for the given
     * device. This method is used to send an event to a specific device.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user who owns the target device.
     * * `device_id` - The ID of the device to which the message will be sent.
     * * `event_type` - The event type.
     * * `content` - The serialized content of the event.
     *
     * # Returns
     * A `Result` containing the request to be sent out if the encryption was
     * successful. If the device is not found, the result will be `Ok(None)`.
     *
     * The caller should ensure that there is an olm session (see
     * `get_missing_sessions`) with the target device before calling this
     * method.
     */public Request createEncryptedToDeviceRequest(java.lang.String userId, java.lang.String deviceId, java.lang.String eventType, java.lang.String content, uniffi.matrix_sdk_crypto.CollectStrategy shareStrategy) throws CryptoStoreException;
    
    /**
     * Get the status of the private cross signing keys.
     *
     * This can be used to check which private cross signing keys we have
     * stored locally.
     */public CrossSigningStatus crossSigningStatus();
    
    /**
     * Decrypt the given event that was sent in the given room.
     *
     * # Arguments
     *
     * * `event` - The serialized encrypted version of the event.
     *
     * * `room_id` - The unique id of the room where the event was sent to.
     *
     * * `handle_verification_events` - if the supplied event is a verification
     * event, use it to update the verification state. **Note**: it is
     * recommended to avoid setting this flag to true and use the explicit
     * [`OlmMachine::receive_verification_event`] method instead:
     * verification events sometimes need preparation before we can handle
     * them: see the documentation for
     * [`OlmMachine::receive_verification_event`].
     *
     * * `strict_shields` - If `true`, messages will be decorated with strict
     * warnings (use `false` to match legacy behaviour where unsafe keys have
     * lower severity warnings and unverified identities are not decorated).
     *
     * * `decryption_settings` - The setting for decrypting messages.
     */public DecryptedEvent decryptRoomEvent(java.lang.String event, java.lang.String roomId, boolean handleVerificationEvents, boolean strictShields, uniffi.matrix_sdk_crypto.DecryptionSettings decryptionSettings) throws DecryptionException;
    
    /**
     * Manage dehydrated devices.
     */public DehydratedDevices dehydratedDevices();
    
    /**
     * Get the device ID of the device of this `OlmMachine`.
     */public java.lang.String deviceId();
    
    /**
     * Disable and reset our backup state.
     *
     * This will remove any pending backup request, remove the backup key and
     * reset the backup state of each room key we have.
     */public void disableBackup() throws CryptoStoreException;
    
    /**
     * Discard the currently active room key for the given room if there is
     * one.
     */public void discardRoomKey(java.lang.String roomId) throws CryptoStoreException;
    
    /**
     * Activate the given backup key to be used with the given backup version.
     *
     * **Warning**: The caller needs to make sure that the given `BackupKey` is
     * trusted, otherwise we might be encrypting room keys that a malicious
     * party could decrypt.
     *
     * The [`OlmMachine::verify_backup`] method can be used to so.
     */public void enableBackupV1(MegolmV1BackupKey key, java.lang.String version) throws DecodeException;
    
    /**
     * Encrypt the given event with the given type and content for the given
     * room.
     *
     * **Note**: A room key needs to be shared with the group of users that are
     * members in the given room. If this is not done this method will panic.
     *
     * The usual flow to encrypt an event using this state machine is as
     * follows:
     *
     * 1. Get the one-time key claim request to establish 1:1 Olm sessions for
     * the room members of the room we wish to participate in. This is done
     * using the [`get_missing_sessions()`](Self::get_missing_sessions)
     * method. This method call should be locked per call.
     *
     * 2. Share a room key with all the room members using the
     * [`share_room_key()`](Self::share_room_key). This method call should
     * be locked per room.
     *
     * 3. Encrypt the event using this method.
     *
     * 4. Send the encrypted event to the server.
     *
     * After the room key is shared steps 1 and 2 will become noops, unless
     * there's some changes in the room membership or in the list of devices a
     * member has.
     *
     * # Arguments
     *
     * * `room_id` - The unique id of the room where the event will be sent to.
     *
     * * `even_type` - The type of the event.
     *
     * * `content` - The serialized content of the event.
     */public java.lang.String encrypt(java.lang.String roomId, java.lang.String eventType, java.lang.String content) throws CryptoStoreException;
    
    /**
     * Export all our private cross signing keys.
     *
     * The export will contain the seed for the ed25519 keys as a base64
     * encoded string.
     *
     * This method returns `None` if we don't have any private cross signing
     * keys.
     */public CrossSigningKeyExport exportCrossSigningKeys() throws CryptoStoreException;
    
    /**
     * Export all of our room keys.
     *
     * # Arguments
     *
     * * `passphrase` - The passphrase that should be used to encrypt the key
     * export.
     *
     * * `rounds` - The number of rounds that should be used when expanding the
     * passphrase into an key.
     */public java.lang.String exportRoomKeys(java.lang.String passphrase, int rounds) throws CryptoStoreException;
    
    /**
     * Export all the secrets we have in the store into a serialized
     * SecretsBundle.
     *
     * This method will export all the private cross-signing keys and, if
     * available, the private part of a backup key and its accompanying
     * version.
     *
     * The method will fail if we don't have all three private cross-signing
     * keys available.
     *
     * **Warning**: Only export this and share it with a trusted recipient,
     * i.e. if an existing device is sharing this with a new device.
     */public java.lang.String exportSecretsBundle() throws SecretsBundleExportException;
    
    /**
     * Get the backup keys we have saved in our crypto store.
     */public BackupKeys getBackupKeys() throws CryptoStoreException;
    
    /**
     * Get a `Device` from the store.
     *
     * # Arguments
     *
     * * `user_id` - The id of the device owner.
     *
     * * `device_id` - The id of the device itself.
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */public Device getDevice(java.lang.String userId, java.lang.String deviceId, int timeout) throws CryptoStoreException;
    
    /**
     * Get a cross signing user identity for the given user ID.
     *
     * # Arguments
     *
     * * `user_id` - The unique id of the user that the identity belongs to
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */public UserIdentity getIdentity(java.lang.String userId, int timeout) throws CryptoStoreException;
    
    /**
     * Generate one-time key claiming requests for all the users we are missing
     * sessions for.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * This method should be called every time before a call to
     * [`share_room_key()`](Self::share_room_key) is made.
     *
     * # Arguments
     *
     * * `users` - The list of users for which we would like to establish 1:1
     * Olm sessions for.
     */public Request getMissingSessions(java.util.List<java.lang.String> users) throws CryptoStoreException;
    
    /**
     * Check whether there is a global flag to only encrypt messages for
     * trusted devices or for everyone.
     *
     * Note that if the global flag is false, individual rooms may still be
     * encrypting only for trusted devices, depending on the per-room
     * `only_allow_trusted_devices` flag.
     */public boolean getOnlyAllowTrustedDevices() throws CryptoStoreException;
    
    /**
     * Get the stored room settings, such as the encryption algorithm or
     * whether to encrypt only for trusted devices.
     *
     * These settings can be modified via
     * [set_room_algorithm()](Self::set_room_algorithm) and
     * [set_room_only_allow_trusted_devices()](Self::set_room_only_allow_trusted_devices)
     * methods.
     */public RoomSettings getRoomSettings(java.lang.String roomId) throws CryptoStoreException;
    
    /**
     * Get all devices of an user.
     *
     * # Arguments
     *
     * * `user_id` - The id of the device owner.
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */public java.util.List<Device> getUserDevices(java.lang.String userId, int timeout) throws CryptoStoreException;
    
    /**
     * Get a verification flow object for the given user with the given flow
     * id.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification.
     *
     * * `flow_id` - The ID that uniquely identifies the verification flow.
     */public Verification getVerification(java.lang.String userId, java.lang.String flowId);
    
    /**
     * Get a verification requests that we share with the given user with the
     * given flow id.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification requests.
     *
     * * `flow_id` - The ID that uniquely identifies the verification flow.
     */public VerificationRequest getVerificationRequest(java.lang.String userId, java.lang.String flowId);
    
    /**
     * Get all the verification requests that we share with the given user.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification requests.
     */public java.util.List<VerificationRequest> getVerificationRequests(java.lang.String userId);
    
    /**
     * Get our own identity keys.
     */public java.util.Map<java.lang.String, java.lang.String> identityKeys();
    
    /**
     * Import our private cross signing keys.
     *
     * The export needs to contain the seed for the ed25519 keys as a base64
     * encoded string.
     */public void importCrossSigningKeys(CrossSigningKeyExport export) throws SecretImportException;
    
    /**
     * Import room keys from the given serialized unencrypted key export.
     *
     * This method is the same as [`OlmMachine::import_room_keys`] but the
     * decryption step is skipped and should be performed by the caller. This
     * should be used if the room keys are coming from the server-side backup,
     * the method will mark all imported room keys as backed up.
     *
     * **Note**: This has been deprecated. Use
     * [`OlmMachine::import_room_keys_from_backup`] instead.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the unencrypted key export.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */public KeysImportResult importDecryptedRoomKeys(java.lang.String keys, ProgressListener progressListener) throws KeyImportException;
    
    /**
     * Import room keys from the given serialized key export.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the key export.
     *
     * * `passphrase` - The passphrase that was used to encrypt the key export.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */public KeysImportResult importRoomKeys(java.lang.String keys, java.lang.String passphrase, ProgressListener progressListener) throws KeyImportException;
    
    /**
     * Import room keys from the given serialized unencrypted key export.
     *
     * This method is the same as [`OlmMachine::import_room_keys`] but the
     * decryption step is skipped and should be performed by the caller. This
     * should be used if the room keys are coming from the server-side backup.
     * The method will mark all imported room keys as backed up.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the unencrypted key export.
     *
     * * `backup_version` - The version of the backup that these keys came
     * from.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */public KeysImportResult importRoomKeysFromBackup(java.lang.String keys, java.lang.String backupVersion, ProgressListener progressListener) throws KeyImportException;
    
    /**
     * Check if a user identity is considered to be verified by us.
     */public boolean isIdentityVerified(java.lang.String userId) throws CryptoStoreException;
    
    /**
     * Check if the given user is considered to be tracked.
     *
     * A user can be marked for tracking using the
     * [`OlmMachine::update_tracked_users()`] method.
     */public boolean isUserTracked(java.lang.String userId) throws CryptoStoreException;
    
    /**
     * Mark a request that was sent to the server as sent.
     *
     * # Arguments
     *
     * * `request_id` - The unique ID of the request that was sent out. This
     * needs to be an UUID.
     *
     * * `request_type` - The type of the request that was sent out.
     *
     * * `response_body` - The body of the response that was received.
     */public void markRequestAsSent(java.lang.String requestId, RequestType requestType, java.lang.String responseBody) throws CryptoStoreException;
    
    /**
     * Get the list of outgoing requests that need to be sent to the
     * homeserver.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * **Note**: This method call should be locked per call.
     */public java.util.List<Request> outgoingRequests() throws CryptoStoreException;
    
    /**
     * Request missing local secrets from our devices (cross signing private
     * keys, megolm backup). This will ask the sdk to create outgoing
     * request to get the missing secrets.
     *
     * The requests will be processed as soon as `outgoing_requests()` is
     * called to process them.
     */public boolean queryMissingSecretsFromOtherSessions() throws CryptoStoreException;
    
    /**
     * Let the state machine know about E2EE related sync changes that we
     * received from the server.
     *
     * This needs to be called after every sync, ideally before processing
     * any other sync changes.
     *
     * # Arguments
     *
     * * `events` - A serialized array of to-device events we received in the
     * current sync response.
     *
     * * `device_changes` - The list of devices that have changed in some way
     * since the previous sync.
     *
     * * `key_counts` - The map of uploaded one-time key types and counts.
     */public SyncChangesResult receiveSyncChanges(java.lang.String events, DeviceLists deviceChanges, java.util.Map<java.lang.String, java.lang.Integer> keyCounts, java.util.List<java.lang.String> unusedFallbackKeys, java.lang.String nextBatchToken, uniffi.matrix_sdk_crypto.DecryptionSettings decryptionSettings) throws CryptoStoreException;
    
    /**
     * Receive an unencrypted verification event.
     *
     * This method can be used to pass verification events that are happening
     * in unencrypted rooms to the `OlmMachine`.
     *
     * **Note**: This has been deprecated.
     */public void receiveUnencryptedVerificationEvent(java.lang.String event, java.lang.String roomId) throws CryptoStoreException;
    
    /**
     * Receive a verification event.
     *
     * This method can be used to pass verification events that are happening
     * in rooms to the `OlmMachine`. The event should be in the decrypted form.
     *
     * **Note**: If the supplied event is an `m.room.message` event with
     * `msgtype: m.key.verification.request`, then the device information for
     * the sending user must be up-to-date before calling this method
     * (otherwise, the request will be ignored). It is hard to guarantee this
     * is the case, but you can maximize your chances by explicitly making a
     * request to /keys/query for the user's device info, and processing the
     * response with [`OlmMachine::mark_request_as_sent`].
     */public void receiveVerificationEvent(java.lang.String event, java.lang.String roomId) throws CryptoStoreException;
    
    /**
     * Request or re-request a room key that was used to encrypt the given
     * event.
     *
     * # Arguments
     *
     * * `event` - The undecryptable event that we would wish to request a room
     * key for.
     *
     * * `room_id` - The id of the room the event was sent to.
     */public KeyRequestPair requestRoomKey(java.lang.String event, java.lang.String roomId) throws DecryptionException;
    
    /**
     * Request a verification flow to begin with our other devices.
     *
     * # Arguments
     *
     * `methods` - The list of verification methods we want to advertise to
     * support.
     */public RequestVerificationResult requestSelfVerification(java.util.List<java.lang.String> methods) throws CryptoStoreException;
    
    /**
     * Request a verification flow to begin with the given user in the given
     * room.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `room_id` - The ID of the room that represents a DM with the given
     * user.
     *
     * * `event_id` - The event ID of the `m.key.verification.request` event
     * that we sent out to request the verification to begin. The content for
     * this request can be created using the [verification_request_content()]
     * method.
     *
     * * `methods` - The list of verification methods we advertised as
     * supported in the `m.key.verification.request` event.
     *
     * [verification_request_content()]: Self::verification_request_content
     */public VerificationRequest requestVerification(java.lang.String userId, java.lang.String roomId, java.lang.String eventId, java.util.List<java.lang.String> methods) throws CryptoStoreException;
    
    /**
     * Request a verification flow to begin with the given user's device.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `device_id` - The ID of the device that we wish to verify.
     *
     * * `methods` - The list of verification methods we advertised as
     * supported in the `m.key.verification.request` event.
     */public RequestVerificationResult requestVerificationWithDevice(java.lang.String userId, java.lang.String deviceId, java.util.List<java.lang.String> methods) throws CryptoStoreException;
    
    /**
     * Get the number of backed up room keys and the total number of room keys.
     */public RoomKeyCounts roomKeyCounts() throws CryptoStoreException;
    
    /**
     * Store the recovery key in the crypto store.
     *
     * This is useful if the client wants to support gossiping of the backup
     * key.
     */public void saveRecoveryKey(BackupRecoveryKey key, java.lang.String version) throws CryptoStoreException;
    
    /**
     * Set local trust state for the device of the given user without creating
     * or uploading any signatures if verified
     */public void setLocalTrust(java.lang.String userId, java.lang.String deviceId, uniffi.matrix_sdk_crypto.LocalTrust trustState) throws CryptoStoreException;
    
    /**
     * Set global flag whether to encrypt messages for untrusted devices, or
     * whether they should be excluded from the conversation.
     *
     * Note that if enabled, it will override any per-room settings.
     */public void setOnlyAllowTrustedDevices(boolean onlyAllowTrustedDevices) throws CryptoStoreException;
    
    /**
     * Set the room algorithm used for encrypting messages to one of the
     * available variants
     */public void setRoomAlgorithm(java.lang.String roomId, EventEncryptionAlgorithm algorithm) throws CryptoStoreException;
    
    /**
     * Set flag whether this room should encrypt messages for untrusted
     * devices, or whether they should be excluded from the conversation.
     *
     * Note that per-room setting may be overridden by a global
     * [set_only_allow_trusted_devices()](Self::set_only_allow_trusted_devices)
     * method.
     */public void setRoomOnlyAllowTrustedDevices(java.lang.String roomId, boolean onlyAllowTrustedDevices) throws CryptoStoreException;
    
    /**
     * Share a room key with the given list of users for the given room.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * This method should be called every time before a call to
     * [`encrypt()`](Self::encrypt) with the given `room_id` is made.
     *
     * # Arguments
     *
     * * `room_id` - The unique id of the room, note that this doesn't strictly
     * need to be a Matrix room, it just needs to be an unique identifier for
     * the group that will participate in the conversation.
     *
     * * `users` - The list of users which are considered to be members of the
     * room and should receive the room key.
     *
     * * `settings` - The settings that should be used for the room key.
     */public java.util.List<Request> shareRoomKey(java.lang.String roomId, java.util.List<java.lang.String> users, EncryptionSettings settings) throws CryptoStoreException;
    
    /**
     * Sign the given message using our device key and if available cross
     * signing master key.
     */public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> sign(java.lang.String message) throws CryptoStoreException;
    
    /**
     * Start short auth string verification with a device without going
     * through a verification request first.
     *
     * **Note**: This has been largely deprecated and the
     * [request_verification_with_device()] method should be used instead.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to start the
     * SAS verification.
     *
     * * `device_id` - The ID of device we would like to verify.
     *
     * [request_verification_with_device()]: Self::request_verification_with_device
     */public StartSasResult startSasWithDevice(java.lang.String userId, java.lang.String deviceId) throws CryptoStoreException;
    
    /**
     * Add the given list of users to be tracked, triggering a key query
     * request for them.
     *
     * The OlmMachine maintains a list of users whose devices we are keeping
     * track of: these are known as "tracked users". These must be users
     * that we share a room with, so that the server sends us updates for
     * their device lists.
     *
     * *Note*: Only users that aren't already tracked will be considered for an
     * update. It's safe to call this with already tracked users, it won't
     * result in excessive `/keys/query` requests.
     *
     * # Arguments
     *
     * `users` - The users that should be queued up for a key query.
     */public void updateTrackedUsers(java.util.List<java.lang.String> users) throws CryptoStoreException;
    
    /**
     * Get the user ID of the owner of this `OlmMachine`.
     */public java.lang.String userId();
    
    /**
     * Get an m.key.verification.request content for the given user.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `methods` - The list of verification methods we want to advertise to
     * support.
     */public java.lang.String verificationRequestContent(java.lang.String userId, java.util.List<java.lang.String> methods) throws CryptoStoreException;
    
    /**
     * Check if the given backup has been verified by us or by another of our
     * devices that we trust.
     *
     * The `backup_info` should be a JSON encoded object with the following
     * format:
     *
     * ```json
     * {
     * "algorithm": "m.megolm_backup.v1.curve25519-aes-sha2",
     * "auth_data": {
     * "public_key":"XjhWTCjW7l59pbfx9tlCBQolfnIQWARoKOzjTOPSlWM",
     * "signatures": {}
     * }
     * }
     * ```
     */public SignatureVerification verifyBackup(java.lang.String backupInfo) throws CryptoStoreException;
    
    /**
     * Manually verify the device of the given user with the given device ID.
     *
     * This method will attempt to sign the device using our private cross
     * signing key.
     *
     * This method will always fail if the device belongs to someone else, we
     * can only sign our own devices.
     *
     * It can also fail if we don't have the private part of our self-signing
     * key.
     *
     * Returns a request that needs to be sent out for the device to be marked
     * as verified.
     */public SignatureUploadRequest verifyDevice(java.lang.String userId, java.lang.String deviceId) throws SignatureException;
    
    /**
     * Manually the user with the given user ID.
     *
     * This method will attempt to sign the user identity using either our
     * private cross signing key, for other user identities, or our device keys
     * for our own user identity.
     *
     * This method can fail if we don't have the private part of our
     * user-signing key.
     *
     * Returns a request that needs to be sent out for the user identity to be
     * marked as verified.
     */public SignatureUploadRequest verifyIdentity(java.lang.String userId) throws SignatureException;
    
}

