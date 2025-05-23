// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NextGenerationFirewallVirtualNetworkPanoramaState extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualNetworkPanoramaState Empty = new NextGenerationFirewallVirtualNetworkPanoramaState();

    /**
     * One or more `destination_nat` blocks as defined below.
     * 
     */
    @Import(name="destinationNats")
    private @Nullable Output<List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs>> destinationNats;

    /**
     * @return One or more `destination_nat` blocks as defined below.
     * 
     */
    public Optional<Output<List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs>>> destinationNats() {
        return Optional.ofNullable(this.destinationNats);
    }

    /**
     * A `dns_settings` block as defined below.
     * 
     */
    @Import(name="dnsSettings")
    private @Nullable Output<NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs> dnsSettings;

    /**
     * @return A `dns_settings` block as defined below.
     * 
     */
    public Optional<Output<NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs>> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }

    /**
     * The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="marketplaceOfferId")
    private @Nullable Output<String> marketplaceOfferId;

    /**
     * @return The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> marketplaceOfferId() {
        return Optional.ofNullable(this.marketplaceOfferId);
    }

    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network_profile` block as defined below.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs> networkProfile;

    /**
     * @return A `network_profile` block as defined below.
     * 
     */
    public Optional<Output<NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
     * 
     */
    @Import(name="panoramaBase64Config")
    private @Nullable Output<String> panoramaBase64Config;

    /**
     * @return The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
     * 
     */
    public Optional<Output<String>> panoramaBase64Config() {
        return Optional.ofNullable(this.panoramaBase64Config);
    }

    /**
     * A `panorama` block as defined below.
     * 
     */
    @Import(name="panoramas")
    private @Nullable Output<List<NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs>> panoramas;

    /**
     * @return A `panorama` block as defined below.
     * 
     */
    public Optional<Output<List<NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs>>> panoramas() {
        return Optional.ofNullable(this.panoramas);
    }

    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     * 
     * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     * 
     * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NextGenerationFirewallVirtualNetworkPanoramaState() {}

    private NextGenerationFirewallVirtualNetworkPanoramaState(NextGenerationFirewallVirtualNetworkPanoramaState $) {
        this.destinationNats = $.destinationNats;
        this.dnsSettings = $.dnsSettings;
        this.location = $.location;
        this.marketplaceOfferId = $.marketplaceOfferId;
        this.name = $.name;
        this.networkProfile = $.networkProfile;
        this.panoramaBase64Config = $.panoramaBase64Config;
        this.panoramas = $.panoramas;
        this.planId = $.planId;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualNetworkPanoramaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualNetworkPanoramaState $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualNetworkPanoramaState();
        }

        public Builder(NextGenerationFirewallVirtualNetworkPanoramaState defaults) {
            $ = new NextGenerationFirewallVirtualNetworkPanoramaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationNats One or more `destination_nat` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder destinationNats(@Nullable Output<List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs>> destinationNats) {
            $.destinationNats = destinationNats;
            return this;
        }

        /**
         * @param destinationNats One or more `destination_nat` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder destinationNats(List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs> destinationNats) {
            return destinationNats(Output.of(destinationNats));
        }

        /**
         * @param destinationNats One or more `destination_nat` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder destinationNats(NextGenerationFirewallVirtualNetworkPanoramaDestinationNatArgs... destinationNats) {
            return destinationNats(List.of(destinationNats));
        }

        /**
         * @param dnsSettings A `dns_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dnsSettings(@Nullable Output<NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs> dnsSettings) {
            $.dnsSettings = dnsSettings;
            return this;
        }

        /**
         * @param dnsSettings A `dns_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dnsSettings(NextGenerationFirewallVirtualNetworkPanoramaDnsSettingsArgs dnsSettings) {
            return dnsSettings(Output.of(dnsSettings));
        }

        /**
         * @param location The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param marketplaceOfferId The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceOfferId(@Nullable Output<String> marketplaceOfferId) {
            $.marketplaceOfferId = marketplaceOfferId;
            return this;
        }

        /**
         * @param marketplaceOfferId The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceOfferId(String marketplaceOfferId) {
            return marketplaceOfferId(Output.of(marketplaceOfferId));
        }

        /**
         * @param name The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkProfile A `network_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile A `network_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        /**
         * @param panoramaBase64Config The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
         * 
         * @return builder
         * 
         */
        public Builder panoramaBase64Config(@Nullable Output<String> panoramaBase64Config) {
            $.panoramaBase64Config = panoramaBase64Config;
            return this;
        }

        /**
         * @param panoramaBase64Config The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
         * 
         * @return builder
         * 
         */
        public Builder panoramaBase64Config(String panoramaBase64Config) {
            return panoramaBase64Config(Output.of(panoramaBase64Config));
        }

        /**
         * @param panoramas A `panorama` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder panoramas(@Nullable Output<List<NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs>> panoramas) {
            $.panoramas = panoramas;
            return this;
        }

        /**
         * @param panoramas A `panorama` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder panoramas(List<NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs> panoramas) {
            return panoramas(Output.of(panoramas));
        }

        /**
         * @param panoramas A `panorama` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder panoramas(NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs... panoramas) {
            return panoramas(List.of(panoramas));
        }

        /**
         * @param planId The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
         * 
         * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
         * 
         * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NextGenerationFirewallVirtualNetworkPanoramaState build() {
            return $;
        }
    }

}
