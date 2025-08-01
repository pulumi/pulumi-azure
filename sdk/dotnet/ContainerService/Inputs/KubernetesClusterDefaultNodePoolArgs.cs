// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterDefaultNodePoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should [the Kubernetes Auto Scaler](https://docs.microsoft.com/azure/aks/cluster-autoscaler) be enabled for this Node Pool?
        /// 
        /// &gt; **Note:** This requires that the `type` is set to `VirtualMachineScaleSets`.
        /// 
        /// &gt; **Note:** If you're using AutoScaling, you may wish to use [`ignoreChanges` functionality](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to ignore changes to the `node_count` field.
        /// </summary>
        [Input("autoScalingEnabled")]
        public Input<bool>? AutoScalingEnabled { get; set; }

        /// <summary>
        /// Specifies the ID of the Capacity Reservation Group within which this AKS Cluster should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("capacityReservationGroupId")]
        public Input<string>? CapacityReservationGroupId { get; set; }

        /// <summary>
        /// Should the nodes in this Node Pool have Federal Information Processing Standard enabled? `temporary_name_for_rotation` must be specified when changing this block. Changing this forces a new resource to be created.
        /// </summary>
        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        /// <summary>
        /// Specifies the GPU MIG instance profile for supported GPU VM SKU. The allowed values are `MIG1g`, `MIG2g`, `MIG3g`, `MIG4g` and `MIG7g`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("gpuInstance")]
        public Input<string>? GpuInstance { get; set; }

        /// <summary>
        /// Should the nodes in the Default Node Pool have host encryption enabled? `temporary_name_for_rotation` must be specified when changing this property.
        /// 
        /// &gt; **Note:** This requires that the  Feature `Microsoft.ContainerService/EnableEncryptionAtHost` is enabled and the Resource Provider is registered.
        /// </summary>
        [Input("hostEncryptionEnabled")]
        public Input<bool>? HostEncryptionEnabled { get; set; }

        /// <summary>
        /// Specifies the ID of the Host Group within which this AKS Cluster should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("hostGroupId")]
        public Input<string>? HostGroupId { get; set; }

        /// <summary>
        /// A `kubelet_config` block as defined below. `temporary_name_for_rotation` must be specified when changing this block.
        /// </summary>
        [Input("kubeletConfig")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolKubeletConfigArgs>? KubeletConfig { get; set; }

        /// <summary>
        /// The type of disk used by kubelet. Possible values are `OS` and `Temporary`. `temporary_name_for_rotation` must be specified when changing this block.
        /// </summary>
        [Input("kubeletDiskType")]
        public Input<string>? KubeletDiskType { get; set; }

        /// <summary>
        /// A `linux_os_config` block as defined below. `temporary_name_for_rotation` must be specified when changing this block.
        /// </summary>
        [Input("linuxOsConfig")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigArgs>? LinuxOsConfig { get; set; }

        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// The maximum number of pods that can run on each agent. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("maxPods")]
        public Input<int>? MaxPods { get; set; }

        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// The name which should be used for the default Kubernetes Node Pool.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodeLabels")]
        private InputMap<string>? _nodeLabels;

        /// <summary>
        /// A map of Kubernetes labels which should be applied to nodes in the Default Node Pool.
        /// </summary>
        public InputMap<string> NodeLabels
        {
            get => _nodeLabels ?? (_nodeLabels = new InputMap<string>());
            set => _nodeLabels = value;
        }

        /// <summary>
        /// A `node_network_profile` block as documented below.
        /// </summary>
        [Input("nodeNetworkProfile")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileArgs>? NodeNetworkProfile { get; set; }

        /// <summary>
        /// Should nodes in this Node Pool have a Public IP Address? `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("nodePublicIpEnabled")]
        public Input<bool>? NodePublicIpEnabled { get; set; }

        /// <summary>
        /// Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `node_public_ip_enabled` should be `true`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("nodePublicIpPrefixId")]
        public Input<string>? NodePublicIpPrefixId { get; set; }

        /// <summary>
        /// Enabling this option will taint default node pool with `CriticalAddonsOnly=true:NoSchedule` taint. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("onlyCriticalAddonsEnabled")]
        public Input<bool>? OnlyCriticalAddonsEnabled { get; set; }

        /// <summary>
        /// Version of Kubernetes used for the Agents. If not specified, the default node pool will be created with the version specified by `kubernetes_version`. If both are unspecified, the latest recommended version will be used at provisioning time (but won't auto-upgrade). AKS does not require an exact patch version to be specified, minor version aliases such as `1.22` are also supported. - The minor version's latest GA patch is automatically chosen in that case. More details can be found in [the documentation](https://docs.microsoft.com/en-us/azure/aks/supported-kubernetes-versions?tabs=azure-cli#alias-minor-version).
        /// 
        /// &gt; **Note:** This version must be supported by the Kubernetes Cluster - as such the version of Kubernetes used on the Cluster/Control Plane may need to be upgraded first.
        /// </summary>
        [Input("orchestratorVersion")]
        public Input<string>? OrchestratorVersion { get; set; }

        /// <summary>
        /// The size of the OS Disk which should be used for each agent in the Node Pool. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        /// <summary>
        /// The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        /// <summary>
        /// Specifies the OS SKU used by the agent pool. Possible values are `AzureLinux`, `Ubuntu`, `Windows2019` and `Windows2022`. If not specified, the default is `Ubuntu` if OSType=Linux or `Windows2019` if OSType=Windows. And the default Windows OSSKU will be changed to `Windows2022` after Windows2019 is deprecated. Changing this from `AzureLinux` or `Ubuntu` to `AzureLinux` or `Ubuntu` will not replace the resource, otherwise `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        /// <summary>
        /// The ID of the Subnet where the pods in the default Node Pool should exist.
        /// </summary>
        [Input("podSubnetId")]
        public Input<string>? PodSubnetId { get; set; }

        /// <summary>
        /// The ID of the Proximity Placement Group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("proximityPlacementGroupId")]
        public Input<string>? ProximityPlacementGroupId { get; set; }

        /// <summary>
        /// Specifies the autoscaling behaviour of the Kubernetes Cluster. Allowed values are `Delete` and `Deallocate`. Defaults to `Delete`.
        /// </summary>
        [Input("scaleDownMode")]
        public Input<string>? ScaleDownMode { get; set; }

        /// <summary>
        /// The ID of the Snapshot which should be used to create this default Node Pool. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Node Pool.
        /// 
        /// &gt; At this time there's a bug in the AKS API where Tags for a Node Pool are not stored in the correct case - you may wish to use `ignore_changes` functionality to ignore changes to the casing until this is fixed in the AKS API.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the name of the temporary node pool used to cycle the default node pool for VM resizing.
        /// </summary>
        [Input("temporaryNameForRotation")]
        public Input<string>? TemporaryNameForRotation { get; set; }

        /// <summary>
        /// The type of Node Pool which should be created. Possible values are `VirtualMachineScaleSets`. Defaults to `VirtualMachineScaleSets`. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** When creating a cluster that supports multiple node pools, the cluster must use `VirtualMachineScaleSets`. For more information on the limitations of clusters using multiple node pools see [the documentation](https://learn.microsoft.com/en-us/azure/aks/use-multiple-node-pools#limitations).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Used to specify whether the UltraSSD is enabled in the Default Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/azure/aks/use-ultra-disks) for more information. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("ultraSsdEnabled")]
        public Input<bool>? UltraSsdEnabled { get; set; }

        /// <summary>
        /// A `upgrade_settings` block as documented below.
        /// </summary>
        [Input("upgradeSettings")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolUpgradeSettingsArgs>? UpgradeSettings { get; set; }

        /// <summary>
        /// The size of the Virtual Machine, such as `Standard_DS2_v2`. `temporary_name_for_rotation` must be specified when attempting a resize.
        /// </summary>
        [Input("vmSize")]
        public Input<string>? VmSize { get; set; }

        /// <summary>
        /// The ID of a Subnet where the Kubernetes Node Pool should exist.
        /// 
        /// &gt; **Note:** A Route Table must be configured on this Subnet.
        /// </summary>
        [Input("vnetSubnetId")]
        public Input<string>? VnetSubnetId { get; set; }

        /// <summary>
        /// Specifies the workload runtime used by the node pool. Possible value is `OCIContainer`.
        /// </summary>
        [Input("workloadRuntime")]
        public Input<string>? WorkloadRuntime { get; set; }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// Specifies a list of Availability Zones in which this Kubernetes Cluster should be located. `temporary_name_for_rotation` must be specified when changing this property.
        /// 
        /// &gt; **Note:** This requires that the `type` is set to `VirtualMachineScaleSets` and that `load_balancer_sku` is set to `standard`.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public KubernetesClusterDefaultNodePoolArgs()
        {
        }
        public static new KubernetesClusterDefaultNodePoolArgs Empty => new KubernetesClusterDefaultNodePoolArgs();
    }
}
