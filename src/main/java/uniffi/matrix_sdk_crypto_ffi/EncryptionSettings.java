package uniffi.matrix_sdk_crypto_ffi;

/**
 * Settings that should be used when a room key is shared.
 *
 * These settings control which algorithm the room key should use, how long a
 * room key should be used and some other important information that determines
 * the lifetime of a room key.
 */
public class EncryptionSettings {
    /**
     * The encryption algorithm that should be used in the room.
     */
    private EventEncryptionAlgorithm algorithm;
    /**
     * How long can the room key be used before it should be rotated. Time in
     * seconds.
     */
    private long rotationPeriod;
    /**
     * How many messages should be sent before the room key should be rotated.
     */
    private long rotationPeriodMsgs;
    /**
     * The current history visibility of the room. The visibility will be
     * tracked by the room key and the key will be rotated if the visibility
     * changes.
     */
    private HistoryVisibility historyVisibility;
    /**
     * Should untrusted devices receive the room key, or should they be
     * excluded from the conversation.
     */
    private boolean onlyAllowTrustedDevices;
    /**
     * Should fail to send when a verified user has unverified devices, or when
     * a previously verified user replaces their identity.
     */
    private boolean errorOnVerifiedUserProblem;

    public EncryptionSettings(
        EventEncryptionAlgorithm algorithm, 
        long rotationPeriod, 
        long rotationPeriodMsgs, 
        HistoryVisibility historyVisibility, 
        boolean onlyAllowTrustedDevices, 
        boolean errorOnVerifiedUserProblem
    ) {
        
        this.algorithm = algorithm;
        
        this.rotationPeriod = rotationPeriod;
        
        this.rotationPeriodMsgs = rotationPeriodMsgs;
        
        this.historyVisibility = historyVisibility;
        
        this.onlyAllowTrustedDevices = onlyAllowTrustedDevices;
        
        this.errorOnVerifiedUserProblem = errorOnVerifiedUserProblem;
    }
    
    public EventEncryptionAlgorithm algorithm() {
        return this.algorithm;
    }
    
    public long rotationPeriod() {
        return this.rotationPeriod;
    }
    
    public long rotationPeriodMsgs() {
        return this.rotationPeriodMsgs;
    }
    
    public HistoryVisibility historyVisibility() {
        return this.historyVisibility;
    }
    
    public boolean onlyAllowTrustedDevices() {
        return this.onlyAllowTrustedDevices;
    }
    
    public boolean errorOnVerifiedUserProblem() {
        return this.errorOnVerifiedUserProblem;
    }
    public void setAlgorithm(EventEncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
    public void setRotationPeriod(long rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }
    public void setRotationPeriodMsgs(long rotationPeriodMsgs) {
        this.rotationPeriodMsgs = rotationPeriodMsgs;
    }
    public void setHistoryVisibility(HistoryVisibility historyVisibility) {
        this.historyVisibility = historyVisibility;
    }
    public void setOnlyAllowTrustedDevices(boolean onlyAllowTrustedDevices) {
        this.onlyAllowTrustedDevices = onlyAllowTrustedDevices;
    }
    public void setErrorOnVerifiedUserProblem(boolean errorOnVerifiedUserProblem) {
        this.errorOnVerifiedUserProblem = errorOnVerifiedUserProblem;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof EncryptionSettings) {
            EncryptionSettings _uniffiThat = (EncryptionSettings) _uniffiOther;
            return (
              java.util.Objects.equals(algorithm, _uniffiThat.algorithm) && 
              
              rotationPeriod == _uniffiThat.rotationPeriod && 
              
              rotationPeriodMsgs == _uniffiThat.rotationPeriodMsgs && 
              
              java.util.Objects.equals(historyVisibility, _uniffiThat.historyVisibility) && 
              
              onlyAllowTrustedDevices == _uniffiThat.onlyAllowTrustedDevices && 
              
              errorOnVerifiedUserProblem == _uniffiThat.errorOnVerifiedUserProblem
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(algorithm);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(rotationPeriod);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(rotationPeriodMsgs);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(historyVisibility);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(onlyAllowTrustedDevices);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(errorOnVerifiedUserProblem);
        return _uniffiHash;
    }

    
    
    

}


