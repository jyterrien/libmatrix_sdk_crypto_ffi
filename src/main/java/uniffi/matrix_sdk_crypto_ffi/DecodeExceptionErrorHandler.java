package uniffi.matrix_sdk_crypto_ffi;


public class DecodeExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<DecodeException> {
  @Override
  public DecodeException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeDecodeError.INSTANCE.lift(errorBuf);
  }
}

