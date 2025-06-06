// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService
{
    /// <summary>
    /// Manages a Kubernetes Flux Configuration.
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleKubernetesCluster = new Azure.ContainerService.KubernetesCluster("example", new()
    ///     {
    ///         Name = "example-aks",
    ///         Location = "West Europe",
    ///         ResourceGroupName = example.Name,
    ///         DnsPrefix = "example-aks",
    ///         DefaultNodePool = new Azure.ContainerService.Inputs.KubernetesClusterDefaultNodePoolArgs
    ///         {
    ///             Name = "default",
    ///             NodeCount = 1,
    ///             VmSize = "Standard_DS2_v2",
    ///         },
    ///         Identity = new Azure.ContainerService.Inputs.KubernetesClusterIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleKubernetesClusterExtension = new Azure.ContainerService.KubernetesClusterExtension("example", new()
    ///     {
    ///         Name = "example-ext",
    ///         ClusterId = test.Id,
    ///         ExtensionType = "microsoft.flux",
    ///     });
    /// 
    ///     var exampleFluxConfiguration = new Azure.ContainerService.FluxConfiguration("example", new()
    ///     {
    ///         Name = "example-fc",
    ///         ClusterId = test.Id,
    ///         Namespace = "flux",
    ///         GitRepository = new Azure.ContainerService.Inputs.FluxConfigurationGitRepositoryArgs
    ///         {
    ///             Url = "https://github.com/Azure/arc-k8s-demo",
    ///             ReferenceType = "branch",
    ///             ReferenceValue = "main",
    ///         },
    ///         Kustomizations = new[]
    ///         {
    ///             new Azure.ContainerService.Inputs.FluxConfigurationKustomizationArgs
    ///             {
    ///                 Name = "kustomization-1",
    ///                 PostBuild = new Azure.ContainerService.Inputs.FluxConfigurationKustomizationPostBuildArgs
    ///                 {
    ///                     Substitute = 
    ///                     {
    ///                         { "example_var", "substitute_with_this" },
    ///                     },
    ///                     SubstituteFroms = new[]
    ///                     {
    ///                         new Azure.ContainerService.Inputs.FluxConfigurationKustomizationPostBuildSubstituteFromArgs
    ///                         {
    ///                             Kind = "ConfigMap",
    ///                             Name = "example-configmap",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleKubernetesClusterExtension,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.KubernetesConfiguration`: 2023-05-01
    /// 
    /// ## Import
    /// 
    /// Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:containerservice/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.ContainerService/managedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
    /// ```
    /// </summary>
    [AzureResourceType("azure:containerservice/fluxConfiguration:FluxConfiguration")]
    public partial class FluxConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `blob_storage` block as defined below.
        /// </summary>
        [Output("blobStorage")]
        public Output<Outputs.FluxConfigurationBlobStorage?> BlobStorage { get; private set; } = null!;

        /// <summary>
        /// A `bucket` block as defined below.
        /// </summary>
        [Output("bucket")]
        public Output<Outputs.FluxConfigurationBucket?> Bucket { get; private set; } = null!;

        /// <summary>
        /// Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        /// </summary>
        [Output("continuousReconciliationEnabled")]
        public Output<bool?> ContinuousReconciliationEnabled { get; private set; } = null!;

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Output("gitRepository")]
        public Output<Outputs.FluxConfigurationGitRepository?> GitRepository { get; private set; } = null!;

        /// <summary>
        /// A `kustomizations` block as defined below.
        /// </summary>
        [Output("kustomizations")]
        public Output<ImmutableArray<Outputs.FluxConfigurationKustomization>> Kustomizations { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Output("scope")]
        public Output<string?> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a FluxConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FluxConfiguration(string name, FluxConfigurationArgs args, CustomResourceOptions? options = null)
            : base("azure:containerservice/fluxConfiguration:FluxConfiguration", name, args ?? new FluxConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FluxConfiguration(string name, Input<string> id, FluxConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("azure:containerservice/fluxConfiguration:FluxConfiguration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FluxConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FluxConfiguration Get(string name, Input<string> id, FluxConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new FluxConfiguration(name, id, state, options);
        }
    }

    public sealed class FluxConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `blob_storage` block as defined below.
        /// </summary>
        [Input("blobStorage")]
        public Input<Inputs.FluxConfigurationBlobStorageArgs>? BlobStorage { get; set; }

        /// <summary>
        /// A `bucket` block as defined below.
        /// </summary>
        [Input("bucket")]
        public Input<Inputs.FluxConfigurationBucketArgs>? Bucket { get; set; }

        /// <summary>
        /// Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        /// </summary>
        [Input("continuousReconciliationEnabled")]
        public Input<bool>? ContinuousReconciliationEnabled { get; set; }

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Input("gitRepository")]
        public Input<Inputs.FluxConfigurationGitRepositoryArgs>? GitRepository { get; set; }

        [Input("kustomizations", required: true)]
        private InputList<Inputs.FluxConfigurationKustomizationArgs>? _kustomizations;

        /// <summary>
        /// A `kustomizations` block as defined below.
        /// </summary>
        public InputList<Inputs.FluxConfigurationKustomizationArgs> Kustomizations
        {
            get => _kustomizations ?? (_kustomizations = new InputList<Inputs.FluxConfigurationKustomizationArgs>());
            set => _kustomizations = value;
        }

        /// <summary>
        /// Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public FluxConfigurationArgs()
        {
        }
        public static new FluxConfigurationArgs Empty => new FluxConfigurationArgs();
    }

    public sealed class FluxConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `blob_storage` block as defined below.
        /// </summary>
        [Input("blobStorage")]
        public Input<Inputs.FluxConfigurationBlobStorageGetArgs>? BlobStorage { get; set; }

        /// <summary>
        /// A `bucket` block as defined below.
        /// </summary>
        [Input("bucket")]
        public Input<Inputs.FluxConfigurationBucketGetArgs>? Bucket { get; set; }

        /// <summary>
        /// Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        /// </summary>
        [Input("continuousReconciliationEnabled")]
        public Input<bool>? ContinuousReconciliationEnabled { get; set; }

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Input("gitRepository")]
        public Input<Inputs.FluxConfigurationGitRepositoryGetArgs>? GitRepository { get; set; }

        [Input("kustomizations")]
        private InputList<Inputs.FluxConfigurationKustomizationGetArgs>? _kustomizations;

        /// <summary>
        /// A `kustomizations` block as defined below.
        /// </summary>
        public InputList<Inputs.FluxConfigurationKustomizationGetArgs> Kustomizations
        {
            get => _kustomizations ?? (_kustomizations = new InputList<Inputs.FluxConfigurationKustomizationGetArgs>());
            set => _kustomizations = value;
        }

        /// <summary>
        /// Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public FluxConfigurationState()
        {
        }
        public static new FluxConfigurationState Empty => new FluxConfigurationState();
    }
}
