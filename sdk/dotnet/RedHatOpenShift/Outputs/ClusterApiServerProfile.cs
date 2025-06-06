// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.RedHatOpenShift.Outputs
{

    [OutputType]
    public sealed class ClusterApiServerProfile
    {
        /// <summary>
        /// The IP Address the Ingress Profile is associated with.
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// The URL the API Server Profile is associated with.
        /// </summary>
        public readonly string? Url;
        /// <summary>
        /// Cluster API server visibility. Supported values are `Public` and `Private`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Visibility;

        [OutputConstructor]
        private ClusterApiServerProfile(
            string? ipAddress,

            string? url,

            string visibility)
        {
            IpAddress = ipAddress;
            Url = url;
            Visibility = visibility;
        }
    }
}
