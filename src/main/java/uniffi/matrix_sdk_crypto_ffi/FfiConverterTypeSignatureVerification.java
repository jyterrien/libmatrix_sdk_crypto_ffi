package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSignatureVerification implements FfiConverterRustBuffer<SignatureVerification> {
  INSTANCE;

  @Override
  public SignatureVerification read(java.nio.ByteBuffer buf) {
    return new SignatureVerification(
      uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.read(buf),
      uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.read(buf),
      FfiConverterMapStringTypeSignatureState.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(SignatureVerification value) {
      return (
            uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.allocationSize(value.deviceSignature()) +
            uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.allocationSize(value.userIdentitySignature()) +
            FfiConverterMapStringTypeSignatureState.INSTANCE.allocationSize(value.otherDevicesSignatures()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.trusted())
      );
  }

  @Override
  public void write(SignatureVerification value, java.nio.ByteBuffer buf) {
      uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.write(value.deviceSignature(), buf);
      uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.write(value.userIdentitySignature(), buf);
      FfiConverterMapStringTypeSignatureState.INSTANCE.write(value.otherDevicesSignatures(), buf);
      FfiConverterBoolean.INSTANCE.write(value.trusted(), buf);
  }
}
