package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeQrCode implements FfiConverterRustBuffer<QrCode> {
  INSTANCE;

  @Override
  public QrCode read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeQrCode.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(QrCode value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeQrCode.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(QrCode value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeQrCode.INSTANCE.write(value, buf);
    }
  }
}
