// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MixedReality
{
    public static class GetSpatialAnchorsAccount
    {
        /// <summary>
        /// Get information about an Azure Spatial Anchors Account.
        /// 
        /// &gt; **Note:** The `azure.mixedreality.SpatialAnchorsAccount` data source has been deprecated because the service is retiring from 2024-11-20 and will be removed in v5.0 of the AzureRM Provider.
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
        ///     var example = Azure.MixedReality.GetSpatialAnchorsAccount.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountDomain"] = accountDomainAzurermSpatialAnchorsAccount,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MixedReality`: 2021-01-01
        /// </summary>
        public static Task<GetSpatialAnchorsAccountResult> InvokeAsync(GetSpatialAnchorsAccountArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSpatialAnchorsAccountResult>("azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount", args ?? new GetSpatialAnchorsAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about an Azure Spatial Anchors Account.
        /// 
        /// &gt; **Note:** The `azure.mixedreality.SpatialAnchorsAccount` data source has been deprecated because the service is retiring from 2024-11-20 and will be removed in v5.0 of the AzureRM Provider.
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
        ///     var example = Azure.MixedReality.GetSpatialAnchorsAccount.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountDomain"] = accountDomainAzurermSpatialAnchorsAccount,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MixedReality`: 2021-01-01
        /// </summary>
        public static Output<GetSpatialAnchorsAccountResult> Invoke(GetSpatialAnchorsAccountInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpatialAnchorsAccountResult>("azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount", args ?? new GetSpatialAnchorsAccountInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about an Azure Spatial Anchors Account.
        /// 
        /// &gt; **Note:** The `azure.mixedreality.SpatialAnchorsAccount` data source has been deprecated because the service is retiring from 2024-11-20 and will be removed in v5.0 of the AzureRM Provider.
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
        ///     var example = Azure.MixedReality.GetSpatialAnchorsAccount.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountDomain"] = accountDomainAzurermSpatialAnchorsAccount,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MixedReality`: 2021-01-01
        /// </summary>
        public static Output<GetSpatialAnchorsAccountResult> Invoke(GetSpatialAnchorsAccountInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpatialAnchorsAccountResult>("azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount", args ?? new GetSpatialAnchorsAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSpatialAnchorsAccountArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Spatial Anchors Account.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetSpatialAnchorsAccountArgs()
        {
        }
        public static new GetSpatialAnchorsAccountArgs Empty => new GetSpatialAnchorsAccountArgs();
    }

    public sealed class GetSpatialAnchorsAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Spatial Anchors Account.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetSpatialAnchorsAccountInvokeArgs()
        {
        }
        public static new GetSpatialAnchorsAccountInvokeArgs Empty => new GetSpatialAnchorsAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetSpatialAnchorsAccountResult
    {
        /// <summary>
        /// The domain of the Spatial Anchors Account.
        /// </summary>
        public readonly string AccountDomain;
        /// <summary>
        /// The account ID of the Spatial Anchors Account.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The Tags assigned to this Spatial Anchors Account.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetSpatialAnchorsAccountResult(
            string accountDomain,

            string accountId,

            string id,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            AccountDomain = accountDomain;
            AccountId = accountId;
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
