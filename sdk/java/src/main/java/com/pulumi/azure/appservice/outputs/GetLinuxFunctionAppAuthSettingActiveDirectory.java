// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppAuthSettingActiveDirectory {
    /**
     * @return The list of Allowed Audiences that are be requested as part of Microsoft Sign-In authentication.
     * 
     */
    private List<String> allowedAudiences;
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    private String clientId;
    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    private String clientSecret;
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    private String clientSecretSettingName;

    private GetLinuxFunctionAppAuthSettingActiveDirectory() {}
    /**
     * @return The list of Allowed Audiences that are be requested as part of Microsoft Sign-In authentication.
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppAuthSettingActiveDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedAudiences;
        private String clientId;
        private String clientSecret;
        private String clientSecretSettingName;
        public Builder() {}
        public Builder(GetLinuxFunctionAppAuthSettingActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
        }

        @CustomType.Setter
        public Builder allowedAudiences(List<String> allowedAudiences) {
            if (allowedAudiences == null) {
              throw new MissingRequiredPropertyException("GetLinuxFunctionAppAuthSettingActiveDirectory", "allowedAudiences");
            }
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetLinuxFunctionAppAuthSettingActiveDirectory", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            if (clientSecret == null) {
              throw new MissingRequiredPropertyException("GetLinuxFunctionAppAuthSettingActiveDirectory", "clientSecret");
            }
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            if (clientSecretSettingName == null) {
              throw new MissingRequiredPropertyException("GetLinuxFunctionAppAuthSettingActiveDirectory", "clientSecretSettingName");
            }
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }
        public GetLinuxFunctionAppAuthSettingActiveDirectory build() {
            final var _resultValue = new GetLinuxFunctionAppAuthSettingActiveDirectory();
            _resultValue.allowedAudiences = allowedAudiences;
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.clientSecretSettingName = clientSecretSettingName;
            return _resultValue;
        }
    }
}
