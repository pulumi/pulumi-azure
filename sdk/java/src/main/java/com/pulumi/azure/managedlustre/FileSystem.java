// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managedlustre;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.managedlustre.FileSystemArgs;
import com.pulumi.azure.managedlustre.inputs.FileSystemState;
import com.pulumi.azure.managedlustre.outputs.FileSystemEncryptionKey;
import com.pulumi.azure.managedlustre.outputs.FileSystemHsmSetting;
import com.pulumi.azure.managedlustre.outputs.FileSystemIdentity;
import com.pulumi.azure.managedlustre.outputs.FileSystemMaintenanceWindow;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Managed Lustre File System.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.managedlustre.FileSystem;
 * import com.pulumi.azure.managedlustre.FileSystemArgs;
 * import com.pulumi.azure.managedlustre.inputs.FileSystemMaintenanceWindowArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleFileSystem = new FileSystem(&#34;exampleFileSystem&#34;, FileSystemArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .skuName(&#34;AMLFS-Durable-Premium-250&#34;)
 *             .subnetId(exampleSubnet.id())
 *             .storageCapacityInTb(8)
 *             .zones(&#34;2&#34;)
 *             .maintenanceWindow(FileSystemMaintenanceWindowArgs.builder()
 *                 .dayOfWeek(&#34;Friday&#34;)
 *                 .timeOfDayUtc(&#34;22:00&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Managed Lustre File Systems can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:managedlustre/fileSystem:FileSystem example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageCache/amlFilesystems/amlFilesystem1
 * ```
 * 
 */
@ResourceType(type="azure:managedlustre/fileSystem:FileSystem")
public class FileSystem extends com.pulumi.resources.CustomResource {
    /**
     * An `encryption_key` block as defined below.
     * 
     * &gt; **NOTE:** Removing `encryption_key` forces a new resource to be created.
     * 
     */
    @Export(name="encryptionKey", refs={FileSystemEncryptionKey.class}, tree="[0]")
    private Output</* @Nullable */ FileSystemEncryptionKey> encryptionKey;

    /**
     * @return An `encryption_key` block as defined below.
     * 
     * &gt; **NOTE:** Removing `encryption_key` forces a new resource to be created.
     * 
     */
    public Output<Optional<FileSystemEncryptionKey>> encryptionKey() {
        return Codegen.optional(this.encryptionKey);
    }
    /**
     * A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hsmSetting", refs={FileSystemHsmSetting.class}, tree="[0]")
    private Output</* @Nullable */ FileSystemHsmSetting> hsmSetting;

    /**
     * @return A `hsm_setting` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<FileSystemHsmSetting>> hsmSetting() {
        return Codegen.optional(this.hsmSetting);
    }
    /**
     * An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="identity", refs={FileSystemIdentity.class}, tree="[0]")
    private Output</* @Nullable */ FileSystemIdentity> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<FileSystemIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `maintenance_window` block as defined below.
     * 
     */
    @Export(name="maintenanceWindow", refs={FileSystemMaintenanceWindow.class}, tree="[0]")
    private Output<FileSystemMaintenanceWindow> maintenanceWindow;

    /**
     * @return A `maintenance_window` block as defined below.
     * 
     */
    public Output<FileSystemMaintenanceWindow> maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Managed Lustre File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return The SKU name for the Azure Managed Lustre File System. Possible values are `AMLFS-Durable-Premium-40`, `AMLFS-Durable-Premium-125`, `AMLFS-Durable-Premium-250` and `AMLFS-Durable-Premium-500`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * The size of the Azure Managed Lustre File System in TiB. Possible values are between 8 and 128 and must be divisible by 8. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageCapacityInTb", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageCapacityInTb;

    /**
     * @return The size of the Azure Managed Lustre File System in TiB. Possible values are between 8 and 128 and must be divisible by 8. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> storageCapacityInTb() {
        return this.storageCapacityInTb;
    }
    /**
     * The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The resource ID of the Subnet that is used for managing the Azure Managed Lustre file system and for client-facing operations. This subnet should have at least a /24 subnet mask within the Virtual Network&#39;s address space. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * A mapping of tags which should be assigned to the Azure Managed Lustre File System.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Azure Managed Lustre File System.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> zones;

    /**
     * @return A list of availability zones for the Azure Managed Lustre File System. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileSystem(String name) {
        this(name, FileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileSystem(String name, FileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileSystem(String name, FileSystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:managedlustre/fileSystem:FileSystem", name, args == null ? FileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileSystem(String name, Output<String> id, @Nullable FileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:managedlustre/fileSystem:FileSystem", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FileSystem get(String name, Output<String> id, @Nullable FileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileSystem(name, id, state, options);
    }
}