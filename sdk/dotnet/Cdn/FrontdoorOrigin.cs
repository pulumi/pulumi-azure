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
    /// Manages a Front Door (standard/premium) Origin.
    /// 
    /// !&gt; **Note:** If you are attempting to implement an Origin that uses its own Private Link Service with a Load Balancer the Profile resource in your configuration file **must** have a `depends_on` meta-argument which references the `azure.privatedns.LinkService`, see `Example Usage With Private Link Service` below.
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
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("example", new()
    ///     {
    ///         Name = "example-profile",
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Premium_AzureFrontDoor",
    ///     });
    /// 
    ///     var exampleFrontdoorOriginGroup = new Azure.Cdn.FrontdoorOriginGroup("example", new()
    ///     {
    ///         Name = "example-origingroup",
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///         LoadBalancing = null,
    ///     });
    /// 
    ///     var exampleFrontdoorOrigin = new Azure.Cdn.FrontdoorOrigin("example", new()
    ///     {
    ///         Name = "example-origin",
    ///         CdnFrontdoorOriginGroupId = exampleFrontdoorOriginGroup.Id,
    ///         Enabled = true,
    ///         CertificateNameCheckEnabled = false,
    ///         HostName = "contoso.com",
    ///         HttpPort = 80,
    ///         HttpsPort = 443,
    ///         OriginHostHeader = "www.contoso.com",
    ///         Priority = 1,
    ///         Weight = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### With Private Link
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
    ///         Name = "examplestoracc",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Premium",
    ///         AccountReplicationType = "LRS",
    ///         AllowNestedItemsToBePublic = false,
    ///         NetworkRules = new Azure.Storage.Inputs.AccountNetworkRulesArgs
    ///         {
    ///             DefaultAction = "Deny",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "environment", "Example" },
    ///         },
    ///     });
    /// 
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("example", new()
    ///     {
    ///         Name = "example-profile",
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Premium_AzureFrontDoor",
    ///     });
    /// 
    ///     var exampleFrontdoorOriginGroup = new Azure.Cdn.FrontdoorOriginGroup("example", new()
    ///     {
    ///         Name = "example-origin-group",
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///         LoadBalancing = null,
    ///     });
    /// 
    ///     var exampleFrontdoorOrigin = new Azure.Cdn.FrontdoorOrigin("example", new()
    ///     {
    ///         Name = "example-origin",
    ///         CdnFrontdoorOriginGroupId = exampleFrontdoorOriginGroup.Id,
    ///         Enabled = true,
    ///         CertificateNameCheckEnabled = true,
    ///         HostName = exampleAccount.PrimaryBlobHost,
    ///         OriginHostHeader = exampleAccount.PrimaryBlobHost,
    ///         Priority = 1,
    ///         Weight = 500,
    ///         PrivateLink = new Azure.Cdn.Inputs.FrontdoorOriginPrivateLinkArgs
    ///         {
    ///             RequestMessage = "Request access for Private Link Origin CDN Frontdoor",
    ///             TargetType = "blob",
    ///             Location = exampleAccount.Location,
    ///             PrivateLinkTargetId = exampleAccount.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### With Private Link Service
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "vn-example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.5.0.0/16",
    ///         },
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "sn-example",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.5.1.0/24",
    ///         },
    ///         PrivateLinkServiceNetworkPoliciesEnabled = false,
    ///     });
    /// 
    ///     var examplePublicIp = new Azure.Network.PublicIp("example", new()
    ///     {
    ///         Name = "ip-example",
    ///         Sku = "Standard",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AllocationMethod = "Static",
    ///     });
    /// 
    ///     var exampleLoadBalancer = new Azure.Lb.LoadBalancer("example", new()
    ///     {
    ///         Name = "lb-example",
    ///         Sku = "Standard",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         FrontendIpConfigurations = new[]
    ///         {
    ///             new Azure.Lb.Inputs.LoadBalancerFrontendIpConfigurationArgs
    ///             {
    ///                 Name = examplePublicIp.Name,
    ///                 PublicIpAddressId = examplePublicIp.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleLinkService = new Azure.PrivateDns.LinkService("example", new()
    ///     {
    ///         Name = "pls-example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         VisibilitySubscriptionIds = new[]
    ///         {
    ///             current.Apply(getClientConfigResult =&gt; getClientConfigResult.SubscriptionId),
    ///         },
    ///         LoadBalancerFrontendIpConfigurationIds = new[]
    ///         {
    ///             exampleLoadBalancer.FrontendIpConfigurations.Apply(frontendIpConfigurations =&gt; frontendIpConfigurations[0]?.Id),
    ///         },
    ///         NatIpConfigurations = new[]
    ///         {
    ///             new Azure.PrivateDns.Inputs.LinkServiceNatIpConfigurationArgs
    ///             {
    ///                 Name = "primary",
    ///                 PrivateIpAddress = "10.5.1.17",
    ///                 PrivateIpAddressVersion = "IPv4",
    ///                 SubnetId = exampleSubnet.Id,
    ///                 Primary = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("example", new()
    ///     {
    ///         Name = "profile-example",
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Premium_AzureFrontDoor",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleLinkService,
    ///         },
    ///     });
    /// 
    ///     var exampleFrontdoorOriginGroup = new Azure.Cdn.FrontdoorOriginGroup("example", new()
    ///     {
    ///         Name = "group-example",
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///         LoadBalancing = new Azure.Cdn.Inputs.FrontdoorOriginGroupLoadBalancingArgs
    ///         {
    ///             AdditionalLatencyInMilliseconds = 0,
    ///             SampleSize = 16,
    ///             SuccessfulSamplesRequired = 3,
    ///         },
    ///     });
    /// 
    ///     var exampleFrontdoorOrigin = new Azure.Cdn.FrontdoorOrigin("example", new()
    ///     {
    ///         Name = "origin-example",
    ///         CdnFrontdoorOriginGroupId = exampleFrontdoorOriginGroup.Id,
    ///         Enabled = true,
    ///         HostName = "example.com",
    ///         OriginHostHeader = "example.com",
    ///         Priority = 1,
    ///         Weight = 1000,
    ///         CertificateNameCheckEnabled = false,
    ///         PrivateLink = new Azure.Cdn.Inputs.FrontdoorOriginPrivateLinkArgs
    ///         {
    ///             RequestMessage = "Request access for Private Link Origin CDN Frontdoor",
    ///             Location = example.Location,
    ///             PrivateLinkTargetId = exampleLinkService.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example HCL Configurations
    /// 
    /// * Private Link Origin with Storage Account Blob
    /// * Private Link Origin with Storage Account Static Web Site
    /// * Private Link Origin with Linux Web Application
    /// * Private Link Origin with Internal Load Balancer
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.Cdn`: 2024-02-01
    /// 
    /// ## Import
    /// 
    /// Front Door Origins can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cdn/frontdoorOrigin:FrontdoorOrigin example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/originGroups/originGroup1/origins/origin1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/frontdoorOrigin:FrontdoorOrigin")]
    public partial class FrontdoorOrigin : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Output("cdnFrontdoorOriginGroupId")]
        public Output<string> CdnFrontdoorOriginGroupId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether certificate name checks are enabled for this origin.
        /// </summary>
        [Output("certificateNameCheckEnabled")]
        public Output<bool> CertificateNameCheckEnabled { get; private set; } = null!;

        /// <summary>
        /// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The IPv4 address, IPv6 address or Domain name of the Origin.
        /// 
        /// !&gt; **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
        /// </summary>
        [Output("httpPort")]
        public Output<int?> HttpPort { get; private set; } = null!;

        /// <summary>
        /// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
        /// </summary>
        [Output("httpsPort")]
        public Output<int?> HttpsPort { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
        /// 
        /// &gt; **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
        /// </summary>
        [Output("originHostHeader")]
        public Output<string?> OriginHostHeader { get; private set; } = null!;

        /// <summary>
        /// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// A `private_link` block as defined below.
        /// 
        /// &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificate_name_check_enabled` field is set to `true`.
        /// </summary>
        [Output("privateLink")]
        public Output<Outputs.FrontdoorOriginPrivateLink?> PrivateLink { get; private set; } = null!;

        /// <summary>
        /// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
        /// </summary>
        [Output("weight")]
        public Output<int?> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a FrontdoorOrigin resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrontdoorOrigin(string name, FrontdoorOriginArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorOrigin:FrontdoorOrigin", name, args ?? new FrontdoorOriginArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrontdoorOrigin(string name, Input<string> id, FrontdoorOriginState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorOrigin:FrontdoorOrigin", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FrontdoorOrigin resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrontdoorOrigin Get(string name, Input<string> id, FrontdoorOriginState? state = null, CustomResourceOptions? options = null)
        {
            return new FrontdoorOrigin(name, id, state, options);
        }
    }

    public sealed class FrontdoorOriginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Input("cdnFrontdoorOriginGroupId", required: true)]
        public Input<string> CdnFrontdoorOriginGroupId { get; set; } = null!;

        /// <summary>
        /// Specifies whether certificate name checks are enabled for this origin.
        /// </summary>
        [Input("certificateNameCheckEnabled", required: true)]
        public Input<bool> CertificateNameCheckEnabled { get; set; } = null!;

        /// <summary>
        /// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The IPv4 address, IPv6 address or Domain name of the Origin.
        /// 
        /// !&gt; **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
        /// </summary>
        [Input("hostName", required: true)]
        public Input<string> HostName { get; set; } = null!;

        /// <summary>
        /// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
        /// </summary>
        [Input("httpsPort")]
        public Input<int>? HttpsPort { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
        /// 
        /// &gt; **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
        /// </summary>
        [Input("originHostHeader")]
        public Input<string>? OriginHostHeader { get; set; }

        /// <summary>
        /// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// A `private_link` block as defined below.
        /// 
        /// &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificate_name_check_enabled` field is set to `true`.
        /// </summary>
        [Input("privateLink")]
        public Input<Inputs.FrontdoorOriginPrivateLinkArgs>? PrivateLink { get; set; }

        /// <summary>
        /// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public FrontdoorOriginArgs()
        {
        }
        public static new FrontdoorOriginArgs Empty => new FrontdoorOriginArgs();
    }

    public sealed class FrontdoorOriginState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Input("cdnFrontdoorOriginGroupId")]
        public Input<string>? CdnFrontdoorOriginGroupId { get; set; }

        /// <summary>
        /// Specifies whether certificate name checks are enabled for this origin.
        /// </summary>
        [Input("certificateNameCheckEnabled")]
        public Input<bool>? CertificateNameCheckEnabled { get; set; }

        /// <summary>
        /// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The IPv4 address, IPv6 address or Domain name of the Origin.
        /// 
        /// !&gt; **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
        /// </summary>
        [Input("httpsPort")]
        public Input<int>? HttpsPort { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
        /// 
        /// &gt; **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
        /// </summary>
        [Input("originHostHeader")]
        public Input<string>? OriginHostHeader { get; set; }

        /// <summary>
        /// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// A `private_link` block as defined below.
        /// 
        /// &gt; **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificate_name_check_enabled` field is set to `true`.
        /// </summary>
        [Input("privateLink")]
        public Input<Inputs.FrontdoorOriginPrivateLinkGetArgs>? PrivateLink { get; set; }

        /// <summary>
        /// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public FrontdoorOriginState()
        {
        }
        public static new FrontdoorOriginState Empty => new FrontdoorOriginState();
    }
}
