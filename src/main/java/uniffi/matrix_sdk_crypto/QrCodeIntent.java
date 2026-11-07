package uniffi.matrix_sdk_crypto;


/**
 * The intent of the device that generated/displayed the QR code.
 *
 * The QR code login mechanism supports both, the new device, as well as the
 * existing device to display the QR code.
 *
 * The different intents have an explicit one-byte identifier which gets added
 * to the QR code data.
 */

public enum QrCodeIntent {
    /**
     * Enum variant for the case where the new device is displaying the QR
     * code.
     */
  LOGIN,
    /**
     * Enum variant for the case where the existing device is displaying the QR
     * code.
     */
  RECIPROCATE;

  
  
  

}


