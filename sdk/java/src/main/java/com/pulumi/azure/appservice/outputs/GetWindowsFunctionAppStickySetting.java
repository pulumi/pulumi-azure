// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsFunctionAppStickySetting {
    /**
     * @return A list of `app_setting` names that the Windows Function App will not swap between Slots when a swap operation is triggered.
     * 
     */
    private List<String> appSettingNames;
    /**
     * @return A list of `connection_string` names that the Windows Function App will not swap between Slots when a swap operation is triggered.
     * 
     */
    private List<String> connectionStringNames;

    private GetWindowsFunctionAppStickySetting() {}
    /**
     * @return A list of `app_setting` names that the Windows Function App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public List<String> appSettingNames() {
        return this.appSettingNames;
    }
    /**
     * @return A list of `connection_string` names that the Windows Function App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public List<String> connectionStringNames() {
        return this.connectionStringNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFunctionAppStickySetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> appSettingNames;
        private List<String> connectionStringNames;
        public Builder() {}
        public Builder(GetWindowsFunctionAppStickySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettingNames = defaults.appSettingNames;
    	      this.connectionStringNames = defaults.connectionStringNames;
        }

        @CustomType.Setter
        public Builder appSettingNames(List<String> appSettingNames) {
            if (appSettingNames == null) {
              throw new MissingRequiredPropertyException("GetWindowsFunctionAppStickySetting", "appSettingNames");
            }
            this.appSettingNames = appSettingNames;
            return this;
        }
        public Builder appSettingNames(String... appSettingNames) {
            return appSettingNames(List.of(appSettingNames));
        }
        @CustomType.Setter
        public Builder connectionStringNames(List<String> connectionStringNames) {
            if (connectionStringNames == null) {
              throw new MissingRequiredPropertyException("GetWindowsFunctionAppStickySetting", "connectionStringNames");
            }
            this.connectionStringNames = connectionStringNames;
            return this;
        }
        public Builder connectionStringNames(String... connectionStringNames) {
            return connectionStringNames(List.of(connectionStringNames));
        }
        public GetWindowsFunctionAppStickySetting build() {
            final var _resultValue = new GetWindowsFunctionAppStickySetting();
            _resultValue.appSettingNames = appSettingNames;
            _resultValue.connectionStringNames = connectionStringNames;
            return _resultValue;
        }
    }
}
