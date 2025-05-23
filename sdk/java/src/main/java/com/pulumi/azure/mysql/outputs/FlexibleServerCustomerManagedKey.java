// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleServerCustomerManagedKey {
    /**
     * @return The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
     * 
     */
    private @Nullable String geoBackupKeyVaultKeyId;
    /**
     * @return The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
     * 
     * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    private @Nullable String geoBackupUserAssignedIdentityId;
    /**
     * @return The ID of the Key Vault Key.
     * 
     */
    private @Nullable String keyVaultKeyId;
    /**
     * @return Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
     * 
     */
    private @Nullable String primaryUserAssignedIdentityId;

    private FlexibleServerCustomerManagedKey() {}
    /**
     * @return The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
     * 
     */
    public Optional<String> geoBackupKeyVaultKeyId() {
        return Optional.ofNullable(this.geoBackupKeyVaultKeyId);
    }
    /**
     * @return The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
     * 
     * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    public Optional<String> geoBackupUserAssignedIdentityId() {
        return Optional.ofNullable(this.geoBackupUserAssignedIdentityId);
    }
    /**
     * @return The ID of the Key Vault Key.
     * 
     */
    public Optional<String> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }
    /**
     * @return Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
     * 
     */
    public Optional<String> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleServerCustomerManagedKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String geoBackupKeyVaultKeyId;
        private @Nullable String geoBackupUserAssignedIdentityId;
        private @Nullable String keyVaultKeyId;
        private @Nullable String primaryUserAssignedIdentityId;
        public Builder() {}
        public Builder(FlexibleServerCustomerManagedKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoBackupKeyVaultKeyId = defaults.geoBackupKeyVaultKeyId;
    	      this.geoBackupUserAssignedIdentityId = defaults.geoBackupUserAssignedIdentityId;
    	      this.keyVaultKeyId = defaults.keyVaultKeyId;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
        }

        @CustomType.Setter
        public Builder geoBackupKeyVaultKeyId(@Nullable String geoBackupKeyVaultKeyId) {

            this.geoBackupKeyVaultKeyId = geoBackupKeyVaultKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder geoBackupUserAssignedIdentityId(@Nullable String geoBackupUserAssignedIdentityId) {

            this.geoBackupUserAssignedIdentityId = geoBackupUserAssignedIdentityId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultKeyId(@Nullable String keyVaultKeyId) {

            this.keyVaultKeyId = keyVaultKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder primaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {

            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }
        public FlexibleServerCustomerManagedKey build() {
            final var _resultValue = new FlexibleServerCustomerManagedKey();
            _resultValue.geoBackupKeyVaultKeyId = geoBackupKeyVaultKeyId;
            _resultValue.geoBackupUserAssignedIdentityId = geoBackupUserAssignedIdentityId;
            _resultValue.keyVaultKeyId = keyVaultKeyId;
            _resultValue.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return _resultValue;
        }
    }
}
