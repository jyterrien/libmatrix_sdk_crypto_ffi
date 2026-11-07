package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSecretsBundleExportError implements FfiConverterRustBuffer<SecretsBundleExportException> {
    INSTANCE;

    @Override
    public SecretsBundleExportException read(java.nio.ByteBuffer buf) {

        return switch(buf.getInt()) {
            case 1 -> new SecretsBundleExportException.CryptoStore(
                FfiConverterTypeCryptoStoreError.INSTANCE.read(buf)
                );
            case 2 -> new SecretsBundleExportException.MissingCrossSigningKeys();
            case 3 -> new SecretsBundleExportException.MissingBackupVersion();
            case 4 -> new SecretsBundleExportException.Serialization(
                FfiConverterString.INSTANCE.read(buf)
                );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public long allocationSize(SecretsBundleExportException value) {
        return switch(value) {
            case SecretsBundleExportException.CryptoStore x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterTypeCryptoStoreError.INSTANCE.allocationSize(x.v1)
            );
            case SecretsBundleExportException.MissingCrossSigningKeys x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
            );
            case SecretsBundleExportException.MissingBackupVersion x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
            );
            case SecretsBundleExportException.Serialization x -> (
                // Add the size for the Int that specifies the variant plus the size needed for all fields
                4L
                + FfiConverterString.INSTANCE.allocationSize(x.error)
            );
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }

    @Override
    public void write(SecretsBundleExportException value, java.nio.ByteBuffer buf) {
        switch(value) {
            case SecretsBundleExportException.CryptoStore x -> {
                buf.putInt(1);
                FfiConverterTypeCryptoStoreError.INSTANCE.write(x.v1, buf);
            }
            case SecretsBundleExportException.MissingCrossSigningKeys x -> {
                buf.putInt(2);
            }
            case SecretsBundleExportException.MissingBackupVersion x -> {
                buf.putInt(3);
            }
            case SecretsBundleExportException.Serialization x -> {
                buf.putInt(4);
                FfiConverterString.INSTANCE.write(x.error, buf);
            }
            default -> throw new java.lang.RuntimeException("invalid error enum value, something is very wrong!!");
        };
    }
}
