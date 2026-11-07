package uniffi.matrix_sdk_crypto_ffi;


// Put the implementation in an object so we don't pollute the top-level namespace
public class UniffiCallbackInterfaceProgressListener {
    public static final UniffiCallbackInterfaceProgressListener INSTANCE = new UniffiCallbackInterfaceProgressListener();
    java.lang.foreign.MemorySegment vtable;

    UniffiCallbackInterfaceProgressListener() {
        // Use Arena.global() for vtable and upcall stubs - they live for the program lifetime.
        // Arena.ofAuto() stubs can be GC'd since storing an address in a struct doesn't
        // prevent the Arena from being collected.
        vtable = java.lang.foreign.Arena.global().allocate(UniffiVTableCallbackInterfaceProgressListener.LAYOUT);
        UniffiVTableCallbackInterfaceProgressListener.setuniffiFree(vtable, UniffiCallbackInterfaceFree.toUpcallStub(UniffiFree.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceProgressListener.setuniffiClone(vtable, UniffiCallbackInterfaceClone.toUpcallStub(UniffiClone.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceProgressListener.setonProgress(vtable, UniffiCallbackInterfaceProgressListenerMethod0.toUpcallStub(OnProgressCallback.INSTANCE, java.lang.foreign.Arena.global()));
    }

    // Registers the foreign callback with the Rust side.
    void register() {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_progresslistener(vtable);
    }
    
    public static final class OnProgressCallback implements UniffiCallbackInterfaceProgressListenerMethod0.Fn {
        public static final OnProgressCallback INSTANCE = new OnProgressCallback();
        private OnProgressCallback() {}

        @Override
        public void callback(long uniffiHandle,int progress,int total,java.lang.foreign.MemorySegment uniffiOutReturn,java.lang.foreign.MemorySegment _uniffiCallStatus) {
            _uniffiCallStatus = _uniffiCallStatus.reinterpret(UniffiRustCallStatus.LAYOUT.byteSize());
            var _uniffiObj = FfiConverterTypeProgressListener.INSTANCE.handleMap.get(uniffiHandle);
            java.util.function.Supplier<java.lang.Void> _uniffiMakeCall = () -> {
                _uniffiObj.onProgress(
                    FfiConverterInteger.INSTANCE.lift(progress),
                    FfiConverterInteger.INSTANCE.lift(total)
                );
                return null;
            };
            java.util.function.Consumer<java.lang.Void> _uniffiWriteReturn = (_uniffiNothing) -> {};
            UniffiHelpers.uniffiTraitInterfaceCall(_uniffiCallStatus, _uniffiMakeCall, _uniffiWriteReturn);
        }
    }

    public static class UniffiFree implements UniffiCallbackInterfaceFree.Fn {
        public static final UniffiFree INSTANCE = new UniffiFree();

        private UniffiFree() {}

        @Override
        public void callback(long handle) {
            FfiConverterTypeProgressListener.INSTANCE.handleMap.remove(handle);
        }
    }

    public static class UniffiClone implements UniffiCallbackInterfaceClone.Fn {
        public static final UniffiClone INSTANCE = new UniffiClone();

        private UniffiClone() {}

        @Override
        public long callback(long handle) {
            return FfiConverterTypeProgressListener.INSTANCE.handleMap.clone(handle);
        }
    }
}

