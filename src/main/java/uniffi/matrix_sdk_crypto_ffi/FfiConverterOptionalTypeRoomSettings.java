package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeRoomSettings implements FfiConverterRustBuffer<RoomSettings> {
  INSTANCE;

  @Override
  public RoomSettings read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeRoomSettings.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(RoomSettings value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeRoomSettings.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(RoomSettings value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeRoomSettings.INSTANCE.write(value, buf);
    }
  }
}
