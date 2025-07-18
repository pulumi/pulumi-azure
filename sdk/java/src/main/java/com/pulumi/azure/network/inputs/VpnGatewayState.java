// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.VpnGatewayBgpSettingsArgs;
import com.pulumi.azure.network.inputs.VpnGatewayIpConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayState Empty = new VpnGatewayState();

    /**
     * Is BGP route translation for NAT on this VPN Gateway enabled? Defaults to `false`.
     * 
     */
    @Import(name="bgpRouteTranslationForNatEnabled")
    private @Nullable Output<Boolean> bgpRouteTranslationForNatEnabled;

    /**
     * @return Is BGP route translation for NAT on this VPN Gateway enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> bgpRouteTranslationForNatEnabled() {
        return Optional.ofNullable(this.bgpRouteTranslationForNatEnabled);
    }

    /**
     * A `bgp_settings` block as defined below.
     * 
     */
    @Import(name="bgpSettings")
    private @Nullable Output<VpnGatewayBgpSettingsArgs> bgpSettings;

    /**
     * @return A `bgp_settings` block as defined below.
     * 
     */
    public Optional<Output<VpnGatewayBgpSettingsArgs>> bgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }

    /**
     * An `ip_configuration` block as defined below.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<VpnGatewayIpConfigurationArgs>> ipConfigurations;

    /**
     * @return An `ip_configuration` block as defined below.
     * 
     */
    public Optional<Output<List<VpnGatewayIpConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * The Azure location where this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Name which should be used for this VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name which should be used for this VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Name of the Resource Group in which this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Azure routing preference lets you to choose how your traffic routes between Azure and the internet. You can choose to route traffic either via the Microsoft network (default value, `Microsoft Network`), or via the ISP network (public internet, set to `Internet`). More context of the configuration can be found in the [Microsoft Docs](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-site-to-site-portal#gateway) to create a VPN Gateway. Defaults to `Microsoft Network`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="routingPreference")
    private @Nullable Output<String> routingPreference;

    /**
     * @return Azure routing preference lets you to choose how your traffic routes between Azure and the internet. You can choose to route traffic either via the Microsoft network (default value, `Microsoft Network`), or via the ISP network (public internet, set to `Internet`). More context of the configuration can be found in the [Microsoft Docs](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-site-to-site-portal#gateway) to create a VPN Gateway. Defaults to `Microsoft Network`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> routingPreference() {
        return Optional.ofNullable(this.routingPreference);
    }

    /**
     * The Scale Unit for this VPN Gateway. Defaults to `1`.
     * 
     */
    @Import(name="scaleUnit")
    private @Nullable Output<Integer> scaleUnit;

    /**
     * @return The Scale Unit for this VPN Gateway. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> scaleUnit() {
        return Optional.ofNullable(this.scaleUnit);
    }

    /**
     * A mapping of tags to assign to the VPN Gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the VPN Gateway.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the Virtual Hub within which this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualHubId")
    private @Nullable Output<String> virtualHubId;

    /**
     * @return The ID of the Virtual Hub within which this VPN Gateway should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualHubId() {
        return Optional.ofNullable(this.virtualHubId);
    }

    private VpnGatewayState() {}

    private VpnGatewayState(VpnGatewayState $) {
        this.bgpRouteTranslationForNatEnabled = $.bgpRouteTranslationForNatEnabled;
        this.bgpSettings = $.bgpSettings;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.routingPreference = $.routingPreference;
        this.scaleUnit = $.scaleUnit;
        this.tags = $.tags;
        this.virtualHubId = $.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayState $;

        public Builder() {
            $ = new VpnGatewayState();
        }

        public Builder(VpnGatewayState defaults) {
            $ = new VpnGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bgpRouteTranslationForNatEnabled Is BGP route translation for NAT on this VPN Gateway enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder bgpRouteTranslationForNatEnabled(@Nullable Output<Boolean> bgpRouteTranslationForNatEnabled) {
            $.bgpRouteTranslationForNatEnabled = bgpRouteTranslationForNatEnabled;
            return this;
        }

        /**
         * @param bgpRouteTranslationForNatEnabled Is BGP route translation for NAT on this VPN Gateway enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder bgpRouteTranslationForNatEnabled(Boolean bgpRouteTranslationForNatEnabled) {
            return bgpRouteTranslationForNatEnabled(Output.of(bgpRouteTranslationForNatEnabled));
        }

        /**
         * @param bgpSettings A `bgp_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder bgpSettings(@Nullable Output<VpnGatewayBgpSettingsArgs> bgpSettings) {
            $.bgpSettings = bgpSettings;
            return this;
        }

        /**
         * @param bgpSettings A `bgp_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder bgpSettings(VpnGatewayBgpSettingsArgs bgpSettings) {
            return bgpSettings(Output.of(bgpSettings));
        }

        /**
         * @param ipConfigurations An `ip_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(@Nullable Output<List<VpnGatewayIpConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations An `ip_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<VpnGatewayIpConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations An `ip_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(VpnGatewayIpConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param location The Azure location where this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The Name which should be used for this VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name which should be used for this VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routingPreference Azure routing preference lets you to choose how your traffic routes between Azure and the internet. You can choose to route traffic either via the Microsoft network (default value, `Microsoft Network`), or via the ISP network (public internet, set to `Internet`). More context of the configuration can be found in the [Microsoft Docs](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-site-to-site-portal#gateway) to create a VPN Gateway. Defaults to `Microsoft Network`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routingPreference(@Nullable Output<String> routingPreference) {
            $.routingPreference = routingPreference;
            return this;
        }

        /**
         * @param routingPreference Azure routing preference lets you to choose how your traffic routes between Azure and the internet. You can choose to route traffic either via the Microsoft network (default value, `Microsoft Network`), or via the ISP network (public internet, set to `Internet`). More context of the configuration can be found in the [Microsoft Docs](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-site-to-site-portal#gateway) to create a VPN Gateway. Defaults to `Microsoft Network`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routingPreference(String routingPreference) {
            return routingPreference(Output.of(routingPreference));
        }

        /**
         * @param scaleUnit The Scale Unit for this VPN Gateway. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(@Nullable Output<Integer> scaleUnit) {
            $.scaleUnit = scaleUnit;
            return this;
        }

        /**
         * @param scaleUnit The Scale Unit for this VPN Gateway. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(Integer scaleUnit) {
            return scaleUnit(Output.of(scaleUnit));
        }

        /**
         * @param tags A mapping of tags to assign to the VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub within which this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(@Nullable Output<String> virtualHubId) {
            $.virtualHubId = virtualHubId;
            return this;
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub within which this VPN Gateway should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(String virtualHubId) {
            return virtualHubId(Output.of(virtualHubId));
        }

        public VpnGatewayState build() {
            return $;
        }
    }

}
