package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalInt32Array implements FfiConverterRustBuffer<int[]> {
  INSTANCE;

  @Override
  public int[] read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterInt32Array.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(int[] value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterInt32Array.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(int[] value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterInt32Array.INSTANCE.write(value, buf);
    }
  }
}
