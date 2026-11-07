package uniffi.matrix_sdk_crypto_ffi;



public class SecretImportException extends java.lang.Exception {
    private SecretImportException(java.lang.String message) {
      super(message);
    }

    public static class CryptoStore extends SecretImportException {
      public CryptoStore(java.lang.String message) {
        super(message);
      }
    }
    public static class Import extends SecretImportException {
      public Import(java.lang.String message) {
        super(message);
      }
    }
    
}

