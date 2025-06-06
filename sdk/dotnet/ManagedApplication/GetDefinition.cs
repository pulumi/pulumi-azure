// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ManagedApplication
{
    public static class GetDefinition
    {
        /// <summary>
        /// Uses this data source to access information about an existing Managed Application Definition.
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
        ///     var example = Azure.ManagedApplication.GetDefinition.Invoke(new()
        ///     {
        ///         Name = "examplemanagedappdef",
        ///         ResourceGroupName = "exampleresources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getDefinitionResult =&gt; getDefinitionResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Solutions`: 2021-07-01
        /// </summary>
        public static Task<GetDefinitionResult> InvokeAsync(GetDefinitionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDefinitionResult>("azure:managedapplication/getDefinition:getDefinition", args ?? new GetDefinitionArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing Managed Application Definition.
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
        ///     var example = Azure.ManagedApplication.GetDefinition.Invoke(new()
        ///     {
        ///         Name = "examplemanagedappdef",
        ///         ResourceGroupName = "exampleresources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getDefinitionResult =&gt; getDefinitionResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Solutions`: 2021-07-01
        /// </summary>
        public static Output<GetDefinitionResult> Invoke(GetDefinitionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDefinitionResult>("azure:managedapplication/getDefinition:getDefinition", args ?? new GetDefinitionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing Managed Application Definition.
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
        ///     var example = Azure.ManagedApplication.GetDefinition.Invoke(new()
        ///     {
        ///         Name = "examplemanagedappdef",
        ///         ResourceGroupName = "exampleresources",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getDefinitionResult =&gt; getDefinitionResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Solutions`: 2021-07-01
        /// </summary>
        public static Output<GetDefinitionResult> Invoke(GetDefinitionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDefinitionResult>("azure:managedapplication/getDefinition:getDefinition", args ?? new GetDefinitionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDefinitionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Managed Application Definition.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where this Managed Application Definition exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDefinitionArgs()
        {
        }
        public static new GetDefinitionArgs Empty => new GetDefinitionArgs();
    }

    public sealed class GetDefinitionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Managed Application Definition.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where this Managed Application Definition exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetDefinitionInvokeArgs()
        {
        }
        public static new GetDefinitionInvokeArgs Empty => new GetDefinitionInvokeArgs();
    }


    [OutputType]
    public sealed class GetDefinitionResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;

        [OutputConstructor]
        private GetDefinitionResult(
            string id,

            string location,

            string name,

            string resourceGroupName)
        {
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
        }
    }
}
