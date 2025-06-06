// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Waf
{
    public static class GetFirewallPolicy
    {
        /// <summary>
        /// Use this data source to access information about an existing Web Application Firewall Policy.
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
        ///     var example = Azure.Waf.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "existing",
        ///         Name = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getFirewallPolicyResult =&gt; getFirewallPolicyResult.Id),
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
        public static Task<GetFirewallPolicyResult> InvokeAsync(GetFirewallPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallPolicyResult>("azure:waf/getFirewallPolicy:getFirewallPolicy", args ?? new GetFirewallPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Web Application Firewall Policy.
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
        ///     var example = Azure.Waf.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "existing",
        ///         Name = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getFirewallPolicyResult =&gt; getFirewallPolicyResult.Id),
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
        public static Output<GetFirewallPolicyResult> Invoke(GetFirewallPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallPolicyResult>("azure:waf/getFirewallPolicy:getFirewallPolicy", args ?? new GetFirewallPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Web Application Firewall Policy.
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
        ///     var example = Azure.Waf.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "existing",
        ///         Name = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getFirewallPolicyResult =&gt; getFirewallPolicyResult.Id),
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
        public static Output<GetFirewallPolicyResult> Invoke(GetFirewallPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallPolicyResult>("azure:waf/getFirewallPolicy:getFirewallPolicy", args ?? new GetFirewallPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Web Application Firewall Policy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Web Application Firewall Policy exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetFirewallPolicyArgs()
        {
        }
        public static new GetFirewallPolicyArgs Empty => new GetFirewallPolicyArgs();
    }

    public sealed class GetFirewallPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Web Application Firewall Policy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Web Application Firewall Policy exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetFirewallPolicyInvokeArgs()
        {
        }
        public static new GetFirewallPolicyInvokeArgs Empty => new GetFirewallPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallPolicyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetFirewallPolicyResult(
            string id,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string>? tags)
        {
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
