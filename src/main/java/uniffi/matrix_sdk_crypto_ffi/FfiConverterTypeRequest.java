package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeRequest implements FfiConverterRustBuffer<Request> {
    INSTANCE;

    @Override
    public Request read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new Request.ToDevice(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        case 2 -> new Request.KeysUpload(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        case 3 -> new Request.KeysQuery(FfiConverterString.INSTANCE.read(buf),
          FfiConverterSequenceString.INSTANCE.read(buf)
          );
        case 4 -> new Request.KeysClaim(FfiConverterString.INSTANCE.read(buf),
          FfiConverterMapStringMapStringString.INSTANCE.read(buf)
          );
        case 5 -> new Request.KeysBackup(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        case 6 -> new Request.RoomMessage(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        case 7 -> new Request.SignatureUpload(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(Request value) {
        return switch (value) {
          case Request.ToDevice(var v1, var v2, var v3) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3));
          case Request.KeysUpload(var v1, var v2) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2));
          case Request.KeysQuery(var v1, var v2) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterSequenceString.INSTANCE.allocationSize(v2));
          case Request.KeysClaim(var v1, var v2) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterMapStringMapStringString.INSTANCE.allocationSize(v2));
          case Request.KeysBackup(var v1, var v2, var v3) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3));
          case Request.RoomMessage(var v1, var v2, var v3, var v4) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3)
            + FfiConverterString.INSTANCE.allocationSize(v4));
          case Request.SignatureUpload(var v1, var v2) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2));
        };
    }

    @Override
    public void write(Request value, java.nio.ByteBuffer buf) {
      switch (value) {
        case Request.ToDevice(var v1, var v2, var v3) -> {
          buf.putInt(1);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
        }
        case Request.KeysUpload(var v1, var v2) -> {
          buf.putInt(2);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
        }
        case Request.KeysQuery(var v1, var v2) -> {
          buf.putInt(3);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterSequenceString.INSTANCE.write(v2, buf);
        }
        case Request.KeysClaim(var v1, var v2) -> {
          buf.putInt(4);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterMapStringMapStringString.INSTANCE.write(v2, buf);
        }
        case Request.KeysBackup(var v1, var v2, var v3) -> {
          buf.putInt(5);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
        }
        case Request.RoomMessage(var v1, var v2, var v3, var v4) -> {
          buf.putInt(6);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
          FfiConverterString.INSTANCE.write(v4, buf);
        }
        case Request.SignatureUpload(var v1, var v2) -> {
          buf.putInt(7);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
        }
      };
    }
}


