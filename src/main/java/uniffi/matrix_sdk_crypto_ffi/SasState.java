package uniffi.matrix_sdk_crypto_ffi;

/**
 * An Enum describing the state the SAS verification is in.
 */
public sealed interface SasState {
  
    /**
     * The verification has been created, the protocols that should be used
     * have been proposed to the other party.
     */
  record Created() implements SasState {
    
    
    

  }
  
  
    /**
     * The verification has been started, the other party proposed the
     * protocols that should be used and that can be accepted.
     */
  record Started() implements SasState {
    
    
    

  }
  
  
    /**
     * The verification has been accepted and both sides agreed to a set of
     * protocols that will be used for the verification process.
     */
  record Accepted() implements SasState {
    
    
    

  }
  
  
    /**
     * The public keys have been exchanged and the short auth string can be
     * presented to the user.
     */
  record KeysExchanged(
        /**
         * The emojis that represent the short auth string, will be `None` if
         * the emoji SAS method wasn't one of accepted protocols.
         */
    int[] emojis, 
        /**
         * The list of decimals that represent the short auth string.
         */
    int[] decimals) implements SasState {
    
    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
      if (_uniffiOther instanceof KeysExchanged) {
        KeysExchanged _uniffiThat = (KeysExchanged) _uniffiOther;
        return (
          UniffiDeepValue.equals(emojis, _uniffiThat.emojis) && 
          
          UniffiDeepValue.equals(decimals, _uniffiThat.decimals)
          
        );
      };
      return false;
    }
    @Override
    public int hashCode() {
      int _uniffiHash = 17;
      _uniffiHash = 31 * _uniffiHash + UniffiDeepValue.hashCode(emojis);
      _uniffiHash = 31 * _uniffiHash + UniffiDeepValue.hashCode(decimals);
      return _uniffiHash;
    }
    

  }
  
    /**
     * The verification process has been confirmed from our side, we're waiting
     * for the other side to confirm as well.
     */
  record Confirmed() implements SasState {
    
    
    

  }
  
  
    /**
     * The verification process has been successfully concluded.
     */
  record Done() implements SasState {
    
    
    

  }
  
  
    /**
     * The verification process has been cancelled.
     */
  record Cancelled(
        /**
         * Information about the reason of the cancellation.
         */
    uniffi.matrix_sdk_crypto_ffi.CancelInfo cancelInfo) implements SasState {
    
    
    

  }
  

  
}

