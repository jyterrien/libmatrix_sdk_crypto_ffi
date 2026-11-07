package uniffi.matrix_sdk_crypto_ffi;


// Put the implementation in an object so we don't pollute the top-level namespace
public class UniffiCallbackInterfaceVerificationRequestListener {
    public static final UniffiCallbackInterfaceVerificationRequestListener INSTANCE = new UniffiCallbackInterfaceVerificationRequestListener();
    java.lang.foreign.MemorySegment vtable;

    UniffiCallbackInterfaceVerificationRequestListener() {
        // Use Arena.global() for vtable and upcall stubs - they live for the program lifetime.
        // Arena.ofAuto() stubs can be GC'd since storing an address in a struct doesn't
        // prevent the Arena from being collected.
        vtable = java.lang.foreign.Arena.global().allocate(UniffiVTableCallbackInterfaceVerificationRequestListener.LAYOUT);
        UniffiVTableCallbackInterfaceVerificationRequestListener.setuniffiFree(vtable, UniffiCallbackInterfaceFree.toUpcallStub(UniffiFree.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceVerificationRequestListener.setuniffiClone(vtable, UniffiCallbackInterfaceClone.toUpcallStub(UniffiClone.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceVerificationRequestListener.setonChange(vtable, UniffiCallbackInterfaceVerificationRequestListenerMethod0.toUpcallStub(OnChangeCallback.INSTANCE, java.lang.foreign.Arena.global()));
    }

    // Registers the foreign callback with the Rust side.
    void register() {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_verificationrequestlistener(vtable);
    }
    
    public static final class OnChangeCallback implements UniffiCallbackInterfaceVerificationRequestListenerMethod0.Fn {
        public static final OnChangeCallback INSTANCE = new OnChangeCallback();
        private OnChangeCallback() {}

        @Override
        public void callback(long uniffiHandle,java.lang.foreign.MemorySegment state,java.lang.foreign.MemorySegment uniffiOutReturn,java.lang.foreign.MemorySegment _uniffiCallStatus) {
            _uniffiCallStatus = _uniffiCallStatus.reinterpret(UniffiRustCallStatus.LAYOUT.byteSize());
            var _uniffiObj = FfiConverterTypeVerificationRequestListener.INSTANCE.handleMap.get(uniffiHandle);
            java.util.function.Supplier<java.lang.Void> _uniffiMakeCall = () -> {
                _uniffiObj.onChange(
                    FfiConverterTypeVerificationRequestState.INSTANCE.lift(state)
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
            FfiConverterTypeVerificationRequestListener.INSTANCE.handleMap.remove(handle);
        }
    }

    public static class UniffiClone implements UniffiCallbackInterfaceClone.Fn {
        public static final UniffiClone INSTANCE = new UniffiClone();

        private UniffiClone() {}

        @Override
        public long callback(long handle) {
            return FfiConverterTypeVerificationRequestListener.INSTANCE.handleMap.clone(handle);
        }
    }
}

