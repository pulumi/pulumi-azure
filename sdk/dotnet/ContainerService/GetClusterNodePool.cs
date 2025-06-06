// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService
{
    public static class GetClusterNodePool
    {
        /// <summary>
        /// Use this data source to access information about an existing Kubernetes Cluster Node Pool.
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
        ///     var example = Azure.ContainerService.GetClusterNodePool.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         KubernetesClusterName = "existing-cluster",
        ///         ResourceGroupName = "existing-resource-group",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getClusterNodePoolResult =&gt; getClusterNodePoolResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ContainerService`: 2024-09-01
        /// </summary>
        public static Task<GetClusterNodePoolResult> InvokeAsync(GetClusterNodePoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterNodePoolResult>("azure:containerservice/getClusterNodePool:getClusterNodePool", args ?? new GetClusterNodePoolArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Kubernetes Cluster Node Pool.
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
        ///     var example = Azure.ContainerService.GetClusterNodePool.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         KubernetesClusterName = "existing-cluster",
        ///         ResourceGroupName = "existing-resource-group",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getClusterNodePoolResult =&gt; getClusterNodePoolResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ContainerService`: 2024-09-01
        /// </summary>
        public static Output<GetClusterNodePoolResult> Invoke(GetClusterNodePoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterNodePoolResult>("azure:containerservice/getClusterNodePool:getClusterNodePool", args ?? new GetClusterNodePoolInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Kubernetes Cluster Node Pool.
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
        ///     var example = Azure.ContainerService.GetClusterNodePool.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         KubernetesClusterName = "existing-cluster",
        ///         ResourceGroupName = "existing-resource-group",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getClusterNodePoolResult =&gt; getClusterNodePoolResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ContainerService`: 2024-09-01
        /// </summary>
        public static Output<GetClusterNodePoolResult> Invoke(GetClusterNodePoolInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterNodePoolResult>("azure:containerservice/getClusterNodePool:getClusterNodePool", args ?? new GetClusterNodePoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterNodePoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Name of the Kubernetes Cluster where this Node Pool is located.
        /// </summary>
        [Input("kubernetesClusterName", required: true)]
        public string KubernetesClusterName { get; set; } = null!;

        /// <summary>
        /// The name of this Kubernetes Cluster Node Pool.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Kubernetes Cluster exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetClusterNodePoolArgs()
        {
        }
        public static new GetClusterNodePoolArgs Empty => new GetClusterNodePoolArgs();
    }

    public sealed class GetClusterNodePoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Name of the Kubernetes Cluster where this Node Pool is located.
        /// </summary>
        [Input("kubernetesClusterName", required: true)]
        public Input<string> KubernetesClusterName { get; set; } = null!;

        /// <summary>
        /// The name of this Kubernetes Cluster Node Pool.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Kubernetes Cluster exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetClusterNodePoolInvokeArgs()
        {
        }
        public static new GetClusterNodePoolInvokeArgs Empty => new GetClusterNodePoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterNodePoolResult
    {
        /// <summary>
        /// Does this Node Pool have Auto-Scaling enabled?
        /// </summary>
        public readonly bool AutoScalingEnabled;
        /// <summary>
        /// The eviction policy used for Virtual Machines in the Virtual Machine Scale Set, when `priority` is set to `Spot`.
        /// </summary>
        public readonly string EvictionPolicy;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string KubernetesClusterName;
        /// <summary>
        /// The maximum number of Nodes allowed when auto-scaling is enabled.
        /// </summary>
        public readonly int MaxCount;
        /// <summary>
        /// The maximum number of Pods allowed on each Node in this Node Pool.
        /// </summary>
        public readonly int MaxPods;
        /// <summary>
        /// The minimum number of Nodes allowed when auto-scaling is enabled.
        /// </summary>
        public readonly int MinCount;
        /// <summary>
        /// The Mode for this Node Pool, specifying how these Nodes should be used (for either System or User resources).
        /// </summary>
        public readonly string Mode;
        public readonly string Name;
        /// <summary>
        /// The current number of Nodes in the Node Pool.
        /// </summary>
        public readonly int NodeCount;
        /// <summary>
        /// A map of Kubernetes Labels applied to each Node in this Node Pool.
        /// </summary>
        public readonly ImmutableDictionary<string, string> NodeLabels;
        /// <summary>
        /// Do nodes in this Node Pool have a Public IP Address?
        /// </summary>
        public readonly bool NodePublicIpEnabled;
        /// <summary>
        /// Resource ID for the Public IP Addresses Prefix for the nodes in this Agent Pool.
        /// </summary>
        public readonly string NodePublicIpPrefixId;
        /// <summary>
        /// A map of Kubernetes Taints applied to each Node in this Node Pool.
        /// </summary>
        public readonly ImmutableArray<string> NodeTaints;
        /// <summary>
        /// The version of Kubernetes configured on each Node in this Node Pool.
        /// </summary>
        public readonly string OrchestratorVersion;
        /// <summary>
        /// The size of the OS Disk on each Node in this Node Pool.
        /// </summary>
        public readonly int OsDiskSizeGb;
        /// <summary>
        /// The type of the OS Disk on each Node in this Node Pool.
        /// </summary>
        public readonly string OsDiskType;
        /// <summary>
        /// The operating system used on each Node in this Node Pool.
        /// </summary>
        public readonly string OsType;
        /// <summary>
        /// The priority of the Virtual Machines in the Virtual Machine Scale Set backing this Node Pool.
        /// </summary>
        public readonly string Priority;
        /// <summary>
        /// The ID of the Proximity Placement Group where the Virtual Machine Scale Set backing this Node Pool will be placed.
        /// </summary>
        public readonly string ProximityPlacementGroupId;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The maximum price being paid for Virtual Machines in this Scale Set. `-1` means the current on-demand price for a Virtual Machine.
        /// </summary>
        public readonly double SpotMaxPrice;
        /// <summary>
        /// A mapping of tags assigned to the Kubernetes Cluster Node Pool.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// A `upgrade_settings` block as documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterNodePoolUpgradeSettingResult> UpgradeSettings;
        /// <summary>
        /// The size of the Virtual Machines used in the Virtual Machine Scale Set backing this Node Pool.
        /// </summary>
        public readonly string VmSize;
        /// <summary>
        /// The ID of the Subnet in which this Node Pool exists.
        /// </summary>
        public readonly string VnetSubnetId;
        /// <summary>
        /// A list of the Availability Zones where the Nodes in this Node Pool exist.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetClusterNodePoolResult(
            bool autoScalingEnabled,

            string evictionPolicy,

            string id,

            string kubernetesClusterName,

            int maxCount,

            int maxPods,

            int minCount,

            string mode,

            string name,

            int nodeCount,

            ImmutableDictionary<string, string> nodeLabels,

            bool nodePublicIpEnabled,

            string nodePublicIpPrefixId,

            ImmutableArray<string> nodeTaints,

            string orchestratorVersion,

            int osDiskSizeGb,

            string osDiskType,

            string osType,

            string priority,

            string proximityPlacementGroupId,

            string resourceGroupName,

            double spotMaxPrice,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<Outputs.GetClusterNodePoolUpgradeSettingResult> upgradeSettings,

            string vmSize,

            string vnetSubnetId,

            ImmutableArray<string> zones)
        {
            AutoScalingEnabled = autoScalingEnabled;
            EvictionPolicy = evictionPolicy;
            Id = id;
            KubernetesClusterName = kubernetesClusterName;
            MaxCount = maxCount;
            MaxPods = maxPods;
            MinCount = minCount;
            Mode = mode;
            Name = name;
            NodeCount = nodeCount;
            NodeLabels = nodeLabels;
            NodePublicIpEnabled = nodePublicIpEnabled;
            NodePublicIpPrefixId = nodePublicIpPrefixId;
            NodeTaints = nodeTaints;
            OrchestratorVersion = orchestratorVersion;
            OsDiskSizeGb = osDiskSizeGb;
            OsDiskType = osDiskType;
            OsType = osType;
            Priority = priority;
            ProximityPlacementGroupId = proximityPlacementGroupId;
            ResourceGroupName = resourceGroupName;
            SpotMaxPrice = spotMaxPrice;
            Tags = tags;
            UpgradeSettings = upgradeSettings;
            VmSize = vmSize;
            VnetSubnetId = vnetSubnetId;
            Zones = zones;
        }
    }
}
