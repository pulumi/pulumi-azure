// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.streamanalytics.OutputSynapseArgs;
import com.pulumi.azure.streamanalytics.inputs.OutputSynapseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Stream Analytics Output to an Azure Synapse Analytics Workspace.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.DataLakeGen2Filesystem;
 * import com.pulumi.azure.storage.DataLakeGen2FilesystemArgs;
 * import com.pulumi.azure.synapse.Workspace;
 * import com.pulumi.azure.synapse.WorkspaceArgs;
 * import com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs;
 * import com.pulumi.azure.streamanalytics.OutputSynapse;
 * import com.pulumi.azure.streamanalytics.OutputSynapseArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .accountKind(&#34;StorageV2&#34;)
 *             .isHnsEnabled(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.id())
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.id())
 *             .sqlAdministratorLogin(&#34;sqladminuser&#34;)
 *             .sqlAdministratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .identity(WorkspaceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleOutputSynapse = new OutputSynapse(&#34;exampleOutputSynapse&#34;, OutputSynapseArgs.builder()        
 *             .streamAnalyticsJobName(exampleJob.applyValue(getJobResult -&gt; getJobResult).applyValue(exampleJob -&gt; exampleJob.applyValue(getJobResult -&gt; getJobResult.name())))
 *             .resourceGroupName(exampleJob.applyValue(getJobResult -&gt; getJobResult).applyValue(exampleJob -&gt; exampleJob.applyValue(getJobResult -&gt; getJobResult.resourceGroupName())))
 *             .server(exampleWorkspace.connectivityEndpoints().applyValue(connectivityEndpoints -&gt; connectivityEndpoints.sqlOnDemand()))
 *             .user(exampleWorkspace.sqlAdministratorLogin())
 *             .password(exampleWorkspace.sqlAdministratorLoginPassword())
 *             .database(&#34;master&#34;)
 *             .table(&#34;ExampleTable&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A Stream Analytics Output to an Azure Synapse Analytics Workspace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:streamanalytics/outputSynapse:OutputSynapse example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/outputs/output1
 * ```
 * 
 */
@ResourceType(type="azure:streamanalytics/outputSynapse:OutputSynapse")
public class OutputSynapse extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The name of the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
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
     * The password that will be used to connect to the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password that will be used to connect to the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> password() {
        return this.password;
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
     * The name of the SQL server containing the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="server", type=String.class, parameters={})
    private Output<String> server;

    /**
     * @return The name of the SQL server containing the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> server() {
        return this.server;
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
     * The name of the table in the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="table", type=String.class, parameters={})
    private Output<String> table;

    /**
     * @return The name of the table in the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> table() {
        return this.table;
    }
    /**
     * The user name that will be used to connect to the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user name that will be used to connect to the Azure SQL database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OutputSynapse(String name) {
        this(name, OutputSynapseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OutputSynapse(String name, OutputSynapseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OutputSynapse(String name, OutputSynapseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputSynapse:OutputSynapse", name, args == null ? OutputSynapseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OutputSynapse(String name, Output<String> id, @Nullable OutputSynapseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputSynapse:OutputSynapse", name, state, makeResourceOptions(options, id));
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
    public static OutputSynapse get(String name, Output<String> id, @Nullable OutputSynapseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OutputSynapse(name, id, state, options);
    }
}