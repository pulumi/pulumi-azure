// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.SnapshotArgs;
import com.pulumi.azure.compute.inputs.SnapshotState;
import com.pulumi.azure.compute.outputs.SnapshotEncryptionSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Disk Snapshot.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.compute.ManagedDisk;
 * import com.pulumi.azure.compute.ManagedDiskArgs;
 * import com.pulumi.azure.compute.Snapshot;
 * import com.pulumi.azure.compute.SnapshotArgs;
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
 *         var exampleManagedDisk = new ManagedDisk(&#34;exampleManagedDisk&#34;, ManagedDiskArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .storageAccountType(&#34;Standard_LRS&#34;)
 *             .createOption(&#34;Empty&#34;)
 *             .diskSizeGb(&#34;10&#34;)
 *             .build());
 * 
 *         var exampleSnapshot = new Snapshot(&#34;exampleSnapshot&#34;, SnapshotArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .createOption(&#34;Copy&#34;)
 *             .sourceUri(exampleManagedDisk.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Snapshots can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/snapshot:Snapshot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/snapshots/snapshot1
 * ```
 * 
 */
@ResourceType(type="azure:compute/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="createOption", type=String.class, parameters={})
    private Output<String> createOption;

    /**
     * @return Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> createOption() {
        return this.createOption;
    }
    /**
     * The size of the Snapshotted Disk in GB.
     * 
     */
    @Export(name="diskSizeGb", type=Integer.class, parameters={})
    private Output<Integer> diskSizeGb;

    /**
     * @return The size of the Snapshotted Disk in GB.
     * 
     */
    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb;
    }
    @Export(name="encryptionSettings", type=SnapshotEncryptionSettings.class, parameters={})
    private Output</* @Nullable */ SnapshotEncryptionSettings> encryptionSettings;

    public Output<Optional<SnapshotEncryptionSettings>> encryptionSettings() {
        return Codegen.optional(this.encryptionSettings);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceResourceId;

    /**
     * @return Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> sourceResourceId() {
        return Codegen.optional(this.sourceResourceId);
    }
    /**
     * Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceUri;

    /**
     * @return Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> sourceUri() {
        return Codegen.optional(this.sourceUri);
    }
    /**
     * Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> storageAccountId() {
        return Codegen.optional(this.storageAccountId);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether Trusted Launch is enabled for the Snapshot.
     * 
     */
    @Export(name="trustedLaunchEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> trustedLaunchEnabled;

    /**
     * @return Whether Trusted Launch is enabled for the Snapshot.
     * 
     */
    public Output<Boolean> trustedLaunchEnabled() {
        return this.trustedLaunchEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}