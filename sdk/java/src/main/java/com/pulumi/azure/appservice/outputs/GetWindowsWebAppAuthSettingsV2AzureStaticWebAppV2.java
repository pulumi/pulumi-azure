// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2 {
    /**
     * @return The OAuth 2.0 client ID used by the app for authentication.
     * 
     */
    private String clientId;

    private GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2() {}
    /**
     * @return The OAuth 2.0 client ID used by the app for authentication.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        public Builder() {}
        public Builder(GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        public GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2 build() {
            final var _resultValue = new GetWindowsWebAppAuthSettingsV2AzureStaticWebAppV2();
            _resultValue.clientId = clientId;
            return _resultValue;
        }
    }
}
