// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerRoutingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerRoutingConfigurationArgs Empty = new NetworkManagerRoutingConfigurationArgs();

    /**
     * The description of the Network Manager.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Network Manager.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
     * 
     */
    @Import(name="networkManagerId", required=true)
    private Output<String> networkManagerId;

    /**
     * @return The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
     * 
     */
    public Output<String> networkManagerId() {
        return this.networkManagerId;
    }

    private NetworkManagerRoutingConfigurationArgs() {}

    private NetworkManagerRoutingConfigurationArgs(NetworkManagerRoutingConfigurationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.networkManagerId = $.networkManagerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerRoutingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerRoutingConfigurationArgs $;

        public Builder() {
            $ = new NetworkManagerRoutingConfigurationArgs();
        }

        public Builder(NetworkManagerRoutingConfigurationArgs defaults) {
            $ = new NetworkManagerRoutingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkManagerId The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(Output<String> networkManagerId) {
            $.networkManagerId = networkManagerId;
            return this;
        }

        /**
         * @param networkManagerId The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(String networkManagerId) {
            return networkManagerId(Output.of(networkManagerId));
        }

        public NetworkManagerRoutingConfigurationArgs build() {
            if ($.networkManagerId == null) {
                throw new MissingRequiredPropertyException("NetworkManagerRoutingConfigurationArgs", "networkManagerId");
            }
            return $;
        }
    }

}
