// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class WindowsVirtualMachineScaleSetScaleInArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should the virtual machines chosen for removal be force deleted when the virtual machine scale set is being scaled-in? Possible values are `true` or `false`. Defaults to `false`.
        /// </summary>
        [Input("forceDeletionEnabled")]
        public Input<bool>? ForceDeletionEnabled { get; set; }

        /// <summary>
        /// The scale-in policy rule that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled in. Possible values for the scale-in policy rules are `Default`, `NewestVM` and `OldestVM`, defaults to `Default`. For more information about scale in policy, please [refer to this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-scale-in-policy).
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        public WindowsVirtualMachineScaleSetScaleInArgs()
        {
        }
        public static new WindowsVirtualMachineScaleSetScaleInArgs Empty => new WindowsVirtualMachineScaleSetScaleInArgs();
    }
}
