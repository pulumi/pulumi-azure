// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInterfaceIpConfiguration {
    /**
     * @return The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
     * 
     */
    private @Nullable String gatewayLoadBalancerFrontendIpConfigurationId;
    /**
     * @return A name used for this IP Configuration.
     * 
     */
    private String name;
    /**
     * @return Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
     * 
     */
    private @Nullable Boolean primary;
    /**
     * @return The Static IP Address which should be used.
     * 
     */
    private @Nullable String privateIpAddress;
    /**
     * @return The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    private String privateIpAddressAllocation;
    /**
     * @return The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
     * 
     */
    private @Nullable String privateIpAddressVersion;
    /**
     * @return Reference to a Public IP Address to associate with this NIC
     * 
     */
    private @Nullable String publicIpAddressId;
    /**
     * @return The ID of the Subnet where this Network Interface should be located in.
     * 
     */
    private @Nullable String subnetId;

    private NetworkInterfaceIpConfiguration() {}
    /**
     * @return The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
     * 
     */
    public Optional<String> gatewayLoadBalancerFrontendIpConfigurationId() {
        return Optional.ofNullable(this.gatewayLoadBalancerFrontendIpConfigurationId);
    }
    /**
     * @return A name used for this IP Configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return The Static IP Address which should be used.
     * 
     */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * @return The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     */
    public String privateIpAddressAllocation() {
        return this.privateIpAddressAllocation;
    }
    /**
     * @return The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
     * 
     */
    public Optional<String> privateIpAddressVersion() {
        return Optional.ofNullable(this.privateIpAddressVersion);
    }
    /**
     * @return Reference to a Public IP Address to associate with this NIC
     * 
     */
    public Optional<String> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }
    /**
     * @return The ID of the Subnet where this Network Interface should be located in.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gatewayLoadBalancerFrontendIpConfigurationId;
        private String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIpAddress;
        private String privateIpAddressAllocation;
        private @Nullable String privateIpAddressVersion;
        private @Nullable String publicIpAddressId;
        private @Nullable String subnetId;
        public Builder() {}
        public Builder(NetworkInterfaceIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayLoadBalancerFrontendIpConfigurationId = defaults.gatewayLoadBalancerFrontendIpConfigurationId;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddressAllocation = defaults.privateIpAddressAllocation;
    	      this.privateIpAddressVersion = defaults.privateIpAddressVersion;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder gatewayLoadBalancerFrontendIpConfigurationId(@Nullable String gatewayLoadBalancerFrontendIpConfigurationId) {
            this.gatewayLoadBalancerFrontendIpConfigurationId = gatewayLoadBalancerFrontendIpConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            this.privateIpAddressAllocation = Objects.requireNonNull(privateIpAddressAllocation);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressVersion(@Nullable String privateIpAddressVersion) {
            this.privateIpAddressVersion = privateIpAddressVersion;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddressId(@Nullable String publicIpAddressId) {
            this.publicIpAddressId = publicIpAddressId;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public NetworkInterfaceIpConfiguration build() {
            final var o = new NetworkInterfaceIpConfiguration();
            o.gatewayLoadBalancerFrontendIpConfigurationId = gatewayLoadBalancerFrontendIpConfigurationId;
            o.name = name;
            o.primary = primary;
            o.privateIpAddress = privateIpAddress;
            o.privateIpAddressAllocation = privateIpAddressAllocation;
            o.privateIpAddressVersion = privateIpAddressVersion;
            o.publicIpAddressId = publicIpAddressId;
            o.subnetId = subnetId;
            return o;
        }
    }
}