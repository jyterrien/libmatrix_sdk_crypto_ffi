package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRoomSettings implements FfiConverterRustBuffer<RoomSettings> {
  INSTANCE;

  @Override
  public RoomSettings read(java.nio.ByteBuffer buf) {
    return new RoomSettings(
      FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.read(buf),
      FfiConverterBoolean.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(RoomSettings value) {
      return (
            FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.allocationSize(value.algorithm()) +
            FfiConverterBoolean.INSTANCE.allocationSize(value.onlyAllowTrustedDevices())
      );
  }

  @Override
  public void write(RoomSettings value, java.nio.ByteBuffer buf) {
      FfiConverterTypeEventEncryptionAlgorithm.INSTANCE.write(value.algorithm(), buf);
      FfiConverterBoolean.INSTANCE.write(value.onlyAllowTrustedDevices(), buf);
  }
}
