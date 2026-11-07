package uniffi.matrix_sdk_crypto_ffi;

/**
 * The private part of the backup key, the one used for recovery.
 */
public class BackupRecoveryKey implements AutoCloseable, BackupRecoveryKeyInterface {
  protected long handle;
  protected UniffiCleaner.Cleanable cleanable;

  private java.util.concurrent.atomic.AtomicBoolean wasDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
  private java.util.concurrent.atomic.AtomicLong callCounter = new java.util.concurrent.atomic.AtomicLong(1);

  /**
   * Internal constructor to wrap a raw handle from FFI.
   * The UniffiWithHandle marker disambiguates this from other constructors.
   */
  public BackupRecoveryKey(UniffiWithHandle phantom, long handle) {
    this.handle = handle;
    this.cleanable = UniffiLib.CLEANER.register(this, new UniffiCleanAction(handle));
  }

  /**
   * This constructor can be used to instantiate a fake object. Only used for tests. Any
   * attempt to actually use an object constructed this way will fail as there is no
   * connected Rust object.
   */
  public BackupRecoveryKey(NoHandle noHandle) {
    this.handle = 0L;
    this.cleanable = null;
  }

  
    /**
     * Create a new random [`BackupRecoveryKey`].
     */
  public BackupRecoveryKey() {
    this(UniffiWithHandle.INSTANCE, (long)
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new(
            _status);
    })
    );
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
        throw new java.lang.IllegalStateException("BackupRecoveryKey object has already been destroyed");
      }
      if (c == java.lang.Long.MAX_VALUE) {
        throw new java.lang.IllegalStateException("BackupRecoveryKey call counter would overflow");
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
          UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey(handle, status);
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
      return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey(handle, status);
    });
  }

  
    /**
     * Try to decrypt a message that was encrypted using the public part of the
     * backup key.
     */
    @Override
    public java.lang.String decryptV1(java.lang.String ephemeralKey, java.lang.String mac, java.lang.String ciphertext) throws PkDecryptionException {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new PkDecryptionExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(ephemeralKey), FfiConverterString.INSTANCE.lower(mac), FfiConverterString.INSTANCE.lower(ciphertext), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (PkDecryptionException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (PkDecryptionException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Get the public part of the backup key.
     */
    @Override
    public MegolmV1BackupKey megolmV1PublicKey()  {
            try {
                return FfiConverterTypeMegolmV1BackupKey.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key(_allocator, _uniffiHandle,
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
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Convert the recovery key to a base 58 encoded string.
     */
    @Override
    public java.lang.String toBase58()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58(_allocator, _uniffiHandle,
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
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Convert the recovery key to a base 64 encoded string.
     */
    @Override
    public java.lang.String toBase64()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64(_allocator, _uniffiHandle,
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
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  

  


  
    /**
     * Try to create a [`BackupRecoveryKey`] from a base 58 encoded string.
     */public static BackupRecoveryKey fromBase58(java.lang.String key) throws DecodeException {
            try {
                return FfiConverterTypeBackupRecoveryKey.INSTANCE.lift(
    UniffiHelpers.uniffiRustCallWithError(new DecodeExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58(
            FfiConverterString.INSTANCE.lower(key), _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DecodeException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DecodeException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Try to create a [`BackupRecoveryKey`] from a base 64 encoded string.
     */public static BackupRecoveryKey fromBase64(java.lang.String key) throws DecodeException {
            try {
                return FfiConverterTypeBackupRecoveryKey.INSTANCE.lift(
    UniffiHelpers.uniffiRustCallWithError(new DecodeExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64(
            FfiConverterString.INSTANCE.lower(key), _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DecodeException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DecodeException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Restore a [`BackupRecoveryKey`] from the given passphrase.
     */public static BackupRecoveryKey fromPassphrase(java.lang.String passphrase, java.lang.String salt, int rounds)  {
            try {
                return FfiConverterTypeBackupRecoveryKey.INSTANCE.lift(
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase(
            FfiConverterString.INSTANCE.lower(passphrase), FfiConverterString.INSTANCE.lower(salt), rounds, _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Create a new [`BackupRecoveryKey`] from the given passphrase.
     */public static BackupRecoveryKey newFromPassphrase(java.lang.String passphrase)  {
            try {
                return FfiConverterTypeBackupRecoveryKey.INSTANCE.lift(
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase(
            FfiConverterString.INSTANCE.lower(passphrase), _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
  
}

