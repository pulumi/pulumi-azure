// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.SharedImageArgs;
import com.pulumi.azure.compute.inputs.SharedImageState;
import com.pulumi.azure.compute.outputs.SharedImageIdentifier;
import com.pulumi.azure.compute.outputs.SharedImagePurchasePlan;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Shared Image within a Shared Image Gallery.
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
 * import com.pulumi.azure.compute.SharedImageGallery;
 * import com.pulumi.azure.compute.SharedImageGalleryArgs;
 * import com.pulumi.azure.compute.SharedImage;
 * import com.pulumi.azure.compute.SharedImageArgs;
 * import com.pulumi.azure.compute.inputs.SharedImageIdentifierArgs;
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
 *         var exampleSharedImageGallery = new SharedImageGallery("exampleSharedImageGallery", SharedImageGalleryArgs.builder()
 *             .name("example_image_gallery")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .description("Shared images and things.")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Hello", "There"),
 *                 Map.entry("World", "Example")
 *             ))
 *             .build());
 * 
 *         var exampleSharedImage = new SharedImage("exampleSharedImage", SharedImageArgs.builder()
 *             .name("my-image")
 *             .galleryName(exampleSharedImageGallery.name())
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .osType("Linux")
 *             .identifier(SharedImageIdentifierArgs.builder()
 *                 .publisher("PublisherName")
 *                 .offer("OfferName")
 *                 .sku("ExampleSku")
 *                 .build())
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
 * * `Microsoft.Compute`: 2022-03-03
 * 
 * ## Import
 * 
 * Shared Images can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:compute/sharedImage:SharedImage image1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/galleries/gallery1/images/image1
 * ```
 * 
 */
@ResourceType(type="azure:compute/sharedImage:SharedImage")
public class SharedImage extends com.pulumi.resources.CustomResource {
    /**
     * Specifies if the Shared Image supports Accelerated Network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="acceleratedNetworkSupportEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> acceleratedNetworkSupportEnabled;

    /**
     * @return Specifies if the Shared Image supports Accelerated Network. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> acceleratedNetworkSupportEnabled() {
        return Codegen.optional(this.acceleratedNetworkSupportEnabled);
    }
    /**
     * CPU architecture supported by an OS. Possible values are `x64` and `Arm64`. Defaults to `x64`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="architecture", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> architecture;

    /**
     * @return CPU architecture supported by an OS. Possible values are `x64` and `Arm64`. Defaults to `x64`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> architecture() {
        return Codegen.optional(this.architecture);
    }
    /**
     * Specifies if Confidential Virtual Machines enabled. It will enable all the features of trusted, with higher confidentiality features for isolate machines or encrypted data. Available for Gen2 machines. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only one of `trusted_launch_supported`, `trusted_launch_enabled`, `confidential_vm_supported` and `confidential_vm_enabled` can be specified.
     * 
     */
    @Export(name="confidentialVmEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> confidentialVmEnabled;

    /**
     * @return Specifies if Confidential Virtual Machines enabled. It will enable all the features of trusted, with higher confidentiality features for isolate machines or encrypted data. Available for Gen2 machines. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only one of `trusted_launch_supported`, `trusted_launch_enabled`, `confidential_vm_supported` and `confidential_vm_enabled` can be specified.
     * 
     */
    public Output<Optional<Boolean>> confidentialVmEnabled() {
        return Codegen.optional(this.confidentialVmEnabled);
    }
    /**
     * Specifies if supports creation of both Confidential virtual machines and Gen2 virtual machines with standard security from a compatible Gen2 OS disk VHD or Gen2 Managed image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="confidentialVmSupported", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> confidentialVmSupported;

    /**
     * @return Specifies if supports creation of both Confidential virtual machines and Gen2 virtual machines with standard security from a compatible Gen2 OS disk VHD or Gen2 Managed image. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> confidentialVmSupported() {
        return Codegen.optional(this.confidentialVmSupported);
    }
    /**
     * A description of this Shared Image.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this Shared Image.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies if the Shared Image supports NVMe disks. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="diskControllerTypeNvmeEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> diskControllerTypeNvmeEnabled;

    /**
     * @return Specifies if the Shared Image supports NVMe disks. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> diskControllerTypeNvmeEnabled() {
        return Codegen.optional(this.diskControllerTypeNvmeEnabled);
    }
    /**
     * One or more Disk Types not allowed for the Image. Possible values include `Standard_LRS` and `Premium_LRS`.
     * 
     */
    @Export(name="diskTypesNotAlloweds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> diskTypesNotAlloweds;

    /**
     * @return One or more Disk Types not allowed for the Image. Possible values include `Standard_LRS` and `Premium_LRS`.
     * 
     */
    public Output<Optional<List<String>>> diskTypesNotAlloweds() {
        return Codegen.optional(this.diskTypesNotAlloweds);
    }
    /**
     * The end of life date in RFC3339 format of the Image.
     * 
     */
    @Export(name="endOfLifeDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endOfLifeDate;

    /**
     * @return The end of life date in RFC3339 format of the Image.
     * 
     */
    public Output<Optional<String>> endOfLifeDate() {
        return Codegen.optional(this.endOfLifeDate);
    }
    /**
     * The End User Licence Agreement for the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eula", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eula;

    /**
     * @return The End User Licence Agreement for the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> eula() {
        return Codegen.optional(this.eula);
    }
    /**
     * Specifies the name of the Shared Image Gallery in which this Shared Image should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="galleryName", refs={String.class}, tree="[0]")
    private Output<String> galleryName;

    /**
     * @return Specifies the name of the Shared Image Gallery in which this Shared Image should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> galleryName() {
        return this.galleryName;
    }
    /**
     * Specifies if the Shared Image supports hibernation. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hibernationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hibernationEnabled;

    /**
     * @return Specifies if the Shared Image supports hibernation. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> hibernationEnabled() {
        return Codegen.optional(this.hibernationEnabled);
    }
    /**
     * The generation of HyperV that the Virtual Machine used to create the Shared Image is based on. Possible values are `V1` and `V2`. Defaults to `V1`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hyperVGeneration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hyperVGeneration;

    /**
     * @return The generation of HyperV that the Virtual Machine used to create the Shared Image is based on. Possible values are `V1` and `V2`. Defaults to `V1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> hyperVGeneration() {
        return Codegen.optional(this.hyperVGeneration);
    }
    /**
     * An `identifier` block as defined below.
     * 
     */
    @Export(name="identifier", refs={SharedImageIdentifier.class}, tree="[0]")
    private Output<SharedImageIdentifier> identifier;

    /**
     * @return An `identifier` block as defined below.
     * 
     */
    public Output<SharedImageIdentifier> identifier() {
        return this.identifier;
    }
    /**
     * Specifies the supported Azure location where the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Maximum memory in GB recommended for the Image.
     * 
     */
    @Export(name="maxRecommendedMemoryInGb", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxRecommendedMemoryInGb;

    /**
     * @return Maximum memory in GB recommended for the Image.
     * 
     */
    public Output<Optional<Integer>> maxRecommendedMemoryInGb() {
        return Codegen.optional(this.maxRecommendedMemoryInGb);
    }
    /**
     * Maximum count of vCPUs recommended for the Image.
     * 
     */
    @Export(name="maxRecommendedVcpuCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxRecommendedVcpuCount;

    /**
     * @return Maximum count of vCPUs recommended for the Image.
     * 
     */
    public Output<Optional<Integer>> maxRecommendedVcpuCount() {
        return Codegen.optional(this.maxRecommendedVcpuCount);
    }
    /**
     * Minimum memory in GB recommended for the Image.
     * 
     */
    @Export(name="minRecommendedMemoryInGb", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minRecommendedMemoryInGb;

    /**
     * @return Minimum memory in GB recommended for the Image.
     * 
     */
    public Output<Optional<Integer>> minRecommendedMemoryInGb() {
        return Codegen.optional(this.minRecommendedMemoryInGb);
    }
    /**
     * Minimum count of vCPUs recommended for the Image.
     * 
     */
    @Export(name="minRecommendedVcpuCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minRecommendedVcpuCount;

    /**
     * @return Minimum count of vCPUs recommended for the Image.
     * 
     */
    public Output<Optional<Integer>> minRecommendedVcpuCount() {
        return Codegen.optional(this.minRecommendedVcpuCount);
    }
    /**
     * Specifies the name of the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of Operating System present in this Shared Image. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="osType", refs={String.class}, tree="[0]")
    private Output<String> osType;

    /**
     * @return The type of Operating System present in this Shared Image. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }
    /**
     * The URI containing the Privacy Statement associated with this Shared Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="privacyStatementUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privacyStatementUri;

    /**
     * @return The URI containing the Privacy Statement associated with this Shared Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> privacyStatementUri() {
        return Codegen.optional(this.privacyStatementUri);
    }
    /**
     * A `purchase_plan` block as defined below.
     * 
     */
    @Export(name="purchasePlan", refs={SharedImagePurchasePlan.class}, tree="[0]")
    private Output</* @Nullable */ SharedImagePurchasePlan> purchasePlan;

    /**
     * @return A `purchase_plan` block as defined below.
     * 
     */
    public Output<Optional<SharedImagePurchasePlan>> purchasePlan() {
        return Codegen.optional(this.purchasePlan);
    }
    /**
     * The URI containing the Release Notes associated with this Shared Image.
     * 
     */
    @Export(name="releaseNoteUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> releaseNoteUri;

    /**
     * @return The URI containing the Release Notes associated with this Shared Image.
     * 
     */
    public Output<Optional<String>> releaseNoteUri() {
        return Codegen.optional(this.releaseNoteUri);
    }
    /**
     * The name of the resource group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies that the Operating System used inside this Image has not been Generalized (for example, `sysprep` on Windows has not been run). Changing this forces a new resource to be created.
     * 
     * !&gt; **Note:** It&#39;s recommended to Generalize images where possible - Specialized Images reuse the same UUID internally within each Virtual Machine, which can have unintended side-effects.
     * 
     */
    @Export(name="specialized", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> specialized;

    /**
     * @return Specifies that the Operating System used inside this Image has not been Generalized (for example, `sysprep` on Windows has not been run). Changing this forces a new resource to be created.
     * 
     * !&gt; **Note:** It&#39;s recommended to Generalize images where possible - Specialized Images reuse the same UUID internally within each Virtual Machine, which can have unintended side-effects.
     * 
     */
    public Output<Optional<Boolean>> specialized() {
        return Codegen.optional(this.specialized);
    }
    /**
     * A mapping of tags to assign to the Shared Image.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Shared Image.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies if Trusted Launch has to be enabled for the Virtual Machine created from the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="trustedLaunchEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> trustedLaunchEnabled;

    /**
     * @return Specifies if Trusted Launch has to be enabled for the Virtual Machine created from the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> trustedLaunchEnabled() {
        return Codegen.optional(this.trustedLaunchEnabled);
    }
    /**
     * Specifies if supports creation of both Trusted Launch virtual machines and Gen2 virtual machines with standard security created from the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="trustedLaunchSupported", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> trustedLaunchSupported;

    /**
     * @return Specifies if supports creation of both Trusted Launch virtual machines and Gen2 virtual machines with standard security created from the Shared Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> trustedLaunchSupported() {
        return Codegen.optional(this.trustedLaunchSupported);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedImage(java.lang.String name) {
        this(name, SharedImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedImage(java.lang.String name, SharedImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedImage(java.lang.String name, SharedImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImage:SharedImage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SharedImage(java.lang.String name, Output<java.lang.String> id, @Nullable SharedImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImage:SharedImage", name, state, makeResourceOptions(options, id), false);
    }

    private static SharedImageArgs makeArgs(SharedImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SharedImageArgs.Empty : args;
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
    public static SharedImage get(java.lang.String name, Output<java.lang.String> id, @Nullable SharedImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedImage(name, id, state, options);
    }
}
