package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeCancelInfo implements FfiConverterRustBuffer<CancelInfo> {
  INSTANCE;

  @Override
  public CancelInfo read(java.nio.ByteBuffer buf) {
    return new CancelInfo(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(CancelInfo value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.reason()) +
            FfiConverterString.INSTANCE.allocationSize(value.cancelCode()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.cancelledByUs())
      );
  }

  @Override
  public void write(CancelInfo value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.reason(), buf);
      FfiConverterString.INSTANCE.write(value.cancelCode(), buf);
      FfiConverterBoolean.INSTANCE.write(value.cancelledByUs(), buf);
  }
}
