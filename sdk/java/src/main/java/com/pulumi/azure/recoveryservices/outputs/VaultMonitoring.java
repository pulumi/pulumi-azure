// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VaultMonitoring {
    /**
     * @return Enabling/Disabling built-in Azure Monitor alerts for security scenarios and job failure scenarios. Defaults to `true`.
     * 
     */
    private @Nullable Boolean alertsForAllJobFailuresEnabled;
    /**
     * @return Enabling/Disabling alerts from the older (classic alerts) solution. Defaults to `true`. More details could be found [here](https://learn.microsoft.com/en-us/azure/backup/monitoring-and-alerts-overview).
     * 
     */
    private @Nullable Boolean alertsForCriticalOperationFailuresEnabled;

    private VaultMonitoring() {}
    /**
     * @return Enabling/Disabling built-in Azure Monitor alerts for security scenarios and job failure scenarios. Defaults to `true`.
     * 
     */
    public Optional<Boolean> alertsForAllJobFailuresEnabled() {
        return Optional.ofNullable(this.alertsForAllJobFailuresEnabled);
    }
    /**
     * @return Enabling/Disabling alerts from the older (classic alerts) solution. Defaults to `true`. More details could be found [here](https://learn.microsoft.com/en-us/azure/backup/monitoring-and-alerts-overview).
     * 
     */
    public Optional<Boolean> alertsForCriticalOperationFailuresEnabled() {
        return Optional.ofNullable(this.alertsForCriticalOperationFailuresEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alertsForAllJobFailuresEnabled;
        private @Nullable Boolean alertsForCriticalOperationFailuresEnabled;
        public Builder() {}
        public Builder(VaultMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertsForAllJobFailuresEnabled = defaults.alertsForAllJobFailuresEnabled;
    	      this.alertsForCriticalOperationFailuresEnabled = defaults.alertsForCriticalOperationFailuresEnabled;
        }

        @CustomType.Setter
        public Builder alertsForAllJobFailuresEnabled(@Nullable Boolean alertsForAllJobFailuresEnabled) {
            this.alertsForAllJobFailuresEnabled = alertsForAllJobFailuresEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder alertsForCriticalOperationFailuresEnabled(@Nullable Boolean alertsForCriticalOperationFailuresEnabled) {
            this.alertsForCriticalOperationFailuresEnabled = alertsForCriticalOperationFailuresEnabled;
            return this;
        }
        public VaultMonitoring build() {
            final var o = new VaultMonitoring();
            o.alertsForAllJobFailuresEnabled = alertsForAllJobFailuresEnabled;
            o.alertsForCriticalOperationFailuresEnabled = alertsForCriticalOperationFailuresEnabled;
            return o;
        }
    }
}