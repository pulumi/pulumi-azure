// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PrivateDns
{
    public static class GetResolverForwardingRule
    {
        /// <summary>
        /// Gets information about an existing Private DNS Resolver Forwarding Rule.
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
        ///     var example = Azure.PrivateDns.GetResolverForwardingRule.Invoke(new()
        ///     {
        ///         Name = "example-rule",
        ///         DnsForwardingRulesetId = "example-forwarding-rulset-id",
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
        /// * `Microsoft.Network`: 2022-07-01
        /// </summary>
        public static Task<GetResolverForwardingRuleResult> InvokeAsync(GetResolverForwardingRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResolverForwardingRuleResult>("azure:privatedns/getResolverForwardingRule:getResolverForwardingRule", args ?? new GetResolverForwardingRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an existing Private DNS Resolver Forwarding Rule.
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
        ///     var example = Azure.PrivateDns.GetResolverForwardingRule.Invoke(new()
        ///     {
        ///         Name = "example-rule",
        ///         DnsForwardingRulesetId = "example-forwarding-rulset-id",
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
        /// * `Microsoft.Network`: 2022-07-01
        /// </summary>
        public static Output<GetResolverForwardingRuleResult> Invoke(GetResolverForwardingRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResolverForwardingRuleResult>("azure:privatedns/getResolverForwardingRule:getResolverForwardingRule", args ?? new GetResolverForwardingRuleInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an existing Private DNS Resolver Forwarding Rule.
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
        ///     var example = Azure.PrivateDns.GetResolverForwardingRule.Invoke(new()
        ///     {
        ///         Name = "example-rule",
        ///         DnsForwardingRulesetId = "example-forwarding-rulset-id",
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
        /// * `Microsoft.Network`: 2022-07-01
        /// </summary>
        public static Output<GetResolverForwardingRuleResult> Invoke(GetResolverForwardingRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetResolverForwardingRuleResult>("azure:privatedns/getResolverForwardingRule:getResolverForwardingRule", args ?? new GetResolverForwardingRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResolverForwardingRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Private DNS Resolver Forwarding Ruleset.
        /// </summary>
        [Input("dnsForwardingRulesetId", required: true)]
        public string DnsForwardingRulesetId { get; set; } = null!;

        /// <summary>
        /// Name of the Private DNS Resolver Forwarding Rule.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetResolverForwardingRuleArgs()
        {
        }
        public static new GetResolverForwardingRuleArgs Empty => new GetResolverForwardingRuleArgs();
    }

    public sealed class GetResolverForwardingRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Private DNS Resolver Forwarding Ruleset.
        /// </summary>
        [Input("dnsForwardingRulesetId", required: true)]
        public Input<string> DnsForwardingRulesetId { get; set; } = null!;

        /// <summary>
        /// Name of the Private DNS Resolver Forwarding Rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetResolverForwardingRuleInvokeArgs()
        {
        }
        public static new GetResolverForwardingRuleInvokeArgs Empty => new GetResolverForwardingRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetResolverForwardingRuleResult
    {
        public readonly string DnsForwardingRulesetId;
        /// <summary>
        /// The domain name for the Private DNS Resolver Forwarding Rule.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// Is the Private DNS Resolver Forwarding Rule enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The metadata attached to the Private DNS Resolver Forwarding Rule.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Metadata;
        public readonly string Name;
        /// <summary>
        /// A list of `target_dns_servers` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResolverForwardingRuleTargetDnsServerResult> TargetDnsServers;

        [OutputConstructor]
        private GetResolverForwardingRuleResult(
            string dnsForwardingRulesetId,

            string domainName,

            bool enabled,

            string id,

            ImmutableDictionary<string, string> metadata,

            string name,

            ImmutableArray<Outputs.GetResolverForwardingRuleTargetDnsServerResult> targetDnsServers)
        {
            DnsForwardingRulesetId = dnsForwardingRulesetId;
            DomainName = domainName;
            Enabled = enabled;
            Id = id;
            Metadata = metadata;
            Name = name;
            TargetDnsServers = targetDnsServers;
        }
    }
}
