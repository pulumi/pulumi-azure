// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.outputs;

import com.pulumi.azure.siterecovery.outputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey;
import com.pulumi.azure.siterecovery.outputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicatedVMManagedDiskTargetDiskEncryption {
    /**
     * @return A `disk_encryption_key` block as defined below.
     * 
     */
    private ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey diskEncryptionKey;
    /**
     * @return A `key_encryption_key` block as defined below.
     * 
     */
    private @Nullable ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey keyEncryptionKey;

    private ReplicatedVMManagedDiskTargetDiskEncryption() {}
    /**
     * @return A `disk_encryption_key` block as defined below.
     * 
     */
    public ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * @return A `key_encryption_key` block as defined below.
     * 
     */
    public Optional<ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicatedVMManagedDiskTargetDiskEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey diskEncryptionKey;
        private @Nullable ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey keyEncryptionKey;
        public Builder() {}
        public Builder(ReplicatedVMManagedDiskTargetDiskEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        @CustomType.Setter
        public Builder diskEncryptionKey(ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey diskEncryptionKey) {
            if (diskEncryptionKey == null) {
              throw new MissingRequiredPropertyException("ReplicatedVMManagedDiskTargetDiskEncryption", "diskEncryptionKey");
            }
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder keyEncryptionKey(@Nullable ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey keyEncryptionKey) {

            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public ReplicatedVMManagedDiskTargetDiskEncryption build() {
            final var _resultValue = new ReplicatedVMManagedDiskTargetDiskEncryption();
            _resultValue.diskEncryptionKey = diskEncryptionKey;
            _resultValue.keyEncryptionKey = keyEncryptionKey;
            return _resultValue;
        }
    }
}
