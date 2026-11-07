package uniffi.matrix_sdk_crypto_ffi;

/**
 * Struct containing info about the way the backup key got derived from a
 * passphrase.
 */
public class PassphraseInfo {
    /**
     * The salt that was used during key derivation.
     */
    private java.lang.String privateKeySalt;
    /**
     * The number of PBKDF rounds that were used for key derivation.
     */
    private int privateKeyIterations;

    public PassphraseInfo(
        java.lang.String privateKeySalt, 
        int privateKeyIterations
    ) {
        
        this.privateKeySalt = privateKeySalt;
        
        this.privateKeyIterations = privateKeyIterations;
    }
    
    public java.lang.String privateKeySalt() {
        return this.privateKeySalt;
    }
    
    public int privateKeyIterations() {
        return this.privateKeyIterations;
    }
    public void setPrivateKeySalt(java.lang.String privateKeySalt) {
        this.privateKeySalt = privateKeySalt;
    }
    public void setPrivateKeyIterations(int privateKeyIterations) {
        this.privateKeyIterations = privateKeyIterations;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof PassphraseInfo) {
            PassphraseInfo _uniffiThat = (PassphraseInfo) _uniffiOther;
            return (
              java.util.Objects.equals(privateKeySalt, _uniffiThat.privateKeySalt) && 
              
              privateKeyIterations == _uniffiThat.privateKeyIterations
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(privateKeySalt);
        _uniffiHash = 31 * _uniffiHash + java.lang.Integer.hashCode(privateKeyIterations);
        return _uniffiHash;
    }

    
    
    

}


