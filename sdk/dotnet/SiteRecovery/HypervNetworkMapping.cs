// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery
{
    /// <summary>
    /// Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure.
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
    ///     var target = new Azure.Core.ResourceGroup("target", new()
    ///     {
    ///         Name = "tfex-network-mapping",
    ///         Location = "East US",
    ///     });
    /// 
    ///     var vault = new Azure.RecoveryServices.Vault("vault", new()
    ///     {
    ///         Name = "example-recovery-vault",
    ///         Location = target.Location,
    ///         ResourceGroupName = target.Name,
    ///         Sku = "Standard",
    ///     });
    /// 
    ///     var targetVirtualNetwork = new Azure.Network.VirtualNetwork("target", new()
    ///     {
    ///         Name = "network",
    ///         ResourceGroupName = target.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///         Location = target.Location,
    ///     });
    /// 
    ///     var recovery_mapping = new Azure.SiteRecovery.HypervNetworkMapping("recovery-mapping", new()
    ///     {
    ///         Name = "recovery-network-mapping",
    ///         RecoveryVaultId = vault.Id,
    ///         SourceSystemCenterVirtualMachineManagerName = "my-vmm-server",
    ///         SourceNetworkName = "my-vmm-network",
    ///         TargetNetworkId = targetVirtualNetwork.Id,
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
    /// * `Microsoft.RecoveryServices`: 2024-04-01
    /// 
    /// ## Import
    /// 
    /// Site Recovery Network Mapping can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping  azurerm_site_recovery_hyperv_network_mapping.mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/primary-fabric-name/replicationNetworks/azureNetwork/replicationNetworkMappings/mapping-name
    /// ```
    /// </summary>
    [AzureResourceType("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping")]
    public partial class HypervNetworkMapping : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the HyperV network mapping. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("recoveryVaultId")]
        public Output<string> RecoveryVaultId { get; private set; } = null!;

        /// <summary>
        /// The Name of the primary network. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sourceNetworkName")]
        public Output<string> SourceNetworkName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sourceSystemCenterVirtualMachineManagerName")]
        public Output<string> SourceSystemCenterVirtualMachineManagerName { get; private set; } = null!;

        /// <summary>
        /// The id of the recovery network. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetNetworkId")]
        public Output<string> TargetNetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a HypervNetworkMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HypervNetworkMapping(string name, HypervNetworkMappingArgs args, CustomResourceOptions? options = null)
            : base("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping", name, args ?? new HypervNetworkMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HypervNetworkMapping(string name, Input<string> id, HypervNetworkMappingState? state = null, CustomResourceOptions? options = null)
            : base("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing HypervNetworkMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HypervNetworkMapping Get(string name, Input<string> id, HypervNetworkMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new HypervNetworkMapping(name, id, state, options);
        }
    }

    public sealed class HypervNetworkMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the HyperV network mapping. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("recoveryVaultId", required: true)]
        public Input<string> RecoveryVaultId { get; set; } = null!;

        /// <summary>
        /// The Name of the primary network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceNetworkName", required: true)]
        public Input<string> SourceNetworkName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceSystemCenterVirtualMachineManagerName", required: true)]
        public Input<string> SourceSystemCenterVirtualMachineManagerName { get; set; } = null!;

        /// <summary>
        /// The id of the recovery network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetNetworkId", required: true)]
        public Input<string> TargetNetworkId { get; set; } = null!;

        public HypervNetworkMappingArgs()
        {
        }
        public static new HypervNetworkMappingArgs Empty => new HypervNetworkMappingArgs();
    }

    public sealed class HypervNetworkMappingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the HyperV network mapping. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("recoveryVaultId")]
        public Input<string>? RecoveryVaultId { get; set; }

        /// <summary>
        /// The Name of the primary network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceNetworkName")]
        public Input<string>? SourceNetworkName { get; set; }

        /// <summary>
        /// Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceSystemCenterVirtualMachineManagerName")]
        public Input<string>? SourceSystemCenterVirtualMachineManagerName { get; set; }

        /// <summary>
        /// The id of the recovery network. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetNetworkId")]
        public Input<string>? TargetNetworkId { get; set; }

        public HypervNetworkMappingState()
        {
        }
        public static new HypervNetworkMappingState Empty => new HypervNetworkMappingState();
    }
}
