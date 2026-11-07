package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRoomKeyInfo implements FfiConverterRustBuffer<RoomKeyInfo> {
  INSTANCE;

  @Override
  public RoomKeyInfo read(java.nio.ByteBuffer buf) {
    return new RoomKeyInfo(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(RoomKeyInfo value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.algorithm()) +
            FfiConverterString.INSTANCE.allocationSize(value.roomId()) +
            FfiConverterString.INSTANCE.allocationSize(value.senderKey()) +
            FfiConverterString.INSTANCE.allocationSize(value.sessionId())
      );
  }

  @Override
  public void write(RoomKeyInfo value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.algorithm(), buf);
      FfiConverterString.INSTANCE.write(value.roomId(), buf);
      FfiConverterString.INSTANCE.write(value.senderKey(), buf);
      FfiConverterString.INSTANCE.write(value.sessionId(), buf);
  }
}
