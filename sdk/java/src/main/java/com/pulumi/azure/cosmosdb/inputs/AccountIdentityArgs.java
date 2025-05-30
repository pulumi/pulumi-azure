// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountIdentityArgs Empty = new AccountIdentityArgs();

    /**
     * Specifies a list of User Assigned Managed Identity IDs to be assigned to this Cosmos Account.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Cosmos Account.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The Type of Managed Identity assigned to this Cosmos account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Type of Managed Identity assigned to this Cosmos account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AccountIdentityArgs() {}

    private AccountIdentityArgs(AccountIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountIdentityArgs $;

        public Builder() {
            $ = new AccountIdentityArgs();
        }

        public Builder(AccountIdentityArgs defaults) {
            $ = new AccountIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Cosmos Account.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Cosmos Account.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Cosmos Account.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type The Type of Managed Identity assigned to this Cosmos account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type of Managed Identity assigned to this Cosmos account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccountIdentityArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AccountIdentityArgs", "type");
            }
            return $;
        }
    }

}
