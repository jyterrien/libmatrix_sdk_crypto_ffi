package uniffi.matrix_sdk_crypto_ffi;

public class UploadSigningKeysRequest {
    private java.lang.String masterKey;
    private java.lang.String selfSigningKey;
    private java.lang.String userSigningKey;

    public UploadSigningKeysRequest(
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
        if (_uniffiOther instanceof UploadSigningKeysRequest) {
            UploadSigningKeysRequest _uniffiThat = (UploadSigningKeysRequest) _uniffiOther;
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


