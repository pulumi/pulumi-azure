// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey {
    /**
     * @return The URL to the Key Vault Key used as the Key Encryption Key that the Managed Disk will be associated with. This can be found as `id` on the `azure.keyvault.Key` resource. Changing this forces a new resource to be created.
     * 
     */
    private String keyUrl;
    /**
     * @return The ID of the Key Vault. This can be found as `id` on the `azure.keyvault.KeyVault` resource. Changing this forces a new resource to be created.
     * 
     */
    private String vaultId;

    private ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey() {}
    /**
     * @return The URL to the Key Vault Key used as the Key Encryption Key that the Managed Disk will be associated with. This can be found as `id` on the `azure.keyvault.Key` resource. Changing this forces a new resource to be created.
     * 
     */
    public String keyUrl() {
        return this.keyUrl;
    }
    /**
     * @return The ID of the Key Vault. This can be found as `id` on the `azure.keyvault.KeyVault` resource. Changing this forces a new resource to be created.
     * 
     */
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyUrl;
        private String vaultId;
        public Builder() {}
        public Builder(ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.vaultId = defaults.vaultId;
        }

        @CustomType.Setter
        public Builder keyUrl(String keyUrl) {
            if (keyUrl == null) {
              throw new MissingRequiredPropertyException("ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey", "keyUrl");
            }
            this.keyUrl = keyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder vaultId(String vaultId) {
            if (vaultId == null) {
              throw new MissingRequiredPropertyException("ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey", "vaultId");
            }
            this.vaultId = vaultId;
            return this;
        }
        public ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey build() {
            final var _resultValue = new ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey();
            _resultValue.keyUrl = keyUrl;
            _resultValue.vaultId = vaultId;
            return _resultValue;
        }
    }
}
