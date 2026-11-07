package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeRequestVerificationResult implements FfiConverterRustBuffer<RequestVerificationResult> {
  INSTANCE;

  @Override
  public RequestVerificationResult read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeRequestVerificationResult.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(RequestVerificationResult value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeRequestVerificationResult.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(RequestVerificationResult value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeRequestVerificationResult.INSTANCE.write(value, buf);
    }
  }
}
