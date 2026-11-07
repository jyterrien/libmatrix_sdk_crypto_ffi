package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeCrossSigningStatus implements FfiConverterRustBuffer<CrossSigningStatus> {
  INSTANCE;

  @Override
  public CrossSigningStatus read(java.nio.ByteBuffer buf) {
    return new CrossSigningStatus(
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(CrossSigningStatus value) {
      return (
            FfiConverterBoolean.INSTANCE.allocationSize(value.hasMaster()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.hasSelfSigning()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.hasUserSigning())
      );
  }

  @Override
  public void write(CrossSigningStatus value, java.nio.ByteBuffer buf) {
      FfiConverterBoolean.INSTANCE.write(value.hasMaster(), buf);
      FfiConverterBoolean.INSTANCE.write(value.hasSelfSigning(), buf);
      FfiConverterBoolean.INSTANCE.write(value.hasUserSigning(), buf);
  }
}
