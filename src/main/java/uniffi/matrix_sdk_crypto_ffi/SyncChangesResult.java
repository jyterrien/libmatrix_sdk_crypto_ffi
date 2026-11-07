package uniffi.matrix_sdk_crypto_ffi;

/**
 * The return value for the [`OlmMachine::receive_sync_changes()`] method.
 *
 * Will contain various information about the `/sync` changes the
 * [`OlmMachine`] processed.
 */
public class SyncChangesResult {
    /**
     * The, now possibly decrypted, to-device events the [`OlmMachine`]
     * received, decrypted, and processed.
     */
    private java.util.List<java.lang.String> toDeviceEvents;
    /**
     * Information about the room keys that were extracted out of the to-device
     * events.
     */
    private java.util.List<RoomKeyInfo> roomKeyInfos;

    public SyncChangesResult(
        java.util.List<java.lang.String> toDeviceEvents, 
        java.util.List<RoomKeyInfo> roomKeyInfos
    ) {
        
        this.toDeviceEvents = toDeviceEvents;
        
        this.roomKeyInfos = roomKeyInfos;
    }
    
    public java.util.List<java.lang.String> toDeviceEvents() {
        return this.toDeviceEvents;
    }
    
    public java.util.List<RoomKeyInfo> roomKeyInfos() {
        return this.roomKeyInfos;
    }
    public void setToDeviceEvents(java.util.List<java.lang.String> toDeviceEvents) {
        this.toDeviceEvents = toDeviceEvents;
    }
    public void setRoomKeyInfos(java.util.List<RoomKeyInfo> roomKeyInfos) {
        this.roomKeyInfos = roomKeyInfos;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof SyncChangesResult) {
            SyncChangesResult _uniffiThat = (SyncChangesResult) _uniffiOther;
            return (
              java.util.Objects.equals(toDeviceEvents, _uniffiThat.toDeviceEvents) && 
              
              java.util.Objects.equals(roomKeyInfos, _uniffiThat.roomKeyInfos)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(toDeviceEvents);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(roomKeyInfos);
        return _uniffiHash;
    }

    
    
    

}


