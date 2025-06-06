// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorAwsS3Args;
import com.pulumi.azure.sentinel.inputs.DataConnectorAwsS3State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a AWS S3 Data Connector.
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
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
 * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
 * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
 * import com.pulumi.azure.sentinel.DataConnectorAwsS3;
 * import com.pulumi.azure.sentinel.DataConnectorAwsS3Args;
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
 *             .name("example-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
 *             .name("example-workspace")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku("PerGB2018")
 *             .build());
 * 
 *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
 *             .workspaceId(exampleAnalyticsWorkspace.id())
 *             .build());
 * 
 *         var exampleDataConnectorAwsS3 = new DataConnectorAwsS3("exampleDataConnectorAwsS3", DataConnectorAwsS3Args.builder()
 *             .name("example")
 *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
 *             .awsRoleArn("arn:aws:iam::000000000000:role/role1")
 *             .destinationTable("AWSGuardDuty")
 *             .sqsUrls("https://sqs.us-east-1.amazonaws.com/000000000000/example")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * AWS S3 Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3")
public class DataConnectorAwsS3 extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    @Export(name="awsRoleArn", refs={String.class}, tree="[0]")
    private Output<String> awsRoleArn;

    /**
     * @return The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }
    /**
     * The name of the Log Analytics table that will store the ingested data.
     * 
     */
    @Export(name="destinationTable", refs={String.class}, tree="[0]")
    private Output<String> destinationTable;

    /**
     * @return The name of the Log Analytics table that will store the ingested data.
     * 
     */
    public Output<String> destinationTable() {
        return this.destinationTable;
    }
    /**
     * The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", refs={String.class}, tree="[0]")
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    @Export(name="sqsUrls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sqsUrls;

    /**
     * @return Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    public Output<List<String>> sqsUrls() {
        return this.sqsUrls;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorAwsS3(java.lang.String name) {
        this(name, DataConnectorAwsS3Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorAwsS3(java.lang.String name, DataConnectorAwsS3Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorAwsS3(java.lang.String name, DataConnectorAwsS3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataConnectorAwsS3(java.lang.String name, Output<java.lang.String> id, @Nullable DataConnectorAwsS3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, state, makeResourceOptions(options, id), false);
    }

    private static DataConnectorAwsS3Args makeArgs(DataConnectorAwsS3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataConnectorAwsS3Args.Empty : args;
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
    public static DataConnectorAwsS3 get(java.lang.String name, Output<java.lang.String> id, @Nullable DataConnectorAwsS3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorAwsS3(name, id, state, options);
    }
}
