package uniffi.matrix_sdk_crypto_ffi;

public class DehydratedDevices implements AutoCloseable, DehydratedDevicesInterface {
  protected long handle;
  protected UniffiCleaner.Cleanable cleanable;

  private java.util.concurrent.atomic.AtomicBoolean wasDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
  private java.util.concurrent.atomic.AtomicLong callCounter = new java.util.concurrent.atomic.AtomicLong(1);

  /**
   * Internal constructor to wrap a raw handle from FFI.
   * The UniffiWithHandle marker disambiguates this from other constructors.
   */
  public DehydratedDevices(UniffiWithHandle phantom, long handle) {
    this.handle = handle;
    this.cleanable = UniffiLib.CLEANER.register(this, new UniffiCleanAction(handle));
  }

  /**
   * This constructor can be used to instantiate a fake object. Only used for tests. Any
   * attempt to actually use an object constructed this way will fail as there is no
   * connected Rust object.
   */
  public DehydratedDevices(NoHandle noHandle) {
    this.handle = 0L;
    this.cleanable = null;
  }

  

  @Override
  public synchronized void close() {
    // Only allow a single call to this method.
    // TODO(uniffi): maybe we should log a warning if called more than once?
    if (this.wasDestroyed.compareAndSet(false, true)) {
      // This decrement always matches the initial count of 1 given at creation time.
      if (this.callCounter.decrementAndGet() == 0L) {
        if (cleanable != null) {
          cleanable.clean();
        }
      }
    }
  }

  public <R> R callWithHandle(java.util.function.Function<java.lang.Long, R> block) {
    // Check and increment the call counter, to keep the object alive.
    // This needs a compare-and-set retry loop in case of concurrent updates.
    long c;
    do {
      c = this.callCounter.get();
      if (c == 0L) {
        throw new java.lang.IllegalStateException("DehydratedDevices object has already been destroyed");
      }
      if (c == java.lang.Long.MAX_VALUE) {
        throw new java.lang.IllegalStateException("DehydratedDevices call counter would overflow");
      }
    } while (! this.callCounter.compareAndSet(c, c + 1L));
    // Now we can safely do the method call without the handle being freed concurrently.
    try {
      return block.apply(this.uniffiCloneHandle());
    } finally {
      // This decrement always matches the increment we performed above.
      if (this.callCounter.decrementAndGet() == 0L) {
        if (cleanable != null) {
          cleanable.clean();
        }
      }
    }
  }

  public void callWithHandle(java.util.function.Consumer<java.lang.Long> block) {
    callWithHandle((java.lang.Long uniffiHandle) -> {
      block.accept(uniffiHandle);
      return (java.lang.Void)null;
    });
  }

  private class UniffiCleanAction implements Runnable {
    private final long handle;

    public UniffiCleanAction(long handle) {
      this.handle = handle;
    }

    @Override
    public void run() {
      // If the handle is 0 this is a fake object created with `NoHandle`, don't try to free.
      if (handle != 0L) {
        UniffiHelpers.uniffiRustCall((_allocator, status) -> {
          UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices(handle, status);
          return null;
        });
      }
    }
  }

  long uniffiCloneHandle() {
    return UniffiHelpers.uniffiRustCall((_allocator, status) -> {
      if (handle == 0L) {
        throw new java.lang.NullPointerException();
      }
      return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices(handle, status);
    });
  }

  
    @Override
    public DehydratedDevice create() throws DehydrationException {
            try {
                return FfiConverterTypeDehydratedDevice.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new DehydrationExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create(_uniffiHandle,
            _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DehydrationException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DehydrationException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Deletes the previously stored dehydrated device pickle key.
     */
    @Override
    public void deleteDehydratedDeviceKey() throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key(_uniffiHandle,
            _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (CryptoStoreException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (CryptoStoreException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Get the cached dehydrated device pickle key if any.
     *
     * None if the key was not previously cached (via
     * [`Self::save_dehydrated_device_pickle_key`]).
     *
     * Should be used to periodically rotate the dehydrated device to avoid
     * OTK exhaustion and accumulation of to_device messages.
     */
    @Override
    public DehydratedDeviceKey getDehydratedDeviceKey() throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeDehydratedDeviceKey.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key(_allocator, _uniffiHandle,
            _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (CryptoStoreException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (CryptoStoreException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    @Override
    public RehydratedDevice rehydrate(DehydratedDeviceKey pickleKey, java.lang.String deviceId, java.lang.String deviceData) throws DehydrationException {
            try {
                return FfiConverterTypeRehydratedDevice.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new DehydrationExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate(_uniffiHandle,
            FfiConverterTypeDehydratedDeviceKey.INSTANCE.lower(pickleKey), FfiConverterString.INSTANCE.lower(deviceId), FfiConverterString.INSTANCE.lower(deviceData), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DehydrationException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DehydrationException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Store the dehydrated device pickle key in the crypto store.
     *
     * This is useful if the client wants to periodically rotate dehydrated
     * devices to avoid OTK exhaustion and accumulated to_device problems.
     */
    @Override
    public void saveDehydratedDeviceKey(DehydratedDeviceKey pickleKey) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key(_uniffiHandle,
            FfiConverterTypeDehydratedDeviceKey.INSTANCE.lower(pickleKey), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (CryptoStoreException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (CryptoStoreException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  

  


  
}

