package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePickledAccount implements FfiConverterRustBuffer<PickledAccount> {
  INSTANCE;

  @Override
  public PickledAccount read(java.nio.ByteBuffer buf) {
    return new PickledAccount(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(PickledAccount value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.userId()) +
            FfiConverterString.INSTANCE.allocationSize(value.deviceId()) +
            FfiConverterString.INSTANCE.allocationSize(value.pickle()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.shared()) +
            FfiConverterLong.INSTANCE.allocationSize(value.uploadedSignedKeyCount())
      );
  }

  @Override
  public void write(PickledAccount value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.userId(), buf);
      FfiConverterString.INSTANCE.write(value.deviceId(), buf);
      FfiConverterString.INSTANCE.write(value.pickle(), buf);
      FfiConverterBoolean.INSTANCE.write(value.shared(), buf);
      FfiConverterLong.INSTANCE.write(value.uploadedSignedKeyCount(), buf);
  }
}
