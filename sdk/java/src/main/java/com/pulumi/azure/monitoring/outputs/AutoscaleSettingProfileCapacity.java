// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AutoscaleSettingProfileCapacity {
    /**
     * @return The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
     * 
     */
    private Integer default_;
    /**
     * @return The maximum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    private Integer maximum;
    /**
     * @return The minimum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    private Integer minimum;

    private AutoscaleSettingProfileCapacity() {}
    /**
     * @return The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
     * 
     */
    public Integer default_() {
        return this.default_;
    }
    /**
     * @return The maximum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    public Integer maximum() {
        return this.maximum;
    }
    /**
     * @return The minimum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    public Integer minimum() {
        return this.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingProfileCapacity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer default_;
        private Integer maximum;
        private Integer minimum;
        public Builder() {}
        public Builder(AutoscaleSettingProfileCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        @CustomType.Setter("default")
        public Builder default_(Integer default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        @CustomType.Setter
        public Builder maximum(Integer maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        @CustomType.Setter
        public Builder minimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public AutoscaleSettingProfileCapacity build() {
            final var o = new AutoscaleSettingProfileCapacity();
            o.default_ = default_;
            o.maximum = maximum;
            o.minimum = minimum;
            return o;
        }
    }
}