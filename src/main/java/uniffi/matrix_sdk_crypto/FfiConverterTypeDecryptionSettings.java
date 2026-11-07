package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeDecryptionSettings implements FfiConverterRustBuffer<DecryptionSettings> {
  INSTANCE;

  @Override
  public DecryptionSettings read(java.nio.ByteBuffer buf) {
    return new DecryptionSettings(
      FfiConverterTypeTrustRequirement.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(DecryptionSettings value) {
      return (
            FfiConverterTypeTrustRequirement.INSTANCE.allocationSize(value.senderDeviceTrustRequirement())
      );
  }

  @Override
  public void write(DecryptionSettings value, java.nio.ByteBuffer buf) {
      FfiConverterTypeTrustRequirement.INSTANCE.write(value.senderDeviceTrustRequirement(), buf);
  }
}
