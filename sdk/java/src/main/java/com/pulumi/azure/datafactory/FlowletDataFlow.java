// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.FlowletDataFlowArgs;
import com.pulumi.azure.datafactory.inputs.FlowletDataFlowState;
import com.pulumi.azure.datafactory.outputs.FlowletDataFlowSink;
import com.pulumi.azure.datafactory.outputs.FlowletDataFlowSource;
import com.pulumi.azure.datafactory.outputs.FlowletDataFlowTransformation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Flowlet Data Flow inside an Azure Data Factory.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.LinkedCustomService;
 * import com.pulumi.azure.datafactory.LinkedCustomServiceArgs;
 * import com.pulumi.azure.datafactory.DatasetJson;
 * import com.pulumi.azure.datafactory.DatasetJsonArgs;
 * import com.pulumi.azure.datafactory.inputs.DatasetJsonAzureBlobStorageLocationArgs;
 * import com.pulumi.azure.datafactory.FlowletDataFlow;
 * import com.pulumi.azure.datafactory.FlowletDataFlowArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceLinkedServiceArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkLinkedServiceArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSourceFlowletArgs;
 * import com.pulumi.azure.datafactory.inputs.FlowletDataFlowSinkFlowletArgs;
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
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleFactory = new Factory("exampleFactory", FactoryArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleLinkedCustomService = new LinkedCustomService("exampleLinkedCustomService", LinkedCustomServiceArgs.builder()
 *             .name("linked_service")
 *             .dataFactoryId(exampleFactory.id())
 *             .type("AzureBlobStorage")
 *             .typePropertiesJson(exampleAccount.primaryConnectionString().applyValue(_primaryConnectionString -> """
 * {
 *   "connectionString": "%s"
 * }
 * ", _primaryConnectionString)))
 *             .build());
 * 
 *         var example1 = new DatasetJson("example1", DatasetJsonArgs.builder()
 *             .name("dataset1")
 *             .dataFactoryId(exampleFactory.id())
 *             .linkedServiceName(exampleLinkedCustomService.name())
 *             .azureBlobStorageLocation(DatasetJsonAzureBlobStorageLocationArgs.builder()
 *                 .container("container")
 *                 .path("foo/bar/")
 *                 .filename("foo.txt")
 *                 .build())
 *             .encoding("UTF-8")
 *             .build());
 * 
 *         var example2 = new DatasetJson("example2", DatasetJsonArgs.builder()
 *             .name("dataset2")
 *             .dataFactoryId(exampleFactory.id())
 *             .linkedServiceName(exampleLinkedCustomService.name())
 *             .azureBlobStorageLocation(DatasetJsonAzureBlobStorageLocationArgs.builder()
 *                 .container("container")
 *                 .path("foo/bar/")
 *                 .filename("bar.txt")
 *                 .build())
 *             .encoding("UTF-8")
 *             .build());
 * 
 *         var example1FlowletDataFlow = new FlowletDataFlow("example1FlowletDataFlow", FlowletDataFlowArgs.builder()
 *             .name("example")
 *             .dataFactoryId(exampleFactory.id())
 *             .sources(FlowletDataFlowSourceArgs.builder()
 *                 .name("source1")
 *                 .linkedService(FlowletDataFlowSourceLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .sinks(FlowletDataFlowSinkArgs.builder()
 *                 .name("sink1")
 *                 .linkedService(FlowletDataFlowSinkLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .script("""
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: 'documentPerLine') ~> source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~> sink1
 *             """)
 *             .build());
 * 
 *         var example2FlowletDataFlow = new FlowletDataFlow("example2FlowletDataFlow", FlowletDataFlowArgs.builder()
 *             .name("example")
 *             .dataFactoryId(exampleFactory.id())
 *             .sources(FlowletDataFlowSourceArgs.builder()
 *                 .name("source1")
 *                 .linkedService(FlowletDataFlowSourceLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .sinks(FlowletDataFlowSinkArgs.builder()
 *                 .name("sink1")
 *                 .linkedService(FlowletDataFlowSinkLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .script("""
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: 'documentPerLine') ~> source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~> sink1
 *             """)
 *             .build());
 * 
 *         var exampleFlowletDataFlow = new FlowletDataFlow("exampleFlowletDataFlow", FlowletDataFlowArgs.builder()
 *             .name("example")
 *             .dataFactoryId(exampleFactory.id())
 *             .sources(FlowletDataFlowSourceArgs.builder()
 *                 .name("source1")
 *                 .flowlet(FlowletDataFlowSourceFlowletArgs.builder()
 *                     .name(example1FlowletDataFlow.name())
 *                     .build())
 *                 .linkedService(FlowletDataFlowSourceLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .sinks(FlowletDataFlowSinkArgs.builder()
 *                 .name("sink1")
 *                 .flowlet(FlowletDataFlowSinkFlowletArgs.builder()
 *                     .name(example2FlowletDataFlow.name())
 *                     .build())
 *                 .linkedService(FlowletDataFlowSinkLinkedServiceArgs.builder()
 *                     .name(exampleLinkedCustomService.name())
 *                     .build())
 *                 .build())
 *             .script("""
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: 'documentPerLine') ~> source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~> sink1
 *             """)
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
 * * `Microsoft.DataFactory`: 2018-06-01
 * 
 * ## Import
 * 
 * Data Factory Flowlet Data Flow can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:datafactory/flowletDataFlow:FlowletDataFlow example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/dataflows/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/flowletDataFlow:FlowletDataFlow")
public class FlowletDataFlow extends com.pulumi.resources.CustomResource {
    /**
     * List of tags that can be used for describing the Data Factory Flowlet Data Flow.
     * 
     */
    @Export(name="annotations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Flowlet Data Flow.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", refs={String.class}, tree="[0]")
    private Output<String> dataFactoryId;

    /**
     * @return The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Flowlet Data Flow.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Flowlet Data Flow.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> folder;

    /**
     * @return The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * Specifies the name of the Data Factory Flowlet Data Flow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Flowlet Data Flow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The script for the Data Factory Flowlet Data Flow.
     * 
     */
    @Export(name="script", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> script;

    /**
     * @return The script for the Data Factory Flowlet Data Flow.
     * 
     */
    public Output<Optional<String>> script() {
        return Codegen.optional(this.script);
    }
    /**
     * The script lines for the Data Factory Flowlet Data Flow.
     * 
     */
    @Export(name="scriptLines", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scriptLines;

    /**
     * @return The script lines for the Data Factory Flowlet Data Flow.
     * 
     */
    public Output<Optional<List<String>>> scriptLines() {
        return Codegen.optional(this.scriptLines);
    }
    /**
     * One or more `sink` blocks as defined below.
     * 
     */
    @Export(name="sinks", refs={List.class,FlowletDataFlowSink.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FlowletDataFlowSink>> sinks;

    /**
     * @return One or more `sink` blocks as defined below.
     * 
     */
    public Output<Optional<List<FlowletDataFlowSink>>> sinks() {
        return Codegen.optional(this.sinks);
    }
    /**
     * One or more `source` blocks as defined below.
     * 
     */
    @Export(name="sources", refs={List.class,FlowletDataFlowSource.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FlowletDataFlowSource>> sources;

    /**
     * @return One or more `source` blocks as defined below.
     * 
     */
    public Output<Optional<List<FlowletDataFlowSource>>> sources() {
        return Codegen.optional(this.sources);
    }
    /**
     * One or more `transformation` blocks as defined below.
     * 
     */
    @Export(name="transformations", refs={List.class,FlowletDataFlowTransformation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FlowletDataFlowTransformation>> transformations;

    /**
     * @return One or more `transformation` blocks as defined below.
     * 
     */
    public Output<Optional<List<FlowletDataFlowTransformation>>> transformations() {
        return Codegen.optional(this.transformations);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowletDataFlow(java.lang.String name) {
        this(name, FlowletDataFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowletDataFlow(java.lang.String name, FlowletDataFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowletDataFlow(java.lang.String name, FlowletDataFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/flowletDataFlow:FlowletDataFlow", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FlowletDataFlow(java.lang.String name, Output<java.lang.String> id, @Nullable FlowletDataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/flowletDataFlow:FlowletDataFlow", name, state, makeResourceOptions(options, id), false);
    }

    private static FlowletDataFlowArgs makeArgs(FlowletDataFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FlowletDataFlowArgs.Empty : args;
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
    public static FlowletDataFlow get(java.lang.String name, Output<java.lang.String> id, @Nullable FlowletDataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlowletDataFlow(name, id, state, options);
    }
}
