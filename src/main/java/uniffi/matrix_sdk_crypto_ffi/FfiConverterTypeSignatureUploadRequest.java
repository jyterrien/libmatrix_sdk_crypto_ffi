package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSignatureUploadRequest implements FfiConverterRustBuffer<SignatureUploadRequest> {
  INSTANCE;

  @Override
  public SignatureUploadRequest read(java.nio.ByteBuffer buf) {
    return new SignatureUploadRequest(
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(SignatureUploadRequest value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.body())
      );
  }

  @Override
  public void write(SignatureUploadRequest value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.body(), buf);
  }
}
