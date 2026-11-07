package uniffi.matrix_sdk_crypto;



/**
 * Error type for the creation of a new [`QrCodeData`] struct.
 */
public class QrCodeCreationException extends java.lang.Exception {
    private QrCodeCreationException(java.lang.String message) {
      super(message);
    }

    
    /**
     * The base URL of the homeserver needs to be at most [`u8::MAX`] bytes
     * long, otherwise it doesn't fit into the QR code.
     */public static class TooLongBaseUrl extends QrCodeCreationException {
      public TooLongBaseUrl(java.lang.String message) {
        super(message);
      }
    }
    
    /**
     * The rendezvous ID of the channel needs to be at most [`u8::MAX`] bytes
     * long, otherwise it doesn't fit into the QR code.
     */public static class TooLongRendezvousId extends QrCodeCreationException {
      public TooLongRendezvousId(java.lang.String message) {
        super(message);
      }
    }
    
}

