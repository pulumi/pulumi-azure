// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy;

import com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineConfigurationAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineConfigurationAssignmentArgs Empty = new VirtualMachineConfigurationAssignmentArgs();

    /**
     * A `configuration` block as defined below.
     * 
     */
    @Import(name="configuration", required=true)
    private Output<VirtualMachineConfigurationAssignmentConfigurationArgs> configuration;

    /**
     * @return A `configuration` block as defined below.
     * 
     */
    public Output<VirtualMachineConfigurationAssignmentConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualMachineId", required=true)
    private Output<String> virtualMachineId;

    /**
     * @return The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    private VirtualMachineConfigurationAssignmentArgs() {}

    private VirtualMachineConfigurationAssignmentArgs(VirtualMachineConfigurationAssignmentArgs $) {
        this.configuration = $.configuration;
        this.location = $.location;
        this.name = $.name;
        this.virtualMachineId = $.virtualMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineConfigurationAssignmentArgs $;

        public Builder() {
            $ = new VirtualMachineConfigurationAssignmentArgs();
        }

        public Builder(VirtualMachineConfigurationAssignmentArgs defaults) {
            $ = new VirtualMachineConfigurationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration A `configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<VirtualMachineConfigurationAssignmentConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration A `configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(VirtualMachineConfigurationAssignmentConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param location The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param virtualMachineId The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(Output<String> virtualMachineId) {
            $.virtualMachineId = virtualMachineId;
            return this;
        }

        /**
         * @param virtualMachineId The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(String virtualMachineId) {
            return virtualMachineId(Output.of(virtualMachineId));
        }

        public VirtualMachineConfigurationAssignmentArgs build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.virtualMachineId = Objects.requireNonNull($.virtualMachineId, "expected parameter 'virtualMachineId' to be non-null");
            return $;
        }
    }

}