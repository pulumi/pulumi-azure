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
    public sealed class WindowsVirtualMachineAdditionalCapabilities
    {
        /// <summary>
        /// Whether to enable the hibernation capability or not.
        /// </summary>
        public readonly bool? HibernationEnabled;
        /// <summary>
        /// Should the capacity to enable Data Disks of the `UltraSSD_LRS` storage account type be supported on this Virtual Machine? Defaults to `false`.
        /// </summary>
        public readonly bool? UltraSsdEnabled;

        [OutputConstructor]
        private WindowsVirtualMachineAdditionalCapabilities(
            bool? hibernationEnabled,

            bool? ultraSsdEnabled)
        {
            HibernationEnabled = hibernationEnabled;
            UltraSsdEnabled = ultraSsdEnabled;
        }
    }
}
