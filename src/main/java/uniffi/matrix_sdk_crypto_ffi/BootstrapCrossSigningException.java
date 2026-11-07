package uniffi.matrix_sdk_crypto_ffi;



public class BootstrapCrossSigningException extends java.lang.Exception {
    private BootstrapCrossSigningException(java.lang.String message) {
      super(message);
    }

    

    
    public static class CryptoStore extends BootstrapCrossSigningException {
      
      CryptoStoreException v1;
      public CryptoStore(CryptoStoreException v1) {
        super(new StringBuilder()
        .append("v1=")
        .append(v1)
        
        
        .toString());
        this.v1 = v1;
        }

      public CryptoStoreException v1() {
        return this.v1;
      }
      
      
      
    }
    
    public static class Signature extends BootstrapCrossSigningException {
      
      SignatureException v1;
      public Signature(SignatureException v1) {
        super(new StringBuilder()
        .append("v1=")
        .append(v1)
        
        
        .toString());
        this.v1 = v1;
        }

      public SignatureException v1() {
        return this.v1;
      }
      
      
      
    }
     
}

