// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.JobTargetGroupArgs;
import com.pulumi.azure.mssql.inputs.JobTargetGroupState;
import com.pulumi.azure.mssql.outputs.JobTargetGroupJobTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Job Target Group.
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
 * import com.pulumi.azure.mssql.Server;
 * import com.pulumi.azure.mssql.ServerArgs;
 * import com.pulumi.azure.mssql.Database;
 * import com.pulumi.azure.mssql.DatabaseArgs;
 * import com.pulumi.azure.mssql.JobAgent;
 * import com.pulumi.azure.mssql.JobAgentArgs;
 * import com.pulumi.azure.mssql.JobCredential;
 * import com.pulumi.azure.mssql.JobCredentialArgs;
 * import com.pulumi.azure.mssql.JobTargetGroup;
 * import com.pulumi.azure.mssql.JobTargetGroupArgs;
 * import com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs;
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
 *             .name("example")
 *             .location("westeurope")
 *             .build());
 * 
 *         var exampleServer = new Server("exampleServer", ServerArgs.builder()
 *             .name("example-server")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .version("12.0")
 *             .administratorLogin("4dm1n157r470r")
 *             .administratorLoginPassword("4-v3ry-53cr37-p455w0rd")
 *             .build());
 * 
 *         var exampleDatabase = new Database("exampleDatabase", DatabaseArgs.builder()
 *             .name("example-db")
 *             .serverId(exampleServer.id())
 *             .collation("SQL_Latin1_General_CP1_CI_AS")
 *             .skuName("S1")
 *             .build());
 * 
 *         var exampleJobAgent = new JobAgent("exampleJobAgent", JobAgentArgs.builder()
 *             .name("example-job-agent")
 *             .location(example.location())
 *             .databaseId(exampleDatabase.id())
 *             .build());
 * 
 *         var exampleJobCredential = new JobCredential("exampleJobCredential", JobCredentialArgs.builder()
 *             .name("example-job-credential")
 *             .jobAgentId(exampleJobAgent.id())
 *             .username("testusername")
 *             .password("testpassword")
 *             .build());
 * 
 *         var exampleJobTargetGroup = new JobTargetGroup("exampleJobTargetGroup", JobTargetGroupArgs.builder()
 *             .name("example-target-group")
 *             .jobAgentId(exampleJobAgent.id())
 *             .jobTargets(JobTargetGroupJobTargetArgs.builder()
 *                 .serverName(exampleServer.name())
 *                 .jobCredentialId(exampleJobCredential.id())
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
 * * `Microsoft.Sql`: 2023-08-01-preview
 * 
 * ## Import
 * 
 * Job Target Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:mssql/jobTargetGroup:JobTargetGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Sql/servers/myserver1/jobAgents/myjobagent1/targetGroups/mytargetgroup1
 * ```
 * 
 */
@ResourceType(type="azure:mssql/jobTargetGroup:JobTargetGroup")
public class JobTargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Elastic Job Agent. Changing this forces a new Job Target Group to be created.
     * 
     */
    @Export(name="jobAgentId", refs={String.class}, tree="[0]")
    private Output<String> jobAgentId;

    /**
     * @return The ID of the Elastic Job Agent. Changing this forces a new Job Target Group to be created.
     * 
     */
    public Output<String> jobAgentId() {
        return this.jobAgentId;
    }
    /**
     * One or more `job_target` blocks as defined below.
     * 
     */
    @Export(name="jobTargets", refs={List.class,JobTargetGroupJobTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<JobTargetGroupJobTarget>> jobTargets;

    /**
     * @return One or more `job_target` blocks as defined below.
     * 
     */
    public Output<Optional<List<JobTargetGroupJobTarget>>> jobTargets() {
        return Codegen.optional(this.jobTargets);
    }
    /**
     * The name which should be used for this Job Target Group. Changing this forces a new Job Target Group to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Job Target Group. Changing this forces a new Job Target Group to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobTargetGroup(java.lang.String name) {
        this(name, JobTargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobTargetGroup(java.lang.String name, JobTargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTargetGroup(java.lang.String name, JobTargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/jobTargetGroup:JobTargetGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private JobTargetGroup(java.lang.String name, Output<java.lang.String> id, @Nullable JobTargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/jobTargetGroup:JobTargetGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static JobTargetGroupArgs makeArgs(JobTargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? JobTargetGroupArgs.Empty : args;
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
    public static JobTargetGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable JobTargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobTargetGroup(name, id, state, options);
    }
}
