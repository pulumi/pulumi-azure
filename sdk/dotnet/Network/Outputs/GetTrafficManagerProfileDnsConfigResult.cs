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
    public sealed class GetTrafficManagerProfileDnsConfigResult
    {
        /// <summary>
        /// The relative domain name, this is combined with the domain name used by Traffic Manager to form the FQDN which is exported as documented below.
        /// </summary>
        public readonly string RelativeName;
        /// <summary>
        /// The TTL value of the Profile used by Local DNS resolvers and clients.
        /// </summary>
        public readonly int Ttl;

        [OutputConstructor]
        private GetTrafficManagerProfileDnsConfigResult(
            string relativeName,

            int ttl)
        {
            RelativeName = relativeName;
            Ttl = ttl;
        }
    }
}
