package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeVersionInfo implements FfiConverterRustBuffer<VersionInfo> {
  INSTANCE;

  @Override
  public VersionInfo read(java.nio.ByteBuffer buf) {
    return new VersionInfo(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(VersionInfo value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.version()) +
            FfiConverterString.INSTANCE.allocationSize(value.vodozemacVersion()) +
            FfiConverterString.INSTANCE.allocationSize(value.gitSha()) +
            FfiConverterString.INSTANCE.allocationSize(value.gitDescription())
      );
  }

  @Override
  public void write(VersionInfo value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.version(), buf);
      FfiConverterString.INSTANCE.write(value.vodozemacVersion(), buf);
      FfiConverterString.INSTANCE.write(value.gitSha(), buf);
      FfiConverterString.INSTANCE.write(value.gitDescription(), buf);
  }
}
