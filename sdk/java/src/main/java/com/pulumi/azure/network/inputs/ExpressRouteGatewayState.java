// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteGatewayState Empty = new ExpressRouteGatewayState();

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
     * 
     */
    @Import(name="scaleUnits")
    private @Nullable Output<Integer> scaleUnits;

    /**
     * @return The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
     * 
     */
    public Optional<Output<Integer>> scaleUnits() {
        return Optional.ofNullable(this.scaleUnits);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
     * 
     */
    @Import(name="virtualHubId")
    private @Nullable Output<String> virtualHubId;

    /**
     * @return The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
     * 
     */
    public Optional<Output<String>> virtualHubId() {
        return Optional.ofNullable(this.virtualHubId);
    }

    private ExpressRouteGatewayState() {}

    private ExpressRouteGatewayState(ExpressRouteGatewayState $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scaleUnits = $.scaleUnits;
        this.tags = $.tags;
        this.virtualHubId = $.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteGatewayState $;

        public Builder() {
            $ = new ExpressRouteGatewayState();
        }

        public Builder(ExpressRouteGatewayState defaults) {
            $ = new ExpressRouteGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ExpressRoute gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the ExpressRoute gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scaleUnits The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
         * 
         * @return builder
         * 
         */
        public Builder scaleUnits(@Nullable Output<Integer> scaleUnits) {
            $.scaleUnits = scaleUnits;
            return this;
        }

        /**
         * @param scaleUnits The number of scale units with which to provision the ExpressRoute gateway. Each scale unit is equal to 2Gbps, with support for up to 10 scale units (20Gbps).
         * 
         * @return builder
         * 
         */
        public Builder scaleUnits(Integer scaleUnits) {
            return scaleUnits(Output.of(scaleUnits));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualHubId The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(@Nullable Output<String> virtualHubId) {
            $.virtualHubId = virtualHubId;
            return this;
        }

        /**
         * @param virtualHubId The ID of a Virtual HUB within which the ExpressRoute gateway should be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(String virtualHubId) {
            return virtualHubId(Output.of(virtualHubId));
        }

        public ExpressRouteGatewayState build() {
            return $;
        }
    }

}