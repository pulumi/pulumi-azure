// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs;
import com.pulumi.azure.sentinel.inputs.DataConnectorMicrosoftCloudAppSecurityState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Microsoft Cloud App Security Data Connector.
 * 
 * !&gt; **Note:** This resource requires that [Enterprise Mobility + Security E5](https://www.microsoft.com/en-us/microsoft-365/enterprise-mobility-security) is enabled on the tenant being connected to.
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
 * import com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurity;
 * import com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs;
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
 *             .location("west europe")
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
 *         var exampleDataConnectorMicrosoftCloudAppSecurity = new DataConnectorMicrosoftCloudAppSecurity("exampleDataConnectorMicrosoftCloudAppSecurity", DataConnectorMicrosoftCloudAppSecurityArgs.builder()
 *             .name("example")
 *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
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
 * Microsoft Cloud App Security Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:sentinel/dataConnectorMicrosoftCloudAppSecurity:DataConnectorMicrosoftCloudAppSecurity example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorMicrosoftCloudAppSecurity:DataConnectorMicrosoftCloudAppSecurity")
public class DataConnectorMicrosoftCloudAppSecurity extends com.pulumi.resources.CustomResource {
    /**
     * Should the alerts be enabled? Defaults to `true`.
     * 
     */
    @Export(name="alertsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alertsEnabled;

    /**
     * @return Should the alerts be enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> alertsEnabled() {
        return Codegen.optional(this.alertsEnabled);
    }
    /**
     * Should the Discovery Logs be enabled? Defaults to `true`.
     * 
     * &gt; **Note:** One of either `alerts_enabled` or `discovery_logs_enabled` has to be specified.
     * 
     */
    @Export(name="discoveryLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> discoveryLogsEnabled;

    /**
     * @return Should the Discovery Logs be enabled? Defaults to `true`.
     * 
     * &gt; **Note:** One of either `alerts_enabled` or `discovery_logs_enabled` has to be specified.
     * 
     */
    public Output<Optional<Boolean>> discoveryLogsEnabled() {
        return Codegen.optional(this.discoveryLogsEnabled);
    }
    /**
     * The ID of the Log Analytics Workspace that this Microsoft Cloud App Security Data Connector resides in. Changing this forces a new Microsoft Cloud App Security Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", refs={String.class}, tree="[0]")
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this Microsoft Cloud App Security Data Connector resides in. Changing this forces a new Microsoft Cloud App Security Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The name which should be used for this Microsoft Cloud App Security Data Connector. Changing this forces a new Microsoft Cloud App Security Data Connector to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Microsoft Cloud App Security Data Connector. Changing this forces a new Microsoft Cloud App Security Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Tenant that this Microsoft Cloud App Security Data Connector connects to.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The ID of the Tenant that this Microsoft Cloud App Security Data Connector connects to.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorMicrosoftCloudAppSecurity(java.lang.String name) {
        this(name, DataConnectorMicrosoftCloudAppSecurityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorMicrosoftCloudAppSecurity(java.lang.String name, DataConnectorMicrosoftCloudAppSecurityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorMicrosoftCloudAppSecurity(java.lang.String name, DataConnectorMicrosoftCloudAppSecurityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorMicrosoftCloudAppSecurity:DataConnectorMicrosoftCloudAppSecurity", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataConnectorMicrosoftCloudAppSecurity(java.lang.String name, Output<java.lang.String> id, @Nullable DataConnectorMicrosoftCloudAppSecurityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorMicrosoftCloudAppSecurity:DataConnectorMicrosoftCloudAppSecurity", name, state, makeResourceOptions(options, id), false);
    }

    private static DataConnectorMicrosoftCloudAppSecurityArgs makeArgs(DataConnectorMicrosoftCloudAppSecurityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataConnectorMicrosoftCloudAppSecurityArgs.Empty : args;
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
    public static DataConnectorMicrosoftCloudAppSecurity get(java.lang.String name, Output<java.lang.String> id, @Nullable DataConnectorMicrosoftCloudAppSecurityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorMicrosoftCloudAppSecurity(name, id, state, options);
    }
}
