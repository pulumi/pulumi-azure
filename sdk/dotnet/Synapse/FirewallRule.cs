// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Synapse
{
    /// <summary>
    /// Allows you to Manages a Synapse Firewall Rule.
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
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplestorageacc",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///         AccountKind = "StorageV2",
    ///         IsHnsEnabled = true,
    ///     });
    /// 
    ///     var exampleDataLakeGen2Filesystem = new Azure.Storage.DataLakeGen2Filesystem("example", new()
    ///     {
    ///         Name = "example",
    ///         StorageAccountId = exampleAccount.Id,
    ///     });
    /// 
    ///     var exampleWorkspace = new Azure.Synapse.Workspace("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         StorageDataLakeGen2FilesystemId = exampleDataLakeGen2Filesystem.Id,
    ///         SqlAdministratorLogin = "sqladminuser",
    ///         SqlAdministratorLoginPassword = "H@Sh1CoR3!",
    ///         Identity = new Azure.Synapse.Inputs.WorkspaceIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleFirewallRule = new Azure.Synapse.FirewallRule("example", new()
    ///     {
    ///         Name = "AllowAll",
    ///         SynapseWorkspaceId = exampleWorkspace.Id,
    ///         StartIpAddress = "0.0.0.0",
    ///         EndIpAddress = "255.255.255.255",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Synapse Firewall Rule can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:synapse/firewallRule:FirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.Synapse/workspaces/workspace1/firewallRules/rule1
    /// ```
    /// </summary>
    [AzureResourceType("azure:synapse/firewallRule:FirewallRule")]
    public partial class FirewallRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ending IP address to allow through the firewall for this rule.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        /// </summary>
        [Output("endIpAddress")]
        public Output<string> EndIpAddress { get; private set; } = null!;

        /// <summary>
        /// The Name of the firewall rule. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The starting IP address to allow through the firewall for this rule.
        /// </summary>
        [Output("startIpAddress")]
        public Output<string> StartIpAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Output("synapseWorkspaceId")]
        public Output<string> SynapseWorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallRule(string name, FirewallRuleArgs args, CustomResourceOptions? options = null)
            : base("azure:synapse/firewallRule:FirewallRule", name, args ?? new FirewallRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallRule(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
            : base("azure:synapse/firewallRule:FirewallRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallRule Get(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallRule(name, id, state, options);
        }
    }

    public sealed class FirewallRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ending IP address to allow through the firewall for this rule.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        /// </summary>
        [Input("endIpAddress", required: true)]
        public Input<string> EndIpAddress { get; set; } = null!;

        /// <summary>
        /// The Name of the firewall rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The starting IP address to allow through the firewall for this rule.
        /// </summary>
        [Input("startIpAddress", required: true)]
        public Input<string> StartIpAddress { get; set; } = null!;

        /// <summary>
        /// The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("synapseWorkspaceId", required: true)]
        public Input<string> SynapseWorkspaceId { get; set; } = null!;

        public FirewallRuleArgs()
        {
        }
        public static new FirewallRuleArgs Empty => new FirewallRuleArgs();
    }

    public sealed class FirewallRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ending IP address to allow through the firewall for this rule.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
        /// 
        /// &gt; **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        /// </summary>
        [Input("endIpAddress")]
        public Input<string>? EndIpAddress { get; set; }

        /// <summary>
        /// The Name of the firewall rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The starting IP address to allow through the firewall for this rule.
        /// </summary>
        [Input("startIpAddress")]
        public Input<string>? StartIpAddress { get; set; }

        /// <summary>
        /// The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("synapseWorkspaceId")]
        public Input<string>? SynapseWorkspaceId { get; set; }

        public FirewallRuleState()
        {
        }
        public static new FirewallRuleState Empty => new FirewallRuleState();
    }
}
