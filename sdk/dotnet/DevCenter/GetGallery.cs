// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevCenter
{
    public static class GetGallery
    {
        /// <summary>
        /// Use this data source to access information about an existing Dev Center Gallery.
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
        ///     var example = Azure.DevCenter.GetGallery.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterGallery.Name,
        ///         DevCenterId = exampleAzurermDevCenterGallery.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getGalleryResult =&gt; getGalleryResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Task<GetGalleryResult> InvokeAsync(GetGalleryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGalleryResult>("azure:devcenter/getGallery:getGallery", args ?? new GetGalleryArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Center Gallery.
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
        ///     var example = Azure.DevCenter.GetGallery.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterGallery.Name,
        ///         DevCenterId = exampleAzurermDevCenterGallery.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getGalleryResult =&gt; getGalleryResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Output<GetGalleryResult> Invoke(GetGalleryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGalleryResult>("azure:devcenter/getGallery:getGallery", args ?? new GetGalleryInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Dev Center Gallery.
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
        ///     var example = Azure.DevCenter.GetGallery.Invoke(new()
        ///     {
        ///         Name = exampleAzurermDevCenterGallery.Name,
        ///         DevCenterId = exampleAzurermDevCenterGallery.DevCenterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getGalleryResult =&gt; getGalleryResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.DevCenter`: 2025-02-01
        /// </summary>
        public static Output<GetGalleryResult> Invoke(GetGalleryInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGalleryResult>("azure:devcenter/getGallery:getGallery", args ?? new GetGalleryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGalleryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Dev Center which contains the Dev Center Gallery.
        /// </summary>
        [Input("devCenterId", required: true)]
        public string DevCenterId { get; set; } = null!;

        /// <summary>
        /// The name of this Dev Center Gallery.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGalleryArgs()
        {
        }
        public static new GetGalleryArgs Empty => new GetGalleryArgs();
    }

    public sealed class GetGalleryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Dev Center which contains the Dev Center Gallery.
        /// </summary>
        [Input("devCenterId", required: true)]
        public Input<string> DevCenterId { get; set; } = null!;

        /// <summary>
        /// The name of this Dev Center Gallery.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGalleryInvokeArgs()
        {
        }
        public static new GetGalleryInvokeArgs Empty => new GetGalleryInvokeArgs();
    }


    [OutputType]
    public sealed class GetGalleryResult
    {
        public readonly string DevCenterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The ID of the Shared Gallery connected to the Dev Center Gallery.
        /// </summary>
        public readonly string SharedGalleryId;

        [OutputConstructor]
        private GetGalleryResult(
            string devCenterId,

            string id,

            string name,

            string sharedGalleryId)
        {
            DevCenterId = devCenterId;
            Id = id;
            Name = name;
            SharedGalleryId = sharedGalleryId;
        }
    }
}
