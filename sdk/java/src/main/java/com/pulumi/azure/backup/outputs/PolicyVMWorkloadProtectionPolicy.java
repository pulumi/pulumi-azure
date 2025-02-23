// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.outputs;

import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicyBackup;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicyRetentionDaily;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicyRetentionMonthly;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicyRetentionWeekly;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicyRetentionYearly;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicySimpleRetention;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyVMWorkloadProtectionPolicy {
    /**
     * @return A `backup` block as defined below.
     * 
     */
    private PolicyVMWorkloadProtectionPolicyBackup backup;
    /**
     * @return The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
     * 
     */
    private String policyType;
    /**
     * @return A `retention_daily` block as defined below.
     * 
     */
    private @Nullable PolicyVMWorkloadProtectionPolicyRetentionDaily retentionDaily;
    /**
     * @return A `retention_monthly` block as defined below.
     * 
     */
    private @Nullable PolicyVMWorkloadProtectionPolicyRetentionMonthly retentionMonthly;
    /**
     * @return A `retention_weekly` block as defined below.
     * 
     */
    private @Nullable PolicyVMWorkloadProtectionPolicyRetentionWeekly retentionWeekly;
    /**
     * @return A `retention_yearly` block as defined below.
     * 
     */
    private @Nullable PolicyVMWorkloadProtectionPolicyRetentionYearly retentionYearly;
    /**
     * @return A `simple_retention` block as defined below.
     * 
     */
    private @Nullable PolicyVMWorkloadProtectionPolicySimpleRetention simpleRetention;

    private PolicyVMWorkloadProtectionPolicy() {}
    /**
     * @return A `backup` block as defined below.
     * 
     */
    public PolicyVMWorkloadProtectionPolicyBackup backup() {
        return this.backup;
    }
    /**
     * @return The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
     * 
     */
    public String policyType() {
        return this.policyType;
    }
    /**
     * @return A `retention_daily` block as defined below.
     * 
     */
    public Optional<PolicyVMWorkloadProtectionPolicyRetentionDaily> retentionDaily() {
        return Optional.ofNullable(this.retentionDaily);
    }
    /**
     * @return A `retention_monthly` block as defined below.
     * 
     */
    public Optional<PolicyVMWorkloadProtectionPolicyRetentionMonthly> retentionMonthly() {
        return Optional.ofNullable(this.retentionMonthly);
    }
    /**
     * @return A `retention_weekly` block as defined below.
     * 
     */
    public Optional<PolicyVMWorkloadProtectionPolicyRetentionWeekly> retentionWeekly() {
        return Optional.ofNullable(this.retentionWeekly);
    }
    /**
     * @return A `retention_yearly` block as defined below.
     * 
     */
    public Optional<PolicyVMWorkloadProtectionPolicyRetentionYearly> retentionYearly() {
        return Optional.ofNullable(this.retentionYearly);
    }
    /**
     * @return A `simple_retention` block as defined below.
     * 
     */
    public Optional<PolicyVMWorkloadProtectionPolicySimpleRetention> simpleRetention() {
        return Optional.ofNullable(this.simpleRetention);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyVMWorkloadProtectionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PolicyVMWorkloadProtectionPolicyBackup backup;
        private String policyType;
        private @Nullable PolicyVMWorkloadProtectionPolicyRetentionDaily retentionDaily;
        private @Nullable PolicyVMWorkloadProtectionPolicyRetentionMonthly retentionMonthly;
        private @Nullable PolicyVMWorkloadProtectionPolicyRetentionWeekly retentionWeekly;
        private @Nullable PolicyVMWorkloadProtectionPolicyRetentionYearly retentionYearly;
        private @Nullable PolicyVMWorkloadProtectionPolicySimpleRetention simpleRetention;
        public Builder() {}
        public Builder(PolicyVMWorkloadProtectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.policyType = defaults.policyType;
    	      this.retentionDaily = defaults.retentionDaily;
    	      this.retentionMonthly = defaults.retentionMonthly;
    	      this.retentionWeekly = defaults.retentionWeekly;
    	      this.retentionYearly = defaults.retentionYearly;
    	      this.simpleRetention = defaults.simpleRetention;
        }

        @CustomType.Setter
        public Builder backup(PolicyVMWorkloadProtectionPolicyBackup backup) {
            if (backup == null) {
              throw new MissingRequiredPropertyException("PolicyVMWorkloadProtectionPolicy", "backup");
            }
            this.backup = backup;
            return this;
        }
        @CustomType.Setter
        public Builder policyType(String policyType) {
            if (policyType == null) {
              throw new MissingRequiredPropertyException("PolicyVMWorkloadProtectionPolicy", "policyType");
            }
            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder retentionDaily(@Nullable PolicyVMWorkloadProtectionPolicyRetentionDaily retentionDaily) {

            this.retentionDaily = retentionDaily;
            return this;
        }
        @CustomType.Setter
        public Builder retentionMonthly(@Nullable PolicyVMWorkloadProtectionPolicyRetentionMonthly retentionMonthly) {

            this.retentionMonthly = retentionMonthly;
            return this;
        }
        @CustomType.Setter
        public Builder retentionWeekly(@Nullable PolicyVMWorkloadProtectionPolicyRetentionWeekly retentionWeekly) {

            this.retentionWeekly = retentionWeekly;
            return this;
        }
        @CustomType.Setter
        public Builder retentionYearly(@Nullable PolicyVMWorkloadProtectionPolicyRetentionYearly retentionYearly) {

            this.retentionYearly = retentionYearly;
            return this;
        }
        @CustomType.Setter
        public Builder simpleRetention(@Nullable PolicyVMWorkloadProtectionPolicySimpleRetention simpleRetention) {

            this.simpleRetention = simpleRetention;
            return this;
        }
        public PolicyVMWorkloadProtectionPolicy build() {
            final var _resultValue = new PolicyVMWorkloadProtectionPolicy();
            _resultValue.backup = backup;
            _resultValue.policyType = policyType;
            _resultValue.retentionDaily = retentionDaily;
            _resultValue.retentionMonthly = retentionMonthly;
            _resultValue.retentionWeekly = retentionWeekly;
            _resultValue.retentionYearly = retentionYearly;
            _resultValue.simpleRetention = simpleRetention;
            return _resultValue;
        }
    }
}
