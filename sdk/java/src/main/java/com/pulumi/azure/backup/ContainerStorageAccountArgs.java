// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ContainerStorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerStorageAccountArgs Empty = new ContainerStorageAccountArgs();

    /**
     * The name of the vault where the storage account will be registered. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the vault where the storage account will be registered. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * Name of the resource group where the vault is located. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group where the vault is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the Storage Account to be registered Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Azure Backup places a Resource Lock on the storage account that will cause deletion to fail until the account is unregistered from Azure Backup
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account to be registered Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Azure Backup places a Resource Lock on the storage account that will cause deletion to fail until the account is unregistered from Azure Backup
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private ContainerStorageAccountArgs() {}

    private ContainerStorageAccountArgs(ContainerStorageAccountArgs $) {
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStorageAccountArgs $;

        public Builder() {
            $ = new ContainerStorageAccountArgs();
        }

        public Builder(ContainerStorageAccountArgs defaults) {
            $ = new ContainerStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recoveryVaultName The name of the vault where the storage account will be registered. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(Output<String> recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param recoveryVaultName The name of the vault where the storage account will be registered. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            return recoveryVaultName(Output.of(recoveryVaultName));
        }

        /**
         * @param resourceGroupName Name of the resource group where the vault is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group where the vault is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccountId The ID of the Storage Account to be registered Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Azure Backup places a Resource Lock on the storage account that will cause deletion to fail until the account is unregistered from Azure Backup
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account to be registered Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Azure Backup places a Resource Lock on the storage account that will cause deletion to fail until the account is unregistered from Azure Backup
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public ContainerStorageAccountArgs build() {
            if ($.recoveryVaultName == null) {
                throw new MissingRequiredPropertyException("ContainerStorageAccountArgs", "recoveryVaultName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ContainerStorageAccountArgs", "resourceGroupName");
            }
            if ($.storageAccountId == null) {
                throw new MissingRequiredPropertyException("ContainerStorageAccountArgs", "storageAccountId");
            }
            return $;
        }
    }

}
