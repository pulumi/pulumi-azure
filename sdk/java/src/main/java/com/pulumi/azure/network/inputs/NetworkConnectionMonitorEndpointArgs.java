// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkConnectionMonitorEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConnectionMonitorEndpointArgs Empty = new NetworkConnectionMonitorEndpointArgs();

    /**
     * The IP address or domain name of the Network Connection Monitor endpoint.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IP address or domain name of the Network Connection Monitor endpoint.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
     * 
     */
    @Import(name="coverageLevel")
    private @Nullable Output<String> coverageLevel;

    /**
     * @return The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
     * 
     */
    public Optional<Output<String>> coverageLevel() {
        return Optional.ofNullable(this.coverageLevel);
    }

    /**
     * A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
     * 
     */
    @Import(name="excludedIpAddresses")
    private @Nullable Output<List<String>> excludedIpAddresses;

    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
     * 
     */
    public Optional<Output<List<String>>> excludedIpAddresses() {
        return Optional.ofNullable(this.excludedIpAddresses);
    }

    /**
     * A `filter` block as defined below.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<NetworkConnectionMonitorEndpointFilterArgs> filter;

    /**
     * @return A `filter` block as defined below.
     * 
     */
    public Optional<Output<NetworkConnectionMonitorEndpointFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
     * 
     */
    @Import(name="includedIpAddresses")
    private @Nullable Output<List<String>> includedIpAddresses;

    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
     * 
     */
    public Optional<Output<List<String>>> includedIpAddresses() {
        return Optional.ofNullable(this.includedIpAddresses);
    }

    /**
     * The name of the endpoint for the Network Connection Monitor .
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the endpoint for the Network Connection Monitor .
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource ID which is used as the endpoint by the Network Connection Monitor.
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable Output<String> targetResourceId;

    /**
     * @return The resource ID which is used as the endpoint by the Network Connection Monitor.
     * 
     */
    public Optional<Output<String>> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The endpoint type of the Network Connection Monitor. Possible values are `AzureArcVM`, `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<String> targetResourceType;

    /**
     * @return The endpoint type of the Network Connection Monitor. Possible values are `AzureArcVM`, `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
     * 
     */
    public Optional<Output<String>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private NetworkConnectionMonitorEndpointArgs() {}

    private NetworkConnectionMonitorEndpointArgs(NetworkConnectionMonitorEndpointArgs $) {
        this.address = $.address;
        this.coverageLevel = $.coverageLevel;
        this.excludedIpAddresses = $.excludedIpAddresses;
        this.filter = $.filter;
        this.includedIpAddresses = $.includedIpAddresses;
        this.name = $.name;
        this.targetResourceId = $.targetResourceId;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConnectionMonitorEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConnectionMonitorEndpointArgs $;

        public Builder() {
            $ = new NetworkConnectionMonitorEndpointArgs();
        }

        public Builder(NetworkConnectionMonitorEndpointArgs defaults) {
            $ = new NetworkConnectionMonitorEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IP address or domain name of the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP address or domain name of the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param coverageLevel The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
         * 
         * @return builder
         * 
         */
        public Builder coverageLevel(@Nullable Output<String> coverageLevel) {
            $.coverageLevel = coverageLevel;
            return this;
        }

        /**
         * @param coverageLevel The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
         * 
         * @return builder
         * 
         */
        public Builder coverageLevel(String coverageLevel) {
            return coverageLevel(Output.of(coverageLevel));
        }

        /**
         * @param excludedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpAddresses(@Nullable Output<List<String>> excludedIpAddresses) {
            $.excludedIpAddresses = excludedIpAddresses;
            return this;
        }

        /**
         * @param excludedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpAddresses(List<String> excludedIpAddresses) {
            return excludedIpAddresses(Output.of(excludedIpAddresses));
        }

        /**
         * @param excludedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpAddresses(String... excludedIpAddresses) {
            return excludedIpAddresses(List.of(excludedIpAddresses));
        }

        /**
         * @param filter A `filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<NetworkConnectionMonitorEndpointFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A `filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder filter(NetworkConnectionMonitorEndpointFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param includedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder includedIpAddresses(@Nullable Output<List<String>> includedIpAddresses) {
            $.includedIpAddresses = includedIpAddresses;
            return this;
        }

        /**
         * @param includedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder includedIpAddresses(List<String> includedIpAddresses) {
            return includedIpAddresses(Output.of(includedIpAddresses));
        }

        /**
         * @param includedIpAddresses A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
         * 
         * @return builder
         * 
         */
        public Builder includedIpAddresses(String... includedIpAddresses) {
            return includedIpAddresses(List.of(includedIpAddresses));
        }

        /**
         * @param name The name of the endpoint for the Network Connection Monitor .
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint for the Network Connection Monitor .
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param targetResourceId The resource ID which is used as the endpoint by the Network Connection Monitor.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId The resource ID which is used as the endpoint by the Network Connection Monitor.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        /**
         * @param targetResourceType The endpoint type of the Network Connection Monitor. Possible values are `AzureArcVM`, `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<String> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType The endpoint type of the Network Connection Monitor. Possible values are `AzureArcVM`, `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(String targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        public NetworkConnectionMonitorEndpointArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("NetworkConnectionMonitorEndpointArgs", "name");
            }
            return $;
        }
    }

}
