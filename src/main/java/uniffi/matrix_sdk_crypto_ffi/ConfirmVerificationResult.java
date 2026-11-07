package uniffi.matrix_sdk_crypto_ffi;

/**
 * A result type for confirming verifications.
 */
public class ConfirmVerificationResult {
    /**
     * The requests that needs to be sent out to notify the other side that we
     * confirmed the verification.
     */
    private java.util.List<OutgoingVerificationRequest> requests;
    /**
     * A request that will upload signatures of the verified device or user, if
     * the verification is completed and we're able to sign devices or users
     */
    private SignatureUploadRequest signatureRequest;

    public ConfirmVerificationResult(
        java.util.List<OutgoingVerificationRequest> requests, 
        SignatureUploadRequest signatureRequest
    ) {
        
        this.requests = requests;
        
        this.signatureRequest = signatureRequest;
    }
    
    public java.util.List<OutgoingVerificationRequest> requests() {
        return this.requests;
    }
    
    public SignatureUploadRequest signatureRequest() {
        return this.signatureRequest;
    }
    public void setRequests(java.util.List<OutgoingVerificationRequest> requests) {
        this.requests = requests;
    }
    public void setSignatureRequest(SignatureUploadRequest signatureRequest) {
        this.signatureRequest = signatureRequest;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof ConfirmVerificationResult) {
            ConfirmVerificationResult _uniffiThat = (ConfirmVerificationResult) _uniffiOther;
            return (
              java.util.Objects.equals(requests, _uniffiThat.requests) && 
              
              java.util.Objects.equals(signatureRequest, _uniffiThat.signatureRequest)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(requests);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(signatureRequest);
        return _uniffiHash;
    }

    
    
    

}


