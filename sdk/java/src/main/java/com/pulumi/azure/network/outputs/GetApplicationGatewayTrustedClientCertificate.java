// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayTrustedClientCertificate {
    /**
     * @return The content of the Trusted Client Certificate in use.
     * 
     */
    private String data;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private String id;
    /**
     * @return The name of this Application Gateway.
     * 
     */
    private String name;

    private GetApplicationGatewayTrustedClientCertificate() {}
    /**
     * @return The content of the Trusted Client Certificate in use.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this Application Gateway.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayTrustedClientCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String data;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetApplicationGatewayTrustedClientCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder data(String data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewayTrustedClientCertificate", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewayTrustedClientCertificate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewayTrustedClientCertificate", "name");
            }
            this.name = name;
            return this;
        }
        public GetApplicationGatewayTrustedClientCertificate build() {
            final var _resultValue = new GetApplicationGatewayTrustedClientCertificate();
            _resultValue.data = data;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
