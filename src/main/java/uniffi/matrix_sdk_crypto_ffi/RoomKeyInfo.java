package uniffi.matrix_sdk_crypto_ffi;

/**
 * Information on a room key that has been received or imported.
 */
public class RoomKeyInfo {
    /**
     * The [messaging algorithm] that this key is used for. Will be one of the
     * `m.megolm.*` algorithms.
     *
     * [messaging algorithm]: https://spec.matrix.org/v1.6/client-server-api/#messaging-algorithms
     */
    private java.lang.String algorithm;
    /**
     * The room where the key is used.
     */
    private java.lang.String roomId;
    /**
     * The Curve25519 key of the device which initiated the session originally.
     */
    private java.lang.String senderKey;
    /**
     * The ID of the session that the key is for.
     */
    private java.lang.String sessionId;

    public RoomKeyInfo(
        java.lang.String algorithm, 
        java.lang.String roomId, 
        java.lang.String senderKey, 
        java.lang.String sessionId
    ) {
        
        this.algorithm = algorithm;
        
        this.roomId = roomId;
        
        this.senderKey = senderKey;
        
        this.sessionId = sessionId;
    }
    
    public java.lang.String algorithm() {
        return this.algorithm;
    }
    
    public java.lang.String roomId() {
        return this.roomId;
    }
    
    public java.lang.String senderKey() {
        return this.senderKey;
    }
    
    public java.lang.String sessionId() {
        return this.sessionId;
    }
    public void setAlgorithm(java.lang.String algorithm) {
        this.algorithm = algorithm;
    }
    public void setRoomId(java.lang.String roomId) {
        this.roomId = roomId;
    }
    public void setSenderKey(java.lang.String senderKey) {
        this.senderKey = senderKey;
    }
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof RoomKeyInfo) {
            RoomKeyInfo _uniffiThat = (RoomKeyInfo) _uniffiOther;
            return (
              java.util.Objects.equals(algorithm, _uniffiThat.algorithm) && 
              
              java.util.Objects.equals(roomId, _uniffiThat.roomId) && 
              
              java.util.Objects.equals(senderKey, _uniffiThat.senderKey) && 
              
              java.util.Objects.equals(sessionId, _uniffiThat.sessionId)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(algorithm);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(roomId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(senderKey);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(sessionId);
        return _uniffiHash;
    }

    
    
    

}


