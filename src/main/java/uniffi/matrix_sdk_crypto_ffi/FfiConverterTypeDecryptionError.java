package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDecryptionError implements FfiConverterRustBuffer<DecryptionException> {
    INSTANCE;

    @Override
    public DecryptionException read(java.nio.ByteBuffer buf) {

        return switch(buf.getInt()) {
            case 1 -> new DecryptionException.Serialization(
                FfiConverterString.INSTANCE.read(buf)
                );
            case 2 -> new DecryptionException.Identifier(
                FfiConverterString.INSTANCE.read(buf)
                );
            case 3 -> new DecryptionException.Megolm(
                FfiConverterString.INSTANCE.read(buf)
                );
            case 4 -> new DecryptionException.MissingRoomKey(
                FfiConverterString.INSTANCE.read(buf),
                FfiConverterOptionalString.INSTANCE.read(buf)
                );
            case 5 -> new DecryptionException.Store(
                FfiConverterString.INSTANCE.read(buf)
                );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(DecryptionException value) {
        return switch(value) {
            case DecryptionException.Serialization x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
            );
            case DecryptionException.Identifier x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
            );
            case DecryptionException.Megolm x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
            );
            case DecryptionException.MissingRoomKey x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
                + FfiConverterOptionalString.INSTANCE.allocationSize(x.withheldCode)
            );
            case DecryptionException.Store x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
            );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public void write(DecryptionException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case DecryptionException.Serialization x -> {
                buf.putInt(1);
                FfiConverterString.INSTANCE.write(x.error, buf);
            }
            case DecryptionException.Identifier x -> {
                buf.putInt(2);
                FfiConverterString.INSTANCE.write(x.error, buf);
            }
            case DecryptionException.Megolm x -> {
                buf.putInt(3);
                FfiConverterString.INSTANCE.write(x.error, buf);
            }
            case DecryptionException.MissingRoomKey x -> {
                buf.putInt(4);
                FfiConverterString.INSTANCE.write(x.error, buf);
                FfiConverterOptionalString.INSTANCE.write(x.withheldCode, buf);
            }
            case DecryptionException.Store x -> {
                buf.putInt(5);
                FfiConverterString.INSTANCE.write(x.error, buf);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
