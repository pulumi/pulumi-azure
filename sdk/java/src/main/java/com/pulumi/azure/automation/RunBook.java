// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.RunBookArgs;
import com.pulumi.azure.automation.inputs.RunBookState;
import com.pulumi.azure.automation.outputs.RunBookDraft;
import com.pulumi.azure.automation.outputs.RunBookJobSchedule;
import com.pulumi.azure.automation.outputs.RunBookPublishContentLink;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Automation Runbook.
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
 * import com.pulumi.azure.automation.Account;
 * import com.pulumi.azure.automation.AccountArgs;
 * import com.pulumi.azure.automation.RunBook;
 * import com.pulumi.azure.automation.RunBookArgs;
 * import com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs;
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
 *             .name("account1")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("Basic")
 *             .build());
 * 
 *         var exampleRunBook = new RunBook("exampleRunBook", RunBookArgs.builder()
 *             .name("Get-AzureVMTutorial")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .automationAccountName(exampleAccount.name())
 *             .logVerbose(true)
 *             .logProgress(true)
 *             .description("This is an example runbook")
 *             .runbookType("PowerShellWorkflow")
 *             .publishContentLink(RunBookPublishContentLinkArgs.builder()
 *                 .uri("https://raw.githubusercontent.com/Azure/azure-quickstart-templates/c4935ffb69246a6058eb24f54640f53f69d3ac9f/101-automation-runbook-getvms/Runbooks/Get-AzureVMTutorial.ps1")
 *                 .build())
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
 * Automation Runbooks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:automation/runBook:RunBook Get-AzureVMTutorial /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/runbooks/Get-AzureVMTutorial
 * ```
 * 
 */
@ResourceType(type="azure:automation/runBook:RunBook")
public class RunBook extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", refs={String.class}, tree="[0]")
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The desired content of the runbook.
     * 
     * &gt; **Note:** The Azure API requires a `publish_content_link` to be supplied even when specifying your own `content`.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The desired content of the runbook.
     * 
     * &gt; **Note:** The Azure API requires a `publish_content_link` to be supplied even when specifying your own `content`.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * A description for the runbook.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the runbook.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A `draft` block as defined below.
     * 
     */
    @Export(name="draft", refs={RunBookDraft.class}, tree="[0]")
    private Output</* @Nullable */ RunBookDraft> draft;

    /**
     * @return A `draft` block as defined below.
     * 
     */
    public Output<Optional<RunBookDraft>> draft() {
        return Codegen.optional(this.draft);
    }
    /**
     * One or more `job_schedule` block as defined below.
     * 
     * &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `job_schedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     * 
     */
    @Export(name="jobSchedules", refs={List.class,RunBookJobSchedule.class}, tree="[0,1]")
    private Output<List<RunBookJobSchedule>> jobSchedules;

    /**
     * @return One or more `job_schedule` block as defined below.
     * 
     * &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `job_schedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     * 
     */
    public Output<List<RunBookJobSchedule>> jobSchedules() {
        return this.jobSchedules;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the activity-level tracing options of the runbook, available only for Graphical runbooks. Possible values are `0` for None, `9` for Basic, and `15` for Detailed. Must turn on Verbose logging in order to see the tracing.
     * 
     */
    @Export(name="logActivityTraceLevel", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> logActivityTraceLevel;

    /**
     * @return Specifies the activity-level tracing options of the runbook, available only for Graphical runbooks. Possible values are `0` for None, `9` for Basic, and `15` for Detailed. Must turn on Verbose logging in order to see the tracing.
     * 
     */
    public Output<Optional<Integer>> logActivityTraceLevel() {
        return Codegen.optional(this.logActivityTraceLevel);
    }
    /**
     * Progress log option.
     * 
     */
    @Export(name="logProgress", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> logProgress;

    /**
     * @return Progress log option.
     * 
     */
    public Output<Boolean> logProgress() {
        return this.logProgress;
    }
    /**
     * Verbose log option.
     * 
     */
    @Export(name="logVerbose", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> logVerbose;

    /**
     * @return Verbose log option.
     * 
     */
    public Output<Boolean> logVerbose() {
        return this.logVerbose;
    }
    /**
     * Specifies the name of the Runbook. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Runbook. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One `publish_content_link` block as defined below.
     * 
     */
    @Export(name="publishContentLink", refs={RunBookPublishContentLink.class}, tree="[0]")
    private Output</* @Nullable */ RunBookPublishContentLink> publishContentLink;

    /**
     * @return One `publish_content_link` block as defined below.
     * 
     */
    public Output<Optional<RunBookPublishContentLink>> publishContentLink() {
        return Codegen.optional(this.publishContentLink);
    }
    /**
     * The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell`, `PowerShell72`, `Python3`, `Python2` or `Script`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="runbookType", refs={String.class}, tree="[0]")
    private Output<String> runbookType;

    /**
     * @return The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell`, `PowerShell72`, `Python3`, `Python2` or `Script`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> runbookType() {
        return this.runbookType;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RunBook(java.lang.String name) {
        this(name, RunBookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RunBook(java.lang.String name, RunBookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RunBook(java.lang.String name, RunBookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/runBook:RunBook", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RunBook(java.lang.String name, Output<java.lang.String> id, @Nullable RunBookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/runBook:RunBook", name, state, makeResourceOptions(options, id), false);
    }

    private static RunBookArgs makeArgs(RunBookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RunBookArgs.Empty : args;
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
    public static RunBook get(java.lang.String name, Output<java.lang.String> id, @Nullable RunBookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RunBook(name, id, state, options);
    }
}
