// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallVirtualHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallVirtualHubArgs Empty = new FirewallVirtualHubArgs();

    /**
     * The private IP address associated with the Firewall.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return The private IP address associated with the Firewall.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The list of public IP addresses associated with the Firewall.
     * 
     */
    @Import(name="publicIpAddresses")
    private @Nullable Output<List<String>> publicIpAddresses;

    /**
     * @return The list of public IP addresses associated with the Firewall.
     * 
     */
    public Optional<Output<List<String>>> publicIpAddresses() {
        return Optional.ofNullable(this.publicIpAddresses);
    }

    /**
     * Specifies the number of public IPs to assign to the Firewall. Defaults to `1`.
     * 
     */
    @Import(name="publicIpCount")
    private @Nullable Output<Integer> publicIpCount;

    /**
     * @return Specifies the number of public IPs to assign to the Firewall. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> publicIpCount() {
        return Optional.ofNullable(this.publicIpCount);
    }

    /**
     * Specifies the ID of the Virtual Hub where the Firewall resides in.
     * 
     */
    @Import(name="virtualHubId", required=true)
    private Output<String> virtualHubId;

    /**
     * @return Specifies the ID of the Virtual Hub where the Firewall resides in.
     * 
     */
    public Output<String> virtualHubId() {
        return this.virtualHubId;
    }

    private FirewallVirtualHubArgs() {}

    private FirewallVirtualHubArgs(FirewallVirtualHubArgs $) {
        this.privateIpAddress = $.privateIpAddress;
        this.publicIpAddresses = $.publicIpAddresses;
        this.publicIpCount = $.publicIpCount;
        this.virtualHubId = $.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallVirtualHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallVirtualHubArgs $;

        public Builder() {
            $ = new FirewallVirtualHubArgs();
        }

        public Builder(FirewallVirtualHubArgs defaults) {
            $ = new FirewallVirtualHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateIpAddress The private IP address associated with the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress The private IP address associated with the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param publicIpAddresses The list of public IP addresses associated with the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(@Nullable Output<List<String>> publicIpAddresses) {
            $.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * @param publicIpAddresses The list of public IP addresses associated with the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(List<String> publicIpAddresses) {
            return publicIpAddresses(Output.of(publicIpAddresses));
        }

        /**
         * @param publicIpAddresses The list of public IP addresses associated with the Firewall.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }

        /**
         * @param publicIpCount Specifies the number of public IPs to assign to the Firewall. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder publicIpCount(@Nullable Output<Integer> publicIpCount) {
            $.publicIpCount = publicIpCount;
            return this;
        }

        /**
         * @param publicIpCount Specifies the number of public IPs to assign to the Firewall. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder publicIpCount(Integer publicIpCount) {
            return publicIpCount(Output.of(publicIpCount));
        }

        /**
         * @param virtualHubId Specifies the ID of the Virtual Hub where the Firewall resides in.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(Output<String> virtualHubId) {
            $.virtualHubId = virtualHubId;
            return this;
        }

        /**
         * @param virtualHubId Specifies the ID of the Virtual Hub where the Firewall resides in.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(String virtualHubId) {
            return virtualHubId(Output.of(virtualHubId));
        }

        public FirewallVirtualHubArgs build() {
            if ($.virtualHubId == null) {
                throw new MissingRequiredPropertyException("FirewallVirtualHubArgs", "virtualHubId");
            }
            return $;
        }
    }

}
