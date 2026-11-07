package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeCancelInfo implements FfiConverterRustBuffer<CancelInfo> {
  INSTANCE;

  @Override
  public CancelInfo read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeCancelInfo.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(CancelInfo value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeCancelInfo.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(CancelInfo value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeCancelInfo.INSTANCE.write(value, buf);
    }
  }
}
