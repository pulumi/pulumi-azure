// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteServerBgpConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final RouteServerBgpConnectionState Empty = new RouteServerBgpConnectionState();

    /**
     * The name which should be used for this Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The peer autonomous system number for the Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="peerAsn")
    private @Nullable Output<Integer> peerAsn;

    /**
     * @return The peer autonomous system number for the Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> peerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }

    /**
     * The peer ip address for the Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="peerIp")
    private @Nullable Output<String> peerIp;

    /**
     * @return The peer ip address for the Route Server Bgp Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> peerIp() {
        return Optional.ofNullable(this.peerIp);
    }

    /**
     * The ID of the Route Server within which this Bgp connection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="routeServerId")
    private @Nullable Output<String> routeServerId;

    /**
     * @return The ID of the Route Server within which this Bgp connection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> routeServerId() {
        return Optional.ofNullable(this.routeServerId);
    }

    private RouteServerBgpConnectionState() {}

    private RouteServerBgpConnectionState(RouteServerBgpConnectionState $) {
        this.name = $.name;
        this.peerAsn = $.peerAsn;
        this.peerIp = $.peerIp;
        this.routeServerId = $.routeServerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteServerBgpConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteServerBgpConnectionState $;

        public Builder() {
            $ = new RouteServerBgpConnectionState();
        }

        public Builder(RouteServerBgpConnectionState defaults) {
            $ = new RouteServerBgpConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerAsn The peer autonomous system number for the Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerAsn(@Nullable Output<Integer> peerAsn) {
            $.peerAsn = peerAsn;
            return this;
        }

        /**
         * @param peerAsn The peer autonomous system number for the Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerAsn(Integer peerAsn) {
            return peerAsn(Output.of(peerAsn));
        }

        /**
         * @param peerIp The peer ip address for the Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerIp(@Nullable Output<String> peerIp) {
            $.peerIp = peerIp;
            return this;
        }

        /**
         * @param peerIp The peer ip address for the Route Server Bgp Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder peerIp(String peerIp) {
            return peerIp(Output.of(peerIp));
        }

        /**
         * @param routeServerId The ID of the Route Server within which this Bgp connection should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routeServerId(@Nullable Output<String> routeServerId) {
            $.routeServerId = routeServerId;
            return this;
        }

        /**
         * @param routeServerId The ID of the Route Server within which this Bgp connection should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routeServerId(String routeServerId) {
            return routeServerId(Output.of(routeServerId));
        }

        public RouteServerBgpConnectionState build() {
            return $;
        }
    }

}
