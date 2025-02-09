// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DicomServiceCorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DicomServiceCorsArgs Empty = new DicomServiceCorsArgs();

    /**
     * Whether to allow credentials in CORS. Defaults to `false`.
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    /**
     * @return Whether to allow credentials in CORS. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * A list of allowed headers for CORS.
     * 
     */
    @Import(name="allowedHeaders")
    private @Nullable Output<List<String>> allowedHeaders;

    /**
     * @return A list of allowed headers for CORS.
     * 
     */
    public Optional<Output<List<String>>> allowedHeaders() {
        return Optional.ofNullable(this.allowedHeaders);
    }

    /**
     * A list of allowed methods for CORS.
     * 
     */
    @Import(name="allowedMethods")
    private @Nullable Output<List<String>> allowedMethods;

    /**
     * @return A list of allowed methods for CORS.
     * 
     */
    public Optional<Output<List<String>>> allowedMethods() {
        return Optional.ofNullable(this.allowedMethods);
    }

    /**
     * A list of allowed origins for CORS.
     * 
     */
    @Import(name="allowedOrigins")
    private @Nullable Output<List<String>> allowedOrigins;

    /**
     * @return A list of allowed origins for CORS.
     * 
     */
    public Optional<Output<List<String>>> allowedOrigins() {
        return Optional.ofNullable(this.allowedOrigins);
    }

    /**
     * The maximum age in seconds for the CORS configuration (must be between 0 and 99998 inclusive).
     * 
     */
    @Import(name="maxAgeInSeconds")
    private @Nullable Output<Integer> maxAgeInSeconds;

    /**
     * @return The maximum age in seconds for the CORS configuration (must be between 0 and 99998 inclusive).
     * 
     */
    public Optional<Output<Integer>> maxAgeInSeconds() {
        return Optional.ofNullable(this.maxAgeInSeconds);
    }

    private DicomServiceCorsArgs() {}

    private DicomServiceCorsArgs(DicomServiceCorsArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowedHeaders = $.allowedHeaders;
        this.allowedMethods = $.allowedMethods;
        this.allowedOrigins = $.allowedOrigins;
        this.maxAgeInSeconds = $.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomServiceCorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomServiceCorsArgs $;

        public Builder() {
            $ = new DicomServiceCorsArgs();
        }

        public Builder(DicomServiceCorsArgs defaults) {
            $ = new DicomServiceCorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCredentials Whether to allow credentials in CORS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * @param allowCredentials Whether to allow credentials in CORS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        /**
         * @param allowedHeaders A list of allowed headers for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(@Nullable Output<List<String>> allowedHeaders) {
            $.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * @param allowedHeaders A list of allowed headers for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(List<String> allowedHeaders) {
            return allowedHeaders(Output.of(allowedHeaders));
        }

        /**
         * @param allowedHeaders A list of allowed headers for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }

        /**
         * @param allowedMethods A list of allowed methods for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(@Nullable Output<List<String>> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * @param allowedMethods A list of allowed methods for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(List<String> allowedMethods) {
            return allowedMethods(Output.of(allowedMethods));
        }

        /**
         * @param allowedMethods A list of allowed methods for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        /**
         * @param allowedOrigins A list of allowed origins for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(@Nullable Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins A list of allowed origins for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins A list of allowed origins for CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param maxAgeInSeconds The maximum age in seconds for the CORS configuration (must be between 0 and 99998 inclusive).
         * 
         * @return builder
         * 
         */
        public Builder maxAgeInSeconds(@Nullable Output<Integer> maxAgeInSeconds) {
            $.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }

        /**
         * @param maxAgeInSeconds The maximum age in seconds for the CORS configuration (must be between 0 and 99998 inclusive).
         * 
         * @return builder
         * 
         */
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            return maxAgeInSeconds(Output.of(maxAgeInSeconds));
        }

        public DicomServiceCorsArgs build() {
            return $;
        }
    }

}
