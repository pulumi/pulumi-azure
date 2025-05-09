// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayCustomErrorConfiguration {
    /**
     * @return Error page URL of the application gateway customer error.
     * 
     */
    private String customErrorPageUrl;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return Status code of the application gateway customer error. Possible values are `HttpStatus400`, `HttpStatus403`, `HttpStatus404`, `HttpStatus405`, `HttpStatus408`, `HttpStatus500`, `HttpStatus502`, `HttpStatus503` and `HttpStatus504`
     * 
     */
    private String statusCode;

    private ApplicationGatewayCustomErrorConfiguration() {}
    /**
     * @return Error page URL of the application gateway customer error.
     * 
     */
    public String customErrorPageUrl() {
        return this.customErrorPageUrl;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Status code of the application gateway customer error. Possible values are `HttpStatus400`, `HttpStatus403`, `HttpStatus404`, `HttpStatus405`, `HttpStatus408`, `HttpStatus500`, `HttpStatus502`, `HttpStatus503` and `HttpStatus504`
     * 
     */
    public String statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayCustomErrorConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customErrorPageUrl;
        private @Nullable String id;
        private String statusCode;
        public Builder() {}
        public Builder(ApplicationGatewayCustomErrorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorPageUrl = defaults.customErrorPageUrl;
    	      this.id = defaults.id;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder customErrorPageUrl(String customErrorPageUrl) {
            if (customErrorPageUrl == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewayCustomErrorConfiguration", "customErrorPageUrl");
            }
            this.customErrorPageUrl = customErrorPageUrl;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(String statusCode) {
            if (statusCode == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewayCustomErrorConfiguration", "statusCode");
            }
            this.statusCode = statusCode;
            return this;
        }
        public ApplicationGatewayCustomErrorConfiguration build() {
            final var _resultValue = new ApplicationGatewayCustomErrorConfiguration();
            _resultValue.customErrorPageUrl = customErrorPageUrl;
            _resultValue.id = id;
            _resultValue.statusCode = statusCode;
            return _resultValue;
        }
    }
}
