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
    public sealed class VirtualNetworkGatewayVpnClientConfiguration
    {
        /// <summary>
        /// The client id of the Azure VPN application.
        /// See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
        /// </summary>
        public readonly string? AadAudience;
        /// <summary>
        /// The STS url for your tenant
        /// </summary>
        public readonly string? AadIssuer;
        /// <summary>
        /// AzureAD Tenant URL
        /// </summary>
        public readonly string? AadTenant;
        /// <summary>
        /// The address space out of which IP addresses for vpn clients will be taken. You can provide more than one address space, e.g. in CIDR notation.
        /// </summary>
        public readonly ImmutableArray<string> AddressSpaces;
        /// <summary>
        /// An `ipsec_policy` block as defined below.
        /// </summary>
        public readonly Outputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicy? IpsecPolicy;
        /// <summary>
        /// The address of the Radius server.
        /// </summary>
        public readonly string? RadiusServerAddress;
        /// <summary>
        /// The secret used by the Radius server.
        /// </summary>
        public readonly string? RadiusServerSecret;
        /// <summary>
        /// One or more `radius_server` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServer> RadiusServers;
        /// <summary>
        /// One or more `revoked_certificate` blocks which are defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> RevokedCertificates;
        /// <summary>
        /// One or more `root_certificate` blocks which are defined below. These root certificates are used to sign the client certificate used by the VPN clients to connect to the gateway.
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificate> RootCertificates;
        /// <summary>
        /// One or more `virtual_network_gateway_client_connection` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnection> VirtualNetworkGatewayClientConnections;
        /// <summary>
        /// List of the vpn authentication types for the virtual network gateway.
        /// The supported values are `AAD`, `Radius` and `Certificate`.
        /// 
        /// &gt; **Note:** `vpn_auth_types` must be set when using multiple vpn authentication types.
        /// </summary>
        public readonly ImmutableArray<string> VpnAuthTypes;
        /// <summary>
        /// List of the protocols supported by the vpn client.
        /// The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
        /// Values `SSTP` and `IkeV2` are incompatible with the use of
        /// `aad_tenant`, `aad_audience` and `aad_issuer`.
        /// </summary>
        public readonly ImmutableArray<string> VpnClientProtocols;

        [OutputConstructor]
        private VirtualNetworkGatewayVpnClientConfiguration(
            string? aadAudience,

            string? aadIssuer,

            string? aadTenant,

            ImmutableArray<string> addressSpaces,

            Outputs.VirtualNetworkGatewayVpnClientConfigurationIpsecPolicy? ipsecPolicy,

            string? radiusServerAddress,

            string? radiusServerSecret,

            ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRadiusServer> radiusServers,

            ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates,

            ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates,

            ImmutableArray<Outputs.VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnection> virtualNetworkGatewayClientConnections,

            ImmutableArray<string> vpnAuthTypes,

            ImmutableArray<string> vpnClientProtocols)
        {
            AadAudience = aadAudience;
            AadIssuer = aadIssuer;
            AadTenant = aadTenant;
            AddressSpaces = addressSpaces;
            IpsecPolicy = ipsecPolicy;
            RadiusServerAddress = radiusServerAddress;
            RadiusServerSecret = radiusServerSecret;
            RadiusServers = radiusServers;
            RevokedCertificates = revokedCertificates;
            RootCertificates = rootCertificates;
            VirtualNetworkGatewayClientConnections = virtualNetworkGatewayClientConnections;
            VpnAuthTypes = vpnAuthTypes;
            VpnClientProtocols = vpnClientProtocols;
        }
    }
}
