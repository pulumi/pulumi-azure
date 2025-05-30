// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreFileshareState extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreFileshareState Empty = new DatastoreFileshareState();

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
     * Indicate whether this Machines Learning DataStore is the default for the Workspace.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Indicate whether this Machines Learning DataStore is the default for the Workspace.
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
    @Import(name="serviceDataIdentity")
    private @Nullable Output<String> serviceDataIdentity;

    /**
     * @return Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
     * 
     */
    public Optional<Output<String>> serviceDataIdentity() {
        return Optional.ofNullable(this.serviceDataIdentity);
    }

    /**
     * The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
     * 
     */
    @Import(name="sharedAccessSignature")
    private @Nullable Output<String> sharedAccessSignature;

    /**
     * @return The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
     * 
     */
    public Optional<Output<String>> sharedAccessSignature() {
        return Optional.ofNullable(this.sharedAccessSignature);
    }

    /**
     * The ID of the Storage Account File Share. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Import(name="storageFileshareId")
    private @Nullable Output<String> storageFileshareId;

    /**
     * @return The ID of the Storage Account File Share. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Optional<Output<String>> storageFileshareId() {
        return Optional.ofNullable(this.storageFileshareId);
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
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private DatastoreFileshareState() {}

    private DatastoreFileshareState(DatastoreFileshareState $) {
        this.accountKey = $.accountKey;
        this.description = $.description;
        this.isDefault = $.isDefault;
        this.name = $.name;
        this.serviceDataIdentity = $.serviceDataIdentity;
        this.sharedAccessSignature = $.sharedAccessSignature;
        this.storageFileshareId = $.storageFileshareId;
        this.tags = $.tags;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreFileshareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreFileshareState $;

        public Builder() {
            $ = new DatastoreFileshareState();
        }

        public Builder(DatastoreFileshareState defaults) {
            $ = new DatastoreFileshareState(Objects.requireNonNull(defaults));
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
         * @param isDefault Indicate whether this Machines Learning DataStore is the default for the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Indicate whether this Machines Learning DataStore is the default for the Workspace.
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
         * @param serviceDataIdentity Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
         * 
         * @return builder
         * 
         */
        public Builder serviceDataIdentity(@Nullable Output<String> serviceDataIdentity) {
            $.serviceDataIdentity = serviceDataIdentity;
            return this;
        }

        /**
         * @param serviceDataIdentity Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
         * 
         * @return builder
         * 
         */
        public Builder serviceDataIdentity(String serviceDataIdentity) {
            return serviceDataIdentity(Output.of(serviceDataIdentity));
        }

        /**
         * @param sharedAccessSignature The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
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
         * @return builder
         * 
         */
        public Builder sharedAccessSignature(String sharedAccessSignature) {
            return sharedAccessSignature(Output.of(sharedAccessSignature));
        }

        /**
         * @param storageFileshareId The ID of the Storage Account File Share. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageFileshareId(@Nullable Output<String> storageFileshareId) {
            $.storageFileshareId = storageFileshareId;
            return this;
        }

        /**
         * @param storageFileshareId The ID of the Storage Account File Share. Changing this forces a new Machine Learning DataStore to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageFileshareId(String storageFileshareId) {
            return storageFileshareId(Output.of(storageFileshareId));
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
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
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

        public DatastoreFileshareState build() {
            return $;
        }
    }

}
