// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetFrontdoorOriginGroupLoadBalancing {
    /**
     * @return Specifies the additional latency in milliseconds for probes to fall into the lowest latency bucket.
     * 
     */
    private Integer additionalLatencyInMilliseconds;
    /**
     * @return Specifies the number of samples to consider for load balancing decisions.
     * 
     */
    private Integer sampleSize;
    /**
     * @return Specifies the number of samples within the sample period that must succeed.
     * 
     */
    private Integer successfulSamplesRequired;

    private GetFrontdoorOriginGroupLoadBalancing() {}
    /**
     * @return Specifies the additional latency in milliseconds for probes to fall into the lowest latency bucket.
     * 
     */
    public Integer additionalLatencyInMilliseconds() {
        return this.additionalLatencyInMilliseconds;
    }
    /**
     * @return Specifies the number of samples to consider for load balancing decisions.
     * 
     */
    public Integer sampleSize() {
        return this.sampleSize;
    }
    /**
     * @return Specifies the number of samples within the sample period that must succeed.
     * 
     */
    public Integer successfulSamplesRequired() {
        return this.successfulSamplesRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrontdoorOriginGroupLoadBalancing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer additionalLatencyInMilliseconds;
        private Integer sampleSize;
        private Integer successfulSamplesRequired;
        public Builder() {}
        public Builder(GetFrontdoorOriginGroupLoadBalancing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLatencyInMilliseconds = defaults.additionalLatencyInMilliseconds;
    	      this.sampleSize = defaults.sampleSize;
    	      this.successfulSamplesRequired = defaults.successfulSamplesRequired;
        }

        @CustomType.Setter
        public Builder additionalLatencyInMilliseconds(Integer additionalLatencyInMilliseconds) {
            this.additionalLatencyInMilliseconds = Objects.requireNonNull(additionalLatencyInMilliseconds);
            return this;
        }
        @CustomType.Setter
        public Builder sampleSize(Integer sampleSize) {
            this.sampleSize = Objects.requireNonNull(sampleSize);
            return this;
        }
        @CustomType.Setter
        public Builder successfulSamplesRequired(Integer successfulSamplesRequired) {
            this.successfulSamplesRequired = Objects.requireNonNull(successfulSamplesRequired);
            return this;
        }
        public GetFrontdoorOriginGroupLoadBalancing build() {
            final var o = new GetFrontdoorOriginGroupLoadBalancing();
            o.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            o.sampleSize = sampleSize;
            o.successfulSamplesRequired = successfulSamplesRequired;
            return o;
        }
    }
}