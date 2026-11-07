package uniffi.matrix_sdk_crypto_ffi;

/**
 * An event that was successfully decrypted.
 */
public class DecryptedEvent {
    /**
     * The decrypted version of the event.
     */
    private java.lang.String clearEvent;
    /**
     * The claimed curve25519 key of the sender.
     */
    private java.lang.String senderCurve25519Key;
    /**
     * The claimed ed25519 key of the sender.
     */
    private java.lang.String claimedEd25519Key;
    /**
     * The curve25519 chain of the senders that forwarded the Megolm decryption
     * key to us. Is empty if the key came directly from the sender of the
     * event.
     */
    private java.util.List<java.lang.String> forwardingCurve25519Chain;
    /**
     * The shield state (color and message to display to user) for the event,
     * representing the event's authenticity. Computed from the properties of
     * the sender user identity and their Olm device.
     *
     * Note that this is computed at time of decryption, so the value reflects
     * the computed event authenticity at that time. Authenticity-related
     * properties can change later on, such as when a user identity is
     * subsequently verified or a device is deleted.
     */
    private ShieldState shieldState;

    public DecryptedEvent(
        java.lang.String clearEvent, 
        java.lang.String senderCurve25519Key, 
        java.lang.String claimedEd25519Key, 
        java.util.List<java.lang.String> forwardingCurve25519Chain, 
        ShieldState shieldState
    ) {
        
        this.clearEvent = clearEvent;
        
        this.senderCurve25519Key = senderCurve25519Key;
        
        this.claimedEd25519Key = claimedEd25519Key;
        
        this.forwardingCurve25519Chain = forwardingCurve25519Chain;
        
        this.shieldState = shieldState;
    }
    
    public java.lang.String clearEvent() {
        return this.clearEvent;
    }
    
    public java.lang.String senderCurve25519Key() {
        return this.senderCurve25519Key;
    }
    
    public java.lang.String claimedEd25519Key() {
        return this.claimedEd25519Key;
    }
    
    public java.util.List<java.lang.String> forwardingCurve25519Chain() {
        return this.forwardingCurve25519Chain;
    }
    
    public ShieldState shieldState() {
        return this.shieldState;
    }
    public void setClearEvent(java.lang.String clearEvent) {
        this.clearEvent = clearEvent;
    }
    public void setSenderCurve25519Key(java.lang.String senderCurve25519Key) {
        this.senderCurve25519Key = senderCurve25519Key;
    }
    public void setClaimedEd25519Key(java.lang.String claimedEd25519Key) {
        this.claimedEd25519Key = claimedEd25519Key;
    }
    public void setForwardingCurve25519Chain(java.util.List<java.lang.String> forwardingCurve25519Chain) {
        this.forwardingCurve25519Chain = forwardingCurve25519Chain;
    }
    public void setShieldState(ShieldState shieldState) {
        this.shieldState = shieldState;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof DecryptedEvent) {
            DecryptedEvent _uniffiThat = (DecryptedEvent) _uniffiOther;
            return (
              java.util.Objects.equals(clearEvent, _uniffiThat.clearEvent) && 
              
              java.util.Objects.equals(senderCurve25519Key, _uniffiThat.senderCurve25519Key) && 
              
              java.util.Objects.equals(claimedEd25519Key, _uniffiThat.claimedEd25519Key) && 
              
              java.util.Objects.equals(forwardingCurve25519Chain, _uniffiThat.forwardingCurve25519Chain) && 
              
              java.util.Objects.equals(shieldState, _uniffiThat.shieldState)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(clearEvent);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(senderCurve25519Key);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(claimedEd25519Key);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(forwardingCurve25519Chain);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(shieldState);
        return _uniffiHash;
    }

    
    
    

}


