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
    /// Manages a Express Route Port.
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
    ///         Location = "West US",
    ///     });
    /// 
    ///     var exampleExpressRoutePort = new Azure.Network.ExpressRoutePort("example", new()
    ///     {
    ///         Name = "port1",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         PeeringLocation = "Airtel-Chennai-CLS",
    ///         BandwidthInGbps = 10,
    ///         Encapsulation = "Dot1Q",
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
    /// Express Route Ports can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/expressRoutePort:ExpressRoutePort example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/expressRoutePorts/port1
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/expressRoutePort:ExpressRoutePort")]
    public partial class ExpressRoutePort : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Bandwidth of the Express Route Port in Gbps. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Output("bandwidthInGbps")]
        public Output<int> BandwidthInGbps { get; private set; } = null!;

        /// <summary>
        /// The billing type of the Express Route Port. Possible values are `MeteredData` and `UnlimitedData`. Defaults to `MeteredData`.
        /// </summary>
        [Output("billingType")]
        public Output<string?> BillingType { get; private set; } = null!;

        /// <summary>
        /// The encapsulation method used for the Express Route Port. Changing this forces a new Express Route Port to be created. Possible values are: `Dot1Q`, `QinQ`.
        /// </summary>
        [Output("encapsulation")]
        public Output<string> Encapsulation { get; private set; } = null!;

        /// <summary>
        /// The EtherType of the Express Route Port.
        /// </summary>
        [Output("ethertype")]
        public Output<string> Ethertype { get; private set; } = null!;

        /// <summary>
        /// The resource GUID of the Express Route Port.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.ExpressRoutePortIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Output("link1")]
        public Output<Outputs.ExpressRoutePortLink1> Link1 { get; private set; } = null!;

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Output("link2")]
        public Output<Outputs.ExpressRoutePortLink2> Link2 { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The maximum transmission unit of the Express Route Port.
        /// </summary>
        [Output("mtu")]
        public Output<string> Mtu { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Express Route Port. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the peering location that this Express Route Port is physically mapped to. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Output("peeringLocation")]
        public Output<string> PeeringLocation { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Express Route Port.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ExpressRoutePort resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExpressRoutePort(string name, ExpressRoutePortArgs args, CustomResourceOptions? options = null)
            : base("azure:network/expressRoutePort:ExpressRoutePort", name, args ?? new ExpressRoutePortArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExpressRoutePort(string name, Input<string> id, ExpressRoutePortState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/expressRoutePort:ExpressRoutePort", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExpressRoutePort resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExpressRoutePort Get(string name, Input<string> id, ExpressRoutePortState? state = null, CustomResourceOptions? options = null)
        {
            return new ExpressRoutePort(name, id, state, options);
        }
    }

    public sealed class ExpressRoutePortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bandwidth of the Express Route Port in Gbps. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("bandwidthInGbps", required: true)]
        public Input<int> BandwidthInGbps { get; set; } = null!;

        /// <summary>
        /// The billing type of the Express Route Port. Possible values are `MeteredData` and `UnlimitedData`. Defaults to `MeteredData`.
        /// </summary>
        [Input("billingType")]
        public Input<string>? BillingType { get; set; }

        /// <summary>
        /// The encapsulation method used for the Express Route Port. Changing this forces a new Express Route Port to be created. Possible values are: `Dot1Q`, `QinQ`.
        /// </summary>
        [Input("encapsulation", required: true)]
        public Input<string> Encapsulation { get; set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ExpressRoutePortIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Input("link1")]
        public Input<Inputs.ExpressRoutePortLink1Args>? Link1 { get; set; }

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Input("link2")]
        public Input<Inputs.ExpressRoutePortLink2Args>? Link2 { get; set; }

        /// <summary>
        /// The Azure Region where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Express Route Port. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the peering location that this Express Route Port is physically mapped to. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("peeringLocation", required: true)]
        public Input<string> PeeringLocation { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Express Route Port.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ExpressRoutePortArgs()
        {
        }
        public static new ExpressRoutePortArgs Empty => new ExpressRoutePortArgs();
    }

    public sealed class ExpressRoutePortState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bandwidth of the Express Route Port in Gbps. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("bandwidthInGbps")]
        public Input<int>? BandwidthInGbps { get; set; }

        /// <summary>
        /// The billing type of the Express Route Port. Possible values are `MeteredData` and `UnlimitedData`. Defaults to `MeteredData`.
        /// </summary>
        [Input("billingType")]
        public Input<string>? BillingType { get; set; }

        /// <summary>
        /// The encapsulation method used for the Express Route Port. Changing this forces a new Express Route Port to be created. Possible values are: `Dot1Q`, `QinQ`.
        /// </summary>
        [Input("encapsulation")]
        public Input<string>? Encapsulation { get; set; }

        /// <summary>
        /// The EtherType of the Express Route Port.
        /// </summary>
        [Input("ethertype")]
        public Input<string>? Ethertype { get; set; }

        /// <summary>
        /// The resource GUID of the Express Route Port.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ExpressRoutePortIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Input("link1")]
        public Input<Inputs.ExpressRoutePortLink1GetArgs>? Link1 { get; set; }

        /// <summary>
        /// A list of `link` blocks as defined below.
        /// </summary>
        [Input("link2")]
        public Input<Inputs.ExpressRoutePortLink2GetArgs>? Link2 { get; set; }

        /// <summary>
        /// The Azure Region where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The maximum transmission unit of the Express Route Port.
        /// </summary>
        [Input("mtu")]
        public Input<string>? Mtu { get; set; }

        /// <summary>
        /// The name which should be used for this Express Route Port. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the peering location that this Express Route Port is physically mapped to. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("peeringLocation")]
        public Input<string>? PeeringLocation { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Express Route Port should exist. Changing this forces a new Express Route Port to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Express Route Port.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ExpressRoutePortState()
        {
        }
        public static new ExpressRoutePortState Empty => new ExpressRoutePortState();
    }
}
