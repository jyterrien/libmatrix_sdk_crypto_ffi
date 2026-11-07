package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeSas implements FfiConverterRustBuffer<Sas> {
  INSTANCE;

  @Override
  public Sas read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeSas.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(Sas value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeSas.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(Sas value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeSas.INSTANCE.write(value, buf);
    }
  }
}
