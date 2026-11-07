package uniffi.matrix_sdk_crypto_ffi;


public class MigrationExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<MigrationException> {
  @Override
  public MigrationException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeMigrationError.INSTANCE.lift(errorBuf);
  }
}

