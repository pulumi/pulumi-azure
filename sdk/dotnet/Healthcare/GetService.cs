// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare
{
    public static class GetService
    {
        /// <summary>
        /// Use this data source to access information about an existing Healthcare Service
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
        ///     var example = Azure.Healthcare.GetService.Invoke(new()
        ///     {
        ///         Name = "example-healthcare_service",
        ///         ResourceGroupName = "example-resources",
        ///         Location = "westus2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["healthcareServiceId"] = example.Apply(getServiceResult =&gt; getServiceResult.Id),
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
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("azure:healthcare/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Healthcare Service
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
        ///     var example = Azure.Healthcare.GetService.Invoke(new()
        ///     {
        ///         Name = "example-healthcare_service",
        ///         ResourceGroupName = "example-resources",
        ///         Location = "westus2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["healthcareServiceId"] = example.Apply(getServiceResult =&gt; getServiceResult.Id),
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
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("azure:healthcare/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Healthcare Service
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
        ///     var example = Azure.Healthcare.GetService.Invoke(new()
        ///     {
        ///         Name = "example-healthcare_service",
        ///         ResourceGroupName = "example-resources",
        ///         Location = "westus2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["healthcareServiceId"] = example.Apply(getServiceResult =&gt; getServiceResult.Id),
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
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("azure:healthcare/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Azure Region where the Service is located.
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Healthcare Service.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Healthcare Service exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Azure Region where the Service is located.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Healthcare Service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Healthcare Service exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        public readonly ImmutableArray<string> AccessPolicyObjectIds;
        /// <summary>
        /// An `authentication_configuration` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceAuthenticationConfigurationResult> AuthenticationConfigurations;
        /// <summary>
        /// A `cors_configuration` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceCorsConfigurationResult> CorsConfigurations;
        /// <summary>
        /// The versionless Key Vault Key ID for CMK encryption of the backing database.
        /// </summary>
        public readonly string CosmosdbKeyVaultKeyVersionlessId;
        /// <summary>
        /// The provisioned throughput for the backing database.
        /// </summary>
        public readonly int CosmosdbThroughput;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The type of the service.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The Azure Region where the Service is located.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetServiceResult(
            ImmutableArray<string> accessPolicyObjectIds,

            ImmutableArray<Outputs.GetServiceAuthenticationConfigurationResult> authenticationConfigurations,

            ImmutableArray<Outputs.GetServiceCorsConfigurationResult> corsConfigurations,

            string cosmosdbKeyVaultKeyVersionlessId,

            int cosmosdbThroughput,

            string id,

            string kind,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            AccessPolicyObjectIds = accessPolicyObjectIds;
            AuthenticationConfigurations = authenticationConfigurations;
            CorsConfigurations = corsConfigurations;
            CosmosdbKeyVaultKeyVersionlessId = cosmosdbKeyVaultKeyVersionlessId;
            CosmosdbThroughput = cosmosdbThroughput;
            Id = id;
            Kind = kind;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
