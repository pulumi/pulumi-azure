// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetFirewallIpConfiguration;
import com.pulumi.azure.network.outputs.GetFirewallManagementIpConfiguration;
import com.pulumi.azure.network.outputs.GetFirewallVirtualHub;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFirewallResult {
    /**
     * @return Whether DNS proxy is enabled. It will forward DNS requests to the DNS servers when it is `true`.
     * 
     */
    private Boolean dnsProxyEnabled;
    /**
     * @return The list of DNS servers that the Azure Firewall will direct DNS traffic to for name resolution.
     * 
     */
    private List<String> dnsServers;
    /**
     * @return The ID of the Firewall Policy applied to the Azure Firewall.
     * 
     */
    private String firewallPolicyId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `ip_configuration` block as defined below.
     * 
     */
    private List<GetFirewallIpConfiguration> ipConfigurations;
    /**
     * @return The Azure location where the Azure Firewall exists.
     * 
     */
    private String location;
    /**
     * @return A `management_ip_configuration` block as defined below, which allows force-tunnelling of traffic to be performed by the firewall.
     * 
     */
    private List<GetFirewallManagementIpConfiguration> managementIpConfigurations;
    private String name;
    private String resourceGroupName;
    /**
     * @return The SKU name of the Azure Firewall.
     * 
     */
    private String skuName;
    /**
     * @return The SKU tier of the Azure Firewall.
     * 
     */
    private String skuTier;
    /**
     * @return A mapping of tags assigned to the Azure Firewall.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The operation mode for threat intelligence-based filtering.
     * 
     */
    private String threatIntelMode;
    /**
     * @return A `virtual_hub` block as defined below.
     * 
     */
    private List<GetFirewallVirtualHub> virtualHubs;
    /**
     * @return A list of Availability Zones in which this Azure Firewall is located.
     * 
     */
    private List<String> zones;

    private GetFirewallResult() {}
    /**
     * @return Whether DNS proxy is enabled. It will forward DNS requests to the DNS servers when it is `true`.
     * 
     */
    public Boolean dnsProxyEnabled() {
        return this.dnsProxyEnabled;
    }
    /**
     * @return The list of DNS servers that the Azure Firewall will direct DNS traffic to for name resolution.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }
    /**
     * @return The ID of the Firewall Policy applied to the Azure Firewall.
     * 
     */
    public String firewallPolicyId() {
        return this.firewallPolicyId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `ip_configuration` block as defined below.
     * 
     */
    public List<GetFirewallIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return The Azure location where the Azure Firewall exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A `management_ip_configuration` block as defined below, which allows force-tunnelling of traffic to be performed by the firewall.
     * 
     */
    public List<GetFirewallManagementIpConfiguration> managementIpConfigurations() {
        return this.managementIpConfigurations;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU name of the Azure Firewall.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return The SKU tier of the Azure Firewall.
     * 
     */
    public String skuTier() {
        return this.skuTier;
    }
    /**
     * @return A mapping of tags assigned to the Azure Firewall.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The operation mode for threat intelligence-based filtering.
     * 
     */
    public String threatIntelMode() {
        return this.threatIntelMode;
    }
    /**
     * @return A `virtual_hub` block as defined below.
     * 
     */
    public List<GetFirewallVirtualHub> virtualHubs() {
        return this.virtualHubs;
    }
    /**
     * @return A list of Availability Zones in which this Azure Firewall is located.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean dnsProxyEnabled;
        private List<String> dnsServers;
        private String firewallPolicyId;
        private String id;
        private List<GetFirewallIpConfiguration> ipConfigurations;
        private String location;
        private List<GetFirewallManagementIpConfiguration> managementIpConfigurations;
        private String name;
        private String resourceGroupName;
        private String skuName;
        private String skuTier;
        private Map<String,String> tags;
        private String threatIntelMode;
        private List<GetFirewallVirtualHub> virtualHubs;
        private List<String> zones;
        public Builder() {}
        public Builder(GetFirewallResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsProxyEnabled = defaults.dnsProxyEnabled;
    	      this.dnsServers = defaults.dnsServers;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.managementIpConfigurations = defaults.managementIpConfigurations;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.skuTier = defaults.skuTier;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.virtualHubs = defaults.virtualHubs;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder dnsProxyEnabled(Boolean dnsProxyEnabled) {
            if (dnsProxyEnabled == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "dnsProxyEnabled");
            }
            this.dnsProxyEnabled = dnsProxyEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dnsServers(List<String> dnsServers) {
            if (dnsServers == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "dnsServers");
            }
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        @CustomType.Setter
        public Builder firewallPolicyId(String firewallPolicyId) {
            if (firewallPolicyId == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "firewallPolicyId");
            }
            this.firewallPolicyId = firewallPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurations(List<GetFirewallIpConfiguration> ipConfigurations) {
            if (ipConfigurations == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "ipConfigurations");
            }
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(GetFirewallIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder managementIpConfigurations(List<GetFirewallManagementIpConfiguration> managementIpConfigurations) {
            if (managementIpConfigurations == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "managementIpConfigurations");
            }
            this.managementIpConfigurations = managementIpConfigurations;
            return this;
        }
        public Builder managementIpConfigurations(GetFirewallManagementIpConfiguration... managementIpConfigurations) {
            return managementIpConfigurations(List.of(managementIpConfigurations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder skuName(String skuName) {
            if (skuName == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "skuName");
            }
            this.skuName = skuName;
            return this;
        }
        @CustomType.Setter
        public Builder skuTier(String skuTier) {
            if (skuTier == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "skuTier");
            }
            this.skuTier = skuTier;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder threatIntelMode(String threatIntelMode) {
            if (threatIntelMode == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "threatIntelMode");
            }
            this.threatIntelMode = threatIntelMode;
            return this;
        }
        @CustomType.Setter
        public Builder virtualHubs(List<GetFirewallVirtualHub> virtualHubs) {
            if (virtualHubs == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "virtualHubs");
            }
            this.virtualHubs = virtualHubs;
            return this;
        }
        public Builder virtualHubs(GetFirewallVirtualHub... virtualHubs) {
            return virtualHubs(List.of(virtualHubs));
        }
        @CustomType.Setter
        public Builder zones(List<String> zones) {
            if (zones == null) {
              throw new MissingRequiredPropertyException("GetFirewallResult", "zones");
            }
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public GetFirewallResult build() {
            final var _resultValue = new GetFirewallResult();
            _resultValue.dnsProxyEnabled = dnsProxyEnabled;
            _resultValue.dnsServers = dnsServers;
            _resultValue.firewallPolicyId = firewallPolicyId;
            _resultValue.id = id;
            _resultValue.ipConfigurations = ipConfigurations;
            _resultValue.location = location;
            _resultValue.managementIpConfigurations = managementIpConfigurations;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.skuName = skuName;
            _resultValue.skuTier = skuTier;
            _resultValue.tags = tags;
            _resultValue.threatIntelMode = threatIntelMode;
            _resultValue.virtualHubs = virtualHubs;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
