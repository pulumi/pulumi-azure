// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleServerCustomerManagedKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerCustomerManagedKeyArgs Empty = new FlexibleServerCustomerManagedKeyArgs();

    /**
     * The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
     * 
     */
    @Import(name="geoBackupKeyVaultKeyId")
    private @Nullable Output<String> geoBackupKeyVaultKeyId;

    /**
     * @return The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
     * 
     */
    public Optional<Output<String>> geoBackupKeyVaultKeyId() {
        return Optional.ofNullable(this.geoBackupKeyVaultKeyId);
    }

    /**
     * The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
     * 
     * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    @Import(name="geoBackupUserAssignedIdentityId")
    private @Nullable Output<String> geoBackupUserAssignedIdentityId;

    /**
     * @return The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
     * 
     * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    public Optional<Output<String>> geoBackupUserAssignedIdentityId() {
        return Optional.ofNullable(this.geoBackupUserAssignedIdentityId);
    }

    /**
     * The ID of the Key Vault Key.
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key.
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    /**
     * Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
    private @Nullable Output<String> primaryUserAssignedIdentityId;

    /**
     * @return Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
     * 
     */
    public Optional<Output<String>> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }

    private FlexibleServerCustomerManagedKeyArgs() {}

    private FlexibleServerCustomerManagedKeyArgs(FlexibleServerCustomerManagedKeyArgs $) {
        this.geoBackupKeyVaultKeyId = $.geoBackupKeyVaultKeyId;
        this.geoBackupUserAssignedIdentityId = $.geoBackupUserAssignedIdentityId;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.primaryUserAssignedIdentityId = $.primaryUserAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerCustomerManagedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerCustomerManagedKeyArgs $;

        public Builder() {
            $ = new FlexibleServerCustomerManagedKeyArgs();
        }

        public Builder(FlexibleServerCustomerManagedKeyArgs defaults) {
            $ = new FlexibleServerCustomerManagedKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param geoBackupKeyVaultKeyId The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupKeyVaultKeyId(@Nullable Output<String> geoBackupKeyVaultKeyId) {
            $.geoBackupKeyVaultKeyId = geoBackupKeyVaultKeyId;
            return this;
        }

        /**
         * @param geoBackupKeyVaultKeyId The ID of the geo backup Key Vault Key. It can&#39;t cross region and need Customer Managed Key in same region as geo backup.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupKeyVaultKeyId(String geoBackupKeyVaultKeyId) {
            return geoBackupKeyVaultKeyId(Output.of(geoBackupKeyVaultKeyId));
        }

        /**
         * @param geoBackupUserAssignedIdentityId The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
         * 
         * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupUserAssignedIdentityId(@Nullable Output<String> geoBackupUserAssignedIdentityId) {
            $.geoBackupUserAssignedIdentityId = geoBackupUserAssignedIdentityId;
            return this;
        }

        /**
         * @param geoBackupUserAssignedIdentityId The geo backup user managed identity id for a Customer Managed Key. Should be added with `identity_ids`. It can&#39;t cross region and need identity in same region as geo backup.
         * 
         * &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupUserAssignedIdentityId(String geoBackupUserAssignedIdentityId) {
            return geoBackupUserAssignedIdentityId(Output.of(geoBackupUserAssignedIdentityId));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param primaryUserAssignedIdentityId Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            $.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        /**
         * @param primaryUserAssignedIdentityId Specifies the primary user managed identity id for a Customer Managed Key. Should be added with `identity_ids`.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
            return primaryUserAssignedIdentityId(Output.of(primaryUserAssignedIdentityId));
        }

        public FlexibleServerCustomerManagedKeyArgs build() {
            return $;
        }
    }

}
