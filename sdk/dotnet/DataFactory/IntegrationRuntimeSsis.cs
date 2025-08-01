// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory
{
    /// <summary>
    /// Manages a Data Factory Azure-SSIS Integration Runtime.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleFactory = new Azure.DataFactory.Factory("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleIntegrationRuntimeSsis = new Azure.DataFactory.IntegrationRuntimeSsis("example", new()
    ///     {
    ///         Name = "example",
    ///         DataFactoryId = exampleFactory.Id,
    ///         Location = example.Location,
    ///         NodeSize = "Standard_D8_v3",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.DataFactory`: 2018-06-01
    /// 
    /// ## Import
    /// 
    /// Data Factory Azure-SSIS Integration Runtimes can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:datafactory/integrationRuntimeSsis:IntegrationRuntimeSsis example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/integrationRuntimes/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/integrationRuntimeSsis:IntegrationRuntimeSsis")]
    public partial class IntegrationRuntimeSsis : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A `catalog_info` block as defined below.
        /// </summary>
        [Output("catalogInfo")]
        public Output<Outputs.IntegrationRuntimeSsisCatalogInfo?> CatalogInfo { get; private set; } = null!;

        /// <summary>
        /// One `copy_compute_scale` block as defined below.
        /// </summary>
        [Output("copyComputeScale")]
        public Output<Outputs.IntegrationRuntimeSsisCopyComputeScale?> CopyComputeScale { get; private set; } = null!;

        /// <summary>
        /// The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
        /// 
        /// &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
        /// </summary>
        [Output("credentialName")]
        public Output<string?> CredentialName { get; private set; } = null!;

        /// <summary>
        /// A `custom_setup_script` block as defined below.
        /// </summary>
        [Output("customSetupScript")]
        public Output<Outputs.IntegrationRuntimeSsisCustomSetupScript?> CustomSetupScript { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// Integration runtime description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
        /// </summary>
        [Output("edition")]
        public Output<string?> Edition { get; private set; } = null!;

        /// <summary>
        /// An `express_custom_setup` block as defined below.
        /// </summary>
        [Output("expressCustomSetup")]
        public Output<Outputs.IntegrationRuntimeSsisExpressCustomSetup?> ExpressCustomSetup { get; private set; } = null!;

        /// <summary>
        /// A `express_vnet_integration` block as defined below.
        /// </summary>
        [Output("expressVnetIntegration")]
        public Output<Outputs.IntegrationRuntimeSsisExpressVnetIntegration?> ExpressVnetIntegration { get; private set; } = null!;

        /// <summary>
        /// The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
        /// </summary>
        [Output("licenseType")]
        public Output<string?> LicenseType { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
        /// </summary>
        [Output("maxParallelExecutionsPerNode")]
        public Output<int?> MaxParallelExecutionsPerNode { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
        /// </summary>
        [Output("nodeSize")]
        public Output<string> NodeSize { get; private set; } = null!;

        /// <summary>
        /// Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
        /// </summary>
        [Output("numberOfNodes")]
        public Output<int?> NumberOfNodes { get; private set; } = null!;

        /// <summary>
        /// One or more `package_store` block as defined below.
        /// </summary>
        [Output("packageStores")]
        public Output<ImmutableArray<Outputs.IntegrationRuntimeSsisPackageStore>> PackageStores { get; private set; } = null!;

        /// <summary>
        /// One `pipeline_external_compute_scale` block as defined below.
        /// </summary>
        [Output("pipelineExternalComputeScale")]
        public Output<Outputs.IntegrationRuntimeSsisPipelineExternalComputeScale?> PipelineExternalComputeScale { get; private set; } = null!;

        /// <summary>
        /// A `proxy` block as defined below.
        /// </summary>
        [Output("proxy")]
        public Output<Outputs.IntegrationRuntimeSsisProxy?> Proxy { get; private set; } = null!;

        /// <summary>
        /// A `vnet_integration` block as defined below.
        /// </summary>
        [Output("vnetIntegration")]
        public Output<Outputs.IntegrationRuntimeSsisVnetIntegration?> VnetIntegration { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationRuntimeSsis resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationRuntimeSsis(string name, IntegrationRuntimeSsisArgs args, CustomResourceOptions? options = null)
            : base("azure:datafactory/integrationRuntimeSsis:IntegrationRuntimeSsis", name, args ?? new IntegrationRuntimeSsisArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationRuntimeSsis(string name, Input<string> id, IntegrationRuntimeSsisState? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/integrationRuntimeSsis:IntegrationRuntimeSsis", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "azure:datafactory/integrationRuntimeManaged:IntegrationRuntimeManaged" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IntegrationRuntimeSsis resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationRuntimeSsis Get(string name, Input<string> id, IntegrationRuntimeSsisState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationRuntimeSsis(name, id, state, options);
        }
    }

    public sealed class IntegrationRuntimeSsisArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `catalog_info` block as defined below.
        /// </summary>
        [Input("catalogInfo")]
        public Input<Inputs.IntegrationRuntimeSsisCatalogInfoArgs>? CatalogInfo { get; set; }

        /// <summary>
        /// One `copy_compute_scale` block as defined below.
        /// </summary>
        [Input("copyComputeScale")]
        public Input<Inputs.IntegrationRuntimeSsisCopyComputeScaleArgs>? CopyComputeScale { get; set; }

        /// <summary>
        /// The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
        /// 
        /// &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
        /// </summary>
        [Input("credentialName")]
        public Input<string>? CredentialName { get; set; }

        /// <summary>
        /// A `custom_setup_script` block as defined below.
        /// </summary>
        [Input("customSetupScript")]
        public Input<Inputs.IntegrationRuntimeSsisCustomSetupScriptArgs>? CustomSetupScript { get; set; }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId", required: true)]
        public Input<string> DataFactoryId { get; set; } = null!;

        /// <summary>
        /// Integration runtime description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// An `express_custom_setup` block as defined below.
        /// </summary>
        [Input("expressCustomSetup")]
        public Input<Inputs.IntegrationRuntimeSsisExpressCustomSetupArgs>? ExpressCustomSetup { get; set; }

        /// <summary>
        /// A `express_vnet_integration` block as defined below.
        /// </summary>
        [Input("expressVnetIntegration")]
        public Input<Inputs.IntegrationRuntimeSsisExpressVnetIntegrationArgs>? ExpressVnetIntegration { get; set; }

        /// <summary>
        /// The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
        /// </summary>
        [Input("maxParallelExecutionsPerNode")]
        public Input<int>? MaxParallelExecutionsPerNode { get; set; }

        /// <summary>
        /// Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
        /// </summary>
        [Input("nodeSize", required: true)]
        public Input<string> NodeSize { get; set; } = null!;

        /// <summary>
        /// Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
        /// </summary>
        [Input("numberOfNodes")]
        public Input<int>? NumberOfNodes { get; set; }

        [Input("packageStores")]
        private InputList<Inputs.IntegrationRuntimeSsisPackageStoreArgs>? _packageStores;

        /// <summary>
        /// One or more `package_store` block as defined below.
        /// </summary>
        public InputList<Inputs.IntegrationRuntimeSsisPackageStoreArgs> PackageStores
        {
            get => _packageStores ?? (_packageStores = new InputList<Inputs.IntegrationRuntimeSsisPackageStoreArgs>());
            set => _packageStores = value;
        }

        /// <summary>
        /// One `pipeline_external_compute_scale` block as defined below.
        /// </summary>
        [Input("pipelineExternalComputeScale")]
        public Input<Inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleArgs>? PipelineExternalComputeScale { get; set; }

        /// <summary>
        /// A `proxy` block as defined below.
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.IntegrationRuntimeSsisProxyArgs>? Proxy { get; set; }

        /// <summary>
        /// A `vnet_integration` block as defined below.
        /// </summary>
        [Input("vnetIntegration")]
        public Input<Inputs.IntegrationRuntimeSsisVnetIntegrationArgs>? VnetIntegration { get; set; }

        public IntegrationRuntimeSsisArgs()
        {
        }
        public static new IntegrationRuntimeSsisArgs Empty => new IntegrationRuntimeSsisArgs();
    }

    public sealed class IntegrationRuntimeSsisState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `catalog_info` block as defined below.
        /// </summary>
        [Input("catalogInfo")]
        public Input<Inputs.IntegrationRuntimeSsisCatalogInfoGetArgs>? CatalogInfo { get; set; }

        /// <summary>
        /// One `copy_compute_scale` block as defined below.
        /// </summary>
        [Input("copyComputeScale")]
        public Input<Inputs.IntegrationRuntimeSsisCopyComputeScaleGetArgs>? CopyComputeScale { get; set; }

        /// <summary>
        /// The name of a Data Factory Credential that the SSIS integration will use to access data sources. For example, `azure.datafactory.CredentialUserManagedIdentity`
        /// 
        /// &gt; **Note:** If `credential_name` is omitted, the integration runtime will use the Data Factory assigned identity.
        /// </summary>
        [Input("credentialName")]
        public Input<string>? CredentialName { get; set; }

        /// <summary>
        /// A `custom_setup_script` block as defined below.
        /// </summary>
        [Input("customSetupScript")]
        public Input<Inputs.IntegrationRuntimeSsisCustomSetupScriptGetArgs>? CustomSetupScript { get; set; }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId")]
        public Input<string>? DataFactoryId { get; set; }

        /// <summary>
        /// Integration runtime description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Azure-SSIS Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// An `express_custom_setup` block as defined below.
        /// </summary>
        [Input("expressCustomSetup")]
        public Input<Inputs.IntegrationRuntimeSsisExpressCustomSetupGetArgs>? ExpressCustomSetup { get; set; }

        /// <summary>
        /// A `express_vnet_integration` block as defined below.
        /// </summary>
        [Input("expressVnetIntegration")]
        public Input<Inputs.IntegrationRuntimeSsisExpressVnetIntegrationGetArgs>? ExpressVnetIntegration { get; set; }

        /// <summary>
        /// The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrice`. Defaults to `LicenseIncluded`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Defines the maximum parallel executions per node. Defaults to `1`. Max is `1`.
        /// </summary>
        [Input("maxParallelExecutionsPerNode")]
        public Input<int>? MaxParallelExecutionsPerNode { get; set; }

        /// <summary>
        /// Specifies the name of the Azure-SSIS Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The size of the nodes on which the Azure-SSIS Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
        /// </summary>
        [Input("nodeSize")]
        public Input<string>? NodeSize { get; set; }

        /// <summary>
        /// Number of nodes for the Azure-SSIS Integration Runtime. Max is `10`. Defaults to `1`.
        /// </summary>
        [Input("numberOfNodes")]
        public Input<int>? NumberOfNodes { get; set; }

        [Input("packageStores")]
        private InputList<Inputs.IntegrationRuntimeSsisPackageStoreGetArgs>? _packageStores;

        /// <summary>
        /// One or more `package_store` block as defined below.
        /// </summary>
        public InputList<Inputs.IntegrationRuntimeSsisPackageStoreGetArgs> PackageStores
        {
            get => _packageStores ?? (_packageStores = new InputList<Inputs.IntegrationRuntimeSsisPackageStoreGetArgs>());
            set => _packageStores = value;
        }

        /// <summary>
        /// One `pipeline_external_compute_scale` block as defined below.
        /// </summary>
        [Input("pipelineExternalComputeScale")]
        public Input<Inputs.IntegrationRuntimeSsisPipelineExternalComputeScaleGetArgs>? PipelineExternalComputeScale { get; set; }

        /// <summary>
        /// A `proxy` block as defined below.
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.IntegrationRuntimeSsisProxyGetArgs>? Proxy { get; set; }

        /// <summary>
        /// A `vnet_integration` block as defined below.
        /// </summary>
        [Input("vnetIntegration")]
        public Input<Inputs.IntegrationRuntimeSsisVnetIntegrationGetArgs>? VnetIntegration { get; set; }

        public IntegrationRuntimeSsisState()
        {
        }
        public static new IntegrationRuntimeSsisState Empty => new IntegrationRuntimeSsisState();
    }
}
