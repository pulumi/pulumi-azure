// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class IntegrationRuntimeSsisPipelineExternalComputeScale
    {
        /// <summary>
        /// Specifies the number of the external nodes, which should be greater than `0` and less than `11`.
        /// </summary>
        public readonly int? NumberOfExternalNodes;
        /// <summary>
        /// Specifies the number of the pipeline nodes, which should be greater than `0` and less than `11`.
        /// </summary>
        public readonly int? NumberOfPipelineNodes;
        /// <summary>
        /// Specifies the time to live (in minutes) setting of integration runtime which will execute copy activity. Possible values are at least `5`.
        /// </summary>
        public readonly int? TimeToLive;

        [OutputConstructor]
        private IntegrationRuntimeSsisPipelineExternalComputeScale(
            int? numberOfExternalNodes,

            int? numberOfPipelineNodes,

            int? timeToLive)
        {
            NumberOfExternalNodes = numberOfExternalNodes;
            NumberOfPipelineNodes = numberOfPipelineNodes;
            TimeToLive = timeToLive;
        }
    }
}
