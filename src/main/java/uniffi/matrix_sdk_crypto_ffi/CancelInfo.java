package uniffi.matrix_sdk_crypto_ffi;

/**
 * Information on why a verification flow has been cancelled and by whom.
 */
public class CancelInfo {
    /**
     * The textual representation of the cancel reason
     */
    private java.lang.String reason;
    /**
     * The code describing the cancel reason
     */
    private java.lang.String cancelCode;
    /**
     * Was the verification flow cancelled by us
     */
    private boolean cancelledByUs;

    public CancelInfo(
        java.lang.String reason, 
        java.lang.String cancelCode, 
        boolean cancelledByUs
    ) {
        
        this.reason = reason;
        
        this.cancelCode = cancelCode;
        
        this.cancelledByUs = cancelledByUs;
    }
    
    public java.lang.String reason() {
        return this.reason;
    }
    
    public java.lang.String cancelCode() {
        return this.cancelCode;
    }
    
    public boolean cancelledByUs() {
        return this.cancelledByUs;
    }
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }
    public void setCancelCode(java.lang.String cancelCode) {
        this.cancelCode = cancelCode;
    }
    public void setCancelledByUs(boolean cancelledByUs) {
        this.cancelledByUs = cancelledByUs;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof CancelInfo) {
            CancelInfo _uniffiThat = (CancelInfo) _uniffiOther;
            return (
              java.util.Objects.equals(reason, _uniffiThat.reason) && 
              
              java.util.Objects.equals(cancelCode, _uniffiThat.cancelCode) && 
              
              cancelledByUs == _uniffiThat.cancelledByUs
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(reason);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(cancelCode);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(cancelledByUs);
        return _uniffiHash;
    }

    
    
    

}


