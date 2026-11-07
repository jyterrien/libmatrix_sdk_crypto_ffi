package uniffi.matrix_sdk_crypto_ffi;

/**
 * A pair of outgoing room key requests, both of those are sendToDevice
 * requests.
 */
public class KeyRequestPair {
    /**
     * The optional cancellation, this is None if no previous key request was
     * sent out for this key, thus it doesn't need to be cancelled.
     */
    private Request cancellation;
    /**
     * The actual key request.
     */
    private Request keyRequest;

    public KeyRequestPair(
        Request cancellation, 
        Request keyRequest
    ) {
        
        this.cancellation = cancellation;
        
        this.keyRequest = keyRequest;
    }
    
    public Request cancellation() {
        return this.cancellation;
    }
    
    public Request keyRequest() {
        return this.keyRequest;
    }
    public void setCancellation(Request cancellation) {
        this.cancellation = cancellation;
    }
    public void setKeyRequest(Request keyRequest) {
        this.keyRequest = keyRequest;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof KeyRequestPair) {
            KeyRequestPair _uniffiThat = (KeyRequestPair) _uniffiOther;
            return (
              java.util.Objects.equals(cancellation, _uniffiThat.cancellation) && 
              
              java.util.Objects.equals(keyRequest, _uniffiThat.keyRequest)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(cancellation);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(keyRequest);
        return _uniffiHash;
    }

    
    
    

}


