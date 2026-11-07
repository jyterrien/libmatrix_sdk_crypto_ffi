package uniffi.matrix_sdk_crypto;


public enum FfiConverterTypeLoginQrCodeDecodeError implements FfiConverterRustBuffer<LoginQrCodeDecodeException> {
    INSTANCE;

    @Override
    public LoginQrCodeDecodeException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new LoginQrCodeDecodeException.NotEnoughData(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new LoginQrCodeDecodeException.NotUtf8(FfiConverterString.INSTANCE.read(buf));
            case 3 -> new LoginQrCodeDecodeException.UrlParse(FfiConverterString.INSTANCE.read(buf));
            case 4 -> new LoginQrCodeDecodeException.InvalidIntent(FfiConverterString.INSTANCE.read(buf));
            case 5 -> new LoginQrCodeDecodeException.InvalidType(FfiConverterString.INSTANCE.read(buf));
            case 6 -> new LoginQrCodeDecodeException.Base64(FfiConverterString.INSTANCE.read(buf));
            case 7 -> new LoginQrCodeDecodeException.InvalidPrefix(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(LoginQrCodeDecodeException value) {
        return 4L;
    }

    @Override
    public void write(LoginQrCodeDecodeException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case LoginQrCodeDecodeException.NotEnoughData x -> {
                buf.putInt(1);
            }
            case LoginQrCodeDecodeException.NotUtf8 x -> {
                buf.putInt(2);
            }
            case LoginQrCodeDecodeException.UrlParse x -> {
                buf.putInt(3);
            }
            case LoginQrCodeDecodeException.InvalidIntent x -> {
                buf.putInt(4);
            }
            case LoginQrCodeDecodeException.InvalidType x -> {
                buf.putInt(5);
            }
            case LoginQrCodeDecodeException.Base64 x -> {
                buf.putInt(6);
            }
            case LoginQrCodeDecodeException.InvalidPrefix x -> {
                buf.putInt(7);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
