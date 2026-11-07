package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeUtdCause implements FfiConverterRustBuffer<UtdCause> {
    INSTANCE;

    @Override
    public UtdCause read(java.nio.ByteBuffer buf) {
        try {
            return UtdCause.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(UtdCause value) {
        return 4L;
    }

    @Override
    public void write(UtdCause value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}





