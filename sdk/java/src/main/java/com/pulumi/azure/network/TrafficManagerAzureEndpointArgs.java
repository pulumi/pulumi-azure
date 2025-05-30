// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointCustomHeaderArgs;
import com.pulumi.azure.network.inputs.TrafficManagerAzureEndpointSubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficManagerAzureEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficManagerAzureEndpointArgs Empty = new TrafficManagerAzureEndpointArgs();

    /**
     * If Always Serve is enabled, probing for endpoint health will be disabled and endpoints will be included in the traffic routing method. Defaults to `false`.
     * 
     */
    @Import(name="alwaysServeEnabled")
    private @Nullable Output<Boolean> alwaysServeEnabled;

    /**
     * @return If Always Serve is enabled, probing for endpoint health will be disabled and endpoints will be included in the traffic routing method. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> alwaysServeEnabled() {
        return Optional.ofNullable(this.alwaysServeEnabled);
    }

    /**
     * One or more `custom_header` blocks as defined below.
     * 
     */
    @Import(name="customHeaders")
    private @Nullable Output<List<TrafficManagerAzureEndpointCustomHeaderArgs>> customHeaders;

    /**
     * @return One or more `custom_header` blocks as defined below.
     * 
     */
    public Optional<Output<List<TrafficManagerAzureEndpointCustomHeaderArgs>>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
    }

    /**
     * Is the endpoint enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the endpoint enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
     * 
     */
    @Import(name="geoMappings")
    private @Nullable Output<List<String>> geoMappings;

    /**
     * @return A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
     * 
     */
    public Optional<Output<List<String>>> geoMappings() {
        return Optional.ofNullable(this.geoMappings);
    }

    /**
     * The name of the Azure Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Azure Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the Traffic Manager Profile that this Azure Endpoint should be created within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="profileId", required=true)
    private Output<String> profileId;

    /**
     * @return The ID of the Traffic Manager Profile that this Azure Endpoint should be created within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }

    /**
     * One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<TrafficManagerAzureEndpointSubnetArgs>> subnets;

    /**
     * @return One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<TrafficManagerAzureEndpointSubnetArgs>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The ID of the Azure Resource which should be used as a target.
     * 
     */
    @Import(name="targetResourceId", required=true)
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Azure Resource which should be used as a target.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private TrafficManagerAzureEndpointArgs() {}

    private TrafficManagerAzureEndpointArgs(TrafficManagerAzureEndpointArgs $) {
        this.alwaysServeEnabled = $.alwaysServeEnabled;
        this.customHeaders = $.customHeaders;
        this.enabled = $.enabled;
        this.geoMappings = $.geoMappings;
        this.name = $.name;
        this.priority = $.priority;
        this.profileId = $.profileId;
        this.subnets = $.subnets;
        this.targetResourceId = $.targetResourceId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficManagerAzureEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficManagerAzureEndpointArgs $;

        public Builder() {
            $ = new TrafficManagerAzureEndpointArgs();
        }

        public Builder(TrafficManagerAzureEndpointArgs defaults) {
            $ = new TrafficManagerAzureEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysServeEnabled If Always Serve is enabled, probing for endpoint health will be disabled and endpoints will be included in the traffic routing method. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysServeEnabled(@Nullable Output<Boolean> alwaysServeEnabled) {
            $.alwaysServeEnabled = alwaysServeEnabled;
            return this;
        }

        /**
         * @param alwaysServeEnabled If Always Serve is enabled, probing for endpoint health will be disabled and endpoints will be included in the traffic routing method. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysServeEnabled(Boolean alwaysServeEnabled) {
            return alwaysServeEnabled(Output.of(alwaysServeEnabled));
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(@Nullable Output<List<TrafficManagerAzureEndpointCustomHeaderArgs>> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(List<TrafficManagerAzureEndpointCustomHeaderArgs> customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(TrafficManagerAzureEndpointCustomHeaderArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }

        /**
         * @param enabled Is the endpoint enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the endpoint enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(@Nullable Output<List<String>> geoMappings) {
            $.geoMappings = geoMappings;
            return this;
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(List<String> geoMappings) {
            return geoMappings(Output.of(geoMappings));
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(String... geoMappings) {
            return geoMappings(List.of(geoMappings));
        }

        /**
         * @param name The name of the Azure Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Azure Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param profileId The ID of the Traffic Manager Profile that this Azure Endpoint should be created within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId The ID of the Traffic Manager Profile that this Azure Endpoint should be created within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<TrafficManagerAzureEndpointSubnetArgs>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<TrafficManagerAzureEndpointSubnetArgs> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(TrafficManagerAzureEndpointSubnetArgs... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param targetResourceId The ID of the Azure Resource which should be used as a target.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId The ID of the Azure Resource which should be used as a target.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        /**
         * @param weight Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public TrafficManagerAzureEndpointArgs build() {
            if ($.profileId == null) {
                throw new MissingRequiredPropertyException("TrafficManagerAzureEndpointArgs", "profileId");
            }
            if ($.targetResourceId == null) {
                throw new MissingRequiredPropertyException("TrafficManagerAzureEndpointArgs", "targetResourceId");
            }
            return $;
        }
    }

}
