package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeVerificationRequest implements FfiConverterRustBuffer<VerificationRequest> {
  INSTANCE;

  @Override
  public VerificationRequest read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeVerificationRequest.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(VerificationRequest value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeVerificationRequest.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(VerificationRequest value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeVerificationRequest.INSTANCE.write(value, buf);
    }
  }
}
