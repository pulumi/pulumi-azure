// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp
{
    public static class GetAccount
    {
        /// <summary>
        /// Uses this data source to access information about an existing NetApp Account.
        /// 
        /// ## NetApp Account Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetAccount.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         Name = "acctestnetappaccount",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["netappAccountId"] = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(GetAccountArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("azure:netapp/getAccount:getAccount", args ?? new GetAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing NetApp Account.
        /// 
        /// ## NetApp Account Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetAccount.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         Name = "acctestnetappaccount",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["netappAccountId"] = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Output<GetAccountResult> Invoke(GetAccountInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("azure:netapp/getAccount:getAccount", args ?? new GetAccountInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing NetApp Account.
        /// 
        /// ## NetApp Account Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetAccount.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         Name = "acctestnetappaccount",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["netappAccountId"] = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Output<GetAccountResult> Invoke(GetAccountInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("azure:netapp/getAccount:getAccount", args ?? new GetAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountArgs : global::Pulumi.InvokeArgs
    {
        [Input("identity")]
        public Inputs.GetAccountIdentityArgs? Identity { get; set; }

        /// <summary>
        /// The name of the NetApp Account.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the NetApp Account exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetAccountArgs()
        {
        }
        public static new GetAccountArgs Empty => new GetAccountArgs();
    }

    public sealed class GetAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("identity")]
        public Input<Inputs.GetAccountIdentityInputArgs>? Identity { get; set; }

        /// <summary>
        /// The name of the NetApp Account.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the NetApp Account exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetAccountInvokeArgs()
        {
        }
        public static new GetAccountInvokeArgs Empty => new GetAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetAccountIdentityResult? Identity;
        /// <summary>
        /// The Azure Region where the NetApp Account exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetAccountResult(
            string id,

            Outputs.GetAccountIdentityResult? identity,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            Id = id;
            Identity = identity;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
