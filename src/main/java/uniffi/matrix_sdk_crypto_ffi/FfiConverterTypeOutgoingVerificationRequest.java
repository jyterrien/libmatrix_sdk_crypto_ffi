package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeOutgoingVerificationRequest implements FfiConverterRustBuffer<OutgoingVerificationRequest> {
    INSTANCE;

    @Override
    public OutgoingVerificationRequest read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new OutgoingVerificationRequest.ToDevice(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        case 2 -> new OutgoingVerificationRequest.InRoom(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(OutgoingVerificationRequest value) {
        return switch (value) {
          case OutgoingVerificationRequest.ToDevice(var v1, var v2, var v3) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3));
          case OutgoingVerificationRequest.InRoom(var v1, var v2, var v3, var v4) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3)
            + FfiConverterString.INSTANCE.allocationSize(v4));
        };
    }

    @Override
    public void write(OutgoingVerificationRequest value, java.nio.ByteBuffer buf) {
      switch (value) {
        case OutgoingVerificationRequest.ToDevice(var v1, var v2, var v3) -> {
          buf.putInt(1);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
        }
        case OutgoingVerificationRequest.InRoom(var v1, var v2, var v3, var v4) -> {
          buf.putInt(2);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
          FfiConverterString.INSTANCE.write(v4, buf);
        }
      };
    }
}


