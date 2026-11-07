package uniffi.matrix_sdk_crypto_ffi;

public sealed interface Request {
  
  record ToDevice(
    java.lang.String requestId, 
    java.lang.String eventType, 
    java.lang.String body) implements Request {
    
    
    

  }
  
  record KeysUpload(
    java.lang.String requestId, 
    java.lang.String body) implements Request {
    
    
    

  }
  
  record KeysQuery(
    java.lang.String requestId, 
    java.util.List<java.lang.String> users) implements Request {
    
    
    

  }
  
  record KeysClaim(
    java.lang.String requestId, 
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> oneTimeKeys) implements Request {
    
    
    

  }
  
  record KeysBackup(
    java.lang.String requestId, 
    java.lang.String version, 
    java.lang.String rooms) implements Request {
    
    
    

  }
  
  record RoomMessage(
    java.lang.String requestId, 
    java.lang.String roomId, 
    java.lang.String eventType, 
    java.lang.String content) implements Request {
    
    
    

  }
  
  record SignatureUpload(
    java.lang.String requestId, 
    java.lang.String body) implements Request {
    
    
    

  }
  

  
}

