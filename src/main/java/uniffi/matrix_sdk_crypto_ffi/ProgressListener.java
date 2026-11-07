package uniffi.matrix_sdk_crypto_ffi;

/**
 * Callback that will be passed over the FFI to report progress
 */
public interface ProgressListener {
    
    /**
     * The callback that should be called on the Rust side
     *
     * # Arguments
     *
     * * `progress` - The current number of items that have been handled
     *
     * * `total` - The total number of items that will be handled
     */public void onProgress(int progress, int total);
    
}
