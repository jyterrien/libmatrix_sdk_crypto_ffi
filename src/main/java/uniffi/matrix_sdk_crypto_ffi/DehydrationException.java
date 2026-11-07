package uniffi.matrix_sdk_crypto_ffi;



public class DehydrationException extends java.lang.Exception {
    private DehydrationException(java.lang.String message) {
      super(message);
    }

    public static class Pickle extends DehydrationException {
      public Pickle(java.lang.String message) {
        super(message);
      }
    }
    public static class LegacyPickle extends DehydrationException {
      public LegacyPickle(java.lang.String message) {
        super(message);
      }
    }
    public static class MissingSigningKey extends DehydrationException {
      public MissingSigningKey(java.lang.String message) {
        super(message);
      }
    }
    public static class Json extends DehydrationException {
      public Json(java.lang.String message) {
        super(message);
      }
    }
    public static class Store extends DehydrationException {
      public Store(java.lang.String message) {
        super(message);
      }
    }
    public static class PickleKeyLength extends DehydrationException {
      public PickleKeyLength(java.lang.String message) {
        super(message);
      }
    }
    
}

