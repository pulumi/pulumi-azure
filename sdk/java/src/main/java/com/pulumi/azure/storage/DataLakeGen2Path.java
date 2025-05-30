// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.DataLakeGen2PathArgs;
import com.pulumi.azure.storage.inputs.DataLakeGen2PathState;
import com.pulumi.azure.storage.outputs.DataLakeGen2PathAce;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Data Lake Gen2 Path in a File System within an Azure Storage Account.
 * 
 * &gt; **Note:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.DataLakeGen2Filesystem;
 * import com.pulumi.azure.storage.DataLakeGen2FilesystemArgs;
 * import com.pulumi.azure.storage.DataLakeGen2Path;
 * import com.pulumi.azure.storage.DataLakeGen2PathArgs;
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
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplestorageacc")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .accountKind("StorageV2")
 *             .isHnsEnabled(true)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem("exampleDataLakeGen2Filesystem", DataLakeGen2FilesystemArgs.builder()
 *             .name("example")
 *             .storageAccountId(exampleAccount.id())
 *             .build());
 * 
 *         var exampleDataLakeGen2Path = new DataLakeGen2Path("exampleDataLakeGen2Path", DataLakeGen2PathArgs.builder()
 *             .path("example")
 *             .filesystemName(exampleDataLakeGen2Filesystem.name())
 *             .storageAccountId(exampleAccount.id())
 *             .resource("directory")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Data Lake Gen2 Paths can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/dataLakeGen2Path:DataLakeGen2Path example https://account1.dfs.core.windows.net/fileSystem1/path
 * ```
 * 
 */
@ResourceType(type="azure:storage/dataLakeGen2Path:DataLakeGen2Path")
public class DataLakeGen2Path extends com.pulumi.resources.CustomResource {
    /**
     * One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    @Export(name="aces", refs={List.class,DataLakeGen2PathAce.class}, tree="[0,1]")
    private Output<List<DataLakeGen2PathAce>> aces;

    /**
     * @return One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    public Output<List<DataLakeGen2PathAce>> aces() {
        return this.aces;
    }
    /**
     * The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="filesystemName", refs={String.class}, tree="[0]")
    private Output<String> filesystemName;

    /**
     * @return The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> filesystemName() {
        return this.filesystemName;
    }
    /**
     * Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
     * 
     */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output<String> group;

    /**
     * @return Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Specifies the type for path to create. Currently only `directory` is supported. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resource", refs={String.class}, tree="[0]")
    private Output<String> resource;

    /**
     * @return Specifies the type for path to create. Currently only `directory` is supported. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }
    /**
     * Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", refs={String.class}, tree="[0]")
    private Output<String> storageAccountId;

    /**
     * @return Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataLakeGen2Path(java.lang.String name) {
        this(name, DataLakeGen2PathArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataLakeGen2Path(java.lang.String name, DataLakeGen2PathArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataLakeGen2Path(java.lang.String name, DataLakeGen2PathArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/dataLakeGen2Path:DataLakeGen2Path", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataLakeGen2Path(java.lang.String name, Output<java.lang.String> id, @Nullable DataLakeGen2PathState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/dataLakeGen2Path:DataLakeGen2Path", name, state, makeResourceOptions(options, id), false);
    }

    private static DataLakeGen2PathArgs makeArgs(DataLakeGen2PathArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataLakeGen2PathArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static DataLakeGen2Path get(java.lang.String name, Output<java.lang.String> id, @Nullable DataLakeGen2PathState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataLakeGen2Path(name, id, state, options);
    }
}
