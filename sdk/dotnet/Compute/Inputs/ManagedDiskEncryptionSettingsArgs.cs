// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class ManagedDiskEncryptionSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `disk_encryption_key` block as defined above.
        /// </summary>
        [Input("diskEncryptionKey")]
        public Input<Inputs.ManagedDiskEncryptionSettingsDiskEncryptionKeyArgs>? DiskEncryptionKey { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// A `key_encryption_key` block as defined below.
        /// </summary>
        [Input("keyEncryptionKey")]
        public Input<Inputs.ManagedDiskEncryptionSettingsKeyEncryptionKeyArgs>? KeyEncryptionKey { get; set; }

        public ManagedDiskEncryptionSettingsArgs()
        {
        }
        public static new ManagedDiskEncryptionSettingsArgs Empty => new ManagedDiskEncryptionSettingsArgs();
    }
}
