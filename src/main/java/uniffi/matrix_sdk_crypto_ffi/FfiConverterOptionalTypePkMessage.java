package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypePkMessage implements FfiConverterRustBuffer<PkMessage> {
  INSTANCE;

  @Override
  public PkMessage read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypePkMessage.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(PkMessage value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypePkMessage.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(PkMessage value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypePkMessage.INSTANCE.write(value, buf);
    }
  }
}
