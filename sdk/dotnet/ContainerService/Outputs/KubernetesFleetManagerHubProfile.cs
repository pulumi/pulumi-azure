// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesFleetManagerHubProfile
    {
        public readonly string DnsPrefix;
        public readonly string? Fqdn;
        public readonly string? KubernetesVersion;

        [OutputConstructor]
        private KubernetesFleetManagerHubProfile(
            string dnsPrefix,

            string? fqdn,

            string? kubernetesVersion)
        {
            DnsPrefix = dnsPrefix;
            Fqdn = fqdn;
            KubernetesVersion = kubernetesVersion;
        }
    }
}
