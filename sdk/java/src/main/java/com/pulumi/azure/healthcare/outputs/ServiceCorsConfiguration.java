// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceCorsConfiguration {
    /**
     * @return (Boolean) If credentials are allowed via CORS.
     * 
     */
    private @Nullable Boolean allowCredentials;
    /**
     * @return A set of headers to be allowed via CORS.
     * 
     */
    private @Nullable List<String> allowedHeaders;
    /**
     * @return The methods to be allowed via CORS. Possible values are `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PATCH` and `PUT`.
     * 
     */
    private @Nullable List<String> allowedMethods;
    /**
     * @return A set of origins to be allowed via CORS.
     * 
     */
    private @Nullable List<String> allowedOrigins;
    /**
     * @return The max age to be allowed via CORS.
     * 
     */
    private @Nullable Integer maxAgeInSeconds;

    private ServiceCorsConfiguration() {}
    /**
     * @return (Boolean) If credentials are allowed via CORS.
     * 
     */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * @return A set of headers to be allowed via CORS.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * @return The methods to be allowed via CORS. Possible values are `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PATCH` and `PUT`.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }
    /**
     * @return A set of origins to be allowed via CORS.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * @return The max age to be allowed via CORS.
     * 
     */
    public Optional<Integer> maxAgeInSeconds() {
        return Optional.ofNullable(this.maxAgeInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowedHeaders;
        private @Nullable List<String> allowedMethods;
        private @Nullable List<String> allowedOrigins;
        private @Nullable Integer maxAgeInSeconds;
        public Builder() {}
        public Builder(ServiceCorsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        @CustomType.Setter
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {

            this.allowCredentials = allowCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {

            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        @CustomType.Setter
        public Builder allowedMethods(@Nullable List<String> allowedMethods) {

            this.allowedMethods = allowedMethods;
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        @CustomType.Setter
        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {

            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder maxAgeInSeconds(@Nullable Integer maxAgeInSeconds) {

            this.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }
        public ServiceCorsConfiguration build() {
            final var _resultValue = new ServiceCorsConfiguration();
            _resultValue.allowCredentials = allowCredentials;
            _resultValue.allowedHeaders = allowedHeaders;
            _resultValue.allowedMethods = allowedMethods;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.maxAgeInSeconds = maxAgeInSeconds;
            return _resultValue;
        }
    }
}
