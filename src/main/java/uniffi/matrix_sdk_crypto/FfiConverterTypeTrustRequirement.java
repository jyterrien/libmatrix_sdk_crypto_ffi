package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeTrustRequirement implements FfiConverterRustBuffer<TrustRequirement> {
    INSTANCE;

    @Override
    public TrustRequirement read(java.nio.ByteBuffer buf) {
        try {
            return TrustRequirement.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(TrustRequirement value) {
        return 4L;
    }

    @Override
    public void write(TrustRequirement value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


