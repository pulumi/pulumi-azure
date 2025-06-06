// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    public static class GetLocalNetworkGateway
    {
        /// <summary>
        /// Use this data source to access information about an existing Local Network Gateway.
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
        ///     var example = Azure.Network.GetLocalNetworkGateway.Invoke(new()
        ///     {
        ///         Name = "existing-local-network-gateway",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLocalNetworkGatewayResult =&gt; getLocalNetworkGatewayResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Network`: 2024-05-01
        /// </summary>
        public static Task<GetLocalNetworkGatewayResult> InvokeAsync(GetLocalNetworkGatewayArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocalNetworkGatewayResult>("azure:network/getLocalNetworkGateway:getLocalNetworkGateway", args ?? new GetLocalNetworkGatewayArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Local Network Gateway.
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
        ///     var example = Azure.Network.GetLocalNetworkGateway.Invoke(new()
        ///     {
        ///         Name = "existing-local-network-gateway",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLocalNetworkGatewayResult =&gt; getLocalNetworkGatewayResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Network`: 2024-05-01
        /// </summary>
        public static Output<GetLocalNetworkGatewayResult> Invoke(GetLocalNetworkGatewayInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalNetworkGatewayResult>("azure:network/getLocalNetworkGateway:getLocalNetworkGateway", args ?? new GetLocalNetworkGatewayInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Local Network Gateway.
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
        ///     var example = Azure.Network.GetLocalNetworkGateway.Invoke(new()
        ///     {
        ///         Name = "existing-local-network-gateway",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLocalNetworkGatewayResult =&gt; getLocalNetworkGatewayResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Network`: 2024-05-01
        /// </summary>
        public static Output<GetLocalNetworkGatewayResult> Invoke(GetLocalNetworkGatewayInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalNetworkGatewayResult>("azure:network/getLocalNetworkGateway:getLocalNetworkGateway", args ?? new GetLocalNetworkGatewayInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalNetworkGatewayArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Local Network Gateway.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Local Network Gateway exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetLocalNetworkGatewayArgs()
        {
        }
        public static new GetLocalNetworkGatewayArgs Empty => new GetLocalNetworkGatewayArgs();
    }

    public sealed class GetLocalNetworkGatewayInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Local Network Gateway.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Local Network Gateway exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetLocalNetworkGatewayInvokeArgs()
        {
        }
        public static new GetLocalNetworkGatewayInvokeArgs Empty => new GetLocalNetworkGatewayInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocalNetworkGatewayResult
    {
        /// <summary>
        /// The list of string CIDRs representing the address spaces the gateway exposes.
        /// </summary>
        public readonly ImmutableArray<string> AddressSpaces;
        /// <summary>
        /// A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLocalNetworkGatewayBgpSettingResult> BgpSettings;
        /// <summary>
        /// The gateway IP address the Local Network Gateway uses.
        /// </summary>
        public readonly string GatewayAddress;
        /// <summary>
        /// The gateway FQDN the Local Network Gateway uses.
        /// </summary>
        public readonly string GatewayFqdn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Azure Region where the Local Network Gateway exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags assigned to the Local Network Gateway.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetLocalNetworkGatewayResult(
            ImmutableArray<string> addressSpaces,

            ImmutableArray<Outputs.GetLocalNetworkGatewayBgpSettingResult> bgpSettings,

            string gatewayAddress,

            string gatewayFqdn,

            string id,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            AddressSpaces = addressSpaces;
            BgpSettings = bgpSettings;
            GatewayAddress = gatewayAddress;
            GatewayFqdn = gatewayFqdn;
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
