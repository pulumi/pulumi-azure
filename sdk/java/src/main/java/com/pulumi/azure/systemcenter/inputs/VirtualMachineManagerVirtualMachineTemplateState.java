// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.systemcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineManagerVirtualMachineTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineManagerVirtualMachineTemplateState Empty = new VirtualMachineManagerVirtualMachineTemplateState();

    /**
     * The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="customLocationId")
    private @Nullable Output<String> customLocationId;

    /**
     * @return The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> customLocationId() {
        return Optional.ofNullable(this.customLocationId);
    }

    /**
     * The Azure Region where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of the System Center Virtual Machine Manager Server Inventory Item. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="systemCenterVirtualMachineManagerServerInventoryItemId")
    private @Nullable Output<String> systemCenterVirtualMachineManagerServerInventoryItemId;

    /**
     * @return The ID of the System Center Virtual Machine Manager Server Inventory Item. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> systemCenterVirtualMachineManagerServerInventoryItemId() {
        return Optional.ofNullable(this.systemCenterVirtualMachineManagerServerInventoryItemId);
    }

    /**
     * A mapping of tags which should be assigned to the System Center Virtual Machine Manager Virtual Machine Template.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the System Center Virtual Machine Manager Virtual Machine Template.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VirtualMachineManagerVirtualMachineTemplateState() {}

    private VirtualMachineManagerVirtualMachineTemplateState(VirtualMachineManagerVirtualMachineTemplateState $) {
        this.customLocationId = $.customLocationId;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.systemCenterVirtualMachineManagerServerInventoryItemId = $.systemCenterVirtualMachineManagerServerInventoryItemId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineManagerVirtualMachineTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineManagerVirtualMachineTemplateState $;

        public Builder() {
            $ = new VirtualMachineManagerVirtualMachineTemplateState();
        }

        public Builder(VirtualMachineManagerVirtualMachineTemplateState defaults) {
            $ = new VirtualMachineManagerVirtualMachineTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLocationId The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder customLocationId(@Nullable Output<String> customLocationId) {
            $.customLocationId = customLocationId;
            return this;
        }

        /**
         * @param customLocationId The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder customLocationId(String customLocationId) {
            return customLocationId(Output.of(customLocationId));
        }

        /**
         * @param location The Azure Region where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the System Center Virtual Machine Manager Virtual Machine Template. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the System Center Virtual Machine Manager Virtual Machine Template should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param systemCenterVirtualMachineManagerServerInventoryItemId The ID of the System Center Virtual Machine Manager Server Inventory Item. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder systemCenterVirtualMachineManagerServerInventoryItemId(@Nullable Output<String> systemCenterVirtualMachineManagerServerInventoryItemId) {
            $.systemCenterVirtualMachineManagerServerInventoryItemId = systemCenterVirtualMachineManagerServerInventoryItemId;
            return this;
        }

        /**
         * @param systemCenterVirtualMachineManagerServerInventoryItemId The ID of the System Center Virtual Machine Manager Server Inventory Item. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder systemCenterVirtualMachineManagerServerInventoryItemId(String systemCenterVirtualMachineManagerServerInventoryItemId) {
            return systemCenterVirtualMachineManagerServerInventoryItemId(Output.of(systemCenterVirtualMachineManagerServerInventoryItemId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the System Center Virtual Machine Manager Virtual Machine Template.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the System Center Virtual Machine Manager Virtual Machine Template.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VirtualMachineManagerVirtualMachineTemplateState build() {
            return $;
        }
    }

}
