package uniffi.matrix_sdk_common;


public enum FfiConverterTypeBackgroundTaskFailureReason implements FfiConverterRustBuffer<BackgroundTaskFailureReason> {
    INSTANCE;

    @Override
    public BackgroundTaskFailureReason read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new BackgroundTaskFailureReason.Panic(FfiConverterOptionalString.INSTANCE.read(buf),
          FfiConverterOptionalString.INSTANCE.read(buf)
          );
        case 2 -> new BackgroundTaskFailureReason.Error(FfiConverterString.INSTANCE.read(buf)
          );
        case 3 -> new BackgroundTaskFailureReason.EarlyTermination();
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(BackgroundTaskFailureReason value) {
        return switch (value) {
          case BackgroundTaskFailureReason.Panic(var v1, var v2) ->
            (4L
            + FfiConverterOptionalString.INSTANCE.allocationSize(v1)
            + FfiConverterOptionalString.INSTANCE.allocationSize(v2));
          case BackgroundTaskFailureReason.Error(var v1) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1));
          case BackgroundTaskFailureReason.EarlyTermination() ->
            (4L);
        };
    }

    @Override
    public void write(BackgroundTaskFailureReason value, java.nio.ByteBuffer buf) {
      switch (value) {
        case BackgroundTaskFailureReason.Panic(var v1, var v2) -> {
          buf.putInt(1);
          FfiConverterOptionalString.INSTANCE.write(v1, buf);
          FfiConverterOptionalString.INSTANCE.write(v2, buf);
        }
        case BackgroundTaskFailureReason.Error(var v1) -> {
          buf.putInt(2);
          FfiConverterString.INSTANCE.write(v1, buf);
        }
        case BackgroundTaskFailureReason.EarlyTermination() -> {
          buf.putInt(3);
        }
      };
    }
}


