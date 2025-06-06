// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DomainServices.Inputs
{

    public sealed class ServiceSecurityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable Kerberos Armoring. Defaults to `false`.
        /// </summary>
        [Input("kerberosArmoringEnabled")]
        public Input<bool>? KerberosArmoringEnabled { get; set; }

        /// <summary>
        /// Whether to enable Kerberos RC4 Encryption. Defaults to `false`.
        /// </summary>
        [Input("kerberosRc4EncryptionEnabled")]
        public Input<bool>? KerberosRc4EncryptionEnabled { get; set; }

        /// <summary>
        /// Whether to enable legacy NTLM v1 support. Defaults to `false`.
        /// </summary>
        [Input("ntlmV1Enabled")]
        public Input<bool>? NtlmV1Enabled { get; set; }

        /// <summary>
        /// Whether to synchronize Kerberos password hashes to the managed domain. Defaults to `false`.
        /// </summary>
        [Input("syncKerberosPasswords")]
        public Input<bool>? SyncKerberosPasswords { get; set; }

        /// <summary>
        /// Whether to synchronize NTLM password hashes to the managed domain. Defaults to `false`.
        /// </summary>
        [Input("syncNtlmPasswords")]
        public Input<bool>? SyncNtlmPasswords { get; set; }

        /// <summary>
        /// Whether to synchronize on-premises password hashes to the managed domain. Defaults to `false`.
        /// </summary>
        [Input("syncOnPremPasswords")]
        public Input<bool>? SyncOnPremPasswords { get; set; }

        /// <summary>
        /// Whether to enable legacy TLS v1 support. Defaults to `false`.
        /// </summary>
        [Input("tlsV1Enabled")]
        public Input<bool>? TlsV1Enabled { get; set; }

        public ServiceSecurityArgs()
        {
        }
        public static new ServiceSecurityArgs Empty => new ServiceSecurityArgs();
    }
}
