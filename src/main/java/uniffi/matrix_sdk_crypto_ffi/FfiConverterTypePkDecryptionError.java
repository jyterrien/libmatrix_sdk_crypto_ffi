package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePkDecryptionError implements FfiConverterRustBuffer<PkDecryptionException> {
    INSTANCE;

    @Override
    public PkDecryptionException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new PkDecryptionException.Olm(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(PkDecryptionException value) {
        return 4L;
    }

    @Override
    public void write(PkDecryptionException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case PkDecryptionException.Olm x -> {
                buf.putInt(1);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
