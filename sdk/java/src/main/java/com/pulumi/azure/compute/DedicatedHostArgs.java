// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
     * 
     */
    @Import(name="autoReplaceOnFailure")
    private @Nullable Output<Boolean> autoReplaceOnFailure;

    /**
     * @return Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoReplaceOnFailure() {
        return Optional.ofNullable(this.autoReplaceOnFailure);
    }

    /**
     * Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dedicatedHostGroupId", required=true)
    private Output<String> dedicatedHostGroupId;

    /**
     * @return Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> dedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="platformFaultDomain", required=true)
    private Output<Integer> platformFaultDomain;

    /**
     * @return Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Specify the SKU name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `DSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `FSv2-Type2`, `DASv4-Type1`, `DCSv2-Type1`, `DDSv4-Type1`, `DSv3-Type1`, `DSv3-Type2`, `DSv3-Type3`, `DSv3-Type4`, `DSv4-Type1`, `EASv4-Type1`, `EDSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `ESv3-Type3`, `ESv3-Type4`, `ESv4-Type1`, `FSv2-Type2`, `FSv2-Type3`, `LSv2-Type1`, `MS-Type1`, `MSm-Type1`, `MSmv2-Type1`, `MSv2-Type1`, `NVASv4-Type1` and `NVSv3-Type1`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return Specify the SKU name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `DSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `FSv2-Type2`, `DASv4-Type1`, `DCSv2-Type1`, `DDSv4-Type1`, `DSv3-Type1`, `DSv3-Type2`, `DSv3-Type3`, `DSv3-Type4`, `DSv4-Type1`, `EASv4-Type1`, `EDSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `ESv3-Type3`, `ESv3-Type4`, `ESv4-Type1`, `FSv2-Type2`, `FSv2-Type3`, `LSv2-Type1`, `MS-Type1`, `MSm-Type1`, `MSmv2-Type1`, `MSv2-Type1`, `NVASv4-Type1` and `NVSv3-Type1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DedicatedHostArgs() {}

    private DedicatedHostArgs(DedicatedHostArgs $) {
        this.autoReplaceOnFailure = $.autoReplaceOnFailure;
        this.dedicatedHostGroupId = $.dedicatedHostGroupId;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.name = $.name;
        this.platformFaultDomain = $.platformFaultDomain;
        this.skuName = $.skuName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedHostArgs $;

        public Builder() {
            $ = new DedicatedHostArgs();
        }

        public Builder(DedicatedHostArgs defaults) {
            $ = new DedicatedHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoReplaceOnFailure Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoReplaceOnFailure(@Nullable Output<Boolean> autoReplaceOnFailure) {
            $.autoReplaceOnFailure = autoReplaceOnFailure;
            return this;
        }

        /**
         * @param autoReplaceOnFailure Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoReplaceOnFailure(Boolean autoReplaceOnFailure) {
            return autoReplaceOnFailure(Output.of(autoReplaceOnFailure));
        }

        /**
         * @param dedicatedHostGroupId Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostGroupId(Output<String> dedicatedHostGroupId) {
            $.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * @param dedicatedHostGroupId Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            return dedicatedHostGroupId(Output.of(dedicatedHostGroupId));
        }

        /**
         * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param location Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param platformFaultDomain Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomain(Output<Integer> platformFaultDomain) {
            $.platformFaultDomain = platformFaultDomain;
            return this;
        }

        /**
         * @param platformFaultDomain Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomain(Integer platformFaultDomain) {
            return platformFaultDomain(Output.of(platformFaultDomain));
        }

        /**
         * @param skuName Specify the SKU name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `DSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `FSv2-Type2`, `DASv4-Type1`, `DCSv2-Type1`, `DDSv4-Type1`, `DSv3-Type1`, `DSv3-Type2`, `DSv3-Type3`, `DSv3-Type4`, `DSv4-Type1`, `EASv4-Type1`, `EDSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `ESv3-Type3`, `ESv3-Type4`, `ESv4-Type1`, `FSv2-Type2`, `FSv2-Type3`, `LSv2-Type1`, `MS-Type1`, `MSm-Type1`, `MSmv2-Type1`, `MSv2-Type1`, `NVASv4-Type1` and `NVSv3-Type1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specify the SKU name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `DSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `FSv2-Type2`, `DASv4-Type1`, `DCSv2-Type1`, `DDSv4-Type1`, `DSv3-Type1`, `DSv3-Type2`, `DSv3-Type3`, `DSv3-Type4`, `DSv4-Type1`, `EASv4-Type1`, `EDSv4-Type1`, `ESv3-Type1`, `ESv3-Type2`, `ESv3-Type3`, `ESv3-Type4`, `ESv4-Type1`, `FSv2-Type2`, `FSv2-Type3`, `LSv2-Type1`, `MS-Type1`, `MSm-Type1`, `MSmv2-Type1`, `MSv2-Type1`, `NVASv4-Type1` and `NVSv3-Type1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DedicatedHostArgs build() {
            $.dedicatedHostGroupId = Objects.requireNonNull($.dedicatedHostGroupId, "expected parameter 'dedicatedHostGroupId' to be non-null");
            $.platformFaultDomain = Objects.requireNonNull($.platformFaultDomain, "expected parameter 'platformFaultDomain' to be non-null");
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            return $;
        }
    }

}