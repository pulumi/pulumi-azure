// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderFeaturesNetappArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderFeaturesNetappArgs Empty = new ProviderFeaturesNetappArgs();

    /**
     * When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
     * 
     */
    @Import(name="deleteBackupsOnBackupVaultDestroy")
    private @Nullable Output<Boolean> deleteBackupsOnBackupVaultDestroy;

    /**
     * @return When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
     * 
     */
    public Optional<Output<Boolean>> deleteBackupsOnBackupVaultDestroy() {
        return Optional.ofNullable(this.deleteBackupsOnBackupVaultDestroy);
    }

    /**
     * When enabled, the volume will not be destroyed, safeguarding from severe data loss
     * 
     */
    @Import(name="preventVolumeDestruction")
    private @Nullable Output<Boolean> preventVolumeDestruction;

    /**
     * @return When enabled, the volume will not be destroyed, safeguarding from severe data loss
     * 
     */
    public Optional<Output<Boolean>> preventVolumeDestruction() {
        return Optional.ofNullable(this.preventVolumeDestruction);
    }

    private ProviderFeaturesNetappArgs() {}

    private ProviderFeaturesNetappArgs(ProviderFeaturesNetappArgs $) {
        this.deleteBackupsOnBackupVaultDestroy = $.deleteBackupsOnBackupVaultDestroy;
        this.preventVolumeDestruction = $.preventVolumeDestruction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderFeaturesNetappArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderFeaturesNetappArgs $;

        public Builder() {
            $ = new ProviderFeaturesNetappArgs();
        }

        public Builder(ProviderFeaturesNetappArgs defaults) {
            $ = new ProviderFeaturesNetappArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteBackupsOnBackupVaultDestroy When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
         * 
         * @return builder
         * 
         */
        public Builder deleteBackupsOnBackupVaultDestroy(@Nullable Output<Boolean> deleteBackupsOnBackupVaultDestroy) {
            $.deleteBackupsOnBackupVaultDestroy = deleteBackupsOnBackupVaultDestroy;
            return this;
        }

        /**
         * @param deleteBackupsOnBackupVaultDestroy When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
         * 
         * @return builder
         * 
         */
        public Builder deleteBackupsOnBackupVaultDestroy(Boolean deleteBackupsOnBackupVaultDestroy) {
            return deleteBackupsOnBackupVaultDestroy(Output.of(deleteBackupsOnBackupVaultDestroy));
        }

        /**
         * @param preventVolumeDestruction When enabled, the volume will not be destroyed, safeguarding from severe data loss
         * 
         * @return builder
         * 
         */
        public Builder preventVolumeDestruction(@Nullable Output<Boolean> preventVolumeDestruction) {
            $.preventVolumeDestruction = preventVolumeDestruction;
            return this;
        }

        /**
         * @param preventVolumeDestruction When enabled, the volume will not be destroyed, safeguarding from severe data loss
         * 
         * @return builder
         * 
         */
        public Builder preventVolumeDestruction(Boolean preventVolumeDestruction) {
            return preventVolumeDestruction(Output.of(preventVolumeDestruction));
        }

        public ProviderFeaturesNetappArgs build() {
            return $;
        }
    }

}
