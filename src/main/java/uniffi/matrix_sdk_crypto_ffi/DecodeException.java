package uniffi.matrix_sdk_crypto_ffi;



/**
 * Error type for the decoding and storing of the backup key.
 */
public class DecodeException extends java.lang.Exception {
    private DecodeException(java.lang.String message) {
      super(message);
    }

    
    /**
     * An error happened while decoding the recovery key.
     */public static class Decode extends DecodeException {
      public Decode(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * An error happened in the storage layer while trying to save the
     * decoded recovery key.
     */public static class CryptoStore extends DecodeException {
      public CryptoStore(java.lang.String message) {
        super(message);
      }
    }
    
}

