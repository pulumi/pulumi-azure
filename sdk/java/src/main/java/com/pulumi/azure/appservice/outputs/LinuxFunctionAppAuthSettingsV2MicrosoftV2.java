// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LinuxFunctionAppAuthSettingsV2MicrosoftV2 {
    /**
     * @return Specifies a list of Allowed Audiences that will be requested as part of Microsoft Sign-In authentication.
     * 
     */
    private @Nullable List<String> allowedAudiences;
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    private String clientId;
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     * !&gt; **Note:** A setting with this name must exist in `app_settings` to function correctly.
     * 
     */
    private String clientSecretSettingName;
    /**
     * @return The list of Login scopes that should be requested as part of Microsoft Account authentication.
     * 
     */
    private @Nullable List<String> loginScopes;

    private LinuxFunctionAppAuthSettingsV2MicrosoftV2() {}
    /**
     * @return Specifies a list of Allowed Audiences that will be requested as part of Microsoft Sign-In authentication.
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences == null ? List.of() : this.allowedAudiences;
    }
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     * !&gt; **Note:** A setting with this name must exist in `app_settings` to function correctly.
     * 
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }
    /**
     * @return The list of Login scopes that should be requested as part of Microsoft Account authentication.
     * 
     */
    public List<String> loginScopes() {
        return this.loginScopes == null ? List.of() : this.loginScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxFunctionAppAuthSettingsV2MicrosoftV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedAudiences;
        private String clientId;
        private String clientSecretSettingName;
        private @Nullable List<String> loginScopes;
        public Builder() {}
        public Builder(LinuxFunctionAppAuthSettingsV2MicrosoftV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.clientId = defaults.clientId;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.loginScopes = defaults.loginScopes;
        }

        @CustomType.Setter
        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {

            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("LinuxFunctionAppAuthSettingsV2MicrosoftV2", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            if (clientSecretSettingName == null) {
              throw new MissingRequiredPropertyException("LinuxFunctionAppAuthSettingsV2MicrosoftV2", "clientSecretSettingName");
            }
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }
        @CustomType.Setter
        public Builder loginScopes(@Nullable List<String> loginScopes) {

            this.loginScopes = loginScopes;
            return this;
        }
        public Builder loginScopes(String... loginScopes) {
            return loginScopes(List.of(loginScopes));
        }
        public LinuxFunctionAppAuthSettingsV2MicrosoftV2 build() {
            final var _resultValue = new LinuxFunctionAppAuthSettingsV2MicrosoftV2();
            _resultValue.allowedAudiences = allowedAudiences;
            _resultValue.clientId = clientId;
            _resultValue.clientSecretSettingName = clientSecretSettingName;
            _resultValue.loginScopes = loginScopes;
            return _resultValue;
        }
    }
}
