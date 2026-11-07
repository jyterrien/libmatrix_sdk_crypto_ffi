package uniffi.matrix_sdk_crypto_ffi;

public class UploadDehydratedDeviceRequest {
    /**
     * The serialized JSON body of the request.
     */
    private java.lang.String body;

    public UploadDehydratedDeviceRequest(
        java.lang.String body
    ) {
        
        this.body = body;
    }
    
    public java.lang.String body() {
        return this.body;
    }
    public void setBody(java.lang.String body) {
        this.body = body;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof UploadDehydratedDeviceRequest) {
            UploadDehydratedDeviceRequest _uniffiThat = (UploadDehydratedDeviceRequest) _uniffiOther;
            return (
              java.util.Objects.equals(body, _uniffiThat.body)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(body);
        return _uniffiHash;
    }

    
    
    

}


