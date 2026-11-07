package uniffi.matrix_sdk_crypto_ffi;

/**
 * A result type for starting SAS verifications.
 */
public class StartSasResult implements AutoCloseable{
    /**
     * The SAS verification object that got created.
     */
    private Sas sas;
    /**
     * The request that needs to be sent out to notify the other side that a
     * SAS verification should start.
     */
    private OutgoingVerificationRequest request;

    public StartSasResult(
        Sas sas, 
        OutgoingVerificationRequest request
    ) {
        
        this.sas = sas;
        
        this.request = request;
    }
    
    public Sas sas() {
        return this.sas;
    }
    
    public OutgoingVerificationRequest request() {
        return this.request;
    }
    public void setSas(Sas sas) {
        this.sas = sas;
    }
    public void setRequest(OutgoingVerificationRequest request) {
        this.request = request;
    }

    
    @Override
    public void close() {
        
    AutoCloseableHelper.close(
        this.sas, 
        this.request);
    }
    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof StartSasResult) {
            StartSasResult _uniffiThat = (StartSasResult) _uniffiOther;
            return (
              java.util.Objects.equals(sas, _uniffiThat.sas) && 
              
              java.util.Objects.equals(request, _uniffiThat.request)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(sas);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(request);
        return _uniffiHash;
    }

    
    
    

}


