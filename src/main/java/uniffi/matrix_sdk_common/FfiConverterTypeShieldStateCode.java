package uniffi.matrix_sdk_common;


public enum FfiConverterTypeShieldStateCode implements FfiConverterRustBuffer<ShieldStateCode> {
    INSTANCE;

    @Override
    public ShieldStateCode read(java.nio.ByteBuffer buf) {
        try {
            return ShieldStateCode.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(ShieldStateCode value) {
        return 4L;
    }

    @Override
    public void write(ShieldStateCode value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


