package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeCrossSigningKeyExport implements FfiConverterRustBuffer<CrossSigningKeyExport> {
  INSTANCE;

  @Override
  public CrossSigningKeyExport read(java.nio.ByteBuffer buf) {
    return new CrossSigningKeyExport(
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(CrossSigningKeyExport value) {
      return (
            FfiConverterOptionalString.INSTANCE.allocationSize(value.masterKey()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.selfSigningKey()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.userSigningKey())
      );
  }

  @Override
  public void write(CrossSigningKeyExport value, java.nio.ByteBuffer buf) {
      FfiConverterOptionalString.INSTANCE.write(value.masterKey(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.selfSigningKey(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.userSigningKey(), buf);
  }
}
