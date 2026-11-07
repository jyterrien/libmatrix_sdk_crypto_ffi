package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeLocalTrust implements FfiConverterRustBuffer<LocalTrust> {
    INSTANCE;

    @Override
    public LocalTrust read(java.nio.ByteBuffer buf) {
        try {
            return LocalTrust.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(LocalTrust value) {
        return 4L;
    }

    @Override
    public void write(LocalTrust value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


