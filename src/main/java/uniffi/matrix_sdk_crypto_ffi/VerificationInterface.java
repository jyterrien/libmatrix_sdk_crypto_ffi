package uniffi.matrix_sdk_crypto_ffi;

/**
 * Enum representing the different verification flows we support.
 */
public interface VerificationInterface {
    
    /**
     * Try to represent the `Verification` as an `QrCode` verification object,
     * returns `None` if the verification is not a `QrCode` verification.
     */public QrCode asQr();
    
    /**
     * Try to represent the `Verification` as an `Sas` verification object,
     * returns `None` if the verification is not a `Sas` verification.
     */public Sas asSas();
    
}

