package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeRequest implements FfiConverterRustBuffer<Request> {
  INSTANCE;

  @Override
  public Request read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeRequest.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(Request value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeRequest.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(Request value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeRequest.INSTANCE.write(value, buf);
    }
  }
}
