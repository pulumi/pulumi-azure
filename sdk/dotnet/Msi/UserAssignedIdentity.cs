// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Msi
{
    /// <summary>
    /// &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
    /// 
    /// Manages a User Assigned Identity.
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
    ///     var exampleUserAssignedIdentity = new Azure.Authorization.UserAssignedIdentity("example", new()
    ///     {
    ///         Location = example.Location,
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An existing User Assigned Identity can be imported into Pulumi using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:msi/userAssignedIdentity:UserAssignedIdentity example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{userAssignedIdentityName}
    /// ```
    /// 
    /// * Where `{subscriptionId}` is the ID of the Azure Subscription where the User Assigned Identity exists. For example `12345678-1234-9876-4563-123456789012`.
    /// 
    /// * Where `{resourceGroupName}` is the name of Resource Group where this User Assigned Identity exists. For example `example-resource-group`.
    /// 
    /// * Where `{userAssignedIdentityName}` is the name of the User Assigned Identity. For example `userAssignedIdentityValue`.
    /// </summary>
    [Obsolete(@"azure.msi.UserAssignedIdentity has been deprecated in favor of azure.authorization.UserAssignedIdentity")]
    [AzureResourceType("azure:msi/userAssignedIdentity:UserAssignedIdentity")]
    public partial class UserAssignedIdentity : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the app associated with the Identity.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of this User Assigned Identity. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Service Principal object associated with the created Identity.
        /// </summary>
        [Output("principalId")]
        public Output<string> PrincipalId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group within which this User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the User Assigned Identity.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the Tenant which the Identity belongs to.
        /// </summary>
        [Output("tenantId")]
        public Output<string> TenantId { get; private set; } = null!;


        /// <summary>
        /// Create a UserAssignedIdentity resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserAssignedIdentity(string name, UserAssignedIdentityArgs args, CustomResourceOptions? options = null)
            : base("azure:msi/userAssignedIdentity:UserAssignedIdentity", name, args ?? new UserAssignedIdentityArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserAssignedIdentity(string name, Input<string> id, UserAssignedIdentityState? state = null, CustomResourceOptions? options = null)
            : base("azure:msi/userAssignedIdentity:UserAssignedIdentity", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserAssignedIdentity resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserAssignedIdentity Get(string name, Input<string> id, UserAssignedIdentityState? state = null, CustomResourceOptions? options = null)
        {
            return new UserAssignedIdentity(name, id, state, options);
        }
    }

    public sealed class UserAssignedIdentityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Region where the User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of this User Assigned Identity. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the User Assigned Identity.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public UserAssignedIdentityArgs()
        {
        }
        public static new UserAssignedIdentityArgs Empty => new UserAssignedIdentityArgs();
    }

    public sealed class UserAssignedIdentityState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the app associated with the Identity.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The Azure Region where the User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of this User Assigned Identity. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Service Principal object associated with the created Identity.
        /// </summary>
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this User Assigned Identity should exist. Changing this forces a new User Assigned Identity to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the User Assigned Identity.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the Tenant which the Identity belongs to.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public UserAssignedIdentityState()
        {
        }
        public static new UserAssignedIdentityState Empty => new UserAssignedIdentityState();
    }
}
