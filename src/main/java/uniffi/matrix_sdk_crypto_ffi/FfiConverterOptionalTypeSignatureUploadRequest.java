package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeSignatureUploadRequest implements FfiConverterRustBuffer<SignatureUploadRequest> {
  INSTANCE;

  @Override
  public SignatureUploadRequest read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeSignatureUploadRequest.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(SignatureUploadRequest value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeSignatureUploadRequest.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(SignatureUploadRequest value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeSignatureUploadRequest.INSTANCE.write(value, buf);
    }
  }
}
