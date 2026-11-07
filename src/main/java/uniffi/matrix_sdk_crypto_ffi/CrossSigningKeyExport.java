package uniffi.matrix_sdk_crypto_ffi;

/**
 * A struct containing private cross signing keys that can be backed up or
 * uploaded to the secret store.
 */
public class CrossSigningKeyExport {
    /**
     * The seed of the master key encoded as unpadded base64.
     */
    private java.lang.String masterKey;
    /**
     * The seed of the self signing key encoded as unpadded base64.
     */
    private java.lang.String selfSigningKey;
    /**
     * The seed of the user signing key encoded as unpadded base64.
     */
    private java.lang.String userSigningKey;

    public CrossSigningKeyExport(
        java.lang.String masterKey, 
        java.lang.String selfSigningKey, 
        java.lang.String userSigningKey
    ) {
        
        this.masterKey = masterKey;
        
        this.selfSigningKey = selfSigningKey;
        
        this.userSigningKey = userSigningKey;
    }
    
    public java.lang.String masterKey() {
        return this.masterKey;
    }
    
    public java.lang.String selfSigningKey() {
        return this.selfSigningKey;
    }
    
    public java.lang.String userSigningKey() {
        return this.userSigningKey;
    }
    public void setMasterKey(java.lang.String masterKey) {
        this.masterKey = masterKey;
    }
    public void setSelfSigningKey(java.lang.String selfSigningKey) {
        this.selfSigningKey = selfSigningKey;
    }
    public void setUserSigningKey(java.lang.String userSigningKey) {
        this.userSigningKey = userSigningKey;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof CrossSigningKeyExport) {
            CrossSigningKeyExport _uniffiThat = (CrossSigningKeyExport) _uniffiOther;
            return (
              java.util.Objects.equals(masterKey, _uniffiThat.masterKey) && 
              
              java.util.Objects.equals(selfSigningKey, _uniffiThat.selfSigningKey) && 
              
              java.util.Objects.equals(userSigningKey, _uniffiThat.userSigningKey)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(masterKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(selfSigningKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(userSigningKey);
        return _uniffiHash;
    }

    
    
    

}


