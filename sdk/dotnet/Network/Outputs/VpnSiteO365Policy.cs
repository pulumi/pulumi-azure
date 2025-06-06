// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class VpnSiteO365Policy
    {
        /// <summary>
        /// A `traffic_category` block as defined above.
        /// </summary>
        public readonly Outputs.VpnSiteO365PolicyTrafficCategory? TrafficCategory;

        [OutputConstructor]
        private VpnSiteO365Policy(Outputs.VpnSiteO365PolicyTrafficCategory? trafficCategory)
        {
            TrafficCategory = trafficCategory;
        }
    }
}
