package uniffi.matrix_sdk_crypto_ffi;


public class PkDecryptionExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<PkDecryptionException> {
  @Override
  public PkDecryptionException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypePkDecryptionError.INSTANCE.lift(errorBuf);
  }
}

