package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeQrCodeState implements FfiConverterRustBuffer<QrCodeState> {
    INSTANCE;

    @Override
    public QrCodeState read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new QrCodeState.Started();
        case 2 -> new QrCodeState.Scanned();
        case 3 -> new QrCodeState.Confirmed();
        case 4 -> new QrCodeState.Reciprocated();
        case 5 -> new QrCodeState.Done();
        case 6 -> new QrCodeState.Cancelled(FfiConverterTypeCancelInfo.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(QrCodeState value) {
        return switch (value) {
          case QrCodeState.Started() ->
            (4L);
          case QrCodeState.Scanned() ->
            (4L);
          case QrCodeState.Confirmed() ->
            (4L);
          case QrCodeState.Reciprocated() ->
            (4L);
          case QrCodeState.Done() ->
            (4L);
          case QrCodeState.Cancelled(var v1) ->
            (4L
            + FfiConverterTypeCancelInfo.INSTANCE.allocationSize(v1));
        };
    }

    @Override
    public void write(QrCodeState value, java.nio.ByteBuffer buf) {
      switch (value) {
        case QrCodeState.Started() -> {
          buf.putInt(1);
        }
        case QrCodeState.Scanned() -> {
          buf.putInt(2);
        }
        case QrCodeState.Confirmed() -> {
          buf.putInt(3);
        }
        case QrCodeState.Reciprocated() -> {
          buf.putInt(4);
        }
        case QrCodeState.Done() -> {
          buf.putInt(5);
        }
        case QrCodeState.Cancelled(var v1) -> {
          buf.putInt(6);
          FfiConverterTypeCancelInfo.INSTANCE.write(v1, buf);
        }
      };
    }
}


