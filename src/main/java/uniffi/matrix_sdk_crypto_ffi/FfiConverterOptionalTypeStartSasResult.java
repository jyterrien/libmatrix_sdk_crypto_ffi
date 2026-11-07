package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeStartSasResult implements FfiConverterRustBuffer<StartSasResult> {
  INSTANCE;

  @Override
  public StartSasResult read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeStartSasResult.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(StartSasResult value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeStartSasResult.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(StartSasResult value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeStartSasResult.INSTANCE.write(value, buf);
    }
  }
}
