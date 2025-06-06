// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.OperationalInsights
{
    public static class GetAnalyticsWorkspace
    {
        /// <summary>
        /// Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.
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
        ///     var example = Azure.OperationalInsights.GetAnalyticsWorkspace.Invoke(new()
        ///     {
        ///         Name = "acctest-01",
        ///         ResourceGroupName = "acctest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["logAnalyticsWorkspaceId"] = example.Apply(getAnalyticsWorkspaceResult =&gt; getAnalyticsWorkspaceResult.WorkspaceId),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.OperationalInsights`: 2020-08-01
        /// </summary>
        public static Task<GetAnalyticsWorkspaceResult> InvokeAsync(GetAnalyticsWorkspaceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAnalyticsWorkspaceResult>("azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace", args ?? new GetAnalyticsWorkspaceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.
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
        ///     var example = Azure.OperationalInsights.GetAnalyticsWorkspace.Invoke(new()
        ///     {
        ///         Name = "acctest-01",
        ///         ResourceGroupName = "acctest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["logAnalyticsWorkspaceId"] = example.Apply(getAnalyticsWorkspaceResult =&gt; getAnalyticsWorkspaceResult.WorkspaceId),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.OperationalInsights`: 2020-08-01
        /// </summary>
        public static Output<GetAnalyticsWorkspaceResult> Invoke(GetAnalyticsWorkspaceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAnalyticsWorkspaceResult>("azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace", args ?? new GetAnalyticsWorkspaceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.
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
        ///     var example = Azure.OperationalInsights.GetAnalyticsWorkspace.Invoke(new()
        ///     {
        ///         Name = "acctest-01",
        ///         ResourceGroupName = "acctest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["logAnalyticsWorkspaceId"] = example.Apply(getAnalyticsWorkspaceResult =&gt; getAnalyticsWorkspaceResult.WorkspaceId),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.OperationalInsights`: 2020-08-01
        /// </summary>
        public static Output<GetAnalyticsWorkspaceResult> Invoke(GetAnalyticsWorkspaceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAnalyticsWorkspaceResult>("azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace", args ?? new GetAnalyticsWorkspaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAnalyticsWorkspaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Log Analytics Workspace.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Log Analytics workspace is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetAnalyticsWorkspaceArgs()
        {
        }
        public static new GetAnalyticsWorkspaceArgs Empty => new GetAnalyticsWorkspaceArgs();
    }

    public sealed class GetAnalyticsWorkspaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Log Analytics Workspace.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Log Analytics workspace is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetAnalyticsWorkspaceInvokeArgs()
        {
        }
        public static new GetAnalyticsWorkspaceInvokeArgs Empty => new GetAnalyticsWorkspaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetAnalyticsWorkspaceResult
    {
        /// <summary>
        /// The workspace daily quota for ingestion in GB.
        /// </summary>
        public readonly double DailyQuotaGb;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        /// <summary>
        /// The Primary shared key for the Log Analytics Workspace.
        /// </summary>
        public readonly string PrimarySharedKey;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The workspace data retention in days.
        /// </summary>
        public readonly int RetentionInDays;
        /// <summary>
        /// The Secondary shared key for the Log Analytics Workspace.
        /// </summary>
        public readonly string SecondarySharedKey;
        /// <summary>
        /// The SKU of the Log Analytics Workspace.
        /// </summary>
        public readonly string Sku;
        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The Workspace (or Customer) ID for the Log Analytics Workspace.
        /// </summary>
        public readonly string WorkspaceId;

        [OutputConstructor]
        private GetAnalyticsWorkspaceResult(
            double dailyQuotaGb,

            string id,

            string location,

            string name,

            string primarySharedKey,

            string resourceGroupName,

            int retentionInDays,

            string secondarySharedKey,

            string sku,

            ImmutableDictionary<string, string> tags,

            string workspaceId)
        {
            DailyQuotaGb = dailyQuotaGb;
            Id = id;
            Location = location;
            Name = name;
            PrimarySharedKey = primarySharedKey;
            ResourceGroupName = resourceGroupName;
            RetentionInDays = retentionInDays;
            SecondarySharedKey = secondarySharedKey;
            Sku = sku;
            Tags = tags;
            WorkspaceId = workspaceId;
        }
    }
}
