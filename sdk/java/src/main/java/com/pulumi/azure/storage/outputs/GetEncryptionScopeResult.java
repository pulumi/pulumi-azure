// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEncryptionScopeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the Key Vault Key.
     * 
     */
    private String keyVaultKeyId;
    private String name;
    /**
     * @return The source of the Storage Encryption Scope.
     * 
     */
    private String source;
    private String storageAccountId;

    private GetEncryptionScopeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Key Vault Key.
     * 
     */
    public String keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The source of the Storage Encryption Scope.
     * 
     */
    public String source() {
        return this.source;
    }
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionScopeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String keyVaultKeyId;
        private String name;
        private String source;
        private String storageAccountId;
        public Builder() {}
        public Builder(GetEncryptionScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyVaultKeyId = defaults.keyVaultKeyId;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            this.keyVaultKeyId = Objects.requireNonNull(keyVaultKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public GetEncryptionScopeResult build() {
            final var o = new GetEncryptionScopeResult();
            o.id = id;
            o.keyVaultKeyId = keyVaultKeyId;
            o.name = name;
            o.source = source;
            o.storageAccountId = storageAccountId;
            return o;
        }
    }
}