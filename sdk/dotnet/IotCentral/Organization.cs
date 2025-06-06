// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.IotCentral
{
    /// <summary>
    /// Manages an IoT Central Organization
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
    ///         Name = "example-resource",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleApplication = new Azure.IotCentral.Application("example", new()
    ///     {
    ///         Name = "example-iotcentral-app",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         SubDomain = "example-iotcentral-app-subdomain",
    ///         DisplayName = "example-iotcentral-app-display-name",
    ///         Sku = "ST1",
    ///         Template = "iotc-default@1.0.0",
    ///         Tags = 
    ///         {
    ///             { "Foo", "Bar" },
    ///         },
    ///     });
    /// 
    ///     var exampleParent = new Azure.IotCentral.Organization("example_parent", new()
    ///     {
    ///         IotcentralApplicationId = exampleApplication.Id,
    ///         OrganizationId = "example-parent-organization-id",
    ///         DisplayName = "Org example parent",
    ///     });
    /// 
    ///     var exampleOrganization = new Azure.IotCentral.Organization("example", new()
    ///     {
    ///         IotcentralApplicationId = exampleApplication.Id,
    ///         OrganizationId = "example-child-organization-id",
    ///         DisplayName = "Org example",
    ///         ParentOrganizationId = exampleParent.OrganizationId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The IoT Central Organization can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:iotcentral/organization:Organization example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.IoTCentral/iotApps/example/organizations/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:iotcentral/organization:Organization")]
    public partial class Organization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Custom `display_name` for the organization.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The application `id`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("iotcentralApplicationId")]
        public Output<string> IotcentralApplicationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization. Changing this forces a new resource to be created.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The `organization_id` of the parent organization. Changing this forces a new resource to be created.
        /// </summary>
        [Output("parentOrganizationId")]
        public Output<string?> ParentOrganizationId { get; private set; } = null!;


        /// <summary>
        /// Create a Organization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Organization(string name, OrganizationArgs args, CustomResourceOptions? options = null)
            : base("azure:iotcentral/organization:Organization", name, args ?? new OrganizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Organization(string name, Input<string> id, OrganizationState? state = null, CustomResourceOptions? options = null)
            : base("azure:iotcentral/organization:Organization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Organization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Organization Get(string name, Input<string> id, OrganizationState? state = null, CustomResourceOptions? options = null)
        {
            return new Organization(name, id, state, options);
        }
    }

    public sealed class OrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom `display_name` for the organization.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The application `id`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("iotcentralApplicationId", required: true)]
        public Input<string> IotcentralApplicationId { get; set; } = null!;

        /// <summary>
        /// The ID of the organization. Changing this forces a new resource to be created.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// The `organization_id` of the parent organization. Changing this forces a new resource to be created.
        /// </summary>
        [Input("parentOrganizationId")]
        public Input<string>? ParentOrganizationId { get; set; }

        public OrganizationArgs()
        {
        }
        public static new OrganizationArgs Empty => new OrganizationArgs();
    }

    public sealed class OrganizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom `display_name` for the organization.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The application `id`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("iotcentralApplicationId")]
        public Input<string>? IotcentralApplicationId { get; set; }

        /// <summary>
        /// The ID of the organization. Changing this forces a new resource to be created.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The `organization_id` of the parent organization. Changing this forces a new resource to be created.
        /// </summary>
        [Input("parentOrganizationId")]
        public Input<string>? ParentOrganizationId { get; set; }

        public OrganizationState()
        {
        }
        public static new OrganizationState Empty => new OrganizationState();
    }
}
