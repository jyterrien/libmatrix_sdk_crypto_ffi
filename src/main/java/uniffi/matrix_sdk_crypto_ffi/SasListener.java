package uniffi.matrix_sdk_crypto_ffi;

/**
 * Listener that will be passed over the FFI to report changes to a SAS
 * verification.
 */
public interface SasListener {
    
    /**
     * The callback that should be called on the Rust side
     *
     * # Arguments
     *
     * * `state` - The current state of the SAS verification.
     */public void onChange(SasState state);
    
}
