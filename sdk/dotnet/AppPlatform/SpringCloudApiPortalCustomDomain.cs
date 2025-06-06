// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform
{
    /// <summary>
    /// Manages a Spring Cloud API Portal Domain.
    /// 
    /// &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
    /// 
    /// !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApiPortalCustomDomain` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
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
    ///     var exampleSpringCloudService = new Azure.AppPlatform.SpringCloudService("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "E0",
    ///     });
    /// 
    ///     var exampleSpringCloudGateway = new Azure.AppPlatform.SpringCloudGateway("example", new()
    ///     {
    ///         Name = "default",
    ///         SpringCloudServiceId = exampleSpringCloudService.Id,
    ///     });
    /// 
    ///     var exampleSpringCloudApiPortal = new Azure.AppPlatform.SpringCloudApiPortal("example", new()
    ///     {
    ///         Name = "default",
    ///         SpringCloudServiceId = exampleSpringCloudService.Id,
    ///         GatewayIds = new[]
    ///         {
    ///             exampleSpringCloudGateway.Id,
    ///         },
    ///     });
    /// 
    ///     var exampleSpringCloudApiPortalCustomDomain = new Azure.AppPlatform.SpringCloudApiPortalCustomDomain("example", new()
    ///     {
    ///         Name = "example.com",
    ///         SpringCloudApiPortalId = exampleSpringCloudApiPortal.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Spring Cloud API Portal Domains can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:appplatform/springCloudApiPortalCustomDomain:SpringCloudApiPortalCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/spring/service1/apiPortals/apiPortal1/domains/domain1
    /// ```
    /// </summary>
    [AzureResourceType("azure:appplatform/springCloudApiPortalCustomDomain:SpringCloudApiPortalCustomDomain")]
    public partial class SpringCloudApiPortalCustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Output("springCloudApiPortalId")]
        public Output<string> SpringCloudApiPortalId { get; private set; } = null!;

        /// <summary>
        /// Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
        /// </summary>
        [Output("thumbprint")]
        public Output<string?> Thumbprint { get; private set; } = null!;


        /// <summary>
        /// Create a SpringCloudApiPortalCustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpringCloudApiPortalCustomDomain(string name, SpringCloudApiPortalCustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudApiPortalCustomDomain:SpringCloudApiPortalCustomDomain", name, args ?? new SpringCloudApiPortalCustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpringCloudApiPortalCustomDomain(string name, Input<string> id, SpringCloudApiPortalCustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudApiPortalCustomDomain:SpringCloudApiPortalCustomDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpringCloudApiPortalCustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpringCloudApiPortalCustomDomain Get(string name, Input<string> id, SpringCloudApiPortalCustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new SpringCloudApiPortalCustomDomain(name, id, state, options);
        }
    }

    public sealed class SpringCloudApiPortalCustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Input("springCloudApiPortalId", required: true)]
        public Input<string> SpringCloudApiPortalId { get; set; } = null!;

        /// <summary>
        /// Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        public SpringCloudApiPortalCustomDomainArgs()
        {
        }
        public static new SpringCloudApiPortalCustomDomainArgs Empty => new SpringCloudApiPortalCustomDomainArgs();
    }

    public sealed class SpringCloudApiPortalCustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
        /// </summary>
        [Input("springCloudApiPortalId")]
        public Input<string>? SpringCloudApiPortalId { get; set; }

        /// <summary>
        /// Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        public SpringCloudApiPortalCustomDomainState()
        {
        }
        public static new SpringCloudApiPortalCustomDomainState Empty => new SpringCloudApiPortalCustomDomainState();
    }
}
