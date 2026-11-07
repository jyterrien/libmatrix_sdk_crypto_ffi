package uniffi.matrix_sdk_crypto_ffi;


/**
 * Who can see a room's history.
 */

public enum HistoryVisibility {
    /**
     * Previous events are accessible to newly joined members from the point
     * they were invited onwards.
     *
     * Events stop being accessible when the member's state changes to
     * something other than *invite* or *join*.
     */
  INVITED,
    /**
     * Previous events are accessible to newly joined members from the point
     * they joined the room onwards.
     * Events stop being accessible when the member's state changes to
     * something other than *join*.
     */
  JOINED,
    /**
     * Previous events are always accessible to newly joined members.
     *
     * All events in the room are accessible, even those sent when the member
     * was not a part of the room.
     */
  SHARED,
    /**
     * All events while this is the `HistoryVisibility` value may be shared by
     * any participating homeserver with anyone, regardless of whether they
     * have ever joined the room.
     */
  WORLD_READABLE;

  
  
  

}


