// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeGitRepoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupInitContainerVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupInitContainerVolumeArgs Empty = new GroupInitContainerVolumeArgs();

    /**
     * Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="emptyDir")
    private @Nullable Output<Boolean> emptyDir;

    /**
     * @return Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> emptyDir() {
        return Optional.ofNullable(this.emptyDir);
    }

    /**
     * A `git_repo` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="gitRepo")
    private @Nullable Output<GroupInitContainerVolumeGitRepoArgs> gitRepo;

    /**
     * @return A `git_repo` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<GroupInitContainerVolumeGitRepoArgs>> gitRepo() {
        return Optional.ofNullable(this.gitRepo);
    }

    /**
     * The path on which this volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="mountPath", required=true)
    private Output<String> mountPath;

    /**
     * @return The path on which this volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> mountPath() {
        return this.mountPath;
    }

    /**
     * The name of the volume mount. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the volume mount. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Exactly one of `empty_dir` volume, `git_repo` volume, `secret` volume or storage account volume (`share_name`, `storage_account_name`, and `storage_account_key`) must be specified.
     * 
     * &gt; **Note:** when using a storage account volume, all of `share_name`, `storage_account_name`, and `storage_account_key` must be specified.
     * 
     * &gt; **Note:** The secret values must be supplied as Base64 encoded strings. The secret values are decoded to their original values when mounted in the volume on the container.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<Map<String,String>> secret;

    /**
     * @return A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Exactly one of `empty_dir` volume, `git_repo` volume, `secret` volume or storage account volume (`share_name`, `storage_account_name`, and `storage_account_key`) must be specified.
     * 
     * &gt; **Note:** when using a storage account volume, all of `share_name`, `storage_account_name`, and `storage_account_key` must be specified.
     * 
     * &gt; **Note:** The secret values must be supplied as Base64 encoded strings. The secret values are decoded to their original values when mounted in the volume on the container.
     * 
     */
    public Optional<Output<Map<String,String>>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    /**
     * @return The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountKey")
    private @Nullable Output<String> storageAccountKey;

    /**
     * @return The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private GroupInitContainerVolumeArgs() {}

    private GroupInitContainerVolumeArgs(GroupInitContainerVolumeArgs $) {
        this.emptyDir = $.emptyDir;
        this.gitRepo = $.gitRepo;
        this.mountPath = $.mountPath;
        this.name = $.name;
        this.readOnly = $.readOnly;
        this.secret = $.secret;
        this.shareName = $.shareName;
        this.storageAccountKey = $.storageAccountKey;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupInitContainerVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupInitContainerVolumeArgs $;

        public Builder() {
            $ = new GroupInitContainerVolumeArgs();
        }

        public Builder(GroupInitContainerVolumeArgs defaults) {
            $ = new GroupInitContainerVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emptyDir Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder emptyDir(@Nullable Output<Boolean> emptyDir) {
            $.emptyDir = emptyDir;
            return this;
        }

        /**
         * @param emptyDir Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder emptyDir(Boolean emptyDir) {
            return emptyDir(Output.of(emptyDir));
        }

        /**
         * @param gitRepo A `git_repo` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(@Nullable Output<GroupInitContainerVolumeGitRepoArgs> gitRepo) {
            $.gitRepo = gitRepo;
            return this;
        }

        /**
         * @param gitRepo A `git_repo` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(GroupInitContainerVolumeGitRepoArgs gitRepo) {
            return gitRepo(Output.of(gitRepo));
        }

        /**
         * @param mountPath The path on which this volume is to be mounted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The path on which this volume is to be mounted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param name The name of the volume mount. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the volume mount. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param readOnly Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secret A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Exactly one of `empty_dir` volume, `git_repo` volume, `secret` volume or storage account volume (`share_name`, `storage_account_name`, and `storage_account_key`) must be specified.
         * 
         * &gt; **Note:** when using a storage account volume, all of `share_name`, `storage_account_name`, and `storage_account_key` must be specified.
         * 
         * &gt; **Note:** The secret values must be supplied as Base64 encoded strings. The secret values are decoded to their original values when mounted in the volume on the container.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<Map<String,String>> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Exactly one of `empty_dir` volume, `git_repo` volume, `secret` volume or storage account volume (`share_name`, `storage_account_name`, and `storage_account_key`) must be specified.
         * 
         * &gt; **Note:** when using a storage account volume, all of `share_name`, `storage_account_name`, and `storage_account_key` must be specified.
         * 
         * &gt; **Note:** The secret values must be supplied as Base64 encoded strings. The secret values are decoded to their original values when mounted in the volume on the container.
         * 
         * @return builder
         * 
         */
        public Builder secret(Map<String,String> secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param shareName The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param storageAccountKey The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param storageAccountName The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public GroupInitContainerVolumeArgs build() {
            if ($.mountPath == null) {
                throw new MissingRequiredPropertyException("GroupInitContainerVolumeArgs", "mountPath");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GroupInitContainerVolumeArgs", "name");
            }
            return $;
        }
    }

}
