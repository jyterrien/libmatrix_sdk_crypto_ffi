package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePickledSession implements FfiConverterRustBuffer<PickledSession> {
  INSTANCE;

  @Override
  public PickledSession read(java.nio.ByteBuffer buf) {
    return new PickledSession(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(PickledSession value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.pickle()) +
            FfiConverterString.INSTANCE.allocationSize(value.senderKey()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.createdUsingFallbackKey()) +
            FfiConverterLong.INSTANCE.allocationSize(value.creationTime()) +
            FfiConverterLong.INSTANCE.allocationSize(value.lastUseTime())
      );
  }

  @Override
  public void write(PickledSession value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.pickle(), buf);
      FfiConverterString.INSTANCE.write(value.senderKey(), buf);
      FfiConverterBoolean.INSTANCE.write(value.createdUsingFallbackKey(), buf);
      FfiConverterLong.INSTANCE.write(value.creationTime(), buf);
      FfiConverterLong.INSTANCE.write(value.lastUseTime(), buf);
  }
}
