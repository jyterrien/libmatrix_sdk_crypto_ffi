package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeCrossSigningKeyExport implements FfiConverterRustBuffer<CrossSigningKeyExport> {
  INSTANCE;

  @Override
  public CrossSigningKeyExport read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeCrossSigningKeyExport.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(CrossSigningKeyExport value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeCrossSigningKeyExport.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(CrossSigningKeyExport value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeCrossSigningKeyExport.INSTANCE.write(value, buf);
    }
  }
}
