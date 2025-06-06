// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot
{
    public static class GetSharedAccessPolicy
    {
        /// <summary>
        /// Use this data source to access information about an existing IotHub Shared Access Policy
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
        ///     var example = Azure.Iot.GetSharedAccessPolicy.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///         IothubName = exampleAzurermIothub.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSharedAccessPolicyResult> InvokeAsync(GetSharedAccessPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSharedAccessPolicyResult>("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", args ?? new GetSharedAccessPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing IotHub Shared Access Policy
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
        ///     var example = Azure.Iot.GetSharedAccessPolicy.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///         IothubName = exampleAzurermIothub.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSharedAccessPolicyResult> Invoke(GetSharedAccessPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharedAccessPolicyResult>("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", args ?? new GetSharedAccessPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing IotHub Shared Access Policy
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
        ///     var example = Azure.Iot.GetSharedAccessPolicy.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         ResourceGroupName = exampleAzurermResourceGroup.Name,
        ///         IothubName = exampleAzurermIothub.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSharedAccessPolicyResult> Invoke(GetSharedAccessPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharedAccessPolicyResult>("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", args ?? new GetSharedAccessPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharedAccessPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the IoTHub to which this Shared Access Policy belongs.
        /// </summary>
        [Input("iothubName", required: true)]
        public string IothubName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the IotHub Shared Access Policy resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetSharedAccessPolicyArgs()
        {
        }
        public static new GetSharedAccessPolicyArgs Empty => new GetSharedAccessPolicyArgs();
    }

    public sealed class GetSharedAccessPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the IoTHub to which this Shared Access Policy belongs.
        /// </summary>
        [Input("iothubName", required: true)]
        public Input<string> IothubName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the IotHub Shared Access Policy resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetSharedAccessPolicyInvokeArgs()
        {
        }
        public static new GetSharedAccessPolicyInvokeArgs Empty => new GetSharedAccessPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetSharedAccessPolicyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IothubName;
        public readonly string Name;
        /// <summary>
        /// The primary connection string of the Shared Access Policy.
        /// </summary>
        public readonly string PrimaryConnectionString;
        /// <summary>
        /// The primary key used to create the authentication token.
        /// </summary>
        public readonly string PrimaryKey;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The secondary connection string of the Shared Access Policy.
        /// </summary>
        public readonly string SecondaryConnectionString;
        /// <summary>
        /// The secondary key used to create the authentication token.
        /// </summary>
        public readonly string SecondaryKey;

        [OutputConstructor]
        private GetSharedAccessPolicyResult(
            string id,

            string iothubName,

            string name,

            string primaryConnectionString,

            string primaryKey,

            string resourceGroupName,

            string secondaryConnectionString,

            string secondaryKey)
        {
            Id = id;
            IothubName = iothubName;
            Name = name;
            PrimaryConnectionString = primaryConnectionString;
            PrimaryKey = primaryKey;
            ResourceGroupName = resourceGroupName;
            SecondaryConnectionString = secondaryConnectionString;
            SecondaryKey = secondaryKey;
        }
    }
}
