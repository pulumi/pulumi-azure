// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class RegistryTaskAgentSetting
    {
        /// <summary>
        /// The number of cores required for the Container Registry Task. Possible value is `2`.
        /// </summary>
        public readonly int Cpu;

        [OutputConstructor]
        private RegistryTaskAgentSetting(int cpu)
        {
            Cpu = cpu;
        }
    }
}
