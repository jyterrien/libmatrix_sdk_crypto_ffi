package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeEventEncryptionAlgorithm implements FfiConverterRustBuffer<EventEncryptionAlgorithm> {
    INSTANCE;

    @Override
    public EventEncryptionAlgorithm read(java.nio.ByteBuffer buf) {
        try {
            return EventEncryptionAlgorithm.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(EventEncryptionAlgorithm value) {
        return 4L;
    }

    @Override
    public void write(EventEncryptionAlgorithm value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


