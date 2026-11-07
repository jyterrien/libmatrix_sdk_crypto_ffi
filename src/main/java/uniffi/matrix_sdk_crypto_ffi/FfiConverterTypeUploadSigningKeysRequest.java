package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeUploadSigningKeysRequest implements FfiConverterRustBuffer<UploadSigningKeysRequest> {
  INSTANCE;

  @Override
  public UploadSigningKeysRequest read(java.nio.ByteBuffer buf) {
    return new UploadSigningKeysRequest(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(UploadSigningKeysRequest value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.masterKey()) +
            FfiConverterString.INSTANCE.allocationSize(value.selfSigningKey()) +
            FfiConverterString.INSTANCE.allocationSize(value.userSigningKey())
      );
  }

  @Override
  public void write(UploadSigningKeysRequest value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.masterKey(), buf);
      FfiConverterString.INSTANCE.write(value.selfSigningKey(), buf);
      FfiConverterString.INSTANCE.write(value.userSigningKey(), buf);
  }
}
