package uniffi.matrix_sdk_crypto_ffi;

/**
 * A high level state machine that handles E2EE for Matrix.
 */
public class OlmMachine implements AutoCloseable, OlmMachineInterface {
  protected long handle;
  protected UniffiCleaner.Cleanable cleanable;

  private java.util.concurrent.atomic.AtomicBoolean wasDestroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
  private java.util.concurrent.atomic.AtomicLong callCounter = new java.util.concurrent.atomic.AtomicLong(1);

  /**
   * Internal constructor to wrap a raw handle from FFI.
   * The UniffiWithHandle marker disambiguates this from other constructors.
   */
  public OlmMachine(UniffiWithHandle phantom, long handle) {
    this.handle = handle;
    this.cleanable = UniffiLib.CLEANER.register(this, new UniffiCleanAction(handle));
  }

  /**
   * This constructor can be used to instantiate a fake object. Only used for tests. Any
   * attempt to actually use an object constructed this way will fail as there is no
   * connected Rust object.
   */
  public OlmMachine(NoHandle noHandle) {
    this.handle = 0L;
    this.cleanable = null;
  }

  
    /**
     * Create a new `OlmMachine`
     *
     * # Arguments
     *
     * * `user_id` - The unique ID of the user that owns this machine.
     *
     * * `device_id` - The unique ID of the device that owns this machine.
     *
     * * `path` - The path where the state of the machine should be persisted.
     *
     * * `passphrase` - The passphrase that should be used to encrypt the data
     * at rest in the crypto store. **Warning**, if no passphrase is given,
     * the store and all its data will remain unencrypted.
     */
  public OlmMachine(java.lang.String userId, java.lang.String deviceId, java.lang.String path, java.lang.String passphrase) throws CryptoStoreException{
    this(UniffiWithHandle.INSTANCE, (long)
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new(
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), FfiConverterString.INSTANCE.lower(path), FfiConverterOptionalString.INSTANCE.lower(passphrase), _status);
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
        throw new java.lang.IllegalStateException("OlmMachine object has already been destroyed");
      }
      if (c == java.lang.Long.MAX_VALUE) {
        throw new java.lang.IllegalStateException("OlmMachine call counter would overflow");
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
          UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine(handle, status);
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
      return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine(handle, status);
    });
  }

  
    /**
     * Are we able to encrypt room keys.
     *
     * This returns true if we have an active `BackupKey` and backup version
     * registered with the state machine.
     */
    @Override
    public boolean backupEnabled()  {
            try {
                return FfiConverterBoolean.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled(_uniffiHandle,
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
     * Encrypt a batch of room keys and return a request that needs to be sent
     * out to backup the room keys.
     */
    @Override
    public Request backupRoomKeys() throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys(_allocator, _uniffiHandle,
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
    

  
    /**
     * Create a new private cross signing identity and create a request to
     * upload the public part of it to the server.
     */
    @Override
    public BootstrapCrossSigningResult bootstrapCrossSigning() throws BootstrapCrossSigningException {
            try {
                return FfiConverterTypeBootstrapCrossSigningResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new BootstrapCrossSigningExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing(_allocator, _uniffiHandle,
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
                
                if (BootstrapCrossSigningException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (BootstrapCrossSigningException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Encrypt the given event with the given type and content for the given
     * device. This method is used to send an event to a specific device.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user who owns the target device.
     * * `device_id` - The ID of the device to which the message will be sent.
     * * `event_type` - The event type.
     * * `content` - The serialized content of the event.
     *
     * # Returns
     * A `Result` containing the request to be sent out if the encryption was
     * successful. If the device is not found, the result will be `Ok(None)`.
     *
     * The caller should ensure that there is an olm session (see
     * `get_missing_sessions`) with the target device before calling this
     * method.
     */
    @Override
    public Request createEncryptedToDeviceRequest(java.lang.String userId, java.lang.String deviceId, java.lang.String eventType, java.lang.String content, uniffi.matrix_sdk_crypto.CollectStrategy shareStrategy) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), FfiConverterString.INSTANCE.lower(eventType), FfiConverterString.INSTANCE.lower(content), uniffi.matrix_sdk_crypto.FfiConverterTypeCollectStrategy.INSTANCE.lower(shareStrategy), _status);
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
    

  
    /**
     * Get the status of the private cross signing keys.
     *
     * This can be used to check which private cross signing keys we have
     * stored locally.
     */
    @Override
    public CrossSigningStatus crossSigningStatus()  {
            try {
                return FfiConverterTypeCrossSigningStatus.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status(_allocator, _uniffiHandle,
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
     * Decrypt the given event that was sent in the given room.
     *
     * # Arguments
     *
     * * `event` - The serialized encrypted version of the event.
     *
     * * `room_id` - The unique id of the room where the event was sent to.
     *
     * * `handle_verification_events` - if the supplied event is a verification
     * event, use it to update the verification state. **Note**: it is
     * recommended to avoid setting this flag to true and use the explicit
     * [`OlmMachine::receive_verification_event`] method instead:
     * verification events sometimes need preparation before we can handle
     * them: see the documentation for
     * [`OlmMachine::receive_verification_event`].
     *
     * * `strict_shields` - If `true`, messages will be decorated with strict
     * warnings (use `false` to match legacy behaviour where unsafe keys have
     * lower severity warnings and unverified identities are not decorated).
     *
     * * `decryption_settings` - The setting for decrypting messages.
     */
    @Override
    public DecryptedEvent decryptRoomEvent(java.lang.String event, java.lang.String roomId, boolean handleVerificationEvents, boolean strictShields, uniffi.matrix_sdk_crypto.DecryptionSettings decryptionSettings) throws DecryptionException {
            try {
                return FfiConverterTypeDecryptedEvent.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new DecryptionExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(event), FfiConverterString.INSTANCE.lower(roomId), FfiConverterBoolean.INSTANCE.lower(handleVerificationEvents), FfiConverterBoolean.INSTANCE.lower(strictShields), uniffi.matrix_sdk_crypto.FfiConverterTypeDecryptionSettings.INSTANCE.lower(decryptionSettings), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DecryptionException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DecryptionException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Manage dehydrated devices.
     */
    @Override
    public DehydratedDevices dehydratedDevices()  {
            try {
                return FfiConverterTypeDehydratedDevices.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices(_uniffiHandle,
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
     * Get the device ID of the device of this `OlmMachine`.
     */
    @Override
    public java.lang.String deviceId()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id(_allocator, _uniffiHandle,
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
     * Disable and reset our backup state.
     *
     * This will remove any pending backup request, remove the backup key and
     * reset the backup state of each room key we have.
     */
    @Override
    public void disableBackup() throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup(_uniffiHandle,
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
     * Discard the currently active room key for the given room if there is
     * one.
     */
    @Override
    public void discardRoomKey(java.lang.String roomId) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), _status);
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
     * Activate the given backup key to be used with the given backup version.
     *
     * **Warning**: The caller needs to make sure that the given `BackupKey` is
     * trusted, otherwise we might be encrypting room keys that a malicious
     * party could decrypt.
     *
     * The [`OlmMachine::verify_backup`] method can be used to so.
     */
    @Override
    public void enableBackupV1(MegolmV1BackupKey key, java.lang.String version) throws DecodeException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new DecodeExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1(_uniffiHandle,
            FfiConverterTypeMegolmV1BackupKey.INSTANCE.lower(key), FfiConverterString.INSTANCE.lower(version), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    ;
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
     * Encrypt the given event with the given type and content for the given
     * room.
     *
     * **Note**: A room key needs to be shared with the group of users that are
     * members in the given room. If this is not done this method will panic.
     *
     * The usual flow to encrypt an event using this state machine is as
     * follows:
     *
     * 1. Get the one-time key claim request to establish 1:1 Olm sessions for
     * the room members of the room we wish to participate in. This is done
     * using the [`get_missing_sessions()`](Self::get_missing_sessions)
     * method. This method call should be locked per call.
     *
     * 2. Share a room key with all the room members using the
     * [`share_room_key()`](Self::share_room_key). This method call should
     * be locked per room.
     *
     * 3. Encrypt the event using this method.
     *
     * 4. Send the encrypted event to the server.
     *
     * After the room key is shared steps 1 and 2 will become noops, unless
     * there's some changes in the room membership or in the list of devices a
     * member has.
     *
     * # Arguments
     *
     * * `room_id` - The unique id of the room where the event will be sent to.
     *
     * * `even_type` - The type of the event.
     *
     * * `content` - The serialized content of the event.
     */
    @Override
    public java.lang.String encrypt(java.lang.String roomId, java.lang.String eventType, java.lang.String content) throws CryptoStoreException {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), FfiConverterString.INSTANCE.lower(eventType), FfiConverterString.INSTANCE.lower(content), _status);
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
    

  
    /**
     * Export all our private cross signing keys.
     *
     * The export will contain the seed for the ed25519 keys as a base64
     * encoded string.
     *
     * This method returns `None` if we don't have any private cross signing
     * keys.
     */
    @Override
    public CrossSigningKeyExport exportCrossSigningKeys() throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeCrossSigningKeyExport.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys(_allocator, _uniffiHandle,
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
    

  
    /**
     * Export all of our room keys.
     *
     * # Arguments
     *
     * * `passphrase` - The passphrase that should be used to encrypt the key
     * export.
     *
     * * `rounds` - The number of rounds that should be used when expanding the
     * passphrase into an key.
     */
    @Override
    public java.lang.String exportRoomKeys(java.lang.String passphrase, int rounds) throws CryptoStoreException {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(passphrase), rounds, _status);
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
    

  
    /**
     * Export all the secrets we have in the store into a serialized
     * SecretsBundle.
     *
     * This method will export all the private cross-signing keys and, if
     * available, the private part of a backup key and its accompanying
     * version.
     *
     * The method will fail if we don't have all three private cross-signing
     * keys available.
     *
     * **Warning**: Only export this and share it with a trusted recipient,
     * i.e. if an existing device is sharing this with a new device.
     */
    @Override
    public java.lang.String exportSecretsBundle() throws SecretsBundleExportException {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new SecretsBundleExportExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle(_allocator, _uniffiHandle,
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
                
                if (SecretsBundleExportException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (SecretsBundleExportException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Get the backup keys we have saved in our crypto store.
     */
    @Override
    public BackupKeys getBackupKeys() throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeBackupKeys.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys(_allocator, _uniffiHandle,
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
    

  
    /**
     * Get a `Device` from the store.
     *
     * # Arguments
     *
     * * `user_id` - The id of the device owner.
     *
     * * `device_id` - The id of the device itself.
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */
    @Override
    public Device getDevice(java.lang.String userId, java.lang.String deviceId, int timeout) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeDevice.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), timeout, _status);
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
    

  
    /**
     * Get a cross signing user identity for the given user ID.
     *
     * # Arguments
     *
     * * `user_id` - The unique id of the user that the identity belongs to
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */
    @Override
    public UserIdentity getIdentity(java.lang.String userId, int timeout) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeUserIdentity.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), timeout, _status);
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
    

  
    /**
     * Generate one-time key claiming requests for all the users we are missing
     * sessions for.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * This method should be called every time before a call to
     * [`share_room_key()`](Self::share_room_key) is made.
     *
     * # Arguments
     *
     * * `users` - The list of users for which we would like to establish 1:1
     * Olm sessions for.
     */
    @Override
    public Request getMissingSessions(java.util.List<java.lang.String> users) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions(_allocator, _uniffiHandle,
            FfiConverterSequenceString.INSTANCE.lower(users), _status);
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
    

  
    /**
     * Check whether there is a global flag to only encrypt messages for
     * trusted devices or for everyone.
     *
     * Note that if the global flag is false, individual rooms may still be
     * encrypting only for trusted devices, depending on the per-room
     * `only_allow_trusted_devices` flag.
     */
    @Override
    public boolean getOnlyAllowTrustedDevices() throws CryptoStoreException {
            try {
                return FfiConverterBoolean.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices(_uniffiHandle,
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
    

  
    /**
     * Get the stored room settings, such as the encryption algorithm or
     * whether to encrypt only for trusted devices.
     *
     * These settings can be modified via
     * [set_room_algorithm()](Self::set_room_algorithm) and
     * [set_room_only_allow_trusted_devices()](Self::set_room_only_allow_trusted_devices)
     * methods.
     */
    @Override
    public RoomSettings getRoomSettings(java.lang.String roomId) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRoomSettings.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), _status);
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
    

  
    /**
     * Get all devices of an user.
     *
     * # Arguments
     *
     * * `user_id` - The id of the device owner.
     *
     * * `timeout` - The time in seconds we should wait before returning if the
     * user's device list has been marked as stale. Passing a 0 as the
     * timeout means that we won't wait at all. **Note**, this assumes that
     * the requests from [`OlmMachine::outgoing_requests`] are being
     * processed and sent out. Namely, this waits for a `/keys/query`
     * response to be received.
     */
    @Override
    public java.util.List<Device> getUserDevices(java.lang.String userId, int timeout) throws CryptoStoreException {
            try {
                return FfiConverterSequenceTypeDevice.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), timeout, _status);
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
    

  
    /**
     * Get a verification flow object for the given user with the given flow
     * id.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification.
     *
     * * `flow_id` - The ID that uniquely identifies the verification flow.
     */
    @Override
    public Verification getVerification(java.lang.String userId, java.lang.String flowId)  {
            try {
                return FfiConverterOptionalTypeVerification.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(flowId), _status);
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
     * Get a verification requests that we share with the given user with the
     * given flow id.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification requests.
     *
     * * `flow_id` - The ID that uniquely identifies the verification flow.
     */
    @Override
    public VerificationRequest getVerificationRequest(java.lang.String userId, java.lang.String flowId)  {
            try {
                return FfiConverterOptionalTypeVerificationRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(flowId), _status);
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
     * Get all the verification requests that we share with the given user.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to fetch the
     * verification requests.
     */
    @Override
    public java.util.List<VerificationRequest> getVerificationRequests(java.lang.String userId)  {
            try {
                return FfiConverterSequenceTypeVerificationRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), _status);
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
     * Get our own identity keys.
     */
    @Override
    public java.util.Map<java.lang.String, java.lang.String> identityKeys()  {
            try {
                return FfiConverterMapStringString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys(_allocator, _uniffiHandle,
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
     * Import our private cross signing keys.
     *
     * The export needs to contain the seed for the ed25519 keys as a base64
     * encoded string.
     */
    @Override
    public void importCrossSigningKeys(CrossSigningKeyExport export) throws SecretImportException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new SecretImportExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys(_uniffiHandle,
            FfiConverterTypeCrossSigningKeyExport.INSTANCE.lower(export), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (SecretImportException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (SecretImportException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Import room keys from the given serialized unencrypted key export.
     *
     * This method is the same as [`OlmMachine::import_room_keys`] but the
     * decryption step is skipped and should be performed by the caller. This
     * should be used if the room keys are coming from the server-side backup,
     * the method will mark all imported room keys as backed up.
     *
     * **Note**: This has been deprecated. Use
     * [`OlmMachine::import_room_keys_from_backup`] instead.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the unencrypted key export.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */
    @Override
    public KeysImportResult importDecryptedRoomKeys(java.lang.String keys, ProgressListener progressListener) throws KeyImportException {
            try {
                return FfiConverterTypeKeysImportResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new KeyImportExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(keys), FfiConverterTypeProgressListener.INSTANCE.lower(progressListener), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (KeyImportException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (KeyImportException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Import room keys from the given serialized key export.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the key export.
     *
     * * `passphrase` - The passphrase that was used to encrypt the key export.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */
    @Override
    public KeysImportResult importRoomKeys(java.lang.String keys, java.lang.String passphrase, ProgressListener progressListener) throws KeyImportException {
            try {
                return FfiConverterTypeKeysImportResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new KeyImportExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(keys), FfiConverterString.INSTANCE.lower(passphrase), FfiConverterTypeProgressListener.INSTANCE.lower(progressListener), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (KeyImportException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (KeyImportException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Import room keys from the given serialized unencrypted key export.
     *
     * This method is the same as [`OlmMachine::import_room_keys`] but the
     * decryption step is skipped and should be performed by the caller. This
     * should be used if the room keys are coming from the server-side backup.
     * The method will mark all imported room keys as backed up.
     *
     * # Arguments
     *
     * * `keys` - The serialized version of the unencrypted key export.
     *
     * * `backup_version` - The version of the backup that these keys came
     * from.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the key import.
     */
    @Override
    public KeysImportResult importRoomKeysFromBackup(java.lang.String keys, java.lang.String backupVersion, ProgressListener progressListener) throws KeyImportException {
            try {
                return FfiConverterTypeKeysImportResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new KeyImportExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(keys), FfiConverterString.INSTANCE.lower(backupVersion), FfiConverterTypeProgressListener.INSTANCE.lower(progressListener), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (KeyImportException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (KeyImportException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Check if a user identity is considered to be verified by us.
     */
    @Override
    public boolean isIdentityVerified(java.lang.String userId) throws CryptoStoreException {
            try {
                return FfiConverterBoolean.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), _status);
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
    

  
    /**
     * Check if the given user is considered to be tracked.
     *
     * A user can be marked for tracking using the
     * [`OlmMachine::update_tracked_users()`] method.
     */
    @Override
    public boolean isUserTracked(java.lang.String userId) throws CryptoStoreException {
            try {
                return FfiConverterBoolean.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), _status);
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
    

  
    /**
     * Mark a request that was sent to the server as sent.
     *
     * # Arguments
     *
     * * `request_id` - The unique ID of the request that was sent out. This
     * needs to be an UUID.
     *
     * * `request_type` - The type of the request that was sent out.
     *
     * * `response_body` - The body of the response that was received.
     */
    @Override
    public void markRequestAsSent(java.lang.String requestId, RequestType requestType, java.lang.String responseBody) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(requestId), FfiConverterTypeRequestType.INSTANCE.lower(requestType), FfiConverterString.INSTANCE.lower(responseBody), _status);
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
     * Get the list of outgoing requests that need to be sent to the
     * homeserver.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * **Note**: This method call should be locked per call.
     */
    @Override
    public java.util.List<Request> outgoingRequests() throws CryptoStoreException {
            try {
                return FfiConverterSequenceTypeRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests(_allocator, _uniffiHandle,
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
    

  
    /**
     * Request missing local secrets from our devices (cross signing private
     * keys, megolm backup). This will ask the sdk to create outgoing
     * request to get the missing secrets.
     *
     * The requests will be processed as soon as `outgoing_requests()` is
     * called to process them.
     */
    @Override
    public boolean queryMissingSecretsFromOtherSessions() throws CryptoStoreException {
            try {
                return FfiConverterBoolean.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions(_uniffiHandle,
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
    

  
    /**
     * Let the state machine know about E2EE related sync changes that we
     * received from the server.
     *
     * This needs to be called after every sync, ideally before processing
     * any other sync changes.
     *
     * # Arguments
     *
     * * `events` - A serialized array of to-device events we received in the
     * current sync response.
     *
     * * `device_changes` - The list of devices that have changed in some way
     * since the previous sync.
     *
     * * `key_counts` - The map of uploaded one-time key types and counts.
     */
    @Override
    public SyncChangesResult receiveSyncChanges(java.lang.String events, DeviceLists deviceChanges, java.util.Map<java.lang.String, java.lang.Integer> keyCounts, java.util.List<java.lang.String> unusedFallbackKeys, java.lang.String nextBatchToken, uniffi.matrix_sdk_crypto.DecryptionSettings decryptionSettings) throws CryptoStoreException {
            try {
                return FfiConverterTypeSyncChangesResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(events), FfiConverterTypeDeviceLists.INSTANCE.lower(deviceChanges), FfiConverterMapStringInteger.INSTANCE.lower(keyCounts), FfiConverterOptionalSequenceString.INSTANCE.lower(unusedFallbackKeys), FfiConverterString.INSTANCE.lower(nextBatchToken), uniffi.matrix_sdk_crypto.FfiConverterTypeDecryptionSettings.INSTANCE.lower(decryptionSettings), _status);
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
    

  
    /**
     * Receive an unencrypted verification event.
     *
     * This method can be used to pass verification events that are happening
     * in unencrypted rooms to the `OlmMachine`.
     *
     * **Note**: This has been deprecated.
     */
    @Override
    public void receiveUnencryptedVerificationEvent(java.lang.String event, java.lang.String roomId) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(event), FfiConverterString.INSTANCE.lower(roomId), _status);
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
     * Receive a verification event.
     *
     * This method can be used to pass verification events that are happening
     * in rooms to the `OlmMachine`. The event should be in the decrypted form.
     *
     * **Note**: If the supplied event is an `m.room.message` event with
     * `msgtype: m.key.verification.request`, then the device information for
     * the sending user must be up-to-date before calling this method
     * (otherwise, the request will be ignored). It is hard to guarantee this
     * is the case, but you can maximize your chances by explicitly making a
     * request to /keys/query for the user's device info, and processing the
     * response with [`OlmMachine::mark_request_as_sent`].
     */
    @Override
    public void receiveVerificationEvent(java.lang.String event, java.lang.String roomId) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(event), FfiConverterString.INSTANCE.lower(roomId), _status);
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
     * Request or re-request a room key that was used to encrypt the given
     * event.
     *
     * # Arguments
     *
     * * `event` - The undecryptable event that we would wish to request a room
     * key for.
     *
     * * `room_id` - The id of the room the event was sent to.
     */
    @Override
    public KeyRequestPair requestRoomKey(java.lang.String event, java.lang.String roomId) throws DecryptionException {
            try {
                return FfiConverterTypeKeyRequestPair.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new DecryptionExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(event), FfiConverterString.INSTANCE.lower(roomId), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (DecryptionException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (DecryptionException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Request a verification flow to begin with our other devices.
     *
     * # Arguments
     *
     * `methods` - The list of verification methods we want to advertise to
     * support.
     */
    @Override
    public RequestVerificationResult requestSelfVerification(java.util.List<java.lang.String> methods) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRequestVerificationResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification(_allocator, _uniffiHandle,
            FfiConverterSequenceString.INSTANCE.lower(methods), _status);
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
    

  
    /**
     * Request a verification flow to begin with the given user in the given
     * room.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `room_id` - The ID of the room that represents a DM with the given
     * user.
     *
     * * `event_id` - The event ID of the `m.key.verification.request` event
     * that we sent out to request the verification to begin. The content for
     * this request can be created using the [verification_request_content()]
     * method.
     *
     * * `methods` - The list of verification methods we advertised as
     * supported in the `m.key.verification.request` event.
     *
     * [verification_request_content()]: Self::verification_request_content
     */
    @Override
    public VerificationRequest requestVerification(java.lang.String userId, java.lang.String roomId, java.lang.String eventId, java.util.List<java.lang.String> methods) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeVerificationRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(roomId), FfiConverterString.INSTANCE.lower(eventId), FfiConverterSequenceString.INSTANCE.lower(methods), _status);
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
    

  
    /**
     * Request a verification flow to begin with the given user's device.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `device_id` - The ID of the device that we wish to verify.
     *
     * * `methods` - The list of verification methods we advertised as
     * supported in the `m.key.verification.request` event.
     */
    @Override
    public RequestVerificationResult requestVerificationWithDevice(java.lang.String userId, java.lang.String deviceId, java.util.List<java.lang.String> methods) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeRequestVerificationResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), FfiConverterSequenceString.INSTANCE.lower(methods), _status);
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
    

  
    /**
     * Get the number of backed up room keys and the total number of room keys.
     */
    @Override
    public RoomKeyCounts roomKeyCounts() throws CryptoStoreException {
            try {
                return FfiConverterTypeRoomKeyCounts.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts(_allocator, _uniffiHandle,
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
    

  
    /**
     * Store the recovery key in the crypto store.
     *
     * This is useful if the client wants to support gossiping of the backup
     * key.
     */
    @Override
    public void saveRecoveryKey(BackupRecoveryKey key, java.lang.String version) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key(_uniffiHandle,
            FfiConverterOptionalTypeBackupRecoveryKey.INSTANCE.lower(key), FfiConverterOptionalString.INSTANCE.lower(version), _status);
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
     * Set local trust state for the device of the given user without creating
     * or uploading any signatures if verified
     */
    @Override
    public void setLocalTrust(java.lang.String userId, java.lang.String deviceId, uniffi.matrix_sdk_crypto.LocalTrust trustState) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), uniffi.matrix_sdk_crypto.FfiConverterTypeLocalTrust.INSTANCE.lower(trustState), _status);
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
     * Set global flag whether to encrypt messages for untrusted devices, or
     * whether they should be excluded from the conversation.
     *
     * Note that if enabled, it will override any per-room settings.
     */
    @Override
    public void setOnlyAllowTrustedDevices(boolean onlyAllowTrustedDevices) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices(_uniffiHandle,
            FfiConverterBoolean.INSTANCE.lower(onlyAllowTrustedDevices), _status);
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
     * Set the room algorithm used for encrypting messages to one of the
     * available variants
     */
    @Override
    public void setRoomAlgorithm(java.lang.String roomId, EventEncryptionAlgorithm algorithm) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.lower(algorithm), _status);
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
     * Set flag whether this room should encrypt messages for untrusted
     * devices, or whether they should be excluded from the conversation.
     *
     * Note that per-room setting may be overridden by a global
     * [set_only_allow_trusted_devices()](Self::set_only_allow_trusted_devices)
     * method.
     */
    @Override
    public void setRoomOnlyAllowTrustedDevices(java.lang.String roomId, boolean onlyAllowTrustedDevices) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices(_uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), FfiConverterBoolean.INSTANCE.lower(onlyAllowTrustedDevices), _status);
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
     * Share a room key with the given list of users for the given room.
     *
     * After the request was sent out and a successful response was received
     * the response body should be passed back to the state machine using the
     * [mark_request_as_sent()](Self::mark_request_as_sent) method.
     *
     * This method should be called every time before a call to
     * [`encrypt()`](Self::encrypt) with the given `room_id` is made.
     *
     * # Arguments
     *
     * * `room_id` - The unique id of the room, note that this doesn't strictly
     * need to be a Matrix room, it just needs to be an unique identifier for
     * the group that will participate in the conversation.
     *
     * * `users` - The list of users which are considered to be members of the
     * room and should receive the room key.
     *
     * * `settings` - The settings that should be used for the room key.
     */
    @Override
    public java.util.List<Request> shareRoomKey(java.lang.String roomId, java.util.List<java.lang.String> users, EncryptionSettings settings) throws CryptoStoreException {
            try {
                return FfiConverterSequenceTypeRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(roomId), FfiConverterSequenceString.INSTANCE.lower(users), FfiConverterTypeEncryptionSettings.INSTANCE.lower(settings), _status);
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
    

  
    /**
     * Sign the given message using our device key and if available cross
     * signing master key.
     */
    @Override
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> sign(java.lang.String message) throws CryptoStoreException {
            try {
                return FfiConverterMapStringMapStringString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(message), _status);
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
    

  
    /**
     * Start short auth string verification with a device without going
     * through a verification request first.
     *
     * **Note**: This has been largely deprecated and the
     * [request_verification_with_device()] method should be used instead.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to start the
     * SAS verification.
     *
     * * `device_id` - The ID of device we would like to verify.
     *
     * [request_verification_with_device()]: Self::request_verification_with_device
     */
    @Override
    public StartSasResult startSasWithDevice(java.lang.String userId, java.lang.String deviceId) throws CryptoStoreException {
            try {
                return FfiConverterOptionalTypeStartSasResult.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), _status);
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
    

  
    /**
     * Add the given list of users to be tracked, triggering a key query
     * request for them.
     *
     * The OlmMachine maintains a list of users whose devices we are keeping
     * track of: these are known as "tracked users". These must be users
     * that we share a room with, so that the server sends us updates for
     * their device lists.
     *
     * *Note*: Only users that aren't already tracked will be considered for an
     * update. It's safe to call this with already tracked users, it won't
     * result in excessive `/keys/query` requests.
     *
     * # Arguments
     *
     * `users` - The users that should be queued up for a key query.
     */
    @Override
    public void updateTrackedUsers(java.util.List<java.lang.String> users) throws CryptoStoreException {
            try {
                
    callWithHandle(_uniffiHandle -> {
        try {
    
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users(_uniffiHandle,
            FfiConverterSequenceString.INSTANCE.lower(users), _status);
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
     * Get the user ID of the owner of this `OlmMachine`.
     */
    @Override
    public java.lang.String userId()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id(_allocator, _uniffiHandle,
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
     * Get an m.key.verification.request content for the given user.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user which we would like to request to
     * verify.
     *
     * * `methods` - The list of verification methods we want to advertise to
     * support.
     */
    @Override
    public java.lang.String verificationRequestContent(java.lang.String userId, java.util.List<java.lang.String> methods) throws CryptoStoreException {
            try {
                return FfiConverterOptionalString.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterSequenceString.INSTANCE.lower(methods), _status);
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
    

  
    /**
     * Check if the given backup has been verified by us or by another of our
     * devices that we trust.
     *
     * The `backup_info` should be a JSON encoded object with the following
     * format:
     *
     * ```json
     * {
     * "algorithm": "m.megolm_backup.v1.curve25519-aes-sha2",
     * "auth_data": {
     * "public_key":"XjhWTCjW7l59pbfx9tlCBQolfnIQWARoKOzjTOPSlWM",
     * "signatures": {}
     * }
     * }
     * ```
     */
    @Override
    public SignatureVerification verifyBackup(java.lang.String backupInfo) throws CryptoStoreException {
            try {
                return FfiConverterTypeSignatureVerification.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new CryptoStoreExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(backupInfo), _status);
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
    

  
    /**
     * Manually verify the device of the given user with the given device ID.
     *
     * This method will attempt to sign the device using our private cross
     * signing key.
     *
     * This method will always fail if the device belongs to someone else, we
     * can only sign our own devices.
     *
     * It can also fail if we don't have the private part of our self-signing
     * key.
     *
     * Returns a request that needs to be sent out for the device to be marked
     * as verified.
     */
    @Override
    public SignatureUploadRequest verifyDevice(java.lang.String userId, java.lang.String deviceId) throws SignatureException {
            try {
                return FfiConverterTypeSignatureUploadRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new SignatureExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), FfiConverterString.INSTANCE.lower(deviceId), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (SignatureException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (SignatureException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Manually the user with the given user ID.
     *
     * This method will attempt to sign the user identity using either our
     * private cross signing key, for other user identities, or our device keys
     * for our own user identity.
     *
     * This method can fail if we don't have the private part of our
     * user-signing key.
     *
     * Returns a request that needs to be sent out for the user identity to be
     * marked as verified.
     */
    @Override
    public SignatureUploadRequest verifyIdentity(java.lang.String userId) throws SignatureException {
            try {
                return FfiConverterTypeSignatureUploadRequest.INSTANCE.lift(
    callWithHandle(_uniffiHandle -> {
        try {
    
            return
    UniffiHelpers.uniffiRustCallWithError(new SignatureExceptionErrorHandler(), (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity(_allocator, _uniffiHandle,
            FfiConverterString.INSTANCE.lower(userId), _status);
    });
    } catch (java.lang.RuntimeException _uniffi_ex) {
            throw _uniffi_ex;
        } catch (java.lang.Exception _uniffi_ex) {
            throw new java.lang.RuntimeException(_uniffi_ex);
        }
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (SignatureException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (SignatureException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  

  


  
}

