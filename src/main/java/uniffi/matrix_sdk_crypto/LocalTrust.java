package uniffi.matrix_sdk_crypto;


/**
 * The local trust state of a device.
 */

public enum LocalTrust {
    /**
     * The device has been verified and is trusted.
     */
  VERIFIED,
    /**
     * The device been blacklisted from communicating.
     */
  BLACK_LISTED,
    /**
     * The trust state of the device is being ignored.
     */
  IGNORED,
    /**
     * The trust state is unset.
     */
  UNSET;

  
  
  

}


