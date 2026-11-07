package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSignatureError implements FfiConverterRustBuffer<SignatureException> {
    INSTANCE;

    @Override
    public SignatureException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new SignatureException.Signature(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new SignatureException.Identifier(FfiConverterString.INSTANCE.read(buf));
            case 3 -> new SignatureException.CryptoStore(FfiConverterString.INSTANCE.read(buf));
            case 4 -> new SignatureException.UnknownDevice(FfiConverterString.INSTANCE.read(buf));
            case 5 -> new SignatureException.UnknownUserIdentity(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(SignatureException value) {
        return 4L;
    }

    @Override
    public void write(SignatureException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case SignatureException.Signature x -> {
                buf.putInt(1);
            }
            case SignatureException.Identifier x -> {
                buf.putInt(2);
            }
            case SignatureException.CryptoStore x -> {
                buf.putInt(3);
            }
            case SignatureException.UnknownDevice x -> {
                buf.putInt(4);
            }
            case SignatureException.UnknownUserIdentity x -> {
                buf.putInt(5);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
