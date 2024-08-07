// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.NetworkConnectionMonitorEndpointFilterItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkConnectionMonitorEndpointFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConnectionMonitorEndpointFilterArgs Empty = new NetworkConnectionMonitorEndpointFilterArgs();

    /**
     * A `item` block as defined below.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<NetworkConnectionMonitorEndpointFilterItemArgs>> items;

    /**
     * @return A `item` block as defined below.
     * 
     */
    public Optional<Output<List<NetworkConnectionMonitorEndpointFilterItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The behaviour type of this endpoint filter. Currently the only allowed value is `Include`. Defaults to `Include`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The behaviour type of this endpoint filter. Currently the only allowed value is `Include`. Defaults to `Include`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NetworkConnectionMonitorEndpointFilterArgs() {}

    private NetworkConnectionMonitorEndpointFilterArgs(NetworkConnectionMonitorEndpointFilterArgs $) {
        this.items = $.items;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConnectionMonitorEndpointFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConnectionMonitorEndpointFilterArgs $;

        public Builder() {
            $ = new NetworkConnectionMonitorEndpointFilterArgs();
        }

        public Builder(NetworkConnectionMonitorEndpointFilterArgs defaults) {
            $ = new NetworkConnectionMonitorEndpointFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items A `item` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<NetworkConnectionMonitorEndpointFilterItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items A `item` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder items(List<NetworkConnectionMonitorEndpointFilterItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items A `item` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder items(NetworkConnectionMonitorEndpointFilterItemArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param type The behaviour type of this endpoint filter. Currently the only allowed value is `Include`. Defaults to `Include`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The behaviour type of this endpoint filter. Currently the only allowed value is `Include`. Defaults to `Include`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NetworkConnectionMonitorEndpointFilterArgs build() {
            return $;
        }
    }

}
