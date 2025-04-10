// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class PolicyVMWorkloadProtectionPolicyRetentionDaily {
    /**
     * @return The number of daily backups to keep. Possible values are between `7` and `9999`.
     * 
     */
    private Integer count;

    private PolicyVMWorkloadProtectionPolicyRetentionDaily() {}
    /**
     * @return The number of daily backups to keep. Possible values are between `7` and `9999`.
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyVMWorkloadProtectionPolicyRetentionDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        public Builder() {}
        public Builder(PolicyVMWorkloadProtectionPolicyRetentionDaily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("PolicyVMWorkloadProtectionPolicyRetentionDaily", "count");
            }
            this.count = count;
            return this;
        }
        public PolicyVMWorkloadProtectionPolicyRetentionDaily build() {
            final var _resultValue = new PolicyVMWorkloadProtectionPolicyRetentionDaily();
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
