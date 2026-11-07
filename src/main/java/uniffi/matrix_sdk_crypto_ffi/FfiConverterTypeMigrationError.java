package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeMigrationError implements FfiConverterRustBuffer<MigrationException> {
    INSTANCE;

    @Override
    public MigrationException read(java.nio.ByteBuffer buf) {

        return switch(buf.getInt()) {
            case 1 -> new MigrationException.Generic(
                FfiConverterString.INSTANCE.read(buf)
                );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(MigrationException value) {
        return switch(value) {
            case MigrationException.Generic x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.errorMessage)
            );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public void write(MigrationException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case MigrationException.Generic x -> {
                buf.putInt(1);
                FfiConverterString.INSTANCE.write(x.errorMessage, buf);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
