package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeStartSasResult implements FfiConverterRustBuffer<StartSasResult> {
  INSTANCE;

  @Override
  public StartSasResult read(java.nio.ByteBuffer buf) {
    return new StartSasResult(
      FfiConverterTypeSas.INSTANCE.read(buf),
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(StartSasResult value) {
      return (
            FfiConverterTypeSas.INSTANCE.allocationSize(value.sas()) +
            FfiConverterTypeOutgoingVerificationRequest.INSTANCE.allocationSize(value.request())
      );
  }

  @Override
  public void write(StartSasResult value, java.nio.ByteBuffer buf) {
      FfiConverterTypeSas.INSTANCE.write(value.sas(), buf);
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.write(value.request(), buf);
  }
}
