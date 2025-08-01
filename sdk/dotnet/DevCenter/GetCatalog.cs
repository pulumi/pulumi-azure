// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevCenter
{
    public static class GetCatalog
    {
        /// <summary>
        /// Use this data source to access information about an existing Dev Center Catalog.
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
        ///     var example = Azure.DevCenter.GetCatalog.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterCatalog.Name,
        ///         DevCenterId = exampleAzurermDevCenterCatalog.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getCatalogResult =&gt; getCatalogResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Task<GetCatalogResult> InvokeAsync(GetCatalogArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCatalogResult>("azure:devcenter/getCatalog:getCatalog", args ?? new GetCatalogArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Center Catalog.
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
        ///     var example = Azure.DevCenter.GetCatalog.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterCatalog.Name,
        ///         DevCenterId = exampleAzurermDevCenterCatalog.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getCatalogResult =&gt; getCatalogResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Output<GetCatalogResult> Invoke(GetCatalogInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCatalogResult>("azure:devcenter/getCatalog:getCatalog", args ?? new GetCatalogInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Center Catalog.
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
        ///     var example = Azure.DevCenter.GetCatalog.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterCatalog.Name,
        ///         DevCenterId = exampleAzurermDevCenterCatalog.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getCatalogResult =&gt; getCatalogResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Output<GetCatalogResult> Invoke(GetCatalogInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCatalogResult>("azure:devcenter/getCatalog:getCatalog", args ?? new GetCatalogInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCatalogArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the Dev Center Id within which this Dev Center Catalog should exist.
        /// </summary>
        [Input("devCenterId", required: true)]
        public string DevCenterId { get; set; } = null!;

        /// <summary>
        /// The name of this Dev Center Catalog.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCatalogArgs()
        {
        }
        public static new GetCatalogArgs Empty => new GetCatalogArgs();
    }

    public sealed class GetCatalogInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the Dev Center Id within which this Dev Center Catalog should exist.
        /// </summary>
        [Input("devCenterId", required: true)]
        public Input<string> DevCenterId { get; set; } = null!;

        /// <summary>
        /// The name of this Dev Center Catalog.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCatalogInvokeArgs()
        {
        }
        public static new GetCatalogInvokeArgs Empty => new GetCatalogInvokeArgs();
    }


    [OutputType]
    public sealed class GetCatalogResult
    {
        /// <summary>
        /// A `catalog_adogit` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCatalogCatalogAdogitResult> CatalogAdogits;
        /// <summary>
        /// A `catalog_github` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCatalogCatalogGithubResult> CatalogGithubs;
        public readonly string DevCenterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetCatalogResult(
            ImmutableArray<Outputs.GetCatalogCatalogAdogitResult> catalogAdogits,

            ImmutableArray<Outputs.GetCatalogCatalogGithubResult> catalogGithubs,

            string devCenterId,

            string id,

            string name)
        {
            CatalogAdogits = catalogAdogits;
            CatalogGithubs = catalogGithubs;
            DevCenterId = devCenterId;
            Id = id;
            Name = name;
        }
    }
}
