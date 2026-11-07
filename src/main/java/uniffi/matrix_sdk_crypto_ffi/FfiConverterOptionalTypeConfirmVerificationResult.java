package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeConfirmVerificationResult implements FfiConverterRustBuffer<ConfirmVerificationResult> {
  INSTANCE;

  @Override
  public ConfirmVerificationResult read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeConfirmVerificationResult.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(ConfirmVerificationResult value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeConfirmVerificationResult.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(ConfirmVerificationResult value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeConfirmVerificationResult.INSTANCE.write(value, buf);
    }
  }
}
