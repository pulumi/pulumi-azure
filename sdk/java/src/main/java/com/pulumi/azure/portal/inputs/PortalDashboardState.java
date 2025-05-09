// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.portal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PortalDashboardState extends com.pulumi.resources.ResourceArgs {

    public static final PortalDashboardState Empty = new PortalDashboardState();

    /**
     * JSON data representing dashboard body. See above for details on how to obtain this from the Portal.
     * 
     */
    @Import(name="dashboardProperties")
    private @Nullable Output<String> dashboardProperties;

    /**
     * @return JSON data representing dashboard body. See above for details on how to obtain this from the Portal.
     * 
     */
    public Optional<Output<String>> dashboardProperties() {
        return Optional.ofNullable(this.dashboardProperties);
    }

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
     * Specifies the name of the Shared Dashboard. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** You can specify a tag with the key `hidden-title` to set a more user-friendly title for this Dashboard.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Shared Dashboard. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** You can specify a tag with the key `hidden-title` to set a more user-friendly title for this Dashboard.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the dashboard. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the dashboard. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
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

    private PortalDashboardState() {}

    private PortalDashboardState(PortalDashboardState $) {
        this.dashboardProperties = $.dashboardProperties;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortalDashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortalDashboardState $;

        public Builder() {
            $ = new PortalDashboardState();
        }

        public Builder(PortalDashboardState defaults) {
            $ = new PortalDashboardState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboardProperties JSON data representing dashboard body. See above for details on how to obtain this from the Portal.
         * 
         * @return builder
         * 
         */
        public Builder dashboardProperties(@Nullable Output<String> dashboardProperties) {
            $.dashboardProperties = dashboardProperties;
            return this;
        }

        /**
         * @param dashboardProperties JSON data representing dashboard body. See above for details on how to obtain this from the Portal.
         * 
         * @return builder
         * 
         */
        public Builder dashboardProperties(String dashboardProperties) {
            return dashboardProperties(Output.of(dashboardProperties));
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
         * @param name Specifies the name of the Shared Dashboard. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** You can specify a tag with the key `hidden-title` to set a more user-friendly title for this Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Shared Dashboard. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** You can specify a tag with the key `hidden-title` to set a more user-friendly title for this Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the dashboard. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the dashboard. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        public PortalDashboardState build() {
            return $;
        }
    }

}
