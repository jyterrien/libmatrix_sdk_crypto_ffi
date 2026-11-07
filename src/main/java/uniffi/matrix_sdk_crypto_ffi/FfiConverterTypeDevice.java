package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDevice implements FfiConverterRustBuffer<Device> {
  INSTANCE;

  @Override
  public Device read(java.nio.ByteBuffer buf) {
    return new Device(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterMapStringString.INSTANCE.read(buf),
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(Device value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.userId()) +
            FfiConverterString.INSTANCE.allocationSize(value.deviceId()) +
            FfiConverterMapStringString.INSTANCE.allocationSize(value.keys()) +
            FfiConverterSequenceString.INSTANCE.allocationSize(value.algorithms()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.displayName()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.isBlocked()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.locallyTrusted()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.crossSigningTrusted()) +
            FfiConverterLong.INSTANCE.allocationSize(value.firstTimeSeenTs()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.dehydrated())
      );
  }

  @Override
  public void write(Device value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.userId(), buf);
      FfiConverterString.INSTANCE.write(value.deviceId(), buf);
      FfiConverterMapStringString.INSTANCE.write(value.keys(), buf);
      FfiConverterSequenceString.INSTANCE.write(value.algorithms(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.displayName(), buf);
      FfiConverterBoolean.INSTANCE.write(value.isBlocked(), buf);
      FfiConverterBoolean.INSTANCE.write(value.locallyTrusted(), buf);
      FfiConverterBoolean.INSTANCE.write(value.crossSigningTrusted(), buf);
      FfiConverterLong.INSTANCE.write(value.firstTimeSeenTs(), buf);
      FfiConverterBoolean.INSTANCE.write(value.dehydrated(), buf);
  }
}
