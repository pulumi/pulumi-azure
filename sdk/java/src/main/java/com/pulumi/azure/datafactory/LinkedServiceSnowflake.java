// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeState;
import com.pulumi.azure.datafactory.outputs.LinkedServiceSnowflakeKeyVaultPassword;
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
 * Manages a Linked Service (connection) between Snowflake and Azure Data Factory.
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
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceSnowflake;
 * import com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs;
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
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleLinkedServiceSnowflake = new LinkedServiceSnowflake(&#34;exampleLinkedServiceSnowflake&#34;, LinkedServiceSnowflakeArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .connectionString(&#34;jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&amp;db=db&amp;warehouse=wh&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Password In Key Vault
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceKeyVault;
 * import com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceSnowflake;
 * import com.pulumi.azure.datafactory.LinkedServiceSnowflakeArgs;
 * import com.pulumi.azure.datafactory.inputs.LinkedServiceSnowflakeKeyVaultPasswordArgs;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleLinkedServiceKeyVault = new LinkedServiceKeyVault(&#34;exampleLinkedServiceKeyVault&#34;, LinkedServiceKeyVaultArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .keyVaultId(exampleKeyVault.id())
 *             .build());
 * 
 *         var exampleLinkedServiceSnowflake = new LinkedServiceSnowflake(&#34;exampleLinkedServiceSnowflake&#34;, LinkedServiceSnowflakeArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .connectionString(&#34;jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&amp;db=db&amp;warehouse=wh&#34;)
 *             .keyVaultPassword(LinkedServiceSnowflakeKeyVaultPasswordArgs.builder()
 *                 .linkedServiceName(exampleLinkedServiceKeyVault.name())
 *                 .secretName(&#34;secret&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Snowflake Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake")
public class LinkedServiceSnowflake extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The connection string in which to authenticate with Snowflake.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return The connection string in which to authenticate with Snowflake.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
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
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    @Export(name="keyVaultPassword", type=LinkedServiceSnowflakeKeyVaultPassword.class, parameters={})
    private Output</* @Nullable */ LinkedServiceSnowflakeKeyVaultPassword> keyVaultPassword;

    /**
     * @return A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    public Output<Optional<LinkedServiceSnowflakeKeyVaultPassword>> keyVaultPassword() {
        return Codegen.optional(this.keyVaultPassword);
    }
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceSnowflake(String name) {
        this(name, LinkedServiceSnowflakeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceSnowflake(String name, LinkedServiceSnowflakeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceSnowflake(String name, LinkedServiceSnowflakeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake", name, args == null ? LinkedServiceSnowflakeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceSnowflake(String name, Output<String> id, @Nullable LinkedServiceSnowflakeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake", name, state, makeResourceOptions(options, id));
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
    public static LinkedServiceSnowflake get(String name, Output<String> id, @Nullable LinkedServiceSnowflakeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceSnowflake(name, id, state, options);
    }
}