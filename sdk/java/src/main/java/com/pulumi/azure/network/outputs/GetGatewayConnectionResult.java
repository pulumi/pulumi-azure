// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetGatewayConnectionIpsecPolicy;
import com.pulumi.azure.network.outputs.GetGatewayConnectionTrafficSelectorPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGatewayConnectionResult {
    /**
     * @return The authorization key associated with the
     * Express Route Circuit. This field is present only if the type is an
     * ExpressRoute connection.
     * 
     */
    private String authorizationKey;
    private String connectionProtocol;
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    private Integer dpdTimeoutSeconds;
    private Integer egressBytesTransferred;
    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection.
     * 
     */
    private Boolean enableBgp;
    /**
     * @return The ID of the Express Route Circuit
     * (i.e. when `type` is `ExpressRoute`).
     * 
     */
    private String expressRouteCircuitId;
    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding. This is only valid for ExpressRoute connections.
     * 
     */
    private Boolean expressRouteGatewayBypass;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer ingressBytesTransferred;
    /**
     * @return (Optional) A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    private List<GetGatewayConnectionIpsecPolicy> ipsecPolicies;
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    private Boolean localAzureIpAddressEnabled;
    /**
     * @return The ID of the local network gateway
     * when a Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    private String localNetworkGatewayId;
    /**
     * @return The location/region where the connection is
     * located.
     * 
     */
    private String location;
    private String name;
    /**
     * @return The ID of the peer virtual
     * network gateway when a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`).
     * 
     */
    private String peerVirtualNetworkGatewayId;
    /**
     * @return If `true`, data packets will bypass the Express Route gateway when accessing private-links.
     * This is only valid for ExpressRoute connections, on the conditions described in [the relevant section in the Azure documentation](https://learn.microsoft.com/en-us/azure/expressroute/expressroute-howto-linkvnet-arm#fastpath-virtual-network-peering-user-defined-routes-udrs-and-private-link-support-for-expressroute-direct-connections)
     * 
     */
    private Boolean privateLinkFastPathEnabled;
    private String resourceGroupName;
    private String resourceGuid;
    /**
     * @return The routing weight.
     * 
     */
    private Integer routingWeight;
    /**
     * @return The shared IPSec key.
     * 
     */
    private String sharedKey;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return One or more `traffic_selector_policy` blocks which are documented below.
     * A `traffic_selector_policy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    private List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies;
    /**
     * @return The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * 
     */
    private String type;
    /**
     * @return If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block.
     * 
     */
    private Boolean usePolicyBasedTrafficSelectors;
    /**
     * @return The ID of the Virtual Network Gateway
     * in which the connection is created.
     * 
     */
    private String virtualNetworkGatewayId;

    private GetGatewayConnectionResult() {}
    /**
     * @return The authorization key associated with the
     * Express Route Circuit. This field is present only if the type is an
     * ExpressRoute connection.
     * 
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }
    public String connectionProtocol() {
        return this.connectionProtocol;
    }
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    public Integer dpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }
    public Integer egressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection.
     * 
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }
    /**
     * @return The ID of the Express Route Circuit
     * (i.e. when `type` is `ExpressRoute`).
     * 
     */
    public String expressRouteCircuitId() {
        return this.expressRouteCircuitId;
    }
    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding. This is only valid for ExpressRoute connections.
     * 
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * @return (Optional) A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    public List<GetGatewayConnectionIpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    public Boolean localAzureIpAddressEnabled() {
        return this.localAzureIpAddressEnabled;
    }
    /**
     * @return The ID of the local network gateway
     * when a Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    public String localNetworkGatewayId() {
        return this.localNetworkGatewayId;
    }
    /**
     * @return The location/region where the connection is
     * located.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the peer virtual
     * network gateway when a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`).
     * 
     */
    public String peerVirtualNetworkGatewayId() {
        return this.peerVirtualNetworkGatewayId;
    }
    /**
     * @return If `true`, data packets will bypass the Express Route gateway when accessing private-links.
     * This is only valid for ExpressRoute connections, on the conditions described in [the relevant section in the Azure documentation](https://learn.microsoft.com/en-us/azure/expressroute/expressroute-howto-linkvnet-arm#fastpath-virtual-network-peering-user-defined-routes-udrs-and-private-link-support-for-expressroute-direct-connections)
     * 
     */
    public Boolean privateLinkFastPathEnabled() {
        return this.privateLinkFastPathEnabled;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return The routing weight.
     * 
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }
    /**
     * @return The shared IPSec key.
     * 
     */
    public String sharedKey() {
        return this.sharedKey;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return One or more `traffic_selector_policy` blocks which are documented below.
     * A `traffic_selector_policy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    public List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }
    /**
     * @return The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block.
     * 
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * @return The ID of the Virtual Network Gateway
     * in which the connection is created.
     * 
     */
    public String virtualNetworkGatewayId() {
        return this.virtualNetworkGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizationKey;
        private String connectionProtocol;
        private Integer dpdTimeoutSeconds;
        private Integer egressBytesTransferred;
        private Boolean enableBgp;
        private String expressRouteCircuitId;
        private Boolean expressRouteGatewayBypass;
        private String id;
        private Integer ingressBytesTransferred;
        private List<GetGatewayConnectionIpsecPolicy> ipsecPolicies;
        private Boolean localAzureIpAddressEnabled;
        private String localNetworkGatewayId;
        private String location;
        private String name;
        private String peerVirtualNetworkGatewayId;
        private Boolean privateLinkFastPathEnabled;
        private String resourceGroupName;
        private String resourceGuid;
        private Integer routingWeight;
        private String sharedKey;
        private Map<String,String> tags;
        private List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies;
        private String type;
        private Boolean usePolicyBasedTrafficSelectors;
        private String virtualNetworkGatewayId;
        public Builder() {}
        public Builder(GetGatewayConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionProtocol = defaults.connectionProtocol;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.expressRouteCircuitId = defaults.expressRouteCircuitId;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.localAzureIpAddressEnabled = defaults.localAzureIpAddressEnabled;
    	      this.localNetworkGatewayId = defaults.localNetworkGatewayId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peerVirtualNetworkGatewayId = defaults.peerVirtualNetworkGatewayId;
    	      this.privateLinkFastPathEnabled = defaults.privateLinkFastPathEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.tags = defaults.tags;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.type = defaults.type;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.virtualNetworkGatewayId = defaults.virtualNetworkGatewayId;
        }

        @CustomType.Setter
        public Builder authorizationKey(String authorizationKey) {
            if (authorizationKey == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "authorizationKey");
            }
            this.authorizationKey = authorizationKey;
            return this;
        }
        @CustomType.Setter
        public Builder connectionProtocol(String connectionProtocol) {
            if (connectionProtocol == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "connectionProtocol");
            }
            this.connectionProtocol = connectionProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder dpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
            if (dpdTimeoutSeconds == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "dpdTimeoutSeconds");
            }
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder egressBytesTransferred(Integer egressBytesTransferred) {
            if (egressBytesTransferred == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "egressBytesTransferred");
            }
            this.egressBytesTransferred = egressBytesTransferred;
            return this;
        }
        @CustomType.Setter
        public Builder enableBgp(Boolean enableBgp) {
            if (enableBgp == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "enableBgp");
            }
            this.enableBgp = enableBgp;
            return this;
        }
        @CustomType.Setter
        public Builder expressRouteCircuitId(String expressRouteCircuitId) {
            if (expressRouteCircuitId == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "expressRouteCircuitId");
            }
            this.expressRouteCircuitId = expressRouteCircuitId;
            return this;
        }
        @CustomType.Setter
        public Builder expressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
            if (expressRouteGatewayBypass == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "expressRouteGatewayBypass");
            }
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ingressBytesTransferred(Integer ingressBytesTransferred) {
            if (ingressBytesTransferred == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "ingressBytesTransferred");
            }
            this.ingressBytesTransferred = ingressBytesTransferred;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecPolicies(List<GetGatewayConnectionIpsecPolicy> ipsecPolicies) {
            if (ipsecPolicies == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "ipsecPolicies");
            }
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }
        public Builder ipsecPolicies(GetGatewayConnectionIpsecPolicy... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }
        @CustomType.Setter
        public Builder localAzureIpAddressEnabled(Boolean localAzureIpAddressEnabled) {
            if (localAzureIpAddressEnabled == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "localAzureIpAddressEnabled");
            }
            this.localAzureIpAddressEnabled = localAzureIpAddressEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder localNetworkGatewayId(String localNetworkGatewayId) {
            if (localNetworkGatewayId == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "localNetworkGatewayId");
            }
            this.localNetworkGatewayId = localNetworkGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder peerVirtualNetworkGatewayId(String peerVirtualNetworkGatewayId) {
            if (peerVirtualNetworkGatewayId == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "peerVirtualNetworkGatewayId");
            }
            this.peerVirtualNetworkGatewayId = peerVirtualNetworkGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkFastPathEnabled(Boolean privateLinkFastPathEnabled) {
            if (privateLinkFastPathEnabled == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "privateLinkFastPathEnabled");
            }
            this.privateLinkFastPathEnabled = privateLinkFastPathEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGuid(String resourceGuid) {
            if (resourceGuid == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "resourceGuid");
            }
            this.resourceGuid = resourceGuid;
            return this;
        }
        @CustomType.Setter
        public Builder routingWeight(Integer routingWeight) {
            if (routingWeight == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "routingWeight");
            }
            this.routingWeight = routingWeight;
            return this;
        }
        @CustomType.Setter
        public Builder sharedKey(String sharedKey) {
            if (sharedKey == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "sharedKey");
            }
            this.sharedKey = sharedKey;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder trafficSelectorPolicies(List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies) {
            if (trafficSelectorPolicies == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "trafficSelectorPolicies");
            }
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }
        public Builder trafficSelectorPolicies(GetGatewayConnectionTrafficSelectorPolicy... trafficSelectorPolicies) {
            return trafficSelectorPolicies(List.of(trafficSelectorPolicies));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder usePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
            if (usePolicyBasedTrafficSelectors == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "usePolicyBasedTrafficSelectors");
            }
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkGatewayId(String virtualNetworkGatewayId) {
            if (virtualNetworkGatewayId == null) {
              throw new MissingRequiredPropertyException("GetGatewayConnectionResult", "virtualNetworkGatewayId");
            }
            this.virtualNetworkGatewayId = virtualNetworkGatewayId;
            return this;
        }
        public GetGatewayConnectionResult build() {
            final var _resultValue = new GetGatewayConnectionResult();
            _resultValue.authorizationKey = authorizationKey;
            _resultValue.connectionProtocol = connectionProtocol;
            _resultValue.dpdTimeoutSeconds = dpdTimeoutSeconds;
            _resultValue.egressBytesTransferred = egressBytesTransferred;
            _resultValue.enableBgp = enableBgp;
            _resultValue.expressRouteCircuitId = expressRouteCircuitId;
            _resultValue.expressRouteGatewayBypass = expressRouteGatewayBypass;
            _resultValue.id = id;
            _resultValue.ingressBytesTransferred = ingressBytesTransferred;
            _resultValue.ipsecPolicies = ipsecPolicies;
            _resultValue.localAzureIpAddressEnabled = localAzureIpAddressEnabled;
            _resultValue.localNetworkGatewayId = localNetworkGatewayId;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.peerVirtualNetworkGatewayId = peerVirtualNetworkGatewayId;
            _resultValue.privateLinkFastPathEnabled = privateLinkFastPathEnabled;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.resourceGuid = resourceGuid;
            _resultValue.routingWeight = routingWeight;
            _resultValue.sharedKey = sharedKey;
            _resultValue.tags = tags;
            _resultValue.trafficSelectorPolicies = trafficSelectorPolicies;
            _resultValue.type = type;
            _resultValue.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            _resultValue.virtualNetworkGatewayId = virtualNetworkGatewayId;
            return _resultValue;
        }
    }
}
