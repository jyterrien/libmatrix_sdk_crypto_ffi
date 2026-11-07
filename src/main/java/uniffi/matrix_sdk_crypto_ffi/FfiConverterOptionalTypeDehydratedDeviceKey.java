package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeDehydratedDeviceKey implements FfiConverterRustBuffer<DehydratedDeviceKey> {
  INSTANCE;

  @Override
  public DehydratedDeviceKey read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeDehydratedDeviceKey.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(DehydratedDeviceKey value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeDehydratedDeviceKey.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(DehydratedDeviceKey value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeDehydratedDeviceKey.INSTANCE.write(value, buf);
    }
  }
}
