// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigurationStoreEncryption {
    private String identityClientId;
    private String keyVaultKeyIdentifier;

    private GetConfigurationStoreEncryption() {}
    public String identityClientId() {
        return this.identityClientId;
    }
    public String keyVaultKeyIdentifier() {
        return this.keyVaultKeyIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationStoreEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identityClientId;
        private String keyVaultKeyIdentifier;
        public Builder() {}
        public Builder(GetConfigurationStoreEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyVaultKeyIdentifier = defaults.keyVaultKeyIdentifier;
        }

        @CustomType.Setter
        public Builder identityClientId(String identityClientId) {
            if (identityClientId == null) {
              throw new MissingRequiredPropertyException("GetConfigurationStoreEncryption", "identityClientId");
            }
            this.identityClientId = identityClientId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultKeyIdentifier(String keyVaultKeyIdentifier) {
            if (keyVaultKeyIdentifier == null) {
              throw new MissingRequiredPropertyException("GetConfigurationStoreEncryption", "keyVaultKeyIdentifier");
            }
            this.keyVaultKeyIdentifier = keyVaultKeyIdentifier;
            return this;
        }
        public GetConfigurationStoreEncryption build() {
            final var _resultValue = new GetConfigurationStoreEncryption();
            _resultValue.identityClientId = identityClientId;
            _resultValue.keyVaultKeyIdentifier = keyVaultKeyIdentifier;
            return _resultValue;
        }
    }
}
