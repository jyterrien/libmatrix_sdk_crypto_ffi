package uniffi.matrix_sdk_crypto_ffi;


public class DecryptionExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<DecryptionException> {
  @Override
  public DecryptionException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeDecryptionError.INSTANCE.lift(errorBuf);
  }
}

