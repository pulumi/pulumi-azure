// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class GetKubernetesClusterAddonProfileAzureKeyvaultSecretsProviderResult
    {
        /// <summary>
        /// Is Role Based Access Control enabled?
        /// </summary>
        public readonly bool Enabled;
        public readonly ImmutableArray<Outputs.GetKubernetesClusterAddonProfileAzureKeyvaultSecretsProviderSecretIdentityResult> SecretIdentities;
        /// <summary>
        /// Is secret rotation enabled?
        /// </summary>
        public readonly string SecretRotationEnabled;
        /// <summary>
        /// The interval to poll for secret rotation.
        /// </summary>
        public readonly string SecretRotationInterval;

        [OutputConstructor]
        private GetKubernetesClusterAddonProfileAzureKeyvaultSecretsProviderResult(
            bool enabled,

            ImmutableArray<Outputs.GetKubernetesClusterAddonProfileAzureKeyvaultSecretsProviderSecretIdentityResult> secretIdentities,

            string secretRotationEnabled,

            string secretRotationInterval)
        {
            Enabled = enabled;
            SecretIdentities = secretIdentities;
            SecretRotationEnabled = secretRotationEnabled;
            SecretRotationInterval = secretRotationInterval;
        }
    }
}