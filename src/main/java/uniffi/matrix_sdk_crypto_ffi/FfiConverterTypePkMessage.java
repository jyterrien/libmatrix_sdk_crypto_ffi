package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePkMessage implements FfiConverterRustBuffer<PkMessage> {
  INSTANCE;

  @Override
  public PkMessage read(java.nio.ByteBuffer buf) {
    return new PkMessage(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(PkMessage value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.ciphertext()) +
            FfiConverterString.INSTANCE.allocationSize(value.mac()) +
            FfiConverterString.INSTANCE.allocationSize(value.ephemeralKey())
      );
  }

  @Override
  public void write(PkMessage value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.ciphertext(), buf);
      FfiConverterString.INSTANCE.write(value.mac(), buf);
      FfiConverterString.INSTANCE.write(value.ephemeralKey(), buf);
  }
}
