package uniffi.matrix_sdk_crypto_ffi;


// The ffiConverter which transforms the Callbacks in to handles to pass to Rust.
public final class FfiConverterTypeLogger extends FfiConverterCallbackInterface<Logger> {
  static final FfiConverterTypeLogger INSTANCE = new FfiConverterTypeLogger();

  private FfiConverterTypeLogger() {}
}

