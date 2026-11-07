package uniffi.matrix_sdk_crypto;



/**
 * Error type for the decoding of the [`QrCodeData`].
 */
public class LoginQrCodeDecodeException extends java.lang.Exception {
    private LoginQrCodeDecodeException(java.lang.String message) {
      super(message);
    }

    
    /**
     * The QR code data is no long enough, it's missing some fields.
     */public static class NotEnoughData extends LoginQrCodeDecodeException {
      public NotEnoughData(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * One of the URLs in the QR code data is not a valid UTF-8 encoded string.
     */public static class NotUtf8 extends LoginQrCodeDecodeException {
      public NotUtf8(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * One of the URLs in the QR code data could not be parsed.
     */public static class UrlParse extends LoginQrCodeDecodeException {
      public UrlParse(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * The QR code data contains an invalid intent, we expect the login
     * intent or the reciprocate intent.
     */public static class InvalidIntent extends LoginQrCodeDecodeException {
      public InvalidIntent(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * The QR code data contains an unsupported type.
     */public static class InvalidType extends LoginQrCodeDecodeException {
      public InvalidType(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * The base64 encoded variant of the QR code data is not a valid base64
     * string.
     */public static class Base64 extends LoginQrCodeDecodeException {
      public Base64(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * The QR code data doesn't contain the expected `MATRIX` prefix.
     */public static class InvalidPrefix extends LoginQrCodeDecodeException {
      public InvalidPrefix(java.lang.String message) {
        super(message);
      }
    }
    
}

