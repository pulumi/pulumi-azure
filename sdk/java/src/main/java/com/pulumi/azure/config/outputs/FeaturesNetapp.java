// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesNetapp {
    /**
     * @return When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
     * 
     */
    private @Nullable Boolean deleteBackupsOnBackupVaultDestroy;
    /**
     * @return When enabled, the volume will not be destroyed, safeguarding from severe data loss
     * 
     */
    private @Nullable Boolean preventVolumeDestruction;

    private FeaturesNetapp() {}
    /**
     * @return When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
     * 
     */
    public Optional<Boolean> deleteBackupsOnBackupVaultDestroy() {
        return Optional.ofNullable(this.deleteBackupsOnBackupVaultDestroy);
    }
    /**
     * @return When enabled, the volume will not be destroyed, safeguarding from severe data loss
     * 
     */
    public Optional<Boolean> preventVolumeDestruction() {
        return Optional.ofNullable(this.preventVolumeDestruction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesNetapp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteBackupsOnBackupVaultDestroy;
        private @Nullable Boolean preventVolumeDestruction;
        public Builder() {}
        public Builder(FeaturesNetapp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteBackupsOnBackupVaultDestroy = defaults.deleteBackupsOnBackupVaultDestroy;
    	      this.preventVolumeDestruction = defaults.preventVolumeDestruction;
        }

        @CustomType.Setter
        public Builder deleteBackupsOnBackupVaultDestroy(@Nullable Boolean deleteBackupsOnBackupVaultDestroy) {

            this.deleteBackupsOnBackupVaultDestroy = deleteBackupsOnBackupVaultDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder preventVolumeDestruction(@Nullable Boolean preventVolumeDestruction) {

            this.preventVolumeDestruction = preventVolumeDestruction;
            return this;
        }
        public FeaturesNetapp build() {
            final var _resultValue = new FeaturesNetapp();
            _resultValue.deleteBackupsOnBackupVaultDestroy = deleteBackupsOnBackupVaultDestroy;
            _resultValue.preventVolumeDestruction = preventVolumeDestruction;
            return _resultValue;
        }
    }
}
