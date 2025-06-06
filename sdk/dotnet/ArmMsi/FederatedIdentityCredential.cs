// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArmMsi
{
    /// <summary>
    /// Manages a Federated Identity Credential.
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
    ///         Name = "example",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleUserAssignedIdentity = new Azure.Authorization.UserAssignedIdentity("example", new()
    ///     {
    ///         Location = example.Location,
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleFederatedIdentityCredential = new Azure.ArmMsi.FederatedIdentityCredential("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Audience = "foo",
    ///         Issuer = "https://foo",
    ///         ParentId = exampleUserAssignedIdentity.Id,
    ///         Subject = "foo",
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
    /// * `Microsoft.ManagedIdentity`: 2023-01-31
    /// 
    /// ## Import
    /// 
    /// An existing Federated Identity Credential can be imported into Pulumi using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{parentIdentityName}/federatedIdentityCredentials/{resourceName}
    /// ```
    /// </summary>
    [AzureResourceType("azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential")]
    public partial class FederatedIdentityCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the audience for this Federated Identity Credential.
        /// </summary>
        [Output("audience")]
        public Output<string> Audience { get; private set; } = null!;

        /// <summary>
        /// Specifies the issuer of this Federated Identity Credential.
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of this Federated Identity Credential. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the subject for this Federated Identity Credential.
        /// </summary>
        [Output("subject")]
        public Output<string> Subject { get; private set; } = null!;


        /// <summary>
        /// Create a FederatedIdentityCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FederatedIdentityCredential(string name, FederatedIdentityCredentialArgs args, CustomResourceOptions? options = null)
            : base("azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential", name, args ?? new FederatedIdentityCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FederatedIdentityCredential(string name, Input<string> id, FederatedIdentityCredentialState? state = null, CustomResourceOptions? options = null)
            : base("azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FederatedIdentityCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FederatedIdentityCredential Get(string name, Input<string> id, FederatedIdentityCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new FederatedIdentityCredential(name, id, state, options);
        }
    }

    public sealed class FederatedIdentityCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the audience for this Federated Identity Credential.
        /// </summary>
        [Input("audience", required: true)]
        public Input<string> Audience { get; set; } = null!;

        /// <summary>
        /// Specifies the issuer of this Federated Identity Credential.
        /// </summary>
        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        /// <summary>
        /// Specifies the name of this Federated Identity Credential. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the subject for this Federated Identity Credential.
        /// </summary>
        [Input("subject", required: true)]
        public Input<string> Subject { get; set; } = null!;

        public FederatedIdentityCredentialArgs()
        {
        }
        public static new FederatedIdentityCredentialArgs Empty => new FederatedIdentityCredentialArgs();
    }

    public sealed class FederatedIdentityCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the audience for this Federated Identity Credential.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Specifies the issuer of this Federated Identity Credential.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// Specifies the name of this Federated Identity Credential. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Specifies the subject for this Federated Identity Credential.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        public FederatedIdentityCredentialState()
        {
        }
        public static new FederatedIdentityCredentialState Empty => new FederatedIdentityCredentialState();
    }
}
