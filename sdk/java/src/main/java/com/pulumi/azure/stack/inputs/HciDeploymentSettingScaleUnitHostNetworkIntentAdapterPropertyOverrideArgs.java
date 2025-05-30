// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.stack.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs Empty = new HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs();

    /**
     * The jumbo frame size of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    @Import(name="jumboPacket")
    private @Nullable Output<String> jumboPacket;

    /**
     * @return The jumbo frame size of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    public Optional<Output<String>> jumboPacket() {
        return Optional.ofNullable(this.jumboPacket);
    }

    /**
     * The network direct of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    @Import(name="networkDirect")
    private @Nullable Output<String> networkDirect;

    /**
     * @return The network direct of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    public Optional<Output<String>> networkDirect() {
        return Optional.ofNullable(this.networkDirect);
    }

    /**
     * The network direct technology of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    @Import(name="networkDirectTechnology")
    private @Nullable Output<String> networkDirectTechnology;

    /**
     * @return The network direct technology of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    public Optional<Output<String>> networkDirectTechnology() {
        return Optional.ofNullable(this.networkDirectTechnology);
    }

    private HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs() {}

    private HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs(HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs $) {
        this.jumboPacket = $.jumboPacket;
        this.networkDirect = $.networkDirect;
        this.networkDirectTechnology = $.networkDirectTechnology;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs $;

        public Builder() {
            $ = new HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs();
        }

        public Builder(HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs defaults) {
            $ = new HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jumboPacket The jumbo frame size of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder jumboPacket(@Nullable Output<String> jumboPacket) {
            $.jumboPacket = jumboPacket;
            return this;
        }

        /**
         * @param jumboPacket The jumbo frame size of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder jumboPacket(String jumboPacket) {
            return jumboPacket(Output.of(jumboPacket));
        }

        /**
         * @param networkDirect The network direct of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkDirect(@Nullable Output<String> networkDirect) {
            $.networkDirect = networkDirect;
            return this;
        }

        /**
         * @param networkDirect The network direct of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkDirect(String networkDirect) {
            return networkDirect(Output.of(networkDirect));
        }

        /**
         * @param networkDirectTechnology The network direct technology of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkDirectTechnology(@Nullable Output<String> networkDirectTechnology) {
            $.networkDirectTechnology = networkDirectTechnology;
            return this;
        }

        /**
         * @param networkDirectTechnology The network direct technology of the adapter. This parameter should only be modified based on your OEM guidance. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkDirectTechnology(String networkDirectTechnology) {
            return networkDirectTechnology(Output.of(networkDirectTechnology));
        }

        public HciDeploymentSettingScaleUnitHostNetworkIntentAdapterPropertyOverrideArgs build() {
            return $;
        }
    }

}
