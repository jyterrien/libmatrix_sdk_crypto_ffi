package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePassphraseInfo implements FfiConverterRustBuffer<PassphraseInfo> {
  INSTANCE;

  @Override
  public PassphraseInfo read(java.nio.ByteBuffer buf) {
    return new PassphraseInfo(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterInteger.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(PassphraseInfo value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.privateKeySalt()) +
            FfiConverterInteger.INSTANCE.allocationSize(value.privateKeyIterations())
      );
  }

  @Override
  public void write(PassphraseInfo value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.privateKeySalt(), buf);
      FfiConverterInteger.INSTANCE.write(value.privateKeyIterations(), buf);
  }
}
