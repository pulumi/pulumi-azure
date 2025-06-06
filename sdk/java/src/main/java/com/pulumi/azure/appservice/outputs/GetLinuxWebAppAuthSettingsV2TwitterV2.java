// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppAuthSettingsV2TwitterV2 {
    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * 
     */
    private String consumerKey;
    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * 
     */
    private String consumerSecretSettingName;

    private GetLinuxWebAppAuthSettingsV2TwitterV2() {}
    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * 
     */
    public String consumerKey() {
        return this.consumerKey;
    }
    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * 
     */
    public String consumerSecretSettingName() {
        return this.consumerSecretSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppAuthSettingsV2TwitterV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String consumerKey;
        private String consumerSecretSettingName;
        public Builder() {}
        public Builder(GetLinuxWebAppAuthSettingsV2TwitterV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecretSettingName = defaults.consumerSecretSettingName;
        }

        @CustomType.Setter
        public Builder consumerKey(String consumerKey) {
            if (consumerKey == null) {
              throw new MissingRequiredPropertyException("GetLinuxWebAppAuthSettingsV2TwitterV2", "consumerKey");
            }
            this.consumerKey = consumerKey;
            return this;
        }
        @CustomType.Setter
        public Builder consumerSecretSettingName(String consumerSecretSettingName) {
            if (consumerSecretSettingName == null) {
              throw new MissingRequiredPropertyException("GetLinuxWebAppAuthSettingsV2TwitterV2", "consumerSecretSettingName");
            }
            this.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }
        public GetLinuxWebAppAuthSettingsV2TwitterV2 build() {
            final var _resultValue = new GetLinuxWebAppAuthSettingsV2TwitterV2();
            _resultValue.consumerKey = consumerKey;
            _resultValue.consumerSecretSettingName = consumerSecretSettingName;
            return _resultValue;
        }
    }
}
