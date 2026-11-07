package uniffi.matrix_sdk_crypto;


public class LoginQrCodeDecodeExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<LoginQrCodeDecodeException> {
  @Override
  public LoginQrCodeDecodeException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeLoginQrCodeDecodeError.INSTANCE.lift(errorBuf);
  }
}

