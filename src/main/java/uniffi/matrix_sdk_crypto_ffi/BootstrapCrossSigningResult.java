package uniffi.matrix_sdk_crypto_ffi;

public class BootstrapCrossSigningResult {
    /**
     * Optional request to upload some device keys alongside.
     *
     * Must be sent first if present, and marked with `mark_request_as_sent`.
     */
    private Request uploadKeysRequest;
    /**
     * Request to upload the signing keys. Must be sent second.
     */
    private UploadSigningKeysRequest uploadSigningKeysRequest;
    /**
     * Request to upload the keys signatures, including for the signing keys
     * and optionally for the device keys. Must be sent last.
     */
    private SignatureUploadRequest uploadSignatureRequest;

    public BootstrapCrossSigningResult(
        Request uploadKeysRequest, 
        UploadSigningKeysRequest uploadSigningKeysRequest, 
        SignatureUploadRequest uploadSignatureRequest
    ) {
        
        this.uploadKeysRequest = uploadKeysRequest;
        
        this.uploadSigningKeysRequest = uploadSigningKeysRequest;
        
        this.uploadSignatureRequest = uploadSignatureRequest;
    }
    
    public Request uploadKeysRequest() {
        return this.uploadKeysRequest;
    }
    
    public UploadSigningKeysRequest uploadSigningKeysRequest() {
        return this.uploadSigningKeysRequest;
    }
    
    public SignatureUploadRequest uploadSignatureRequest() {
        return this.uploadSignatureRequest;
    }
    public void setUploadKeysRequest(Request uploadKeysRequest) {
        this.uploadKeysRequest = uploadKeysRequest;
    }
    public void setUploadSigningKeysRequest(UploadSigningKeysRequest uploadSigningKeysRequest) {
        this.uploadSigningKeysRequest = uploadSigningKeysRequest;
    }
    public void setUploadSignatureRequest(SignatureUploadRequest uploadSignatureRequest) {
        this.uploadSignatureRequest = uploadSignatureRequest;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof BootstrapCrossSigningResult) {
            BootstrapCrossSigningResult _uniffiThat = (BootstrapCrossSigningResult) _uniffiOther;
            return (
              java.util.Objects.equals(uploadKeysRequest, _uniffiThat.uploadKeysRequest) && 
              
              java.util.Objects.equals(uploadSigningKeysRequest, _uniffiThat.uploadSigningKeysRequest) && 
              
              java.util.Objects.equals(uploadSignatureRequest, _uniffiThat.uploadSignatureRequest)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(uploadKeysRequest);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(uploadSigningKeysRequest);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(uploadSignatureRequest);
        return _uniffiHash;
    }

    
    
    

}


