// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    public static class GetFrontdoorSecret
    {
        /// <summary>
        /// Use this data source to access information about an existing Front Door (standard/premium) Secret.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Cdn.GetFrontdoorSecret.Invoke(new()
        ///     {
        ///         Name = "example-secret",
        ///         ProfileName = "example-profile",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFrontdoorSecretResult> InvokeAsync(GetFrontdoorSecretArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFrontdoorSecretResult>("azure:cdn/getFrontdoorSecret:getFrontdoorSecret", args ?? new GetFrontdoorSecretArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Front Door (standard/premium) Secret.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Cdn.GetFrontdoorSecret.Invoke(new()
        ///     {
        ///         Name = "example-secret",
        ///         ProfileName = "example-profile",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFrontdoorSecretResult> Invoke(GetFrontdoorSecretInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFrontdoorSecretResult>("azure:cdn/getFrontdoorSecret:getFrontdoorSecret", args ?? new GetFrontdoorSecretInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFrontdoorSecretArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Front Door Secret.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Front Door Profile within which the Front Door Secret exists.
        /// </summary>
        [Input("profileName", required: true)]
        public string ProfileName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Front Door Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetFrontdoorSecretArgs()
        {
        }
        public static new GetFrontdoorSecretArgs Empty => new GetFrontdoorSecretArgs();
    }

    public sealed class GetFrontdoorSecretInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Front Door Secret.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Front Door Profile within which the Front Door Secret exists.
        /// </summary>
        [Input("profileName", required: true)]
        public Input<string> ProfileName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Front Door Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetFrontdoorSecretInvokeArgs()
        {
        }
        public static new GetFrontdoorSecretInvokeArgs Empty => new GetFrontdoorSecretInvokeArgs();
    }


    [OutputType]
    public sealed class GetFrontdoorSecretResult
    {
        /// <summary>
        /// Specifies the ID of the Front Door Profile within which this Front Door Secret exists.
        /// </summary>
        public readonly string CdnFrontdoorProfileId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ProfileName;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A `secret` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFrontdoorSecretSecretResult> Secrets;

        [OutputConstructor]
        private GetFrontdoorSecretResult(
            string cdnFrontdoorProfileId,

            string id,

            string name,

            string profileName,

            string resourceGroupName,

            ImmutableArray<Outputs.GetFrontdoorSecretSecretResult> secrets)
        {
            CdnFrontdoorProfileId = cdnFrontdoorProfileId;
            Id = id;
            Name = name;
            ProfileName = profileName;
            ResourceGroupName = resourceGroupName;
            Secrets = secrets;
        }
    }
}