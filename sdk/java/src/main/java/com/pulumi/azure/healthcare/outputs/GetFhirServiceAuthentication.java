// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFhirServiceAuthentication {
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is `https://&lt;name&gt;.fhir.azurehealthcareapis.com`.
     * 
     */
    private String audience;
    private String authority;
    private Boolean smartProxyEnabled;

    private GetFhirServiceAuthentication() {}
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is `https://&lt;name&gt;.fhir.azurehealthcareapis.com`.
     * 
     */
    public String audience() {
        return this.audience;
    }
    public String authority() {
        return this.authority;
    }
    public Boolean smartProxyEnabled() {
        return this.smartProxyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirServiceAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audience;
        private String authority;
        private Boolean smartProxyEnabled;
        public Builder() {}
        public Builder(GetFhirServiceAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        @CustomType.Setter
        public Builder audience(String audience) {
            if (audience == null) {
              throw new MissingRequiredPropertyException("GetFhirServiceAuthentication", "audience");
            }
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder authority(String authority) {
            if (authority == null) {
              throw new MissingRequiredPropertyException("GetFhirServiceAuthentication", "authority");
            }
            this.authority = authority;
            return this;
        }
        @CustomType.Setter
        public Builder smartProxyEnabled(Boolean smartProxyEnabled) {
            if (smartProxyEnabled == null) {
              throw new MissingRequiredPropertyException("GetFhirServiceAuthentication", "smartProxyEnabled");
            }
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }
        public GetFhirServiceAuthentication build() {
            final var _resultValue = new GetFhirServiceAuthentication();
            _resultValue.audience = audience;
            _resultValue.authority = authority;
            _resultValue.smartProxyEnabled = smartProxyEnabled;
            return _resultValue;
        }
    }
}
