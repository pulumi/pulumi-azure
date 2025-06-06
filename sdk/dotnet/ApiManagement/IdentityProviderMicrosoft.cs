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
    /// Manages an API Management Microsoft Identity Provider.
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
    ///         PublisherEmail = "company@mycompany.io",
    ///         SkuName = "Developer_1",
    ///     });
    /// 
    ///     var exampleIdentityProviderMicrosoft = new Azure.ApiManagement.IdentityProviderMicrosoft("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         ApiManagementName = exampleService.Name,
    ///         ClientId = "00000000-0000-0000-0000-000000000000",
    ///         ClientSecret = "00000000000000000000000000000000",
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
    /// API Management Microsoft Identity Provider can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/identityProviders/microsoft
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft")]
    public partial class IdentityProviderMicrosoft : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("apiManagementName")]
        public Output<string> ApiManagementName { get; private set; } = null!;

        /// <summary>
        /// Client Id of the Azure AD Application.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// Client secret of the Azure AD Application.
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a IdentityProviderMicrosoft resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IdentityProviderMicrosoft(string name, IdentityProviderMicrosoftArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft", name, args ?? new IdentityProviderMicrosoftArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IdentityProviderMicrosoft(string name, Input<string> id, IdentityProviderMicrosoftState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/identityProviderMicrosoft:IdentityProviderMicrosoft", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "clientSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IdentityProviderMicrosoft resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IdentityProviderMicrosoft Get(string name, Input<string> id, IdentityProviderMicrosoftState? state = null, CustomResourceOptions? options = null)
        {
            return new IdentityProviderMicrosoft(name, id, state, options);
        }
    }

    public sealed class IdentityProviderMicrosoftArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName", required: true)]
        public Input<string> ApiManagementName { get; set; } = null!;

        /// <summary>
        /// Client Id of the Azure AD Application.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("clientSecret", required: true)]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Client secret of the Azure AD Application.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public IdentityProviderMicrosoftArgs()
        {
        }
        public static new IdentityProviderMicrosoftArgs Empty => new IdentityProviderMicrosoftArgs();
    }

    public sealed class IdentityProviderMicrosoftState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName")]
        public Input<string>? ApiManagementName { get; set; }

        /// <summary>
        /// Client Id of the Azure AD Application.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Client secret of the Azure AD Application.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public IdentityProviderMicrosoftState()
        {
        }
        public static new IdentityProviderMicrosoftState Empty => new IdentityProviderMicrosoftState();
    }
}
