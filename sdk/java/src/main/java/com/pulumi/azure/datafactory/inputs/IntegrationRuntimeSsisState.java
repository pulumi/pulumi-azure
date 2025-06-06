// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCopyComputeScaleArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisCustomSetupScriptArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressCustomSetupArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPackageStoreArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisProxyArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSsisVnetIntegrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRuntimeSsisState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSsisState Empty = new IntegrationRuntimeSsisState();

    /**
     * A `catalog_info` block as defined below.
     * 
     */
    @Import(name="catalogInfo")
    private @Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;

    /**
     * @return A `catalog_info` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisCatalogInfoArgs>> catalogInfo() {
        return Optional.ofNullable(this.catalogInfo);
    }

    /**
     * One `copy_compute_scale` block as defined below.
     * 
     */
    @Import(name="copyComputeScale")
    private @Nullable Output<IntegrationRuntimeSsisCopyComputeScaleArgs> copyComputeScale;

    /**
     * @return One `copy_compute_scale` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisCopyComputeScaleArgs>> copyComputeScale() {
        return Optional.ofNullable(this.copyComputeScale);
    }

    /**
     * The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
     * 
     * &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
     * 
     */
    @Import(name="credentialName")
    private @Nullable Output<String> credentialName;

    /**
     * @return The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
     * 
     * &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
     * 
     */
    public Optional<Output<String>> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * A `custom_setup_script` block as defined below.
     * 
     */
    @Import(name="customSetupScript")
    private @Nullable Output<IntegrationRuntimeSsisCustomSetupScriptArgs> customSetupScript;

    /**
     * @return A `custom_setup_script` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisCustomSetupScriptArgs>> customSetupScript() {
        return Optional.ofNullable(this.customSetupScript);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * An `express_custom_setup` block as defined below.
     * 
     */
    @Import(name="expressCustomSetup")
    private @Nullable Output<IntegrationRuntimeSsisExpressCustomSetupArgs> expressCustomSetup;

    /**
     * @return An `express_custom_setup` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisExpressCustomSetupArgs>> expressCustomSetup() {
        return Optional.ofNullable(this.expressCustomSetup);
    }

    /**
     * A `express_vnet_integration` block as defined below.
     * 
     */
    @Import(name="expressVnetIntegration")
    private @Nullable Output<IntegrationRuntimeSsisExpressVnetIntegrationArgs> expressVnetIntegration;

    /**
     * @return A `express_vnet_integration` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisExpressVnetIntegrationArgs>> expressVnetIntegration() {
        return Optional.ofNullable(this.expressVnetIntegration);
    }

    /**
     * The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
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
     * Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
     * 
     */
    @Import(name="maxParallelExecutionsPerNode")
    private @Nullable Output<Integer> maxParallelExecutionsPerNode;

    /**
     * @return Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
     * 
     */
    public Optional<Output<Integer>> maxParallelExecutionsPerNode() {
        return Optional.ofNullable(this.maxParallelExecutionsPerNode);
    }

    /**
     * Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
     * 
     */
    @Import(name="nodeSize")
    private @Nullable Output<String> nodeSize;

    /**
     * @return The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
     * 
     */
    public Optional<Output<String>> nodeSize() {
        return Optional.ofNullable(this.nodeSize);
    }

    /**
     * Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
     * 
     */
    @Import(name="numberOfNodes")
    private @Nullable Output<Integer> numberOfNodes;

    /**
     * @return Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> numberOfNodes() {
        return Optional.ofNullable(this.numberOfNodes);
    }

    /**
     * One or more `package_store` block as defined below.
     * 
     */
    @Import(name="packageStores")
    private @Nullable Output<List<IntegrationRuntimeSsisPackageStoreArgs>> packageStores;

    /**
     * @return One or more `package_store` block as defined below.
     * 
     */
    public Optional<Output<List<IntegrationRuntimeSsisPackageStoreArgs>>> packageStores() {
        return Optional.ofNullable(this.packageStores);
    }

    /**
     * One `pipeline_external_compute_scale` block as defined below.
     * 
     */
    @Import(name="pipelineExternalComputeScale")
    private @Nullable Output<IntegrationRuntimeSsisPipelineExternalComputeScaleArgs> pipelineExternalComputeScale;

    /**
     * @return One `pipeline_external_compute_scale` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisPipelineExternalComputeScaleArgs>> pipelineExternalComputeScale() {
        return Optional.ofNullable(this.pipelineExternalComputeScale);
    }

    /**
     * A `proxy` block as defined below.
     * 
     */
    @Import(name="proxy")
    private @Nullable Output<IntegrationRuntimeSsisProxyArgs> proxy;

    /**
     * @return A `proxy` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisProxyArgs>> proxy() {
        return Optional.ofNullable(this.proxy);
    }

    /**
     * A `vnet_integration` block as defined below.
     * 
     */
    @Import(name="vnetIntegration")
    private @Nullable Output<IntegrationRuntimeSsisVnetIntegrationArgs> vnetIntegration;

    /**
     * @return A `vnet_integration` block as defined below.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisVnetIntegrationArgs>> vnetIntegration() {
        return Optional.ofNullable(this.vnetIntegration);
    }

    private IntegrationRuntimeSsisState() {}

    private IntegrationRuntimeSsisState(IntegrationRuntimeSsisState $) {
        this.catalogInfo = $.catalogInfo;
        this.copyComputeScale = $.copyComputeScale;
        this.credentialName = $.credentialName;
        this.customSetupScript = $.customSetupScript;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.edition = $.edition;
        this.expressCustomSetup = $.expressCustomSetup;
        this.expressVnetIntegration = $.expressVnetIntegration;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maxParallelExecutionsPerNode = $.maxParallelExecutionsPerNode;
        this.name = $.name;
        this.nodeSize = $.nodeSize;
        this.numberOfNodes = $.numberOfNodes;
        this.packageStores = $.packageStores;
        this.pipelineExternalComputeScale = $.pipelineExternalComputeScale;
        this.proxy = $.proxy;
        this.vnetIntegration = $.vnetIntegration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeSsisState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeSsisState $;

        public Builder() {
            $ = new IntegrationRuntimeSsisState();
        }

        public Builder(IntegrationRuntimeSsisState defaults) {
            $ = new IntegrationRuntimeSsisState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogInfo A `catalog_info` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder catalogInfo(@Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo) {
            $.catalogInfo = catalogInfo;
            return this;
        }

        /**
         * @param catalogInfo A `catalog_info` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder catalogInfo(IntegrationRuntimeSsisCatalogInfoArgs catalogInfo) {
            return catalogInfo(Output.of(catalogInfo));
        }

        /**
         * @param copyComputeScale One `copy_compute_scale` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder copyComputeScale(@Nullable Output<IntegrationRuntimeSsisCopyComputeScaleArgs> copyComputeScale) {
            $.copyComputeScale = copyComputeScale;
            return this;
        }

        /**
         * @param copyComputeScale One `copy_compute_scale` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder copyComputeScale(IntegrationRuntimeSsisCopyComputeScaleArgs copyComputeScale) {
            return copyComputeScale(Output.of(copyComputeScale));
        }

        /**
         * @param credentialName The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
         * 
         * &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable Output<String> credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param credentialName The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
         * 
         * &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(String credentialName) {
            return credentialName(Output.of(credentialName));
        }

        /**
         * @param customSetupScript A `custom_setup_script` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customSetupScript(@Nullable Output<IntegrationRuntimeSsisCustomSetupScriptArgs> customSetupScript) {
            $.customSetupScript = customSetupScript;
            return this;
        }

        /**
         * @param customSetupScript A `custom_setup_script` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customSetupScript(IntegrationRuntimeSsisCustomSetupScriptArgs customSetupScript) {
            return customSetupScript(Output.of(customSetupScript));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param edition The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param expressCustomSetup An `express_custom_setup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder expressCustomSetup(@Nullable Output<IntegrationRuntimeSsisExpressCustomSetupArgs> expressCustomSetup) {
            $.expressCustomSetup = expressCustomSetup;
            return this;
        }

        /**
         * @param expressCustomSetup An `express_custom_setup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder expressCustomSetup(IntegrationRuntimeSsisExpressCustomSetupArgs expressCustomSetup) {
            return expressCustomSetup(Output.of(expressCustomSetup));
        }

        /**
         * @param expressVnetIntegration A `express_vnet_integration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder expressVnetIntegration(@Nullable Output<IntegrationRuntimeSsisExpressVnetIntegrationArgs> expressVnetIntegration) {
            $.expressVnetIntegration = expressVnetIntegration;
            return this;
        }

        /**
         * @param expressVnetIntegration A `express_vnet_integration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder expressVnetIntegration(IntegrationRuntimeSsisExpressVnetIntegrationArgs expressVnetIntegration) {
            return expressVnetIntegration(Output.of(expressVnetIntegration));
        }

        /**
         * @param licenseType The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
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
         * @param maxParallelExecutionsPerNode Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelExecutionsPerNode(@Nullable Output<Integer> maxParallelExecutionsPerNode) {
            $.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
            return this;
        }

        /**
         * @param maxParallelExecutionsPerNode Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelExecutionsPerNode(Integer maxParallelExecutionsPerNode) {
            return maxParallelExecutionsPerNode(Output.of(maxParallelExecutionsPerNode));
        }

        /**
         * @param name Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeSize The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(@Nullable Output<String> nodeSize) {
            $.nodeSize = nodeSize;
            return this;
        }

        /**
         * @param nodeSize The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(String nodeSize) {
            return nodeSize(Output.of(nodeSize));
        }

        /**
         * @param numberOfNodes Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(@Nullable Output<Integer> numberOfNodes) {
            $.numberOfNodes = numberOfNodes;
            return this;
        }

        /**
         * @param numberOfNodes Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(Integer numberOfNodes) {
            return numberOfNodes(Output.of(numberOfNodes));
        }

        /**
         * @param packageStores One or more `package_store` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(@Nullable Output<List<IntegrationRuntimeSsisPackageStoreArgs>> packageStores) {
            $.packageStores = packageStores;
            return this;
        }

        /**
         * @param packageStores One or more `package_store` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(List<IntegrationRuntimeSsisPackageStoreArgs> packageStores) {
            return packageStores(Output.of(packageStores));
        }

        /**
         * @param packageStores One or more `package_store` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(IntegrationRuntimeSsisPackageStoreArgs... packageStores) {
            return packageStores(List.of(packageStores));
        }

        /**
         * @param pipelineExternalComputeScale One `pipeline_external_compute_scale` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pipelineExternalComputeScale(@Nullable Output<IntegrationRuntimeSsisPipelineExternalComputeScaleArgs> pipelineExternalComputeScale) {
            $.pipelineExternalComputeScale = pipelineExternalComputeScale;
            return this;
        }

        /**
         * @param pipelineExternalComputeScale One `pipeline_external_compute_scale` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pipelineExternalComputeScale(IntegrationRuntimeSsisPipelineExternalComputeScaleArgs pipelineExternalComputeScale) {
            return pipelineExternalComputeScale(Output.of(pipelineExternalComputeScale));
        }

        /**
         * @param proxy A `proxy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder proxy(@Nullable Output<IntegrationRuntimeSsisProxyArgs> proxy) {
            $.proxy = proxy;
            return this;
        }

        /**
         * @param proxy A `proxy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder proxy(IntegrationRuntimeSsisProxyArgs proxy) {
            return proxy(Output.of(proxy));
        }

        /**
         * @param vnetIntegration A `vnet_integration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder vnetIntegration(@Nullable Output<IntegrationRuntimeSsisVnetIntegrationArgs> vnetIntegration) {
            $.vnetIntegration = vnetIntegration;
            return this;
        }

        /**
         * @param vnetIntegration A `vnet_integration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder vnetIntegration(IntegrationRuntimeSsisVnetIntegrationArgs vnetIntegration) {
            return vnetIntegration(Output.of(vnetIntegration));
        }

        public IntegrationRuntimeSsisState build() {
            return $;
        }
    }

}
