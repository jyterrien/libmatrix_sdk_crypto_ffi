package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeIdentityState implements FfiConverterRustBuffer<IdentityState> {
    INSTANCE;

    @Override
    public IdentityState read(java.nio.ByteBuffer buf) {
        try {
            return IdentityState.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(IdentityState value) {
        return 4L;
    }

    @Override
    public void write(IdentityState value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


