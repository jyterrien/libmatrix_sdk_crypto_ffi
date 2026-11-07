package uniffi.matrix_sdk_crypto_ffi;

/**
 * An Enum describing the state the QrCode verification is in.
 */
public sealed interface QrCodeState {
  
    /**
     * The QR verification has been started.
     */
  record Started() implements QrCodeState {
    
    
    

  }
  
  
    /**
     * The QR verification has been scanned by the other side.
     */
  record Scanned() implements QrCodeState {
    
    
    

  }
  
  
    /**
     * The scanning of the QR code has been confirmed by us.
     */
  record Confirmed() implements QrCodeState {
    
    
    

  }
  
  
    /**
     * We have successfully scanned the QR code and are able to send a
     * reciprocation event.
     */
  record Reciprocated() implements QrCodeState {
    
    
    

  }
  
  
    /**
     * The verification process has been successfully concluded.
     */
  record Done() implements QrCodeState {
    
    
    

  }
  
  
    /**
     * The verification process has been cancelled.
     */
  record Cancelled(
        /**
         * Information about the reason of the cancellation.
         */
    uniffi.matrix_sdk_crypto_ffi.CancelInfo cancelInfo) implements QrCodeState {
    
    
    

  }
  

  
}

