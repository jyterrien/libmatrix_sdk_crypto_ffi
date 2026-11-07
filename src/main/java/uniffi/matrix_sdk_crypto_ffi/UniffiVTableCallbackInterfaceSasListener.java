package uniffi.matrix_sdk_crypto_ffi;


public final class UniffiVTableCallbackInterfaceSasListener {
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
        java.lang.foreign.ValueLayout.ADDRESS.withName("uniffiFree"),
        java.lang.foreign.ValueLayout.ADDRESS.withName("uniffiClone"),
        java.lang.foreign.ValueLayout.ADDRESS.withName("onChange")
    );

    private static final long OFFSET_uniffiFree = LAYOUT.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("uniffiFree"));

    private static final long OFFSET_uniffiClone = LAYOUT.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("uniffiClone"));

    private static final long OFFSET_onChange = LAYOUT.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("onChange"));

    private UniffiVTableCallbackInterfaceSasListener() {}
    public static java.lang.foreign.MemorySegment getuniffiFree(java.lang.foreign.MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) seg.get(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_uniffiFree);
    }

    public static void setuniffiFree(java.lang.foreign.MemorySegment seg, java.lang.foreign.MemorySegment value) {
        seg.set(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_uniffiFree, value);
    }
    public static java.lang.foreign.MemorySegment getuniffiClone(java.lang.foreign.MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) seg.get(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_uniffiClone);
    }

    public static void setuniffiClone(java.lang.foreign.MemorySegment seg, java.lang.foreign.MemorySegment value) {
        seg.set(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_uniffiClone, value);
    }
    public static java.lang.foreign.MemorySegment getonChange(java.lang.foreign.MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) seg.get(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_onChange);
    }

    public static void setonChange(java.lang.foreign.MemorySegment seg, java.lang.foreign.MemorySegment value) {
        seg.set(java.lang.foreign.ValueLayout.ADDRESS_UNALIGNED, OFFSET_onChange, value);
    }

    /**
     * Allocate a new instance in the given arena.
     */
    public static java.lang.foreign.MemorySegment allocate(java.lang.foreign.SegmentAllocator allocator) {
        java.lang.foreign.MemorySegment seg = allocator.allocate(LAYOUT);
        seg.fill((byte) 0);
        return seg;
    }
}
