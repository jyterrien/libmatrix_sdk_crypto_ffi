package uniffi.matrix_sdk_crypto_ffi;

/**
 * A result type for requesting verifications.
 */
public class RequestVerificationResult implements AutoCloseable{
    /**
     * The verification request object that got created.
     */
    private VerificationRequest verification;
    /**
     * The request that needs to be sent out to notify the other side that
     * we're requesting verification to begin.
     */
    private OutgoingVerificationRequest request;

    public RequestVerificationResult(
        VerificationRequest verification, 
        OutgoingVerificationRequest request
    ) {
        
        this.verification = verification;
        
        this.request = request;
    }
    
    public VerificationRequest verification() {
        return this.verification;
    }
    
    public OutgoingVerificationRequest request() {
        return this.request;
    }
    public void setVerification(VerificationRequest verification) {
        this.verification = verification;
    }
    public void setRequest(OutgoingVerificationRequest request) {
        this.request = request;
    }

    
    @Override
    public void close() {
        
    AutoCloseableHelper.close(
        this.verification, 
        this.request);
    }
    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof RequestVerificationResult) {
            RequestVerificationResult _uniffiThat = (RequestVerificationResult) _uniffiOther;
            return (
              java.util.Objects.equals(verification, _uniffiThat.verification) && 
              
              java.util.Objects.equals(request, _uniffiThat.request)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(verification);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(request);
        return _uniffiHash;
    }

    
    
    

}


