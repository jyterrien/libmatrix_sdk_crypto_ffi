package uniffi.matrix_sdk_crypto_ffi;

/**
 * The encryption component of PkEncryption support.
 *
 * This struct can be created using a [`Curve25519PublicKey`] corresponding to
 * a `PkDecryption` object, allowing messages to be encrypted for the
 * associated decryption object.
 */
public class PkEncryption implements AutoCloseable, PkEncryptionInterface {
  protected long handle;
  protected UniffiCleaner.Cleanable cleanable;

  private java.util.concurrent.atomic.AtomicBoolean wasDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
  private java.util.concurrent.atomic.AtomicLong callCounter = new java.util.concurrent.atomic.AtomicLong(1);

  /**
   * Internal constructor to wrap a raw handle from FFI.
   * The UniffiWithHandle marker disambiguates this from other constructors.
   */
  public PkEncryption(UniffiWithHandle phantom, long handle) {
    this.handle = handle;
    this.cleanable = UniffiLib.CLEANER.register(this, new UniffiCleanAction(handle));
  }

  /**
   * This constructor can be used to instantiate a fake object. Only used for tests. Any
   * attempt to actually use an object constructed this way will fail as there is no
   * connected Rust object.
   */
  public PkEncryption(NoHandle noHandle) {
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
        throw new java.lang.IllegalStateException("PkEncryption object has already been destroyed");
      }
      if (c == java.lang.Long.MAX_VALUE) {
        throw new java.lang.IllegalStateException("PkEncryption call counter would overflow");
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
          UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption(handle, status);
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
      return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption(handle, status);
    });
  }

  
    /**
     * Encrypt a message using this [`PkEncryption`] object.
     */
    @Override
    public PkMessage encrypt(java.lang.String plaintext)  {
            try {
                return FfiConverterOptionalTypePkMessage.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(plaintext), _status);
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
     * Create a new [`PkEncryption`] object from a `Curve25519PublicKey`
     * encoded as Base64.
     *
     * The public key should come from an existing `PkDecryption` object.
     * Returns a `DecodeError` if the Curve25519 key could not be decoded
     * correctly.
     */public static PkEncryption fromBase64(java.lang.String key) throws DecodeException {
            try {
                return FfiConverterTypePkEncryption.INSTANCE.lift(
    UniffiHelpers.uniffiRustCallWithError(new DecodeExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64(
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
    

  
  
}

