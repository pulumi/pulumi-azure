// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR
{
    /// <summary>
    /// Manages the Network ACL for a SignalR service.
    /// 
    /// ## Import
    /// 
    /// Network ACLs for a SignalR service can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:signalr/serviceNetworkAcl:ServiceNetworkAcl example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/signalR/signalr1
    /// ```
    /// </summary>
    [AzureResourceType("azure:signalr/serviceNetworkAcl:ServiceNetworkAcl")]
    public partial class ServiceNetworkAcl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
        /// </summary>
        [Output("defaultAction")]
        public Output<string> DefaultAction { get; private set; } = null!;

        /// <summary>
        /// A `private_endpoint` block as defined below.
        /// </summary>
        [Output("privateEndpoints")]
        public Output<ImmutableArray<Outputs.ServiceNetworkAclPrivateEndpoint>> PrivateEndpoints { get; private set; } = null!;

        /// <summary>
        /// A `public_network` block as defined below.
        /// </summary>
        [Output("publicNetwork")]
        public Output<Outputs.ServiceNetworkAclPublicNetwork> PublicNetwork { get; private set; } = null!;

        /// <summary>
        /// The ID of the SignalR service. Changing this forces a new resource to be created.
        /// </summary>
        [Output("signalrServiceId")]
        public Output<string> SignalrServiceId { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceNetworkAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceNetworkAcl(string name, ServiceNetworkAclArgs args, CustomResourceOptions? options = null)
            : base("azure:signalr/serviceNetworkAcl:ServiceNetworkAcl", name, args ?? new ServiceNetworkAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceNetworkAcl(string name, Input<string> id, ServiceNetworkAclState? state = null, CustomResourceOptions? options = null)
            : base("azure:signalr/serviceNetworkAcl:ServiceNetworkAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceNetworkAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceNetworkAcl Get(string name, Input<string> id, ServiceNetworkAclState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceNetworkAcl(name, id, state, options);
        }
    }

    public sealed class ServiceNetworkAclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
        /// </summary>
        [Input("defaultAction", required: true)]
        public Input<string> DefaultAction { get; set; } = null!;

        [Input("privateEndpoints")]
        private InputList<Inputs.ServiceNetworkAclPrivateEndpointArgs>? _privateEndpoints;

        /// <summary>
        /// A `private_endpoint` block as defined below.
        /// </summary>
        public InputList<Inputs.ServiceNetworkAclPrivateEndpointArgs> PrivateEndpoints
        {
            get => _privateEndpoints ?? (_privateEndpoints = new InputList<Inputs.ServiceNetworkAclPrivateEndpointArgs>());
            set => _privateEndpoints = value;
        }

        /// <summary>
        /// A `public_network` block as defined below.
        /// </summary>
        [Input("publicNetwork", required: true)]
        public Input<Inputs.ServiceNetworkAclPublicNetworkArgs> PublicNetwork { get; set; } = null!;

        /// <summary>
        /// The ID of the SignalR service. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrServiceId", required: true)]
        public Input<string> SignalrServiceId { get; set; } = null!;

        public ServiceNetworkAclArgs()
        {
        }
        public static new ServiceNetworkAclArgs Empty => new ServiceNetworkAclArgs();
    }

    public sealed class ServiceNetworkAclState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("privateEndpoints")]
        private InputList<Inputs.ServiceNetworkAclPrivateEndpointGetArgs>? _privateEndpoints;

        /// <summary>
        /// A `private_endpoint` block as defined below.
        /// </summary>
        public InputList<Inputs.ServiceNetworkAclPrivateEndpointGetArgs> PrivateEndpoints
        {
            get => _privateEndpoints ?? (_privateEndpoints = new InputList<Inputs.ServiceNetworkAclPrivateEndpointGetArgs>());
            set => _privateEndpoints = value;
        }

        /// <summary>
        /// A `public_network` block as defined below.
        /// </summary>
        [Input("publicNetwork")]
        public Input<Inputs.ServiceNetworkAclPublicNetworkGetArgs>? PublicNetwork { get; set; }

        /// <summary>
        /// The ID of the SignalR service. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrServiceId")]
        public Input<string>? SignalrServiceId { get; set; }

        public ServiceNetworkAclState()
        {
        }
        public static new ServiceNetworkAclState Empty => new ServiceNetworkAclState();
    }
}
