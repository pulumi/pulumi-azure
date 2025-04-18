// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ApplicationGatewayGlobal {
    /**
     * @return Whether Application Gateway&#39;s Request buffer is enabled.
     * 
     */
    private Boolean requestBufferingEnabled;
    /**
     * @return Whether Application Gateway&#39;s Response buffer is enabled.
     * 
     */
    private Boolean responseBufferingEnabled;

    private ApplicationGatewayGlobal() {}
    /**
     * @return Whether Application Gateway&#39;s Request buffer is enabled.
     * 
     */
    public Boolean requestBufferingEnabled() {
        return this.requestBufferingEnabled;
    }
    /**
     * @return Whether Application Gateway&#39;s Response buffer is enabled.
     * 
     */
    public Boolean responseBufferingEnabled() {
        return this.responseBufferingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean requestBufferingEnabled;
        private Boolean responseBufferingEnabled;
        public Builder() {}
        public Builder(ApplicationGatewayGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestBufferingEnabled = defaults.requestBufferingEnabled;
    	      this.responseBufferingEnabled = defaults.responseBufferingEnabled;
        }

        @CustomType.Setter
        public Builder requestBufferingEnabled(Boolean requestBufferingEnabled) {
            if (requestBufferingEnabled == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewayGlobal", "requestBufferingEnabled");
            }
            this.requestBufferingEnabled = requestBufferingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder responseBufferingEnabled(Boolean responseBufferingEnabled) {
            if (responseBufferingEnabled == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewayGlobal", "responseBufferingEnabled");
            }
            this.responseBufferingEnabled = responseBufferingEnabled;
            return this;
        }
        public ApplicationGatewayGlobal build() {
            final var _resultValue = new ApplicationGatewayGlobal();
            _resultValue.requestBufferingEnabled = requestBufferingEnabled;
            _resultValue.responseBufferingEnabled = responseBufferingEnabled;
            return _resultValue;
        }
    }
}
