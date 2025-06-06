// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SystemCenter.Outputs
{

    [OutputType]
    public sealed class VirtualMachineManagerVirtualMachineInstanceOperatingSystem
    {
        /// <summary>
        /// The admin password of the Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? AdminPassword;
        /// <summary>
        /// The computer name of the Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? ComputerName;

        [OutputConstructor]
        private VirtualMachineManagerVirtualMachineInstanceOperatingSystem(
            string? adminPassword,

            string? computerName)
        {
            AdminPassword = adminPassword;
            ComputerName = computerName;
        }
    }
}
