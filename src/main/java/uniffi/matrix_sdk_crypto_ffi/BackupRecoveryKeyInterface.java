package uniffi.matrix_sdk_crypto_ffi;

/**
 * The private part of the backup key, the one used for recovery.
 */
public interface BackupRecoveryKeyInterface {
    
    /**
     * Try to decrypt a message that was encrypted using the public part of the
     * backup key.
     */public java.lang.String decryptV1(java.lang.String ephemeralKey, java.lang.String mac, java.lang.String ciphertext) throws PkDecryptionException;
    
    /**
     * Get the public part of the backup key.
     */public MegolmV1BackupKey megolmV1PublicKey();
    
    /**
     * Convert the recovery key to a base 58 encoded string.
     */public java.lang.String toBase58();
    
    /**
     * Convert the recovery key to a base 64 encoded string.
     */public java.lang.String toBase64();
    
}

