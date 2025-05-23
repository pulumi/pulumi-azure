// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.maps.CreatorArgs;
import com.pulumi.azure.maps.inputs.CreatorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Maps Creator.
 * 
 * &gt; **Note:** The `azure.maps.Creator` resource has been deprecated because the service is retiring from 2024-09-23 and will be removed in v5.0 of the AzureRM Provider.
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
 * import com.pulumi.azure.maps.Account;
 * import com.pulumi.azure.maps.AccountArgs;
 * import com.pulumi.azure.maps.Creator;
 * import com.pulumi.azure.maps.CreatorArgs;
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
 *             .name("example-maps-account")
 *             .resourceGroupName(example.name())
 *             .skuName("G2")
 *             .tags(Map.of("environment", "Test"))
 *             .build());
 * 
 *         var exampleCreator = new Creator("exampleCreator", CreatorArgs.builder()
 *             .name("example-maps-creator")
 *             .mapsAccountId(exampleAccount.id())
 *             .location(example.location())
 *             .storageUnits(1)
 *             .tags(Map.of("environment", "Test"))
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
 * * `Microsoft.Maps`: 2023-06-01
 * 
 * ## Import
 * 
 * An Azure Maps Creators can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:maps/creator:Creator example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Maps/accounts/account1/creators/creator1
 * ```
 * 
 */
@ResourceType(type="azure:maps/creator:Creator")
public class Creator extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Region where the Azure Maps Creator should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Azure Maps Creator should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the Azure Maps Creator. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="mapsAccountId", refs={String.class}, tree="[0]")
    private Output<String> mapsAccountId;

    /**
     * @return The ID of the Azure Maps Creator. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> mapsAccountId() {
        return this.mapsAccountId;
    }
    /**
     * The name of the Azure Maps Creator. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Azure Maps Creator. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The storage units to be allocated. Integer values from 1 to 100, inclusive.
     * 
     */
    @Export(name="storageUnits", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageUnits;

    /**
     * @return The storage units to be allocated. Integer values from 1 to 100, inclusive.
     * 
     */
    public Output<Integer> storageUnits() {
        return this.storageUnits;
    }
    /**
     * A mapping of tags which should be assigned to the Azure Maps Creator.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Azure Maps Creator.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Creator(java.lang.String name) {
        this(name, CreatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Creator(java.lang.String name, CreatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Creator(java.lang.String name, CreatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:maps/creator:Creator", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Creator(java.lang.String name, Output<java.lang.String> id, @Nullable CreatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:maps/creator:Creator", name, state, makeResourceOptions(options, id), false);
    }

    private static CreatorArgs makeArgs(CreatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CreatorArgs.Empty : args;
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
    public static Creator get(java.lang.String name, Output<java.lang.String> id, @Nullable CreatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Creator(name, id, state, options);
    }
}
