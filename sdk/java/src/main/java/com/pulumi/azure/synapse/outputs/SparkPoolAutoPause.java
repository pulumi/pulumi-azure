// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SparkPoolAutoPause {
    /**
     * @return Number of minutes of idle time before the Spark Pool is automatically paused. Must be between `5` and `10080`.
     * 
     */
    private Integer delayInMinutes;

    private SparkPoolAutoPause() {}
    /**
     * @return Number of minutes of idle time before the Spark Pool is automatically paused. Must be between `5` and `10080`.
     * 
     */
    public Integer delayInMinutes() {
        return this.delayInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkPoolAutoPause defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer delayInMinutes;
        public Builder() {}
        public Builder(SparkPoolAutoPause defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayInMinutes = defaults.delayInMinutes;
        }

        @CustomType.Setter
        public Builder delayInMinutes(Integer delayInMinutes) {
            this.delayInMinutes = Objects.requireNonNull(delayInMinutes);
            return this;
        }
        public SparkPoolAutoPause build() {
            final var o = new SparkPoolAutoPause();
            o.delayInMinutes = delayInMinutes;
            return o;
        }
    }
}