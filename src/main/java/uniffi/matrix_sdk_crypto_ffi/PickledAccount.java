package uniffi.matrix_sdk_crypto_ffi;

/**
 * A pickled version of an `Account`.
 *
 * Holds all the information that needs to be stored in a database to restore
 * an account.
 */
public class PickledAccount {
    /**
     * The user id of the account owner.
     */
    private java.lang.String userId;
    /**
     * The device ID of the account owner.
     */
    private java.lang.String deviceId;
    /**
     * The pickled version of the Olm account.
     */
    private java.lang.String pickle;
    /**
     * Was the account shared.
     */
    private boolean shared;
    /**
     * The number of uploaded one-time keys we have on the server.
     */
    private long uploadedSignedKeyCount;

    public PickledAccount(
        java.lang.String userId, 
        java.lang.String deviceId, 
        java.lang.String pickle, 
        boolean shared, 
        long uploadedSignedKeyCount
    ) {
        
        this.userId = userId;
        
        this.deviceId = deviceId;
        
        this.pickle = pickle;
        
        this.shared = shared;
        
        this.uploadedSignedKeyCount = uploadedSignedKeyCount;
    }
    
    public java.lang.String userId() {
        return this.userId;
    }
    
    public java.lang.String deviceId() {
        return this.deviceId;
    }
    
    public java.lang.String pickle() {
        return this.pickle;
    }
    
    public boolean shared() {
        return this.shared;
    }
    
    public long uploadedSignedKeyCount() {
        return this.uploadedSignedKeyCount;
    }
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }
    public void setPickle(java.lang.String pickle) {
        this.pickle = pickle;
    }
    public void setShared(boolean shared) {
        this.shared = shared;
    }
    public void setUploadedSignedKeyCount(long uploadedSignedKeyCount) {
        this.uploadedSignedKeyCount = uploadedSignedKeyCount;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof PickledAccount) {
            PickledAccount _uniffiThat = (PickledAccount) _uniffiOther;
            return (
              java.util.Objects.equals(userId, _uniffiThat.userId) && 
              
              java.util.Objects.equals(deviceId, _uniffiThat.deviceId) && 
              
              java.util.Objects.equals(pickle, _uniffiThat.pickle) && 
              
              shared == _uniffiThat.shared && 
              
              uploadedSignedKeyCount == _uniffiThat.uploadedSignedKeyCount
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(userId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(deviceId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(pickle);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(shared);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(uploadedSignedKeyCount);
        return _uniffiHash;
    }

    
    
    

}


