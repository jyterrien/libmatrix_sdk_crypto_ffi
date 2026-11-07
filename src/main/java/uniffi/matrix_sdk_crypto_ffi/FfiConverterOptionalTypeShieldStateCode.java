package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeShieldStateCode implements FfiConverterRustBuffer<uniffi.matrix_sdk_common.ShieldStateCode> {
  INSTANCE;

  @Override
  public uniffi.matrix_sdk_common.ShieldStateCode read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return uniffi.matrix_sdk_common.FfiConverterTypeShieldStateCode.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(uniffi.matrix_sdk_common.ShieldStateCode value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + uniffi.matrix_sdk_common.FfiConverterTypeShieldStateCode.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(uniffi.matrix_sdk_common.ShieldStateCode value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      uniffi.matrix_sdk_common.FfiConverterTypeShieldStateCode.INSTANCE.write(value, buf);
    }
  }
}
