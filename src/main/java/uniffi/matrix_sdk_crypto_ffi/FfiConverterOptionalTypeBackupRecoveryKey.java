package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeBackupRecoveryKey implements FfiConverterRustBuffer<BackupRecoveryKey> {
  INSTANCE;

  @Override
  public BackupRecoveryKey read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeBackupRecoveryKey.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(BackupRecoveryKey value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeBackupRecoveryKey.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(BackupRecoveryKey value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeBackupRecoveryKey.INSTANCE.write(value, buf);
    }
  }
}
