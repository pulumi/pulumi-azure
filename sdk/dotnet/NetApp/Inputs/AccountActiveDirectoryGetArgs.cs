// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp.Inputs
{

    public sealed class AccountActiveDirectoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If enabled, AES encryption will be enabled for SMB communication. Defaults to `false`.
        /// </summary>
        [Input("aesEncryptionEnabled")]
        public Input<bool>? AesEncryptionEnabled { get; set; }

        [Input("dnsServers", required: true)]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// A list of DNS server IP addresses for the Active Directory domain. Only allows `IPv4` address.
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        /// <summary>
        /// The name of the Active Directory domain.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// Name of the active directory machine.
        /// </summary>
        [Input("kerberosAdName")]
        public Input<string>? KerberosAdName { get; set; }

        /// <summary>
        /// kdc server IP addresses for the active directory machine.
        /// 
        /// &gt; **Note:** If you plan on using **Kerberos** volumes, both `ad_name` and `kdc_ip` are required in order to create the volume.
        /// </summary>
        [Input("kerberosKdcIp")]
        public Input<string>? KerberosKdcIp { get; set; }

        /// <summary>
        /// Specifies whether or not the LDAP traffic needs to be secured via TLS. Defaults to `false`.
        /// </summary>
        [Input("ldapOverTlsEnabled")]
        public Input<bool>? LdapOverTlsEnabled { get; set; }

        /// <summary>
        /// Specifies whether or not the LDAP traffic needs to be signed. Defaults to `false`.
        /// </summary>
        [Input("ldapSigningEnabled")]
        public Input<bool>? LdapSigningEnabled { get; set; }

        /// <summary>
        /// If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes. Defaults to `false`.
        /// </summary>
        [Input("localNfsUsersWithLdapAllowed")]
        public Input<bool>? LocalNfsUsersWithLdapAllowed { get; set; }

        /// <summary>
        /// The Organizational Unit (OU) within Active Directory where machines will be created. If blank, defaults to `CN=Computers`.
        /// </summary>
        [Input("organizationalUnit")]
        public Input<string>? OrganizationalUnit { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password associated with the `username`.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("serverRootCaCertificate")]
        private Input<string>? _serverRootCaCertificate;

        /// <summary>
        /// When LDAP over SSL/TLS is enabled, the LDAP client is required to have a *base64 encoded Active Directory Certificate Service's self-signed root CA certificate*, this optional parameter is used only for dual protocol with LDAP user-mapping volumes. Required if `ldap_over_tls_enabled` is set to `true`.
        /// </summary>
        public Input<string>? ServerRootCaCertificate
        {
            get => _serverRootCaCertificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serverRootCaCertificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Active Directory site the service will limit Domain Controller discovery to. If blank, defaults to `Default-First-Site-Name`.
        /// </summary>
        [Input("siteName")]
        public Input<string>? SiteName { get; set; }

        /// <summary>
        /// The NetBIOS name which should be used for the NetApp SMB Server, which will be registered as a computer account in the AD and used to mount volumes.
        /// </summary>
        [Input("smbServerName", required: true)]
        public Input<string> SmbServerName { get; set; } = null!;

        /// <summary>
        /// The Username of Active Directory Domain Administrator.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public AccountActiveDirectoryGetArgs()
        {
        }
        public static new AccountActiveDirectoryGetArgs Empty => new AccountActiveDirectoryGetArgs();
    }
}
