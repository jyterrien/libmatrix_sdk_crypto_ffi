package uniffi.matrix_sdk_crypto_ffi;

public class KeysImportResult {
    /**
     * The number of room keys that were imported.
     */
    private long imported;
    /**
     * The total number of room keys that were found in the export.
     */
    private long total;
    /**
     * The map of keys that were imported.
     *
     * It's a map from room id to a map of the sender key to a list of session
     * ids.
     */
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> keys;

    public KeysImportResult(
        long imported, 
        long total, 
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> keys
    ) {
        
        this.imported = imported;
        
        this.total = total;
        
        this.keys = keys;
    }
    
    public long imported() {
        return this.imported;
    }
    
    public long total() {
        return this.total;
    }
    
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> keys() {
        return this.keys;
    }
    public void setImported(long imported) {
        this.imported = imported;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public void setKeys(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> keys) {
        this.keys = keys;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof KeysImportResult) {
            KeysImportResult _uniffiThat = (KeysImportResult) _uniffiOther;
            return (
              imported == _uniffiThat.imported && 
              
              total == _uniffiThat.total && 
              
              java.util.Objects.equals(keys, _uniffiThat.keys)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(imported);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(total);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(keys);
        return _uniffiHash;
    }

    
    
    

}


