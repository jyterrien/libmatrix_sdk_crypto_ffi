package uniffi.matrix_sdk_crypto_ffi;

/**
 * Struct collecting data that is important to migrate to the rust-sdk
 */
public class MigrationData {
    /**
     * The pickled version of the Olm Account
     */
    private PickledAccount account;
    /**
     * The list of pickleds Olm Sessions.
     */
    private java.util.List<PickledSession> sessions;
    /**
     * The list of Megolm inbound group sessions.
     */
    private java.util.List<PickledInboundGroupSession> inboundGroupSessions;
    /**
     * The Olm pickle key that was used to pickle all the Olm objects.
     */
    private byte[] pickleKey;
    /**
     * The backup version that is currently active.
     */
    private java.lang.String backupVersion;
    private java.lang.String backupRecoveryKey;
    /**
     * The private cross signing keys.
     */
    private CrossSigningKeyExport crossSigning;
    /**
     * The list of users that the Rust SDK should track.
     */
    private java.util.List<java.lang.String> trackedUsers;
    /**
     * Map of room settings
     */
    private java.util.Map<java.lang.String, RoomSettings> roomSettings;

    public MigrationData(
        PickledAccount account, 
        java.util.List<PickledSession> sessions, 
        java.util.List<PickledInboundGroupSession> inboundGroupSessions, 
        byte[] pickleKey, 
        java.lang.String backupVersion, 
        java.lang.String backupRecoveryKey, 
        CrossSigningKeyExport crossSigning, 
        java.util.List<java.lang.String> trackedUsers, 
        java.util.Map<java.lang.String, RoomSettings> roomSettings
    ) {
        
        this.account = account;
        
        this.sessions = sessions;
        
        this.inboundGroupSessions = inboundGroupSessions;
        
        this.pickleKey = pickleKey;
        
        this.backupVersion = backupVersion;
        
        this.backupRecoveryKey = backupRecoveryKey;
        
        this.crossSigning = crossSigning;
        
        this.trackedUsers = trackedUsers;
        
        this.roomSettings = roomSettings;
    }
    
    public PickledAccount account() {
        return this.account;
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
    
    public java.lang.String backupVersion() {
        return this.backupVersion;
    }
    
    public java.lang.String backupRecoveryKey() {
        return this.backupRecoveryKey;
    }
    
    public CrossSigningKeyExport crossSigning() {
        return this.crossSigning;
    }
    
    public java.util.List<java.lang.String> trackedUsers() {
        return this.trackedUsers;
    }
    
    public java.util.Map<java.lang.String, RoomSettings> roomSettings() {
        return this.roomSettings;
    }
    public void setAccount(PickledAccount account) {
        this.account = account;
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
    public void setBackupVersion(java.lang.String backupVersion) {
        this.backupVersion = backupVersion;
    }
    public void setBackupRecoveryKey(java.lang.String backupRecoveryKey) {
        this.backupRecoveryKey = backupRecoveryKey;
    }
    public void setCrossSigning(CrossSigningKeyExport crossSigning) {
        this.crossSigning = crossSigning;
    }
    public void setTrackedUsers(java.util.List<java.lang.String> trackedUsers) {
        this.trackedUsers = trackedUsers;
    }
    public void setRoomSettings(java.util.Map<java.lang.String, RoomSettings> roomSettings) {
        this.roomSettings = roomSettings;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof MigrationData) {
            MigrationData _uniffiThat = (MigrationData) _uniffiOther;
            return (
              java.util.Objects.equals(account, _uniffiThat.account) && 
              
              java.util.Objects.equals(sessions, _uniffiThat.sessions) && 
              
              java.util.Objects.equals(inboundGroupSessions, _uniffiThat.inboundGroupSessions) && 
              
              UniffiDeepValue.equals(pickleKey, _uniffiThat.pickleKey) && 
              
              java.util.Objects.equals(backupVersion, _uniffiThat.backupVersion) && 
              
              java.util.Objects.equals(backupRecoveryKey, _uniffiThat.backupRecoveryKey) && 
              
              java.util.Objects.equals(crossSigning, _uniffiThat.crossSigning) && 
              
              java.util.Objects.equals(trackedUsers, _uniffiThat.trackedUsers) && 
              
              java.util.Objects.equals(roomSettings, _uniffiThat.roomSettings)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(account);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(sessions);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(inboundGroupSessions);
        _uniffiHash = 31 * _uniffiHash + UniffiDeepValue.hashCode(pickleKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(backupVersion);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(backupRecoveryKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(crossSigning);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(trackedUsers);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(roomSettings);
        return _uniffiHash;
    }

    
    
    

}


