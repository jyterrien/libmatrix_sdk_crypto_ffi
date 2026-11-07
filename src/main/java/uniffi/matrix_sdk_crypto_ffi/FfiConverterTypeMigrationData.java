package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeMigrationData implements FfiConverterRustBuffer<MigrationData> {
  INSTANCE;

  @Override
  public MigrationData read(java.nio.ByteBuffer buf) {
    return new MigrationData(
      FfiConverterTypePickledAccount.INSTANCE.read(buf),
      FfiConverterSequenceTypePickledSession.INSTANCE.read(buf),
      FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.read(buf),
      FfiConverterByteArray.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterTypeCrossSigningKeyExport.INSTANCE.read(buf),
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterMapStringTypeRoomSettings.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(MigrationData value) {
      return (
            FfiConverterTypePickledAccount.INSTANCE.allocationSize(value.account()) +
            FfiConverterSequenceTypePickledSession.INSTANCE.allocationSize(value.sessions()) +
            FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.allocationSize(value.inboundGroupSessions()) +
            FfiConverterByteArray.INSTANCE.allocationSize(value.pickleKey()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.backupVersion()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.backupRecoveryKey()) +
            FfiConverterTypeCrossSigningKeyExport.INSTANCE.allocationSize(value.crossSigning()) +
            FfiConverterSequenceString.INSTANCE.allocationSize(value.trackedUsers()) +
            FfiConverterMapStringTypeRoomSettings.INSTANCE.allocationSize(value.roomSettings())
      );
  }

  @Override
  public void write(MigrationData value, java.nio.ByteBuffer buf) {
      FfiConverterTypePickledAccount.INSTANCE.write(value.account(), buf);
      FfiConverterSequenceTypePickledSession.INSTANCE.write(value.sessions(), buf);
      FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.write(value.inboundGroupSessions(), buf);
      FfiConverterByteArray.INSTANCE.write(value.pickleKey(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.backupVersion(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.backupRecoveryKey(), buf);
      FfiConverterTypeCrossSigningKeyExport.INSTANCE.write(value.crossSigning(), buf);
      FfiConverterSequenceString.INSTANCE.write(value.trackedUsers(), buf);
      FfiConverterMapStringTypeRoomSettings.INSTANCE.write(value.roomSettings(), buf);
  }
}
