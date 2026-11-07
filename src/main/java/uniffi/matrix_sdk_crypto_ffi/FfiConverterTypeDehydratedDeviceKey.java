package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDehydratedDeviceKey implements FfiConverterRustBuffer<DehydratedDeviceKey> {
  INSTANCE;

  @Override
  public DehydratedDeviceKey read(java.nio.ByteBuffer buf) {
    return new DehydratedDeviceKey(
      FfiConverterByteArray.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(DehydratedDeviceKey value) {
      return (
            FfiConverterByteArray.INSTANCE.allocationSize(value.inner())
      );
  }

  @Override
  public void write(DehydratedDeviceKey value, java.nio.ByteBuffer buf) {
      FfiConverterByteArray.INSTANCE.write(value.inner(), buf);
  }
}
