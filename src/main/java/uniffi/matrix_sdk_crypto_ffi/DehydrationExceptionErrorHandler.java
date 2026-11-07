package uniffi.matrix_sdk_crypto_ffi;


public class DehydrationExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<DehydrationException> {
  @Override
  public DehydrationException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeDehydrationError.INSTANCE.lift(errorBuf);
  }
}

