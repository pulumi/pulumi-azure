// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managedlustre.inputs;

import com.pulumi.azure.managedlustre.inputs.FileSystemEncryptionKeyArgs;
import com.pulumi.azure.managedlustre.inputs.FileSystemHsmSettingArgs;
import com.pulumi.azure.managedlustre.inputs.FileSystemIdentityArgs;
import com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemState extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemState Empty = new FileSystemState();

    /**
     * An `encryption_key` block as defined below.
     * 
     * &gt; **Note:** Removing `encryption_key` forces a new resource to be created.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<FileSystemEncryptionKeyArgs> encryptionKey;

    /**
     * @return An `encryption_key` block as defined below.
     * 
     * &gt; **Note:** Removing `encryption_key` forces a new resource to be created.
     * 
     */
    public Optional<Output<FileSystemEncryptionKeyArgs>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hsmSetting")
    private @Nullable Output<FileSystemHsmSettingArgs> hsmSetting;

    /**
     * @return A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<FileSystemHsmSettingArgs>> hsmSetting() {
        return Optional.ofNullable(this.hsmSetting);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<FileSystemIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<FileSystemIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `maintenance_window` block as defined below.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<FileSystemMaintenanceWindowArgs> maintenanceWindow;

    /**
     * @return A `maintenance_window` block as defined below.
     * 
     */
    public Optional<Output<FileSystemMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * IP Address of Managed Lustre File System Services.
     * 
     */
    @Import(name="mgsAddress")
    private @Nullable Output<String> mgsAddress;

    /**
     * @return IP Address of Managed Lustre File System Services.
     * 
     */
    public Optional<Output<String>> mgsAddress() {
        return Optional.ofNullable(this.mgsAddress);
    }

    /**
     * The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The size of the Azure Managed Lustre File System in TiB. The valid values for this field are dependant on which `sku_name` has been defined in the configuration file. For more information on the valid values for this field please see the [product documentation](https://learn.microsoft.com/azure/azure-managed-lustre/create-file-system-resource-manager#file-system-type-and-size-options). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageCapacityInTb")
    private @Nullable Output<Integer> storageCapacityInTb;

    /**
     * @return The size of the Azure Managed Lustre File System in TiB. The valid values for this field are dependant on which `sku_name` has been defined in the configuration file. For more information on the valid values for this field please see the [product documentation](https://learn.microsoft.com/azure/azure-managed-lustre/create-file-system-resource-manager#file-system-type-and-size-options). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> storageCapacityInTb() {
        return Optional.ofNullable(this.storageCapacityInTb);
    }

    /**
     * The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags which should be assigned to the Azure Managed Lustre File System.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Azure Managed Lustre File System.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private FileSystemState() {}

    private FileSystemState(FileSystemState $) {
        this.encryptionKey = $.encryptionKey;
        this.hsmSetting = $.hsmSetting;
        this.identity = $.identity;
        this.location = $.location;
        this.maintenanceWindow = $.maintenanceWindow;
        this.mgsAddress = $.mgsAddress;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.storageCapacityInTb = $.storageCapacityInTb;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemState $;

        public Builder() {
            $ = new FileSystemState();
        }

        public Builder(FileSystemState defaults) {
            $ = new FileSystemState(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionKey An `encryption_key` block as defined below.
         * 
         * &gt; **Note:** Removing `encryption_key` forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<FileSystemEncryptionKeyArgs> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey An `encryption_key` block as defined below.
         * 
         * &gt; **Note:** Removing `encryption_key` forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(FileSystemEncryptionKeyArgs encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param hsmSetting A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hsmSetting(@Nullable Output<FileSystemHsmSettingArgs> hsmSetting) {
            $.hsmSetting = hsmSetting;
            return this;
        }

        /**
         * @param hsmSetting A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hsmSetting(FileSystemHsmSettingArgs hsmSetting) {
            return hsmSetting(Output.of(hsmSetting));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<FileSystemIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(FileSystemIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceWindow A `maintenance_window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<FileSystemMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow A `maintenance_window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(FileSystemMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param mgsAddress IP Address of Managed Lustre File System Services.
         * 
         * @return builder
         * 
         */
        public Builder mgsAddress(@Nullable Output<String> mgsAddress) {
            $.mgsAddress = mgsAddress;
            return this;
        }

        /**
         * @param mgsAddress IP Address of Managed Lustre File System Services.
         * 
         * @return builder
         * 
         */
        public Builder mgsAddress(String mgsAddress) {
            return mgsAddress(Output.of(mgsAddress));
        }

        /**
         * @param name The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param storageCapacityInTb The size of the Azure Managed Lustre File System in TiB. The valid values for this field are dependant on which `sku_name` has been defined in the configuration file. For more information on the valid values for this field please see the [product documentation](https://learn.microsoft.com/azure/azure-managed-lustre/create-file-system-resource-manager#file-system-type-and-size-options). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacityInTb(@Nullable Output<Integer> storageCapacityInTb) {
            $.storageCapacityInTb = storageCapacityInTb;
            return this;
        }

        /**
         * @param storageCapacityInTb The size of the Azure Managed Lustre File System in TiB. The valid values for this field are dependant on which `sku_name` has been defined in the configuration file. For more information on the valid values for this field please see the [product documentation](https://learn.microsoft.com/azure/azure-managed-lustre/create-file-system-resource-manager#file-system-type-and-size-options). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacityInTb(Integer storageCapacityInTb) {
            return storageCapacityInTb(Output.of(storageCapacityInTb));
        }

        /**
         * @param subnetId The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Azure Managed Lustre File System.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Azure Managed Lustre File System.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zones A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public FileSystemState build() {
            return $;
        }
    }

}
