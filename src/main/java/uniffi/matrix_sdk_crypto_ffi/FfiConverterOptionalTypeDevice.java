package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeDevice implements FfiConverterRustBuffer<Device> {
  INSTANCE;

  @Override
  public Device read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeDevice.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(Device value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeDevice.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(Device value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeDevice.INSTANCE.write(value, buf);
    }
  }
}
