// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerFrontendIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerFrontendIpConfigurationArgs Empty = new LoadBalancerFrontendIpConfigurationArgs();

    /**
     * The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
     * 
     */
    @Import(name="gatewayLoadBalancerFrontendIpConfigurationId")
    private @Nullable Output<String> gatewayLoadBalancerFrontendIpConfigurationId;

    /**
     * @return The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
     * 
     */
    public Optional<Output<String>> gatewayLoadBalancerFrontendIpConfigurationId() {
        return Optional.ofNullable(this.gatewayLoadBalancerFrontendIpConfigurationId);
    }

    /**
     * The id of the Frontend IP Configuration.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the Frontend IP Configuration.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The list of IDs of inbound rules that use this frontend IP.
     * 
     */
    @Import(name="inboundNatRules")
    private @Nullable Output<List<String>> inboundNatRules;

    /**
     * @return The list of IDs of inbound rules that use this frontend IP.
     * 
     */
    public Optional<Output<List<String>>> inboundNatRules() {
        return Optional.ofNullable(this.inboundNatRules);
    }

    /**
     * The list of IDs of load balancing rules that use this frontend IP.
     * 
     */
    @Import(name="loadBalancerRules")
    private @Nullable Output<List<String>> loadBalancerRules;

    /**
     * @return The list of IDs of load balancing rules that use this frontend IP.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerRules() {
        return Optional.ofNullable(this.loadBalancerRules);
    }

    /**
     * Specifies the name of the frontend IP configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the frontend IP configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The list of IDs outbound rules that use this frontend IP.
     * 
     */
    @Import(name="outboundRules")
    private @Nullable Output<List<String>> outboundRules;

    /**
     * @return The list of IDs outbound rules that use this frontend IP.
     * 
     */
    public Optional<Output<List<String>>> outboundRules() {
        return Optional.ofNullable(this.outboundRules);
    }

    /**
     * Private IP Address to assign to the Load Balancer. The last one and first four IPs in any range are reserved and cannot be manually assigned.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return Private IP Address to assign to the Load Balancer. The last one and first four IPs in any range are reserved and cannot be manually assigned.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The allocation method for the Private IP Address used by this Load Balancer. Possible values as `Dynamic` and `Static`.
     * 
     */
    @Import(name="privateIpAddressAllocation")
    private @Nullable Output<String> privateIpAddressAllocation;

    /**
     * @return The allocation method for the Private IP Address used by this Load Balancer. Possible values as `Dynamic` and `Static`.
     * 
     */
    public Optional<Output<String>> privateIpAddressAllocation() {
        return Optional.ofNullable(this.privateIpAddressAllocation);
    }

    /**
     * The version of IP that the Private IP Address is. Possible values are `IPv4` or `IPv6`.
     * 
     */
    @Import(name="privateIpAddressVersion")
    private @Nullable Output<String> privateIpAddressVersion;

    /**
     * @return The version of IP that the Private IP Address is. Possible values are `IPv4` or `IPv6`.
     * 
     */
    public Optional<Output<String>> privateIpAddressVersion() {
        return Optional.ofNullable(this.privateIpAddressVersion);
    }

    /**
     * The ID of a Public IP Address which should be associated with the Load Balancer.
     * 
     */
    @Import(name="publicIpAddressId")
    private @Nullable Output<String> publicIpAddressId;

    /**
     * @return The ID of a Public IP Address which should be associated with the Load Balancer.
     * 
     */
    public Optional<Output<String>> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }

    /**
     * The ID of a Public IP Prefix which should be associated with the Load Balancer. Public IP Prefix can only be used with outbound rules.
     * 
     */
    @Import(name="publicIpPrefixId")
    private @Nullable Output<String> publicIpPrefixId;

    /**
     * @return The ID of a Public IP Prefix which should be associated with the Load Balancer. Public IP Prefix can only be used with outbound rules.
     * 
     */
    public Optional<Output<String>> publicIpPrefixId() {
        return Optional.ofNullable(this.publicIpPrefixId);
    }

    /**
     * The ID of the Subnet which should be associated with the IP Configuration.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet which should be associated with the IP Configuration.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * Specifies a list of Availability Zones in which the IP Address for this Load Balancer should be located.
     * 
     * &gt; **Note:** Availability Zones are only supported with a [Standard SKU](https://docs.microsoft.com/azure/load-balancer/load-balancer-standard-availability-zones) and [in select regions](https://docs.microsoft.com/azure/availability-zones/az-overview) at this time.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which the IP Address for this Load Balancer should be located.
     * 
     * &gt; **Note:** Availability Zones are only supported with a [Standard SKU](https://docs.microsoft.com/azure/load-balancer/load-balancer-standard-availability-zones) and [in select regions](https://docs.microsoft.com/azure/availability-zones/az-overview) at this time.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private LoadBalancerFrontendIpConfigurationArgs() {}

    private LoadBalancerFrontendIpConfigurationArgs(LoadBalancerFrontendIpConfigurationArgs $) {
        this.gatewayLoadBalancerFrontendIpConfigurationId = $.gatewayLoadBalancerFrontendIpConfigurationId;
        this.id = $.id;
        this.inboundNatRules = $.inboundNatRules;
        this.loadBalancerRules = $.loadBalancerRules;
        this.name = $.name;
        this.outboundRules = $.outboundRules;
        this.privateIpAddress = $.privateIpAddress;
        this.privateIpAddressAllocation = $.privateIpAddressAllocation;
        this.privateIpAddressVersion = $.privateIpAddressVersion;
        this.publicIpAddressId = $.publicIpAddressId;
        this.publicIpPrefixId = $.publicIpPrefixId;
        this.subnetId = $.subnetId;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerFrontendIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerFrontendIpConfigurationArgs $;

        public Builder() {
            $ = new LoadBalancerFrontendIpConfigurationArgs();
        }

        public Builder(LoadBalancerFrontendIpConfigurationArgs defaults) {
            $ = new LoadBalancerFrontendIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayLoadBalancerFrontendIpConfigurationId The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder gatewayLoadBalancerFrontendIpConfigurationId(@Nullable Output<String> gatewayLoadBalancerFrontendIpConfigurationId) {
            $.gatewayLoadBalancerFrontendIpConfigurationId = gatewayLoadBalancerFrontendIpConfigurationId;
            return this;
        }

        /**
         * @param gatewayLoadBalancerFrontendIpConfigurationId The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder gatewayLoadBalancerFrontendIpConfigurationId(String gatewayLoadBalancerFrontendIpConfigurationId) {
            return gatewayLoadBalancerFrontendIpConfigurationId(Output.of(gatewayLoadBalancerFrontendIpConfigurationId));
        }

        /**
         * @param id The id of the Frontend IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the Frontend IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param inboundNatRules The list of IDs of inbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder inboundNatRules(@Nullable Output<List<String>> inboundNatRules) {
            $.inboundNatRules = inboundNatRules;
            return this;
        }

        /**
         * @param inboundNatRules The list of IDs of inbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder inboundNatRules(List<String> inboundNatRules) {
            return inboundNatRules(Output.of(inboundNatRules));
        }

        /**
         * @param inboundNatRules The list of IDs of inbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder inboundNatRules(String... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }

        /**
         * @param loadBalancerRules The list of IDs of load balancing rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerRules(@Nullable Output<List<String>> loadBalancerRules) {
            $.loadBalancerRules = loadBalancerRules;
            return this;
        }

        /**
         * @param loadBalancerRules The list of IDs of load balancing rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerRules(List<String> loadBalancerRules) {
            return loadBalancerRules(Output.of(loadBalancerRules));
        }

        /**
         * @param loadBalancerRules The list of IDs of load balancing rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerRules(String... loadBalancerRules) {
            return loadBalancerRules(List.of(loadBalancerRules));
        }

        /**
         * @param name Specifies the name of the frontend IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the frontend IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundRules The list of IDs outbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(@Nullable Output<List<String>> outboundRules) {
            $.outboundRules = outboundRules;
            return this;
        }

        /**
         * @param outboundRules The list of IDs outbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(List<String> outboundRules) {
            return outboundRules(Output.of(outboundRules));
        }

        /**
         * @param outboundRules The list of IDs outbound rules that use this frontend IP.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(String... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }

        /**
         * @param privateIpAddress Private IP Address to assign to the Load Balancer. The last one and first four IPs in any range are reserved and cannot be manually assigned.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress Private IP Address to assign to the Load Balancer. The last one and first four IPs in any range are reserved and cannot be manually assigned.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param privateIpAddressAllocation The allocation method for the Private IP Address used by this Load Balancer. Possible values as `Dynamic` and `Static`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(@Nullable Output<String> privateIpAddressAllocation) {
            $.privateIpAddressAllocation = privateIpAddressAllocation;
            return this;
        }

        /**
         * @param privateIpAddressAllocation The allocation method for the Private IP Address used by this Load Balancer. Possible values as `Dynamic` and `Static`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            return privateIpAddressAllocation(Output.of(privateIpAddressAllocation));
        }

        /**
         * @param privateIpAddressVersion The version of IP that the Private IP Address is. Possible values are `IPv4` or `IPv6`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressVersion(@Nullable Output<String> privateIpAddressVersion) {
            $.privateIpAddressVersion = privateIpAddressVersion;
            return this;
        }

        /**
         * @param privateIpAddressVersion The version of IP that the Private IP Address is. Possible values are `IPv4` or `IPv6`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressVersion(String privateIpAddressVersion) {
            return privateIpAddressVersion(Output.of(privateIpAddressVersion));
        }

        /**
         * @param publicIpAddressId The ID of a Public IP Address which should be associated with the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(@Nullable Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId The ID of a Public IP Address which should be associated with the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param publicIpPrefixId The ID of a Public IP Prefix which should be associated with the Load Balancer. Public IP Prefix can only be used with outbound rules.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixId(@Nullable Output<String> publicIpPrefixId) {
            $.publicIpPrefixId = publicIpPrefixId;
            return this;
        }

        /**
         * @param publicIpPrefixId The ID of a Public IP Prefix which should be associated with the Load Balancer. Public IP Prefix can only be used with outbound rules.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixId(String publicIpPrefixId) {
            return publicIpPrefixId(Output.of(publicIpPrefixId));
        }

        /**
         * @param subnetId The ID of the Subnet which should be associated with the IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet which should be associated with the IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which the IP Address for this Load Balancer should be located.
         * 
         * &gt; **Note:** Availability Zones are only supported with a [Standard SKU](https://docs.microsoft.com/azure/load-balancer/load-balancer-standard-availability-zones) and [in select regions](https://docs.microsoft.com/azure/availability-zones/az-overview) at this time.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Specifies a list of Availability Zones in which the IP Address for this Load Balancer should be located.
         * 
         * &gt; **Note:** Availability Zones are only supported with a [Standard SKU](https://docs.microsoft.com/azure/load-balancer/load-balancer-standard-availability-zones) and [in select regions](https://docs.microsoft.com/azure/availability-zones/az-overview) at this time.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which the IP Address for this Load Balancer should be located.
         * 
         * &gt; **Note:** Availability Zones are only supported with a [Standard SKU](https://docs.microsoft.com/azure/load-balancer/load-balancer-standard-availability-zones) and [in select regions](https://docs.microsoft.com/azure/availability-zones/az-overview) at this time.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public LoadBalancerFrontendIpConfigurationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("LoadBalancerFrontendIpConfigurationArgs", "name");
            }
            return $;
        }
    }

}
