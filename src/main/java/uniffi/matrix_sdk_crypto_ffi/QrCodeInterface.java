package uniffi.matrix_sdk_crypto_ffi;

/**
 * The `m.qr_code.scan.v1`, `m.qr_code.show.v1`, and `m.reciprocate.v1`
 * verification flow.
 */
public interface QrCodeInterface {
    
    /**
     * Cancel the QR code verification using the given cancel code.
     *
     * # Arguments
     *
     * * `cancel_code` - The error code for why the verification was cancelled,
     * manual cancellatio usually happens with `m.user` cancel code. The full
     * list of cancel codes can be found in the [spec]
     *
     * [spec]: https://spec.matrix.org/unstable/client-server-api/#mkeyverificationcancel
     */public OutgoingVerificationRequest cancel(java.lang.String cancelCode);
    
    /**
     * Get the CancelInfo of this QR code verification object.
     *
     * Will be `None` if the flow has not been cancelled.
     */public CancelInfo cancelInfo();
    
    /**
     * Confirm a verification was successful.
     *
     * This method should be called if we want to confirm that the other side
     * has scanned our QR code.
     */public ConfirmVerificationResult confirm();
    
    /**
     * Get the unique ID that identifies this QR code verification flow.
     */public java.lang.String flowId();
    
    /**
     * Generate data that should be encoded as a QR code.
     *
     * This method should be called right before a QR code should be displayed,
     * the returned data is base64 encoded (without padding) and needs to be
     * decoded on the other side before it can be put through a QR code
     * generator.
     */public java.lang.String generateQrCode();
    
    /**
     * Has the QR verification been scanned by the other side.
     *
     * When the verification object is in this state it's required that the
     * user confirms that the other side has scanned the QR code.
     */public boolean hasBeenScanned();
    
    /**
     * Has the verification flow been cancelled.
     */public boolean isCancelled();
    
    /**
     * Is the QR code verification done.
     */public boolean isDone();
    
    /**
     * Get the device ID of the other side.
     */public java.lang.String otherDeviceId();
    
    /**
     * Get the user id of the other side.
     */public java.lang.String otherUserId();
    
    /**
     * Have we successfully scanned the QR code and are able to send a
     * reciprocation event.
     */public boolean reciprocated();
    
    /**
     * Get the room id if the verification is happening inside a room.
     */public java.lang.String roomId();
    
    /**
     * Set a listener for changes in the QrCode verification process.
     *
     * The given callback will be called whenever the state changes.
     */public void setChangesListener(QrCodeListener listener);
    
    /**
     * Get the current state of the QrCode verification process.
     */public QrCodeState state();
    
    /**
     * Did we initiate the verification flow.
     */public boolean weStarted();
    
}

