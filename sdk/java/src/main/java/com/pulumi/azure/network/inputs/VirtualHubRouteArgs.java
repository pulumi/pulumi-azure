// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualHubRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteArgs Empty = new VirtualHubRouteArgs();

    /**
     * A list of Address Prefixes.
     * 
     */
    @Import(name="addressPrefixes", required=true)
    private Output<List<String>> addressPrefixes;

    /**
     * @return A list of Address Prefixes.
     * 
     */
    public Output<List<String>> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * The IP Address that Packets should be forwarded to as the Next Hop.
     * 
     */
    @Import(name="nextHopIpAddress", required=true)
    private Output<String> nextHopIpAddress;

    /**
     * @return The IP Address that Packets should be forwarded to as the Next Hop.
     * 
     */
    public Output<String> nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    private VirtualHubRouteArgs() {}

    private VirtualHubRouteArgs(VirtualHubRouteArgs $) {
        this.addressPrefixes = $.addressPrefixes;
        this.nextHopIpAddress = $.nextHopIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubRouteArgs $;

        public Builder() {
            $ = new VirtualHubRouteArgs();
        }

        public Builder(VirtualHubRouteArgs defaults) {
            $ = new VirtualHubRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes A list of Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes A list of Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes A list of Address Prefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param nextHopIpAddress The IP Address that Packets should be forwarded to as the Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(Output<String> nextHopIpAddress) {
            $.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        /**
         * @param nextHopIpAddress The IP Address that Packets should be forwarded to as the Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(String nextHopIpAddress) {
            return nextHopIpAddress(Output.of(nextHopIpAddress));
        }

        public VirtualHubRouteArgs build() {
            if ($.addressPrefixes == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteArgs", "addressPrefixes");
            }
            if ($.nextHopIpAddress == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteArgs", "nextHopIpAddress");
            }
            return $;
        }
    }

}
