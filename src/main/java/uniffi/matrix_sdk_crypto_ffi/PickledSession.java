package uniffi.matrix_sdk_crypto_ffi;

/**
 * A pickled version of a `Session`.
 *
 * Holds all the information that needs to be stored in a database to restore
 * a Session.
 */
public class PickledSession {
    /**
     * The pickle string holding the Olm Session.
     */
    private java.lang.String pickle;
    /**
     * The curve25519 key of the other user that we share this session with.
     */
    private java.lang.String senderKey;
    /**
     * Was the session created using a fallback key.
     */
    private boolean createdUsingFallbackKey;
    /**
     * Unix timestamp (in seconds) when the session was created.
     */
    private long creationTime;
    /**
     * Unix timestamp (in seconds) when the session was last used.
     */
    private long lastUseTime;

    public PickledSession(
        java.lang.String pickle, 
        java.lang.String senderKey, 
        boolean createdUsingFallbackKey, 
        long creationTime, 
        long lastUseTime
    ) {
        
        this.pickle = pickle;
        
        this.senderKey = senderKey;
        
        this.createdUsingFallbackKey = createdUsingFallbackKey;
        
        this.creationTime = creationTime;
        
        this.lastUseTime = lastUseTime;
    }
    
    public java.lang.String pickle() {
        return this.pickle;
    }
    
    public java.lang.String senderKey() {
        return this.senderKey;
    }
    
    public boolean createdUsingFallbackKey() {
        return this.createdUsingFallbackKey;
    }
    
    public long creationTime() {
        return this.creationTime;
    }
    
    public long lastUseTime() {
        return this.lastUseTime;
    }
    public void setPickle(java.lang.String pickle) {
        this.pickle = pickle;
    }
    public void setSenderKey(java.lang.String senderKey) {
        this.senderKey = senderKey;
    }
    public void setCreatedUsingFallbackKey(boolean createdUsingFallbackKey) {
        this.createdUsingFallbackKey = createdUsingFallbackKey;
    }
    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }
    public void setLastUseTime(long lastUseTime) {
        this.lastUseTime = lastUseTime;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof PickledSession) {
            PickledSession _uniffiThat = (PickledSession) _uniffiOther;
            return (
              java.util.Objects.equals(pickle, _uniffiThat.pickle) && 
              
              java.util.Objects.equals(senderKey, _uniffiThat.senderKey) && 
              
              createdUsingFallbackKey == _uniffiThat.createdUsingFallbackKey && 
              
              creationTime == _uniffiThat.creationTime && 
              
              lastUseTime == _uniffiThat.lastUseTime
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(pickle);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(senderKey);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(createdUsingFallbackKey);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(creationTime);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(lastUseTime);
        return _uniffiHash;
    }

    
    
    

}


