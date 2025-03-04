// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.videoindexer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountStorageArgs Empty = new AccountStorageArgs();

    /**
     * The ID of the storage account to be associated with the Video Indexer Account. Changing this forces a new Video Indexer Account to be created.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The ID of the storage account to be associated with the Video Indexer Account. Changing this forces a new Video Indexer Account to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * The reference to the user assigned identity to use to access the Storage Account.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The reference to the user assigned identity to use to access the Storage Account.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private AccountStorageArgs() {}

    private AccountStorageArgs(AccountStorageArgs $) {
        this.storageAccountId = $.storageAccountId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountStorageArgs $;

        public Builder() {
            $ = new AccountStorageArgs();
        }

        public Builder(AccountStorageArgs defaults) {
            $ = new AccountStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageAccountId The ID of the storage account to be associated with the Video Indexer Account. Changing this forces a new Video Indexer Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the storage account to be associated with the Video Indexer Account. Changing this forces a new Video Indexer Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param userAssignedIdentityId The reference to the user assigned identity to use to access the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The reference to the user assigned identity to use to access the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public AccountStorageArgs build() {
            if ($.storageAccountId == null) {
                throw new MissingRequiredPropertyException("AccountStorageArgs", "storageAccountId");
            }
            return $;
        }
    }

}
