// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallVirtualHub {
    /**
     * @return The private IP address associated with the Azure Firewall.
     * 
     */
    private String privateIpAddress;
    /**
     * @return The list of public IP addresses associated with the Azure Firewall.
     * 
     */
    private List<String> publicIpAddresses;
    /**
     * @return The number of public IPs assigned to the Azure Firewall.
     * 
     */
    private Integer publicIpCount;
    /**
     * @return The ID of the Virtual Hub where the Azure Firewall resides in.
     * 
     */
    private String virtualHubId;

    private GetFirewallVirtualHub() {}
    /**
     * @return The private IP address associated with the Azure Firewall.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The list of public IP addresses associated with the Azure Firewall.
     * 
     */
    public List<String> publicIpAddresses() {
        return this.publicIpAddresses;
    }
    /**
     * @return The number of public IPs assigned to the Azure Firewall.
     * 
     */
    public Integer publicIpCount() {
        return this.publicIpCount;
    }
    /**
     * @return The ID of the Virtual Hub where the Azure Firewall resides in.
     * 
     */
    public String virtualHubId() {
        return this.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallVirtualHub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateIpAddress;
        private List<String> publicIpAddresses;
        private Integer publicIpCount;
        private String virtualHubId;
        public Builder() {}
        public Builder(GetFirewallVirtualHub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publicIpCount = defaults.publicIpCount;
    	      this.virtualHubId = defaults.virtualHubId;
        }

        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddresses(List<String> publicIpAddresses) {
            this.publicIpAddresses = Objects.requireNonNull(publicIpAddresses);
            return this;
        }
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }
        @CustomType.Setter
        public Builder publicIpCount(Integer publicIpCount) {
            this.publicIpCount = Objects.requireNonNull(publicIpCount);
            return this;
        }
        @CustomType.Setter
        public Builder virtualHubId(String virtualHubId) {
            this.virtualHubId = Objects.requireNonNull(virtualHubId);
            return this;
        }
        public GetFirewallVirtualHub build() {
            final var o = new GetFirewallVirtualHub();
            o.privateIpAddress = privateIpAddress;
            o.publicIpAddresses = publicIpAddresses;
            o.publicIpCount = publicIpCount;
            o.virtualHubId = virtualHubId;
            return o;
        }
    }
}