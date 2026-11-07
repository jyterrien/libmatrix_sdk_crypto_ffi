package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDecodeError implements FfiConverterRustBuffer<DecodeException> {
    INSTANCE;

    @Override
    public DecodeException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new DecodeException.Decode(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new DecodeException.CryptoStore(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(DecodeException value) {
        return 4L;
    }

    @Override
    public void write(DecodeException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case DecodeException.Decode x -> {
                buf.putInt(1);
            }
            case DecodeException.CryptoStore x -> {
                buf.putInt(2);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
