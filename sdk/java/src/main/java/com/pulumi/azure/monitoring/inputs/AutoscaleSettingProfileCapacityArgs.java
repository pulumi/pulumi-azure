// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AutoscaleSettingProfileCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleSettingProfileCapacityArgs Empty = new AutoscaleSettingProfileCapacityArgs();

    /**
     * The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
     * 
     */
    @Import(name="default", required=true)
    private Output<Integer> default_;

    /**
     * @return The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
     * 
     */
    public Output<Integer> default_() {
        return this.default_;
    }

    /**
     * The maximum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    @Import(name="maximum", required=true)
    private Output<Integer> maximum;

    /**
     * @return The maximum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    public Output<Integer> maximum() {
        return this.maximum;
    }

    /**
     * The minimum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    @Import(name="minimum", required=true)
    private Output<Integer> minimum;

    /**
     * @return The minimum number of instances for this resource. Valid values are between `0` and `1000`.
     * 
     */
    public Output<Integer> minimum() {
        return this.minimum;
    }

    private AutoscaleSettingProfileCapacityArgs() {}

    private AutoscaleSettingProfileCapacityArgs(AutoscaleSettingProfileCapacityArgs $) {
        this.default_ = $.default_;
        this.maximum = $.maximum;
        this.minimum = $.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleSettingProfileCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleSettingProfileCapacityArgs $;

        public Builder() {
            $ = new AutoscaleSettingProfileCapacityArgs();
        }

        public Builder(AutoscaleSettingProfileCapacityArgs defaults) {
            $ = new AutoscaleSettingProfileCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder default_(Output<Integer> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ The number of instances that are available for scaling if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder default_(Integer default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param maximum The maximum number of instances for this resource. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maximum(Output<Integer> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum The maximum number of instances for this resource. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder maximum(Integer maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param minimum The minimum number of instances for this resource. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder minimum(Output<Integer> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum The minimum number of instances for this resource. Valid values are between `0` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder minimum(Integer minimum) {
            return minimum(Output.of(minimum));
        }

        public AutoscaleSettingProfileCapacityArgs build() {
            $.default_ = Objects.requireNonNull($.default_, "expected parameter 'default' to be non-null");
            $.maximum = Objects.requireNonNull($.maximum, "expected parameter 'maximum' to be non-null");
            $.minimum = Objects.requireNonNull($.minimum, "expected parameter 'minimum' to be non-null");
            return $;
        }
    }

}