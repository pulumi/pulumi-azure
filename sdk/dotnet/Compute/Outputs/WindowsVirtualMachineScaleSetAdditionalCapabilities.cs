// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class WindowsVirtualMachineScaleSetAdditionalCapabilities
    {
        /// <summary>
        /// Should the capacity to enable Data Disks of the `UltraSSD_LRS` storage account type be supported on this Virtual Machine Scale Set? Possible values are `true` or `false`. Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly bool? UltraSsdEnabled;

        [OutputConstructor]
        private WindowsVirtualMachineScaleSetAdditionalCapabilities(bool? ultraSsdEnabled)
        {
            UltraSsdEnabled = ultraSsdEnabled;
        }
    }
}
