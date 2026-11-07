package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeOutgoingVerificationRequest implements FfiConverterRustBuffer<OutgoingVerificationRequest> {
  INSTANCE;

  @Override
  public OutgoingVerificationRequest read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeOutgoingVerificationRequest.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(OutgoingVerificationRequest value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeOutgoingVerificationRequest.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(OutgoingVerificationRequest value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeOutgoingVerificationRequest.INSTANCE.write(value, buf);
    }
  }
}
