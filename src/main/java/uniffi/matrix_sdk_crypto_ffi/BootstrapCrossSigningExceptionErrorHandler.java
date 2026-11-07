package uniffi.matrix_sdk_crypto_ffi;


public class BootstrapCrossSigningExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<BootstrapCrossSigningException> {
  @Override
  public BootstrapCrossSigningException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeBootstrapCrossSigningError.INSTANCE.lift(errorBuf);
  }
}

