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
    /// Manages a Custom Domain for a CDN Endpoint.
    /// 
    /// !&gt; **Note:** The CDN services from Edgio(formerly Verizon) was shut down on 15 January 2025 and is no longer available .
    /// 
    /// !&gt; **Note:** Support for CDN services from Akamai was removed on 31 October 2023.
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-rg",
    ///         Location = "west europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///     });
    /// 
    ///     var exampleProfile = new Azure.Cdn.Profile("example", new()
    ///     {
    ///         Name = "example-profile",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "Standard_Microsoft",
    ///     });
    /// 
    ///     var exampleEndpoint = new Azure.Cdn.Endpoint("example", new()
    ///     {
    ///         Name = "example-endpoint",
    ///         ProfileName = exampleProfile.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Origins = new[]
    ///         {
    ///             new Azure.Cdn.Inputs.EndpointOriginArgs
    ///             {
    ///                 Name = "example",
    ///                 HostName = exampleAccount.PrimaryBlobHost,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = Azure.Dns.GetZone.Invoke(new()
    ///     {
    ///         Name = "example-domain.com",
    ///         ResourceGroupName = "domain-rg",
    ///     });
    /// 
    ///     var exampleCNameRecord = new Azure.Dns.CNameRecord("example", new()
    ///     {
    ///         Name = "example",
    ///         ZoneName = example.Apply(getZoneResult =&gt; getZoneResult.Name),
    ///         ResourceGroupName = example.Apply(getZoneResult =&gt; getZoneResult.ResourceGroupName),
    ///         Ttl = 3600,
    ///         TargetResourceId = exampleEndpoint.Id,
    ///     });
    /// 
    ///     var exampleEndpointCustomDomain = new Azure.Cdn.EndpointCustomDomain("example", new()
    ///     {
    ///         Name = "example-domain",
    ///         CdnEndpointId = exampleEndpoint.Id,
    ///         HostName = Output.Tuple(exampleCNameRecord.Name, example).Apply(values =&gt;
    ///         {
    ///             var name = values.Item1;
    ///             var example = values.Item2;
    ///             return $"{name}.{example.Apply(getZoneResult =&gt; getZoneResult.Name)}";
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CDN Endpoint Custom Domains can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cdn/endpointCustomDomain:EndpointCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/customDomains/domain1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/endpointCustomDomain:EndpointCustomDomain")]
    public partial class EndpointCustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Output("cdnEndpointId")]
        public Output<string> CdnEndpointId { get; private set; } = null!;

        /// <summary>
        /// A `cdn_managed_https` block as defined below.
        /// </summary>
        [Output("cdnManagedHttps")]
        public Output<Outputs.EndpointCustomDomainCdnManagedHttps?> CdnManagedHttps { get; private set; } = null!;

        /// <summary>
        /// The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `user_managed_https` block as defined below.
        /// 
        /// &gt; **Note:** Only one of `cdn_managed_https` and `user_managed_https` can be specified.
        /// </summary>
        [Output("userManagedHttps")]
        public Output<Outputs.EndpointCustomDomainUserManagedHttps?> UserManagedHttps { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointCustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointCustomDomain(string name, EndpointCustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/endpointCustomDomain:EndpointCustomDomain", name, args ?? new EndpointCustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointCustomDomain(string name, Input<string> id, EndpointCustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/endpointCustomDomain:EndpointCustomDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointCustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointCustomDomain Get(string name, Input<string> id, EndpointCustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointCustomDomain(name, id, state, options);
        }
    }

    public sealed class EndpointCustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("cdnEndpointId", required: true)]
        public Input<string> CdnEndpointId { get; set; } = null!;

        /// <summary>
        /// A `cdn_managed_https` block as defined below.
        /// </summary>
        [Input("cdnManagedHttps")]
        public Input<Inputs.EndpointCustomDomainCdnManagedHttpsArgs>? CdnManagedHttps { get; set; }

        /// <summary>
        /// The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("hostName", required: true)]
        public Input<string> HostName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `user_managed_https` block as defined below.
        /// 
        /// &gt; **Note:** Only one of `cdn_managed_https` and `user_managed_https` can be specified.
        /// </summary>
        [Input("userManagedHttps")]
        public Input<Inputs.EndpointCustomDomainUserManagedHttpsArgs>? UserManagedHttps { get; set; }

        public EndpointCustomDomainArgs()
        {
        }
        public static new EndpointCustomDomainArgs Empty => new EndpointCustomDomainArgs();
    }

    public sealed class EndpointCustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("cdnEndpointId")]
        public Input<string>? CdnEndpointId { get; set; }

        /// <summary>
        /// A `cdn_managed_https` block as defined below.
        /// </summary>
        [Input("cdnManagedHttps")]
        public Input<Inputs.EndpointCustomDomainCdnManagedHttpsGetArgs>? CdnManagedHttps { get; set; }

        /// <summary>
        /// The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `user_managed_https` block as defined below.
        /// 
        /// &gt; **Note:** Only one of `cdn_managed_https` and `user_managed_https` can be specified.
        /// </summary>
        [Input("userManagedHttps")]
        public Input<Inputs.EndpointCustomDomainUserManagedHttpsGetArgs>? UserManagedHttps { get; set; }

        public EndpointCustomDomainState()
        {
        }
        public static new EndpointCustomDomainState Empty => new EndpointCustomDomainState();
    }
}
