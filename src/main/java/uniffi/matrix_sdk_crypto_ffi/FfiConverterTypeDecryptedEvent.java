package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeDecryptedEvent implements FfiConverterRustBuffer<DecryptedEvent> {
  INSTANCE;

  @Override
  public DecryptedEvent read(java.nio.ByteBuffer buf) {
    return new DecryptedEvent(
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterString.INSTANCE.read(buf),
      FfiConverterOptionalString.INSTANCE.read(buf),
      FfiConverterSequenceString.INSTANCE.read(buf),
      FfiConverterTypeShieldState.INSTANCE.read(buf)
    );
  }

  @Override
  public long allocationSize(DecryptedEvent value) {
      return (
            FfiConverterString.INSTANCE.allocationSize(value.clearEvent()) +
            FfiConverterString.INSTANCE.allocationSize(value.senderCurve25519Key()) +
            FfiConverterOptionalString.INSTANCE.allocationSize(value.claimedEd25519Key()) +
            FfiConverterSequenceString.INSTANCE.allocationSize(value.forwardingCurve25519Chain()) +
            FfiConverterTypeShieldState.INSTANCE.allocationSize(value.shieldState())
      );
  }

  @Override
  public void write(DecryptedEvent value, java.nio.ByteBuffer buf) {
      FfiConverterString.INSTANCE.write(value.clearEvent(), buf);
      FfiConverterString.INSTANCE.write(value.senderCurve25519Key(), buf);
      FfiConverterOptionalString.INSTANCE.write(value.claimedEd25519Key(), buf);
      FfiConverterSequenceString.INSTANCE.write(value.forwardingCurve25519Chain(), buf);
      FfiConverterTypeShieldState.INSTANCE.write(value.shieldState(), buf);
  }
}
