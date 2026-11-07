package uniffi.matrix_sdk_crypto_ffi;

/**
 * The public part of the backup key.
 */
public class MegolmV1BackupKey {
    /**
     * The actual base64 encoded public key.
     */
    private java.lang.String publicKey;
    /**
     * Signatures that have signed our backup key.
     */
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> signatures;
    /**
     * The passphrase info, if the key was derived from one.
     */
    private PassphraseInfo passphraseInfo;
    /**
     * Get the full name of the backup algorithm this backup key supports.
     */
    private java.lang.String backupAlgorithm;

    public MegolmV1BackupKey(
        java.lang.String publicKey, 
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> signatures, 
        PassphraseInfo passphraseInfo, 
        java.lang.String backupAlgorithm
    ) {
        
        this.publicKey = publicKey;
        
        this.signatures = signatures;
        
        this.passphraseInfo = passphraseInfo;
        
        this.backupAlgorithm = backupAlgorithm;
    }
    
    public java.lang.String publicKey() {
        return this.publicKey;
    }
    
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> signatures() {
        return this.signatures;
    }
    
    public PassphraseInfo passphraseInfo() {
        return this.passphraseInfo;
    }
    
    public java.lang.String backupAlgorithm() {
        return this.backupAlgorithm;
    }
    public void setPublicKey(java.lang.String publicKey) {
        this.publicKey = publicKey;
    }
    public void setSignatures(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> signatures) {
        this.signatures = signatures;
    }
    public void setPassphraseInfo(PassphraseInfo passphraseInfo) {
        this.passphraseInfo = passphraseInfo;
    }
    public void setBackupAlgorithm(java.lang.String backupAlgorithm) {
        this.backupAlgorithm = backupAlgorithm;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof MegolmV1BackupKey) {
            MegolmV1BackupKey _uniffiThat = (MegolmV1BackupKey) _uniffiOther;
            return (
              java.util.Objects.equals(publicKey, _uniffiThat.publicKey) && 
              
              java.util.Objects.equals(signatures, _uniffiThat.signatures) && 
              
              java.util.Objects.equals(passphraseInfo, _uniffiThat.passphraseInfo) && 
              
              java.util.Objects.equals(backupAlgorithm, _uniffiThat.backupAlgorithm)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(publicKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(signatures);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(passphraseInfo);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(backupAlgorithm);
        return _uniffiHash;
    }

    
    
    

}


