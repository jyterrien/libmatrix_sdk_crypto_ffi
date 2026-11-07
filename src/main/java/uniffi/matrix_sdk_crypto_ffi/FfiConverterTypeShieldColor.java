package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeShieldColor implements FfiConverterRustBuffer<ShieldColor> {
    INSTANCE;

    @Override
    public ShieldColor read(java.nio.ByteBuffer buf) {
        try {
            return ShieldColor.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(ShieldColor value) {
        return 4L;
    }

    @Override
    public void write(ShieldColor value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


