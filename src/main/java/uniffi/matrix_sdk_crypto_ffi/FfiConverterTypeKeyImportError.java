package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeKeyImportError implements FfiConverterRustBuffer<KeyImportException> {
    INSTANCE;

    @Override
    public KeyImportException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new KeyImportException.Export(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new KeyImportException.CryptoStore(FfiConverterString.INSTANCE.read(buf));
            case 3 -> new KeyImportException.Json(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(KeyImportException value) {
        return 4L;
    }

    @Override
    public void write(KeyImportException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case KeyImportException.Export x -> {
                buf.putInt(1);
            }
            case KeyImportException.CryptoStore x -> {
                buf.putInt(2);
            }
            case KeyImportException.Json x -> {
                buf.putInt(3);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
