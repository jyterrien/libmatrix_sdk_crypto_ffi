package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterSequenceTypeRequest implements FfiConverterRustBuffer<java.util.List<Request>> {
  INSTANCE;

  @Override
  public java.util.List<Request> read(java.nio.ByteBuffer buf) {
    int len = buf.getInt();
    return java.util.stream.IntStream.range(0, len).mapToObj(_i -> FfiConverterTypeRequest.INSTANCE.read(buf)).toList();
  }

  @Override
  public long allocationSize(java.util.List<Request> value) {
    long sizeForLength = 4L;
    long sizeForItems = value.stream().mapToLong(inner -> FfiConverterTypeRequest.INSTANCE.allocationSize(inner)).sum();
    return sizeForLength + sizeForItems;
  }

  @Override
  public void write(java.util.List<Request> value, java.nio.ByteBuffer buf) {
    buf.putInt(value.size());
    value.forEach(inner -> FfiConverterTypeRequest.INSTANCE.write(inner, buf));
  }
}
