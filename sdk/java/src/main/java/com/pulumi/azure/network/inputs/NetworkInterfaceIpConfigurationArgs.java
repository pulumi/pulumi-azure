// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceIpConfigurationArgs Empty = new NetworkInterfaceIpConfigurationArgs();

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
     * A name used for this IP Configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A name used for this IP Configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * The first private IP address of the network interface.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return The first private IP address of the network interface.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     * &gt; **Note:** `Dynamic` means &#34;An IP is automatically assigned during creation of this Network Interface&#34;; `Static` means &#34;User supplied IP address will be used&#34;
     * 
     */
    @Import(name="privateIpAddressAllocation", required=true)
    private Output<String> privateIpAddressAllocation;

    /**
     * @return The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
     * 
     * &gt; **Note:** `Dynamic` means &#34;An IP is automatically assigned during creation of this Network Interface&#34;; `Static` means &#34;User supplied IP address will be used&#34;
     * 
     */
    public Output<String> privateIpAddressAllocation() {
        return this.privateIpAddressAllocation;
    }

    /**
     * The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
     * 
     */
    @Import(name="privateIpAddressVersion")
    private @Nullable Output<String> privateIpAddressVersion;

    /**
     * @return The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
     * 
     */
    public Optional<Output<String>> privateIpAddressVersion() {
        return Optional.ofNullable(this.privateIpAddressVersion);
    }

    /**
     * Reference to a Public IP Address to associate with this NIC
     * 
     */
    @Import(name="publicIpAddressId")
    private @Nullable Output<String> publicIpAddressId;

    /**
     * @return Reference to a Public IP Address to associate with this NIC
     * 
     */
    public Optional<Output<String>> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }

    /**
     * The ID of the Subnet where this Network Interface should be located in.
     * 
     * &gt; **Note:** This is required when `private_ip_address_version` is set to `IPv4`.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet where this Network Interface should be located in.
     * 
     * &gt; **Note:** This is required when `private_ip_address_version` is set to `IPv4`.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private NetworkInterfaceIpConfigurationArgs() {}

    private NetworkInterfaceIpConfigurationArgs(NetworkInterfaceIpConfigurationArgs $) {
        this.gatewayLoadBalancerFrontendIpConfigurationId = $.gatewayLoadBalancerFrontendIpConfigurationId;
        this.name = $.name;
        this.primary = $.primary;
        this.privateIpAddress = $.privateIpAddress;
        this.privateIpAddressAllocation = $.privateIpAddressAllocation;
        this.privateIpAddressVersion = $.privateIpAddressVersion;
        this.publicIpAddressId = $.publicIpAddressId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceIpConfigurationArgs $;

        public Builder() {
            $ = new NetworkInterfaceIpConfigurationArgs();
        }

        public Builder(NetworkInterfaceIpConfigurationArgs defaults) {
            $ = new NetworkInterfaceIpConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param name A name used for this IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name used for this IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primary Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param privateIpAddress The first private IP address of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress The first private IP address of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param privateIpAddressAllocation The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
         * 
         * &gt; **Note:** `Dynamic` means &#34;An IP is automatically assigned during creation of this Network Interface&#34;; `Static` means &#34;User supplied IP address will be used&#34;
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(Output<String> privateIpAddressAllocation) {
            $.privateIpAddressAllocation = privateIpAddressAllocation;
            return this;
        }

        /**
         * @param privateIpAddressAllocation The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
         * 
         * &gt; **Note:** `Dynamic` means &#34;An IP is automatically assigned during creation of this Network Interface&#34;; `Static` means &#34;User supplied IP address will be used&#34;
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressAllocation(String privateIpAddressAllocation) {
            return privateIpAddressAllocation(Output.of(privateIpAddressAllocation));
        }

        /**
         * @param privateIpAddressVersion The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressVersion(@Nullable Output<String> privateIpAddressVersion) {
            $.privateIpAddressVersion = privateIpAddressVersion;
            return this;
        }

        /**
         * @param privateIpAddressVersion The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressVersion(String privateIpAddressVersion) {
            return privateIpAddressVersion(Output.of(privateIpAddressVersion));
        }

        /**
         * @param publicIpAddressId Reference to a Public IP Address to associate with this NIC
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(@Nullable Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId Reference to a Public IP Address to associate with this NIC
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param subnetId The ID of the Subnet where this Network Interface should be located in.
         * 
         * &gt; **Note:** This is required when `private_ip_address_version` is set to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet where this Network Interface should be located in.
         * 
         * &gt; **Note:** This is required when `private_ip_address_version` is set to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public NetworkInterfaceIpConfigurationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("NetworkInterfaceIpConfigurationArgs", "name");
            }
            if ($.privateIpAddressAllocation == null) {
                throw new MissingRequiredPropertyException("NetworkInterfaceIpConfigurationArgs", "privateIpAddressAllocation");
            }
            return $;
        }
    }

}
