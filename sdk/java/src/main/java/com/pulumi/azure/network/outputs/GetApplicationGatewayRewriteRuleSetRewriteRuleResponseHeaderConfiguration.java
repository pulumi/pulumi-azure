// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration {
    /**
     * @return Header name of the header configuration.
     * 
     */
    private String headerName;
    /**
     * @return Header value of the header configuration.
     * 
     */
    private String headerValue;

    private GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration() {}
    /**
     * @return Header name of the header configuration.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return Header value of the header configuration.
     * 
     */
    public String headerValue() {
        return this.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerName;
        private String headerValue;
        public Builder() {}
        public Builder(GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration build() {
            final var _resultValue = new GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration();
            _resultValue.headerName = headerName;
            _resultValue.headerValue = headerValue;
            return _resultValue;
        }
    }
}