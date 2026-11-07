package uniffi.matrix_sdk_crypto_ffi;



/**
 * Error type for the decryption of backed up room keys.
 */
public class PkDecryptionException extends java.lang.Exception {
    private PkDecryptionException(java.lang.String message) {
      super(message);
    }

    
    /**
     * An internal libolm error happened during decryption.
     */public static class Olm extends PkDecryptionException {
      public Olm(java.lang.String message) {
        super(message);
      }
    }
    
}

