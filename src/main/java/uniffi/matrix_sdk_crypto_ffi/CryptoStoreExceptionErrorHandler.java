package uniffi.matrix_sdk_crypto_ffi;


public class CryptoStoreExceptionErrorHandler implements UniffiRustCallStatusErrorHandler<CryptoStoreException> {
  @Override
  public CryptoStoreException lift(java.lang.foreign.MemorySegment errorBuf){
     return FfiConverterTypeCryptoStoreError.INSTANCE.lift(errorBuf);
  }
}

