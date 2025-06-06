// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevTest
{
    public static class GetVirtualNetwork
    {
        /// <summary>
        /// Use this data source to access information about an existing Dev Test Lab Virtual Network.
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
        ///     var example = Azure.DevTest.GetVirtualNetwork.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///         LabName = "examplelab",
        ///         ResourceGroupName = "example-resource",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["labSubnetName"] = example.Apply(getVirtualNetworkResult =&gt; getVirtualNetworkResult.AllowedSubnets[0]?.LabSubnetName),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevTestLab`: 2018-09-15
        /// </summary>
        public static Task<GetVirtualNetworkResult> InvokeAsync(GetVirtualNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualNetworkResult>("azure:devtest/getVirtualNetwork:getVirtualNetwork", args ?? new GetVirtualNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Test Lab Virtual Network.
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
        ///     var example = Azure.DevTest.GetVirtualNetwork.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///         LabName = "examplelab",
        ///         ResourceGroupName = "example-resource",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["labSubnetName"] = example.Apply(getVirtualNetworkResult =&gt; getVirtualNetworkResult.AllowedSubnets[0]?.LabSubnetName),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevTestLab`: 2018-09-15
        /// </summary>
        public static Output<GetVirtualNetworkResult> Invoke(GetVirtualNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualNetworkResult>("azure:devtest/getVirtualNetwork:getVirtualNetwork", args ?? new GetVirtualNetworkInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Test Lab Virtual Network.
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
        ///     var example = Azure.DevTest.GetVirtualNetwork.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///         LabName = "examplelab",
        ///         ResourceGroupName = "example-resource",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["labSubnetName"] = example.Apply(getVirtualNetworkResult =&gt; getVirtualNetworkResult.AllowedSubnets[0]?.LabSubnetName),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevTestLab`: 2018-09-15
        /// </summary>
        public static Output<GetVirtualNetworkResult> Invoke(GetVirtualNetworkInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualNetworkResult>("azure:devtest/getVirtualNetwork:getVirtualNetwork", args ?? new GetVirtualNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Dev Test Lab.
        /// </summary>
        [Input("labName", required: true)]
        public string LabName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Virtual Network.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group that contains the Virtual Network.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetVirtualNetworkArgs()
        {
        }
        public static new GetVirtualNetworkArgs Empty => new GetVirtualNetworkArgs();
    }

    public sealed class GetVirtualNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Dev Test Lab.
        /// </summary>
        [Input("labName", required: true)]
        public Input<string> LabName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Virtual Network.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group that contains the Virtual Network.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetVirtualNetworkInvokeArgs()
        {
        }
        public static new GetVirtualNetworkInvokeArgs Empty => new GetVirtualNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetVirtualNetworkResult
    {
        /// <summary>
        /// The list of subnets enabled for the virtual network as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualNetworkAllowedSubnetResult> AllowedSubnets;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LabName;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The list of permission overrides for the subnets as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualNetworkSubnetOverrideResult> SubnetOverrides;
        /// <summary>
        /// The unique immutable identifier of the virtual network.
        /// </summary>
        public readonly string UniqueIdentifier;

        [OutputConstructor]
        private GetVirtualNetworkResult(
            ImmutableArray<Outputs.GetVirtualNetworkAllowedSubnetResult> allowedSubnets,

            string id,

            string labName,

            string name,

            string resourceGroupName,

            ImmutableArray<Outputs.GetVirtualNetworkSubnetOverrideResult> subnetOverrides,

            string uniqueIdentifier)
        {
            AllowedSubnets = allowedSubnets;
            Id = id;
            LabName = labName;
            Name = name;
            ResourceGroupName = resourceGroupName;
            SubnetOverrides = subnetOverrides;
            UniqueIdentifier = uniqueIdentifier;
        }
    }
}
