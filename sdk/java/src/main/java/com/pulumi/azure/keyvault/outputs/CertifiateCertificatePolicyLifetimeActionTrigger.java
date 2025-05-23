// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificatePolicyLifetimeActionTrigger {
    /**
     * @return The number of days before the Certificate expires that the action associated with this Trigger should run. Conflicts with `lifetime_percentage`.
     * 
     */
    private @Nullable Integer daysBeforeExpiry;
    /**
     * @return The percentage at which during the Certificates Lifetime the action associated with this Trigger should run. Conflicts with `days_before_expiry`.
     * 
     */
    private @Nullable Integer lifetimePercentage;

    private CertifiateCertificatePolicyLifetimeActionTrigger() {}
    /**
     * @return The number of days before the Certificate expires that the action associated with this Trigger should run. Conflicts with `lifetime_percentage`.
     * 
     */
    public Optional<Integer> daysBeforeExpiry() {
        return Optional.ofNullable(this.daysBeforeExpiry);
    }
    /**
     * @return The percentage at which during the Certificates Lifetime the action associated with this Trigger should run. Conflicts with `days_before_expiry`.
     * 
     */
    public Optional<Integer> lifetimePercentage() {
        return Optional.ofNullable(this.lifetimePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicyLifetimeActionTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer daysBeforeExpiry;
        private @Nullable Integer lifetimePercentage;
        public Builder() {}
        public Builder(CertifiateCertificatePolicyLifetimeActionTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysBeforeExpiry = defaults.daysBeforeExpiry;
    	      this.lifetimePercentage = defaults.lifetimePercentage;
        }

        @CustomType.Setter
        public Builder daysBeforeExpiry(@Nullable Integer daysBeforeExpiry) {

            this.daysBeforeExpiry = daysBeforeExpiry;
            return this;
        }
        @CustomType.Setter
        public Builder lifetimePercentage(@Nullable Integer lifetimePercentage) {

            this.lifetimePercentage = lifetimePercentage;
            return this;
        }
        public CertifiateCertificatePolicyLifetimeActionTrigger build() {
            final var _resultValue = new CertifiateCertificatePolicyLifetimeActionTrigger();
            _resultValue.daysBeforeExpiry = daysBeforeExpiry;
            _resultValue.lifetimePercentage = lifetimePercentage;
            return _resultValue;
        }
    }
}
