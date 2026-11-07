package uniffi.matrix_sdk_crypto_ffi;

public interface DehydratedDevicesInterface {
    public DehydratedDevice create() throws DehydrationException;
    
    /**
     * Deletes the previously stored dehydrated device pickle key.
     */public void deleteDehydratedDeviceKey() throws CryptoStoreException;
    
    /**
     * Get the cached dehydrated device pickle key if any.
     *
     * None if the key was not previously cached (via
     * [`Self::save_dehydrated_device_pickle_key`]).
     *
     * Should be used to periodically rotate the dehydrated device to avoid
     * OTK exhaustion and accumulation of to_device messages.
     */public DehydratedDeviceKey getDehydratedDeviceKey() throws CryptoStoreException;
    public RehydratedDevice rehydrate(DehydratedDeviceKey pickleKey, java.lang.String deviceId, java.lang.String deviceData) throws DehydrationException;
    
    /**
     * Store the dehydrated device pickle key in the crypto store.
     *
     * This is useful if the client wants to periodically rotate dehydrated
     * devices to avoid OTK exhaustion and accumulated to_device problems.
     */public void saveDehydratedDeviceKey(DehydratedDeviceKey pickleKey) throws CryptoStoreException;
    
}

