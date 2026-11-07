package uniffi.matrix_sdk_crypto_ffi;



public class DecryptionException extends java.lang.Exception {
    private DecryptionException(java.lang.String message) {
      super(message);
    }

    

    
    public static class Serialization extends DecryptionException {
      
      java.lang.String error;
      public Serialization(java.lang.String error) {
        super(new StringBuilder()
        .append("error=")
        .append(error)
        
        
        .toString());
        this.error = error;
        }

      public java.lang.String error() {
        return this.error;
      }
      
      
      
    }
    
    public static class Identifier extends DecryptionException {
      
      java.lang.String error;
      public Identifier(java.lang.String error) {
        super(new StringBuilder()
        .append("error=")
        .append(error)
        
        
        .toString());
        this.error = error;
        }

      public java.lang.String error() {
        return this.error;
      }
      
      
      
    }
    
    public static class Megolm extends DecryptionException {
      
      java.lang.String error;
      public Megolm(java.lang.String error) {
        super(new StringBuilder()
        .append("error=")
        .append(error)
        
        
        .toString());
        this.error = error;
        }

      public java.lang.String error() {
        return this.error;
      }
      
      
      
    }
    
    public static class MissingRoomKey extends DecryptionException {
      
      java.lang.String error;
      
      java.lang.String withheldCode;
      public MissingRoomKey(java.lang.String error, java.lang.String withheldCode) {
        super(new StringBuilder()
        .append("error=")
        .append(error)
        
        .append(", ")
        
        
        .append("withheldCode=")
        .append(withheldCode)
        
        
        .toString());
        this.error = error;
        this.withheldCode = withheldCode;
        }

      public java.lang.String error() {
        return this.error;
      }
      public java.lang.String withheldCode() {
        return this.withheldCode;
      }
      
      
      
    }
    
    public static class Store extends DecryptionException {
      
      java.lang.String error;
      public Store(java.lang.String error) {
        super(new StringBuilder()
        .append("error=")
        .append(error)
        
        
        .toString());
        this.error = error;
        }

      public java.lang.String error() {
        return this.error;
      }
      
      
      
    }
     
}

