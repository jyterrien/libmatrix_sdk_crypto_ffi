package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeScanResult implements FfiConverterRustBuffer<ScanResult> {
  INSTANCE;

  @Override
  public ScanResult read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeScanResult.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(ScanResult value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeScanResult.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(ScanResult value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeScanResult.INSTANCE.write(value, buf);
    }
  }
}
