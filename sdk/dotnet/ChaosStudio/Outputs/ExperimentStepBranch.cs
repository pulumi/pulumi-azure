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
    public sealed class ExperimentStepBranch
    {
        /// <summary>
        /// One or more `actions` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ExperimentStepBranchAction> Actions;
        /// <summary>
        /// The name of the branch.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ExperimentStepBranch(
            ImmutableArray<Outputs.ExperimentStepBranchAction> actions,

            string name)
        {
            Actions = actions;
            Name = name;
        }
    }
}
