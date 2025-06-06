// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevCenter
{
    /// <summary>
    /// Manages a Dev Center Network Connection.
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
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-vnet",
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "internal",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkConnection = new Azure.DevCenter.NetworkConnection("example", new()
    ///     {
    ///         Name = "example-dcnc",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         DomainJoinType = "AzureADJoin",
    ///         SubnetId = exampleSubnet.Id,
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
    /// * `Microsoft.DevCenter`: 2025-02-01
    /// 
    /// ## Import
    /// 
    /// An existing Dev Center Network Connection can be imported into Pulumi using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:devcenter/networkConnection:NetworkConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevCenter/networkConnections/networkConnection1
    /// ```
    /// </summary>
    [AzureResourceType("azure:devcenter/networkConnection:NetworkConnection")]
    public partial class NetworkConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("domainJoinType")]
        public Output<string> DomainJoinType { get; private set; } = null!;

        /// <summary>
        /// The name of the Azure Active Directory domain.
        /// </summary>
        [Output("domainName")]
        public Output<string?> DomainName { get; private set; } = null!;

        /// <summary>
        /// The password for the account used to join domain.
        /// </summary>
        [Output("domainPassword")]
        public Output<string?> DomainPassword { get; private set; } = null!;

        /// <summary>
        /// The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
        /// </summary>
        [Output("domainUsername")]
        public Output<string?> DomainUsername { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Azure Active Directory domain Organization Unit (OU).
        /// </summary>
        [Output("organizationUnit")]
        public Output<string?> OrganizationUnit { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet that is used to attach Virtual Machines.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Network Connection.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkConnection(string name, NetworkConnectionArgs args, CustomResourceOptions? options = null)
            : base("azure:devcenter/networkConnection:NetworkConnection", name, args ?? new NetworkConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkConnection(string name, Input<string> id, NetworkConnectionState? state = null, CustomResourceOptions? options = null)
            : base("azure:devcenter/networkConnection:NetworkConnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "domainPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NetworkConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkConnection Get(string name, Input<string> id, NetworkConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkConnection(name, id, state, options);
        }
    }

    public sealed class NetworkConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("domainJoinType", required: true)]
        public Input<string> DomainJoinType { get; set; } = null!;

        /// <summary>
        /// The name of the Azure Active Directory domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("domainPassword")]
        private Input<string>? _domainPassword;

        /// <summary>
        /// The password for the account used to join domain.
        /// </summary>
        public Input<string>? DomainPassword
        {
            get => _domainPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _domainPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
        /// </summary>
        [Input("domainUsername")]
        public Input<string>? DomainUsername { get; set; }

        /// <summary>
        /// The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Azure Active Directory domain Organization Unit (OU).
        /// </summary>
        [Input("organizationUnit")]
        public Input<string>? OrganizationUnit { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The ID of the Subnet that is used to attach Virtual Machines.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Network Connection.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NetworkConnectionArgs()
        {
        }
        public static new NetworkConnectionArgs Empty => new NetworkConnectionArgs();
    }

    public sealed class NetworkConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("domainJoinType")]
        public Input<string>? DomainJoinType { get; set; }

        /// <summary>
        /// The name of the Azure Active Directory domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("domainPassword")]
        private Input<string>? _domainPassword;

        /// <summary>
        /// The password for the account used to join domain.
        /// </summary>
        public Input<string>? DomainPassword
        {
            get => _domainPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _domainPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
        /// </summary>
        [Input("domainUsername")]
        public Input<string>? DomainUsername { get; set; }

        /// <summary>
        /// The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Azure Active Directory domain Organization Unit (OU).
        /// </summary>
        [Input("organizationUnit")]
        public Input<string>? OrganizationUnit { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The ID of the Subnet that is used to attach Virtual Machines.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Network Connection.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NetworkConnectionState()
        {
        }
        public static new NetworkConnectionState Empty => new NetworkConnectionState();
    }
}
