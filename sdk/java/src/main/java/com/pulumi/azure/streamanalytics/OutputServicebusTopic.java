// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs;
import com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicState;
import com.pulumi.azure.streamanalytics.outputs.OutputServicebusTopicSerialization;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Stream Analytics Output to a ServiceBus Topic.
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
 * import com.pulumi.azure.streamanalytics.StreamanalyticsFunctions;
 * import com.pulumi.azure.streamanalytics.inputs.GetJobArgs;
 * import com.pulumi.azure.servicebus.Namespace;
 * import com.pulumi.azure.servicebus.NamespaceArgs;
 * import com.pulumi.azure.servicebus.Topic;
 * import com.pulumi.azure.servicebus.TopicArgs;
 * import com.pulumi.azure.streamanalytics.OutputServicebusTopic;
 * import com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs;
 * import com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs;
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
 *         final var exampleJob = StreamanalyticsFunctions.getJob(GetJobArgs.builder()
 *             .name(&#34;example-job&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;, TopicArgs.builder()        
 *             .namespaceId(exampleNamespace.id())
 *             .enablePartitioning(true)
 *             .build());
 * 
 *         var exampleOutputServicebusTopic = new OutputServicebusTopic(&#34;exampleOutputServicebusTopic&#34;, OutputServicebusTopicArgs.builder()        
 *             .streamAnalyticsJobName(exampleJob.applyValue(getJobResult -&gt; getJobResult).applyValue(exampleJob -&gt; exampleJob.applyValue(getJobResult -&gt; getJobResult.name())))
 *             .resourceGroupName(exampleJob.applyValue(getJobResult -&gt; getJobResult).applyValue(exampleJob -&gt; exampleJob.applyValue(getJobResult -&gt; getJobResult.resourceGroupName())))
 *             .topicName(exampleTopic.name())
 *             .servicebusNamespace(exampleNamespace.name())
 *             .sharedAccessPolicyKey(exampleNamespace.defaultPrimaryKey())
 *             .sharedAccessPolicyName(&#34;RootManageSharedAccessKey&#34;)
 *             .propertyColumns(            
 *                 &#34;col1&#34;,
 *                 &#34;col2&#34;)
 *             .serialization(OutputServicebusTopicSerializationArgs.builder()
 *                 .type(&#34;Csv&#34;)
 *                 .format(&#34;Array&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Stream Analytics Output ServiceBus Topic&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:streamanalytics/outputServicebusTopic:OutputServicebusTopic example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/outputs/output1
 * ```
 * 
 */
@ResourceType(type="azure:streamanalytics/outputServicebusTopic:OutputServicebusTopic")
public class OutputServicebusTopic extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of property columns to add to the Service Bus Topic output.
     * 
     */
    @Export(name="propertyColumns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> propertyColumns;

    /**
     * @return A list of property columns to add to the Service Bus Topic output.
     * 
     */
    public Output<Optional<List<String>>> propertyColumns() {
        return Codegen.optional(this.propertyColumns);
    }
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `serialization` block as defined below.
     * 
     */
    @Export(name="serialization", type=OutputServicebusTopicSerialization.class, parameters={})
    private Output<OutputServicebusTopicSerialization> serialization;

    /**
     * @return A `serialization` block as defined below.
     * 
     */
    public Output<OutputServicebusTopicSerialization> serialization() {
        return this.serialization;
    }
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
     * 
     */
    @Export(name="servicebusNamespace", type=String.class, parameters={})
    private Output<String> servicebusNamespace;

    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
     * 
     */
    public Output<String> servicebusNamespace() {
        return this.servicebusNamespace;
    }
    /**
     * The shared access policy key for the specified shared access policy.
     * 
     */
    @Export(name="sharedAccessPolicyKey", type=String.class, parameters={})
    private Output<String> sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy.
     * 
     */
    public Output<String> sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    @Export(name="sharedAccessPolicyName", type=String.class, parameters={})
    private Output<String> sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    public Output<String> sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="streamAnalyticsJobName", type=String.class, parameters={})
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }
    /**
     * A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
     * 
     */
    @Export(name="systemPropertyColumns", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> systemPropertyColumns;

    /**
     * @return A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
     * 
     */
    public Output<Optional<Map<String,String>>> systemPropertyColumns() {
        return Codegen.optional(this.systemPropertyColumns);
    }
    /**
     * The name of the Service Bus Topic.
     * 
     */
    @Export(name="topicName", type=String.class, parameters={})
    private Output<String> topicName;

    /**
     * @return The name of the Service Bus Topic.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OutputServicebusTopic(String name) {
        this(name, OutputServicebusTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OutputServicebusTopic(String name, OutputServicebusTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OutputServicebusTopic(String name, OutputServicebusTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputServicebusTopic:OutputServicebusTopic", name, args == null ? OutputServicebusTopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OutputServicebusTopic(String name, Output<String> id, @Nullable OutputServicebusTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputServicebusTopic:OutputServicebusTopic", name, state, makeResourceOptions(options, id));
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
    public static OutputServicebusTopic get(String name, Output<String> id, @Nullable OutputServicebusTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OutputServicebusTopic(name, id, state, options);
    }
}