// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolStartTaskResourceFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolStartTaskResourceFileArgs Empty = new PoolStartTaskResourceFileArgs();

    /**
     * The storage container name in the auto storage account.
     * 
     */
    @Import(name="autoStorageContainerName")
    private @Nullable Output<String> autoStorageContainerName;

    /**
     * @return The storage container name in the auto storage account.
     * 
     */
    public Optional<Output<String>> autoStorageContainerName() {
        return Optional.ofNullable(this.autoStorageContainerName);
    }

    /**
     * The blob prefix to use when downloading blobs from an Azure Storage container. Only the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when `auto_storage_container_name` or `storage_container_url` is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    @Import(name="blobPrefix")
    private @Nullable Output<String> blobPrefix;

    /**
     * @return The blob prefix to use when downloading blobs from an Azure Storage container. Only the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when `auto_storage_container_name` or `storage_container_url` is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    public Optional<Output<String>> blobPrefix() {
        return Optional.ofNullable(this.blobPrefix);
    }

    /**
     * The file permission mode represented as a string in octal format (e.g. `&#34;0644&#34;`). This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a `resource_file` which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    @Import(name="fileMode")
    private @Nullable Output<String> fileMode;

    /**
     * @return The file permission mode represented as a string in octal format (e.g. `&#34;0644&#34;`). This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a `resource_file` which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    public Optional<Output<String>> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }

    /**
     * The location on the compute node to which to download the file, relative to the task&#39;s working directory. If the `http_url` property is specified, the `file_path` is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the `auto_storage_container_name` or `storage_container_url` property is specified, `file_path` is optional and is the directory to download the files to. In the case where `file_path` is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return The location on the compute node to which to download the file, relative to the task&#39;s working directory. If the `http_url` property is specified, the `file_path` is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the `auto_storage_container_name` or `storage_container_url` property is specified, `file_path` is optional and is the directory to download the files to. In the case where `file_path` is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * The URL of the file to download. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @Import(name="httpUrl")
    private @Nullable Output<String> httpUrl;

    /**
     * @return The URL of the file to download. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<Output<String>> httpUrl() {
        return Optional.ofNullable(this.httpUrl);
    }

    /**
     * The URL of the blob container within Azure Blob Storage. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @Import(name="storageContainerUrl")
    private @Nullable Output<String> storageContainerUrl;

    /**
     * @return The URL of the blob container within Azure Blob Storage. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<Output<String>> storageContainerUrl() {
        return Optional.ofNullable(this.storageContainerUrl);
    }

    /**
     * An identity reference from pool&#39;s user assigned managed identity list.
     * 
     * &gt; **Note:** Exactly one of `auto_storage_container_name`, `storage_container_url` and `auto_user` must be specified.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return An identity reference from pool&#39;s user assigned managed identity list.
     * 
     * &gt; **Note:** Exactly one of `auto_storage_container_name`, `storage_container_url` and `auto_user` must be specified.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private PoolStartTaskResourceFileArgs() {}

    private PoolStartTaskResourceFileArgs(PoolStartTaskResourceFileArgs $) {
        this.autoStorageContainerName = $.autoStorageContainerName;
        this.blobPrefix = $.blobPrefix;
        this.fileMode = $.fileMode;
        this.filePath = $.filePath;
        this.httpUrl = $.httpUrl;
        this.storageContainerUrl = $.storageContainerUrl;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolStartTaskResourceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolStartTaskResourceFileArgs $;

        public Builder() {
            $ = new PoolStartTaskResourceFileArgs();
        }

        public Builder(PoolStartTaskResourceFileArgs defaults) {
            $ = new PoolStartTaskResourceFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoStorageContainerName The storage container name in the auto storage account.
         * 
         * @return builder
         * 
         */
        public Builder autoStorageContainerName(@Nullable Output<String> autoStorageContainerName) {
            $.autoStorageContainerName = autoStorageContainerName;
            return this;
        }

        /**
         * @param autoStorageContainerName The storage container name in the auto storage account.
         * 
         * @return builder
         * 
         */
        public Builder autoStorageContainerName(String autoStorageContainerName) {
            return autoStorageContainerName(Output.of(autoStorageContainerName));
        }

        /**
         * @param blobPrefix The blob prefix to use when downloading blobs from an Azure Storage container. Only the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when `auto_storage_container_name` or `storage_container_url` is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
         * 
         * @return builder
         * 
         */
        public Builder blobPrefix(@Nullable Output<String> blobPrefix) {
            $.blobPrefix = blobPrefix;
            return this;
        }

        /**
         * @param blobPrefix The blob prefix to use when downloading blobs from an Azure Storage container. Only the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when `auto_storage_container_name` or `storage_container_url` is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
         * 
         * @return builder
         * 
         */
        public Builder blobPrefix(String blobPrefix) {
            return blobPrefix(Output.of(blobPrefix));
        }

        /**
         * @param fileMode The file permission mode represented as a string in octal format (e.g. `&#34;0644&#34;`). This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a `resource_file` which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
         * 
         * @return builder
         * 
         */
        public Builder fileMode(@Nullable Output<String> fileMode) {
            $.fileMode = fileMode;
            return this;
        }

        /**
         * @param fileMode The file permission mode represented as a string in octal format (e.g. `&#34;0644&#34;`). This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a `resource_file` which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
         * 
         * @return builder
         * 
         */
        public Builder fileMode(String fileMode) {
            return fileMode(Output.of(fileMode));
        }

        /**
         * @param filePath The location on the compute node to which to download the file, relative to the task&#39;s working directory. If the `http_url` property is specified, the `file_path` is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the `auto_storage_container_name` or `storage_container_url` property is specified, `file_path` is optional and is the directory to download the files to. In the case where `file_path` is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath The location on the compute node to which to download the file, relative to the task&#39;s working directory. If the `http_url` property is specified, the `file_path` is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the `auto_storage_container_name` or `storage_container_url` property is specified, `file_path` is optional and is the directory to download the files to. In the case where `file_path` is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param httpUrl The URL of the file to download. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder httpUrl(@Nullable Output<String> httpUrl) {
            $.httpUrl = httpUrl;
            return this;
        }

        /**
         * @param httpUrl The URL of the file to download. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder httpUrl(String httpUrl) {
            return httpUrl(Output.of(httpUrl));
        }

        /**
         * @param storageContainerUrl The URL of the blob container within Azure Blob Storage. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerUrl(@Nullable Output<String> storageContainerUrl) {
            $.storageContainerUrl = storageContainerUrl;
            return this;
        }

        /**
         * @param storageContainerUrl The URL of the blob container within Azure Blob Storage. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerUrl(String storageContainerUrl) {
            return storageContainerUrl(Output.of(storageContainerUrl));
        }

        /**
         * @param userAssignedIdentityId An identity reference from pool&#39;s user assigned managed identity list.
         * 
         * &gt; **Note:** Exactly one of `auto_storage_container_name`, `storage_container_url` and `auto_user` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId An identity reference from pool&#39;s user assigned managed identity list.
         * 
         * &gt; **Note:** Exactly one of `auto_storage_container_name`, `storage_container_url` and `auto_user` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public PoolStartTaskResourceFileArgs build() {
            return $;
        }
    }

}
