package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeSasState implements FfiConverterRustBuffer<SasState> {
    INSTANCE;

    @Override
    public SasState read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new SasState.Created();
        case 2 -> new SasState.Started();
        case 3 -> new SasState.Accepted();
        case 4 -> new SasState.KeysExchanged(FfiConverterOptionalInt32Array.INSTANCE.read(buf),
          FfiConverterInt32Array.INSTANCE.read(buf)
          );
        case 5 -> new SasState.Confirmed();
        case 6 -> new SasState.Done();
        case 7 -> new SasState.Cancelled(FfiConverterTypeCancelInfo.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(SasState value) {
        return switch (value) {
          case SasState.Created() ->
            (4L);
          case SasState.Started() ->
            (4L);
          case SasState.Accepted() ->
            (4L);
          case SasState.KeysExchanged(var v1, var v2) ->
            (4L
            + FfiConverterOptionalInt32Array.INSTANCE.allocationSize(v1)
            + FfiConverterInt32Array.INSTANCE.allocationSize(v2));
          case SasState.Confirmed() ->
            (4L);
          case SasState.Done() ->
            (4L);
          case SasState.Cancelled(var v1) ->
            (4L
            + FfiConverterTypeCancelInfo.INSTANCE.allocationSize(v1));
        };
    }

    @Override
    public void write(SasState value, java.nio.ByteBuffer buf) {
      switch (value) {
        case SasState.Created() -> {
          buf.putInt(1);
        }
        case SasState.Started() -> {
          buf.putInt(2);
        }
        case SasState.Accepted() -> {
          buf.putInt(3);
        }
        case SasState.KeysExchanged(var v1, var v2) -> {
          buf.putInt(4);
          FfiConverterOptionalInt32Array.INSTANCE.write(v1, buf);
          FfiConverterInt32Array.INSTANCE.write(v2, buf);
        }
        case SasState.Confirmed() -> {
          buf.putInt(5);
        }
        case SasState.Done() -> {
          buf.putInt(6);
        }
        case SasState.Cancelled(var v1) -> {
          buf.putInt(7);
          FfiConverterTypeCancelInfo.INSTANCE.write(v1, buf);
        }
      };
    }
}


