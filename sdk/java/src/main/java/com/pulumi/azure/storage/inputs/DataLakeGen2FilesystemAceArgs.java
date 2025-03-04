// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataLakeGen2FilesystemAceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataLakeGen2FilesystemAceArgs Empty = new DataLakeGen2FilesystemAceArgs();

    /**
     * Specifies the Object ID of the Azure Active Directory User or Group that the entry relates to. Only valid for `user` or `group` entries.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Specifies the Object ID of the Azure Active Directory User or Group that the entry relates to. Only valid for `user` or `group` entries.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the permissions for the entry in `rwx` form. For example, `rwx` gives full permissions but `r--` only gives read permissions.
     * 
     * More details on ACLs can be found here: &lt;https://docs.microsoft.com/azure/storage/blobs/data-lake-storage-access-control#access-control-lists-on-files-and-directories&gt;
     * 
     */
    @Import(name="permissions", required=true)
    private Output<String> permissions;

    /**
     * @return Specifies the permissions for the entry in `rwx` form. For example, `rwx` gives full permissions but `r--` only gives read permissions.
     * 
     * More details on ACLs can be found here: &lt;https://docs.microsoft.com/azure/storage/blobs/data-lake-storage-access-control#access-control-lists-on-files-and-directories&gt;
     * 
     */
    public Output<String> permissions() {
        return this.permissions;
    }

    /**
     * Specifies whether the ACE represents an `access` entry or a `default` entry. Default value is `access`.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Specifies whether the ACE represents an `access` entry or a `default` entry. Default value is `access`.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Specifies the type of entry. Can be `user`, `group`, `mask` or `other`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of entry. Can be `user`, `group`, `mask` or `other`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DataLakeGen2FilesystemAceArgs() {}

    private DataLakeGen2FilesystemAceArgs(DataLakeGen2FilesystemAceArgs $) {
        this.id = $.id;
        this.permissions = $.permissions;
        this.scope = $.scope;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeGen2FilesystemAceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeGen2FilesystemAceArgs $;

        public Builder() {
            $ = new DataLakeGen2FilesystemAceArgs();
        }

        public Builder(DataLakeGen2FilesystemAceArgs defaults) {
            $ = new DataLakeGen2FilesystemAceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Specifies the Object ID of the Azure Active Directory User or Group that the entry relates to. Only valid for `user` or `group` entries.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Specifies the Object ID of the Azure Active Directory User or Group that the entry relates to. Only valid for `user` or `group` entries.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param permissions Specifies the permissions for the entry in `rwx` form. For example, `rwx` gives full permissions but `r--` only gives read permissions.
         * 
         * More details on ACLs can be found here: &lt;https://docs.microsoft.com/azure/storage/blobs/data-lake-storage-access-control#access-control-lists-on-files-and-directories&gt;
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Specifies the permissions for the entry in `rwx` form. For example, `rwx` gives full permissions but `r--` only gives read permissions.
         * 
         * More details on ACLs can be found here: &lt;https://docs.microsoft.com/azure/storage/blobs/data-lake-storage-access-control#access-control-lists-on-files-and-directories&gt;
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param scope Specifies whether the ACE represents an `access` entry or a `default` entry. Default value is `access`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies whether the ACE represents an `access` entry or a `default` entry. Default value is `access`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param type Specifies the type of entry. Can be `user`, `group`, `mask` or `other`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of entry. Can be `user`, `group`, `mask` or `other`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DataLakeGen2FilesystemAceArgs build() {
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("DataLakeGen2FilesystemAceArgs", "permissions");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DataLakeGen2FilesystemAceArgs", "type");
            }
            return $;
        }
    }

}
