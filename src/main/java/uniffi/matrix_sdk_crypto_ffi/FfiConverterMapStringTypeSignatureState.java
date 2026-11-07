package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterMapStringTypeSignatureState implements FfiConverterRustBuffer<java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState>> {
    INSTANCE;

    @Override
    public java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> read(java.nio.ByteBuffer buf) {
        int len = buf.getInt();
        // Collectors.toMap would be preferred here, but theres a bug that doesn't allow
        // null values in the map, even though that is valid Java
        return java.util.stream.IntStream.range(0, len).boxed().collect(
            java.util.HashMap::new,
            (m, _v) -> m.put(
                FfiConverterString.INSTANCE.read(buf),
                uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.read(buf)
            ),
            java.util.HashMap::putAll
        );
    }

    @Override
    public long allocationSize(java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> value) {
        long spaceForMapSize = 4;
        long spaceForChildren = value.entrySet().stream().mapToLong(entry ->
            FfiConverterString.INSTANCE.allocationSize(entry.getKey()) +
            uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.allocationSize(entry.getValue())
        ).sum();
        return spaceForMapSize + spaceForChildren;
    }

    @Override
    public void write(java.util.Map<java.lang.String, uniffi.matrix_sdk_crypto.SignatureState> value, java.nio.ByteBuffer buf) {
        buf.putInt(value.size());
        // The parens on `(k, v)` here ensure we're calling the right method,
        // which is important for compatibility with older android devices.
        // Ref https://blog.danlew.net/2017/03/16/kotlin-puzzler-whose-line-is-it-anyways/
        for (var entry : value.entrySet()) {
            FfiConverterString.INSTANCE.write(entry.getKey(), buf);
            uniffi.matrix_sdk_crypto.FfiConverterTypeSignatureState.INSTANCE.write(entry.getValue(), buf);
        }
    }
}
