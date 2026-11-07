package uniffi.matrix_sdk_crypto;


/**
 * Our best guess at the reason why an event can't be decrypted.
 */

public enum UtdCause {
    /**
     * We don't have an explanation for why this UTD happened - it is probably
     * a bug, or a network split between the two homeservers.
     *
     * For example:
     *
     * - the keys for this event are missing, but a key storage backup exists
     * and is working, so we should be able to find the keys in the backup.
     *
     * - the keys for this event are missing, and a key storage backup exists
     * on the server, but that backup is not working on this client even
     * though this device is verified.
     */
  UNKNOWN,
    /**
     * We are missing the keys for this event, and the event was sent when we
     * were not a member of the room (or invited).
     */
  SENT_BEFORE_WE_JOINED,
    /**
     * The message was sent by a user identity we have not verified, but the
     * user was previously verified.
     */
  VERIFICATION_VIOLATION,
    /**
     * The [`crate::TrustRequirement`] requires that the sending device be
     * signed by its owner, and it was not.
     */
  UNSIGNED_DEVICE,
    /**
     * The [`crate::TrustRequirement`] requires that the sending device be
     * signed by its owner, and we were unable to securely find the device.
     *
     * This could be because the device has since been deleted, because we
     * haven't yet downloaded it from the server, or because the session
     * data was obtained from an insecure source (imported from a file,
     * obtained from a legacy (asymmetric) backup, unsafe key forward, etc.)
     */
  UNKNOWN_DEVICE,
    /**
     * We are missing the keys for this event, but it is a "device-historical"
     * message and there is no key storage backup on the server, presumably
     * because the user has turned it off.
     *
     * Device-historical means that the message was sent before the current
     * device existed (but the current user was probably a member of the room
     * at the time the message was sent). Not to
     * be confused with pre-join or pre-invite messages (see
     * [`UtdCause::SentBeforeWeJoined`] for that).
     *
     * Expected message to user: "History is not available on this device".
     */
  HISTORICAL_MESSAGE_AND_BACKUP_IS_DISABLED,
    /**
     * The keys for this event are intentionally withheld.
     *
     * The sender has refused to share the key because our device does not meet
     * the sender's security requirements.
     */
  WITHHELD_FOR_UNVERIFIED_OR_INSECURE_DEVICE,
    /**
     * The keys for this event are missing, likely because the sender was
     * unable to share them (e.g., failure to establish an Olm 1:1
     * channel). Alternatively, the sender may have deliberately excluded
     * this device by cherry-picking and blocking it, in which case, no action
     * can be taken on our side.
     */
  WITHHELD_BY_SENDER,
    /**
     * We are missing the keys for this event, but it is a "device-historical"
     * message, and even though a key storage backup does exist, we can't use
     * it because our device is unverified.
     *
     * Device-historical means that the message was sent before the current
     * device existed (but the current user was probably a member of the room
     * at the time the message was sent). Not to
     * be confused with pre-join or pre-invite messages (see
     * [`UtdCause::SentBeforeWeJoined`] for that).
     *
     * Expected message to user: "You need to verify this device".
     */
  HISTORICAL_MESSAGE_AND_DEVICE_IS_UNVERIFIED;

  
  
  

}


