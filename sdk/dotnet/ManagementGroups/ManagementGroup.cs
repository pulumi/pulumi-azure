// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ManagementGroups
{
    /// <summary>
    /// Manages a Management Group.
    /// 
    /// !&gt; **Note:** Configuring `subscription_ids` is not supported when using the `azure.management.GroupSubscriptionAssociation` resource, results will be unpredictable.
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
    ///     var current = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var exampleParent = new Azure.Management.Group("example_parent", new()
    ///     {
    ///         DisplayName = "ParentGroup",
    ///         SubscriptionIds = new[]
    ///         {
    ///             current.Apply(getSubscriptionResult =&gt; getSubscriptionResult.SubscriptionId),
    ///         },
    ///     });
    /// 
    ///     var exampleChild = new Azure.Management.Group("example_child", new()
    ///     {
    ///         DisplayName = "ChildGroup",
    ///         ParentManagementGroupId = exampleParent.Id,
    ///         SubscriptionIds = new[]
    ///         {
    ///             current.Apply(getSubscriptionResult =&gt; getSubscriptionResult.SubscriptionId),
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
    /// * `Microsoft.Management`: 2020-05-01
    /// 
    /// ## Import
    /// 
    /// Management Groups can be imported using the `management group resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:managementgroups/managementGroup:ManagementGroup example /providers/Microsoft.Management/managementGroups/group1
    /// ```
    /// </summary>
    [Obsolete(@"azure.managementgroups.ManagementGroup has been deprecated in favor of azure.management.Group")]
    [AzureResourceType("azure:managementgroups/managementGroup:ManagementGroup")]
    public partial class ManagementGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Parent Management Group.
        /// </summary>
        [Output("parentManagementGroupId")]
        public Output<string> ParentManagementGroupId { get; private set; } = null!;

        /// <summary>
        /// A list of Subscription GUIDs which should be assigned to the Management Group.
        /// 
        /// &gt; **Note:** To clear all Subscriptions from the Management Group set `subscription_ids` to an empty list
        /// </summary>
        [Output("subscriptionIds")]
        public Output<ImmutableArray<string>> SubscriptionIds { get; private set; } = null!;

        /// <summary>
        /// The Management Group ID with the Tenant ID prefix.
        /// </summary>
        [Output("tenantScopedId")]
        public Output<string> TenantScopedId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagementGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagementGroup(string name, ManagementGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("azure:managementgroups/managementGroup:ManagementGroup", name, args ?? new ManagementGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagementGroup(string name, Input<string> id, ManagementGroupState? state = null, CustomResourceOptions? options = null)
            : base("azure:managementgroups/managementGroup:ManagementGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagementGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagementGroup Get(string name, Input<string> id, ManagementGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagementGroup(name, id, state, options);
        }
    }

    public sealed class ManagementGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Parent Management Group.
        /// </summary>
        [Input("parentManagementGroupId")]
        public Input<string>? ParentManagementGroupId { get; set; }

        [Input("subscriptionIds")]
        private InputList<string>? _subscriptionIds;

        /// <summary>
        /// A list of Subscription GUIDs which should be assigned to the Management Group.
        /// 
        /// &gt; **Note:** To clear all Subscriptions from the Management Group set `subscription_ids` to an empty list
        /// </summary>
        public InputList<string> SubscriptionIds
        {
            get => _subscriptionIds ?? (_subscriptionIds = new InputList<string>());
            set => _subscriptionIds = value;
        }

        public ManagementGroupArgs()
        {
        }
        public static new ManagementGroupArgs Empty => new ManagementGroupArgs();
    }

    public sealed class ManagementGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Parent Management Group.
        /// </summary>
        [Input("parentManagementGroupId")]
        public Input<string>? ParentManagementGroupId { get; set; }

        [Input("subscriptionIds")]
        private InputList<string>? _subscriptionIds;

        /// <summary>
        /// A list of Subscription GUIDs which should be assigned to the Management Group.
        /// 
        /// &gt; **Note:** To clear all Subscriptions from the Management Group set `subscription_ids` to an empty list
        /// </summary>
        public InputList<string> SubscriptionIds
        {
            get => _subscriptionIds ?? (_subscriptionIds = new InputList<string>());
            set => _subscriptionIds = value;
        }

        /// <summary>
        /// The Management Group ID with the Tenant ID prefix.
        /// </summary>
        [Input("tenantScopedId")]
        public Input<string>? TenantScopedId { get; set; }

        public ManagementGroupState()
        {
        }
        public static new ManagementGroupState Empty => new ManagementGroupState();
    }
}
