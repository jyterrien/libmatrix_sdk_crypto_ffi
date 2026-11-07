package uniffi.matrix_sdk_crypto_ffi;



public class CryptoStoreException extends java.lang.Exception {
    private CryptoStoreException(java.lang.String message) {
      super(message);
    }

    public static class OpenStore extends CryptoStoreException {
      public OpenStore(java.lang.String message) {
        super(message);
      }
    }
    public static class CryptoStore extends CryptoStoreException {
      public CryptoStore(java.lang.String message) {
        super(message);
      }
    }
    public static class OlmException extends CryptoStoreException {
      public OlmException(java.lang.String message) {
        super(message);
      }
    }
    public static class Serialization extends CryptoStoreException {
      public Serialization(java.lang.String message) {
        super(message);
      }
    }
    public static class InvalidUserId extends CryptoStoreException {
      public InvalidUserId(java.lang.String message) {
        super(message);
      }
    }
    public static class Identifier extends CryptoStoreException {
      public Identifier(java.lang.String message) {
        super(message);
      }
    }
    public static class DehydrationException extends CryptoStoreException {
      public DehydrationException(java.lang.String message) {
        super(message);
      }
    }
    
}

