package uniffi.matrix_sdk_crypto_ffi;

/**
 * Listener that will be passed over the FFI to report changes to a
 * verification request.
 */
public interface VerificationRequestListener {
    
    /**
     * The callback that should be called on the Rust side
     *
     * # Arguments
     *
     * * `state` - The current state of the verification request.
     */public void onChange(VerificationRequestState state);
    
}
