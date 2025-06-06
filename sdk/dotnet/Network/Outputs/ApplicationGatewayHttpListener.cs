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
    public sealed class ApplicationGatewayHttpListener
    {
        /// <summary>
        /// One or more `custom_error_configuration` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApplicationGatewayHttpListenerCustomErrorConfiguration> CustomErrorConfigurations;
        /// <summary>
        /// The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
        /// </summary>
        public readonly string? FirewallPolicyId;
        /// <summary>
        /// The ID of the associated Frontend Configuration.
        /// </summary>
        public readonly string? FrontendIpConfigurationId;
        /// <summary>
        /// The Name of the Frontend IP Configuration used for this HTTP Listener.
        /// </summary>
        public readonly string FrontendIpConfigurationName;
        /// <summary>
        /// The ID of the associated Frontend Port.
        /// </summary>
        public readonly string? FrontendPortId;
        /// <summary>
        /// The Name of the Frontend Port use for this HTTP Listener.
        /// </summary>
        public readonly string FrontendPortName;
        /// <summary>
        /// The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to 'Multi site'.
        /// </summary>
        public readonly string? HostName;
        /// <summary>
        /// A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
        /// 
        /// &gt; **Note:** The `host_names` and `host_name` are mutually exclusive and cannot both be set.
        /// </summary>
        public readonly ImmutableArray<string> HostNames;
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The Name of the HTTP Listener.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Should Server Name Indication be Required? Defaults to `false`.
        /// </summary>
        public readonly bool? RequireSni;
        /// <summary>
        /// The ID of the associated SSL Certificate.
        /// </summary>
        public readonly string? SslCertificateId;
        /// <summary>
        /// The name of the associated SSL Certificate which should be used for this HTTP Listener.
        /// </summary>
        public readonly string? SslCertificateName;
        /// <summary>
        /// The ID of the associated SSL Profile.
        /// </summary>
        public readonly string? SslProfileId;
        /// <summary>
        /// The name of the associated SSL Profile which should be used for this HTTP Listener.
        /// </summary>
        public readonly string? SslProfileName;

        [OutputConstructor]
        private ApplicationGatewayHttpListener(
            ImmutableArray<Outputs.ApplicationGatewayHttpListenerCustomErrorConfiguration> customErrorConfigurations,

            string? firewallPolicyId,

            string? frontendIpConfigurationId,

            string frontendIpConfigurationName,

            string? frontendPortId,

            string frontendPortName,

            string? hostName,

            ImmutableArray<string> hostNames,

            string? id,

            string name,

            string protocol,

            bool? requireSni,

            string? sslCertificateId,

            string? sslCertificateName,

            string? sslProfileId,

            string? sslProfileName)
        {
            CustomErrorConfigurations = customErrorConfigurations;
            FirewallPolicyId = firewallPolicyId;
            FrontendIpConfigurationId = frontendIpConfigurationId;
            FrontendIpConfigurationName = frontendIpConfigurationName;
            FrontendPortId = frontendPortId;
            FrontendPortName = frontendPortName;
            HostName = hostName;
            HostNames = hostNames;
            Id = id;
            Name = name;
            Protocol = protocol;
            RequireSni = requireSni;
            SslCertificateId = sslCertificateId;
            SslCertificateName = sslCertificateName;
            SslProfileId = sslProfileId;
            SslProfileName = sslProfileName;
        }
    }
}
