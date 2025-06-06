// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Oracle
{
    public static class GetDbNodes
    {
        /// <summary>
        /// Lists the database nodes for the specified Cloud VM Cluster.
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
        ///     var example = Azure.Oracle.GetDbNodes.Invoke(new()
        ///     {
        ///         CloudVmClusterId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Oracle.Database`: 2024-06-01
        /// </summary>
        public static Task<GetDbNodesResult> InvokeAsync(GetDbNodesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbNodesResult>("azure:oracle/getDbNodes:getDbNodes", args ?? new GetDbNodesArgs(), options.WithDefaults());

        /// <summary>
        /// Lists the database nodes for the specified Cloud VM Cluster.
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
        ///     var example = Azure.Oracle.GetDbNodes.Invoke(new()
        ///     {
        ///         CloudVmClusterId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Oracle.Database`: 2024-06-01
        /// </summary>
        public static Output<GetDbNodesResult> Invoke(GetDbNodesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbNodesResult>("azure:oracle/getDbNodes:getDbNodes", args ?? new GetDbNodesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Lists the database nodes for the specified Cloud VM Cluster.
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
        ///     var example = Azure.Oracle.GetDbNodes.Invoke(new()
        ///     {
        ///         CloudVmClusterId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Oracle.Database`: 2024-06-01
        /// </summary>
        public static Output<GetDbNodesResult> Invoke(GetDbNodesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbNodesResult>("azure:oracle/getDbNodes:getDbNodes", args ?? new GetDbNodesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbNodesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Cloud VM cluster.
        /// </summary>
        [Input("cloudVmClusterId", required: true)]
        public string CloudVmClusterId { get; set; } = null!;

        public GetDbNodesArgs()
        {
        }
        public static new GetDbNodesArgs Empty => new GetDbNodesArgs();
    }

    public sealed class GetDbNodesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Cloud VM cluster.
        /// </summary>
        [Input("cloudVmClusterId", required: true)]
        public Input<string> CloudVmClusterId { get; set; } = null!;

        public GetDbNodesInvokeArgs()
        {
        }
        public static new GetDbNodesInvokeArgs Empty => new GetDbNodesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbNodesResult
    {
        public readonly string CloudVmClusterId;
        /// <summary>
        /// A `db_nodes` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDbNodesDbNodeResult> DbNodes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDbNodesResult(
            string cloudVmClusterId,

            ImmutableArray<Outputs.GetDbNodesDbNodeResult> dbNodes,

            string id)
        {
            CloudVmClusterId = cloudVmClusterId;
            DbNodes = dbNodes;
            Id = id;
        }
    }
}
