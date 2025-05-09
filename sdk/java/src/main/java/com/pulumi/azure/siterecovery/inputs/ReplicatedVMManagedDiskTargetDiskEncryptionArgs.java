// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.inputs;

import com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicatedVMManagedDiskTargetDiskEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicatedVMManagedDiskTargetDiskEncryptionArgs Empty = new ReplicatedVMManagedDiskTargetDiskEncryptionArgs();

    /**
     * A `disk_encryption_key` block as defined below.
     * 
     */
    @Import(name="diskEncryptionKey", required=true)
    private Output<ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs> diskEncryptionKey;

    /**
     * @return A `disk_encryption_key` block as defined below.
     * 
     */
    public Output<ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs> diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * A `key_encryption_key` block as defined below.
     * 
     */
    @Import(name="keyEncryptionKey")
    private @Nullable Output<ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs> keyEncryptionKey;

    /**
     * @return A `key_encryption_key` block as defined below.
     * 
     */
    public Optional<Output<ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs>> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    private ReplicatedVMManagedDiskTargetDiskEncryptionArgs() {}

    private ReplicatedVMManagedDiskTargetDiskEncryptionArgs(ReplicatedVMManagedDiskTargetDiskEncryptionArgs $) {
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.keyEncryptionKey = $.keyEncryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicatedVMManagedDiskTargetDiskEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicatedVMManagedDiskTargetDiskEncryptionArgs $;

        public Builder() {
            $ = new ReplicatedVMManagedDiskTargetDiskEncryptionArgs();
        }

        public Builder(ReplicatedVMManagedDiskTargetDiskEncryptionArgs defaults) {
            $ = new ReplicatedVMManagedDiskTargetDiskEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionKey A `disk_encryption_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(Output<ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs> diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskEncryptionKey A `disk_encryption_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs diskEncryptionKey) {
            return diskEncryptionKey(Output.of(diskEncryptionKey));
        }

        /**
         * @param keyEncryptionKey A `key_encryption_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder keyEncryptionKey(@Nullable Output<ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs> keyEncryptionKey) {
            $.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        /**
         * @param keyEncryptionKey A `key_encryption_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder keyEncryptionKey(ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs keyEncryptionKey) {
            return keyEncryptionKey(Output.of(keyEncryptionKey));
        }

        public ReplicatedVMManagedDiskTargetDiskEncryptionArgs build() {
            if ($.diskEncryptionKey == null) {
                throw new MissingRequiredPropertyException("ReplicatedVMManagedDiskTargetDiskEncryptionArgs", "diskEncryptionKey");
            }
            return $;
        }
    }

}
