// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudAppIngressSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudAppIngressSettingsArgs Empty = new SpringCloudAppIngressSettingsArgs();

    /**
     * Specifies how ingress should communicate with this app backend service. Allowed values are `GRPC` and `Default`. Defaults to `Default`.
     * 
     */
    @Import(name="backendProtocol")
    private @Nullable Output<String> backendProtocol;

    /**
     * @return Specifies how ingress should communicate with this app backend service. Allowed values are `GRPC` and `Default`. Defaults to `Default`.
     * 
     */
    public Optional<Output<String>> backendProtocol() {
        return Optional.ofNullable(this.backendProtocol);
    }

    /**
     * Specifies the ingress read time out in seconds. Defaults to `300`.
     * 
     */
    @Import(name="readTimeoutInSeconds")
    private @Nullable Output<Integer> readTimeoutInSeconds;

    /**
     * @return Specifies the ingress read time out in seconds. Defaults to `300`.
     * 
     */
    public Optional<Output<Integer>> readTimeoutInSeconds() {
        return Optional.ofNullable(this.readTimeoutInSeconds);
    }

    /**
     * Specifies the ingress send time out in seconds. Defaults to `60`.
     * 
     */
    @Import(name="sendTimeoutInSeconds")
    private @Nullable Output<Integer> sendTimeoutInSeconds;

    /**
     * @return Specifies the ingress send time out in seconds. Defaults to `60`.
     * 
     */
    public Optional<Output<Integer>> sendTimeoutInSeconds() {
        return Optional.ofNullable(this.sendTimeoutInSeconds);
    }

    /**
     * Specifies the type of the affinity, set this to `Cookie` to enable session affinity. Allowed values are `Cookie` and `None`. Defaults to `None`.
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<String> sessionAffinity;

    /**
     * @return Specifies the type of the affinity, set this to `Cookie` to enable session affinity. Allowed values are `Cookie` and `None`. Defaults to `None`.
     * 
     */
    public Optional<Output<String>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    /**
     * Specifies the time in seconds until the cookie expires.
     * 
     */
    @Import(name="sessionCookieMaxAge")
    private @Nullable Output<Integer> sessionCookieMaxAge;

    /**
     * @return Specifies the time in seconds until the cookie expires.
     * 
     */
    public Optional<Output<Integer>> sessionCookieMaxAge() {
        return Optional.ofNullable(this.sessionCookieMaxAge);
    }

    private SpringCloudAppIngressSettingsArgs() {}

    private SpringCloudAppIngressSettingsArgs(SpringCloudAppIngressSettingsArgs $) {
        this.backendProtocol = $.backendProtocol;
        this.readTimeoutInSeconds = $.readTimeoutInSeconds;
        this.sendTimeoutInSeconds = $.sendTimeoutInSeconds;
        this.sessionAffinity = $.sessionAffinity;
        this.sessionCookieMaxAge = $.sessionCookieMaxAge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudAppIngressSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudAppIngressSettingsArgs $;

        public Builder() {
            $ = new SpringCloudAppIngressSettingsArgs();
        }

        public Builder(SpringCloudAppIngressSettingsArgs defaults) {
            $ = new SpringCloudAppIngressSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendProtocol Specifies how ingress should communicate with this app backend service. Allowed values are `GRPC` and `Default`. Defaults to `Default`.
         * 
         * @return builder
         * 
         */
        public Builder backendProtocol(@Nullable Output<String> backendProtocol) {
            $.backendProtocol = backendProtocol;
            return this;
        }

        /**
         * @param backendProtocol Specifies how ingress should communicate with this app backend service. Allowed values are `GRPC` and `Default`. Defaults to `Default`.
         * 
         * @return builder
         * 
         */
        public Builder backendProtocol(String backendProtocol) {
            return backendProtocol(Output.of(backendProtocol));
        }

        /**
         * @param readTimeoutInSeconds Specifies the ingress read time out in seconds. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder readTimeoutInSeconds(@Nullable Output<Integer> readTimeoutInSeconds) {
            $.readTimeoutInSeconds = readTimeoutInSeconds;
            return this;
        }

        /**
         * @param readTimeoutInSeconds Specifies the ingress read time out in seconds. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder readTimeoutInSeconds(Integer readTimeoutInSeconds) {
            return readTimeoutInSeconds(Output.of(readTimeoutInSeconds));
        }

        /**
         * @param sendTimeoutInSeconds Specifies the ingress send time out in seconds. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder sendTimeoutInSeconds(@Nullable Output<Integer> sendTimeoutInSeconds) {
            $.sendTimeoutInSeconds = sendTimeoutInSeconds;
            return this;
        }

        /**
         * @param sendTimeoutInSeconds Specifies the ingress send time out in seconds. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder sendTimeoutInSeconds(Integer sendTimeoutInSeconds) {
            return sendTimeoutInSeconds(Output.of(sendTimeoutInSeconds));
        }

        /**
         * @param sessionAffinity Specifies the type of the affinity, set this to `Cookie` to enable session affinity. Allowed values are `Cookie` and `None`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * @param sessionAffinity Specifies the type of the affinity, set this to `Cookie` to enable session affinity. Allowed values are `Cookie` and `None`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(String sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        /**
         * @param sessionCookieMaxAge Specifies the time in seconds until the cookie expires.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookieMaxAge(@Nullable Output<Integer> sessionCookieMaxAge) {
            $.sessionCookieMaxAge = sessionCookieMaxAge;
            return this;
        }

        /**
         * @param sessionCookieMaxAge Specifies the time in seconds until the cookie expires.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookieMaxAge(Integer sessionCookieMaxAge) {
            return sessionCookieMaxAge(Output.of(sessionCookieMaxAge));
        }

        public SpringCloudAppIngressSettingsArgs build() {
            return $;
        }
    }

}
