package uniffi.matrix_sdk_crypto_ffi;


public class SecretsBundleExportExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<SecretsBundleExportException> {
  @Override
  public SecretsBundleExportException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeSecretsBundleExportError.INSTANCE.lift(errorBuf);
  }
}

