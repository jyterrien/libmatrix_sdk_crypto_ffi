package uniffi.matrix_sdk_crypto_ffi;


// The ffiConverter which transforms the Callbacks in to handles to pass to Rust.
public final class FfiConverterTypeProgressListener extends FfiConverterCallbackInterface<ProgressListener> {
  static final FfiConverterTypeProgressListener INSTANCE = new FfiConverterTypeProgressListener();

  private FfiConverterTypeProgressListener() {}
}

