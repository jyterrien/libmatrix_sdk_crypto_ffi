package uniffi.matrix_sdk_crypto_ffi;



public class KeyImportException extends java.lang.Exception {
    private KeyImportException(java.lang.String message) {
      super(message);
    }

    public static class Export extends KeyImportException {
      public Export(java.lang.String message) {
        super(message);
      }
    }
    public static class CryptoStore extends KeyImportException {
      public CryptoStore(java.lang.String message) {
        super(message);
      }
    }
    public static class Json extends KeyImportException {
      public Json(java.lang.String message) {
        super(message);
      }
    }
    
}

