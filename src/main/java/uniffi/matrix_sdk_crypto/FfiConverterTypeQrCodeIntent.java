package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeQrCodeIntent implements FfiConverterRustBuffer<QrCodeIntent> {
    INSTANCE;

    @Override
    public QrCodeIntent read(java.nio.ByteBuffer buf) {
        try {
            return QrCodeIntent.values()[buf.getInt() - 1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    @Override
    public long allocationSize(QrCodeIntent value) {
        return 4L;
    }

    @Override
    public void write(QrCodeIntent value, java.nio.ByteBuffer buf) {
        buf.putInt(value.ordinal() + 1);
    }
}


