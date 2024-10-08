// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.outputs;

import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer;
import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer {
    /**
     * @return The full name for the availability set. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String availabilitySetName;
    /**
     * @return A `load_balancer` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer loadBalancer;
    /**
     * @return One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> virtualMachines;

    private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer() {}
    /**
     * @return The full name for the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> availabilitySetName() {
        return Optional.ofNullable(this.availabilitySetName);
    }
    /**
     * @return A `load_balancer` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }
    /**
     * @return One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> virtualMachines() {
        return this.virtualMachines == null ? List.of() : this.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availabilitySetName;
        private @Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer loadBalancer;
        private @Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> virtualMachines;
        public Builder() {}
        public Builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilitySetName = defaults.availabilitySetName;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        @CustomType.Setter
        public Builder availabilitySetName(@Nullable String availabilitySetName) {

            this.availabilitySetName = availabilitySetName;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancer(@Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer loadBalancer) {

            this.loadBalancer = loadBalancer;
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachines(@Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> virtualMachines) {

            this.virtualMachines = virtualMachines;
            return this;
        }
        public Builder virtualMachines(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine... virtualMachines) {
            return virtualMachines(List.of(virtualMachines));
        }
        public ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer build() {
            final var _resultValue = new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer();
            _resultValue.availabilitySetName = availabilitySetName;
            _resultValue.loadBalancer = loadBalancer;
            _resultValue.virtualMachines = virtualMachines;
            return _resultValue;
        }
    }
}
