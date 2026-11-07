package uniffi.matrix_sdk_crypto_ffi;

/**
 * Backup keys and information we load from the store.
 */
public interface BackupKeysInterface {
    
    /**
     * Get the backups version that we're holding on to.
     */public java.lang.String backupVersion();
    
    /**
     * Get the recovery key that we're holding on to.
     */public BackupRecoveryKey recoveryKey();
    
}

