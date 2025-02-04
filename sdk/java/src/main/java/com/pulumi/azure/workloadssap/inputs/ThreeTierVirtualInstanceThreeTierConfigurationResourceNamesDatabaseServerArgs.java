// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.inputs;

import com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs;
import com.pulumi.azure.workloadssap.inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs Empty = new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs();

    /**
     * The full name for the availability set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="availabilitySetName")
    private @Nullable Output<String> availabilitySetName;

    /**
     * @return The full name for the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> availabilitySetName() {
        return Optional.ofNullable(this.availabilitySetName);
    }

    /**
     * A `load_balancer` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs> loadBalancer;

    /**
     * @return A `load_balancer` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualMachines")
    private @Nullable Output<List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs>> virtualMachines;

    /**
     * @return One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs>>> virtualMachines() {
        return Optional.ofNullable(this.virtualMachines);
    }

    private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs() {}

    private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs $) {
        this.availabilitySetName = $.availabilitySetName;
        this.loadBalancer = $.loadBalancer;
        this.virtualMachines = $.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs $;

        public Builder() {
            $ = new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs();
        }

        public Builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs defaults) {
            $ = new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilitySetName The full name for the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder availabilitySetName(@Nullable Output<String> availabilitySetName) {
            $.availabilitySetName = availabilitySetName;
            return this;
        }

        /**
         * @param availabilitySetName The full name for the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder availabilitySetName(String availabilitySetName) {
            return availabilitySetName(Output.of(availabilitySetName));
        }

        /**
         * @param loadBalancer A `load_balancer` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer A `load_balancer` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param virtualMachines One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachines(@Nullable Output<List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs>> virtualMachines) {
            $.virtualMachines = virtualMachines;
            return this;
        }

        /**
         * @param virtualMachines One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachines(List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs> virtualMachines) {
            return virtualMachines(Output.of(virtualMachines));
        }

        /**
         * @param virtualMachines One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachines(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineArgs... virtualMachines) {
            return virtualMachines(List.of(virtualMachines));
        }

        public ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerArgs build() {
            return $;
        }
    }

}
