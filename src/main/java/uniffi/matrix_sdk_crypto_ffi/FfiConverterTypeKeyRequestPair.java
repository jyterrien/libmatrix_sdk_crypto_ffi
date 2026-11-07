package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeKeyRequestPair implements FfiConverterRustBuffer<KeyRequestPair> {
  INSTANCE;

  @Override
  public KeyRequestPair read(java.nio.ByteBuffer buf) {
    return new KeyRequestPair(
      FfiConverterOptionalTypeRequest.INSTANCE.read(buf),
      FfiConverterTypeRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(KeyRequestPair value) {
      return (
            FfiConverterOptionalTypeRequest.INSTANCE.allocationSize(value.cancellation()) +
            FfiConverterTypeRequest.INSTANCE.allocationSize(value.keyRequest())
      );
  }

  @Override
  public void write(KeyRequestPair value, java.nio.ByteBuffer buf) {
      FfiConverterOptionalTypeRequest.INSTANCE.write(value.cancellation(), buf);
      FfiConverterTypeRequest.INSTANCE.write(value.keyRequest(), buf);
  }
}
