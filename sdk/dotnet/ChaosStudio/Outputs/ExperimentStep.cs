// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ChaosStudio.Outputs
{

    [OutputType]
    public sealed class ExperimentStep
    {
        /// <summary>
        /// One or more `branch` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ExperimentStepBranch> Branches;
        /// <summary>
        /// The name of the Step.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ExperimentStep(
            ImmutableArray<Outputs.ExperimentStepBranch> branches,

            string name)
        {
            Branches = branches;
            Name = name;
        }
    }
}
