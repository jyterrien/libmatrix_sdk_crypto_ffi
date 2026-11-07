package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeCryptoStoreError implements FfiConverterRustBuffer<CryptoStoreException> {
    INSTANCE;

    @Override
    public CryptoStoreException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new CryptoStoreException.OpenStore(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new CryptoStoreException.CryptoStore(FfiConverterString.INSTANCE.read(buf));
            case 3 -> new CryptoStoreException.OlmException(FfiConverterString.INSTANCE.read(buf));
            case 4 -> new CryptoStoreException.Serialization(FfiConverterString.INSTANCE.read(buf));
            case 5 -> new CryptoStoreException.InvalidUserId(FfiConverterString.INSTANCE.read(buf));
            case 6 -> new CryptoStoreException.Identifier(FfiConverterString.INSTANCE.read(buf));
            case 7 -> new CryptoStoreException.DehydrationException(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(CryptoStoreException value) {
        return 4L;
    }

    @Override
    public void write(CryptoStoreException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case CryptoStoreException.OpenStore x -> {
                buf.putInt(1);
            }
            case CryptoStoreException.CryptoStore x -> {
                buf.putInt(2);
            }
            case CryptoStoreException.OlmException x -> {
                buf.putInt(3);
            }
            case CryptoStoreException.Serialization x -> {
                buf.putInt(4);
            }
            case CryptoStoreException.InvalidUserId x -> {
                buf.putInt(5);
            }
            case CryptoStoreException.Identifier x -> {
                buf.putInt(6);
            }
            case CryptoStoreException.DehydrationException x -> {
                buf.putInt(7);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
