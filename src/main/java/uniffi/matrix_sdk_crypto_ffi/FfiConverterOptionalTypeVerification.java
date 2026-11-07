package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeVerification implements FfiConverterRustBuffer<Verification> {
  INSTANCE;

  @Override
  public Verification read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeVerification.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(Verification value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeVerification.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(Verification value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeVerification.INSTANCE.write(value, buf);
    }
  }
}
