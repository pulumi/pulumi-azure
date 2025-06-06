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
    /// Manages an API Management Azure AD B2C Identity Provider.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using AzureAD = Pulumi.AzureAD;
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
    ///     var exampleApplication = new AzureAD.Application("example", new()
    ///     {
    ///         DisplayName = "acctestam-example",
    ///     });
    /// 
    ///     var exampleApplicationPassword = new AzureAD.ApplicationPassword("example", new()
    ///     {
    ///         ApplicationObjectId = exampleApplication.ObjectId,
    ///         EndDateRelative = "36h",
    ///     });
    /// 
    ///     var exampleIdentityProviderAadb2c = new Azure.ApiManagement.IdentityProviderAadb2c("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         ApiManagementName = exampleService.Name,
    ///         ClientId = exampleApplication.ApplicationId,
    ///         ClientSecret = "P@55w0rD!",
    ///         AllowedTenant = "myb2ctenant.onmicrosoft.com",
    ///         SigninTenant = "myb2ctenant.onmicrosoft.com",
    ///         Authority = "myb2ctenant.b2clogin.com",
    ///         SigninPolicy = "B2C_1_Login",
    ///         SignupPolicy = "B2C_1_Signup",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleApplicationPassword,
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
    /// * `Microsoft.ApiManagement`: 2022-08-01
    /// 
    /// ## Import
    /// 
    /// API Management Azure AD B2C Identity Providers can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/identityProviderAadb2c:IdentityProviderAadb2c example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/service1/identityProviders/aadB2C
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/identityProviderAadb2c:IdentityProviderAadb2c")]
    public partial class IdentityProviderAadb2c : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The allowed AAD tenant, usually your B2C tenant domain.
        /// </summary>
        [Output("allowedTenant")]
        public Output<string> AllowedTenant { get; private set; } = null!;

        /// <summary>
        /// The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("apiManagementName")]
        public Output<string> ApiManagementName { get; private set; } = null!;

        /// <summary>
        /// OpenID Connect discovery endpoint hostname, usually your b2clogin.com domain.
        /// </summary>
        [Output("authority")]
        public Output<string> Authority { get; private set; } = null!;

        /// <summary>
        /// Client ID of the Application in your B2C tenant.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// The client library to be used in the Azure AD B2C Identity Provider.
        /// </summary>
        [Output("clientLibrary")]
        public Output<string?> ClientLibrary { get; private set; } = null!;

        /// <summary>
        /// Client secret of the Application in your B2C tenant.
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Password reset Policy Name.
        /// </summary>
        [Output("passwordResetPolicy")]
        public Output<string?> PasswordResetPolicy { get; private set; } = null!;

        /// <summary>
        /// Profile editing Policy Name.
        /// </summary>
        [Output("profileEditingPolicy")]
        public Output<string?> ProfileEditingPolicy { get; private set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Signin Policy Name.
        /// </summary>
        [Output("signinPolicy")]
        public Output<string> SigninPolicy { get; private set; } = null!;

        /// <summary>
        /// The tenant to use instead of Common when logging into Active Directory, usually your B2C tenant domain.
        /// </summary>
        [Output("signinTenant")]
        public Output<string> SigninTenant { get; private set; } = null!;

        /// <summary>
        /// Signup Policy Name.
        /// </summary>
        [Output("signupPolicy")]
        public Output<string> SignupPolicy { get; private set; } = null!;


        /// <summary>
        /// Create a IdentityProviderAadb2c resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IdentityProviderAadb2c(string name, IdentityProviderAadb2cArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/identityProviderAadb2c:IdentityProviderAadb2c", name, args ?? new IdentityProviderAadb2cArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IdentityProviderAadb2c(string name, Input<string> id, IdentityProviderAadb2cState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/identityProviderAadb2c:IdentityProviderAadb2c", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IdentityProviderAadb2c resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IdentityProviderAadb2c Get(string name, Input<string> id, IdentityProviderAadb2cState? state = null, CustomResourceOptions? options = null)
        {
            return new IdentityProviderAadb2c(name, id, state, options);
        }
    }

    public sealed class IdentityProviderAadb2cArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allowed AAD tenant, usually your B2C tenant domain.
        /// </summary>
        [Input("allowedTenant", required: true)]
        public Input<string> AllowedTenant { get; set; } = null!;

        /// <summary>
        /// The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName", required: true)]
        public Input<string> ApiManagementName { get; set; } = null!;

        /// <summary>
        /// OpenID Connect discovery endpoint hostname, usually your b2clogin.com domain.
        /// </summary>
        [Input("authority", required: true)]
        public Input<string> Authority { get; set; } = null!;

        /// <summary>
        /// Client ID of the Application in your B2C tenant.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// The client library to be used in the Azure AD B2C Identity Provider.
        /// </summary>
        [Input("clientLibrary")]
        public Input<string>? ClientLibrary { get; set; }

        [Input("clientSecret", required: true)]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Client secret of the Application in your B2C tenant.
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
        /// Password reset Policy Name.
        /// </summary>
        [Input("passwordResetPolicy")]
        public Input<string>? PasswordResetPolicy { get; set; }

        /// <summary>
        /// Profile editing Policy Name.
        /// </summary>
        [Input("profileEditingPolicy")]
        public Input<string>? ProfileEditingPolicy { get; set; }

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Signin Policy Name.
        /// </summary>
        [Input("signinPolicy", required: true)]
        public Input<string> SigninPolicy { get; set; } = null!;

        /// <summary>
        /// The tenant to use instead of Common when logging into Active Directory, usually your B2C tenant domain.
        /// </summary>
        [Input("signinTenant", required: true)]
        public Input<string> SigninTenant { get; set; } = null!;

        /// <summary>
        /// Signup Policy Name.
        /// </summary>
        [Input("signupPolicy", required: true)]
        public Input<string> SignupPolicy { get; set; } = null!;

        public IdentityProviderAadb2cArgs()
        {
        }
        public static new IdentityProviderAadb2cArgs Empty => new IdentityProviderAadb2cArgs();
    }

    public sealed class IdentityProviderAadb2cState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allowed AAD tenant, usually your B2C tenant domain.
        /// </summary>
        [Input("allowedTenant")]
        public Input<string>? AllowedTenant { get; set; }

        /// <summary>
        /// The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("apiManagementName")]
        public Input<string>? ApiManagementName { get; set; }

        /// <summary>
        /// OpenID Connect discovery endpoint hostname, usually your b2clogin.com domain.
        /// </summary>
        [Input("authority")]
        public Input<string>? Authority { get; set; }

        /// <summary>
        /// Client ID of the Application in your B2C tenant.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The client library to be used in the Azure AD B2C Identity Provider.
        /// </summary>
        [Input("clientLibrary")]
        public Input<string>? ClientLibrary { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Client secret of the Application in your B2C tenant.
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
        /// Password reset Policy Name.
        /// </summary>
        [Input("passwordResetPolicy")]
        public Input<string>? PasswordResetPolicy { get; set; }

        /// <summary>
        /// Profile editing Policy Name.
        /// </summary>
        [Input("profileEditingPolicy")]
        public Input<string>? ProfileEditingPolicy { get; set; }

        /// <summary>
        /// The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Signin Policy Name.
        /// </summary>
        [Input("signinPolicy")]
        public Input<string>? SigninPolicy { get; set; }

        /// <summary>
        /// The tenant to use instead of Common when logging into Active Directory, usually your B2C tenant domain.
        /// </summary>
        [Input("signinTenant")]
        public Input<string>? SigninTenant { get; set; }

        /// <summary>
        /// Signup Policy Name.
        /// </summary>
        [Input("signupPolicy")]
        public Input<string>? SignupPolicy { get; set; }

        public IdentityProviderAadb2cState()
        {
        }
        public static new IdentityProviderAadb2cState Empty => new IdentityProviderAadb2cState();
    }
}
