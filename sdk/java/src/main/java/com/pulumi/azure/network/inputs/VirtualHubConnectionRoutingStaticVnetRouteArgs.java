// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualHubConnectionRoutingStaticVnetRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubConnectionRoutingStaticVnetRouteArgs Empty = new VirtualHubConnectionRoutingStaticVnetRouteArgs();

    /**
     * A list of CIDR Ranges which should be used as Address Prefixes.
     * 
     */
    @Import(name="addressPrefixes")
    private @Nullable Output<List<String>> addressPrefixes;

    /**
     * @return A list of CIDR Ranges which should be used as Address Prefixes.
     * 
     */
    public Optional<Output<List<String>>> addressPrefixes() {
        return Optional.ofNullable(this.addressPrefixes);
    }

    /**
     * The name which should be used for this Static Route.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Static Route.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The IP Address which should be used for the Next Hop.
     * 
     */
    @Import(name="nextHopIpAddress")
    private @Nullable Output<String> nextHopIpAddress;

    /**
     * @return The IP Address which should be used for the Next Hop.
     * 
     */
    public Optional<Output<String>> nextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    private VirtualHubConnectionRoutingStaticVnetRouteArgs() {}

    private VirtualHubConnectionRoutingStaticVnetRouteArgs(VirtualHubConnectionRoutingStaticVnetRouteArgs $) {
        this.addressPrefixes = $.addressPrefixes;
        this.name = $.name;
        this.nextHopIpAddress = $.nextHopIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubConnectionRoutingStaticVnetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubConnectionRoutingStaticVnetRouteArgs $;

        public Builder() {
            $ = new VirtualHubConnectionRoutingStaticVnetRouteArgs();
        }

        public Builder(VirtualHubConnectionRoutingStaticVnetRouteArgs defaults) {
            $ = new VirtualHubConnectionRoutingStaticVnetRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(@Nullable Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes A list of CIDR Ranges which should be used as Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param name The name which should be used for this Static Route.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Static Route.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nextHopIpAddress The IP Address which should be used for the Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(@Nullable Output<String> nextHopIpAddress) {
            $.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        /**
         * @param nextHopIpAddress The IP Address which should be used for the Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(String nextHopIpAddress) {
            return nextHopIpAddress(Output.of(nextHopIpAddress));
        }

        public VirtualHubConnectionRoutingStaticVnetRouteArgs build() {
            return $;
        }
    }

}
