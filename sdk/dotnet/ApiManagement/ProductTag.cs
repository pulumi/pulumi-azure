// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement
{
    /// <summary>
    /// Manages an API Management Product tag
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
    ///     var exampleService = new Azure.ApiManagement.Service("example", new()
    ///     {
    ///         Name = "example-apim",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         PublisherName = "My Company",
    ///         PublisherEmail = "company@terraform.io",
    ///         SkuName = "Developer_1",
    ///     });
    /// 
    ///     var exampleProduct = new Azure.ApiManagement.Product("example", new()
    ///     {
    ///         ProductId = "test-product",
    ///         ApiManagementName = exampleService.Name,
    ///         ResourceGroupName = example.Name,
    ///         DisplayName = "Test Product",
    ///         SubscriptionRequired = true,
    ///         ApprovalRequired = true,
    ///         Published = true,
    ///     });
    /// 
    ///     var exampleTag = new Azure.ApiManagement.Tag("example", new()
    ///     {
    ///         ApiManagementId = exampleService.Id,
    ///         Name = "example-tag",
    ///     });
    /// 
    ///     var exampleProductTag = new Azure.ApiManagement.ProductTag("example", new()
    ///     {
    ///         ApiManagementProductId = exampleProduct.ProductId,
    ///         ApiManagementName = exampleService.Name,
    ///         ResourceGroupName = example.Name,
    ///         Name = exampleTag.Name,
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
    /// * `Microsoft.ApiManagement`: 2022-08-01
    /// 
    /// ## Import
    /// 
    /// API Management Products can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/productTag:ProductTag example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/products/myproduct/tags/mytag
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/productTag:ProductTag")]
    public partial class ProductTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the API Management Service. Changing this forces a new resource to be created.
        /// </summary>
        [Output("apiManagementName")]
        public Output<string> ApiManagementName { get; private set; } = null!;

        /// <summary>
        /// The name of the API Management product. Changing this forces a new resource to be created.
        /// </summary>
        [Output("apiManagementProductId")]
        public Output<string> ApiManagementProductId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a ProductTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProductTag(string name, ProductTagArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/productTag:ProductTag", name, args ?? new ProductTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProductTag(string name, Input<string> id, ProductTagState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/productTag:ProductTag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProductTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProductTag Get(string name, Input<string> id, ProductTagState? state = null, CustomResourceOptions? options = null)
        {
            return new ProductTag(name, id, state, options);
        }
    }

    public sealed class ProductTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the API Management Service. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName", required: true)]
        public Input<string> ApiManagementName { get; set; } = null!;

        /// <summary>
        /// The name of the API Management product. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementProductId", required: true)]
        public Input<string> ApiManagementProductId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public ProductTagArgs()
        {
        }
        public static new ProductTagArgs Empty => new ProductTagArgs();
    }

    public sealed class ProductTagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the API Management Service. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName")]
        public Input<string>? ApiManagementName { get; set; }

        /// <summary>
        /// The name of the API Management product. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementProductId")]
        public Input<string>? ApiManagementProductId { get; set; }

        /// <summary>
        /// The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public ProductTagState()
        {
        }
        public static new ProductTagState Empty => new ProductTagState();
    }
}
