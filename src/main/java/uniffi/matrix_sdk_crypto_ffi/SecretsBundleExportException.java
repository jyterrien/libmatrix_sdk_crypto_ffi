package uniffi.matrix_sdk_crypto_ffi;



/**
 * Error describing what went wrong when exporting a [`SecretsBundle`].
 *
 * The [`SecretsBundle`] can only be exported if we have all cross-signing
 * private keys in the store.
 */
public class SecretsBundleExportException extends java.lang.Exception {
    private SecretsBundleExportException(java.lang.String message) {
      super(message);
    }

    

    
    /**
     * The store itself had an error.
     */
    public static class CryptoStore extends SecretsBundleExportException {
      
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
    
    /**
     * We're missing one or more cross-signing keys.
     */
    public static class MissingCrossSigningKeys extends SecretsBundleExportException {
      public MissingCrossSigningKeys() {
        super(new StringBuilder()
        .toString());
        }

      
      
      
    }
    
    /**
     * We have a backup key stored, but we don't know the version of the
     * backup.
     */
    public static class MissingBackupVersion extends SecretsBundleExportException {
      public MissingBackupVersion() {
        super(new StringBuilder()
        .toString());
        }

      
      
      
    }
    
    public static class Serialization extends SecretsBundleExportException {
      
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
     
}

