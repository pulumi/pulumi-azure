// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.containerservice.inputs.RegistryEncryptionArgs;
import com.pulumi.azure.containerservice.inputs.RegistryGeoreplicationArgs;
import com.pulumi.azure.containerservice.inputs.RegistryIdentityArgs;
import com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * Specifies whether the admin user is enabled. Defaults to `false`.
     * 
     */
    @Import(name="adminEnabled")
    private @Nullable Output<Boolean> adminEnabled;

    /**
     * @return Specifies whether the admin user is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> adminEnabled() {
        return Optional.ofNullable(this.adminEnabled);
    }

    /**
     * Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
     * 
     */
    @Import(name="anonymousPullEnabled")
    private @Nullable Output<Boolean> anonymousPullEnabled;

    /**
     * @return Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
     * 
     */
    public Optional<Output<Boolean>> anonymousPullEnabled() {
        return Optional.ofNullable(this.anonymousPullEnabled);
    }

    /**
     * Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
     * 
     */
    @Import(name="dataEndpointEnabled")
    private @Nullable Output<Boolean> dataEndpointEnabled;

    /**
     * @return Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
     * 
     */
    public Optional<Output<Boolean>> dataEndpointEnabled() {
        return Optional.ofNullable(this.dataEndpointEnabled);
    }

    /**
     * An `encryption` block as documented below.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<RegistryEncryptionArgs> encryption;

    /**
     * @return An `encryption` block as documented below.
     * 
     */
    public Optional<Output<RegistryEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `public_network_access_enabled` is also set to `false`.
     * 
     * &gt; **Note:** `quarantine_policy_enabled`, `retention_policy_in_days`, `trust_policy_enabled`, `export_policy_enabled` and `zone_redundancy_enabled` are only supported on resources with the `Premium` SKU.
     * 
     */
    @Import(name="exportPolicyEnabled")
    private @Nullable Output<Boolean> exportPolicyEnabled;

    /**
     * @return Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `public_network_access_enabled` is also set to `false`.
     * 
     * &gt; **Note:** `quarantine_policy_enabled`, `retention_policy_in_days`, `trust_policy_enabled`, `export_policy_enabled` and `zone_redundancy_enabled` are only supported on resources with the `Premium` SKU.
     * 
     */
    public Optional<Output<Boolean>> exportPolicyEnabled() {
        return Optional.ofNullable(this.exportPolicyEnabled);
    }

    /**
     * One or more `georeplications` blocks as documented below.
     * 
     * &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
     * 
     * &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
     * 
     * &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
     * 
     */
    @Import(name="georeplications")
    private @Nullable Output<List<RegistryGeoreplicationArgs>> georeplications;

    /**
     * @return One or more `georeplications` blocks as documented below.
     * 
     * &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
     * 
     * &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
     * 
     * &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
     * 
     */
    public Optional<Output<List<RegistryGeoreplicationArgs>>> georeplications() {
        return Optional.ofNullable(this.georeplications);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<RegistryIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<RegistryIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
     * 
     */
    @Import(name="networkRuleBypassOption")
    private @Nullable Output<String> networkRuleBypassOption;

    /**
     * @return Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
     * 
     */
    public Optional<Output<String>> networkRuleBypassOption() {
        return Optional.ofNullable(this.networkRuleBypassOption);
    }

    /**
     * A `network_rule_set` block as documented below.
     * 
     */
    @Import(name="networkRuleSet")
    private @Nullable Output<RegistryNetworkRuleSetArgs> networkRuleSet;

    /**
     * @return A `network_rule_set` block as documented below.
     * 
     */
    public Optional<Output<RegistryNetworkRuleSetArgs>> networkRuleSet() {
        return Optional.ofNullable(this.networkRuleSet);
    }

    /**
     * Whether public network access is allowed for the container registry. Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is allowed for the container registry. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * Boolean value that indicates whether quarantine policy is enabled.
     * 
     */
    @Import(name="quarantinePolicyEnabled")
    private @Nullable Output<Boolean> quarantinePolicyEnabled;

    /**
     * @return Boolean value that indicates whether quarantine policy is enabled.
     * 
     */
    public Optional<Output<Boolean>> quarantinePolicyEnabled() {
        return Optional.ofNullable(this.quarantinePolicyEnabled);
    }

    /**
     * The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
     * 
     */
    @Import(name="retentionPolicyInDays")
    private @Nullable Output<Integer> retentionPolicyInDays;

    /**
     * @return The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
     * 
     */
    public Optional<Output<Integer>> retentionPolicyInDays() {
        return Optional.ofNullable(this.retentionPolicyInDays);
    }

    /**
     * The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
     * 
     */
    public Output<String> sku() {
        return this.sku;
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
     * Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
     * 
     */
    @Import(name="trustPolicyEnabled")
    private @Nullable Output<Boolean> trustPolicyEnabled;

    /**
     * @return Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> trustPolicyEnabled() {
        return Optional.ofNullable(this.trustPolicyEnabled);
    }

    /**
     * Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundancyEnabled")
    private @Nullable Output<Boolean> zoneRedundancyEnabled;

    /**
     * @return Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundancyEnabled() {
        return Optional.ofNullable(this.zoneRedundancyEnabled);
    }

    private RegistryArgs() {}

    private RegistryArgs(RegistryArgs $) {
        this.adminEnabled = $.adminEnabled;
        this.anonymousPullEnabled = $.anonymousPullEnabled;
        this.dataEndpointEnabled = $.dataEndpointEnabled;
        this.encryption = $.encryption;
        this.exportPolicyEnabled = $.exportPolicyEnabled;
        this.georeplications = $.georeplications;
        this.identity = $.identity;
        this.location = $.location;
        this.name = $.name;
        this.networkRuleBypassOption = $.networkRuleBypassOption;
        this.networkRuleSet = $.networkRuleSet;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.quarantinePolicyEnabled = $.quarantinePolicyEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionPolicyInDays = $.retentionPolicyInDays;
        this.sku = $.sku;
        this.tags = $.tags;
        this.trustPolicyEnabled = $.trustPolicyEnabled;
        this.zoneRedundancyEnabled = $.zoneRedundancyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryArgs $;

        public Builder() {
            $ = new RegistryArgs();
        }

        public Builder(RegistryArgs defaults) {
            $ = new RegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminEnabled Specifies whether the admin user is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            $.adminEnabled = adminEnabled;
            return this;
        }

        /**
         * @param adminEnabled Specifies whether the admin user is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder adminEnabled(Boolean adminEnabled) {
            return adminEnabled(Output.of(adminEnabled));
        }

        /**
         * @param anonymousPullEnabled Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder anonymousPullEnabled(@Nullable Output<Boolean> anonymousPullEnabled) {
            $.anonymousPullEnabled = anonymousPullEnabled;
            return this;
        }

        /**
         * @param anonymousPullEnabled Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder anonymousPullEnabled(Boolean anonymousPullEnabled) {
            return anonymousPullEnabled(Output.of(anonymousPullEnabled));
        }

        /**
         * @param dataEndpointEnabled Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder dataEndpointEnabled(@Nullable Output<Boolean> dataEndpointEnabled) {
            $.dataEndpointEnabled = dataEndpointEnabled;
            return this;
        }

        /**
         * @param dataEndpointEnabled Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder dataEndpointEnabled(Boolean dataEndpointEnabled) {
            return dataEndpointEnabled(Output.of(dataEndpointEnabled));
        }

        /**
         * @param encryption An `encryption` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<RegistryEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption An `encryption` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(RegistryEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param exportPolicyEnabled Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `public_network_access_enabled` is also set to `false`.
         * 
         * &gt; **Note:** `quarantine_policy_enabled`, `retention_policy_in_days`, `trust_policy_enabled`, `export_policy_enabled` and `zone_redundancy_enabled` are only supported on resources with the `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder exportPolicyEnabled(@Nullable Output<Boolean> exportPolicyEnabled) {
            $.exportPolicyEnabled = exportPolicyEnabled;
            return this;
        }

        /**
         * @param exportPolicyEnabled Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `public_network_access_enabled` is also set to `false`.
         * 
         * &gt; **Note:** `quarantine_policy_enabled`, `retention_policy_in_days`, `trust_policy_enabled`, `export_policy_enabled` and `zone_redundancy_enabled` are only supported on resources with the `Premium` SKU.
         * 
         * @return builder
         * 
         */
        public Builder exportPolicyEnabled(Boolean exportPolicyEnabled) {
            return exportPolicyEnabled(Output.of(exportPolicyEnabled));
        }

        /**
         * @param georeplications One or more `georeplications` blocks as documented below.
         * 
         * &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
         * 
         * &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
         * 
         * &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
         * 
         * @return builder
         * 
         */
        public Builder georeplications(@Nullable Output<List<RegistryGeoreplicationArgs>> georeplications) {
            $.georeplications = georeplications;
            return this;
        }

        /**
         * @param georeplications One or more `georeplications` blocks as documented below.
         * 
         * &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
         * 
         * &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
         * 
         * &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
         * 
         * @return builder
         * 
         */
        public Builder georeplications(List<RegistryGeoreplicationArgs> georeplications) {
            return georeplications(Output.of(georeplications));
        }

        /**
         * @param georeplications One or more `georeplications` blocks as documented below.
         * 
         * &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
         * 
         * &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
         * 
         * &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
         * 
         * @return builder
         * 
         */
        public Builder georeplications(RegistryGeoreplicationArgs... georeplications) {
            return georeplications(List.of(georeplications));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<RegistryIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(RegistryIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkRuleBypassOption Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
         * 
         * @return builder
         * 
         */
        public Builder networkRuleBypassOption(@Nullable Output<String> networkRuleBypassOption) {
            $.networkRuleBypassOption = networkRuleBypassOption;
            return this;
        }

        /**
         * @param networkRuleBypassOption Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
         * 
         * @return builder
         * 
         */
        public Builder networkRuleBypassOption(String networkRuleBypassOption) {
            return networkRuleBypassOption(Output.of(networkRuleBypassOption));
        }

        /**
         * @param networkRuleSet A `network_rule_set` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkRuleSet(@Nullable Output<RegistryNetworkRuleSetArgs> networkRuleSet) {
            $.networkRuleSet = networkRuleSet;
            return this;
        }

        /**
         * @param networkRuleSet A `network_rule_set` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkRuleSet(RegistryNetworkRuleSetArgs networkRuleSet) {
            return networkRuleSet(Output.of(networkRuleSet));
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for the container registry. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for the container registry. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param quarantinePolicyEnabled Boolean value that indicates whether quarantine policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder quarantinePolicyEnabled(@Nullable Output<Boolean> quarantinePolicyEnabled) {
            $.quarantinePolicyEnabled = quarantinePolicyEnabled;
            return this;
        }

        /**
         * @param quarantinePolicyEnabled Boolean value that indicates whether quarantine policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder quarantinePolicyEnabled(Boolean quarantinePolicyEnabled) {
            return quarantinePolicyEnabled(Output.of(quarantinePolicyEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retentionPolicyInDays The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicyInDays(@Nullable Output<Integer> retentionPolicyInDays) {
            $.retentionPolicyInDays = retentionPolicyInDays;
            return this;
        }

        /**
         * @param retentionPolicyInDays The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicyInDays(Integer retentionPolicyInDays) {
            return retentionPolicyInDays(Output.of(retentionPolicyInDays));
        }

        /**
         * @param sku The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
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
         * @param trustPolicyEnabled Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder trustPolicyEnabled(@Nullable Output<Boolean> trustPolicyEnabled) {
            $.trustPolicyEnabled = trustPolicyEnabled;
            return this;
        }

        /**
         * @param trustPolicyEnabled Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder trustPolicyEnabled(Boolean trustPolicyEnabled) {
            return trustPolicyEnabled(Output.of(trustPolicyEnabled));
        }

        /**
         * @param zoneRedundancyEnabled Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundancyEnabled(@Nullable Output<Boolean> zoneRedundancyEnabled) {
            $.zoneRedundancyEnabled = zoneRedundancyEnabled;
            return this;
        }

        /**
         * @param zoneRedundancyEnabled Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundancyEnabled(Boolean zoneRedundancyEnabled) {
            return zoneRedundancyEnabled(Output.of(zoneRedundancyEnabled));
        }

        public RegistryArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("RegistryArgs", "resourceGroupName");
            }
            if ($.sku == null) {
                throw new MissingRequiredPropertyException("RegistryArgs", "sku");
            }
            return $;
        }
    }

}
