package uniffi.matrix_sdk_crypto_ffi;

public enum FfiConverterOptionalTypePassphraseInfo implements FfiConverterRustBuffer<PassphraseInfo> {
  INSTANCE;

  @Override
  public PassphraseInfo read(java.nio.ByteBuffer buf) {
    if (buf.get() == (byte)0) {
      return null;
    }
    return FfiConverterTypePassphraseInfo.INSTANCE.read(buf);
  }

  @Override
  public long allocationSize(PassphraseInfo value) {
    if (value == null) {
      return 1L;
    } else {
      return 1L + FfiConverterTypePassphraseInfo.INSTANCE.allocationSize(value);
    }
  }

  @Override
  public void write(PassphraseInfo value, java.nio.ByteBuffer buf) {
    if (value == null) {
      buf.put((byte)0);
    } else {
      buf.put((byte)1);
      FfiConverterTypePassphraseInfo.INSTANCE.write(value, buf);
    }
  }
}
