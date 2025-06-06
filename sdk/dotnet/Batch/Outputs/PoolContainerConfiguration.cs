// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Outputs
{

    [OutputType]
    public sealed class PoolContainerConfiguration
    {
        /// <summary>
        /// A list of container image names to use, as would be specified by `docker pull`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly ImmutableArray<string> ContainerImageNames;
        /// <summary>
        /// One or more `container_registries` blocks as defined below. Additional container registries from which container images can be pulled by the pool's VMs. Changing this forces a new resource to be created.
        /// </summary>
        public readonly ImmutableArray<Outputs.PoolContainerConfigurationContainerRegistry> ContainerRegistries;
        /// <summary>
        /// The type of container configuration. Possible value is `DockerCompatible`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private PoolContainerConfiguration(
            ImmutableArray<string> containerImageNames,

            ImmutableArray<Outputs.PoolContainerConfigurationContainerRegistry> containerRegistries,

            string? type)
        {
            ContainerImageNames = containerImageNames;
            ContainerRegistries = containerRegistries;
            Type = type;
        }
    }
}
