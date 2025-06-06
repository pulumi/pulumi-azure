// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Voice.Outputs
{

    [OutputType]
    public sealed class ServicesCommunicationsGatewayServiceLocation
    {
        /// <summary>
        /// Specifies the allowed source IP address or CIDR ranges for media.
        /// </summary>
        public readonly ImmutableArray<string> AllowedMediaSourceAddressPrefixes;
        /// <summary>
        /// Specifies the allowed source IP address or CIDR ranges for signaling.
        /// </summary>
        public readonly ImmutableArray<string> AllowedSignalingSourceAddressPrefixes;
        /// <summary>
        /// IP address to use to contact the ESRP from this region.
        /// 
        /// !&gt; **Note:** The `esrp_addresses` must be specified for each `service_location` when the`e911_type` is set to `DirectToEsrp`.  The `esrp_addresses` must not be specified for each `service_location` when the`e911_type` is set to `Standard`.
        /// </summary>
        public readonly ImmutableArray<string> EsrpAddresses;
        /// <summary>
        /// Specifies the region in which the resources needed for Teams Calling will be deployed.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// IP address to use to contact the operator network from this region.
        /// </summary>
        public readonly ImmutableArray<string> OperatorAddresses;

        [OutputConstructor]
        private ServicesCommunicationsGatewayServiceLocation(
            ImmutableArray<string> allowedMediaSourceAddressPrefixes,

            ImmutableArray<string> allowedSignalingSourceAddressPrefixes,

            ImmutableArray<string> esrpAddresses,

            string location,

            ImmutableArray<string> operatorAddresses)
        {
            AllowedMediaSourceAddressPrefixes = allowedMediaSourceAddressPrefixes;
            AllowedSignalingSourceAddressPrefixes = allowedSignalingSourceAddressPrefixes;
            EsrpAddresses = esrpAddresses;
            Location = location;
            OperatorAddresses = operatorAddresses;
        }
    }
}
