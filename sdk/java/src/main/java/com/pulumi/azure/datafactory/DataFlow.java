// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.DataFlowArgs;
import com.pulumi.azure.datafactory.inputs.DataFlowState;
import com.pulumi.azure.datafactory.outputs.DataFlowSink;
import com.pulumi.azure.datafactory.outputs.DataFlowSource;
import com.pulumi.azure.datafactory.outputs.DataFlowTransformation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Data Flow inside an Azure Data Factory.
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
 * import com.pulumi.azure.datafactory.DataFlow;
 * import com.pulumi.azure.datafactory.DataFlowArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSourceArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSourceFlowletArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSourceDatasetArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSinkArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSinkFlowletArgs;
 * import com.pulumi.azure.datafactory.inputs.DataFlowSinkDatasetArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleLinkedCustomService = new LinkedCustomService(&#34;exampleLinkedCustomService&#34;, LinkedCustomServiceArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .type(&#34;AzureBlobStorage&#34;)
 *             .typePropertiesJson(exampleAccount.primaryConnectionString().applyValue(primaryConnectionString -&gt; &#34;&#34;&#34;
 * {
 *   &#34;connectionString&#34;: &#34;%s&#34;
 * }
 * &#34;, primaryConnectionString)))
 *             .build());
 * 
 *         var example1DatasetJson = new DatasetJson(&#34;example1DatasetJson&#34;, DatasetJsonArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .linkedServiceName(exampleLinkedCustomService.name())
 *             .azureBlobStorageLocation(DatasetJsonAzureBlobStorageLocationArgs.builder()
 *                 .container(&#34;container&#34;)
 *                 .path(&#34;foo/bar/&#34;)
 *                 .filename(&#34;foo.txt&#34;)
 *                 .build())
 *             .encoding(&#34;UTF-8&#34;)
 *             .build());
 * 
 *         var example2DatasetJson = new DatasetJson(&#34;example2DatasetJson&#34;, DatasetJsonArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .linkedServiceName(exampleLinkedCustomService.name())
 *             .azureBlobStorageLocation(DatasetJsonAzureBlobStorageLocationArgs.builder()
 *                 .container(&#34;container&#34;)
 *                 .path(&#34;foo/bar/&#34;)
 *                 .filename(&#34;bar.txt&#34;)
 *                 .build())
 *             .encoding(&#34;UTF-8&#34;)
 *             .build());
 * 
 *         var example1FlowletDataFlow = new FlowletDataFlow(&#34;example1FlowletDataFlow&#34;, FlowletDataFlowArgs.builder()        
 *             .dataFactoryId(azurerm_data_factory.test().id())
 *             .sources(FlowletDataFlowSourceArgs.builder()
 *                 .name(&#34;source1&#34;)
 *                 .linkedService(FlowletDataFlowSourceLinkedServiceArgs.builder()
 *                     .name(azurerm_data_factory_linked_custom_service.test().name())
 *                     .build())
 *                 .build())
 *             .sinks(FlowletDataFlowSinkArgs.builder()
 *                 .name(&#34;sink1&#34;)
 *                 .linkedService(FlowletDataFlowSinkLinkedServiceArgs.builder()
 *                     .name(azurerm_data_factory_linked_custom_service.test().name())
 *                     .build())
 *                 .build())
 *             .script(&#34;&#34;&#34;
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: &#39;documentPerLine&#39;) ~&gt; source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~&gt; sink1
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var example2FlowletDataFlow = new FlowletDataFlow(&#34;example2FlowletDataFlow&#34;, FlowletDataFlowArgs.builder()        
 *             .dataFactoryId(azurerm_data_factory.test().id())
 *             .sources(FlowletDataFlowSourceArgs.builder()
 *                 .name(&#34;source1&#34;)
 *                 .linkedService(FlowletDataFlowSourceLinkedServiceArgs.builder()
 *                     .name(azurerm_data_factory_linked_custom_service.test().name())
 *                     .build())
 *                 .build())
 *             .sinks(FlowletDataFlowSinkArgs.builder()
 *                 .name(&#34;sink1&#34;)
 *                 .linkedService(FlowletDataFlowSinkLinkedServiceArgs.builder()
 *                     .name(azurerm_data_factory_linked_custom_service.test().name())
 *                     .build())
 *                 .build())
 *             .script(&#34;&#34;&#34;
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: &#39;documentPerLine&#39;) ~&gt; source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~&gt; sink1
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleDataFlow = new DataFlow(&#34;exampleDataFlow&#34;, DataFlowArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .sources(DataFlowSourceArgs.builder()
 *                 .name(&#34;source1&#34;)
 *                 .flowlet(DataFlowSourceFlowletArgs.builder()
 *                     .name(example1FlowletDataFlow.name())
 *                     .parameters(Map.of(&#34;Key1&#34;, &#34;value1&#34;))
 *                     .build())
 *                 .dataset(DataFlowSourceDatasetArgs.builder()
 *                     .name(example1DatasetJson.name())
 *                     .build())
 *                 .build())
 *             .sinks(DataFlowSinkArgs.builder()
 *                 .name(&#34;sink1&#34;)
 *                 .flowlet(DataFlowSinkFlowletArgs.builder()
 *                     .name(example2FlowletDataFlow.name())
 *                     .parameters(Map.of(&#34;Key1&#34;, &#34;value1&#34;))
 *                     .build())
 *                 .dataset(DataFlowSinkDatasetArgs.builder()
 *                     .name(example2DatasetJson.name())
 *                     .build())
 *                 .build())
 *             .script(&#34;&#34;&#34;
 * source(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   limit: 100, 
 *   ignoreNoFilesFound: false, 
 *   documentForm: &#39;documentPerLine&#39;) ~&gt; source1 
 * source1 sink(
 *   allowSchemaDrift: true, 
 *   validateSchema: false, 
 *   skipDuplicateMapInputs: true, 
 *   skipDuplicateMapOutputs: true) ~&gt; sink1
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Data Flow can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/dataFlow:DataFlow example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/dataflows/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/dataFlow:DataFlow")
public class DataFlow extends com.pulumi.resources.CustomResource {
    /**
     * List of tags that can be used for describing the Data Factory Data Flow.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Data Flow.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Data Flow.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Data Flow.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
     * 
     */
    @Export(name="folder", type=String.class, parameters={})
    private Output</* @Nullable */ String> folder;

    /**
     * @return The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The script for the Data Factory Data Flow.
     * 
     */
    @Export(name="script", type=String.class, parameters={})
    private Output</* @Nullable */ String> script;

    /**
     * @return The script for the Data Factory Data Flow.
     * 
     */
    public Output<Optional<String>> script() {
        return Codegen.optional(this.script);
    }
    /**
     * The script lines for the Data Factory Data Flow.
     * 
     */
    @Export(name="scriptLines", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> scriptLines;

    /**
     * @return The script lines for the Data Factory Data Flow.
     * 
     */
    public Output<Optional<List<String>>> scriptLines() {
        return Codegen.optional(this.scriptLines);
    }
    /**
     * One or more `sink` blocks as defined below.
     * 
     */
    @Export(name="sinks", type=List.class, parameters={DataFlowSink.class})
    private Output<List<DataFlowSink>> sinks;

    /**
     * @return One or more `sink` blocks as defined below.
     * 
     */
    public Output<List<DataFlowSink>> sinks() {
        return this.sinks;
    }
    /**
     * One or more `source` blocks as defined below.
     * 
     */
    @Export(name="sources", type=List.class, parameters={DataFlowSource.class})
    private Output<List<DataFlowSource>> sources;

    /**
     * @return One or more `source` blocks as defined below.
     * 
     */
    public Output<List<DataFlowSource>> sources() {
        return this.sources;
    }
    /**
     * One or more `transformation` blocks as defined below.
     * 
     */
    @Export(name="transformations", type=List.class, parameters={DataFlowTransformation.class})
    private Output</* @Nullable */ List<DataFlowTransformation>> transformations;

    /**
     * @return One or more `transformation` blocks as defined below.
     * 
     */
    public Output<Optional<List<DataFlowTransformation>>> transformations() {
        return Codegen.optional(this.transformations);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataFlow(String name) {
        this(name, DataFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataFlow(String name, DataFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataFlow(String name, DataFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/dataFlow:DataFlow", name, args == null ? DataFlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataFlow(String name, Output<String> id, @Nullable DataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/dataFlow:DataFlow", name, state, makeResourceOptions(options, id));
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
    public static DataFlow get(String name, Output<String> id, @Nullable DataFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataFlow(name, id, state, options);
    }
}