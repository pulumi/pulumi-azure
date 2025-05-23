// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorOriginGroupHealthProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorOriginGroupHealthProbeArgs Empty = new FrontdoorOriginGroupHealthProbeArgs();

    /**
     * Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
     * 
     */
    @Import(name="intervalInSeconds", required=true)
    private Output<Integer> intervalInSeconds;

    /**
     * @return Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
     * 
     */
    public Output<Integer> intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
     * 
     * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
     * 
     * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
     * 
     */
    @Import(name="requestType")
    private @Nullable Output<String> requestType;

    /**
     * @return Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
     * 
     */
    public Optional<Output<String>> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    private FrontdoorOriginGroupHealthProbeArgs() {}

    private FrontdoorOriginGroupHealthProbeArgs(FrontdoorOriginGroupHealthProbeArgs $) {
        this.intervalInSeconds = $.intervalInSeconds;
        this.path = $.path;
        this.protocol = $.protocol;
        this.requestType = $.requestType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorOriginGroupHealthProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorOriginGroupHealthProbeArgs $;

        public Builder() {
            $ = new FrontdoorOriginGroupHealthProbeArgs();
        }

        public Builder(FrontdoorOriginGroupHealthProbeArgs defaults) {
            $ = new FrontdoorOriginGroupHealthProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param intervalInSeconds Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds Specifies the number of seconds between health probes. Possible values are between `1` and `255` seconds (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param path Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
         * 
         * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Specifies the path relative to the origin that is used to determine the health of the origin. Defaults to `/`.
         * 
         * &gt; **Note:** Health probes can only be disabled if there is a single enabled origin in a single enabled origin group. For more information about the `health_probe` settings please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/health-probes).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param protocol Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Specifies the protocol to use for health probe. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param requestType Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
         * 
         * @return builder
         * 
         */
        public Builder requestType(@Nullable Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        /**
         * @param requestType Specifies the type of health probe request that is made. Possible values are `GET` and `HEAD`. Defaults to `HEAD`.
         * 
         * @return builder
         * 
         */
        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        public FrontdoorOriginGroupHealthProbeArgs build() {
            if ($.intervalInSeconds == null) {
                throw new MissingRequiredPropertyException("FrontdoorOriginGroupHealthProbeArgs", "intervalInSeconds");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("FrontdoorOriginGroupHealthProbeArgs", "protocol");
            }
            return $;
        }
    }

}
