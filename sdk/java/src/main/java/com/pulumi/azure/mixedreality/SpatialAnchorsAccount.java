// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mixedreality;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mixedreality.SpatialAnchorsAccountArgs;
import com.pulumi.azure.mixedreality.inputs.SpatialAnchorsAccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Spatial Anchors Account.
 * 
 * &gt; **Note:** The `azure.mixedreality.SpatialAnchorsAccount` resource has been deprecated because the service is retiring from 2024-11-20 and will be removed in v5.0 of the AzureRM Provider.
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
 * import com.pulumi.azure.mixedreality.SpatialAnchorsAccount;
 * import com.pulumi.azure.mixedreality.SpatialAnchorsAccountArgs;
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
 *         var exampleSpatialAnchorsAccount = new SpatialAnchorsAccount("exampleSpatialAnchorsAccount", SpatialAnchorsAccountArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
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
 * * `Microsoft.MixedReality`: 2021-01-01
 * 
 * ## Import
 * 
 * Spatial Anchors Account can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.MixedReality/spatialAnchorsAccounts/example
 * ```
 * 
 */
@ResourceType(type="azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount")
public class SpatialAnchorsAccount extends com.pulumi.resources.CustomResource {
    /**
     * The domain of the Spatial Anchors Account.
     * 
     */
    @Export(name="accountDomain", refs={String.class}, tree="[0]")
    private Output<String> accountDomain;

    /**
     * @return The domain of the Spatial Anchors Account.
     * 
     */
    public Output<String> accountDomain() {
        return this.accountDomain;
    }
    /**
     * The account ID of the Spatial Anchors Account.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account ID of the Spatial Anchors Account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Spatial Anchors Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Spatial Anchors Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpatialAnchorsAccount(java.lang.String name) {
        this(name, SpatialAnchorsAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpatialAnchorsAccount(java.lang.String name, SpatialAnchorsAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpatialAnchorsAccount(java.lang.String name, SpatialAnchorsAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SpatialAnchorsAccount(java.lang.String name, Output<java.lang.String> id, @Nullable SpatialAnchorsAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount", name, state, makeResourceOptions(options, id), false);
    }

    private static SpatialAnchorsAccountArgs makeArgs(SpatialAnchorsAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SpatialAnchorsAccountArgs.Empty : args;
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
    public static SpatialAnchorsAccount get(java.lang.String name, Output<java.lang.String> id, @Nullable SpatialAnchorsAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpatialAnchorsAccount(name, id, state, options);
    }
}
