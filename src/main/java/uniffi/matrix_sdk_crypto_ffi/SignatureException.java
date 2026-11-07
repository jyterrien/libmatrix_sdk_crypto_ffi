package uniffi.matrix_sdk_crypto_ffi;



public class SignatureException extends java.lang.Exception {
    private SignatureException(java.lang.String message) {
      super(message);
    }

    public static class Signature extends SignatureException {
      public Signature(java.lang.String message) {
        super(message);
      }
    }
    public static class Identifier extends SignatureException {
      public Identifier(java.lang.String message) {
        super(message);
      }
    }
    public static class CryptoStore extends SignatureException {
      public CryptoStore(java.lang.String message) {
        super(message);
      }
    }
    public static class UnknownDevice extends SignatureException {
      public UnknownDevice(java.lang.String message) {
        super(message);
      }
    }
    public static class UnknownUserIdentity extends SignatureException {
      public UnknownUserIdentity(java.lang.String message) {
        super(message);
      }
    }
    
}

