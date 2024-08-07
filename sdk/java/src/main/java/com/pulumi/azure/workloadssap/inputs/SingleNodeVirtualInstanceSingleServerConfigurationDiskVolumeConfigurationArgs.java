// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs Empty = new SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs();

    /**
     * The total number of disks required for the concerned volume. Possible values are at least `1`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="numberOfDisks", required=true)
    private Output<Integer> numberOfDisks;

    /**
     * @return The total number of disks required for the concerned volume. Possible values are at least `1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> numberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * The size of the Disk in GB. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sizeInGb", required=true)
    private Output<Integer> sizeInGb;

    /**
     * @return The size of the Disk in GB. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }

    /**
     * The name of the Disk SKU. Possible values are `Premium_LRS`, `PremiumV2_LRS`, `Premium_ZRS`, `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS` and `UltraSSD_LRS`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The name of the Disk SKU. Possible values are `Premium_LRS`, `PremiumV2_LRS`, `Premium_ZRS`, `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS` and `UltraSSD_LRS`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * Specifies the volumn name of the database disk. Possible values are `backup`, `hana/data`, `hana/log`, `hana/shared`, `os` and `usr/sap`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="volumeName", required=true)
    private Output<String> volumeName;

    /**
     * @return Specifies the volumn name of the database disk. Possible values are `backup`, `hana/data`, `hana/log`, `hana/shared`, `os` and `usr/sap`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> volumeName() {
        return this.volumeName;
    }

    private SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs() {}

    private SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs(SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs $) {
        this.numberOfDisks = $.numberOfDisks;
        this.sizeInGb = $.sizeInGb;
        this.skuName = $.skuName;
        this.volumeName = $.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs $;

        public Builder() {
            $ = new SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs();
        }

        public Builder(SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs defaults) {
            $ = new SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param numberOfDisks The total number of disks required for the concerned volume. Possible values are at least `1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDisks(Output<Integer> numberOfDisks) {
            $.numberOfDisks = numberOfDisks;
            return this;
        }

        /**
         * @param numberOfDisks The total number of disks required for the concerned volume. Possible values are at least `1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDisks(Integer numberOfDisks) {
            return numberOfDisks(Output.of(numberOfDisks));
        }

        /**
         * @param sizeInGb The size of the Disk in GB. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(Output<Integer> sizeInGb) {
            $.sizeInGb = sizeInGb;
            return this;
        }

        /**
         * @param sizeInGb The size of the Disk in GB. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(Integer sizeInGb) {
            return sizeInGb(Output.of(sizeInGb));
        }

        /**
         * @param skuName The name of the Disk SKU. Possible values are `Premium_LRS`, `PremiumV2_LRS`, `Premium_ZRS`, `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS` and `UltraSSD_LRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name of the Disk SKU. Possible values are `Premium_LRS`, `PremiumV2_LRS`, `Premium_ZRS`, `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS` and `UltraSSD_LRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param volumeName Specifies the volumn name of the database disk. Possible values are `backup`, `hana/data`, `hana/log`, `hana/shared`, `os` and `usr/sap`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName Specifies the volumn name of the database disk. Possible values are `backup`, `hana/data`, `hana/log`, `hana/shared`, `os` and `usr/sap`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs build() {
            if ($.numberOfDisks == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs", "numberOfDisks");
            }
            if ($.sizeInGb == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs", "sizeInGb");
            }
            if ($.skuName == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs", "skuName");
            }
            if ($.volumeName == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationDiskVolumeConfigurationArgs", "volumeName");
            }
            return $;
        }
    }

}
