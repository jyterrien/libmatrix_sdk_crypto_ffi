package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRequestType implements FfiConverterRustBuffer<RequestType> {
    INSTANCE;

    @Override
    public RequestType read(java.nio.ByteBuffer buf) {
        try {
            return RequestType.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(RequestType value) {
        return 4L;
    }

    @Override
    public void write(RequestType value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


