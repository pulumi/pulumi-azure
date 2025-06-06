// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class FleetUpdateRunStageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the time in seconds to wait at the end of this stage before starting the next one.
        /// </summary>
        [Input("afterStageWaitInSeconds")]
        public Input<int>? AfterStageWaitInSeconds { get; set; }

        [Input("groups", required: true)]
        private InputList<Inputs.FleetUpdateRunStageGroupArgs>? _groups;

        /// <summary>
        /// One or more `group` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FleetUpdateRunStageGroupArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.FleetUpdateRunStageGroupArgs>());
            set => _groups = value;
        }

        /// <summary>
        /// The name which should be used for this stage.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public FleetUpdateRunStageArgs()
        {
        }
        public static new FleetUpdateRunStageArgs Empty => new FleetUpdateRunStageArgs();
    }
}
