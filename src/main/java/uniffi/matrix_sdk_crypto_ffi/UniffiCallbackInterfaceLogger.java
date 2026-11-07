package uniffi.matrix_sdk_crypto_ffi;


// Put the implementation in an object so we don't pollute the top-level namespace
public class UniffiCallbackInterfaceLogger {
    public static final UniffiCallbackInterfaceLogger INSTANCE = new UniffiCallbackInterfaceLogger();
    java.lang.foreign.MemorySegment vtable;

    UniffiCallbackInterfaceLogger() {
        // Use Arena.global() for vtable and upcall stubs - they live for the program lifetime.
        // Arena.ofAuto() stubs can be GC'd since storing an address in a struct doesn't
        // prevent the Arena from being collected.
        vtable = java.lang.foreign.Arena.global().allocate(UniffiVTableCallbackInterfaceLogger.LAYOUT);
        UniffiVTableCallbackInterfaceLogger.setuniffiFree(vtable, UniffiCallbackInterfaceFree.toUpcallStub(UniffiFree.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceLogger.setuniffiClone(vtable, UniffiCallbackInterfaceClone.toUpcallStub(UniffiClone.INSTANCE, java.lang.foreign.Arena.global()));
        UniffiVTableCallbackInterfaceLogger.setlog(vtable, UniffiCallbackInterfaceLoggerMethod0.toUpcallStub(LogCallback.INSTANCE, java.lang.foreign.Arena.global()));
    }

    // Registers the foreign callback with the Rust side.
    void register() {
        UniffiLib.uniffi_matrix_sdk_crypto_ffi_fn_init_callback_vtable_logger(vtable);
    }
    
    public static final class LogCallback implements UniffiCallbackInterfaceLoggerMethod0.Fn {
        public static final LogCallback INSTANCE = new LogCallback();
        private LogCallback() {}

        @Override
        public void callback(long uniffiHandle,java.lang.foreign.MemorySegment logLine,java.lang.foreign.MemorySegment uniffiOutReturn,java.lang.foreign.MemorySegment _uniffiCallStatus) {
            _uniffiCallStatus = _uniffiCallStatus.reinterpret(UniffiRustCallStatus.LAYOUT.byteSize());
            var _uniffiObj = FfiConverterTypeLogger.INSTANCE.handleMap.get(uniffiHandle);
            java.util.function.Supplier<java.lang.Void> _uniffiMakeCall = () -> {
                _uniffiObj.log(
                    FfiConverterString.INSTANCE.lift(logLine)
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
            FfiConverterTypeLogger.INSTANCE.handleMap.remove(handle);
        }
    }

    public static class UniffiClone implements UniffiCallbackInterfaceClone.Fn {
        public static final UniffiClone INSTANCE = new UniffiClone();

        private UniffiClone() {}

        @Override
        public long callback(long handle) {
            return FfiConverterTypeLogger.INSTANCE.handleMap.clone(handle);
        }
    }
}

