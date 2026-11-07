package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeSecretsBundle implements FfiConverter<SecretsBundle, java.lang.Long> {
    INSTANCE;

    @Override
    public java.lang.Long lower(SecretsBundle value) {
        return value.uniffiCloneHandle();
    }

    @Override
    public SecretsBundle lift(java.lang.Long value) {
        return new SecretsBundle(UniffiWithHandle.INSTANCE, value);
    }

    @Override
    public SecretsBundle read(java.nio.ByteBuffer buf) {
        // The Rust code always writes handles as 8 bytes, and will
        // fail to compile if they don't fit.
        return lift(buf.getLong());
    }

    @Override
    public long allocationSize(SecretsBundle value) {
        return 8L;
    }

    @Override
    public void write(SecretsBundle value, java.nio.ByteBuffer buf) {
        // The Rust code always expects handles written as 8 bytes,
        // and will fail to compile if they don't fit.
        buf.putLong(lower(value));
    }
}
