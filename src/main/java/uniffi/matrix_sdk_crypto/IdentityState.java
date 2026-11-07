package uniffi.matrix_sdk_crypto;


/**
 * The state of an identity - verified, pinned etc.
 */

public enum IdentityState {
    /**
     * The user is verified with us
     */
  VERIFIED,
    /**
     * Either this is the first identity we have seen for this user, or the
     * user has acknowledged a change of identity explicitly e.g. by
     * clicking OK on a notification.
     */
  PINNED,
    /**
     * The user's identity has changed since it was pinned. The user should be
     * notified about this and given the opportunity to acknowledge the
     * change, which will make the new identity pinned.
     * When the user acknowledges the change, the app should call
     * [`crate::OtherUserIdentity::pin_current_master_key`].
     */
  PIN_VIOLATION,
    /**
     * The user's identity has changed, and before that it was verified. This
     * is a serious problem. The user can either verify again to make this
     * identity verified, or withdraw verification
     * [`UserIdentity::withdraw_verification`] to make it pinned.
     */
  VERIFICATION_VIOLATION;

  
  
  

}


