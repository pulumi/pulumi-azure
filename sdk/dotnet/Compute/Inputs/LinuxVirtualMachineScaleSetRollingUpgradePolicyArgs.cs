// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should the Virtual Machine Scale Set ignore the Azure Zone boundaries when constructing upgrade batches? Possible values are `true` or `false`.
        /// </summary>
        [Input("crossZoneUpgradesEnabled")]
        public Input<bool>? CrossZoneUpgradesEnabled { get; set; }

        /// <summary>
        /// The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability.
        /// </summary>
        [Input("maxBatchInstancePercent", required: true)]
        public Input<int> MaxBatchInstancePercent { get; set; } = null!;

        /// <summary>
        /// The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch.
        /// </summary>
        [Input("maxUnhealthyInstancePercent", required: true)]
        public Input<int> MaxUnhealthyInstancePercent { get; set; } = null!;

        /// <summary>
        /// The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts.
        /// </summary>
        [Input("maxUnhealthyUpgradedInstancePercent", required: true)]
        public Input<int> MaxUnhealthyUpgradedInstancePercent { get; set; } = null!;

        /// <summary>
        /// Create new virtual machines to upgrade the scale set, rather than updating the existing virtual machines. Existing virtual machines will be deleted once the new virtual machines are created for each batch. Possible values are `true` or `false`.
        /// 
        /// &gt; **Note:** `overprovision` must be set to `false` when `maximum_surge_instances_enabled` is specified.
        /// </summary>
        [Input("maximumSurgeInstancesEnabled")]
        public Input<bool>? MaximumSurgeInstancesEnabled { get; set; }

        /// <summary>
        /// The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format.
        /// </summary>
        [Input("pauseTimeBetweenBatches", required: true)]
        public Input<string> PauseTimeBetweenBatches { get; set; } = null!;

        /// <summary>
        /// Upgrade all unhealthy instances in a scale set before any healthy instances. Possible values are `true` or `false`.
        /// </summary>
        [Input("prioritizeUnhealthyInstancesEnabled")]
        public Input<bool>? PrioritizeUnhealthyInstancesEnabled { get; set; }

        public LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs()
        {
        }
        public static new LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs Empty => new LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs();
    }
}
