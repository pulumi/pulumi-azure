// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.GalleryApplicationAssignmentArgs;
import com.pulumi.azure.compute.inputs.GalleryApplicationAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Machine Gallery Application Assignment.
 * 
 * &gt; **Note:** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It&#39;s recommended to use `ignore_changes` for the `gallery_application` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
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
 * import com.pulumi.azure.compute.ComputeFunctions;
 * import com.pulumi.azure.compute.inputs.GetVirtualMachineArgs;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.compute.SharedImageGallery;
 * import com.pulumi.azure.compute.SharedImageGalleryArgs;
 * import com.pulumi.azure.compute.GalleryApplication;
 * import com.pulumi.azure.compute.GalleryApplicationArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.storage.Blob;
 * import com.pulumi.azure.storage.BlobArgs;
 * import com.pulumi.azure.compute.GalleryApplicationVersion;
 * import com.pulumi.azure.compute.GalleryApplicationVersionArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionManageActionArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionSourceArgs;
 * import com.pulumi.azure.compute.inputs.GalleryApplicationVersionTargetRegionArgs;
 * import com.pulumi.azure.compute.GalleryApplicationAssignment;
 * import com.pulumi.azure.compute.GalleryApplicationAssignmentArgs;
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
 *         final var example = ComputeFunctions.getVirtualMachine(GetVirtualMachineArgs.builder()
 *             .name("example-vm")
 *             .resourceGroupName("example-resources-vm")
 *             .build());
 * 
 *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleSharedImageGallery = new SharedImageGallery("exampleSharedImageGallery", SharedImageGalleryArgs.builder()
 *             .name("examplegallery")
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleGalleryApplication = new GalleryApplication("exampleGalleryApplication", GalleryApplicationArgs.builder()
 *             .name("example-app")
 *             .galleryId(exampleSharedImageGallery.id())
 *             .location(exampleResourceGroup.location())
 *             .supportedOsType("Linux")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplestorage")
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleContainer = new Container("exampleContainer", ContainerArgs.builder()
 *             .name("example-container")
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType("blob")
 *             .build());
 * 
 *         var exampleBlob = new Blob("exampleBlob", BlobArgs.builder()
 *             .name("scripts")
 *             .storageAccountName(exampleAccount.name())
 *             .storageContainerName(exampleContainer.name())
 *             .type("Block")
 *             .sourceContent("[scripts file content]")
 *             .build());
 * 
 *         var exampleGalleryApplicationVersion = new GalleryApplicationVersion("exampleGalleryApplicationVersion", GalleryApplicationVersionArgs.builder()
 *             .name("0.0.1")
 *             .galleryApplicationId(exampleGalleryApplication.id())
 *             .location(exampleGalleryApplication.location())
 *             .manageAction(GalleryApplicationVersionManageActionArgs.builder()
 *                 .install("[install command]")
 *                 .remove("[remove command]")
 *                 .build())
 *             .source(GalleryApplicationVersionSourceArgs.builder()
 *                 .mediaLink(exampleBlob.id())
 *                 .build())
 *             .targetRegions(GalleryApplicationVersionTargetRegionArgs.builder()
 *                 .name(exampleGalleryApplication.location())
 *                 .regionalReplicaCount(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleGalleryApplicationAssignment = new GalleryApplicationAssignment("exampleGalleryApplicationAssignment", GalleryApplicationAssignmentArgs.builder()
 *             .galleryApplicationVersionId(exampleGalleryApplicationVersion.id())
 *             .virtualMachineId(example.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Compute`: 2024-03-01
 * 
 * ## Import
 * 
 * Virtual Machine Gallery Application Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment example subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/machine1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1/versions/galleryApplicationVersion1
 * ```
 * 
 */
@ResourceType(type="azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment")
public class GalleryApplicationAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="configurationBlobUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> configurationBlobUri;

    /**
     * @return Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> configurationBlobUri() {
        return Codegen.optional(this.configurationBlobUri);
    }
    /**
     * The ID of the Gallery Application Version. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="galleryApplicationVersionId", refs={String.class}, tree="[0]")
    private Output<String> galleryApplicationVersionId;

    /**
     * @return The ID of the Gallery Application Version. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> galleryApplicationVersionId() {
        return this.galleryApplicationVersionId;
    }
    /**
     * Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
     * 
     */
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> order;

    /**
     * @return Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> order() {
        return Codegen.optional(this.order);
    }
    /**
     * Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tag;

    /**
     * @return Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> tag() {
        return Codegen.optional(this.tag);
    }
    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineId", refs={String.class}, tree="[0]")
    private Output<String> virtualMachineId;

    /**
     * @return The ID of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GalleryApplicationAssignment(java.lang.String name) {
        this(name, GalleryApplicationAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GalleryApplicationAssignment(java.lang.String name, GalleryApplicationAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryApplicationAssignment(java.lang.String name, GalleryApplicationAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GalleryApplicationAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable GalleryApplicationAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static GalleryApplicationAssignmentArgs makeArgs(GalleryApplicationAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GalleryApplicationAssignmentArgs.Empty : args;
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
    public static GalleryApplicationAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable GalleryApplicationAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GalleryApplicationAssignment(name, id, state, options);
    }
}
