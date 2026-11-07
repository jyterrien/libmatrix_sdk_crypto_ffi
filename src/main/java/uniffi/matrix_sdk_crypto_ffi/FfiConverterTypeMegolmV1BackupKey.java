package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeMegolmV1BackupKey implements FfiConverterRustBuffer<MegolmV1BackupKey> {
  INSTANCE;

  @Override
  public MegolmV1BackupKey read(java.nio.ByteBuffer buf) {
    return new MegolmV1BackupKey(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterMapStringMapStringString.INSTANCE.read(buf),
      FfiConverterOptionalTypePassphraseInfo.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(MegolmV1BackupKey value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.publicKey()) +
            FfiConverterMapStringMapStringString.INSTANCE.allocationSize(value.signatures()) +
            FfiConverterOptionalTypePassphraseInfo.INSTANCE.allocationSize(value.passphraseInfo()) +
            FfiConverterString.INSTANCE.allocationSize(value.backupAlgorithm())
      );
  }

  @Override
  public void write(MegolmV1BackupKey value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.publicKey(), buf);
      FfiConverterMapStringMapStringString.INSTANCE.write(value.signatures(), buf);
      FfiConverterOptionalTypePassphraseInfo.INSTANCE.write(value.passphraseInfo(), buf);
      FfiConverterString.INSTANCE.write(value.backupAlgorithm(), buf);
  }
}
