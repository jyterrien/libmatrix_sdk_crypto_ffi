package uniffi.matrix_sdk_crypto_ffi;

/**
 * The encryption component of PkEncryption support.
 *
 * This struct can be created using a [`Curve25519PublicKey`] corresponding to
 * a `PkDecryption` object, allowing messages to be encrypted for the
 * associated decryption object.
 */
public interface PkEncryptionInterface {
    
    /**
     * Encrypt a message using this [`PkEncryption`] object.
     */public PkMessage encrypt(java.lang.String plaintext);
    
}

