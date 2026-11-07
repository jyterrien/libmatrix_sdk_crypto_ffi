package uniffi.matrix_sdk_crypto;

/**
 * Settings for decrypting messages
 */
public class DecryptionSettings {
    /**
     * The trust level in the sender's device that is required to decrypt the
     * event. If the sender's device is not sufficiently trusted,
     * [`MegolmError::SenderIdentityNotTrusted`] will be returned.
     */
    private TrustRequirement senderDeviceTrustRequirement;

    public DecryptionSettings(
        TrustRequirement senderDeviceTrustRequirement
    ) {
        
        this.senderDeviceTrustRequirement = senderDeviceTrustRequirement;
    }
    
    public TrustRequirement senderDeviceTrustRequirement() {
        return this.senderDeviceTrustRequirement;
    }
    public void setSenderDeviceTrustRequirement(TrustRequirement senderDeviceTrustRequirement) {
        this.senderDeviceTrustRequirement = senderDeviceTrustRequirement;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof DecryptionSettings) {
            DecryptionSettings _uniffiThat = (DecryptionSettings) _uniffiOther;
            return (
              java.util.Objects.equals(senderDeviceTrustRequirement, _uniffiThat.senderDeviceTrustRequirement)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(senderDeviceTrustRequirement);
        return _uniffiHash;
    }

    
    
    

}


