package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeVerificationRequestState implements FfiConverterRustBuffer<VerificationRequestState> {
    INSTANCE;

    @Override
    public VerificationRequestState read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new VerificationRequestState.Requested();
        case 2 -> new VerificationRequestState.Ready(FfiConverterSequenceString.INSTANCE.read(buf),
          FfiConverterSequenceString.INSTANCE.read(buf)
          );
        case 3 -> new VerificationRequestState.Done();
        case 4 -> new VerificationRequestState.Cancelled(FfiConverterTypeCancelInfo.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(VerificationRequestState value) {
        return switch (value) {
          case VerificationRequestState.Requested() ->
            (4L);
          case VerificationRequestState.Ready(var v1, var v2) ->
            (4L
            + FfiConverterSequenceString.INSTANCE.allocationSize(v1)
            + FfiConverterSequenceString.INSTANCE.allocationSize(v2));
          case VerificationRequestState.Done() ->
            (4L);
          case VerificationRequestState.Cancelled(var v1) ->
            (4L
            + FfiConverterTypeCancelInfo.INSTANCE.allocationSize(v1));
        };
    }

    @Override
    public void write(VerificationRequestState value, java.nio.ByteBuffer buf) {
      switch (value) {
        case VerificationRequestState.Requested() -> {
          buf.putInt(1);
        }
        case VerificationRequestState.Ready(var v1, var v2) -> {
          buf.putInt(2);
          FfiConverterSequenceString.INSTANCE.write(v1, buf);
          FfiConverterSequenceString.INSTANCE.write(v2, buf);
        }
        case VerificationRequestState.Done() -> {
          buf.putInt(3);
        }
        case VerificationRequestState.Cancelled(var v1) -> {
          buf.putInt(4);
          FfiConverterTypeCancelInfo.INSTANCE.write(v1, buf);
        }
      };
    }
}



