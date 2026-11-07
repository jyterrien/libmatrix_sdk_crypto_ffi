package uniffi.matrix_sdk_crypto_ffi;

/**
 * An E2EE capable Matrix device.
 */
public class Device {
    /**
     * The device owner.
     */
    private java.lang.String userId;
    /**
     * The unique ID of the device.
     */
    private java.lang.String deviceId;
    /**
     * The published public identity keys of the devices
     *
     * A map from the key type (e.g. curve25519) to the base64 encoded key.
     */
    private java.util.Map<java.lang.String, java.lang.String> keys;
    /**
     * The supported algorithms of the device.
     */
    private java.util.List<java.lang.String> algorithms;
    /**
     * The human readable name of the device.
     */
    private java.lang.String displayName;
    /**
     * A flag indicating if the device has been blocked, blocked devices don't
     * receive any room keys from us.
     */
    private boolean isBlocked;
    /**
     * Is the device locally trusted
     */
    private boolean locallyTrusted;
    /**
     * Is our cross signing identity trusted and does the identity trust the
     * device.
     */
    private boolean crossSigningTrusted;
    /**
     * The first time this device was seen in local timestamp, milliseconds
     * since epoch.
     */
    private long firstTimeSeenTs;
    /**
     * Whether or not the device is a dehydrated device.
     */
    private boolean dehydrated;

    public Device(
        java.lang.String userId, 
        java.lang.String deviceId, 
        java.util.Map<java.lang.String, java.lang.String> keys, 
        java.util.List<java.lang.String> algorithms, 
        java.lang.String displayName, 
        boolean isBlocked, 
        boolean locallyTrusted, 
        boolean crossSigningTrusted, 
        long firstTimeSeenTs, 
        boolean dehydrated
    ) {
        
        this.userId = userId;
        
        this.deviceId = deviceId;
        
        this.keys = keys;
        
        this.algorithms = algorithms;
        
        this.displayName = displayName;
        
        this.isBlocked = isBlocked;
        
        this.locallyTrusted = locallyTrusted;
        
        this.crossSigningTrusted = crossSigningTrusted;
        
        this.firstTimeSeenTs = firstTimeSeenTs;
        
        this.dehydrated = dehydrated;
    }
    
    public java.lang.String userId() {
        return this.userId;
    }
    
    public java.lang.String deviceId() {
        return this.deviceId;
    }
    
    public java.util.Map<java.lang.String, java.lang.String> keys() {
        return this.keys;
    }
    
    public java.util.List<java.lang.String> algorithms() {
        return this.algorithms;
    }
    
    public java.lang.String displayName() {
        return this.displayName;
    }
    
    public boolean isBlocked() {
        return this.isBlocked;
    }
    
    public boolean locallyTrusted() {
        return this.locallyTrusted;
    }
    
    public boolean crossSigningTrusted() {
        return this.crossSigningTrusted;
    }
    
    public long firstTimeSeenTs() {
        return this.firstTimeSeenTs;
    }
    
    public boolean dehydrated() {
        return this.dehydrated;
    }
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }
    public void setKeys(java.util.Map<java.lang.String, java.lang.String> keys) {
        this.keys = keys;
    }
    public void setAlgorithms(java.util.List<java.lang.String> algorithms) {
        this.algorithms = algorithms;
    }
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }
    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
    public void setLocallyTrusted(boolean locallyTrusted) {
        this.locallyTrusted = locallyTrusted;
    }
    public void setCrossSigningTrusted(boolean crossSigningTrusted) {
        this.crossSigningTrusted = crossSigningTrusted;
    }
    public void setFirstTimeSeenTs(long firstTimeSeenTs) {
        this.firstTimeSeenTs = firstTimeSeenTs;
    }
    public void setDehydrated(boolean dehydrated) {
        this.dehydrated = dehydrated;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof Device) {
            Device _uniffiThat = (Device) _uniffiOther;
            return (
              java.util.Objects.equals(userId, _uniffiThat.userId) && 
              
              java.util.Objects.equals(deviceId, _uniffiThat.deviceId) && 
              
              java.util.Objects.equals(keys, _uniffiThat.keys) && 
              
              java.util.Objects.equals(algorithms, _uniffiThat.algorithms) && 
              
              java.util.Objects.equals(displayName, _uniffiThat.displayName) && 
              
              isBlocked == _uniffiThat.isBlocked && 
              
              locallyTrusted == _uniffiThat.locallyTrusted && 
              
              crossSigningTrusted == _uniffiThat.crossSigningTrusted && 
              
              firstTimeSeenTs == _uniffiThat.firstTimeSeenTs && 
              
              dehydrated == _uniffiThat.dehydrated
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(userId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(deviceId);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(keys);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(algorithms);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(displayName);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(isBlocked);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(locallyTrusted);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(crossSigningTrusted);
        _uniffiHash = 31 * _uniffiHash + java.lang.Long.hashCode(firstTimeSeenTs);
        _uniffiHash = 31 * _uniffiHash + java.lang.Boolean.hashCode(dehydrated);
        return _uniffiHash;
    }

    
    
    

}


