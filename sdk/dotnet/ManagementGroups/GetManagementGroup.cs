// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ManagementGroups
{
    [Obsolete(@"azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup")]
    public static class GetManagementGroup
    {
        /// <summary>
        /// Use this data source to access information about an existing Management Group.
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
        ///     var example = Azure.Management.GetGroup.Invoke(new()
        ///     {
        ///         Name = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["displayName"] = example.Apply(getGroupResult =&gt; getGroupResult.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetManagementGroupResult> InvokeAsync(GetManagementGroupArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagementGroupResult>("azure:managementgroups/getManagementGroup:getManagementGroup", args ?? new GetManagementGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Management Group.
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
        ///     var example = Azure.Management.GetGroup.Invoke(new()
        ///     {
        ///         Name = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["displayName"] = example.Apply(getGroupResult =&gt; getGroupResult.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagementGroupResult> Invoke(GetManagementGroupInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagementGroupResult>("azure:managementgroups/getManagementGroup:getManagementGroup", args ?? new GetManagementGroupInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Management Group.
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
        ///     var example = Azure.Management.GetGroup.Invoke(new()
        ///     {
        ///         Name = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["displayName"] = example.Apply(getGroupResult =&gt; getGroupResult.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagementGroupResult> Invoke(GetManagementGroupInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagementGroupResult>("azure:managementgroups/getManagementGroup:getManagementGroup", args ?? new GetManagementGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagementGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the display name of this Management Group.
        /// 
        /// &gt; **NOTE** Whilst multiple management groups may share the same display name, when filtering, the provider expects a single management group to be found with this name.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// Specifies the name or UUID of this Management Group.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetManagementGroupArgs()
        {
        }
        public static new GetManagementGroupArgs Empty => new GetManagementGroupArgs();
    }

    public sealed class GetManagementGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the display name of this Management Group.
        /// 
        /// &gt; **NOTE** Whilst multiple management groups may share the same display name, when filtering, the provider expects a single management group to be found with this name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Specifies the name or UUID of this Management Group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetManagementGroupInvokeArgs()
        {
        }
        public static new GetManagementGroupInvokeArgs Empty => new GetManagementGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagementGroupResult
    {
        /// <summary>
        /// A list of Management Group IDs which directly or indirectly belong to this Management Group.
        /// </summary>
        public readonly ImmutableArray<string> AllManagementGroupIds;
        /// <summary>
        /// A list of Subscription IDs which are assigned to this Management Group or its children Management Groups.
        /// </summary>
        public readonly ImmutableArray<string> AllSubscriptionIds;
        public readonly string DisplayName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Management Group IDs which directly belong to this Management Group.
        /// </summary>
        public readonly ImmutableArray<string> ManagementGroupIds;
        public readonly string Name;
        /// <summary>
        /// The ID of any Parent Management Group.
        /// </summary>
        public readonly string ParentManagementGroupId;
        /// <summary>
        /// A list of Subscription IDs which are directly assigned to this Management Group.
        /// </summary>
        public readonly ImmutableArray<string> SubscriptionIds;
        /// <summary>
        /// The Management Group ID with the Tenant ID prefix.
        /// </summary>
        public readonly string TenantScopedId;

        [OutputConstructor]
        private GetManagementGroupResult(
            ImmutableArray<string> allManagementGroupIds,

            ImmutableArray<string> allSubscriptionIds,

            string displayName,

            string id,

            ImmutableArray<string> managementGroupIds,

            string name,

            string parentManagementGroupId,

            ImmutableArray<string> subscriptionIds,

            string tenantScopedId)
        {
            AllManagementGroupIds = allManagementGroupIds;
            AllSubscriptionIds = allSubscriptionIds;
            DisplayName = displayName;
            Id = id;
            ManagementGroupIds = managementGroupIds;
            Name = name;
            ParentManagementGroupId = parentManagementGroupId;
            SubscriptionIds = subscriptionIds;
            TenantScopedId = tenantScopedId;
        }
    }
}
