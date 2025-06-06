// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolMountNfsMountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional command line options to pass to the mount command. These are 'net use' options in Windows and 'mount' options in Linux.
        /// </summary>
        [Input("mountOptions")]
        public Input<string>? MountOptions { get; set; }

        /// <summary>
        /// The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
        /// </summary>
        [Input("relativeMountPath", required: true)]
        public Input<string> RelativeMountPath { get; set; } = null!;

        /// <summary>
        /// The URI of the file system to mount.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public PoolMountNfsMountArgs()
        {
        }
        public static new PoolMountNfsMountArgs Empty => new PoolMountNfsMountArgs();
    }
}
