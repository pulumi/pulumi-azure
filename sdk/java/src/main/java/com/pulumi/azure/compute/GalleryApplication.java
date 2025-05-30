// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.GalleryApplicationArgs;
import com.pulumi.azure.compute.inputs.GalleryApplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Gallery Application.
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
 * import com.pulumi.azure.compute.GalleryApplication;
 * import com.pulumi.azure.compute.GalleryApplicationArgs;
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
 *             .name("example-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleSharedImageGallery = new SharedImageGallery("exampleSharedImageGallery", SharedImageGalleryArgs.builder()
 *             .name("examplegallery")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .build());
 * 
 *         var exampleGalleryApplication = new GalleryApplication("exampleGalleryApplication", GalleryApplicationArgs.builder()
 *             .name("example-app")
 *             .galleryId(exampleSharedImageGallery.id())
 *             .location(example.location())
 *             .supportedOsType("Linux")
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
 * Gallery Applications can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:compute/galleryApplication:GalleryApplication example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1
 * ```
 * 
 */
@ResourceType(type="azure:compute/galleryApplication:GalleryApplication")
public class GalleryApplication extends com.pulumi.resources.CustomResource {
    /**
     * A description of the Gallery Application.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the Gallery Application.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The end of life date in RFC3339 format of the Gallery Application.
     * 
     */
    @Export(name="endOfLifeDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endOfLifeDate;

    /**
     * @return The end of life date in RFC3339 format of the Gallery Application.
     * 
     */
    public Output<Optional<String>> endOfLifeDate() {
        return Codegen.optional(this.endOfLifeDate);
    }
    /**
     * The End User Licence Agreement of the Gallery Application.
     * 
     */
    @Export(name="eula", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eula;

    /**
     * @return The End User Licence Agreement of the Gallery Application.
     * 
     */
    public Output<Optional<String>> eula() {
        return Codegen.optional(this.eula);
    }
    /**
     * The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="galleryId", refs={String.class}, tree="[0]")
    private Output<String> galleryId;

    /**
     * @return The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> galleryId() {
        return this.galleryId;
    }
    /**
     * The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URI containing the Privacy Statement associated with the Gallery Application.
     * 
     */
    @Export(name="privacyStatementUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privacyStatementUri;

    /**
     * @return The URI containing the Privacy Statement associated with the Gallery Application.
     * 
     */
    public Output<Optional<String>> privacyStatementUri() {
        return Codegen.optional(this.privacyStatementUri);
    }
    /**
     * The URI containing the Release Notes associated with the Gallery Application.
     * 
     */
    @Export(name="releaseNoteUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> releaseNoteUri;

    /**
     * @return The URI containing the Release Notes associated with the Gallery Application.
     * 
     */
    public Output<Optional<String>> releaseNoteUri() {
        return Codegen.optional(this.releaseNoteUri);
    }
    /**
     * The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="supportedOsType", refs={String.class}, tree="[0]")
    private Output<String> supportedOsType;

    /**
     * @return The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> supportedOsType() {
        return this.supportedOsType;
    }
    /**
     * A mapping of tags to assign to the Gallery Application.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Gallery Application.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GalleryApplication(java.lang.String name) {
        this(name, GalleryApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GalleryApplication(java.lang.String name, GalleryApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryApplication(java.lang.String name, GalleryApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplication:GalleryApplication", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GalleryApplication(java.lang.String name, Output<java.lang.String> id, @Nullable GalleryApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/galleryApplication:GalleryApplication", name, state, makeResourceOptions(options, id), false);
    }

    private static GalleryApplicationArgs makeArgs(GalleryApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GalleryApplicationArgs.Empty : args;
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
    public static GalleryApplication get(java.lang.String name, Output<java.lang.String> id, @Nullable GalleryApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GalleryApplication(name, id, state, options);
    }
}
