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
    /// Manages a API Management API Operation Tag.
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
    ///     var example = Azure.ApiManagement.GetApi.Invoke(new()
    ///     {
    ///         Name = "search-api",
    ///         ApiManagementName = "search-api-management",
    ///         ResourceGroupName = "search-service",
    ///         Revision = "2",
    ///     });
    /// 
    ///     var exampleApiOperation = new Azure.ApiManagement.ApiOperation("example", new()
    ///     {
    ///         OperationId = "user-delete",
    ///         ApiName = example.Apply(getApiResult =&gt; getApiResult.Name),
    ///         ApiManagementName = example.Apply(getApiResult =&gt; getApiResult.ApiManagementName),
    ///         ResourceGroupName = example.Apply(getApiResult =&gt; getApiResult.ResourceGroupName),
    ///         DisplayName = "Delete User Operation",
    ///         Method = "DELETE",
    ///         UrlTemplate = "/users/{id}/delete",
    ///         Description = "This can only be done by the logged in user.",
    ///         TemplateParameters = new[]
    ///         {
    ///             new Azure.ApiManagement.Inputs.ApiOperationTemplateParameterArgs
    ///             {
    ///                 Name = "id",
    ///                 Type = "number",
    ///                 Required = true,
    ///             },
    ///         },
    ///         Responses = new[]
    ///         {
    ///             new Azure.ApiManagement.Inputs.ApiOperationResponseArgs
    ///             {
    ///                 StatusCode = 200,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleApiOperationTag = new Azure.ApiManagement.ApiOperationTag("example", new()
    ///     {
    ///         Name = "example-Tag",
    ///         ApiOperationId = exampleApiOperation.Id,
    ///         DisplayName = "example-Tag",
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
    /// API Management API Operation Tags can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/apiOperationTag:ApiOperationTag example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/apis/api1/operations/operation1/tags/tag1
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/apiOperationTag:ApiOperationTag")]
    public partial class ApiOperationTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
        /// </summary>
        [Output("apiOperationId")]
        public Output<string> ApiOperationId { get; private set; } = null!;

        /// <summary>
        /// The display name of the API Management API Operation Tag.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a ApiOperationTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiOperationTag(string name, ApiOperationTagArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/apiOperationTag:ApiOperationTag", name, args ?? new ApiOperationTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiOperationTag(string name, Input<string> id, ApiOperationTagState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/apiOperationTag:ApiOperationTag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiOperationTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiOperationTag Get(string name, Input<string> id, ApiOperationTagState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiOperationTag(name, id, state, options);
        }
    }

    public sealed class ApiOperationTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
        /// </summary>
        [Input("apiOperationId", required: true)]
        public Input<string> ApiOperationId { get; set; } = null!;

        /// <summary>
        /// The display name of the API Management API Operation Tag.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApiOperationTagArgs()
        {
        }
        public static new ApiOperationTagArgs Empty => new ApiOperationTagArgs();
    }

    public sealed class ApiOperationTagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
        /// </summary>
        [Input("apiOperationId")]
        public Input<string>? ApiOperationId { get; set; }

        /// <summary>
        /// The display name of the API Management API Operation Tag.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApiOperationTagState()
        {
        }
        public static new ApiOperationTagState Empty => new ApiOperationTagState();
    }
}
