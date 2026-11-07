package uniffi.matrix_sdk_crypto_ffi;

public class DeviceLists {
    private java.util.List<java.lang.String> changed;
    private java.util.List<java.lang.String> left;

    public DeviceLists(
        java.util.List<java.lang.String> changed, 
        java.util.List<java.lang.String> left
    ) {
        
        this.changed = changed;
        
        this.left = left;
    }
    
    public java.util.List<java.lang.String> changed() {
        return this.changed;
    }
    
    public java.util.List<java.lang.String> left() {
        return this.left;
    }
    public void setChanged(java.util.List<java.lang.String> changed) {
        this.changed = changed;
    }
    public void setLeft(java.util.List<java.lang.String> left) {
        this.left = left;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof DeviceLists) {
            DeviceLists _uniffiThat = (DeviceLists) _uniffiOther;
            return (
              java.util.Objects.equals(changed, _uniffiThat.changed) && 
              
              java.util.Objects.equals(left, _uniffiThat.left)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(changed);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(left);
        return _uniffiHash;
    }

    
    
    

}


