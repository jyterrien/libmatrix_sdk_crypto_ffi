package uniffi.matrix_sdk_crypto_ffi;

/**
 * A pickled version of an `InboundGroupSession`.
 *
 * Holds all the information that needs to be stored in a database to restore
 * an InboundGroupSession.
 */
public class PickledInboundGroupSession {
    /**
     * The pickle string holding the InboundGroupSession.
     */
    private java.lang.String pickle;
    /**
     * The public curve25519 key of the account that sent us the session
     */
    private java.lang.String senderKey;
    /**
     * The public ed25519 key of the account that sent us the session.
     */
    private java.util.Map<java.lang.String, java.lang.String> signingKey;
    /**
     * The id of the room that the session is used in.
     */
    private java.lang.String roomId;
    /**
     * The list of claimed ed25519 that forwarded us this key. Will be empty if
     * we directly received this session.
     */
    private java.util.List<java.lang.String> forwardingChains;
    /**
     * Flag remembering if the session was directly sent to us by the sender
     * or if it was imported.
     */
    private boolean imported;
    /**
     * Flag remembering if the session has been backed up.
     */
    private boolean backedUp;

    public PickledInboundGroupSession(
        java.lang.String pickle, 
        java.lang.String senderKey, 
        java.util.Map<java.lang.String, java.lang.String> signingKey, 
        java.lang.String roomId, 
        java.util.List<java.lang.String> forwardingChains, 
        boolean imported, 
        boolean backedUp
    ) {
        
        this.pickle = pickle;
        
        this.senderKey = senderKey;
        
        this.signingKey = signingKey;
        
        this.roomId = roomId;
        
        this.forwardingChains = forwardingChains;
        
        this.imported = imported;
        
        this.backedUp = backedUp;
    }
    
    public java.lang.String pickle() {
        return this.pickle;
    }
    
    public java.lang.String senderKey() {
        return this.senderKey;
    }
    
    public java.util.Map<java.lang.String, java.lang.String> signingKey() {
        return this.signingKey;
    }
    
    public java.lang.String roomId() {
        return this.roomId;
    }
    
    public java.util.List<java.lang.String> forwardingChains() {
        return this.forwardingChains;
    }
    
    public boolean imported() {
        return this.imported;
    }
    
    public boolean backedUp() {
        return this.backedUp;
    }
    public void setPickle(java.lang.String pickle) {
        this.pickle = pickle;
    }
    public void setSenderKey(java.lang.String senderKey) {
        this.senderKey = senderKey;
    }
    public void setSigningKey(java.util.Map<java.lang.String, java.lang.String> signingKey) {
        this.signingKey = signingKey;
    }
    public void setRoomId(java.lang.String roomId) {
        this.roomId = roomId;
    }
    public void setForwardingChains(java.util.List<java.lang.String> forwardingChains) {
        this.forwardingChains = forwardingChains;
    }
    public void setImported(boolean imported) {
        this.imported = imported;
    }
    public void setBackedUp(boolean backedUp) {
        this.backedUp = backedUp;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof PickledInboundGroupSession) {
            PickledInboundGroupSession _uniffiThat = (PickledInboundGroupSession) _uniffiOther;
            return (
              java.util.Objects.equals(pickle, _uniffiThat.pickle) && 
              
              java.util.Objects.equals(senderKey, _uniffiThat.senderKey) && 
              
              java.util.Objects.equals(signingKey, _uniffiThat.signingKey) && 
              
              java.util.Objects.equals(roomId, _uniffiThat.roomId) && 
              
              java.util.Objects.equals(forwardingChains, _uniffiThat.forwardingChains) && 
              
              imported == _uniffiThat.imported && 
              
              backedUp == _uniffiThat.backedUp
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(pickle);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(senderKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(signingKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(roomId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(forwardingChains);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(imported);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(backedUp);
        return _uniffiHash;
    }

    
    
    

}


