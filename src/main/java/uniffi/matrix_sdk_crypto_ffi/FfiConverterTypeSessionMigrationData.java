package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSessionMigrationData implements FfiConverterRustBuffer<SessionMigrationData> {
  INSTANCE;

  @Override
  public SessionMigrationData read(java.nio.ByteBuffer buf) {
    return new SessionMigrationData(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterSequenceTypePickledSession.INSTANCE.read(buf),
      FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.read(buf),
      FfiConverterByteArray.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(SessionMigrationData value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.userId()) +
            FfiConverterString.INSTANCE.allocationSize(value.deviceId()) +
            FfiConverterString.INSTANCE.allocationSize(value.curve25519Key()) +
            FfiConverterString.INSTANCE.allocationSize(value.ed25519Key()) +
            FfiConverterSequenceTypePickledSession.INSTANCE.allocationSize(value.sessions()) +
            FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.allocationSize(value.inboundGroupSessions()) +
            FfiConverterByteArray.INSTANCE.allocationSize(value.pickleKey())
      );
  }

  @Override
  public void write(SessionMigrationData value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.userId(), buf);
      FfiConverterString.INSTANCE.write(value.deviceId(), buf);
      FfiConverterString.INSTANCE.write(value.curve25519Key(), buf);
      FfiConverterString.INSTANCE.write(value.ed25519Key(), buf);
      FfiConverterSequenceTypePickledSession.INSTANCE.write(value.sessions(), buf);
      FfiConverterSequenceTypePickledInboundGroupSession.INSTANCE.write(value.inboundGroupSessions(), buf);
      FfiConverterByteArray.INSTANCE.write(value.pickleKey(), buf);
  }
}
