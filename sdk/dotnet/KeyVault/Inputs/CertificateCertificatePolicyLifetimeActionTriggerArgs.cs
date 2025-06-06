// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Inputs
{

    public sealed class CertificateCertificatePolicyLifetimeActionTriggerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days before the Certificate expires that the action associated with this Trigger should run. Conflicts with `lifetime_percentage`.
        /// </summary>
        [Input("daysBeforeExpiry")]
        public Input<int>? DaysBeforeExpiry { get; set; }

        /// <summary>
        /// The percentage at which during the Certificates Lifetime the action associated with this Trigger should run. Conflicts with `days_before_expiry`.
        /// </summary>
        [Input("lifetimePercentage")]
        public Input<int>? LifetimePercentage { get; set; }

        public CertificateCertificatePolicyLifetimeActionTriggerArgs()
        {
        }
        public static new CertificateCertificatePolicyLifetimeActionTriggerArgs Empty => new CertificateCertificatePolicyLifetimeActionTriggerArgs();
    }
}
