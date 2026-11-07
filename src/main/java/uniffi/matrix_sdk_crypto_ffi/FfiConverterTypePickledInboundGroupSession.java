package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypePickledInboundGroupSession implements FfiConverterRustBuffer<PickledInboundGroupSession> {
  INSTANCE;

  @Override
  public PickledInboundGroupSession read(java.nio.ByteBuffer buf) {
    return new PickledInboundGroupSession(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterMapStringString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(PickledInboundGroupSession value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.pickle()) +
            FfiConverterString.INSTANCE.allocationSize(value.senderKey()) +
            FfiConverterMapStringString.INSTANCE.allocationSize(value.signingKey()) +
            FfiConverterString.INSTANCE.allocationSize(value.roomId()) +
            FfiConverterSequenceString.INSTANCE.allocationSize(value.forwardingChains()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.imported()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.backedUp())
      );
  }

  @Override
  public void write(PickledInboundGroupSession value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.pickle(), buf);
      FfiConverterString.INSTANCE.write(value.senderKey(), buf);
      FfiConverterMapStringString.INSTANCE.write(value.signingKey(), buf);
      FfiConverterString.INSTANCE.write(value.roomId(), buf);
      FfiConverterSequenceString.INSTANCE.write(value.forwardingChains(), buf);
      FfiConverterBoolean.INSTANCE.write(value.imported(), buf);
      FfiConverterBoolean.INSTANCE.write(value.backedUp(), buf);
  }
}
