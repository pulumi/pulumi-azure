// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ConfidentialLedger.Outputs
{

    [OutputType]
    public sealed class LedgerCertificateBasedSecurityPrincipal
    {
        /// <summary>
        /// Specifies the Ledger Role to grant this Certificate Security Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
        /// </summary>
        public readonly string LedgerRoleName;
        /// <summary>
        /// The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
        /// </summary>
        public readonly string PemPublicKey;

        [OutputConstructor]
        private LedgerCertificateBasedSecurityPrincipal(
            string ledgerRoleName,

            string pemPublicKey)
        {
            LedgerRoleName = ledgerRoleName;
            PemPublicKey = pemPublicKey;
        }
    }
}