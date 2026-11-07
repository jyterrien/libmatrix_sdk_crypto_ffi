package uniffi.matrix_sdk_crypto_ffi;

/**
 * Enum representing cross signing identity of our own user or some other
 * user.
 */
public sealed interface UserIdentity {
  
    /**
     * Our own user identity.
     */
  record Own(
        /**
         * The unique id of our own user.
         */
    java.lang.String userId, 
        /**
         * Does our own user identity trust our own device.
         */
    java.lang.Boolean trustsOurOwnDevice, 
        /**
         * The public master key of our identity.
         */
    java.lang.String masterKey, 
        /**
         * The public user-signing key of our identity.
         */
    java.lang.String userSigningKey, 
        /**
         * The public self-signing key of our identity.
         */
    java.lang.String selfSigningKey, 
        /**
         * True if this identity was verified at some point but is not anymore.
         */
    java.lang.Boolean hasVerificationViolation) implements UserIdentity {
    
    
    

  }
  
    /**
     * The user identity of other users.
     */
  record Other(
        /**
         * The unique id of the user.
         */
    java.lang.String userId, 
        /**
         * The public master key of the identity.
         */
    java.lang.String masterKey, 
        /**
         * The public self-signing key of our identity.
         */
    java.lang.String selfSigningKey, 
        /**
         * True if this identity was verified at some point but is not anymore.
         */
    java.lang.Boolean hasVerificationViolation) implements UserIdentity {
    
    
    

  }
  

  
}

