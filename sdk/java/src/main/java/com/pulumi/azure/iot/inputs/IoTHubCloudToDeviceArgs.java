// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceFeedbackArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IoTHubCloudToDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IoTHubCloudToDeviceArgs Empty = new IoTHubCloudToDeviceArgs();

    /**
     * The default time to live for cloud-to-device messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<String> defaultTtl;

    /**
     * @return The default time to live for cloud-to-device messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    public Optional<Output<String>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * A `feedback` block as defined below.
     * 
     */
    @Import(name="feedbacks")
    private @Nullable Output<List<IoTHubCloudToDeviceFeedbackArgs>> feedbacks;

    /**
     * @return A `feedback` block as defined below.
     * 
     */
    public Optional<Output<List<IoTHubCloudToDeviceFeedbackArgs>>> feedbacks() {
        return Optional.ofNullable(this.feedbacks);
    }

    /**
     * The maximum delivery count for cloud-to-device per-device queues. This value must be between `1` and `100`. Defaults to `10`.
     * 
     */
    @Import(name="maxDeliveryCount")
    private @Nullable Output<Integer> maxDeliveryCount;

    /**
     * @return The maximum delivery count for cloud-to-device per-device queues. This value must be between `1` and `100`. Defaults to `10`.
     * 
     */
    public Optional<Output<Integer>> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }

    private IoTHubCloudToDeviceArgs() {}

    private IoTHubCloudToDeviceArgs(IoTHubCloudToDeviceArgs $) {
        this.defaultTtl = $.defaultTtl;
        this.feedbacks = $.feedbacks;
        this.maxDeliveryCount = $.maxDeliveryCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IoTHubCloudToDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IoTHubCloudToDeviceArgs $;

        public Builder() {
            $ = new IoTHubCloudToDeviceArgs();
        }

        public Builder(IoTHubCloudToDeviceArgs defaults) {
            $ = new IoTHubCloudToDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultTtl The default time to live for cloud-to-device messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<String> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl The default time to live for cloud-to-device messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(String defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param feedbacks A `feedback` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder feedbacks(@Nullable Output<List<IoTHubCloudToDeviceFeedbackArgs>> feedbacks) {
            $.feedbacks = feedbacks;
            return this;
        }

        /**
         * @param feedbacks A `feedback` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder feedbacks(List<IoTHubCloudToDeviceFeedbackArgs> feedbacks) {
            return feedbacks(Output.of(feedbacks));
        }

        /**
         * @param feedbacks A `feedback` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder feedbacks(IoTHubCloudToDeviceFeedbackArgs... feedbacks) {
            return feedbacks(List.of(feedbacks));
        }

        /**
         * @param maxDeliveryCount The maximum delivery count for cloud-to-device per-device queues. This value must be between `1` and `100`. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder maxDeliveryCount(@Nullable Output<Integer> maxDeliveryCount) {
            $.maxDeliveryCount = maxDeliveryCount;
            return this;
        }

        /**
         * @param maxDeliveryCount The maximum delivery count for cloud-to-device per-device queues. This value must be between `1` and `100`. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder maxDeliveryCount(Integer maxDeliveryCount) {
            return maxDeliveryCount(Output.of(maxDeliveryCount));
        }

        public IoTHubCloudToDeviceArgs build() {
            return $;
        }
    }

}
