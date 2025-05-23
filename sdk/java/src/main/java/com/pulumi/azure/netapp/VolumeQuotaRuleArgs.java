// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeQuotaRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeQuotaRuleArgs Empty = new VolumeQuotaRuleArgs();

    /**
     * The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Quota size in kibibytes.
     * 
     */
    @Import(name="quotaSizeInKib", required=true)
    private Output<Integer> quotaSizeInKib;

    /**
     * @return Quota size in kibibytes.
     * 
     */
    public Output<Integer> quotaSizeInKib() {
        return this.quotaSizeInKib;
    }

    /**
     * Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** ` quota_target  ` must be used when `quota_type` is `IndividualGroupQuota` or `IndividualUserQuota`
     * 
     * &gt; **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
     * 
     */
    @Import(name="quotaTarget")
    private @Nullable Output<String> quotaTarget;

    /**
     * @return Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** ` quota_target  ` must be used when `quota_type` is `IndividualGroupQuota` or `IndividualUserQuota`
     * 
     * &gt; **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
     * 
     */
    public Optional<Output<String>> quotaTarget() {
        return Optional.ofNullable(this.quotaTarget);
    }

    /**
     * Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="quotaType", required=true)
    private Output<String> quotaType;

    /**
     * @return Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> quotaType() {
        return this.quotaType;
    }

    /**
     * The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="volumeId", required=true)
    private Output<String> volumeId;

    /**
     * @return The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    private VolumeQuotaRuleArgs() {}

    private VolumeQuotaRuleArgs(VolumeQuotaRuleArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.quotaSizeInKib = $.quotaSizeInKib;
        this.quotaTarget = $.quotaTarget;
        this.quotaType = $.quotaType;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeQuotaRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeQuotaRuleArgs $;

        public Builder() {
            $ = new VolumeQuotaRuleArgs();
        }

        public Builder(VolumeQuotaRuleArgs defaults) {
            $ = new VolumeQuotaRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param quotaSizeInKib Quota size in kibibytes.
         * 
         * @return builder
         * 
         */
        public Builder quotaSizeInKib(Output<Integer> quotaSizeInKib) {
            $.quotaSizeInKib = quotaSizeInKib;
            return this;
        }

        /**
         * @param quotaSizeInKib Quota size in kibibytes.
         * 
         * @return builder
         * 
         */
        public Builder quotaSizeInKib(Integer quotaSizeInKib) {
            return quotaSizeInKib(Output.of(quotaSizeInKib));
        }

        /**
         * @param quotaTarget Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** ` quota_target  ` must be used when `quota_type` is `IndividualGroupQuota` or `IndividualUserQuota`
         * 
         * &gt; **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
         * 
         * @return builder
         * 
         */
        public Builder quotaTarget(@Nullable Output<String> quotaTarget) {
            $.quotaTarget = quotaTarget;
            return this;
        }

        /**
         * @param quotaTarget Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** ` quota_target  ` must be used when `quota_type` is `IndividualGroupQuota` or `IndividualUserQuota`
         * 
         * &gt; **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
         * 
         * @return builder
         * 
         */
        public Builder quotaTarget(String quotaTarget) {
            return quotaTarget(Output.of(quotaTarget));
        }

        /**
         * @param quotaType Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder quotaType(Output<String> quotaType) {
            $.quotaType = quotaType;
            return this;
        }

        /**
         * @param quotaType Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder quotaType(String quotaType) {
            return quotaType(Output.of(quotaType));
        }

        /**
         * @param volumeId The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VolumeQuotaRuleArgs build() {
            if ($.quotaSizeInKib == null) {
                throw new MissingRequiredPropertyException("VolumeQuotaRuleArgs", "quotaSizeInKib");
            }
            if ($.quotaType == null) {
                throw new MissingRequiredPropertyException("VolumeQuotaRuleArgs", "quotaType");
            }
            if ($.volumeId == null) {
                throw new MissingRequiredPropertyException("VolumeQuotaRuleArgs", "volumeId");
            }
            return $;
        }
    }

}
