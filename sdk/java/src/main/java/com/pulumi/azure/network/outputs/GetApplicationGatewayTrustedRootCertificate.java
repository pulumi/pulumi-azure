// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayTrustedRootCertificate {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private String id;
    /**
     * @return The Secret ID of (base-64 encoded unencrypted pfx) the `Secret` or `Certificate` object stored in Azure KeyVault.
     * 
     */
    private String keyVaultSecretId;
    /**
     * @return The name of this Application Gateway.
     * 
     */
    private String name;

    private GetApplicationGatewayTrustedRootCertificate() {}
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Secret ID of (base-64 encoded unencrypted pfx) the `Secret` or `Certificate` object stored in Azure KeyVault.
     * 
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
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

    public static Builder builder(GetApplicationGatewayTrustedRootCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String keyVaultSecretId;
        private String name;
        public Builder() {}
        public Builder(GetApplicationGatewayTrustedRootCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultSecretId(String keyVaultSecretId) {
            this.keyVaultSecretId = Objects.requireNonNull(keyVaultSecretId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetApplicationGatewayTrustedRootCertificate build() {
            final var _resultValue = new GetApplicationGatewayTrustedRootCertificate();
            _resultValue.id = id;
            _resultValue.keyVaultSecretId = keyVaultSecretId;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}