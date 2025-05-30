// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs;
import com.pulumi.azure.eventhub.inputs.NamespaceSchemaGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
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
 * import com.pulumi.azure.eventhub.EventHubNamespace;
 * import com.pulumi.azure.eventhub.EventHubNamespaceArgs;
 * import com.pulumi.azure.eventhub.NamespaceSchemaGroup;
 * import com.pulumi.azure.eventhub.NamespaceSchemaGroupArgs;
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
 *             .name("exampleRG-ehn-schemaGroup")
 *             .location("East US")
 *             .build());
 * 
 *         var test = new EventHubNamespace("test", EventHubNamespaceArgs.builder()
 *             .name("example-ehn-schemaGroup")
 *             .location(testAzurermResourceGroup.location())
 *             .resourceGroupName(testAzurermResourceGroup.name())
 *             .sku("Standard")
 *             .build());
 * 
 *         var testNamespaceSchemaGroup = new NamespaceSchemaGroup("testNamespaceSchemaGroup", NamespaceSchemaGroupArgs.builder()
 *             .name("example-schemaGroup")
 *             .namespaceId(test.id())
 *             .schemaCompatibility("Forward")
 *             .schemaType("Avro")
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
 * * `Microsoft.EventHub`: 2024-01-01
 * 
 * ## Import
 * 
 * Schema Group for a EventHub Namespace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/schemaGroups/group1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup")
public class NamespaceSchemaGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of this schema group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of this schema group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", refs={String.class}, tree="[0]")
    private Output<String> namespaceId;

    /**
     * @return Specifies the ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * Specifies the compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="schemaCompatibility", refs={String.class}, tree="[0]")
    private Output<String> schemaCompatibility;

    /**
     * @return Specifies the compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaCompatibility() {
        return this.schemaCompatibility;
    }
    /**
     * Specifies the Type of this schema group. Possible values are `Avro`, `Unknown` and `Json`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `schema_type` is specified as `Json`, `schema_compatibility` must be set to `None`.
     * 
     */
    @Export(name="schemaType", refs={String.class}, tree="[0]")
    private Output<String> schemaType;

    /**
     * @return Specifies the Type of this schema group. Possible values are `Avro`, `Unknown` and `Json`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `schema_type` is specified as `Json`, `schema_compatibility` must be set to `None`.
     * 
     */
    public Output<String> schemaType() {
        return this.schemaType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceSchemaGroup(java.lang.String name) {
        this(name, NamespaceSchemaGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceSchemaGroup(java.lang.String name, NamespaceSchemaGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceSchemaGroup(java.lang.String name, NamespaceSchemaGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NamespaceSchemaGroup(java.lang.String name, Output<java.lang.String> id, @Nullable NamespaceSchemaGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static NamespaceSchemaGroupArgs makeArgs(NamespaceSchemaGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NamespaceSchemaGroupArgs.Empty : args;
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
    public static NamespaceSchemaGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable NamespaceSchemaGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceSchemaGroup(name, id, state, options);
    }
}
