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