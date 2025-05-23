// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayTrustedRootCertificate {
    /**
     * @return The contents of the Trusted Root Certificate which should be used. Required if `key_vault_secret_id` is not set.
     * 
     */
    private @Nullable String data;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return The Secret ID of the (base-64 encoded unencrypted pfx) `Secret` or `Certificate` object stored in Azure KeyVault. You need to enable soft delete for the Key Vault to use this feature. Required if `data` is not set.
     * 
     * &gt; **Note:** To implement certificate rotation, `versionless_secret_id` should be used, although `secret_id` is also supported.
     * 
     * &gt; **Note:** TLS termination with Key Vault certificates is limited to the [v2 SKUs](https://docs.microsoft.com/azure/application-gateway/key-vault-certs).
     * 
     * &gt; **Note:** For TLS termination with Key Vault certificates to work properly, an existing user-assigned managed identity, which Application Gateway uses to retrieve certificates from Key Vault, should be defined via `identity` block. Additionally, access policies in the Key Vault to allow the identity to be granted *get* access to the secret should be defined.
     * 
     */
    private @Nullable String keyVaultSecretId;
    /**
     * @return The Name of the Trusted Root Certificate to use.
     * 
     */
    private String name;

    private ApplicationGatewayTrustedRootCertificate() {}
    /**
     * @return The contents of the Trusted Root Certificate which should be used. Required if `key_vault_secret_id` is not set.
     * 
     */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Secret ID of the (base-64 encoded unencrypted pfx) `Secret` or `Certificate` object stored in Azure KeyVault. You need to enable soft delete for the Key Vault to use this feature. Required if `data` is not set.
     * 
     * &gt; **Note:** To implement certificate rotation, `versionless_secret_id` should be used, although `secret_id` is also supported.
     * 
     * &gt; **Note:** TLS termination with Key Vault certificates is limited to the [v2 SKUs](https://docs.microsoft.com/azure/application-gateway/key-vault-certs).
     * 
     * &gt; **Note:** For TLS termination with Key Vault certificates to work properly, an existing user-assigned managed identity, which Application Gateway uses to retrieve certificates from Key Vault, should be defined via `identity` block. Additionally, access policies in the Key Vault to allow the identity to be granted *get* access to the secret should be defined.
     * 
     */
    public Optional<String> keyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }
    /**
     * @return The Name of the Trusted Root Certificate to use.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedRootCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String data;
        private @Nullable String id;
        private @Nullable String keyVaultSecretId;
        private String name;
        public Builder() {}
        public Builder(ApplicationGatewayTrustedRootCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder data(@Nullable String data) {

            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultSecretId(@Nullable String keyVaultSecretId) {

            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewayTrustedRootCertificate", "name");
            }
            this.name = name;
            return this;
        }
        public ApplicationGatewayTrustedRootCertificate build() {
            final var _resultValue = new ApplicationGatewayTrustedRootCertificate();
            _resultValue.data = data;
            _resultValue.id = id;
            _resultValue.keyVaultSecretId = keyVaultSecretId;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
