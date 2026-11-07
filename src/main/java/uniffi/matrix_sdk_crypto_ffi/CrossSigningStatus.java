package uniffi.matrix_sdk_crypto_ffi;

/**
 * Struct representing the state of our private cross signing keys, it shows
 * which private cross signing keys we have locally stored.
 */
public class CrossSigningStatus {
    /**
     * Do we have the master key.
     */
    private boolean hasMaster;
    /**
     * Do we have the self signing key, this one is necessary to sign our own
     * devices.
     */
    private boolean hasSelfSigning;
    /**
     * Do we have the user signing key, this one is necessary to sign other
     * users.
     */
    private boolean hasUserSigning;

    public CrossSigningStatus(
        boolean hasMaster, 
        boolean hasSelfSigning, 
        boolean hasUserSigning
    ) {
        
        this.hasMaster = hasMaster;
        
        this.hasSelfSigning = hasSelfSigning;
        
        this.hasUserSigning = hasUserSigning;
    }
    
    public boolean hasMaster() {
        return this.hasMaster;
    }
    
    public boolean hasSelfSigning() {
        return this.hasSelfSigning;
    }
    
    public boolean hasUserSigning() {
        return this.hasUserSigning;
    }
    public void setHasMaster(boolean hasMaster) {
        this.hasMaster = hasMaster;
    }
    public void setHasSelfSigning(boolean hasSelfSigning) {
        this.hasSelfSigning = hasSelfSigning;
    }
    public void setHasUserSigning(boolean hasUserSigning) {
        this.hasUserSigning = hasUserSigning;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof CrossSigningStatus) {
            CrossSigningStatus _uniffiThat = (CrossSigningStatus) _uniffiOther;
            return (
              hasMaster == _uniffiThat.hasMaster && 
              
              hasSelfSigning == _uniffiThat.hasSelfSigning && 
              
              hasUserSigning == _uniffiThat.hasUserSigning
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(hasMaster);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(hasSelfSigning);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(hasUserSigning);
        return _uniffiHash;
    }

    
    
    

}


