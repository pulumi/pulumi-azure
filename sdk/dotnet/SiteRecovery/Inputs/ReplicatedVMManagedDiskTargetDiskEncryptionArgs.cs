// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Inputs
{

    public sealed class ReplicatedVMManagedDiskTargetDiskEncryptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `disk_encryption_key` block as defined below.
        /// </summary>
        [Input("diskEncryptionKey", required: true)]
        public Input<Inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs> DiskEncryptionKey { get; set; } = null!;

        /// <summary>
        /// A `key_encryption_key` block as defined below.
        /// </summary>
        [Input("keyEncryptionKey")]
        public Input<Inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs>? KeyEncryptionKey { get; set; }

        public ReplicatedVMManagedDiskTargetDiskEncryptionArgs()
        {
        }
        public static new ReplicatedVMManagedDiskTargetDiskEncryptionArgs Empty => new ReplicatedVMManagedDiskTargetDiskEncryptionArgs();
    }
}