package uniffi.matrix_sdk_crypto_ffi;

/**
 * Listener that will be passed over the FFI to report changes to a QrCode
 * verification.
 */
public interface QrCodeListener {
    
    /**
     * The callback that should be called on the Rust side
     *
     * # Arguments
     *
     * * `state` - The current state of the QrCode verification.
     */public void onChange(QrCodeState state);
    
}
