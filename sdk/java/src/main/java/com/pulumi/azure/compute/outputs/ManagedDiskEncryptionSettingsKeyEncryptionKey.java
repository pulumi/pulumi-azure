// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedDiskEncryptionSettingsKeyEncryptionKey {
    /**
     * @return The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
     * 
     */
    private String keyUrl;
    /**
     * @return The ID of the source Key Vault.
     * 
     */
    private String sourceVaultId;

    private ManagedDiskEncryptionSettingsKeyEncryptionKey() {}
    /**
     * @return The URL to the Key Vault Key used as the Key Encryption Key. This can be found as `id` on the `azure.keyvault.Key` resource.
     * 
     */
    public String keyUrl() {
        return this.keyUrl;
    }
    /**
     * @return The ID of the source Key Vault.
     * 
     */
    public String sourceVaultId() {
        return this.sourceVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskEncryptionSettingsKeyEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyUrl;
        private String sourceVaultId;
        public Builder() {}
        public Builder(ManagedDiskEncryptionSettingsKeyEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVaultId = defaults.sourceVaultId;
        }

        @CustomType.Setter
        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        @CustomType.Setter
        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = Objects.requireNonNull(sourceVaultId);
            return this;
        }
        public ManagedDiskEncryptionSettingsKeyEncryptionKey build() {
            final var o = new ManagedDiskEncryptionSettingsKeyEncryptionKey();
            o.keyUrl = keyUrl;
            o.sourceVaultId = sourceVaultId;
            return o;
        }
    }
}