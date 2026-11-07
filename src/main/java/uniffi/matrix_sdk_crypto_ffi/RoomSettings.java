package uniffi.matrix_sdk_crypto_ffi;

/**
 * Room encryption settings which are modified by state events or user options
 */
public class RoomSettings {
    /**
     * The encryption algorithm that should be used in the room.
     */
    private EventEncryptionAlgorithm algorithm;
    /**
     * Should untrusted devices receive the room key, or should they be
     * excluded from the conversation.
     */
    private boolean onlyAllowTrustedDevices;

    public RoomSettings(
        EventEncryptionAlgorithm algorithm, 
        boolean onlyAllowTrustedDevices
    ) {
        
        this.algorithm = algorithm;
        
        this.onlyAllowTrustedDevices = onlyAllowTrustedDevices;
    }
    
    public EventEncryptionAlgorithm algorithm() {
        return this.algorithm;
    }
    
    public boolean onlyAllowTrustedDevices() {
        return this.onlyAllowTrustedDevices;
    }
    public void setAlgorithm(EventEncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
    public void setOnlyAllowTrustedDevices(boolean onlyAllowTrustedDevices) {
        this.onlyAllowTrustedDevices = onlyAllowTrustedDevices;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof RoomSettings) {
            RoomSettings _uniffiThat = (RoomSettings) _uniffiOther;
            return (
              java.util.Objects.equals(algorithm, _uniffiThat.algorithm) && 
              
              onlyAllowTrustedDevices == _uniffiThat.onlyAllowTrustedDevices
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(algorithm);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(onlyAllowTrustedDevices);
        return _uniffiHash;
    }

    
    
    

}


