package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeSignatureState implements FfiConverterRustBuffer<SignatureState> {
    INSTANCE;

    @Override
    public SignatureState read(java.nio.ByteBuffer buf) {
        try {
            return SignatureState.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(SignatureState value) {
        return 4L;
    }

    @Override
    public void write(SignatureState value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


