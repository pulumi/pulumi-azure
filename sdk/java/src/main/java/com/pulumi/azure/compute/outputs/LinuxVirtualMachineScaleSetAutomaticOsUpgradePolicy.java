// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy {
    /**
     * @return Should automatic rollbacks be disabled?
     * 
     */
    private Boolean disableAutomaticRollback;
    /**
     * @return Should OS Upgrades automatically be applied to Scale Set instances in a rolling fashion when a newer version of the OS Image becomes available?
     * 
     */
    private Boolean enableAutomaticOsUpgrade;

    private LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy() {}
    /**
     * @return Should automatic rollbacks be disabled?
     * 
     */
    public Boolean disableAutomaticRollback() {
        return this.disableAutomaticRollback;
    }
    /**
     * @return Should OS Upgrades automatically be applied to Scale Set instances in a rolling fashion when a newer version of the OS Image becomes available?
     * 
     */
    public Boolean enableAutomaticOsUpgrade() {
        return this.enableAutomaticOsUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableAutomaticRollback;
        private Boolean enableAutomaticOsUpgrade;
        public Builder() {}
        public Builder(LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutomaticRollback = defaults.disableAutomaticRollback;
    	      this.enableAutomaticOsUpgrade = defaults.enableAutomaticOsUpgrade;
        }

        @CustomType.Setter
        public Builder disableAutomaticRollback(Boolean disableAutomaticRollback) {
            this.disableAutomaticRollback = Objects.requireNonNull(disableAutomaticRollback);
            return this;
        }
        @CustomType.Setter
        public Builder enableAutomaticOsUpgrade(Boolean enableAutomaticOsUpgrade) {
            this.enableAutomaticOsUpgrade = Objects.requireNonNull(enableAutomaticOsUpgrade);
            return this;
        }
        public LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy build() {
            final var o = new LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy();
            o.disableAutomaticRollback = disableAutomaticRollback;
            o.enableAutomaticOsUpgrade = enableAutomaticOsUpgrade;
            return o;
        }
    }
}