package uniffi.matrix_sdk_crypto_ffi;

public sealed interface OutgoingVerificationRequest {
  
  record ToDevice(
    java.lang.String requestId, 
    java.lang.String eventType, 
    java.lang.String body) implements OutgoingVerificationRequest {
    
    
    

  }
  
  record InRoom(
    java.lang.String requestId, 
    java.lang.String roomId, 
    java.lang.String eventType, 
    java.lang.String content) implements OutgoingVerificationRequest {
    
    
    

  }
  

  
}

