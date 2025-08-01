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
    /// Manages an IP group that contains a list of CIDRs and/or IP addresses.
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
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleIPGroup = new Azure.Network.IPGroup("example", new()
    ///     {
    ///         Name = "example1-ipgroup",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Cidrs = new[]
    ///         {
    ///             "192.168.0.1",
    ///             "172.16.240.0/20",
    ///             "10.48.0.0/12",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "environment", "Production" },
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
    /// IP Groups can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/iPGroup:IPGroup ipgroup1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/ipGroups/myIpGroup
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/iPGroup:IPGroup")]
    public partial class IPGroup : global::Pulumi.CustomResource
    {
        [Output("cidrs")]
        public Output<ImmutableArray<string>> Cidrs { get; private set; } = null!;

        /// <summary>
        /// A list of ID of Firewall.
        /// </summary>
        [Output("firewallIds")]
        public Output<ImmutableArray<string>> FirewallIds { get; private set; } = null!;

        /// <summary>
        /// A list of ID of Firewall Policy`.
        /// </summary>
        [Output("firewallPolicyIds")]
        public Output<ImmutableArray<string>> FirewallPolicyIds { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a IPGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IPGroup(string name, IPGroupArgs args, CustomResourceOptions? options = null)
            : base("azure:network/iPGroup:IPGroup", name, args ?? new IPGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IPGroup(string name, Input<string> id, IPGroupState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/iPGroup:IPGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IPGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IPGroup Get(string name, Input<string> id, IPGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new IPGroup(name, id, state, options);
        }
    }

    public sealed class IPGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrs")]
        private InputList<string>? _cidrs;
        public InputList<string> Cidrs
        {
            get => _cidrs ?? (_cidrs = new InputList<string>());
            set => _cidrs = value;
        }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public IPGroupArgs()
        {
        }
        public static new IPGroupArgs Empty => new IPGroupArgs();
    }

    public sealed class IPGroupState : global::Pulumi.ResourceArgs
    {
        [Input("cidrs")]
        private InputList<string>? _cidrs;
        public InputList<string> Cidrs
        {
            get => _cidrs ?? (_cidrs = new InputList<string>());
            set => _cidrs = value;
        }

        [Input("firewallIds")]
        private InputList<string>? _firewallIds;

        /// <summary>
        /// A list of ID of Firewall.
        /// </summary>
        public InputList<string> FirewallIds
        {
            get => _firewallIds ?? (_firewallIds = new InputList<string>());
            set => _firewallIds = value;
        }

        [Input("firewallPolicyIds")]
        private InputList<string>? _firewallPolicyIds;

        /// <summary>
        /// A list of ID of Firewall Policy`.
        /// </summary>
        public InputList<string> FirewallPolicyIds
        {
            get => _firewallPolicyIds ?? (_firewallPolicyIds = new InputList<string>());
            set => _firewallPolicyIds = value;
        }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the IP group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public IPGroupState()
        {
        }
        public static new IPGroupState Empty => new IPGroupState();
    }
}
