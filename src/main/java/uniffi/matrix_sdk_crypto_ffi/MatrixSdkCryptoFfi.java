package uniffi.matrix_sdk_crypto_ffi;


import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
public class MatrixSdkCryptoFfi {
  
    /**
     * Migrate a libolm based setup to a vodozemac based setup stored in a SQLite
     * store.
     *
     * # Arguments
     *
     * * `data` - The data that should be migrated over to the SQLite store.
     *
     * * `path` - The path where the SQLite store should be created.
     *
     * * `passphrase` - The passphrase that should be used to encrypt the data at
     * rest in the SQLite store. **Warning**, if no passphrase is given, the
     * store and all its data will remain unencrypted.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the migration.
     */public static void migrate(MigrationData data, java.lang.String path, java.lang.String passphrase, ProgressListener progressListener) throws MigrationException {
            try {
                
    UniffiHelpers.uniffiRustCallWithError(new MigrationExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_migrate(
            FfiConverterTypeMigrationData.INSTANCE.lower(data), FfiConverterString.INSTANCE.lower(path), FfiConverterOptionalString.INSTANCE.lower(passphrase), FfiConverterTypeProgressListener.INSTANCE.lower(progressListener), _status);
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (MigrationException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (MigrationException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Migrate room settings, including room algorithm and whether to block
     * untrusted devices from legacy store to Sqlite store.
     *
     * Note that this method should only be used if a client has already migrated
     * account data via [migrate](#method.migrate) method, which did not include
     * room settings. For a brand new migration, the [migrate](#method.migrate)
     * method will take care of room settings automatically, if provided.
     *
     * # Arguments
     *
     * * `room_settings` - Map of room settings
     *
     * * `path` - The path where the Sqlite store should be created.
     *
     * * `passphrase` - The passphrase that should be used to encrypt the data at
     * rest in the Sqlite store. **Warning**, if no passphrase is given, the
     * store and all its data will remain unencrypted.
     */public static void migrateRoomSettings(java.util.Map<java.lang.String, RoomSettings> roomSettings, java.lang.String path, java.lang.String passphrase) throws MigrationException {
            try {
                
    UniffiHelpers.uniffiRustCallWithError(new MigrationExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings(
            FfiConverterMapStringTypeRoomSettings.INSTANCE.lower(roomSettings), FfiConverterString.INSTANCE.lower(path), FfiConverterOptionalString.INSTANCE.lower(passphrase), _status);
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (MigrationException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (MigrationException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  
    /**
     * Migrate sessions and group sessions of a libolm based setup to a vodozemac
     * based setup stored in a SQLite store.
     *
     * This method allows you to migrate a subset of the data, it should only be
     * used after the [`migrate()`] method has been already used.
     *
     * # Arguments
     *
     * * `data` - The data that should be migrated over to the SQLite store.
     *
     * * `path` - The path where the SQLite store should be created.
     *
     * * `passphrase` - The passphrase that should be used to encrypt the data at
     * rest in the SQLite store. **Warning**, if no passphrase is given, the
     * store and all its data will remain unencrypted.
     *
     * * `progress_listener` - A callback that can be used to introspect the
     * progress of the migration.
     */public static void migrateSessions(SessionMigrationData data, java.lang.String path, java.lang.String passphrase, ProgressListener progressListener) throws MigrationException {
            try {
                
    UniffiHelpers.uniffiRustCallWithError(new MigrationExceptionErrorHandler(), (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions(
            FfiConverterTypeSessionMigrationData.INSTANCE.lower(data), FfiConverterString.INSTANCE.lower(path), FfiConverterOptionalString.INSTANCE.lower(passphrase), FfiConverterTypeProgressListener.INSTANCE.lower(progressListener), _status);
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                if (MigrationException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (MigrationException)_uniffi_ex.getCause();
                }
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  public static java.lang.String version()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_version(_allocator, 
            _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  public static VersionInfo versionInfo()  {
            try {
                return FfiConverterTypeVersionInfo.INSTANCE.lift(
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_version_info(_allocator, 
            _status);
    })
    );
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

  public static java.lang.String vodozemacVersion()  {
            try {
                return FfiConverterString.INSTANCE.lift(
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        return UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version(_allocator, 
            _status);
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
     * Set the logger that should be used to forward Rust logs over FFI.
     */public static void setLogger(Logger logger)  {
            try {
                
    UniffiHelpers.uniffiRustCall( (_allocator, _status) -> {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger(
            FfiConverterTypeLogger.INSTANCE.lower(logger), _status);
    })
    ;
            } catch (java.lang.RuntimeException _uniffi_ex) {
                
                
                if (InternalException.class.isInstance(_uniffi_ex.getCause())) {
                    throw (InternalException)_uniffi_ex.getCause();
                }
                throw _uniffi_ex;
            }
    }
    

}

