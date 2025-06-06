// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    /// <summary>
    /// Manages a Network Manager Deployment.
    /// 
    /// &gt; **Note:** Using Network Manager Deployment to deploy Connectivity Configuration may modify or delete existing Virtual Network Peering. At this time you should not use Network Peering resource in conjunction with Network Manager Deployment. Doing so may cause a conflict of Peering configurations.
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
    ///     var current = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var exampleNetworkManager = new Azure.Network.NetworkManager("example", new()
    ///     {
    ///         Name = "example-network-manager",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Scope = new Azure.Network.Inputs.NetworkManagerScopeArgs
    ///         {
    ///             SubscriptionIds = new[]
    ///             {
    ///                 current.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///             },
    ///         },
    ///         ScopeAccesses = new[]
    ///         {
    ///             "Connectivity",
    ///             "SecurityAdmin",
    ///         },
    ///         Description = "example network manager",
    ///     });
    /// 
    ///     var exampleNetworkManagerNetworkGroup = new Azure.Network.NetworkManagerNetworkGroup("example", new()
    ///     {
    ///         Name = "example-group",
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-net",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         FlowTimeoutInMinutes = 10,
    ///     });
    /// 
    ///     var exampleNetworkManagerConnectivityConfiguration = new Azure.Network.NetworkManagerConnectivityConfiguration("example", new()
    ///     {
    ///         Name = "example-connectivity-conf",
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///         ConnectivityTopology = "HubAndSpoke",
    ///         AppliesToGroups = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkManagerConnectivityConfigurationAppliesToGroupArgs
    ///             {
    ///                 GroupConnectivity = "None",
    ///                 NetworkGroupId = exampleNetworkManagerNetworkGroup.Id,
    ///             },
    ///         },
    ///         Hub = new Azure.Network.Inputs.NetworkManagerConnectivityConfigurationHubArgs
    ///         {
    ///             ResourceId = exampleVirtualNetwork.Id,
    ///             ResourceType = "Microsoft.Network/virtualNetworks",
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkManagerDeployment = new Azure.Network.NetworkManagerDeployment("example", new()
    ///     {
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///         Location = "eastus",
    ///         ScopeAccess = "Connectivity",
    ///         ConfigurationIds = new[]
    ///         {
    ///             exampleNetworkManagerConnectivityConfiguration.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Triggers)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var current = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var exampleNetworkManager = new Azure.Network.NetworkManager("example", new()
    ///     {
    ///         Name = "example-network-manager",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Scope = new Azure.Network.Inputs.NetworkManagerScopeArgs
    ///         {
    ///             SubscriptionIds = new[]
    ///             {
    ///                 current.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///             },
    ///         },
    ///         ScopeAccesses = new[]
    ///         {
    ///             "Connectivity",
    ///             "SecurityAdmin",
    ///         },
    ///         Description = "example network manager",
    ///     });
    /// 
    ///     var exampleNetworkManagerNetworkGroup = new Azure.Network.NetworkManagerNetworkGroup("example", new()
    ///     {
    ///         Name = "example-group",
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-net",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         FlowTimeoutInMinutes = 10,
    ///     });
    /// 
    ///     var exampleNetworkManagerSecurityAdminConfiguration = new Azure.Network.NetworkManagerSecurityAdminConfiguration("example", new()
    ///     {
    ///         Name = "example-nmsac",
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///     });
    /// 
    ///     var exampleNetworkManagerAdminRuleCollection = new Azure.Network.NetworkManagerAdminRuleCollection("example", new()
    ///     {
    ///         Name = "example-nmarc",
    ///         SecurityAdminConfigurationId = exampleNetworkManagerSecurityAdminConfiguration.Id,
    ///         NetworkGroupIds = new[]
    ///         {
    ///             exampleNetworkManagerNetworkGroup.Id,
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkManagerAdminRule = new Azure.Network.NetworkManagerAdminRule("example", new()
    ///     {
    ///         Name = "example-nmar",
    ///         AdminRuleCollectionId = exampleNetworkManagerAdminRuleCollection.Id,
    ///         Action = "Deny",
    ///         Description = "example",
    ///         Direction = "Inbound",
    ///         Priority = 1,
    ///         Protocol = "Tcp",
    ///         SourcePortRanges = new[]
    ///         {
    ///             "80",
    ///         },
    ///         DestinationPortRanges = new[]
    ///         {
    ///             "80",
    ///         },
    ///         Sources = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkManagerAdminRuleSourceArgs
    ///             {
    ///                 AddressPrefixType = "ServiceTag",
    ///                 AddressPrefix = "Internet",
    ///             },
    ///         },
    ///         Destinations = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkManagerAdminRuleDestinationArgs
    ///             {
    ///                 AddressPrefixType = "IPPrefix",
    ///                 AddressPrefix = "*",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkManagerDeployment = new Azure.Network.NetworkManagerDeployment("example", new()
    ///     {
    ///         NetworkManagerId = exampleNetworkManager.Id,
    ///         Location = "eastus",
    ///         ScopeAccess = "SecurityAdmin",
    ///         ConfigurationIds = new[]
    ///         {
    ///             exampleNetworkManagerSecurityAdminConfiguration.Id,
    ///         },
    ///         Triggers = 
    ///         {
    ///             { "source_port_ranges", exampleNetworkManagerAdminRule.SourcePortRanges.Apply(sourcePortRanges =&gt; Std.Join.Invoke(new()
    ///             {
    ///                 Separator = ",",
    ///                 Input = sourcePortRanges,
    ///             })).Apply(invoke =&gt; invoke.Result) },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleNetworkManagerAdminRule,
    ///         },
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
    /// * `Microsoft.Network`: 2024-05-01
    /// 
    /// ## Import
    /// 
    /// Network Manager Deployment can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/networkManagerDeployment:NetworkManagerDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/networkManagers/networkManager1/commit|eastus|Connectivity
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/networkManagerDeployment:NetworkManagerDeployment")]
    public partial class NetworkManagerDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
        /// </summary>
        [Output("configurationIds")]
        public Output<ImmutableArray<string>> ConfigurationIds { get; private set; } = null!;

        /// <summary>
        /// Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Output("networkManagerId")]
        public Output<string> NetworkManagerId { get; private set; } = null!;

        /// <summary>
        /// Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Output("scopeAccess")]
        public Output<string> ScopeAccess { get; private set; } = null!;

        /// <summary>
        /// A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
        /// </summary>
        [Output("triggers")]
        public Output<ImmutableDictionary<string, string>?> Triggers { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkManagerDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkManagerDeployment(string name, NetworkManagerDeploymentArgs args, CustomResourceOptions? options = null)
            : base("azure:network/networkManagerDeployment:NetworkManagerDeployment", name, args ?? new NetworkManagerDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkManagerDeployment(string name, Input<string> id, NetworkManagerDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/networkManagerDeployment:NetworkManagerDeployment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkManagerDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkManagerDeployment Get(string name, Input<string> id, NetworkManagerDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkManagerDeployment(name, id, state, options);
        }
    }

    public sealed class NetworkManagerDeploymentArgs : global::Pulumi.ResourceArgs
    {
        [Input("configurationIds", required: true)]
        private InputList<string>? _configurationIds;

        /// <summary>
        /// A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
        /// </summary>
        public InputList<string> ConfigurationIds
        {
            get => _configurationIds ?? (_configurationIds = new InputList<string>());
            set => _configurationIds = value;
        }

        /// <summary>
        /// Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("networkManagerId", required: true)]
        public Input<string> NetworkManagerId { get; set; } = null!;

        /// <summary>
        /// Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("scopeAccess", required: true)]
        public Input<string> ScopeAccess { get; set; } = null!;

        [Input("triggers")]
        private InputMap<string>? _triggers;

        /// <summary>
        /// A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
        /// </summary>
        public InputMap<string> Triggers
        {
            get => _triggers ?? (_triggers = new InputMap<string>());
            set => _triggers = value;
        }

        public NetworkManagerDeploymentArgs()
        {
        }
        public static new NetworkManagerDeploymentArgs Empty => new NetworkManagerDeploymentArgs();
    }

    public sealed class NetworkManagerDeploymentState : global::Pulumi.ResourceArgs
    {
        [Input("configurationIds")]
        private InputList<string>? _configurationIds;

        /// <summary>
        /// A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
        /// </summary>
        public InputList<string> ConfigurationIds
        {
            get => _configurationIds ?? (_configurationIds = new InputList<string>());
            set => _configurationIds = value;
        }

        /// <summary>
        /// Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("networkManagerId")]
        public Input<string>? NetworkManagerId { get; set; }

        /// <summary>
        /// Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
        /// </summary>
        [Input("scopeAccess")]
        public Input<string>? ScopeAccess { get; set; }

        [Input("triggers")]
        private InputMap<string>? _triggers;

        /// <summary>
        /// A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
        /// </summary>
        public InputMap<string> Triggers
        {
            get => _triggers ?? (_triggers = new InputMap<string>());
            set => _triggers = value;
        }

        public NetworkManagerDeploymentState()
        {
        }
        public static new NetworkManagerDeploymentState Empty => new NetworkManagerDeploymentState();
    }
}
