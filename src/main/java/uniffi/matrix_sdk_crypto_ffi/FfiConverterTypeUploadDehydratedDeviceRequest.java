package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeUploadDehydratedDeviceRequest implements FfiConverterRustBuffer<UploadDehydratedDeviceRequest> {
  INSTANCE;

  @Override
  public UploadDehydratedDeviceRequest read(java.nio.ByteBuffer buf) {
    return new UploadDehydratedDeviceRequest(
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(UploadDehydratedDeviceRequest value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.body())
      );
  }

  @Override
  public void write(UploadDehydratedDeviceRequest value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.body(), buf);
  }
}
