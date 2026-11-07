package uniffi.matrix_sdk_crypto_ffi;

/**
 * The result of a signature verification of a signed JSON object.
 */
public class SignatureVerification {
    /**
     * The result of the signature verification using the public key of our own
     * device.
     */
    private uniffi.matrix_sdk_crypto.SignatureState deviceSignature;
    /**
     * The result of the signature verification using the public key of our own
     * user identity.
     */
    private uniffi.matrix_sdk_crypto.SignatureState userIdentitySignature;
    /**
     * The result of the signature verification using public keys of other
     * devices we own.
     */
    private java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> otherDevicesSignatures;
    /**
     * Is the signed JSON object trusted.
     *
     * This flag tells us if the result has a valid signature from any of the
     * following:
     *
     * * Our own device
     * * Our own user identity, provided the identity is trusted as well
     * * Any of our own devices, provided the device is trusted as well
     */
    private boolean trusted;

    public SignatureVerification(
        uniffi.matrix_sdk_crypto.SignatureState deviceSignature, 
        uniffi.matrix_sdk_crypto.SignatureState userIdentitySignature, 
        java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> otherDevicesSignatures, 
        boolean trusted
    ) {
        
        this.deviceSignature = deviceSignature;
        
        this.userIdentitySignature = userIdentitySignature;
        
        this.otherDevicesSignatures = otherDevicesSignatures;
        
        this.trusted = trusted;
    }
    
    public uniffi.matrix_sdk_crypto.SignatureState deviceSignature() {
        return this.deviceSignature;
    }
    
    public uniffi.matrix_sdk_crypto.SignatureState userIdentitySignature() {
        return this.userIdentitySignature;
    }
    
    public java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> otherDevicesSignatures() {
        return this.otherDevicesSignatures;
    }
    
    public boolean trusted() {
        return this.trusted;
    }
    public void setDeviceSignature(uniffi.matrix_sdk_crypto.SignatureState deviceSignature) {
        this.deviceSignature = deviceSignature;
    }
    public void setUserIdentitySignature(uniffi.matrix_sdk_crypto.SignatureState userIdentitySignature) {
        this.userIdentitySignature = userIdentitySignature;
    }
    public void setOtherDevicesSignatures(java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> otherDevicesSignatures) {
        this.otherDevicesSignatures = otherDevicesSignatures;
    }
    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof SignatureVerification) {
            SignatureVerification _uniffiThat = (SignatureVerification) _uniffiOther;
            return (
              java.util.Objects.equals(deviceSignature, _uniffiThat.deviceSignature) && 
              
              java.util.Objects.equals(userIdentitySignature, _uniffiThat.userIdentitySignature) && 
              
              java.util.Objects.equals(otherDevicesSignatures, _uniffiThat.otherDevicesSignatures) && 
              
              trusted == _uniffiThat.trusted
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(deviceSignature);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(userIdentitySignature);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(otherDevicesSignatures);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(trusted);
        return _uniffiHash;
    }

    
    
    

}


