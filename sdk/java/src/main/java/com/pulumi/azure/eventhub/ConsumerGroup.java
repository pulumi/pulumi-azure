// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.ConsumerGroupArgs;
import com.pulumi.azure.eventhub.inputs.ConsumerGroupState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Event Hubs Consumer Group as a nested resource within an Event Hub.
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
 * import com.pulumi.azure.eventhub.EventHubNamespace;
 * import com.pulumi.azure.eventhub.EventHubNamespaceArgs;
 * import com.pulumi.azure.eventhub.EventHub;
 * import com.pulumi.azure.eventhub.EventHubArgs;
 * import com.pulumi.azure.eventhub.ConsumerGroup;
 * import com.pulumi.azure.eventhub.ConsumerGroupArgs;
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
 *         var exampleEventHubNamespace = new EventHubNamespace("exampleEventHubNamespace", EventHubNamespaceArgs.builder()
 *             .name("acceptanceTestEventHubNamespace")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku("Basic")
 *             .capacity(2)
 *             .tags(Map.of("environment", "Production"))
 *             .build());
 * 
 *         var exampleEventHub = new EventHub("exampleEventHub", EventHubArgs.builder()
 *             .name("acceptanceTestEventHub")
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .resourceGroupName(example.name())
 *             .partitionCount(2)
 *             .messageRetention(2)
 *             .build());
 * 
 *         var exampleConsumerGroup = new ConsumerGroup("exampleConsumerGroup", ConsumerGroupArgs.builder()
 *             .name("acceptanceTestEventHubConsumerGroup")
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .eventhubName(exampleEventHub.name())
 *             .resourceGroupName(example.name())
 *             .userMetadata("some-meta-data")
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
 * EventHub Consumer Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:eventhub/consumerGroup:ConsumerGroup consumerGroup1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/eventhubs/eventhub1/consumerGroups/consumerGroup1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/consumerGroup:ConsumerGroup")
public class ConsumerGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubName", refs={String.class}, tree="[0]")
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }
    /**
     * Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the user metadata.
     * 
     */
    @Export(name="userMetadata", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return Specifies the user metadata.
     * 
     */
    public Output<Optional<String>> userMetadata() {
        return Codegen.optional(this.userMetadata);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerGroup(java.lang.String name) {
        this(name, ConsumerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerGroup(java.lang.String name, ConsumerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerGroup(java.lang.String name, ConsumerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/consumerGroup:ConsumerGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConsumerGroup(java.lang.String name, Output<java.lang.String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/consumerGroup:ConsumerGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static ConsumerGroupArgs makeArgs(ConsumerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConsumerGroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:eventhub/eventHubConsumerGroup:EventHubConsumerGroup").build())
            ))
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
    public static ConsumerGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerGroup(name, id, state, options);
    }
}
