// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVolumeGroupOracleVolumeDataProtectionReplication {
    /**
     * @return The endpoint type.
     * 
     */
    private String endpointType;
    /**
     * @return Location of the primary volume.
     * 
     */
    private String remoteVolumeLocation;
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    private String remoteVolumeResourceId;
    /**
     * @return Replication frequency.
     * 
     */
    private String replicationFrequency;

    private GetVolumeGroupOracleVolumeDataProtectionReplication() {}
    /**
     * @return The endpoint type.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return Location of the primary volume.
     * 
     */
    public String remoteVolumeLocation() {
        return this.remoteVolumeLocation;
    }
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }
    /**
     * @return Replication frequency.
     * 
     */
    public String replicationFrequency() {
        return this.replicationFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeGroupOracleVolumeDataProtectionReplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointType;
        private String remoteVolumeLocation;
        private String remoteVolumeResourceId;
        private String replicationFrequency;
        public Builder() {}
        public Builder(GetVolumeGroupOracleVolumeDataProtectionReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.remoteVolumeLocation = defaults.remoteVolumeLocation;
    	      this.remoteVolumeResourceId = defaults.remoteVolumeResourceId;
    	      this.replicationFrequency = defaults.replicationFrequency;
        }

        @CustomType.Setter
        public Builder endpointType(String endpointType) {
            if (endpointType == null) {
              throw new MissingRequiredPropertyException("GetVolumeGroupOracleVolumeDataProtectionReplication", "endpointType");
            }
            this.endpointType = endpointType;
            return this;
        }
        @CustomType.Setter
        public Builder remoteVolumeLocation(String remoteVolumeLocation) {
            if (remoteVolumeLocation == null) {
              throw new MissingRequiredPropertyException("GetVolumeGroupOracleVolumeDataProtectionReplication", "remoteVolumeLocation");
            }
            this.remoteVolumeLocation = remoteVolumeLocation;
            return this;
        }
        @CustomType.Setter
        public Builder remoteVolumeResourceId(String remoteVolumeResourceId) {
            if (remoteVolumeResourceId == null) {
              throw new MissingRequiredPropertyException("GetVolumeGroupOracleVolumeDataProtectionReplication", "remoteVolumeResourceId");
            }
            this.remoteVolumeResourceId = remoteVolumeResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder replicationFrequency(String replicationFrequency) {
            if (replicationFrequency == null) {
              throw new MissingRequiredPropertyException("GetVolumeGroupOracleVolumeDataProtectionReplication", "replicationFrequency");
            }
            this.replicationFrequency = replicationFrequency;
            return this;
        }
        public GetVolumeGroupOracleVolumeDataProtectionReplication build() {
            final var _resultValue = new GetVolumeGroupOracleVolumeDataProtectionReplication();
            _resultValue.endpointType = endpointType;
            _resultValue.remoteVolumeLocation = remoteVolumeLocation;
            _resultValue.remoteVolumeResourceId = remoteVolumeResourceId;
            _resultValue.replicationFrequency = replicationFrequency;
            return _resultValue;
        }
    }
}
