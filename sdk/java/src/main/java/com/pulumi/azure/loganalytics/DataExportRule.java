// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loganalytics.DataExportRuleArgs;
import com.pulumi.azure.loganalytics.inputs.DataExportRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Log Analytics Data Export Rule.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.loganalytics.DataExportRule;
 * import com.pulumi.azure.loganalytics.DataExportRuleArgs;
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
 *             .name("exampleworkspace")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku("PerGB2018")
 *             .retentionInDays(30)
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplestoracc")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleDataExportRule = new DataExportRule("exampleDataExportRule", DataExportRuleArgs.builder()
 *             .name("dataExport1")
 *             .resourceGroupName(example.name())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.id())
 *             .destinationResourceId(exampleAccount.id())
 *             .tableNames("Heartbeat")
 *             .enabled(true)
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
 * * `Microsoft.OperationalInsights`: 2020-08-01
 * 
 * ## Import
 * 
 * Log Analytics Data Export Rule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:loganalytics/dataExportRule:DataExportRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataExports/dataExport1
 * ```
 * 
 */
@ResourceType(type="azure:loganalytics/dataExportRule:DataExportRule")
public class DataExportRule extends com.pulumi.resources.CustomResource {
    /**
     * The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
     * 
     */
    @Export(name="destinationResourceId", refs={String.class}, tree="[0]")
    private Output<String> destinationResourceId;

    /**
     * @return The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
     * 
     */
    public Output<String> destinationResourceId() {
        return this.destinationResourceId;
    }
    /**
     * Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The ID of the created Data Export Rule.
     * 
     */
    @Export(name="exportRuleId", refs={String.class}, tree="[0]")
    private Output<String> exportRuleId;

    /**
     * @return The ID of the created Data Export Rule.
     * 
     */
    public Output<String> exportRuleId() {
        return this.exportRuleId;
    }
    /**
     * The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A list of table names to export to the destination resource, for example: `[&#34;Heartbeat&#34;, &#34;SecurityEvent&#34;]`.
     * 
     */
    @Export(name="tableNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tableNames;

    /**
     * @return A list of table names to export to the destination resource, for example: `[&#34;Heartbeat&#34;, &#34;SecurityEvent&#34;]`.
     * 
     */
    public Output<List<String>> tableNames() {
        return this.tableNames;
    }
    /**
     * The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="workspaceResourceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceResourceId;

    /**
     * @return The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataExportRule(java.lang.String name) {
        this(name, DataExportRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataExportRule(java.lang.String name, DataExportRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataExportRule(java.lang.String name, DataExportRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/dataExportRule:DataExportRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataExportRule(java.lang.String name, Output<java.lang.String> id, @Nullable DataExportRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/dataExportRule:DataExportRule", name, state, makeResourceOptions(options, id), false);
    }

    private static DataExportRuleArgs makeArgs(DataExportRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataExportRuleArgs.Empty : args;
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
    public static DataExportRule get(java.lang.String name, Output<java.lang.String> id, @Nullable DataExportRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataExportRule(name, id, state, options);
    }
}
