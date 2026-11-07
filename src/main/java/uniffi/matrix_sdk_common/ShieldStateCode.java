package uniffi.matrix_sdk_common;


/**
 * A machine-readable representation of the authenticity for a `ShieldState`.
 */

public enum ShieldStateCode {
    /**
     * Not enough information available to check the authenticity.
     */
  AUTHENTICITY_NOT_GUARANTEED,
    /**
     * The sending device isn't yet known by the Client.
     */
  UNKNOWN_DEVICE,
    /**
     * The sending device hasn't been verified by the sender.
     */
  UNSIGNED_DEVICE,
    /**
     * The sender hasn't been verified by the Client's user.
     */
  UNVERIFIED_IDENTITY,
    /**
     * The sender was previously verified but changed their identity.
     */
  VERIFICATION_VIOLATION,
    /**
     * The `sender` field on the event does not match the owner of the device
     * that established the Megolm session.
     */
  MISMATCHED_SENDER;

  
  
  

}


