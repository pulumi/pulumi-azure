// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceCosmosDbMongoApiState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using Mongo API.
 * 
 * &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
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
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApi;
 * import com.pulumi.azure.datafactory.LinkedServiceCosmosDbMongoApiArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleFactory = new Factory("exampleFactory", FactoryArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleLinkedServiceCosmosDbMongoApi = new LinkedServiceCosmosDbMongoApi("exampleLinkedServiceCosmosDbMongoApi", LinkedServiceCosmosDbMongoApiArgs.builder()
 *             .name("example")
 *             .dataFactoryId(exampleFactory.id())
 *             .connectionString("mongodb://testinstance:testkey}{@literal @}{@code testinstance.documents.azure.com:10255/?ssl=true")
 *             .database("foo")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Data Factory Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi")
public class LinkedServiceCosmosDbMongoApi extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to CosmosDB Linked Service:
     * 
     */
    @Export(name="additionalProperties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to CosmosDB Linked Service:
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Export(name="annotations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The connection string.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionString;

    /**
     * @return The connection string.
     * 
     */
    public Output<Optional<String>> connectionString() {
        return Codegen.optional(this.connectionString);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", refs={String.class}, tree="[0]")
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The name of the database.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> database;

    /**
     * @return The name of the database.
     * 
     */
    public Output<Optional<String>> database() {
        return Codegen.optional(this.database);
    }
    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="integrationRuntimeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Whether API server version is 3.2 or higher. Defaults to `false`.
     * 
     */
    @Export(name="serverVersionIs32OrHigher", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> serverVersionIs32OrHigher;

    /**
     * @return Whether API server version is 3.2 or higher. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> serverVersionIs32OrHigher() {
        return Codegen.optional(this.serverVersionIs32OrHigher);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceCosmosDbMongoApi(java.lang.String name) {
        this(name, LinkedServiceCosmosDbMongoApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceCosmosDbMongoApi(java.lang.String name, LinkedServiceCosmosDbMongoApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceCosmosDbMongoApi(java.lang.String name, LinkedServiceCosmosDbMongoApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LinkedServiceCosmosDbMongoApi(java.lang.String name, Output<java.lang.String> id, @Nullable LinkedServiceCosmosDbMongoApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi", name, state, makeResourceOptions(options, id), false);
    }

    private static LinkedServiceCosmosDbMongoApiArgs makeArgs(LinkedServiceCosmosDbMongoApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LinkedServiceCosmosDbMongoApiArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "connectionString"
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
    public static LinkedServiceCosmosDbMongoApi get(java.lang.String name, Output<java.lang.String> id, @Nullable LinkedServiceCosmosDbMongoApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceCosmosDbMongoApi(name, id, state, options);
    }
}
