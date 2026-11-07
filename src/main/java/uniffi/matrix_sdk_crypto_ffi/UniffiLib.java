package uniffi.matrix_sdk_crypto_ffi;


// FFM-based library binding. Each FFI function gets a MethodHandle and a wrapper method.
final class UniffiLib {
    private static final java.lang.foreign.Linker LINKER = java.lang.foreign.Linker.nativeLinker();
    private static final java.lang.foreign.SymbolLookup SYMBOLS;

    
    // The Cleaner for the whole library
    static UniffiCleaner CLEANER;

    static {
        SYMBOLS = NamespaceLibrary.loadLibrary();
    }

    private static java.lang.invoke.MethodHandle findDowncallHandle(String name, java.lang.foreign.FunctionDescriptor descriptor) {
        return SYMBOLS.find(name)
            .map(s -> LINKER.downcallHandle(s, descriptor))
            .orElseThrow(() -> new RuntimeException("Missing FFI symbol: " + name));
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_backupkeys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_backupkeys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_backupkeys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_backupkeys(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_backupkeys.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_backupkeys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_backupkeys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_backupkeys", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_backupkeys(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_backupkeys.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_backup_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_backup_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_backup_version", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_backup_version(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_backup_version.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_recovery_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_recovery_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_recovery_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_recovery_key(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backupkeys_recovery_key.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_pkencryption.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_pkencryption.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_pkencryption_from_base64.invokeExact(key, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment plaintext, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_pkencryption_encrypt.invokeExact(_allocator, ptr, plaintext, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_backuprecoverykey.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_backuprecoverykey.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base58.invokeExact(key, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_base64.invokeExact(key, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase(java.lang.foreign.MemorySegment passphrase, java.lang.foreign.MemorySegment salt, int rounds, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_from_passphrase.invokeExact(passphrase, salt, rounds, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new(java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new.invokeExact(_uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase(java.lang.foreign.MemorySegment passphrase, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_backuprecoverykey_new_from_passphrase.invokeExact(passphrase, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment ephemeralKey, java.lang.foreign.MemorySegment mac, java.lang.foreign.MemorySegment ciphertext, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_decrypt_v1.invokeExact(_allocator, ptr, ephemeralKey, mac, ciphertext, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_megolm_v1_public_key.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base58.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_backuprecoverykey_to_base64.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevice
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevice = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevice", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevice(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevice.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevice
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevice = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevice", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevice(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevice.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevice_keys_for_upload
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevice_keys_for_upload = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevice_keys_for_upload", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevice_keys_for_upload(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment deviceDisplayName, java.lang.foreign.MemorySegment pickleKey, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevice_keys_for_upload.invokeExact(_allocator, ptr, deviceDisplayName, pickleKey, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_dehydrateddevices.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_dehydrateddevices.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_create.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_delete_dehydrated_device_key.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_get_dehydrated_device_key.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate(long ptr, java.lang.foreign.MemorySegment pickleKey, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment deviceData, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_rehydrate.invokeExact(ptr, pickleKey, deviceId, deviceData, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key(long ptr, java.lang.foreign.MemorySegment pickleKey, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_dehydrateddevices_save_dehydrated_device_key.invokeExact(ptr, pickleKey, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_rehydrateddevice
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_rehydrateddevice = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_rehydrateddevice", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_rehydrateddevice(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_rehydrateddevice.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_rehydrateddevice
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_rehydrateddevice = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_rehydrateddevice", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_rehydrateddevice(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_rehydrateddevice.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_rehydrateddevice_receive_events
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_rehydrateddevice_receive_events = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_rehydrateddevice_receive_events", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_rehydrateddevice_receive_events(long ptr, java.lang.foreign.MemorySegment events, java.lang.foreign.MemorySegment decryptionSettings, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_rehydrateddevice_receive_events.invokeExact(ptr, events, decryptionSettings, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_olmmachine.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_olmmachine.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new(java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment passphrase, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_constructor_olmmachine_new.invokeExact(userId, deviceId, path, passphrase, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_enabled.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_backup_room_keys.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_bootstrap_cross_signing.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment eventType, java.lang.foreign.MemorySegment content, java.lang.foreign.MemorySegment shareStrategy, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_create_encrypted_to_device_request.invokeExact(_allocator, ptr, userId, deviceId, eventType, content, shareStrategy, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_cross_signing_status.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_BYTE, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment roomId, byte handleVerificationEvents, byte strictShields, java.lang.foreign.MemorySegment decryptionSettings, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_decrypt_room_event.invokeExact(_allocator, ptr, event, roomId, handleVerificationEvents, strictShields, decryptionSettings, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_dehydrated_devices.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_device_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_disable_backup.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key(long ptr, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_discard_room_key.invokeExact(ptr, roomId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1(long ptr, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_enable_backup_v1.invokeExact(ptr, key, version, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment eventType, java.lang.foreign.MemorySegment content, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_encrypt.invokeExact(_allocator, ptr, roomId, eventType, content, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_cross_signing_keys.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment passphrase, int rounds, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_room_keys.invokeExact(_allocator, ptr, passphrase, rounds, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_export_secrets_bundle.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_backup_keys.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, int timeout, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_device.invokeExact(_allocator, ptr, userId, deviceId, timeout, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, int timeout, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_identity.invokeExact(_allocator, ptr, userId, timeout, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment users, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_missing_sessions.invokeExact(_allocator, ptr, users, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_only_allow_trusted_devices.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_room_settings.invokeExact(_allocator, ptr, roomId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, int timeout, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_user_devices.invokeExact(_allocator, ptr, userId, timeout, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment flowId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification.invokeExact(_allocator, ptr, userId, flowId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment flowId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_request.invokeExact(_allocator, ptr, userId, flowId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_get_verification_requests.invokeExact(_allocator, ptr, userId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_identity_keys.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys(long ptr, java.lang.foreign.MemorySegment export, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_cross_signing_keys.invokeExact(ptr, export, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment keys, long progressListener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_decrypted_room_keys.invokeExact(_allocator, ptr, keys, progressListener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment keys, java.lang.foreign.MemorySegment passphrase, long progressListener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys.invokeExact(_allocator, ptr, keys, passphrase, progressListener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment keys, java.lang.foreign.MemorySegment backupVersion, long progressListener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_import_room_keys_from_backup.invokeExact(_allocator, ptr, keys, backupVersion, progressListener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified(long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_identity_verified.invokeExact(ptr, userId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked(long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_is_user_tracked.invokeExact(ptr, userId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent(long ptr, java.lang.foreign.MemorySegment requestId, java.lang.foreign.MemorySegment requestType, java.lang.foreign.MemorySegment responseBody, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_mark_request_as_sent.invokeExact(ptr, requestId, requestType, responseBody, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_outgoing_requests.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_query_missing_secrets_from_other_sessions.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment events, java.lang.foreign.MemorySegment deviceChanges, java.lang.foreign.MemorySegment keyCounts, java.lang.foreign.MemorySegment unusedFallbackKeys, java.lang.foreign.MemorySegment nextBatchToken, java.lang.foreign.MemorySegment decryptionSettings, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_sync_changes.invokeExact(_allocator, ptr, events, deviceChanges, keyCounts, unusedFallbackKeys, nextBatchToken, decryptionSettings, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event(long ptr, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_unencrypted_verification_event.invokeExact(ptr, event, roomId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event(long ptr, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_receive_verification_event.invokeExact(ptr, event, roomId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_room_key.invokeExact(_allocator, ptr, event, roomId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment methods, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_self_verification.invokeExact(_allocator, ptr, methods, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment eventId, java.lang.foreign.MemorySegment methods, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification.invokeExact(_allocator, ptr, userId, roomId, eventId, methods, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment methods, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_request_verification_with_device.invokeExact(_allocator, ptr, userId, deviceId, methods, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_room_key_counts.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key(long ptr, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_save_recovery_key.invokeExact(ptr, key, version, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust(long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment trustState, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_local_trust.invokeExact(ptr, userId, deviceId, trustState, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices(long ptr, byte onlyAllowTrustedDevices, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_only_allow_trusted_devices.invokeExact(ptr, onlyAllowTrustedDevices, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm(long ptr, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment algorithm, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_algorithm.invokeExact(ptr, roomId, algorithm, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices(long ptr, java.lang.foreign.MemorySegment roomId, byte onlyAllowTrustedDevices, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_set_room_only_allow_trusted_devices.invokeExact(ptr, roomId, onlyAllowTrustedDevices, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment roomId, java.lang.foreign.MemorySegment users, java.lang.foreign.MemorySegment settings, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_share_room_key.invokeExact(_allocator, ptr, roomId, users, settings, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment message, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_sign.invokeExact(_allocator, ptr, message, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_start_sas_with_device.invokeExact(_allocator, ptr, userId, deviceId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users(long ptr, java.lang.foreign.MemorySegment users, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_update_tracked_users.invokeExact(ptr, users, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_user_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment methods, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verification_request_content.invokeExact(_allocator, ptr, userId, methods, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment backupInfo, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_backup.invokeExact(_allocator, ptr, backupInfo, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment deviceId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_device.invokeExact(_allocator, ptr, userId, deviceId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment userId, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_olmmachine_verify_identity.invokeExact(_allocator, ptr, userId, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_qrcode
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_qrcode = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_qrcode", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_qrcode(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_qrcode.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_qrcode
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_qrcode = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_qrcode", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_qrcode(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_qrcode.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment cancelCode, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel.invokeExact(_allocator, ptr, cancelCode, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel_info", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel_info(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_cancel_info.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_confirm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_confirm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_confirm", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_confirm(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_confirm.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_flow_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_flow_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_flow_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_generate_qr_code
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_generate_qr_code = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_generate_qr_code", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_generate_qr_code(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_generate_qr_code.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_has_been_scanned
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_has_been_scanned = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_has_been_scanned", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_has_been_scanned(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_has_been_scanned.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_cancelled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_cancelled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_cancelled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_cancelled(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_cancelled.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_done(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_is_done.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_device_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_device_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_device_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_user_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_user_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_other_user_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_reciprocated
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_reciprocated = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_reciprocated", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_reciprocated(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_reciprocated.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_room_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_room_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_room_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_set_changes_listener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_set_changes_listener(long ptr, long listener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_set_changes_listener.invokeExact(ptr, listener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_state", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_state(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_state.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_we_started(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_qrcode_we_started.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_sas
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_sas = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_sas", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_sas(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_sas.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_sas
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_sas = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_sas", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_sas(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_sas.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_accept
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_accept = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_accept", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_accept(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_accept.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_cancel", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_cancel(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment cancelCode, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_cancel.invokeExact(_allocator, ptr, cancelCode, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_confirm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_confirm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_confirm", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_confirm(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_confirm.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_flow_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_flow_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_flow_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_decimals
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_decimals = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_decimals", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_decimals(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_decimals.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_emoji_indices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_emoji_indices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_emoji_indices", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_emoji_indices(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_get_emoji_indices.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_sas_is_done(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_is_done.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_device_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_device_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_device_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_user_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_user_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_other_user_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_room_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_room_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_room_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_set_changes_listener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_sas_set_changes_listener(long ptr, long listener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_set_changes_listener.invokeExact(ptr, listener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_state", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_sas_state(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_state.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_sas_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_sas_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_sas_we_started(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_sas_we_started.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_verification(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_verification.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_verification", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_verification(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_verification.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_qr
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_qr = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_qr", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_qr(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_qr.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_sas
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_sas = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_sas", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_sas(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verification_as_sas.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_clone_verificationrequest
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_verificationrequest = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_clone_verificationrequest", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long uniffi_matrix_sdk_crypto_ffi_fn_clone_verificationrequest(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_uniffi_matrix_sdk_crypto_ffi_fn_clone_verificationrequest.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_free_verificationrequest
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_free_verificationrequest = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_free_verificationrequest", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_free_verificationrequest(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_free_verificationrequest.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_accept
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_accept = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_accept", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_accept(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment methods, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_accept.invokeExact(_allocator, ptr, methods, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel_info", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel_info(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_cancel_info.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_flow_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_flow_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_flow_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_cancelled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_cancelled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_cancelled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_cancelled(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_cancelled.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_done(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_done.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_passive
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_passive = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_passive", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_passive(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_passive.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_ready
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_ready = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_ready", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_ready(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_is_ready.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_device_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_device_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_device_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_user_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_user_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_other_user_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_our_supported_methods
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_our_supported_methods = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_our_supported_methods", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_our_supported_methods(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_our_supported_methods.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_room_id", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_room_id(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_room_id.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_scan_qr_code
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_scan_qr_code = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_scan_qr_code", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_scan_qr_code(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment data, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_scan_qr_code.invokeExact(_allocator, ptr, data, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_set_changes_listener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_set_changes_listener(long ptr, long listener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_set_changes_listener.invokeExact(ptr, listener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_qr_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_qr_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_qr_verification", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_qr_verification(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_qr_verification.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_sas_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_sas_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_sas_verification", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_sas_verification(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_start_sas_verification.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_state", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_state(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_state.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_their_supported_methods
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_their_supported_methods = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_their_supported_methods", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_their_supported_methods(java.lang.foreign.SegmentAllocator _allocator, long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_their_supported_methods.invokeExact(_allocator, ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_we_started(long ptr, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_uniffi_matrix_sdk_crypto_ffi_fn_method_verificationrequest_we_started.invokeExact(ptr, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener(java.lang.foreign.MemorySegment vtable) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener.invokeExact(vtable);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger(java.lang.foreign.MemorySegment vtable) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger.invokeExact(vtable);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_qrcodelistener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_qrcodelistener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_qrcodelistener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_qrcodelistener(java.lang.foreign.MemorySegment vtable) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_qrcodelistener.invokeExact(vtable);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_saslistener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_saslistener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_saslistener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_saslistener(java.lang.foreign.MemorySegment vtable) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_saslistener.invokeExact(vtable);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener(java.lang.foreign.MemorySegment vtable) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener.invokeExact(vtable);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_migrate
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_migrate", java.lang.foreign.FunctionDescriptor.ofVoid(RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_func_migrate(java.lang.foreign.MemorySegment data, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment passphrase, long progressListener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate.invokeExact(data, path, passphrase, progressListener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings", java.lang.foreign.FunctionDescriptor.ofVoid(RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings(java.lang.foreign.MemorySegment roomSettings, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment passphrase, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_room_settings.invokeExact(roomSettings, path, passphrase, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions", java.lang.foreign.FunctionDescriptor.ofVoid(RustBuffer.LAYOUT, RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions(java.lang.foreign.MemorySegment data, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment passphrase, long progressListener, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_func_migrate_sessions.invokeExact(data, path, passphrase, progressListener, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_version", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_func_version(java.lang.foreign.SegmentAllocator _allocator, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_func_version.invokeExact(_allocator, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_version_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_version_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_version_info", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_func_version_info(java.lang.foreign.SegmentAllocator _allocator, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_func_version_info.invokeExact(_allocator, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version(java.lang.foreign.SegmentAllocator _allocator, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_uniffi_matrix_sdk_crypto_ffi_fn_func_vodozemac_version.invokeExact(_allocator, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger(long logger, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_uniffi_matrix_sdk_crypto_ffi_fn_func_set_logger.invokeExact(logger, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rustbuffer_alloc
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_alloc = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rustbuffer_alloc", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment ffi_matrix_sdk_crypto_ffi_rustbuffer_alloc(java.lang.foreign.SegmentAllocator _allocator, long size, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_alloc.invokeExact(_allocator, size, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rustbuffer_from_bytes
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_from_bytes = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rustbuffer_from_bytes", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, ForeignBytes.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment ffi_matrix_sdk_crypto_ffi_rustbuffer_from_bytes(java.lang.foreign.SegmentAllocator _allocator, java.lang.foreign.MemorySegment bytes, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_from_bytes.invokeExact(_allocator, bytes, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rustbuffer_free
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_free = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rustbuffer_free", java.lang.foreign.FunctionDescriptor.ofVoid(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.ADDRESS));

    static void ffi_matrix_sdk_crypto_ffi_rustbuffer_free(java.lang.foreign.MemorySegment buf, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_free.invokeExact(buf, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rustbuffer_reserve
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_reserve = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rustbuffer_reserve", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment ffi_matrix_sdk_crypto_ffi_rustbuffer_reserve(java.lang.foreign.SegmentAllocator _allocator, java.lang.foreign.MemorySegment buf, long additional, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_ffi_matrix_sdk_crypto_ffi_rustbuffer_reserve.invokeExact(_allocator, buf, additional, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_u8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_u8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_u8(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u8.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u8(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u8.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_u8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_u8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_u8(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u8.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_u8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_u8", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte ffi_matrix_sdk_crypto_ffi_rust_future_complete_u8(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u8.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_i8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_i8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_i8(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i8.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i8(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i8.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_i8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_i8", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_i8(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i8.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_i8
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i8 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_i8", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BYTE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static byte ffi_matrix_sdk_crypto_ffi_rust_future_complete_i8(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (byte) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i8.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_u16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_u16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_u16(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u16.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u16(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u16.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_u16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_u16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_u16(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u16.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_u16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_u16", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static short ffi_matrix_sdk_crypto_ffi_rust_future_complete_u16(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (short) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u16.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_i16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_i16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_i16(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i16.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i16(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i16.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_i16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_i16", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_i16(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i16.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_i16
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i16 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_i16", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static short ffi_matrix_sdk_crypto_ffi_rust_future_complete_i16(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (short) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i16.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_u32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_u32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_u32(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u32.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_u32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_u32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_u32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_u32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_u32", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static int ffi_matrix_sdk_crypto_ffi_rust_future_complete_u32(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (int) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u32.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_i32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_i32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_i32(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i32.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_i32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_i32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_i32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_i32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_i32", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static int ffi_matrix_sdk_crypto_ffi_rust_future_complete_i32(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (int) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i32.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_u64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_u64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_u64(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_u64.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_u64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_u64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_u64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_u64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_u64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_u64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_u64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long ffi_matrix_sdk_crypto_ffi_rust_future_complete_u64(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_u64.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_i64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_i64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_i64(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_i64.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_i64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_i64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_i64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_i64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_i64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_i64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_i64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static long ffi_matrix_sdk_crypto_ffi_rust_future_complete_i64(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (long) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_i64.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_f32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_f32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_f32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_f32(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_f32.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_f32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_f32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_f32", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_f32(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_f32.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_f32
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_f32 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_f32", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static float ffi_matrix_sdk_crypto_ffi_rust_future_complete_f32(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (float) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_f32.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_f64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_f64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_f64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_f64(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_f64.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_f64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_f64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_f64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_f64", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_f64(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_f64.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_f64
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_f64 = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_f64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static double ffi_matrix_sdk_crypto_ffi_rust_future_complete_f64(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (double) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_f64.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_rust_buffer
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_rust_buffer = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_rust_buffer", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_rust_buffer(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_rust_buffer.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_rust_buffer
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_rust_buffer = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_rust_buffer", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_rust_buffer(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_rust_buffer.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_rust_buffer
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_rust_buffer = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_rust_buffer", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_rust_buffer(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_rust_buffer.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_rust_buffer
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_rust_buffer = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_rust_buffer", java.lang.foreign.FunctionDescriptor.of(RustBuffer.LAYOUT, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static java.lang.foreign.MemorySegment ffi_matrix_sdk_crypto_ffi_rust_future_complete_rust_buffer(java.lang.foreign.SegmentAllocator _allocator, long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            return (java.lang.foreign.MemorySegment) MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_rust_buffer.invokeExact(_allocator, handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_poll_void
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_void = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_poll_void", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_poll_void(long handle, java.lang.foreign.MemorySegment callback, long callbackData) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_poll_void.invokeExact(handle, callback, callbackData);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_cancel_void
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_void = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_cancel_void", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_cancel_void(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_cancel_void.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_free_void
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_void = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_free_void", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_free_void(long handle) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_free_void.invokeExact(handle);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_rust_future_complete_void
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_void = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_rust_future_complete_void", java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));

    static void ffi_matrix_sdk_crypto_ffi_rust_future_complete_void(long handle, java.lang.foreign.MemorySegment _uniffiOutErr) {
        try {
            MH_ffi_matrix_sdk_crypto_ffi_rust_future_complete_void.invokeExact(handle, _uniffiOutErr);
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_version", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_version() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_version.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64 = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change
    private static final java.lang.invoke.MethodHandle MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change = findDowncallHandle("uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_SHORT));

    static short uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change() {
        try {
            return (short) MH_uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    // ffi_matrix_sdk_crypto_ffi_uniffi_contract_version
    private static final java.lang.invoke.MethodHandle MH_ffi_matrix_sdk_crypto_ffi_uniffi_contract_version = findDowncallHandle("ffi_matrix_sdk_crypto_ffi_uniffi_contract_version", java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));

    static int ffi_matrix_sdk_crypto_ffi_uniffi_contract_version() {
        try {
            return (int) MH_ffi_matrix_sdk_crypto_ffi_uniffi_contract_version.invokeExact();
        } catch (Throwable _ex) { throw new AssertionError("invokeExact failed", _ex); }
    }

    

    // Integrity checks and initialization must happen after all MethodHandle fields
    // are initialized (static fields are initialized in textual order in Java).
    static {
        NamespaceLibrary.uniffiCheckContractApiVersion();
        NamespaceLibrary.uniffiCheckApiChecksums();
        
        CLEANER = UniffiCleaner.create();
        UniffiCallbackInterfaceLogger.INSTANCE.register();
        UniffiCallbackInterfaceProgressListener.INSTANCE.register();
        UniffiCallbackInterfaceQrCodeListener.INSTANCE.register();
        UniffiCallbackInterfaceSasListener.INSTANCE.register();
        UniffiCallbackInterfaceVerificationRequestListener.INSTANCE.register();
        }
}

