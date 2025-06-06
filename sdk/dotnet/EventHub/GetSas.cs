// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventHub
{
    public static class GetSas
    {
        /// <summary>
        /// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub.
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
        ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
        ///     {
        ///         Name = "example-resources",
        ///         Location = "West Europe",
        ///     });
        /// 
        ///     var exampleEventHubNamespace = new Azure.EventHub.EventHubNamespace("example", new()
        ///     {
        ///         Name = "example-ehn",
        ///         Location = exampleResourceGroup.Location,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Sku = "Basic",
        ///     });
        /// 
        ///     var exampleEventHub = new Azure.EventHub.EventHub("example", new()
        ///     {
        ///         Name = "example-eh",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         PartitionCount = 1,
        ///         MessageRetention = 1,
        ///     });
        /// 
        ///     var exampleAuthorizationRule = new Azure.EventHub.AuthorizationRule("example", new()
        ///     {
        ///         Name = "example-ehar",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Listen = true,
        ///         Send = true,
        ///         Manage = true,
        ///     });
        /// 
        ///     var example = Azure.EventHub.GetAuthorizationRule.Invoke(new()
        ///     {
        ///         Name = exampleAuthorizationRule.Name,
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///     });
        /// 
        ///     var exampleGetSas = Azure.EventHub.GetSas.Invoke(new()
        ///     {
        ///         ConnectionString = example.Apply(getAuthorizationRuleResult =&gt; getAuthorizationRuleResult.PrimaryConnectionString),
        ///         Expiry = "2023-06-23T00:00:00Z",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSasResult> InvokeAsync(GetSasArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSasResult>("azure:eventhub/getSas:getSas", args ?? new GetSasArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub.
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
        ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
        ///     {
        ///         Name = "example-resources",
        ///         Location = "West Europe",
        ///     });
        /// 
        ///     var exampleEventHubNamespace = new Azure.EventHub.EventHubNamespace("example", new()
        ///     {
        ///         Name = "example-ehn",
        ///         Location = exampleResourceGroup.Location,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Sku = "Basic",
        ///     });
        /// 
        ///     var exampleEventHub = new Azure.EventHub.EventHub("example", new()
        ///     {
        ///         Name = "example-eh",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         PartitionCount = 1,
        ///         MessageRetention = 1,
        ///     });
        /// 
        ///     var exampleAuthorizationRule = new Azure.EventHub.AuthorizationRule("example", new()
        ///     {
        ///         Name = "example-ehar",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Listen = true,
        ///         Send = true,
        ///         Manage = true,
        ///     });
        /// 
        ///     var example = Azure.EventHub.GetAuthorizationRule.Invoke(new()
        ///     {
        ///         Name = exampleAuthorizationRule.Name,
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///     });
        /// 
        ///     var exampleGetSas = Azure.EventHub.GetSas.Invoke(new()
        ///     {
        ///         ConnectionString = example.Apply(getAuthorizationRuleResult =&gt; getAuthorizationRuleResult.PrimaryConnectionString),
        ///         Expiry = "2023-06-23T00:00:00Z",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSasResult> Invoke(GetSasInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSasResult>("azure:eventhub/getSas:getSas", args ?? new GetSasInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub.
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
        ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
        ///     {
        ///         Name = "example-resources",
        ///         Location = "West Europe",
        ///     });
        /// 
        ///     var exampleEventHubNamespace = new Azure.EventHub.EventHubNamespace("example", new()
        ///     {
        ///         Name = "example-ehn",
        ///         Location = exampleResourceGroup.Location,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Sku = "Basic",
        ///     });
        /// 
        ///     var exampleEventHub = new Azure.EventHub.EventHub("example", new()
        ///     {
        ///         Name = "example-eh",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         PartitionCount = 1,
        ///         MessageRetention = 1,
        ///     });
        /// 
        ///     var exampleAuthorizationRule = new Azure.EventHub.AuthorizationRule("example", new()
        ///     {
        ///         Name = "example-ehar",
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///         Listen = true,
        ///         Send = true,
        ///         Manage = true,
        ///     });
        /// 
        ///     var example = Azure.EventHub.GetAuthorizationRule.Invoke(new()
        ///     {
        ///         Name = exampleAuthorizationRule.Name,
        ///         NamespaceName = exampleEventHubNamespace.Name,
        ///         EventhubName = exampleEventHub.Name,
        ///         ResourceGroupName = exampleResourceGroup.Name,
        ///     });
        /// 
        ///     var exampleGetSas = Azure.EventHub.GetSas.Invoke(new()
        ///     {
        ///         ConnectionString = example.Apply(getAuthorizationRuleResult =&gt; getAuthorizationRuleResult.PrimaryConnectionString),
        ///         Expiry = "2023-06-23T00:00:00Z",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSasResult> Invoke(GetSasInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSasResult>("azure:eventhub/getSas:getSas", args ?? new GetSasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSasArgs : global::Pulumi.InvokeArgs
    {
        [Input("connectionString", required: true)]
        private string? _connectionString;

        /// <summary>
        /// The connection string for the Event Hub to which this SAS applies.
        /// </summary>
        public string? ConnectionString
        {
            get => _connectionString;
            set => _connectionString = value;
        }

        /// <summary>
        /// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("expiry", required: true)]
        public string Expiry { get; set; } = null!;

        public GetSasArgs()
        {
        }
        public static new GetSasArgs Empty => new GetSasArgs();
    }

    public sealed class GetSasInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("connectionString", required: true)]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string for the Event Hub to which this SAS applies.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
        /// </summary>
        [Input("expiry", required: true)]
        public Input<string> Expiry { get; set; } = null!;

        public GetSasInvokeArgs()
        {
        }
        public static new GetSasInvokeArgs Empty => new GetSasInvokeArgs();
    }


    [OutputType]
    public sealed class GetSasResult
    {
        public readonly string ConnectionString;
        public readonly string Expiry;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The computed Event Hub Shared Access Signature (SAS).
        /// </summary>
        public readonly string Sas;

        [OutputConstructor]
        private GetSasResult(
            string connectionString,

            string expiry,

            string id,

            string sas)
        {
            ConnectionString = connectionString;
            Expiry = expiry;
            Id = id;
            Sas = sas;
        }
    }
}
