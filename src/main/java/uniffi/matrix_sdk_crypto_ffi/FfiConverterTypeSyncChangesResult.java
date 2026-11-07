package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSyncChangesResult implements FfiConverterRustBuffer<SyncChangesResult> {
  INSTANCE;

  @Override
  public SyncChangesResult read(java.nio.ByteBuffer buf) {
    return new SyncChangesResult(
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterSequenceTypeRoomKeyInfo.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(SyncChangesResult value) {
      return (
            FfiConverterSequenceString.INSTANCE.allocationSize(value.toDeviceEvents()) +
            FfiConverterSequenceTypeRoomKeyInfo.INSTANCE.allocationSize(value.roomKeyInfos())
      );
  }

  @Override
  public void write(SyncChangesResult value, java.nio.ByteBuffer buf) {
      FfiConverterSequenceString.INSTANCE.write(value.toDeviceEvents(), buf);
      FfiConverterSequenceTypeRoomKeyInfo.INSTANCE.write(value.roomKeyInfos(), buf);
  }
}
