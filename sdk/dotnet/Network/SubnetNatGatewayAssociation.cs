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
    /// Associates a NAT Gateway with a Subnet within a Virtual Network.
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
    ///         Name = "example-nat-gateway-rg",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-network",
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
    ///         Name = "example-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleNatGateway = new Azure.Network.NatGateway("example", new()
    ///     {
    ///         Name = "example-natgateway",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleSubnetNatGatewayAssociation = new Azure.Network.SubnetNatGatewayAssociation("example", new()
    ///     {
    ///         SubnetId = exampleSubnet.Id,
    ///         NatGatewayId = exampleNatGateway.Id,
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
    /// Subnet NAT Gateway Associations can be imported using the `resource id` of the Subnet, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:network/subnetNatGatewayAssociation:SubnetNatGatewayAssociation association1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/virtualNetworks/myvnet1/subnets/mysubnet1
    /// ```
    /// </summary>
    [AzureResourceType("azure:network/subnetNatGatewayAssociation:SubnetNatGatewayAssociation")]
    public partial class SubnetNatGatewayAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Output("natGatewayId")]
        public Output<string> NatGatewayId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;


        /// <summary>
        /// Create a SubnetNatGatewayAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SubnetNatGatewayAssociation(string name, SubnetNatGatewayAssociationArgs args, CustomResourceOptions? options = null)
            : base("azure:network/subnetNatGatewayAssociation:SubnetNatGatewayAssociation", name, args ?? new SubnetNatGatewayAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SubnetNatGatewayAssociation(string name, Input<string> id, SubnetNatGatewayAssociationState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/subnetNatGatewayAssociation:SubnetNatGatewayAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SubnetNatGatewayAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SubnetNatGatewayAssociation Get(string name, Input<string> id, SubnetNatGatewayAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new SubnetNatGatewayAssociation(name, id, state, options);
        }
    }

    public sealed class SubnetNatGatewayAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Input("natGatewayId", required: true)]
        public Input<string> NatGatewayId { get; set; } = null!;

        /// <summary>
        /// The ID of the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public SubnetNatGatewayAssociationArgs()
        {
        }
        public static new SubnetNatGatewayAssociationArgs Empty => new SubnetNatGatewayAssociationArgs();
    }

    public sealed class SubnetNatGatewayAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Input("natGatewayId")]
        public Input<string>? NatGatewayId { get; set; }

        /// <summary>
        /// The ID of the Subnet. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public SubnetNatGatewayAssociationState()
        {
        }
        public static new SubnetNatGatewayAssociationState Empty => new SubnetNatGatewayAssociationState();
    }
}
