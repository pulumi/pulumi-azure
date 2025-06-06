// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewayAutoscaleConfiguration
    {
        /// <summary>
        /// Maximum capacity for autoscaling. Accepted values are in the range `2` to `125`.
        /// </summary>
        public readonly int? MaxCapacity;
        /// <summary>
        /// Minimum capacity for autoscaling. Accepted values are in the range `0` to `100`.
        /// </summary>
        public readonly int MinCapacity;

        [OutputConstructor]
        private ApplicationGatewayAutoscaleConfiguration(
            int? maxCapacity,

            int minCapacity)
        {
            MaxCapacity = maxCapacity;
            MinCapacity = minCapacity;
        }
    }
}
