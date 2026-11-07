package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDehydrationError implements FfiConverterRustBuffer<DehydrationException> {
    INSTANCE;

    @Override
    public DehydrationException read(java.nio.ByteBuffer buf) {
        return switch(buf.getInt()) {
            case 1 -> new DehydrationException.Pickle(FfiConverterString.INSTANCE.read(buf));
            case 2 -> new DehydrationException.LegacyPickle(FfiConverterString.INSTANCE.read(buf));
            case 3 -> new DehydrationException.MissingSigningKey(FfiConverterString.INSTANCE.read(buf));
            case 4 -> new DehydrationException.Json(FfiConverterString.INSTANCE.read(buf));
            case 5 -> new DehydrationException.Store(FfiConverterString.INSTANCE.read(buf));
            case 6 -> new DehydrationException.PickleKeyLength(FfiConverterString.INSTANCE.read(buf));
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(DehydrationException value) {
        return 4L;
    }

    @Override
    public void write(DehydrationException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case DehydrationException.Pickle x -> {
                buf.putInt(1);
            }
            case DehydrationException.LegacyPickle x -> {
                buf.putInt(2);
            }
            case DehydrationException.MissingSigningKey x -> {
                buf.putInt(3);
            }
            case DehydrationException.Json x -> {
                buf.putInt(4);
            }
            case DehydrationException.Store x -> {
                buf.putInt(5);
            }
            case DehydrationException.PickleKeyLength x -> {
                buf.putInt(6);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
