// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    public static class GetFirewall
    {
        /// <summary>
        /// Use this data source to access information about an existing Azure Firewall.
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
        ///     var example = Azure.Network.GetFirewall.Invoke(new()
        ///     {
        ///         Name = "firewall1",
        ///         ResourceGroupName = "firewall-RG",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallPrivateIp"] = example.Apply(getFirewallResult =&gt; getFirewallResult.IpConfigurations[0]?.PrivateIpAddress),
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
        public static Task<GetFirewallResult> InvokeAsync(GetFirewallArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallResult>("azure:network/getFirewall:getFirewall", args ?? new GetFirewallArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Azure Firewall.
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
        ///     var example = Azure.Network.GetFirewall.Invoke(new()
        ///     {
        ///         Name = "firewall1",
        ///         ResourceGroupName = "firewall-RG",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallPrivateIp"] = example.Apply(getFirewallResult =&gt; getFirewallResult.IpConfigurations[0]?.PrivateIpAddress),
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
        public static Output<GetFirewallResult> Invoke(GetFirewallInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallResult>("azure:network/getFirewall:getFirewall", args ?? new GetFirewallInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Azure Firewall.
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
        ///     var example = Azure.Network.GetFirewall.Invoke(new()
        ///     {
        ///         Name = "firewall1",
        ///         ResourceGroupName = "firewall-RG",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallPrivateIp"] = example.Apply(getFirewallResult =&gt; getFirewallResult.IpConfigurations[0]?.PrivateIpAddress),
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
        public static Output<GetFirewallResult> Invoke(GetFirewallInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallResult>("azure:network/getFirewall:getFirewall", args ?? new GetFirewallInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether DNS proxy is enabled. It will forward DNS requests to the DNS servers when it is `true`.
        /// </summary>
        [Input("dnsProxyEnabled")]
        public bool? DnsProxyEnabled { get; set; }

        /// <summary>
        /// The name of the Azure Firewall.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Azure Firewall exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetFirewallArgs()
        {
        }
        public static new GetFirewallArgs Empty => new GetFirewallArgs();
    }

    public sealed class GetFirewallInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether DNS proxy is enabled. It will forward DNS requests to the DNS servers when it is `true`.
        /// </summary>
        [Input("dnsProxyEnabled")]
        public Input<bool>? DnsProxyEnabled { get; set; }

        /// <summary>
        /// The name of the Azure Firewall.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Azure Firewall exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetFirewallInvokeArgs()
        {
        }
        public static new GetFirewallInvokeArgs Empty => new GetFirewallInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallResult
    {
        /// <summary>
        /// Whether DNS proxy is enabled. It will forward DNS requests to the DNS servers when it is `true`.
        /// </summary>
        public readonly bool DnsProxyEnabled;
        /// <summary>
        /// The list of DNS servers that the Azure Firewall will direct DNS traffic to for name resolution.
        /// </summary>
        public readonly ImmutableArray<string> DnsServers;
        /// <summary>
        /// The ID of the Firewall Policy applied to the Azure Firewall.
        /// </summary>
        public readonly string FirewallPolicyId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A `ip_configuration` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallIpConfigurationResult> IpConfigurations;
        /// <summary>
        /// The Azure location where the Azure Firewall exists.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// A `management_ip_configuration` block as defined below, which allows force-tunnelling of traffic to be performed by the firewall.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallManagementIpConfigurationResult> ManagementIpConfigurations;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The SKU name of the Azure Firewall.
        /// </summary>
        public readonly string SkuName;
        /// <summary>
        /// The SKU tier of the Azure Firewall.
        /// </summary>
        public readonly string SkuTier;
        /// <summary>
        /// A mapping of tags assigned to the Azure Firewall.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The operation mode for threat intelligence-based filtering.
        /// </summary>
        public readonly string ThreatIntelMode;
        /// <summary>
        /// A `virtual_hub` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallVirtualHubResult> VirtualHubs;
        /// <summary>
        /// A list of Availability Zones in which this Azure Firewall is located.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetFirewallResult(
            bool dnsProxyEnabled,

            ImmutableArray<string> dnsServers,

            string firewallPolicyId,

            string id,

            ImmutableArray<Outputs.GetFirewallIpConfigurationResult> ipConfigurations,

            string location,

            ImmutableArray<Outputs.GetFirewallManagementIpConfigurationResult> managementIpConfigurations,

            string name,

            string resourceGroupName,

            string skuName,

            string skuTier,

            ImmutableDictionary<string, string> tags,

            string threatIntelMode,

            ImmutableArray<Outputs.GetFirewallVirtualHubResult> virtualHubs,

            ImmutableArray<string> zones)
        {
            DnsProxyEnabled = dnsProxyEnabled;
            DnsServers = dnsServers;
            FirewallPolicyId = firewallPolicyId;
            Id = id;
            IpConfigurations = ipConfigurations;
            Location = location;
            ManagementIpConfigurations = managementIpConfigurations;
            Name = name;
            ResourceGroupName = resourceGroupName;
            SkuName = skuName;
            SkuTier = skuTier;
            Tags = tags;
            ThreatIntelMode = threatIntelMode;
            VirtualHubs = virtualHubs;
            Zones = zones;
        }
    }
}
