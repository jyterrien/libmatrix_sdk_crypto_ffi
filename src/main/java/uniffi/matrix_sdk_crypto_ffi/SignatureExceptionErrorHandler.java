package uniffi.matrix_sdk_crypto_ffi;


public class SignatureExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<SignatureException> {
  @Override
  public SignatureException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeSignatureError.INSTANCE.lift(errorBuf);
  }
}

