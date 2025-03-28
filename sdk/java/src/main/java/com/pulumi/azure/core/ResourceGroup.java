// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.ResourceGroupArgs;
import com.pulumi.azure.core.inputs.ResourceGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 *             .name("example")
 *             .location("West Europe")
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
 * Resource Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:core/resourceGroup:ResourceGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1
 * ```
 * 
 */
@ResourceType(type="azure:core/resourceGroup:ResourceGroup")
public class ResourceGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the resource or application that manages this Resource Group.
     * 
     */
    @Export(name="managedBy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managedBy;

    /**
     * @return The ID of the resource or application that manages this Resource Group.
     * 
     */
    public Output<Optional<String>> managedBy() {
        return Codegen.optional(this.managedBy);
    }
    /**
     * The Name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of tags which should be assigned to the Resource Group.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Resource Group.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceGroup(java.lang.String name) {
        this(name, ResourceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceGroup(java.lang.String name, @Nullable ResourceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceGroup(java.lang.String name, @Nullable ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceGroup:ResourceGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ResourceGroup(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceGroup:ResourceGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static ResourceGroupArgs makeArgs(@Nullable ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResourceGroupArgs.Empty : args;
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
    public static ResourceGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroup(name, id, state, options);
    }
}
