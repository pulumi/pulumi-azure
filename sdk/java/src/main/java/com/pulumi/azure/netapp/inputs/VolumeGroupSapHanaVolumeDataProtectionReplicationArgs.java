// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeGroupSapHanaVolumeDataProtectionReplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeGroupSapHanaVolumeDataProtectionReplicationArgs Empty = new VolumeGroupSapHanaVolumeDataProtectionReplicationArgs();

    /**
     * The endpoint type. Possible values are `dst` and `src`. Defaults to `dst`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Import(name="endpointType")
    private @Nullable Output<String> endpointType;

    /**
     * @return The endpoint type. Possible values are `dst` and `src`. Defaults to `dst`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Optional<Output<String>> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    /**
     * Location of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Import(name="remoteVolumeLocation", required=true)
    private Output<String> remoteVolumeLocation;

    /**
     * @return Location of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> remoteVolumeLocation() {
        return this.remoteVolumeLocation;
    }

    /**
     * Resource ID of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Import(name="remoteVolumeResourceId", required=true)
    private Output<String> remoteVolumeResourceId;

    /**
     * @return Resource ID of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * eplication frequency. Possible values are `10minutes`, `daily` and `hourly`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Import(name="replicationFrequency", required=true)
    private Output<String> replicationFrequency;

    /**
     * @return eplication frequency. Possible values are `10minutes`, `daily` and `hourly`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> replicationFrequency() {
        return this.replicationFrequency;
    }

    private VolumeGroupSapHanaVolumeDataProtectionReplicationArgs() {}

    private VolumeGroupSapHanaVolumeDataProtectionReplicationArgs(VolumeGroupSapHanaVolumeDataProtectionReplicationArgs $) {
        this.endpointType = $.endpointType;
        this.remoteVolumeLocation = $.remoteVolumeLocation;
        this.remoteVolumeResourceId = $.remoteVolumeResourceId;
        this.replicationFrequency = $.replicationFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeGroupSapHanaVolumeDataProtectionReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeGroupSapHanaVolumeDataProtectionReplicationArgs $;

        public Builder() {
            $ = new VolumeGroupSapHanaVolumeDataProtectionReplicationArgs();
        }

        public Builder(VolumeGroupSapHanaVolumeDataProtectionReplicationArgs defaults) {
            $ = new VolumeGroupSapHanaVolumeDataProtectionReplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointType The endpoint type. Possible values are `dst` and `src`. Defaults to `dst`. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(@Nullable Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType The endpoint type. Possible values are `dst` and `src`. Defaults to `dst`. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param remoteVolumeLocation Location of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder remoteVolumeLocation(Output<String> remoteVolumeLocation) {
            $.remoteVolumeLocation = remoteVolumeLocation;
            return this;
        }

        /**
         * @param remoteVolumeLocation Location of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder remoteVolumeLocation(String remoteVolumeLocation) {
            return remoteVolumeLocation(Output.of(remoteVolumeLocation));
        }

        /**
         * @param remoteVolumeResourceId Resource ID of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder remoteVolumeResourceId(Output<String> remoteVolumeResourceId) {
            $.remoteVolumeResourceId = remoteVolumeResourceId;
            return this;
        }

        /**
         * @param remoteVolumeResourceId Resource ID of the primary volume. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder remoteVolumeResourceId(String remoteVolumeResourceId) {
            return remoteVolumeResourceId(Output.of(remoteVolumeResourceId));
        }

        /**
         * @param replicationFrequency eplication frequency. Possible values are `10minutes`, `daily` and `hourly`. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder replicationFrequency(Output<String> replicationFrequency) {
            $.replicationFrequency = replicationFrequency;
            return this;
        }

        /**
         * @param replicationFrequency eplication frequency. Possible values are `10minutes`, `daily` and `hourly`. Changing this forces a new Application Volume Group to be created and data will be lost.
         * 
         * @return builder
         * 
         */
        public Builder replicationFrequency(String replicationFrequency) {
            return replicationFrequency(Output.of(replicationFrequency));
        }

        public VolumeGroupSapHanaVolumeDataProtectionReplicationArgs build() {
            if ($.remoteVolumeLocation == null) {
                throw new MissingRequiredPropertyException("VolumeGroupSapHanaVolumeDataProtectionReplicationArgs", "remoteVolumeLocation");
            }
            if ($.remoteVolumeResourceId == null) {
                throw new MissingRequiredPropertyException("VolumeGroupSapHanaVolumeDataProtectionReplicationArgs", "remoteVolumeResourceId");
            }
            if ($.replicationFrequency == null) {
                throw new MissingRequiredPropertyException("VolumeGroupSapHanaVolumeDataProtectionReplicationArgs", "replicationFrequency");
            }
            return $;
        }
    }

}
