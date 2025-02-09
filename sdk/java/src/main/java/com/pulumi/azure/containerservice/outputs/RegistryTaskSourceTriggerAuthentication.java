// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryTaskSourceTriggerAuthentication {
    /**
     * @return Time in seconds that the token remains valid.
     * 
     */
    private @Nullable Integer expireInSeconds;
    /**
     * @return The refresh token used to refresh the access token.
     * 
     */
    private @Nullable String refreshToken;
    /**
     * @return The scope of the access token.
     * 
     */
    private @Nullable String scope;
    /**
     * @return The access token used to access the source control provider.
     * 
     */
    private String token;
    /**
     * @return The type of the token. Possible values are `PAT` (personal access token) and `OAuth`.
     * 
     */
    private String tokenType;

    private RegistryTaskSourceTriggerAuthentication() {}
    /**
     * @return Time in seconds that the token remains valid.
     * 
     */
    public Optional<Integer> expireInSeconds() {
        return Optional.ofNullable(this.expireInSeconds);
    }
    /**
     * @return The refresh token used to refresh the access token.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * @return The scope of the access token.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The access token used to access the source control provider.
     * 
     */
    public String token() {
        return this.token;
    }
    /**
     * @return The type of the token. Possible values are `PAT` (personal access token) and `OAuth`.
     * 
     */
    public String tokenType() {
        return this.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryTaskSourceTriggerAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer expireInSeconds;
        private @Nullable String refreshToken;
        private @Nullable String scope;
        private String token;
        private String tokenType;
        public Builder() {}
        public Builder(RegistryTaskSourceTriggerAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireInSeconds = defaults.expireInSeconds;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.token = defaults.token;
    	      this.tokenType = defaults.tokenType;
        }

        @CustomType.Setter
        public Builder expireInSeconds(@Nullable Integer expireInSeconds) {

            this.expireInSeconds = expireInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(@Nullable String refreshToken) {

            this.refreshToken = refreshToken;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("RegistryTaskSourceTriggerAuthentication", "token");
            }
            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder tokenType(String tokenType) {
            if (tokenType == null) {
              throw new MissingRequiredPropertyException("RegistryTaskSourceTriggerAuthentication", "tokenType");
            }
            this.tokenType = tokenType;
            return this;
        }
        public RegistryTaskSourceTriggerAuthentication build() {
            final var _resultValue = new RegistryTaskSourceTriggerAuthentication();
            _resultValue.expireInSeconds = expireInSeconds;
            _resultValue.refreshToken = refreshToken;
            _resultValue.scope = scope;
            _resultValue.token = token;
            _resultValue.tokenType = tokenType;
            return _resultValue;
        }
    }
}
