package uniffi.matrix_sdk_crypto_ffi;


public class KeyImportExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<KeyImportException> {
  @Override
  public KeyImportException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeKeyImportError.INSTANCE.lift(errorBuf);
  }
}

