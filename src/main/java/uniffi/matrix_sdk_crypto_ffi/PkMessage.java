package uniffi.matrix_sdk_crypto_ffi;

/**
 * A message that was encrypted using a [`PkEncryption`] object.
 */
public class PkMessage {
    /**
     * The ciphertext of the message.
     */
    private java.lang.String ciphertext;
    /**
     * The message authentication code of the message.
     *
     * *Warning*: This does not authenticate the ciphertext.
     */
    private java.lang.String mac;
    /**
     * The ephemeral Curve25519 key of the message which was used to derive the
     * individual message key.
     */
    private java.lang.String ephemeralKey;

    public PkMessage(
        java.lang.String ciphertext, 
        java.lang.String mac, 
        java.lang.String ephemeralKey
    ) {
        
        this.ciphertext = ciphertext;
        
        this.mac = mac;
        
        this.ephemeralKey = ephemeralKey;
    }
    
    public java.lang.String ciphertext() {
        return this.ciphertext;
    }
    
    public java.lang.String mac() {
        return this.mac;
    }
    
    public java.lang.String ephemeralKey() {
        return this.ephemeralKey;
    }
    public void setCiphertext(java.lang.String ciphertext) {
        this.ciphertext = ciphertext;
    }
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }
    public void setEphemeralKey(java.lang.String ephemeralKey) {
        this.ephemeralKey = ephemeralKey;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof PkMessage) {
            PkMessage _uniffiThat = (PkMessage) _uniffiOther;
            return (
              java.util.Objects.equals(ciphertext, _uniffiThat.ciphertext) && 
              
              java.util.Objects.equals(mac, _uniffiThat.mac) && 
              
              java.util.Objects.equals(ephemeralKey, _uniffiThat.ephemeralKey)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(ciphertext);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(mac);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(ephemeralKey);
        return _uniffiHash;
    }

    
    
    

}


