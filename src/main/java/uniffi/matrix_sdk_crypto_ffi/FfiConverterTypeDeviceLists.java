package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDeviceLists implements FfiConverterRustBuffer<DeviceLists> {
  INSTANCE;

  @Override
  public DeviceLists read(java.nio.ByteBuffer buf) {
    return new DeviceLists(
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterSequenceString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(DeviceLists value) {
      return (
            FfiConverterSequenceString.INSTANCE.allocationSize(value.changed()) +
            FfiConverterSequenceString.INSTANCE.allocationSize(value.left())
      );
  }

  @Override
  public void write(DeviceLists value, java.nio.ByteBuffer buf) {
      FfiConverterSequenceString.INSTANCE.write(value.changed(), buf);
      FfiConverterSequenceString.INSTANCE.write(value.left(), buf);
  }
}
