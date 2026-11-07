package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeVerificationRequest implements FfiConverter<VerificationRequest, java.lang.Long> {
    INSTANCE;

    @Override
    public java.lang.Long lower(VerificationRequest value) {
        return value.uniffiCloneHandle();
    }

    @Override
    public VerificationRequest lift(java.lang.Long value) {
        return new VerificationRequest(UniffiWithHandle.INSTANCE, value);
    }

    @Override
    public VerificationRequest read(java.nio.ByteBuffer buf) {
        // The Rust code always writes handles as 8 bytes, and will
        // fail to compile if they don't fit.
        return lift(buf.getLong());
    }

    @Override
    public long allocationSize(VerificationRequest value) {
        return 8L;
    }

    @Override
    public void write(VerificationRequest value, java.nio.ByteBuffer buf) {
        // The Rust code always expects handles written as 8 bytes,
        // and will fail to compile if they don't fit.
        buf.putLong(lower(value));
    }
}
