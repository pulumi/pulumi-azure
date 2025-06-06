// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare
{
    public static class GetMedtechService
    {
        /// <summary>
        /// Use this data source to access information about an existing Healthcare Med Tech Service
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
        ///     var example = Azure.Healthcare.GetMedtechService.Invoke(new()
        ///     {
        ///         Name = "tfexmedtech",
        ///         WorkspaceId = "tfexwks",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermHealthcareMedtechServiceId"] = example.Apply(getMedtechServiceResult =&gt; getMedtechServiceResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.HealthcareApis`: 2022-12-01
        /// </summary>
        public static Task<GetMedtechServiceResult> InvokeAsync(GetMedtechServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMedtechServiceResult>("azure:healthcare/getMedtechService:getMedtechService", args ?? new GetMedtechServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Healthcare Med Tech Service
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
        ///     var example = Azure.Healthcare.GetMedtechService.Invoke(new()
        ///     {
        ///         Name = "tfexmedtech",
        ///         WorkspaceId = "tfexwks",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermHealthcareMedtechServiceId"] = example.Apply(getMedtechServiceResult =&gt; getMedtechServiceResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.HealthcareApis`: 2022-12-01
        /// </summary>
        public static Output<GetMedtechServiceResult> Invoke(GetMedtechServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMedtechServiceResult>("azure:healthcare/getMedtechService:getMedtechService", args ?? new GetMedtechServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Healthcare Med Tech Service
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
        ///     var example = Azure.Healthcare.GetMedtechService.Invoke(new()
        ///     {
        ///         Name = "tfexmedtech",
        ///         WorkspaceId = "tfexwks",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermHealthcareMedtechServiceId"] = example.Apply(getMedtechServiceResult =&gt; getMedtechServiceResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.HealthcareApis`: 2022-12-01
        /// </summary>
        public static Output<GetMedtechServiceResult> Invoke(GetMedtechServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMedtechServiceResult>("azure:healthcare/getMedtechService:getMedtechService", args ?? new GetMedtechServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMedtechServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Healthcare Med Tech Service.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The id of the Healthcare Workspace in which the Healthcare Med Tech Service exists.
        /// </summary>
        [Input("workspaceId", required: true)]
        public string WorkspaceId { get; set; } = null!;

        public GetMedtechServiceArgs()
        {
        }
        public static new GetMedtechServiceArgs Empty => new GetMedtechServiceArgs();
    }

    public sealed class GetMedtechServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Healthcare Med Tech Service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The id of the Healthcare Workspace in which the Healthcare Med Tech Service exists.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public GetMedtechServiceInvokeArgs()
        {
        }
        public static new GetMedtechServiceInvokeArgs Empty => new GetMedtechServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetMedtechServiceResult
    {
        /// <summary>
        /// The Device Mappings of the Med Tech Service.
        /// </summary>
        public readonly string DeviceMappingJson;
        /// <summary>
        /// The Consumer Group of the Event Hub of the Healthcare Med Tech Service.
        /// </summary>
        public readonly string EventhubConsumerGroupName;
        /// <summary>
        /// The name of the Event Hub of the Healthcare Med Tech Service.
        /// </summary>
        public readonly string EventhubName;
        /// <summary>
        /// The namespace name of the Event Hub of the Healthcare Med Tech Service.
        /// </summary>
        public readonly string EventhubNamespaceName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The `identity` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMedtechServiceIdentityResult> Identities;
        public readonly string Name;
        public readonly string WorkspaceId;

        [OutputConstructor]
        private GetMedtechServiceResult(
            string deviceMappingJson,

            string eventhubConsumerGroupName,

            string eventhubName,

            string eventhubNamespaceName,

            string id,

            ImmutableArray<Outputs.GetMedtechServiceIdentityResult> identities,

            string name,

            string workspaceId)
        {
            DeviceMappingJson = deviceMappingJson;
            EventhubConsumerGroupName = eventhubConsumerGroupName;
            EventhubName = eventhubName;
            EventhubNamespaceName = eventhubNamespaceName;
            Id = id;
            Identities = identities;
            Name = name;
            WorkspaceId = workspaceId;
        }
    }
}
