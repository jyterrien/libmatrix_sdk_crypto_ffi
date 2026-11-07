package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypeUserIdentity implements FfiConverterRustBuffer<UserIdentity> {
  INSTANCE;

  @Override
  public UserIdentity read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypeUserIdentity.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(UserIdentity value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypeUserIdentity.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(UserIdentity value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypeUserIdentity.INSTANCE.write(value, buf);
    }
  }
}
