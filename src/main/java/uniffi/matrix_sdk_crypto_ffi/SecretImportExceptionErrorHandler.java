package uniffi.matrix_sdk_crypto_ffi;


public class SecretImportExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<SecretImportException> {
  @Override
  public SecretImportException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeSecretImportError.INSTANCE.lift(errorBuf);
  }
}

