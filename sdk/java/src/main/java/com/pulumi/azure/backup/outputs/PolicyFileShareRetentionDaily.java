// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class PolicyFileShareRetentionDaily {
    /**
     * @return The number of daily backups to keep. Must be between `1` and `200` (inclusive)
     * 
     */
    private Integer count;

    private PolicyFileShareRetentionDaily() {}
    /**
     * @return The number of daily backups to keep. Must be between `1` and `200` (inclusive)
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyFileShareRetentionDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        public Builder() {}
        public Builder(PolicyFileShareRetentionDaily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("PolicyFileShareRetentionDaily", "count");
            }
            this.count = count;
            return this;
        }
        public PolicyFileShareRetentionDaily build() {
            final var _resultValue = new PolicyFileShareRetentionDaily();
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
