// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerDeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerDeploymentState Empty = new NetworkManagerDeploymentState();

    /**
     * A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
     * 
     */
    @Import(name="configurationIds")
    private @Nullable Output<List<String>> configurationIds;

    /**
     * @return A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
     * 
     */
    public Optional<Output<List<String>>> configurationIds() {
        return Optional.ofNullable(this.configurationIds);
    }

    /**
     * Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    @Import(name="networkManagerId")
    private @Nullable Output<String> networkManagerId;

    /**
     * @return Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    public Optional<Output<String>> networkManagerId() {
        return Optional.ofNullable(this.networkManagerId);
    }

    /**
     * Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    @Import(name="scopeAccess")
    private @Nullable Output<String> scopeAccess;

    /**
     * @return Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
     * 
     */
    public Optional<Output<String>> scopeAccess() {
        return Optional.ofNullable(this.scopeAccess);
    }

    /**
     * A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<Map<String,String>> triggers;

    /**
     * @return A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
     * 
     */
    public Optional<Output<Map<String,String>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private NetworkManagerDeploymentState() {}

    private NetworkManagerDeploymentState(NetworkManagerDeploymentState $) {
        this.configurationIds = $.configurationIds;
        this.location = $.location;
        this.networkManagerId = $.networkManagerId;
        this.scopeAccess = $.scopeAccess;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerDeploymentState $;

        public Builder() {
            $ = new NetworkManagerDeploymentState();
        }

        public Builder(NetworkManagerDeploymentState defaults) {
            $ = new NetworkManagerDeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationIds A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
         * 
         * @return builder
         * 
         */
        public Builder configurationIds(@Nullable Output<List<String>> configurationIds) {
            $.configurationIds = configurationIds;
            return this;
        }

        /**
         * @param configurationIds A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
         * 
         * @return builder
         * 
         */
        public Builder configurationIds(List<String> configurationIds) {
            return configurationIds(Output.of(configurationIds));
        }

        /**
         * @param configurationIds A list of Network Manager Configuration IDs which should be aligned with `scope_access`.
         * 
         * @return builder
         * 
         */
        public Builder configurationIds(String... configurationIds) {
            return configurationIds(List.of(configurationIds));
        }

        /**
         * @param location Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the location which the configurations will be deployed to. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(@Nullable Output<String> networkManagerId) {
            $.networkManagerId = networkManagerId;
            return this;
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(String networkManagerId) {
            return networkManagerId(Output.of(networkManagerId));
        }

        /**
         * @param scopeAccess Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccess(@Nullable Output<String> scopeAccess) {
            $.scopeAccess = scopeAccess;
            return this;
        }

        /**
         * @param scopeAccess Specifies the configuration deployment type. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`. Changing this forces a new Network Manager Deployment to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccess(String scopeAccess) {
            return scopeAccess(Output.of(scopeAccess));
        }

        /**
         * @param triggers A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<Map<String,String>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers A mapping of key values pairs that can be used to keep the deployment up with the Network Manager configurations and rules.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Map<String,String> triggers) {
            return triggers(Output.of(triggers));
        }

        public NetworkManagerDeploymentState build() {
            return $;
        }
    }

}
