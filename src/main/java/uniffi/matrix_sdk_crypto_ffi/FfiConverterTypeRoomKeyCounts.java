package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRoomKeyCounts implements FfiConverterRustBuffer<RoomKeyCounts> {
  INSTANCE;

  @Override
  public RoomKeyCounts read(java.nio.ByteBuffer buf) {
    return new RoomKeyCounts(
      FfiConverterLong.INSTANCE.read(buf),
      FfiConverterLong.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(RoomKeyCounts value) {
      return (
            FfiConverterLong.INSTANCE.allocationSize(value.total()) +
            FfiConverterLong.INSTANCE.allocationSize(value.backedUp())
      );
  }

  @Override
  public void write(RoomKeyCounts value, java.nio.ByteBuffer buf) {
      FfiConverterLong.INSTANCE.write(value.total(), buf);
      FfiConverterLong.INSTANCE.write(value.backedUp(), buf);
  }
}
