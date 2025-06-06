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
    /// Manages an Azure Site Recovery replication policy for VMWare within a Recovery Vault.
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
    ///         Name = "example-rg",
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleVault = new Azure.RecoveryServices.Vault("example", new()
    ///     {
    ///         Name = "example-recovery-vault",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "Standard",
    ///     });
    /// 
    ///     var exampleVMWareReplicationPolicy = new Azure.SiteRecovery.VMWareReplicationPolicy("example", new()
    ///     {
    ///         Name = "example-policy",
    ///         RecoveryVaultId = exampleVault.Id,
    ///         RecoveryPointRetentionInMinutes = 1440,
    ///         ApplicationConsistentSnapshotFrequencyInMinutes = 240,
    ///     });
    /// 
    ///     var exampleVmwareReplicationPolicyAssociation = new Azure.SiteRecovery.VmwareReplicationPolicyAssociation("example", new()
    ///     {
    ///         Name = "example-association",
    ///         RecoveryVaultId = exampleVault.Id,
    ///         PolicyId = exampleVMWareReplicationPolicy.Id,
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
    /// Site Recovery Replication Policies can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
    /// ```
    /// </summary>
    [AzureResourceType("azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation")]
    public partial class VmwareReplicationPolicyAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the replication policy association. Changing this forces a new association to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Recovery Service Vault to which the policy should be associated.
        /// Changing this forces a new association to be created.
        /// </summary>
        [Output("recoveryVaultId")]
        public Output<string> RecoveryVaultId { get; private set; } = null!;


        /// <summary>
        /// Create a VmwareReplicationPolicyAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VmwareReplicationPolicyAssociation(string name, VmwareReplicationPolicyAssociationArgs args, CustomResourceOptions? options = null)
            : base("azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation", name, args ?? new VmwareReplicationPolicyAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VmwareReplicationPolicyAssociation(string name, Input<string> id, VmwareReplicationPolicyAssociationState? state = null, CustomResourceOptions? options = null)
            : base("azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VmwareReplicationPolicyAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VmwareReplicationPolicyAssociation Get(string name, Input<string> id, VmwareReplicationPolicyAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new VmwareReplicationPolicyAssociation(name, id, state, options);
        }
    }

    public sealed class VmwareReplicationPolicyAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the replication policy association. Changing this forces a new association to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        /// <summary>
        /// The ID of the Recovery Service Vault to which the policy should be associated.
        /// Changing this forces a new association to be created.
        /// </summary>
        [Input("recoveryVaultId", required: true)]
        public Input<string> RecoveryVaultId { get; set; } = null!;

        public VmwareReplicationPolicyAssociationArgs()
        {
        }
        public static new VmwareReplicationPolicyAssociationArgs Empty => new VmwareReplicationPolicyAssociationArgs();
    }

    public sealed class VmwareReplicationPolicyAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the replication policy association. Changing this forces a new association to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// The ID of the Recovery Service Vault to which the policy should be associated.
        /// Changing this forces a new association to be created.
        /// </summary>
        [Input("recoveryVaultId")]
        public Input<string>? RecoveryVaultId { get; set; }

        public VmwareReplicationPolicyAssociationState()
        {
        }
        public static new VmwareReplicationPolicyAssociationState Empty => new VmwareReplicationPolicyAssociationState();
    }
}
