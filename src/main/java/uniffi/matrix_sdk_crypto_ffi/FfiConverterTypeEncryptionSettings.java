package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeEncryptionSettings implements FfiConverterRustBuffer<EncryptionSettings> {
  INSTANCE;

  @Override
  public EncryptionSettings read(java.nio.ByteBuffer buf) {
    return new EncryptionSettings(
      FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterTypeHistoryVisibility.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(EncryptionSettings value) {
      return (
            FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.allocationSize(value.algorithm()) +
            FfiConverterLong.INSTANCE.allocationSize(value.rotationPeriod()) +
            FfiConverterLong.INSTANCE.allocationSize(value.rotationPeriodMsgs()) +
            FfiConverterTypeHistoryVisibility.INSTANCE.allocationSize(value.historyVisibility()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.onlyAllowTrustedDevices()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.errorOnVerifiedUserProblem())
      );
  }

  @Override
  public void write(EncryptionSettings value, java.nio.ByteBuffer buf) {
      FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.write(value.algorithm(), buf);
      FfiConverterLong.INSTANCE.write(value.rotationPeriod(), buf);
      FfiConverterLong.INSTANCE.write(value.rotationPeriodMsgs(), buf);
      FfiConverterTypeHistoryVisibility.INSTANCE.write(value.historyVisibility(), buf);
      FfiConverterBoolean.INSTANCE.write(value.onlyAllowTrustedDevices(), buf);
      FfiConverterBoolean.INSTANCE.write(value.errorOnVerifiedUserProblem(), buf);
  }
}
