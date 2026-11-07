package uniffi.matrix_sdk_crypto_ffi;

/**
 * Struct collecting data that is important to migrate sessions to the rust-sdk
 */
public class SessionMigrationData {
    /**
     * The user id that the data belongs to.
     */
    private java.lang.String userId;
    /**
     * The device id that the data belongs to.
     */
    private java.lang.String deviceId;
    /**
     * The Curve25519 public key of the Account that owns this data.
     */
    private java.lang.String curve25519Key;
    /**
     * The Ed25519 public key of the Account that owns this data.
     */
    private java.lang.String ed25519Key;
    /**
     * The list of pickleds Olm Sessions.
     */
    private java.util.List<PickledSession> sessions;
    /**
     * The list of pickled Megolm inbound group sessions.
     */
    private java.util.List<PickledInboundGroupSession> inboundGroupSessions;
    /**
     * The Olm pickle key that was used to pickle all the Olm objects.
     */
    private byte[] pickleKey;

    public SessionMigrationData(
        java.lang.String userId, 
        java.lang.String deviceId, 
        java.lang.String curve25519Key, 
        java.lang.String ed25519Key, 
        java.util.List<PickledSession> sessions, 
        java.util.List<PickledInboundGroupSession> inboundGroupSessions, 
        byte[] pickleKey
    ) {
        
        this.userId = userId;
        
        this.deviceId = deviceId;
        
        this.curve25519Key = curve25519Key;
        
        this.ed25519Key = ed25519Key;
        
        this.sessions = sessions;
        
        this.inboundGroupSessions = inboundGroupSessions;
        
        this.pickleKey = pickleKey;
    }
    
    public java.lang.String userId() {
        return this.userId;
    }
    
    public java.lang.String deviceId() {
        return this.deviceId;
    }
    
    public java.lang.String curve25519Key() {
        return this.curve25519Key;
    }
    
    public java.lang.String ed25519Key() {
        return this.ed25519Key;
    }
    
    public java.util.List<PickledSession> sessions() {
        return this.sessions;
    }
    
    public java.util.List<PickledInboundGroupSession> inboundGroupSessions() {
        return this.inboundGroupSessions;
    }
    
    public byte[] pickleKey() {
        return this.pickleKey;
    }
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }
    public void setCurve25519Key(java.lang.String curve25519Key) {
        this.curve25519Key = curve25519Key;
    }
    public void setEd25519Key(java.lang.String ed25519Key) {
        this.ed25519Key = ed25519Key;
    }
    public void setSessions(java.util.List<PickledSession> sessions) {
        this.sessions = sessions;
    }
    public void setInboundGroupSessions(java.util.List<PickledInboundGroupSession> inboundGroupSessions) {
        this.inboundGroupSessions = inboundGroupSessions;
    }
    public void setPickleKey(byte[] pickleKey) {
        this.pickleKey = pickleKey;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof SessionMigrationData) {
            SessionMigrationData _uniffiThat = (SessionMigrationData) _uniffiOther;
            return (
              java.util.Objects.equals(userId, _uniffiThat.userId) && 
              
              java.util.Objects.equals(deviceId, _uniffiThat.deviceId) && 
              
              java.util.Objects.equals(curve25519Key, _uniffiThat.curve25519Key) && 
              
              java.util.Objects.equals(ed25519Key, _uniffiThat.ed25519Key) && 
              
              java.util.Objects.equals(sessions, _uniffiThat.sessions) && 
              
              java.util.Objects.equals(inboundGroupSessions, _uniffiThat.inboundGroupSessions) && 
              
              UniffiDeepValue.equals(pickleKey, _uniffiThat.pickleKey)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(userId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(deviceId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(curve25519Key);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(ed25519Key);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(sessions);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(inboundGroupSessions);
        _uniffiHash = 31 * _uniffiHash + UniffiDeepValue.hashCode(pickleKey);
        return _uniffiHash;
    }

    
    
    

}


