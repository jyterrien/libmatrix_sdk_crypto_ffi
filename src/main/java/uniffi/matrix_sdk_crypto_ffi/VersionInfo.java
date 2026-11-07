package uniffi.matrix_sdk_crypto_ffi;

/**
 * Build-time information about important crates that are used.
 */
public class VersionInfo {
    /**
     * The version of the matrix-sdk-crypto crate.
     */
    private java.lang.String version;
    /**
     * The version of the vodozemac crate.
     */
    private java.lang.String vodozemacVersion;
    /**
     * The Git commit hash of the crate's source tree at build time.
     */
    private java.lang.String gitSha;
    /**
     * The build-time output of the `git describe` command of the source tree
     * of crate.
     */
    private java.lang.String gitDescription;

    public VersionInfo(
        java.lang.String version, 
        java.lang.String vodozemacVersion, 
        java.lang.String gitSha, 
        java.lang.String gitDescription
    ) {
        
        this.version = version;
        
        this.vodozemacVersion = vodozemacVersion;
        
        this.gitSha = gitSha;
        
        this.gitDescription = gitDescription;
    }
    
    public java.lang.String version() {
        return this.version;
    }
    
    public java.lang.String vodozemacVersion() {
        return this.vodozemacVersion;
    }
    
    public java.lang.String gitSha() {
        return this.gitSha;
    }
    
    public java.lang.String gitDescription() {
        return this.gitDescription;
    }
    public void setVersion(java.lang.String version) {
        this.version = version;
    }
    public void setVodozemacVersion(java.lang.String vodozemacVersion) {
        this.vodozemacVersion = vodozemacVersion;
    }
    public void setGitSha(java.lang.String gitSha) {
        this.gitSha = gitSha;
    }
    public void setGitDescription(java.lang.String gitDescription) {
        this.gitDescription = gitDescription;
    }

    

    
    @Override
    public boolean equals(java.lang.Object _uniffiOther) {
        if (_uniffiOther instanceof VersionInfo) {
            VersionInfo _uniffiThat = (VersionInfo) _uniffiOther;
            return (
              java.util.Objects.equals(version, _uniffiThat.version) && 
              
              java.util.Objects.equals(vodozemacVersion, _uniffiThat.vodozemacVersion) && 
              
              java.util.Objects.equals(gitSha, _uniffiThat.gitSha) && 
              
              java.util.Objects.equals(gitDescription, _uniffiThat.gitDescription)
              
            );
        };
        return false;
    }
    @Override
    public int hashCode() {
        int _uniffiHash = 17;
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(version);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(vodozemacVersion);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(gitSha);
        _uniffiHash = 31 * _uniffiHash + java.util.Objects.hashCode(gitDescription);
        return _uniffiHash;
    }

    
    
    

}


