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
    /// Manages a VPN Gateway Connection.
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
    ///     var exampleVirtualWan = new Azure.Network.VirtualWan("example", new()
    ///     {
    ///         Name = "example-vwan",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleVirtualHub = new Azure.Network.VirtualHub("example", new()
    ///     {
    ///         Name = "example-hub",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         VirtualWanId = exampleVirtualWan.Id,
    ///         AddressPrefix = "10.0.0.0/24",
    ///     });
    /// 
    ///     var exampleVpnGateway = new Azure.Network.VpnGateway("example", new()
    ///     {
    ///         Name = "example-vpng",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         VirtualHubId = exampleVirtualHub.Id,
    ///     });
    /// 
    ///     var exampleVpnSite = new Azure.Network.VpnSite("example", new()
    ///     {
    ///         Name = "example-vpn-site",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         VirtualWanId = exampleVirtualWan.Id,
    ///         Links = new[]
    ///         {
    ///             new Azure.Network.Inputs.VpnSiteLinkArgs
    ///             {
    ///                 Name = "link1",
    ///                 IpAddress = "10.1.0.0",
    ///             },
    ///             new Azure.Network.Inputs.VpnSiteLinkArgs
    ///             {
    ///                 Name = "link2",
    ///                 IpAddress = "10.2.0.0",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleVpnGatewayConnection = new Azure.Network.VpnGatewayConnection("example", new()
    ///     {
    ///         Name = "example",
    ///         VpnGatewayId = exampleVpnGateway.Id,
    ///         RemoteVpnSiteId = exampleVpnSite.Id,
    ///         VpnLinks = new[]
    ///         {
    ///             new Azure.Network.Inputs.VpnGatewayConnectionVpnLinkArgs
    ///             {
    ///                 Name = "link1",
    ///                 VpnSiteLinkId = exampleVpnSite.Links.Apply(links =&gt; links[0]?.Id),
    ///             },
    ///             new Azure.Network.Inputs.VpnGatewayConnectionVpnLinkArgs
    ///             {
    ///                 Name = "link2",
    ///                 VpnSiteLinkId = exampleVpnSite.Links.Apply(links =&gt; links[1]?.Id),
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
    /// VPN Gateway Connections can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/vpnGatewayConnection:VpnGatewayConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/vpnGateways/gateway1/vpnConnections/conn1
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/vpnGatewayConnection:VpnGatewayConnection")]
    public partial class VpnGatewayConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Output("internetSecurityEnabled")]
        public Output<bool?> InternetSecurityEnabled { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("remoteVpnSiteId")]
        public Output<string> RemoteVpnSiteId { get; private set; } = null!;

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        [Output("routing")]
        public Output<Outputs.VpnGatewayConnectionRouting> Routing { get; private set; } = null!;

        /// <summary>
        /// One or more `traffic_selector_policy` blocks as defined below.
        /// </summary>
        [Output("trafficSelectorPolicies")]
        public Output<ImmutableArray<Outputs.VpnGatewayConnectionTrafficSelectorPolicy>> TrafficSelectorPolicies { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string> VpnGatewayId { get; private set; } = null!;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        [Output("vpnLinks")]
        public Output<ImmutableArray<Outputs.VpnGatewayConnectionVpnLink>> VpnLinks { get; private set; } = null!;


        /// <summary>
        /// Create a VpnGatewayConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpnGatewayConnection(string name, VpnGatewayConnectionArgs args, CustomResourceOptions? options = null)
            : base("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, args ?? new VpnGatewayConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpnGatewayConnection(string name, Input<string> id, VpnGatewayConnectionState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpnGatewayConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpnGatewayConnection Get(string name, Input<string> id, VpnGatewayConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpnGatewayConnection(name, id, state, options);
        }
    }

    public sealed class VpnGatewayConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Input("internetSecurityEnabled")]
        public Input<bool>? InternetSecurityEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("remoteVpnSiteId", required: true)]
        public Input<string> RemoteVpnSiteId { get; set; } = null!;

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        [Input("routing")]
        public Input<Inputs.VpnGatewayConnectionRoutingArgs>? Routing { get; set; }

        [Input("trafficSelectorPolicies")]
        private InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs>? _trafficSelectorPolicies;

        /// <summary>
        /// One or more `traffic_selector_policy` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs> TrafficSelectorPolicies
        {
            get => _trafficSelectorPolicies ?? (_trafficSelectorPolicies = new InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyArgs>());
            set => _trafficSelectorPolicies = value;
        }

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        [Input("vpnLinks", required: true)]
        private InputList<Inputs.VpnGatewayConnectionVpnLinkArgs>? _vpnLinks;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionVpnLinkArgs> VpnLinks
        {
            get => _vpnLinks ?? (_vpnLinks = new InputList<Inputs.VpnGatewayConnectionVpnLinkArgs>());
            set => _vpnLinks = value;
        }

        public VpnGatewayConnectionArgs()
        {
        }
        public static new VpnGatewayConnectionArgs Empty => new VpnGatewayConnectionArgs();
    }

    public sealed class VpnGatewayConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Input("internetSecurityEnabled")]
        public Input<bool>? InternetSecurityEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("remoteVpnSiteId")]
        public Input<string>? RemoteVpnSiteId { get; set; }

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        [Input("routing")]
        public Input<Inputs.VpnGatewayConnectionRoutingGetArgs>? Routing { get; set; }

        [Input("trafficSelectorPolicies")]
        private InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyGetArgs>? _trafficSelectorPolicies;

        /// <summary>
        /// One or more `traffic_selector_policy` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyGetArgs> TrafficSelectorPolicies
        {
            get => _trafficSelectorPolicies ?? (_trafficSelectorPolicies = new InputList<Inputs.VpnGatewayConnectionTrafficSelectorPolicyGetArgs>());
            set => _trafficSelectorPolicies = value;
        }

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        [Input("vpnLinks")]
        private InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs>? _vpnLinks;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs> VpnLinks
        {
            get => _vpnLinks ?? (_vpnLinks = new InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs>());
            set => _vpnLinks = value;
        }

        public VpnGatewayConnectionState()
        {
        }
        public static new VpnGatewayConnectionState Empty => new VpnGatewayConnectionState();
    }
}
