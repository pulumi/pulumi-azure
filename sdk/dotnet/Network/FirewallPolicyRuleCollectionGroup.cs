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
    /// Manages a Firewall Policy Rule Collection Group.
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
    ///     var exampleFirewallPolicy = new Azure.Network.FirewallPolicy("example", new()
    ///     {
    ///         Name = "example-fwpolicy",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleFirewallPolicyRuleCollectionGroup = new Azure.Network.FirewallPolicyRuleCollectionGroup("example", new()
    ///     {
    ///         Name = "example-fwpolicy-rcg",
    ///         FirewallPolicyId = exampleFirewallPolicy.Id,
    ///         Priority = 500,
    ///         ApplicationRuleCollections = new[]
    ///         {
    ///             new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs
    ///             {
    ///                 Name = "app_rule_collection1",
    ///                 Priority = 500,
    ///                 Action = "Deny",
    ///                 Rules = new[]
    ///                 {
    ///                     new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs
    ///                     {
    ///                         Name = "app_rule_collection1_rule1",
    ///                         Protocols = new[]
    ///                         {
    ///                             new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs
    ///                             {
    ///                                 Type = "Http",
    ///                                 Port = 80,
    ///                             },
    ///                             new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs
    ///                             {
    ///                                 Type = "Https",
    ///                                 Port = 443,
    ///                             },
    ///                         },
    ///                         SourceAddresses = new[]
    ///                         {
    ///                             "10.0.0.1",
    ///                         },
    ///                         DestinationFqdns = new[]
    ///                         {
    ///                             "*.microsoft.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         NetworkRuleCollections = new[]
    ///         {
    ///             new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs
    ///             {
    ///                 Name = "network_rule_collection1",
    ///                 Priority = 400,
    ///                 Action = "Deny",
    ///                 Rules = new[]
    ///                 {
    ///                     new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionRuleArgs
    ///                     {
    ///                         Name = "network_rule_collection1_rule1",
    ///                         Protocols = new[]
    ///                         {
    ///                             "TCP",
    ///                             "UDP",
    ///                         },
    ///                         SourceAddresses = new[]
    ///                         {
    ///                             "10.0.0.1",
    ///                         },
    ///                         DestinationAddresses = new[]
    ///                         {
    ///                             "192.168.1.1",
    ///                             "192.168.1.2",
    ///                         },
    ///                         DestinationPorts = new[]
    ///                         {
    ///                             "80",
    ///                             "1000-2000",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         NatRuleCollections = new[]
    ///         {
    ///             new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs
    ///             {
    ///                 Name = "nat_rule_collection1",
    ///                 Priority = 300,
    ///                 Action = "Dnat",
    ///                 Rules = new[]
    ///                 {
    ///                     new Azure.Network.Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs
    ///                     {
    ///                         Name = "nat_rule_collection1_rule1",
    ///                         Protocols = new[]
    ///                         {
    ///                             "TCP",
    ///                             "UDP",
    ///                         },
    ///                         SourceAddresses = new[]
    ///                         {
    ///                             "10.0.0.1",
    ///                             "10.0.0.2",
    ///                         },
    ///                         DestinationAddress = "192.168.1.1",
    ///                         DestinationPorts = "80",
    ///                         TranslatedAddress = "192.168.0.1",
    ///                         TranslatedPort = 8080,
    ///                     },
    ///                 },
    ///             },
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
    /// Firewall Policy Rule Collection Groups can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/firewallPolicyRuleCollectionGroup:FirewallPolicyRuleCollectionGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/firewallPolicies/policy1/ruleCollectionGroups/gruop1
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/firewallPolicyRuleCollectionGroup:FirewallPolicyRuleCollectionGroup")]
    public partial class FirewallPolicyRuleCollectionGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `application_rule_collection` blocks as defined below.
        /// </summary>
        [Output("applicationRuleCollections")]
        public Output<ImmutableArray<Outputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollection>> ApplicationRuleCollections { get; private set; } = null!;

        /// <summary>
        /// The ID of the Firewall Policy where the Firewall Policy Rule Collection Group should exist. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Output("firewallPolicyId")]
        public Output<string> FirewallPolicyId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Firewall Policy Rule Collection Group. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// One or more `nat_rule_collection` blocks as defined below.
        /// </summary>
        [Output("natRuleCollections")]
        public Output<ImmutableArray<Outputs.FirewallPolicyRuleCollectionGroupNatRuleCollection>> NatRuleCollections { get; private set; } = null!;

        /// <summary>
        /// One or more `network_rule_collection` blocks as defined below.
        /// </summary>
        [Output("networkRuleCollections")]
        public Output<ImmutableArray<Outputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollection>> NetworkRuleCollections { get; private set; } = null!;

        /// <summary>
        /// The priority of the Firewall Policy Rule Collection Group. The range is 100-65000.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallPolicyRuleCollectionGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallPolicyRuleCollectionGroup(string name, FirewallPolicyRuleCollectionGroupArgs args, CustomResourceOptions? options = null)
            : base("azure:network/firewallPolicyRuleCollectionGroup:FirewallPolicyRuleCollectionGroup", name, args ?? new FirewallPolicyRuleCollectionGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallPolicyRuleCollectionGroup(string name, Input<string> id, FirewallPolicyRuleCollectionGroupState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/firewallPolicyRuleCollectionGroup:FirewallPolicyRuleCollectionGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallPolicyRuleCollectionGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallPolicyRuleCollectionGroup Get(string name, Input<string> id, FirewallPolicyRuleCollectionGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallPolicyRuleCollectionGroup(name, id, state, options);
        }
    }

    public sealed class FirewallPolicyRuleCollectionGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs>? _applicationRuleCollections;

        /// <summary>
        /// One or more `application_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs> ApplicationRuleCollections
        {
            get => _applicationRuleCollections ?? (_applicationRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionArgs>());
            set => _applicationRuleCollections = value;
        }

        /// <summary>
        /// The ID of the Firewall Policy where the Firewall Policy Rule Collection Group should exist. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("firewallPolicyId", required: true)]
        public Input<string> FirewallPolicyId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Firewall Policy Rule Collection Group. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("natRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs>? _natRuleCollections;

        /// <summary>
        /// One or more `nat_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs> NatRuleCollections
        {
            get => _natRuleCollections ?? (_natRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionArgs>());
            set => _natRuleCollections = value;
        }

        [Input("networkRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs>? _networkRuleCollections;

        /// <summary>
        /// One or more `network_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs> NetworkRuleCollections
        {
            get => _networkRuleCollections ?? (_networkRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionArgs>());
            set => _networkRuleCollections = value;
        }

        /// <summary>
        /// The priority of the Firewall Policy Rule Collection Group. The range is 100-65000.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        public FirewallPolicyRuleCollectionGroupArgs()
        {
        }
        public static new FirewallPolicyRuleCollectionGroupArgs Empty => new FirewallPolicyRuleCollectionGroupArgs();
    }

    public sealed class FirewallPolicyRuleCollectionGroupState : global::Pulumi.ResourceArgs
    {
        [Input("applicationRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionGetArgs>? _applicationRuleCollections;

        /// <summary>
        /// One or more `application_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionGetArgs> ApplicationRuleCollections
        {
            get => _applicationRuleCollections ?? (_applicationRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionGetArgs>());
            set => _applicationRuleCollections = value;
        }

        /// <summary>
        /// The ID of the Firewall Policy where the Firewall Policy Rule Collection Group should exist. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("firewallPolicyId")]
        public Input<string>? FirewallPolicyId { get; set; }

        /// <summary>
        /// The name which should be used for this Firewall Policy Rule Collection Group. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("natRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionGetArgs>? _natRuleCollections;

        /// <summary>
        /// One or more `nat_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionGetArgs> NatRuleCollections
        {
            get => _natRuleCollections ?? (_natRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionGetArgs>());
            set => _natRuleCollections = value;
        }

        [Input("networkRuleCollections")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionGetArgs>? _networkRuleCollections;

        /// <summary>
        /// One or more `network_rule_collection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionGetArgs> NetworkRuleCollections
        {
            get => _networkRuleCollections ?? (_networkRuleCollections = new InputList<Inputs.FirewallPolicyRuleCollectionGroupNetworkRuleCollectionGetArgs>());
            set => _networkRuleCollections = value;
        }

        /// <summary>
        /// The priority of the Firewall Policy Rule Collection Group. The range is 100-65000.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        public FirewallPolicyRuleCollectionGroupState()
        {
        }
        public static new FirewallPolicyRuleCollectionGroupState Empty => new FirewallPolicyRuleCollectionGroupState();
    }
}
