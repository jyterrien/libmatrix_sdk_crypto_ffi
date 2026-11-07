package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeHistoryVisibility implements FfiConverterRustBuffer<HistoryVisibility> {
    INSTANCE;

    @Override
    public HistoryVisibility read(java.nio.ByteBuffer buf) {
        try {
            return HistoryVisibility.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(HistoryVisibility value) {
        return 4L;
    }

    @Override
    public void write(HistoryVisibility value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


