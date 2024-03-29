// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.outputs;

import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancer;
import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer {
    /**
     * @return The full name for the availability set. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String availabilitySetName;
    /**
     * @return A `load_balancer` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancer loadBalancer;
    /**
     * @return One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine> virtualMachines;

    private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer() {}
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
    public Optional<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancer> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }
    /**
     * @return One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine> virtualMachines() {
        return this.virtualMachines == null ? List.of() : this.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availabilitySetName;
        private @Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancer loadBalancer;
        private @Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine> virtualMachines;
        public Builder() {}
        public Builder(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer defaults) {
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
        public Builder loadBalancer(@Nullable ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancer loadBalancer) {

            this.loadBalancer = loadBalancer;
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachines(@Nullable List<ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine> virtualMachines) {

            this.virtualMachines = virtualMachines;
            return this;
        }
        public Builder virtualMachines(ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachine... virtualMachines) {
            return virtualMachines(List.of(virtualMachines));
        }
        public ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer build() {
            final var _resultValue = new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServer();
            _resultValue.availabilitySetName = availabilitySetName;
            _resultValue.loadBalancer = loadBalancer;
            _resultValue.virtualMachines = virtualMachines;
            return _resultValue;
        }
    }
}
