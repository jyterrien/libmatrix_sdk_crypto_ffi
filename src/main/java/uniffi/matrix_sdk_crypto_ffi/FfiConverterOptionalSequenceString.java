package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalSequenceString implements FfiConverterRustBuffer<java.util.List<java.lang.String>> {
  INSTANCE;

  @Override
  public java.util.List<java.lang.String> read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterSequenceString.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(java.util.List<java.lang.String> value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterSequenceString.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(java.util.List<java.lang.String> value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterSequenceString.INSTANCE.write(value, buf);
    }
  }
}