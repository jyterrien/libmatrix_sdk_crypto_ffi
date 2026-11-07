package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeConfirmVerificationResult implements FfiConverterRustBuffer<ConfirmVerificationResult> {
  INSTANCE;

  @Override
  public ConfirmVerificationResult read(java.nio.ByteBuffer buf) {
    return new ConfirmVerificationResult(
      FfiConverterSequenceTypeOutgoingVerificationRequest.INSTANCE.read(buf),
      FfiConverterOptionalTypeSignatureUploadRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(ConfirmVerificationResult value) {
      return (
            FfiConverterSequenceTypeOutgoingVerificationRequest.INSTANCE.allocationSize(value.requests()) +
            FfiConverterOptionalTypeSignatureUploadRequest.INSTANCE.allocationSize(value.signatureRequest())
      );
  }

  @Override
  public void write(ConfirmVerificationResult value, java.nio.ByteBuffer buf) {
      FfiConverterSequenceTypeOutgoingVerificationRequest.INSTANCE.write(value.requests(), buf);
      FfiConverterOptionalTypeSignatureUploadRequest.INSTANCE.write(value.signatureRequest(), buf);
  }
}
