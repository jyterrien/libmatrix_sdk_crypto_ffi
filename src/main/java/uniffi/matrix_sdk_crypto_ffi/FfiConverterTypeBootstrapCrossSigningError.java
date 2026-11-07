package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeBootstrapCrossSigningError implements FfiConverterRustBuffer<BootstrapCrossSigningException> {
    INSTANCE;

    @Override
    public BootstrapCrossSigningException read(java.nio.ByteBuffer buf) {

        return switch(buf.getInt()) {
            case 1 -> new BootstrapCrossSigningException.CryptoStore(
                FfiConverterTypeCryptoStoreError.INSTANCE.read(buf)
                );
            case 2 -> new BootstrapCrossSigningException.Signature(
                FfiConverterTypeSignatureError.INSTANCE.read(buf)
                );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(BootstrapCrossSigningException value) {
        return switch(value) {
            case BootstrapCrossSigningException.CryptoStore x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterTypeCryptoStoreError.INSTANCE.allocationSize(x.v1)
            );
            case BootstrapCrossSigningException.Signature x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterTypeSignatureError.INSTANCE.allocationSize(x.v1)
            );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public void write(BootstrapCrossSigningException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case BootstrapCrossSigningException.CryptoStore x -> {
                buf.putInt(1);
                FfiConverterTypeCryptoStoreError.INSTANCE.write(x.v1, buf);
            }
            case BootstrapCrossSigningException.Signature x -> {
                buf.putInt(2);
                FfiConverterTypeSignatureError.INSTANCE.write(x.v1, buf);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
