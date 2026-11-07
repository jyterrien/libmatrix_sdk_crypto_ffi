package uniffi.matrix_sdk_common;

/**
 * Reason why a background task failed.
 */
public sealed interface BackgroundTaskFailureReason {
  
    /**
     * The task panicked.
     */
  record Panic(
        /**
         * The panic message, if it could be extracted.
         */
    java.lang.String message, 
        /**
         * Backtrace captured after the panic (if available).
         */
    java.lang.String panicBacktrace) implements BackgroundTaskFailureReason {
    
    
    

  }
  
    /**
     * The task returned an error.
     */
  record Error(
        /**
         * String representation of the error.
         */
    java.lang.String error) implements BackgroundTaskFailureReason {
    
    
    

  }
  
    /**
     * The task ended unexpectedly (for tasks expected to run forever).
     */
  record EarlyTermination() implements BackgroundTaskFailureReason {
    
    
    

  }
  
  

  
}

