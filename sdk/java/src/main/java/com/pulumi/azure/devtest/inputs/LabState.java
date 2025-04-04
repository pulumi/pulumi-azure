// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabState extends com.pulumi.resources.ResourceArgs {

    public static final LabState Empty = new LabState();

    /**
     * The ID of the Storage Account used for Artifact Storage.
     * 
     */
    @Import(name="artifactsStorageAccountId")
    private @Nullable Output<String> artifactsStorageAccountId;

    /**
     * @return The ID of the Storage Account used for Artifact Storage.
     * 
     */
    public Optional<Output<String>> artifactsStorageAccountId() {
        return Optional.ofNullable(this.artifactsStorageAccountId);
    }

    /**
     * The ID of the Default Premium Storage Account for this Dev Test Lab.
     * 
     */
    @Import(name="defaultPremiumStorageAccountId")
    private @Nullable Output<String> defaultPremiumStorageAccountId;

    /**
     * @return The ID of the Default Premium Storage Account for this Dev Test Lab.
     * 
     */
    public Optional<Output<String>> defaultPremiumStorageAccountId() {
        return Optional.ofNullable(this.defaultPremiumStorageAccountId);
    }

    /**
     * The ID of the Default Storage Account for this Dev Test Lab.
     * 
     */
    @Import(name="defaultStorageAccountId")
    private @Nullable Output<String> defaultStorageAccountId;

    /**
     * @return The ID of the Default Storage Account for this Dev Test Lab.
     * 
     */
    public Optional<Output<String>> defaultStorageAccountId() {
        return Optional.ofNullable(this.defaultStorageAccountId);
    }

    /**
     * The ID of the Key used for this Dev Test Lab.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the Key used for this Dev Test Lab.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Storage Account used for Storage of Premium Data Disk.
     * 
     */
    @Import(name="premiumDataDiskStorageAccountId")
    private @Nullable Output<String> premiumDataDiskStorageAccountId;

    /**
     * @return The ID of the Storage Account used for Storage of Premium Data Disk.
     * 
     */
    public Optional<Output<String>> premiumDataDiskStorageAccountId() {
        return Optional.ofNullable(this.premiumDataDiskStorageAccountId);
    }

    /**
     * The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
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

    /**
     * The unique immutable identifier of the Dev Test Lab.
     * 
     */
    @Import(name="uniqueIdentifier")
    private @Nullable Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of the Dev Test Lab.
     * 
     */
    public Optional<Output<String>> uniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    private LabState() {}

    private LabState(LabState $) {
        this.artifactsStorageAccountId = $.artifactsStorageAccountId;
        this.defaultPremiumStorageAccountId = $.defaultPremiumStorageAccountId;
        this.defaultStorageAccountId = $.defaultStorageAccountId;
        this.keyVaultId = $.keyVaultId;
        this.location = $.location;
        this.name = $.name;
        this.premiumDataDiskStorageAccountId = $.premiumDataDiskStorageAccountId;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.uniqueIdentifier = $.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabState $;

        public Builder() {
            $ = new LabState();
        }

        public Builder(LabState defaults) {
            $ = new LabState(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactsStorageAccountId The ID of the Storage Account used for Artifact Storage.
         * 
         * @return builder
         * 
         */
        public Builder artifactsStorageAccountId(@Nullable Output<String> artifactsStorageAccountId) {
            $.artifactsStorageAccountId = artifactsStorageAccountId;
            return this;
        }

        /**
         * @param artifactsStorageAccountId The ID of the Storage Account used for Artifact Storage.
         * 
         * @return builder
         * 
         */
        public Builder artifactsStorageAccountId(String artifactsStorageAccountId) {
            return artifactsStorageAccountId(Output.of(artifactsStorageAccountId));
        }

        /**
         * @param defaultPremiumStorageAccountId The ID of the Default Premium Storage Account for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder defaultPremiumStorageAccountId(@Nullable Output<String> defaultPremiumStorageAccountId) {
            $.defaultPremiumStorageAccountId = defaultPremiumStorageAccountId;
            return this;
        }

        /**
         * @param defaultPremiumStorageAccountId The ID of the Default Premium Storage Account for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder defaultPremiumStorageAccountId(String defaultPremiumStorageAccountId) {
            return defaultPremiumStorageAccountId(Output.of(defaultPremiumStorageAccountId));
        }

        /**
         * @param defaultStorageAccountId The ID of the Default Storage Account for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder defaultStorageAccountId(@Nullable Output<String> defaultStorageAccountId) {
            $.defaultStorageAccountId = defaultStorageAccountId;
            return this;
        }

        /**
         * @param defaultStorageAccountId The ID of the Default Storage Account for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder defaultStorageAccountId(String defaultStorageAccountId) {
            return defaultStorageAccountId(Output.of(defaultStorageAccountId));
        }

        /**
         * @param keyVaultId The ID of the Key used for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key used for this Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param location Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param premiumDataDiskStorageAccountId The ID of the Storage Account used for Storage of Premium Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder premiumDataDiskStorageAccountId(@Nullable Output<String> premiumDataDiskStorageAccountId) {
            $.premiumDataDiskStorageAccountId = premiumDataDiskStorageAccountId;
            return this;
        }

        /**
         * @param premiumDataDiskStorageAccountId The ID of the Storage Account used for Storage of Premium Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder premiumDataDiskStorageAccountId(String premiumDataDiskStorageAccountId) {
            return premiumDataDiskStorageAccountId(Output.of(premiumDataDiskStorageAccountId));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        /**
         * @param uniqueIdentifier The unique immutable identifier of the Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(@Nullable Output<String> uniqueIdentifier) {
            $.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        /**
         * @param uniqueIdentifier The unique immutable identifier of the Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            return uniqueIdentifier(Output.of(uniqueIdentifier));
        }

        public LabState build() {
            return $;
        }
    }

}
