// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs;
import com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationState;
import com.pulumi.azure.logicapps.outputs.IntegrationAccountBatchConfigurationReleaseCriteria;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Logic App Integration Account Batch Configuration.
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
 * import com.pulumi.azure.logicapps.IntegrationAccount;
 * import com.pulumi.azure.logicapps.IntegrationAccountArgs;
 * import com.pulumi.azure.logicapps.IntegrationAccountBatchConfiguration;
 * import com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs;
 * import com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs;
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
 *         var exampleIntegrationAccount = new IntegrationAccount("exampleIntegrationAccount", IntegrationAccountArgs.builder()
 *             .name("example-ia")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("Standard")
 *             .build());
 * 
 *         var exampleIntegrationAccountBatchConfiguration = new IntegrationAccountBatchConfiguration("exampleIntegrationAccountBatchConfiguration", IntegrationAccountBatchConfigurationArgs.builder()
 *             .name("exampleiabc")
 *             .resourceGroupName(example.name())
 *             .integrationAccountName(exampleIntegrationAccount.name())
 *             .batchGroupName("TestBatchGroup")
 *             .releaseCriteria(IntegrationAccountBatchConfigurationReleaseCriteriaArgs.builder()
 *                 .messageCount(80)
 *                 .build())
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
 * * `Microsoft.Logic`: 2019-05-01
 * 
 * ## Import
 * 
 * Logic App Integration Account Batch Configurations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:logicapps/integrationAccountBatchConfiguration:IntegrationAccountBatchConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/batchConfigurations/batchConfiguration1
 * ```
 * 
 */
@ResourceType(type="azure:logicapps/integrationAccountBatchConfiguration:IntegrationAccountBatchConfiguration")
public class IntegrationAccountBatchConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="batchGroupName", refs={String.class}, tree="[0]")
    private Output<String> batchGroupName;

    /**
     * @return The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> batchGroupName() {
        return this.batchGroupName;
    }
    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="integrationAccountName", refs={String.class}, tree="[0]")
    private Output<String> integrationAccountName;

    /**
     * @return The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }
    /**
     * A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * 
     */
    @Export(name="releaseCriteria", refs={IntegrationAccountBatchConfigurationReleaseCriteria.class}, tree="[0]")
    private Output<IntegrationAccountBatchConfigurationReleaseCriteria> releaseCriteria;

    /**
     * @return A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * 
     */
    public Output<IntegrationAccountBatchConfigurationReleaseCriteria> releaseCriteria() {
        return this.releaseCriteria;
    }
    /**
     * The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountBatchConfiguration(java.lang.String name) {
        this(name, IntegrationAccountBatchConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountBatchConfiguration(java.lang.String name, IntegrationAccountBatchConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountBatchConfiguration(java.lang.String name, IntegrationAccountBatchConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/integrationAccountBatchConfiguration:IntegrationAccountBatchConfiguration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IntegrationAccountBatchConfiguration(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationAccountBatchConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/integrationAccountBatchConfiguration:IntegrationAccountBatchConfiguration", name, state, makeResourceOptions(options, id), false);
    }

    private static IntegrationAccountBatchConfigurationArgs makeArgs(IntegrationAccountBatchConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IntegrationAccountBatchConfigurationArgs.Empty : args;
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
    public static IntegrationAccountBatchConfiguration get(java.lang.String name, Output<java.lang.String> id, @Nullable IntegrationAccountBatchConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountBatchConfiguration(name, id, state, options);
    }
}
