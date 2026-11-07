package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterTypeUserIdentity implements FfiConverterRustBuffer<UserIdentity> {
    INSTANCE;

    @Override
    public UserIdentity read(java.nio.ByteBuffer buf) {
      return switch (buf.getInt()) {
        case 1 -> new UserIdentity.Own(FfiConverterString.INSTANCE.read(buf),
          FfiConverterBoolean.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterBoolean.INSTANCE.read(buf)
          );
        case 2 -> new UserIdentity.Other(FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterString.INSTANCE.read(buf),
          FfiConverterBoolean.INSTANCE.read(buf)
          );
        default ->
          throw new java.lang.RuntimeException("invalid enum value, something is very wrong!");
      };
    }@Override
    public long allocationSize(UserIdentity value) {
        return switch (value) {
          case UserIdentity.Own(var v1, var v2, var v3, var v4, var v5, var v6) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterBoolean.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3)
            + FfiConverterString.INSTANCE.allocationSize(v4)
            + FfiConverterString.INSTANCE.allocationSize(v5)
            + FfiConverterBoolean.INSTANCE.allocationSize(v6));
          case UserIdentity.Other(var v1, var v2, var v3, var v4) ->
            (4L
            + FfiConverterString.INSTANCE.allocationSize(v1)
            + FfiConverterString.INSTANCE.allocationSize(v2)
            + FfiConverterString.INSTANCE.allocationSize(v3)
            + FfiConverterBoolean.INSTANCE.allocationSize(v4));
        };
    }

    @Override
    public void write(UserIdentity value, java.nio.ByteBuffer buf) {
      switch (value) {
        case UserIdentity.Own(var v1, var v2, var v3, var v4, var v5, var v6) -> {
          buf.putInt(1);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterBoolean.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
          FfiConverterString.INSTANCE.write(v4, buf);
          FfiConverterString.INSTANCE.write(v5, buf);
          FfiConverterBoolean.INSTANCE.write(v6, buf);
        }
        case UserIdentity.Other(var v1, var v2, var v3, var v4) -> {
          buf.putInt(2);
          FfiConverterString.INSTANCE.write(v1, buf);
          FfiConverterString.INSTANCE.write(v2, buf);
          FfiConverterString.INSTANCE.write(v3, buf);
          FfiConverterBoolean.INSTANCE.write(v4, buf);
        }
      };
    }
}


