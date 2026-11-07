package uniffi.matrix_sdk_crypto;


/**
 * The result of a signature check.
 */

public enum SignatureState {
    /**
     * The signature is missing.
     */
  MISSING,
    /**
     * The signature is invalid.
     */
  INVALID,
    /**
     * The signature is valid but the device or user identity that created the
     * signature is not trusted.
     */
  VALID_BUT_NOT_TRUSTED,
    /**
     * The signature is valid and the device or user identity that created the
     * signature is trusted.
     */
  VALID_AND_TRUSTED;

  
  
  

}


