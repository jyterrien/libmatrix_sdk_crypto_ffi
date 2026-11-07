package uniffi.matrix_sdk_crypto;


public class QrCodeCreationExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<QrCodeCreationException> {
  @Override
  public QrCodeCreationException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeQrCodeCreationError.INSTANCE.lift(errorBuf);
  }
}

