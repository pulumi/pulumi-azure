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
    public sealed class NetworkManagerAdminRuleSource
    {
        /// <summary>
        /// Specifies the address prefix.
        /// </summary>
        public readonly string AddressPrefix;
        /// <summary>
        /// Specifies the address prefix type. Possible values are `IPPrefix` and `ServiceTag`. For more information, please see [this document](https://learn.microsoft.com/en-us/azure/virtual-network-manager/concept-security-admins#source-and-destination-types).
        /// </summary>
        public readonly string AddressPrefixType;

        [OutputConstructor]
        private NetworkManagerAdminRuleSource(
            string addressPrefix,

            string addressPrefixType)
        {
            AddressPrefix = addressPrefix;
            AddressPrefixType = addressPrefixType;
        }
    }
}
