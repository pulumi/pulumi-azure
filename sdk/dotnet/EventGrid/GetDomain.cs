// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid
{
    public static class GetDomain
    {
        /// <summary>
        /// Use this data source to access information about an existing EventGrid Domain
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
        ///     var example = Azure.EventGrid.GetDomain.Invoke(new()
        ///     {
        ///         Name = "my-eventgrid-domain",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["eventgridDomainMappingTopic"] = example.Apply(getDomainResult =&gt; getDomainResult.InputMappingFields[0]?.Topic),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.EventGrid`: 2022-06-15
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("azure:eventgrid/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing EventGrid Domain
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
        ///     var example = Azure.EventGrid.GetDomain.Invoke(new()
        ///     {
        ///         Name = "my-eventgrid-domain",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["eventgridDomainMappingTopic"] = example.Apply(getDomainResult =&gt; getDomainResult.InputMappingFields[0]?.Topic),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.EventGrid`: 2022-06-15
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("azure:eventgrid/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing EventGrid Domain
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
        ///     var example = Azure.EventGrid.GetDomain.Invoke(new()
        ///     {
        ///         Name = "my-eventgrid-domain",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["eventgridDomainMappingTopic"] = example.Apply(getDomainResult =&gt; getDomainResult.InputMappingFields[0]?.Topic),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.EventGrid`: 2022-06-15
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("azure:eventgrid/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the EventGrid Domain resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the EventGrid Domain exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDomainArgs()
        {
        }
        public static new GetDomainArgs Empty => new GetDomainArgs();
    }

    public sealed class GetDomainInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the EventGrid Domain resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the EventGrid Domain exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetDomainInvokeArgs()
        {
        }
        public static new GetDomainInvokeArgs Empty => new GetDomainInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        /// <summary>
        /// The Endpoint associated with the EventGrid Domain.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// An `identity` block as documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainIdentityResult> Identities;
        /// <summary>
        /// One or more `inbound_ip_rule` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainInboundIpRuleResult> InboundIpRules;
        /// <summary>
        /// A `input_mapping_default_values` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainInputMappingDefaultValueResult> InputMappingDefaultValues;
        /// <summary>
        /// A `input_mapping_fields` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainInputMappingFieldResult> InputMappingFields;
        /// <summary>
        /// The schema in which incoming events will be published to this domain. Possible values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`.
        /// </summary>
        public readonly string InputSchema;
        /// <summary>
        /// The Azure Region in which this EventGrid Domain exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        /// <summary>
        /// The primary access key associated with the EventGrid Domain.
        /// </summary>
        public readonly string PrimaryAccessKey;
        /// <summary>
        /// Whether or not public network access is allowed for this server.
        /// </summary>
        public readonly bool PublicNetworkAccessEnabled;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The secondary access key associated with the EventGrid Domain.
        /// </summary>
        public readonly string SecondaryAccessKey;
        /// <summary>
        /// A mapping of tags assigned to the EventGrid Domain.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetDomainResult(
            string endpoint,

            string id,

            ImmutableArray<Outputs.GetDomainIdentityResult> identities,

            ImmutableArray<Outputs.GetDomainInboundIpRuleResult> inboundIpRules,

            ImmutableArray<Outputs.GetDomainInputMappingDefaultValueResult> inputMappingDefaultValues,

            ImmutableArray<Outputs.GetDomainInputMappingFieldResult> inputMappingFields,

            string inputSchema,

            string location,

            string name,

            string primaryAccessKey,

            bool publicNetworkAccessEnabled,

            string resourceGroupName,

            string secondaryAccessKey,

            ImmutableDictionary<string, string> tags)
        {
            Endpoint = endpoint;
            Id = id;
            Identities = identities;
            InboundIpRules = inboundIpRules;
            InputMappingDefaultValues = inputMappingDefaultValues;
            InputMappingFields = inputMappingFields;
            InputSchema = inputSchema;
            Location = location;
            Name = name;
            PrimaryAccessKey = primaryAccessKey;
            PublicNetworkAccessEnabled = publicNetworkAccessEnabled;
            ResourceGroupName = resourceGroupName;
            SecondaryAccessKey = secondaryAccessKey;
            Tags = tags;
        }
    }
}
