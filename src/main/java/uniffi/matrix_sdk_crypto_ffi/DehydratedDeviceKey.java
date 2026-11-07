package uniffi.matrix_sdk_crypto_ffi;

/**
 * Dehydrated device key
 */
public class DehydratedDeviceKey {
    private byte[] inner;

    public DehydratedDeviceKey(
        byte[] inner
    ) {
        
        this.inner = inner;
    }
    
    public byte[] inner() {
        return this.inner;
    }
    public void setInner(byte[] inner) {
        this.inner = inner;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof DehydratedDeviceKey) {
            DehydratedDeviceKey _uniffiThat = (DehydratedDeviceKey) _uniffiOther;
            return (
              UniffiDeepValue.equals(inner, _uniffiThat.inner)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + UniffiDeepValue.hashCode(inner);
        return _uniffiHash;
    }

    
    
    

}


