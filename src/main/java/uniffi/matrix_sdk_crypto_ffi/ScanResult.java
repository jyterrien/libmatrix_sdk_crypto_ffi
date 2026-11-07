package uniffi.matrix_sdk_crypto_ffi;

/**
 * A result type for scanning QR codes.
 */
public class ScanResult implements AutoCloseable{
    /**
     * The QR code verification object that got created.
     */
    private QrCode qr;
    /**
     * The request that needs to be sent out to notify the other side that a
     * QR code verification should start.
     */
    private OutgoingVerificationRequest request;

    public ScanResult(
        QrCode qr, 
        OutgoingVerificationRequest request
    ) {
        
        this.qr = qr;
        
        this.request = request;
    }
    
    public QrCode qr() {
        return this.qr;
    }
    
    public OutgoingVerificationRequest request() {
        return this.request;
    }
    public void setQr(QrCode qr) {
        this.qr = qr;
    }
    public void setRequest(OutgoingVerificationRequest request) {
        this.request = request;
    }

    
    @Override
    public void close() {
        
    AutoCloseableHelper.close(
        this.qr, 
        this.request);
    }
    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof ScanResult) {
            ScanResult _uniffiThat = (ScanResult) _uniffiOther;
            return (
              java.util.Objects.equals(qr, _uniffiThat.qr) && 
              
              java.util.Objects.equals(request, _uniffiThat.request)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(qr);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(request);
        return _uniffiHash;
    }

    
    
    

}


