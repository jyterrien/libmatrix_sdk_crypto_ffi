package uniffi.matrix_sdk_crypto;


/**
 * Strategy to collect the devices that should receive room keys for the
 * current discussion.
 */

public enum CollectStrategy {
    /**
     * Share with all (unblacklisted) devices.
     *
     * Not recommended, per the guidance of [MSC4153].
     *
     * (Used by Element X and Element Web in the legacy, non-"exclude insecure
     * devices" mode.)
     *
     * [MSC4153]: https://github.com/matrix-org/matrix-doc/pull/4153
     */
  ALL_DEVICES,
    /**
     * Share with all devices, except errors for *verified* users cause sharing
     * to fail with an error.
     *
     * In this strategy, if a verified user has an unsigned device,
     * key sharing will fail with a
     * [`SessionRecipientCollectionError::VerifiedUserHasUnsignedDevice`].
     * If a verified user has replaced their identity, key
     * sharing will fail with a
     * [`SessionRecipientCollectionError::VerifiedUserChangedIdentity`].
     *
     * Otherwise, keys are shared with unsigned devices as normal.
     *
     * Once the problematic devices are blacklisted or whitelisted the
     * caller can retry to share a second time.
     *
     * Not recommended, per the guidance of [MSC4153].
     *
     * [MSC4153]: https://github.com/matrix-org/matrix-doc/pull/4153
     */
  ERROR_ON_VERIFIED_USER_PROBLEM,
    /**
     * Share based on identity. Only distribute to devices signed by their
     * owner. If a user has no published identity he will not receive
     * any room keys.
     *
     * This is the recommended strategy: it is compliant with the guidance of
     * [MSC4153].
     *
     * (Used by Element Web and Element X in the "exclude insecure devices"
     * mode.)
     *
     * [MSC4153]: https://github.com/matrix-org/matrix-doc/pull/4153
     */
  IDENTITY_BASED_STRATEGY,
    /**
     * Only share keys with devices that we "trust". A device is trusted if any
     * of the following is true:
     * - It was manually marked as trusted.
     * - It was marked as verified via interactive verification.
     * - It is signed by its owner identity, and this identity has been
     * trusted via interactive verification.
     * - It is the current own device of the user.
     *
     * This strategy is compliant with [MSC4153], but is probably too strict
     * for normal use.
     *
     * (Used by Element Web when "only send messages to verified users" is
     * enabled.)
     *
     * [MSC4153]: https://github.com/matrix-org/matrix-doc/pull/4153
     */
  ONLY_TRUSTED_DEVICES;

  
  
  

}


