package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeBootstrapCrossSigningResult implements FfiConverterRustBuffer<BootstrapCrossSigningResult> {
  INSTANCE;

  @Override
  public BootstrapCrossSigningResult read(java.nio.ByteBuffer buf) {
    return new BootstrapCrossSigningResult(
      FfiConverterOptionalTypeRequest.INSTANCE.read(buf),
      FfiConverterTypeUploadSigningKeysRequest.INSTANCE.read(buf),
      FfiConverterTypeSignatureUploadRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(BootstrapCrossSigningResult value) {
      return (
            FfiConverterOptionalTypeRequest.INSTANCE.allocationSize(value.uploadKeysRequest()) +
            FfiConverterTypeUploadSigningKeysRequest.INSTANCE.allocationSize(value.uploadSigningKeysRequest()) +
            FfiConverterTypeSignatureUploadRequest.INSTANCE.allocationSize(value.uploadSignatureRequest())
      );
  }

  @Override
  public void write(BootstrapCrossSigningResult value, java.nio.ByteBuffer buf) {
      FfiConverterOptionalTypeRequest.INSTANCE.write(value.uploadKeysRequest(), buf);
      FfiConverterTypeUploadSigningKeysRequest.INSTANCE.write(value.uploadSigningKeysRequest(), buf);
      FfiConverterTypeSignatureUploadRequest.INSTANCE.write(value.uploadSignatureRequest(), buf);
  }
}
