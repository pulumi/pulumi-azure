// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class GetSpringCloudAppPersistentDiskResult
    {
        /// <summary>
        /// The mount path of the persistent disk.
        /// </summary>
        public readonly string MountPath;
        /// <summary>
        /// The size of the persistent disk in GB.
        /// </summary>
        public readonly int SizeInGb;

        [OutputConstructor]
        private GetSpringCloudAppPersistentDiskResult(
            string mountPath,

            int sizeInGb)
        {
            MountPath = mountPath;
            SizeInGb = sizeInGb;
        }
    }
}
