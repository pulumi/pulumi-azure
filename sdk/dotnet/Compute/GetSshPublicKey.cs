// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    public static class GetSshPublicKey
    {
        /// <summary>
        /// Use this data source to access information about an existing SSH Public Key.
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
        ///     var example = Azure.Compute.GetSshPublicKey.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSshPublicKeyResult =&gt; getSshPublicKeyResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Task<GetSshPublicKeyResult> InvokeAsync(GetSshPublicKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshPublicKeyResult>("azure:compute/getSshPublicKey:getSshPublicKey", args ?? new GetSshPublicKeyArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing SSH Public Key.
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
        ///     var example = Azure.Compute.GetSshPublicKey.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSshPublicKeyResult =&gt; getSshPublicKeyResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Output<GetSshPublicKeyResult> Invoke(GetSshPublicKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshPublicKeyResult>("azure:compute/getSshPublicKey:getSshPublicKey", args ?? new GetSshPublicKeyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing SSH Public Key.
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
        ///     var example = Azure.Compute.GetSshPublicKey.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSshPublicKeyResult =&gt; getSshPublicKeyResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Output<GetSshPublicKeyResult> Invoke(GetSshPublicKeyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshPublicKeyResult>("azure:compute/getSshPublicKey:getSshPublicKey", args ?? new GetSshPublicKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshPublicKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this SSH Public Key.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the SSH Public Key exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the SSH Public Key.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetSshPublicKeyArgs()
        {
        }
        public static new GetSshPublicKeyArgs Empty => new GetSshPublicKeyArgs();
    }

    public sealed class GetSshPublicKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this SSH Public Key.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the SSH Public Key exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the SSH Public Key.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetSshPublicKeyInvokeArgs()
        {
        }
        public static new GetSshPublicKeyInvokeArgs Empty => new GetSshPublicKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetSshPublicKeyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The SSH public key used to authenticate to a virtual machine through ssh.
        /// </summary>
        public readonly string PublicKey;
        public readonly string ResourceGroupName;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetSshPublicKeyResult(
            string id,

            string name,

            string publicKey,

            string resourceGroupName,

            ImmutableDictionary<string, string>? tags)
        {
            Id = id;
            Name = name;
            PublicKey = publicKey;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}
