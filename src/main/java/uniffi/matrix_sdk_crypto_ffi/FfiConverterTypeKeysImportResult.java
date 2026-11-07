package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeKeysImportResult implements FfiConverterRustBuffer<KeysImportResult> {
  INSTANCE;

  @Override
  public KeysImportResult read(java.nio.ByteBuffer buf) {
    return new KeysImportResult(
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterMapStringMapStringSequenceString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(KeysImportResult value) {
      return (
            FfiConverterLong.INSTANCE.allocationSize(value.imported()) +
            FfiConverterLong.INSTANCE.allocationSize(value.total()) +
            FfiConverterMapStringMapStringSequenceString.INSTANCE.allocationSize(value.keys())
      );
  }

  @Override
  public void write(KeysImportResult value, java.nio.ByteBuffer buf) {
      FfiConverterLong.INSTANCE.write(value.imported(), buf);
      FfiConverterLong.INSTANCE.write(value.total(), buf);
      FfiConverterMapStringMapStringSequenceString.INSTANCE.write(value.keys(), buf);
  }
}
