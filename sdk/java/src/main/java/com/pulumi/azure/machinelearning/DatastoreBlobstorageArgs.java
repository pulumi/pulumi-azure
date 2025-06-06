// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreBlobstorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreBlobstorageArgs Empty = new DatastoreBlobstorageArgs();

    /**
     * The access key of the Storage Account. Conflicts with `shared_access_signature`.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    /**
     * @return The access key of the Storage Account. Conflicts with `shared_access_signature`.
     * 
     */
    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
     * 
     * &gt; **Note:** `is_default` can only be set to `true` on update.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
     * 
     * &gt; **Note:** `is_default` can only be set to `true` on update.
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
     * 
     */
    @Import(name="serviceDataAuthIdentity")
    private @Nullable Output<String> serviceDataAuthIdentity;

    /**
     * @return Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
     * 
     */
    public Optional<Output<String>> serviceDataAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAuthIdentity);
    }

    /**
     * The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
     * 
     * &gt; **Note:** One of `account_key` or `shared_access_signature` must be specified.
     * 
     */
    @Import(name="sharedAccessSignature")
    private @Nullable Output<String> sharedAccessSignature;

    /**
     * @return The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
     * 
     * &gt; **Note:** One of `account_key` or `shared_access_signature` must be specified.
     * 
     */
    public Optional<Output<String>> sharedAccessSignature() {
        return Optional.ofNullable(this.sharedAccessSignature);
    }

    /**
     * The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="storageContainerId", required=true)
    private Output<String> storageContainerId;

    /**
     * @return The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<String> storageContainerId() {
        return this.storageContainerId;
    }

    /**
     * A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private DatastoreBlobstorageArgs() {}

    private DatastoreBlobstorageArgs(DatastoreBlobstorageArgs $) {
        this.accountKey = $.accountKey;
        this.description = $.description;
        this.isDefault = $.isDefault;
        this.name = $.name;
        this.serviceDataAuthIdentity = $.serviceDataAuthIdentity;
        this.sharedAccessSignature = $.sharedAccessSignature;
        this.storageContainerId = $.storageContainerId;
        this.tags = $.tags;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreBlobstorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreBlobstorageArgs $;

        public Builder() {
            $ = new DatastoreBlobstorageArgs();
        }

        public Builder(DatastoreBlobstorageArgs defaults) {
            $ = new DatastoreBlobstorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey The access key of the Storage Account. Conflicts with `shared_access_signature`.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey The access key of the Storage Account. Conflicts with `shared_access_signature`.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        /**
         * @param description Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isDefault Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
         * 
         * &gt; **Note:** `is_default` can only be set to `true` on update.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
         * 
         * &gt; **Note:** `is_default` can only be set to `true` on update.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param name The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serviceDataAuthIdentity Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
         * 
         * @return builder
         * 
         */
        public Builder serviceDataAuthIdentity(@Nullable Output<String> serviceDataAuthIdentity) {
            $.serviceDataAuthIdentity = serviceDataAuthIdentity;
            return this;
        }

        /**
         * @param serviceDataAuthIdentity Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
         * 
         * @return builder
         * 
         */
        public Builder serviceDataAuthIdentity(String serviceDataAuthIdentity) {
            return serviceDataAuthIdentity(Output.of(serviceDataAuthIdentity));
        }

        /**
         * @param sharedAccessSignature The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
         * 
         * &gt; **Note:** One of `account_key` or `shared_access_signature` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessSignature(@Nullable Output<String> sharedAccessSignature) {
            $.sharedAccessSignature = sharedAccessSignature;
            return this;
        }

        /**
         * @param sharedAccessSignature The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
         * 
         * &gt; **Note:** One of `account_key` or `shared_access_signature` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessSignature(String sharedAccessSignature) {
            return sharedAccessSignature(Output.of(sharedAccessSignature));
        }

        /**
         * @param storageContainerId The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(Output<String> storageContainerId) {
            $.storageContainerId = storageContainerId;
            return this;
        }

        /**
         * @param storageContainerId The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(String storageContainerId) {
            return storageContainerId(Output.of(storageContainerId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public DatastoreBlobstorageArgs build() {
            if ($.storageContainerId == null) {
                throw new MissingRequiredPropertyException("DatastoreBlobstorageArgs", "storageContainerId");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("DatastoreBlobstorageArgs", "workspaceId");
            }
            return $;
        }
    }

}
