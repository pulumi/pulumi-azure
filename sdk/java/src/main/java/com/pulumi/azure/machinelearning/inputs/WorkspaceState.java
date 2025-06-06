// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.inputs;

import com.pulumi.azure.machinelearning.inputs.WorkspaceEncryptionArgs;
import com.pulumi.azure.machinelearning.inputs.WorkspaceFeatureStoreArgs;
import com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs;
import com.pulumi.azure.machinelearning.inputs.WorkspaceManagedNetworkArgs;
import com.pulumi.azure.machinelearning.inputs.WorkspaceServerlessComputeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceState Empty = new WorkspaceState();

    /**
     * The ID of the Application Insights associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="applicationInsightsId")
    private @Nullable Output<String> applicationInsightsId;

    /**
     * @return The ID of the Application Insights associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> applicationInsightsId() {
        return Optional.ofNullable(this.applicationInsightsId);
    }

    /**
     * The ID of the container registry associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `admin_enabled` should be `true` in order to associate the Container Registry to this Machine Learning Workspace.
     * 
     */
    @Import(name="containerRegistryId")
    private @Nullable Output<String> containerRegistryId;

    /**
     * @return The ID of the container registry associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `admin_enabled` should be `true` in order to associate the Container Registry to this Machine Learning Workspace.
     * 
     */
    public Optional<Output<String>> containerRegistryId() {
        return Optional.ofNullable(this.containerRegistryId);
    }

    /**
     * The description of this Machine Learning Workspace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this Machine Learning Workspace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The url for the discovery service to identify regional endpoints for machine learning experimentation services.
     * 
     */
    @Import(name="discoveryUrl")
    private @Nullable Output<String> discoveryUrl;

    /**
     * @return The url for the discovery service to identify regional endpoints for machine learning experimentation services.
     * 
     */
    public Optional<Output<String>> discoveryUrl() {
        return Optional.ofNullable(this.discoveryUrl);
    }

    /**
     * An `encryption` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<WorkspaceEncryptionArgs> encryption;

    /**
     * @return An `encryption` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<WorkspaceEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * A `feature_store` block as defined below.
     * 
     */
    @Import(name="featureStore")
    private @Nullable Output<WorkspaceFeatureStoreArgs> featureStore;

    /**
     * @return A `feature_store` block as defined below.
     * 
     */
    public Optional<Output<WorkspaceFeatureStoreArgs>> featureStore() {
        return Optional.ofNullable(this.featureStore);
    }

    /**
     * Display name for this Machine Learning Workspace.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Display name for this Machine Learning Workspace.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to signal High Business Impact (HBI) data in the workspace and reduce diagnostic data collected by the service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="highBusinessImpact")
    private @Nullable Output<Boolean> highBusinessImpact;

    /**
     * @return Flag to signal High Business Impact (HBI) data in the workspace and reduce diagnostic data collected by the service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> highBusinessImpact() {
        return Optional.ofNullable(this.highBusinessImpact);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<WorkspaceIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<WorkspaceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The compute name for image build of the Machine Learning Workspace.
     * 
     */
    @Import(name="imageBuildComputeName")
    private @Nullable Output<String> imageBuildComputeName;

    /**
     * @return The compute name for image build of the Machine Learning Workspace.
     * 
     */
    public Optional<Output<String>> imageBuildComputeName() {
        return Optional.ofNullable(this.imageBuildComputeName);
    }

    /**
     * The ID of key vault associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of key vault associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * The type of the Workspace. Possible values are `Default`, `FeatureStore`. Defaults to `Default`
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of the Workspace. Possible values are `Default`, `FeatureStore`. Defaults to `Default`
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specifies the supported Azure location where the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `managed_network` block as defined below.
     * 
     */
    @Import(name="managedNetwork")
    private @Nullable Output<WorkspaceManagedNetworkArgs> managedNetwork;

    /**
     * @return A `managed_network` block as defined below.
     * 
     */
    public Optional<Output<WorkspaceManagedNetworkArgs>> managedNetwork() {
        return Optional.ofNullable(this.managedNetwork);
    }

    /**
     * Specifies the name of the Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The user assigned identity id that represents the workspace identity.
     * 
     */
    @Import(name="primaryUserAssignedIdentity")
    private @Nullable Output<String> primaryUserAssignedIdentity;

    /**
     * @return The user assigned identity id that represents the workspace identity.
     * 
     */
    public Optional<Output<String>> primaryUserAssignedIdentity() {
        return Optional.ofNullable(this.primaryUserAssignedIdentity);
    }

    /**
     * Enable public access when this Machine Learning Workspace is behind VNet. Defaults to `true`.
     * 
     * &gt; **Note:** `public_access_behind_virtual_network_enabled` is deprecated and will be removed in favour of the property `public_network_access_enabled`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Enable public access when this Machine Learning Workspace is behind VNet. Defaults to `true`.
     * 
     * &gt; **Note:** `public_access_behind_virtual_network_enabled` is deprecated and will be removed in favour of the property `public_network_access_enabled`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * Specifies the name of the Resource Group in which the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `serverless_compute` block as defined below.
     * 
     */
    @Import(name="serverlessCompute")
    private @Nullable Output<WorkspaceServerlessComputeArgs> serverlessCompute;

    /**
     * @return A `serverless_compute` block as defined below.
     * 
     */
    public Optional<Output<WorkspaceServerlessComputeArgs>> serverlessCompute() {
        return Optional.ofNullable(this.serverlessCompute);
    }

    /**
     * SKU/edition of the Machine Learning Workspace, possible values are `Free`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return SKU/edition of the Machine Learning Workspace, possible values are `Free`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The ID of the Storage Account associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `account_tier` cannot be `Premium` in order to associate the Storage Account to this Machine Learning Workspace.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `account_tier` cannot be `Premium` in order to associate the Storage Account to this Machine Learning Workspace.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
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
     * Enable V1 API features, enabling `v1_legacy_mode` may prevent you from using features provided by the v2 API. Defaults to `false`.
     * 
     */
    @Import(name="v1LegacyModeEnabled")
    private @Nullable Output<Boolean> v1LegacyModeEnabled;

    /**
     * @return Enable V1 API features, enabling `v1_legacy_mode` may prevent you from using features provided by the v2 API. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> v1LegacyModeEnabled() {
        return Optional.ofNullable(this.v1LegacyModeEnabled);
    }

    /**
     * The immutable id associated with this workspace.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The immutable id associated with this workspace.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private WorkspaceState() {}

    private WorkspaceState(WorkspaceState $) {
        this.applicationInsightsId = $.applicationInsightsId;
        this.containerRegistryId = $.containerRegistryId;
        this.description = $.description;
        this.discoveryUrl = $.discoveryUrl;
        this.encryption = $.encryption;
        this.featureStore = $.featureStore;
        this.friendlyName = $.friendlyName;
        this.highBusinessImpact = $.highBusinessImpact;
        this.identity = $.identity;
        this.imageBuildComputeName = $.imageBuildComputeName;
        this.keyVaultId = $.keyVaultId;
        this.kind = $.kind;
        this.location = $.location;
        this.managedNetwork = $.managedNetwork;
        this.name = $.name;
        this.primaryUserAssignedIdentity = $.primaryUserAssignedIdentity;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.serverlessCompute = $.serverlessCompute;
        this.skuName = $.skuName;
        this.storageAccountId = $.storageAccountId;
        this.tags = $.tags;
        this.v1LegacyModeEnabled = $.v1LegacyModeEnabled;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceState $;

        public Builder() {
            $ = new WorkspaceState();
        }

        public Builder(WorkspaceState defaults) {
            $ = new WorkspaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationInsightsId The ID of the Application Insights associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsightsId(@Nullable Output<String> applicationInsightsId) {
            $.applicationInsightsId = applicationInsightsId;
            return this;
        }

        /**
         * @param applicationInsightsId The ID of the Application Insights associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsightsId(String applicationInsightsId) {
            return applicationInsightsId(Output.of(applicationInsightsId));
        }

        /**
         * @param containerRegistryId The ID of the container registry associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `admin_enabled` should be `true` in order to associate the Container Registry to this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryId(@Nullable Output<String> containerRegistryId) {
            $.containerRegistryId = containerRegistryId;
            return this;
        }

        /**
         * @param containerRegistryId The ID of the container registry associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `admin_enabled` should be `true` in order to associate the Container Registry to this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryId(String containerRegistryId) {
            return containerRegistryId(Output.of(containerRegistryId));
        }

        /**
         * @param description The description of this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param discoveryUrl The url for the discovery service to identify regional endpoints for machine learning experimentation services.
         * 
         * @return builder
         * 
         */
        public Builder discoveryUrl(@Nullable Output<String> discoveryUrl) {
            $.discoveryUrl = discoveryUrl;
            return this;
        }

        /**
         * @param discoveryUrl The url for the discovery service to identify regional endpoints for machine learning experimentation services.
         * 
         * @return builder
         * 
         */
        public Builder discoveryUrl(String discoveryUrl) {
            return discoveryUrl(Output.of(discoveryUrl));
        }

        /**
         * @param encryption An `encryption` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<WorkspaceEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption An `encryption` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryption(WorkspaceEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param featureStore A `feature_store` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder featureStore(@Nullable Output<WorkspaceFeatureStoreArgs> featureStore) {
            $.featureStore = featureStore;
            return this;
        }

        /**
         * @param featureStore A `feature_store` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder featureStore(WorkspaceFeatureStoreArgs featureStore) {
            return featureStore(Output.of(featureStore));
        }

        /**
         * @param friendlyName Display name for this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Display name for this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param highBusinessImpact Flag to signal High Business Impact (HBI) data in the workspace and reduce diagnostic data collected by the service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder highBusinessImpact(@Nullable Output<Boolean> highBusinessImpact) {
            $.highBusinessImpact = highBusinessImpact;
            return this;
        }

        /**
         * @param highBusinessImpact Flag to signal High Business Impact (HBI) data in the workspace and reduce diagnostic data collected by the service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder highBusinessImpact(Boolean highBusinessImpact) {
            return highBusinessImpact(Output.of(highBusinessImpact));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<WorkspaceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(WorkspaceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param imageBuildComputeName The compute name for image build of the Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder imageBuildComputeName(@Nullable Output<String> imageBuildComputeName) {
            $.imageBuildComputeName = imageBuildComputeName;
            return this;
        }

        /**
         * @param imageBuildComputeName The compute name for image build of the Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder imageBuildComputeName(String imageBuildComputeName) {
            return imageBuildComputeName(Output.of(imageBuildComputeName));
        }

        /**
         * @param keyVaultId The ID of key vault associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of key vault associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param kind The type of the Workspace. Possible values are `Default`, `FeatureStore`. Defaults to `Default`
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of the Workspace. Possible values are `Default`, `FeatureStore`. Defaults to `Default`
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Specifies the supported Azure location where the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedNetwork A `managed_network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedNetwork(@Nullable Output<WorkspaceManagedNetworkArgs> managedNetwork) {
            $.managedNetwork = managedNetwork;
            return this;
        }

        /**
         * @param managedNetwork A `managed_network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedNetwork(WorkspaceManagedNetworkArgs managedNetwork) {
            return managedNetwork(Output.of(managedNetwork));
        }

        /**
         * @param name Specifies the name of the Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryUserAssignedIdentity The user assigned identity id that represents the workspace identity.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentity(@Nullable Output<String> primaryUserAssignedIdentity) {
            $.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
            return this;
        }

        /**
         * @param primaryUserAssignedIdentity The user assigned identity id that represents the workspace identity.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentity(String primaryUserAssignedIdentity) {
            return primaryUserAssignedIdentity(Output.of(primaryUserAssignedIdentity));
        }

        /**
         * @param publicNetworkAccessEnabled Enable public access when this Machine Learning Workspace is behind VNet. Defaults to `true`.
         * 
         * &gt; **Note:** `public_access_behind_virtual_network_enabled` is deprecated and will be removed in favour of the property `public_network_access_enabled`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Enable public access when this Machine Learning Workspace is behind VNet. Defaults to `true`.
         * 
         * &gt; **Note:** `public_access_behind_virtual_network_enabled` is deprecated and will be removed in favour of the property `public_network_access_enabled`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which the Machine Learning Workspace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverlessCompute A `serverless_compute` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serverlessCompute(@Nullable Output<WorkspaceServerlessComputeArgs> serverlessCompute) {
            $.serverlessCompute = serverlessCompute;
            return this;
        }

        /**
         * @param serverlessCompute A `serverless_compute` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serverlessCompute(WorkspaceServerlessComputeArgs serverlessCompute) {
            return serverlessCompute(Output.of(serverlessCompute));
        }

        /**
         * @param skuName SKU/edition of the Machine Learning Workspace, possible values are `Free`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName SKU/edition of the Machine Learning Workspace, possible values are `Free`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param storageAccountId The ID of the Storage Account associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `account_tier` cannot be `Premium` in order to associate the Storage Account to this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account associated with this Machine Learning Workspace. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `account_tier` cannot be `Premium` in order to associate the Storage Account to this Machine Learning Workspace.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
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
         * @param v1LegacyModeEnabled Enable V1 API features, enabling `v1_legacy_mode` may prevent you from using features provided by the v2 API. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder v1LegacyModeEnabled(@Nullable Output<Boolean> v1LegacyModeEnabled) {
            $.v1LegacyModeEnabled = v1LegacyModeEnabled;
            return this;
        }

        /**
         * @param v1LegacyModeEnabled Enable V1 API features, enabling `v1_legacy_mode` may prevent you from using features provided by the v2 API. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder v1LegacyModeEnabled(Boolean v1LegacyModeEnabled) {
            return v1LegacyModeEnabled(Output.of(v1LegacyModeEnabled));
        }

        /**
         * @param workspaceId The immutable id associated with this workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The immutable id associated with this workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceState build() {
            return $;
        }
    }

}
