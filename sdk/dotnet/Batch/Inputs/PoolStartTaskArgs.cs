// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolStartTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The command line executed by the start task.
        /// </summary>
        [Input("commandLine", required: true)]
        public Input<string> CommandLine { get; set; } = null!;

        [Input("commonEnvironmentProperties")]
        private InputMap<string>? _commonEnvironmentProperties;

        /// <summary>
        /// A map of strings (key,value) that represents the environment variables to set in the start task.
        /// </summary>
        public InputMap<string> CommonEnvironmentProperties
        {
            get => _commonEnvironmentProperties ?? (_commonEnvironmentProperties = new InputMap<string>());
            set => _commonEnvironmentProperties = value;
        }

        [Input("containers")]
        private InputList<Inputs.PoolStartTaskContainerArgs>? _containers;

        /// <summary>
        /// A `container` block is the settings for the container under which the start task runs as defined below. When this is specified, all directories recursively below the `AZ_BATCH_NODE_ROOT_DIR` (the root of Azure Batch directories on the node) are mapped into the container, all task environment variables are mapped into the container, and the task command line is executed in the container.
        /// </summary>
        public InputList<Inputs.PoolStartTaskContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.PoolStartTaskContainerArgs>());
            set => _containers = value;
        }

        [Input("resourceFiles")]
        private InputList<Inputs.PoolStartTaskResourceFileArgs>? _resourceFiles;

        /// <summary>
        /// One or more `resource_file` blocks that describe the files to be downloaded to a compute node as defined below.
        /// </summary>
        public InputList<Inputs.PoolStartTaskResourceFileArgs> ResourceFiles
        {
            get => _resourceFiles ?? (_resourceFiles = new InputList<Inputs.PoolStartTaskResourceFileArgs>());
            set => _resourceFiles = value;
        }

        /// <summary>
        /// The number of retry count.
        /// </summary>
        [Input("taskRetryMaximum")]
        public Input<int>? TaskRetryMaximum { get; set; }

        /// <summary>
        /// A `user_identity` block that describes the user identity under which the start task runs as defined below.
        /// </summary>
        [Input("userIdentity", required: true)]
        public Input<Inputs.PoolStartTaskUserIdentityArgs> UserIdentity { get; set; } = null!;

        /// <summary>
        /// A flag that indicates if the Batch pool should wait for the start task to be completed. Default to `false`.
        /// </summary>
        [Input("waitForSuccess")]
        public Input<bool>? WaitForSuccess { get; set; }

        public PoolStartTaskArgs()
        {
        }
        public static new PoolStartTaskArgs Empty => new PoolStartTaskArgs();
    }
}
