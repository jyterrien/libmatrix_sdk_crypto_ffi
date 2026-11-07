package uniffi.matrix_sdk_crypto_ffi;

/**
 * Trait that can be used to forward Rust logs over FFI to a language specific
 * logger.
 */
public interface Logger {
    
    /**
     * Called every time the Rust side wants to post a log line.
     */public void log(java.lang.String logLine);
    
}
