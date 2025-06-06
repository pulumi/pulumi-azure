// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.GetSecretsSecret;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String keyVaultId;
    /**
     * @return List containing names of secrets that exist in this Key Vault.
     * 
     */
    private List<String> names;
    /**
     * @return One or more `secrets` blocks as defined below.
     * 
     */
    private List<GetSecretsSecret> secrets;

    private GetSecretsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return List containing names of secrets that exist in this Key Vault.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return One or more `secrets` blocks as defined below.
     * 
     */
    public List<GetSecretsSecret> secrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String keyVaultId;
        private List<String> names;
        private List<GetSecretsSecret> secrets;
        public Builder() {}
        public Builder(GetSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.names = defaults.names;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecretsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            if (keyVaultId == null) {
              throw new MissingRequiredPropertyException("GetSecretsResult", "keyVaultId");
            }
            this.keyVaultId = keyVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetSecretsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder secrets(List<GetSecretsSecret> secrets) {
            if (secrets == null) {
              throw new MissingRequiredPropertyException("GetSecretsResult", "secrets");
            }
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(GetSecretsSecret... secrets) {
            return secrets(List.of(secrets));
        }
        public GetSecretsResult build() {
            final var _resultValue = new GetSecretsResult();
            _resultValue.id = id;
            _resultValue.keyVaultId = keyVaultId;
            _resultValue.names = names;
            _resultValue.secrets = secrets;
            return _resultValue;
        }
    }
}
