// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Kusto
{
    public static class GetDatabase
    {
        /// <summary>
        /// Use this data source to access information about an existing Kusto Database
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
        ///     var example = Azure.Kusto.GetDatabase.Invoke(new()
        ///     {
        ///         Name = "my-kusto-database",
        ///         ResourceGroupName = "test_resource_group",
        ///         ClusterName = "test_cluster",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Kusto`: 2024-04-13
        /// </summary>
        public static Task<GetDatabaseResult> InvokeAsync(GetDatabaseArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseResult>("azure:kusto/getDatabase:getDatabase", args ?? new GetDatabaseArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Kusto Database
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
        ///     var example = Azure.Kusto.GetDatabase.Invoke(new()
        ///     {
        ///         Name = "my-kusto-database",
        ///         ResourceGroupName = "test_resource_group",
        ///         ClusterName = "test_cluster",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Kusto`: 2024-04-13
        /// </summary>
        public static Output<GetDatabaseResult> Invoke(GetDatabaseInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseResult>("azure:kusto/getDatabase:getDatabase", args ?? new GetDatabaseInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Kusto Database
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
        ///     var example = Azure.Kusto.GetDatabase.Invoke(new()
        ///     {
        ///         Name = "my-kusto-database",
        ///         ResourceGroupName = "test_resource_group",
        ///         ClusterName = "test_cluster",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Kusto`: 2024-04-13
        /// </summary>
        public static Output<GetDatabaseResult> Invoke(GetDatabaseInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseResult>("azure:kusto/getDatabase:getDatabase", args ?? new GetDatabaseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Kusto Cluster this database is added to.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The name of the Kusto Database.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The Resource Group where the Kusto Database exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDatabaseArgs()
        {
        }
        public static new GetDatabaseArgs Empty => new GetDatabaseArgs();
    }

    public sealed class GetDatabaseInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Kusto Cluster this database is added to.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The name of the Kusto Database.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Resource Group where the Kusto Database exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetDatabaseInvokeArgs()
        {
        }
        public static new GetDatabaseInvokeArgs Empty => new GetDatabaseInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// The time the data that should be kept in cache for fast queries as ISO 8601 timespan.
        /// </summary>
        public readonly string HotCachePeriod;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Azure Region in which the managed Kusto Database exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The size of the database in bytes.
        /// </summary>
        public readonly double Size;
        /// <summary>
        /// The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan.
        /// </summary>
        public readonly string SoftDeletePeriod;

        [OutputConstructor]
        private GetDatabaseResult(
            string clusterName,

            string hotCachePeriod,

            string id,

            string location,

            string name,

            string resourceGroupName,

            double size,

            string softDeletePeriod)
        {
            ClusterName = clusterName;
            HotCachePeriod = hotCachePeriod;
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Size = size;
            SoftDeletePeriod = softDeletePeriod;
        }
    }
}
