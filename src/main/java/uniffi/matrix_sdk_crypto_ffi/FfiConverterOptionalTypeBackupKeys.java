package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeBackupKeys implements FfiConverterRustBuffer<BackupKeys> {
  INSTANCE;

  @Override
  public BackupKeys read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeBackupKeys.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(BackupKeys value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeBackupKeys.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(BackupKeys value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeBackupKeys.INSTANCE.write(value, buf);
    }
  }
}
