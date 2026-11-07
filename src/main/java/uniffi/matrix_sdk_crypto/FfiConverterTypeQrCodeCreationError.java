package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeQrCodeCreationError implements FfiConverterRustBuffer<QrCodeCreationException> {
    INSTANCE;

    @Override
    public QrCodeCreationException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new QrCodeCreationException.TooLongBaseUrl(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new QrCodeCreationException.TooLongRendezvousId(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(QrCodeCreationException value) {
        return 4L;
    }

    @Override
    public void write(QrCodeCreationException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case QrCodeCreationException.TooLongBaseUrl x -> {
                buf.putInt(1);
            }
            case QrCodeCreationException.TooLongRendezvousId x -> {
                buf.putInt(2);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
