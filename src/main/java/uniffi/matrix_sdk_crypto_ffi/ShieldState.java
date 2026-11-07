package uniffi.matrix_sdk_crypto_ffi;

/**
 * Take a look at [`matrix_sdk_common::deserialized_responses::ShieldState`]
 * for more info.
 */
public class ShieldState {
    private ShieldColor color;
    private uniffi.matrix_sdk_common.ShieldStateCode code;
    private java.lang.String message;

    public ShieldState(
        ShieldColor color, 
        uniffi.matrix_sdk_common.ShieldStateCode code, 
        java.lang.String message
    ) {
        
        this.color = color;
        
        this.code = code;
        
        this.message = message;
    }
    
    public ShieldColor color() {
        return this.color;
    }
    
    public uniffi.matrix_sdk_common.ShieldStateCode code() {
        return this.code;
    }
    
    public java.lang.String message() {
        return this.message;
    }
    public void setColor(ShieldColor color) {
        this.color = color;
    }
    public void setCode(uniffi.matrix_sdk_common.ShieldStateCode code) {
        this.code = code;
    }
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof ShieldState) {
            ShieldState _uniffiThat = (ShieldState) _uniffiOther;
            return (
              java.util.Objects.equals(color, _uniffiThat.color) && 
              
              java.util.Objects.equals(code, _uniffiThat.code) && 
              
              java.util.Objects.equals(message, _uniffiThat.message)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(color);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(code);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(message);
        return _uniffiHash;
    }

    
    
    

}


