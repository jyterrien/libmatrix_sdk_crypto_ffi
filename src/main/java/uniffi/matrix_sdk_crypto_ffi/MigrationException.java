package uniffi.matrix_sdk_crypto_ffi;



/**
 * Error type for the migration process.
 */
public class MigrationException extends java.lang.Exception {
    private MigrationException(java.lang.String message) {
      super(message);
    }

    

    
    /**
     * Generic catch all error variant.
     */
    public static class Generic extends MigrationException {
      
        /**
         * The error message
         */
      java.lang.String errorMessage;
      public Generic(java.lang.String errorMessage) {
        super(new StringBuilder()
        .append("errorMessage=")
        .append(errorMessage)
        
        
        .toString());
        this.errorMessage = errorMessage;
        }

      public java.lang.String errorMessage() {
        return this.errorMessage;
      }
      
      
      
    }
     
}

