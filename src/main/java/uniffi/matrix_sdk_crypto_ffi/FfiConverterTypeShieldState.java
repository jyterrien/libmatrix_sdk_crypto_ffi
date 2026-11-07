package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeShieldState implements FfiConverterRustBuffer<ShieldState> {
  INSTANCE;

  @Override
  public ShieldState read(java.nio.ByteBuffer buf) {
    return new ShieldState(
      FfiConverterTypeShieldColor.INSTANCE.read(buf),
      FfiConverterOptionalTypeShieldStateCode.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(ShieldState value) {
      return (
            FfiConverterTypeShieldColor.INSTANCE.allocationSize(value.color()) +
            FfiConverterOptionalTypeShieldStateCode.INSTANCE.allocationSize(value.code()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.message())
      );
  }

  @Override
  public void write(ShieldState value, java.nio.ByteBuffer buf) {
      FfiConverterTypeShieldColor.INSTANCE.write(value.color(), buf);
      FfiConverterOptionalTypeShieldStateCode.INSTANCE.write(value.code(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.message(), buf);
  }
}
