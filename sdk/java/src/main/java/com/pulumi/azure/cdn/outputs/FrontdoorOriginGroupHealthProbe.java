// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorOriginGroupHealthProbe {
    /**
     * @return Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
     * 
     */
    private Integer intervalInSeconds;
    /**
     * @return Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
     * 
     * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
     * 
     */
    private @Nullable String path;
    /**
     * @return Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
     * 
     */
    private String protocol;
    /**
     * @return Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
     * 
     */
    private @Nullable String requestType;

    private FrontdoorOriginGroupHealthProbe() {}
    /**
     * @return Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
     * 
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }
    /**
     * @return Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
     * 
     * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
     * 
     */
    public Optional<String> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorOriginGroupHealthProbe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer intervalInSeconds;
        private @Nullable String path;
        private String protocol;
        private @Nullable String requestType;
        public Builder() {}
        public Builder(FrontdoorOriginGroupHealthProbe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.requestType = defaults.requestType;
        }

        @CustomType.Setter
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            if (intervalInSeconds == null) {
              throw new MissingRequiredPropertyException("FrontdoorOriginGroupHealthProbe", "intervalInSeconds");
            }
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("FrontdoorOriginGroupHealthProbe", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder requestType(@Nullable String requestType) {

            this.requestType = requestType;
            return this;
        }
        public FrontdoorOriginGroupHealthProbe build() {
            final var _resultValue = new FrontdoorOriginGroupHealthProbe();
            _resultValue.intervalInSeconds = intervalInSeconds;
            _resultValue.path = path;
            _resultValue.protocol = protocol;
            _resultValue.requestType = requestType;
            return _resultValue;
        }
    }
}
