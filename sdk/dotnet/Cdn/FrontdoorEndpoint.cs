// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    /// <summary>
    /// Manages a Front Door (standard/premium) Endpoint.
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
    ///         Name = "example-cdn-frontdoor",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("example", new()
    ///     {
    ///         Name = "example-profile",
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Standard_AzureFrontDoor",
    ///     });
    /// 
    ///     var exampleFrontdoorEndpoint = new Azure.Cdn.FrontdoorEndpoint("example", new()
    ///     {
    ///         Name = "example-endpoint",
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///         Tags = 
    ///         {
    ///             { "ENV", "example" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Front Door Endpoints can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cdn/frontdoorEndpoint:FrontdoorEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/afdEndpoints/endpoint1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/frontdoorEndpoint:FrontdoorEndpoint")]
    public partial class FrontdoorEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Front Door Profile within which this Front Door Endpoint should exist. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Output("cdnFrontdoorProfileId")]
        public Output<string> CdnFrontdoorProfileId { get; private set; } = null!;

        /// <summary>
        /// Specifies if this Front Door Endpoint is enabled? Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The host name of the Front Door Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Endpoint. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a mapping of tags which should be assigned to the Front Door Endpoint.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a FrontdoorEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrontdoorEndpoint(string name, FrontdoorEndpointArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorEndpoint:FrontdoorEndpoint", name, args ?? new FrontdoorEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrontdoorEndpoint(string name, Input<string> id, FrontdoorEndpointState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorEndpoint:FrontdoorEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FrontdoorEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrontdoorEndpoint Get(string name, Input<string> id, FrontdoorEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new FrontdoorEndpoint(name, id, state, options);
        }
    }

    public sealed class FrontdoorEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile within which this Front Door Endpoint should exist. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId", required: true)]
        public Input<string> CdnFrontdoorProfileId { get; set; } = null!;

        /// <summary>
        /// Specifies if this Front Door Endpoint is enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Endpoint. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Specifies a mapping of tags which should be assigned to the Front Door Endpoint.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FrontdoorEndpointArgs()
        {
        }
        public static new FrontdoorEndpointArgs Empty => new FrontdoorEndpointArgs();
    }

    public sealed class FrontdoorEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile within which this Front Door Endpoint should exist. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId")]
        public Input<string>? CdnFrontdoorProfileId { get; set; }

        /// <summary>
        /// Specifies if this Front Door Endpoint is enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The host name of the Front Door Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Endpoint. Changing this forces a new Front Door Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Specifies a mapping of tags which should be assigned to the Front Door Endpoint.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FrontdoorEndpointState()
        {
        }
        public static new FrontdoorEndpointState Empty => new FrontdoorEndpointState();
    }
}
