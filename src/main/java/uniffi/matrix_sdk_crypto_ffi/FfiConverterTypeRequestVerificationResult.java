package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRequestVerificationResult implements FfiConverterRustBuffer<RequestVerificationResult> {
  INSTANCE;

  @Override
  public RequestVerificationResult read(java.nio.ByteBuffer buf) {
    return new RequestVerificationResult(
      FfiConverterTypeVerificationRequest.INSTANCE.read(buf),
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(RequestVerificationResult value) {
      return (
            FfiConverterTypeVerificationRequest.INSTANCE.allocationSize(value.verification()) +
            FfiConverterTypeOutgoingVerificationRequest.INSTANCE.allocationSize(value.request())
      );
  }

  @Override
  public void write(RequestVerificationResult value, java.nio.ByteBuffer buf) {
      FfiConverterTypeVerificationRequest.INSTANCE.write(value.verification(), buf);
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.write(value.request(), buf);
  }
}
