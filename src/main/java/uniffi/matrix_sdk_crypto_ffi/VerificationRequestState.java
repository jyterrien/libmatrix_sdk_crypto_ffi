package uniffi.matrix_sdk_crypto_ffi;

/**
 * An Enum describing the state the QrCode verification is in.
 */
public sealed interface VerificationRequestState {
  
    /**
     * The verification request was sent
     */
  record Requested() implements VerificationRequestState {
    
    
    

  }
  
  
    /**
     * The verification request is ready to start a verification flow.
     */
  record Ready(
        /**
         * The verification methods supported by the other side.
         */
    java.util.List<java.lang.String> theirMethods, 
        /**
         * The verification methods supported by the us.
         */
    java.util.List<java.lang.String> ourMethods) implements VerificationRequestState {
    
    
    

  }
  
    /**
     * The verification flow that was started with this request has finished.
     */
  record Done() implements VerificationRequestState {
    
    
    

  }
  
  
    /**
     * The verification process has been cancelled.
     */
  record Cancelled(
        /**
         * Information about the reason of the cancellation.
         */
    uniffi.matrix_sdk_crypto_ffi.CancelInfo cancelInfo) implements VerificationRequestState {
    
    
    

  }
  

  
}

