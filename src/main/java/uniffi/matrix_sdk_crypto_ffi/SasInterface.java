package uniffi.matrix_sdk_crypto_ffi;

/**
 * The `m.sas.v1` verification flow.
 */
public interface SasInterface {
    
    /**
     * Accept that we're going forward with the short auth string verification.
     */public OutgoingVerificationRequest accept();
    
    /**
     * Cancel the SAS verification using the given cancel code.
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
     * Confirm a verification was successful.
     *
     * This method should be called if a short auth string should be confirmed
     * as matching.
     */public ConfirmVerificationResult confirm() throws CryptoStoreException;
    
    /**
     * Get the unique ID that identifies this SAS verification flow.
     */public java.lang.String flowId();
    
    /**
     * Get the decimal representation of the short auth string.
     *
     * *Note*: A SAS verification needs to be started and in the presentable
     * state for this to return the list of decimals, otherwise returns
     * `None`.
     */public int[] getDecimals();
    
    /**
     * Get a list of emoji indices of the emoji representation of the short
     * auth string.
     *
     * *Note*: A SAS verification needs to be started and in the presentable
     * state for this to return the list of emoji indices, otherwise returns
     * `None`.
     */public int[] getEmojiIndices();
    
    /**
     * Is the SAS flow done.
     */public boolean isDone();
    
    /**
     * Get the device ID of the other side.
     */public java.lang.String otherDeviceId();
    
    /**
     * Get the user id of the other side.
     */public java.lang.String otherUserId();
    
    /**
     * Get the room id if the verification is happening inside a room.
     */public java.lang.String roomId();
    
    /**
     * Set a listener for changes in the SAS verification process.
     *
     * The given callback will be called whenever the state changes.
     *
     * This method can be used to react to changes in the state of the
     * verification process, or rather the method can be used to handle
     * each step of the verification process.
     *
     * This method will spawn a tokio task on the Rust side, once we reach the
     * Done or Cancelled state, the task will stop listening for changes.
     *
     * # Flowchart
     *
     * The flow of the verification process is pictured below. Please note
     * that the process can be cancelled at each step of the process.
     * Either side can cancel the process.
     *
     * ```text
     * ┌───────┐
     * │Started│
     * └───┬───┘
     * │
     * ┌────⌄───┐
     * │Accepted│
     * └────┬───┘
     * │
     * ┌───────⌄──────┐
     * │Keys Exchanged│
     * └───────┬──────┘
     * │
     * ________⌄________
     * ╱                 ╲       ┌─────────┐
     * ╱   Does the short  ╲______│Cancelled│
     * ╲ auth string match ╱ no   └─────────┘
     * ╲_________________╱
     * │yes
     * │
     * ┌────⌄────┐
     * │Confirmed│
     * └────┬────┘
     * │
     * ┌───⌄───┐
     * │  Done │
     * └───────┘
     * ```
     */public void setChangesListener(SasListener listener);
    
    /**
     * Get the current state of the SAS verification process.
     */public SasState state();
    
    /**
     * Did we initiate the verification flow.
     */public boolean weStarted();
    
}

