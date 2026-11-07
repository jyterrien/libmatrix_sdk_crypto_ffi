package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSecretImportError implements FfiConverterRustBuffer<SecretImportException> {
    INSTANCE;

    @Override
    public SecretImportException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new SecretImportException.CryptoStore(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new SecretImportException.Import(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(SecretImportException value) {
        return 4L;
    }

    @Override
    public void write(SecretImportException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case SecretImportException.CryptoStore x -> {
                buf.putInt(1);
            }
            case SecretImportException.Import x -> {
                buf.putInt(2);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
