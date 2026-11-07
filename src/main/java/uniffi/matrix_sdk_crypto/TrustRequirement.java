package uniffi.matrix_sdk_crypto;


/**
 * The trust level in the sender's device that is required to decrypt an
 * event.
 */

public enum TrustRequirement {
    /**
     * Decrypt events from everyone regardless of trust.
     *
     * Not recommended, per the guidance of [MSC4153].
     *
     * [MSC4153]: https://github.com/matrix-org/matrix-doc/pull/4153
     */
  UNTRUSTED,
    /**
     * Only decrypt events from cross-signed devices or legacy sessions (Megolm
     * sessions created before we started collecting trust information).
     */
  CROSS_SIGNED_OR_LEGACY,
    /**
     * Only decrypt events from cross-signed devices.
     */
  CROSS_SIGNED;

  
  
  

}


