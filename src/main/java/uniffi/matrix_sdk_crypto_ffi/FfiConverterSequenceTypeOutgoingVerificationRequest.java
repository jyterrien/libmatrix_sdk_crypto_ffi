package uniffi.matrix_sdk_crypto_ffi;


public enum FfiConverterSequenceTypeOutgoingVerificationRequest implements FfiConverterRustBuffer<java.util.List<OutgoingVerificationRequest>> {
  INSTANCE;

  @Override
  public java.util.List<OutgoingVerificationRequest> read(java.nio.ByteBuffer buf) {
    int len = buf.getInt();
    return java.util.stream.IntStream.range(0, len).mapToObj(_i -> FfiConverterTypeOutgoingVerificationRequest.INSTANCE.read(buf)).toList();
  }

  @Override
  public long allocationSize(java.util.List<OutgoingVerificationRequest> value) {
    long sizeForLength = 4L;
    long sizeForItems = value.stream().mapToLong(inner -> FfiConverterTypeOutgoingVerificationRequest.INSTANCE.allocationSize(inner)).sum();
    return sizeForLength + sizeForItems;
  }

  @Override
  public void write(java.util.List<OutgoingVerificationRequest> value, java.nio.ByteBuffer buf) {
    buf.putInt(value.size());
    value.forEach(inner -> FfiConverterTypeOutgoingVerificationRequest.INSTANCE.write(inner, buf));
  }
}
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
