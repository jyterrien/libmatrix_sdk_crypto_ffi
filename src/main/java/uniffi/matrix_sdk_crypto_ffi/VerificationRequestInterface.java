package uniffi.matrix_sdk_crypto_ffi;

/**
 * The verificatoin request object which then can transition into some concrete
 * verification method
 */
public interface VerificationRequestInterface {
    
    /**
     * Accept a verification requests that we share with the given user with
     * the given flow id.
     *
     * This will move the verification request into the ready state.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to accept the
     * verification requests.
     *
     * * `flow_id` - The ID that uniquely identifies the verification flow.
     *
     * * `methods` - A list of verification methods that we want to advertise
     * as supported.
     */public OutgoingVerificationRequest accept(java.util.List<java.lang.String> methods);
    
    /**
     * Cancel a verification for the given user with the given flow id using
     * the given cancel code.
     */public OutgoingVerificationRequest cancel();
    
    /**
     * Get info about the cancellation if the verification request has been
     * cancelled.
     */public CancelInfo cancelInfo();
    
    /**
     * Get the unique ID of this verification request
     */public java.lang.String flowId();
    
    /**
     * Has the verification flow that been cancelled.
     */public boolean isCancelled();
    
    /**
     * Has the verification flow that was started with this request finished.
     */public boolean isDone();
    
    /**
     * Has the verification request been answered by another device.
     */public boolean isPassive();
    
    /**
     * Is the verification request ready to start a verification flow.
     */public boolean isReady();
    
    /**
     * The id of the other device that is participating in this verification.
     */public java.lang.String otherDeviceId();
    
    /**
     * The id of the other user that is participating in this verification
     * request.
     */public java.lang.String otherUserId();
    
    /**
     * Get our own supported verification methods that we advertised.
     *
     * Will be present only we requested the verification or if we're in the
     * ready state.
     */public java.util.List<java.lang.String> ourSupportedMethods();
    
    /**
     * Get the room id if the verification is happening inside a room.
     */public java.lang.String roomId();
    
    /**
     * Pass data from a scanned QR code to an active verification request and
     * transition into QR code verification.
     *
     * This requires an active `VerificationRequest` to succeed, returns `None`
     * if no `VerificationRequest` is found or if the QR code data is invalid.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to start the QR
     * code verification.
     *
     * * `flow_id` - The ID of the verification request that initiated the
     * verification flow.
     *
     * * `data` - The data that was extracted from the scanned QR code as an
     * base64 encoded string, without padding.
     */public ScanResult scanQrCode(java.lang.String data);
    
    /**
     * Set a listener for changes in the verification request
     *
     * The given callback will be called whenever the state changes.
     */public void setChangesListener(VerificationRequestListener listener);
    
    /**
     * Transition from a verification request into QR code verification.
     *
     * This method should be called when one wants to display a QR code so the
     * other side can scan it and move the QR code verification forward.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to start the QR
     * code verification.
     *
     * * `flow_id` - The ID of the verification request that initiated the
     * verification flow.
     */public QrCode startQrVerification() throws CryptoStoreException;
    
    /**
     * Transition from a verification request into short auth string based
     * verification.
     *
     * # Arguments
     *
     * * `user_id` - The ID of the user for which we would like to start the
     * SAS verification.
     *
     * * `flow_id` - The ID of the verification request that initiated the
     * verification flow.
     */public StartSasResult startSasVerification() throws CryptoStoreException;
    
    /**
     * Get the current state of the verification request.
     */public VerificationRequestState state();
    
    /**
     * Get the supported verification methods of the other side.
     *
     * Will be present only if the other side requested the verification or if
     * we're in the ready state.
     */public java.util.List<java.lang.String> theirSupportedMethods();
    
    /**
     * Did we initiate the verification request
     */public boolean weStarted();
    
}

