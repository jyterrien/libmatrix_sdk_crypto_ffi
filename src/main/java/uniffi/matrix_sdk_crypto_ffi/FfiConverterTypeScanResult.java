package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeScanResult implements FfiConverterRustBuffer<ScanResult> {
  INSTANCE;

  @Override
  public ScanResult read(java.nio.ByteBuffer buf) {
    return new ScanResult(
      FfiConverterTypeQrCode.INSTANCE.read(buf),
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(ScanResult value) {
      return (
            FfiConverterTypeQrCode.INSTANCE.allocationSize(value.qr()) +
            FfiConverterTypeOutgoingVerificationRequest.INSTANCE.allocationSize(value.request())
      );
  }

  @Override
  public void write(ScanResult value, java.nio.ByteBuffer buf) {
      FfiConverterTypeQrCode.INSTANCE.write(value.qr(), buf);
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.write(value.request(), buf);
  }
}
