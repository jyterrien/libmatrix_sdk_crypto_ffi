package uniffi.matrix_sdk_crypto_ffi;

/**
 * Struct holding the number of room keys we have.
 */
public class RoomKeyCounts {
    /**
     * The total number of room keys.
     */
    private long total;
    /**
     * The number of backed up room keys.
     */
    private long backedUp;

    public RoomKeyCounts(
        long total, 
        long backedUp
    ) {
        
        this.total = total;
        
        this.backedUp = backedUp;
    }
    
    public long total() {
        return this.total;
    }
    
    public long backedUp() {
        return this.backedUp;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public void setBackedUp(long backedUp) {
        this.backedUp = backedUp;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof RoomKeyCounts) {
            RoomKeyCounts _uniffiThat = (RoomKeyCounts) _uniffiOther;
            return (
              total == _uniffiThat.total && 
              
              backedUp == _uniffiThat.backedUp
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(total);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(backedUp);
        return _uniffiHash;
    }

    
    
    

}


