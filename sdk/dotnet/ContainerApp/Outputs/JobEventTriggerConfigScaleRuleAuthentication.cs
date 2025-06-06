// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class JobEventTriggerConfigScaleRuleAuthentication
    {
        /// <summary>
        /// Name of the secret from which to pull the auth params.
        /// </summary>
        public readonly string SecretName;
        /// <summary>
        /// Trigger Parameter that uses the secret.
        /// </summary>
        public readonly string TriggerParameter;

        [OutputConstructor]
        private JobEventTriggerConfigScaleRuleAuthentication(
            string secretName,

            string triggerParameter)
        {
            SecretName = secretName;
            TriggerParameter = triggerParameter;
        }
    }
}
