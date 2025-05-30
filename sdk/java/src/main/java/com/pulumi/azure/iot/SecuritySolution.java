// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.SecuritySolutionArgs;
import com.pulumi.azure.iot.inputs.SecuritySolutionState;
import com.pulumi.azure.iot.outputs.SecuritySolutionAdditionalWorkspace;
import com.pulumi.azure.iot.outputs.SecuritySolutionRecommendationsEnabled;
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
 * Manages an iot security solution.
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
 * import com.pulumi.azure.iot.IoTHub;
 * import com.pulumi.azure.iot.IoTHubArgs;
 * import com.pulumi.azure.iot.inputs.IoTHubSkuArgs;
 * import com.pulumi.azure.iot.SecuritySolution;
 * import com.pulumi.azure.iot.SecuritySolutionArgs;
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
 *         var exampleIoTHub = new IoTHub("exampleIoTHub", IoTHubArgs.builder()
 *             .name("example-IoTHub")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .sku(IoTHubSkuArgs.builder()
 *                 .name("S1")
 *                 .capacity(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleSecuritySolution = new SecuritySolution("exampleSecuritySolution", SecuritySolutionArgs.builder()
 *             .name("example-Iot-Security-Solution")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .displayName("Iot Security Solution")
 *             .iothubIds(exampleIoTHub.id())
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
 * Iot Security Solution can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:iot/securitySolution:SecuritySolution example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Security/iotSecuritySolutions/solution1
 * ```
 * 
 */
@ResourceType(type="azure:iot/securitySolution:SecuritySolution")
public class SecuritySolution extends com.pulumi.resources.CustomResource {
    /**
     * A `additional_workspace` block as defined below.
     * 
     */
    @Export(name="additionalWorkspaces", refs={List.class,SecuritySolutionAdditionalWorkspace.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SecuritySolutionAdditionalWorkspace>> additionalWorkspaces;

    /**
     * @return A `additional_workspace` block as defined below.
     * 
     */
    public Output<Optional<List<SecuritySolutionAdditionalWorkspace>>> additionalWorkspaces() {
        return Codegen.optional(this.additionalWorkspaces);
    }
    /**
     * A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
     * 
     */
    @Export(name="disabledDataSources", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> disabledDataSources;

    /**
     * @return A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
     * 
     */
    public Output<Optional<List<String>>> disabledDataSources() {
        return Codegen.optional(this.disabledDataSources);
    }
    /**
     * Specifies the Display Name for this Iot Security Solution.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Specifies the Display Name for this Iot Security Solution.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Is the Iot Security Solution enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is the Iot Security Solution enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
     * 
     */
    @Export(name="eventsToExports", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> eventsToExports;

    /**
     * @return A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
     * 
     */
    public Output<Optional<List<String>>> eventsToExports() {
        return Codegen.optional(this.eventsToExports);
    }
    /**
     * Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
     * 
     */
    @Export(name="iothubIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> iothubIds;

    /**
     * @return Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
     * 
     */
    public Output<List<String>> iothubIds() {
        return this.iothubIds;
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
     * Specifies the Log Analytics Workspace ID to which the security data will be sent.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logAnalyticsWorkspaceId;

    /**
     * @return Specifies the Log Analytics Workspace ID to which the security data will be sent.
     * 
     */
    public Output<Optional<String>> logAnalyticsWorkspaceId() {
        return Codegen.optional(this.logAnalyticsWorkspaceId);
    }
    /**
     * Should IP addressed be unmasked in the log? Defaults to `false`.
     * 
     */
    @Export(name="logUnmaskedIpsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logUnmaskedIpsEnabled;

    /**
     * @return Should IP addressed be unmasked in the log? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> logUnmaskedIpsEnabled() {
        return Codegen.optional(this.logUnmaskedIpsEnabled);
    }
    /**
     * Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An Azure Resource Graph query used to set the resources monitored.
     * 
     */
    @Export(name="queryForResources", refs={String.class}, tree="[0]")
    private Output<String> queryForResources;

    /**
     * @return An Azure Resource Graph query used to set the resources monitored.
     * 
     */
    public Output<String> queryForResources() {
        return this.queryForResources;
    }
    /**
     * A list of subscription Ids on which the user defined resources query should be executed.
     * 
     */
    @Export(name="querySubscriptionIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> querySubscriptionIds;

    /**
     * @return A list of subscription Ids on which the user defined resources query should be executed.
     * 
     */
    public Output<List<String>> querySubscriptionIds() {
        return this.querySubscriptionIds;
    }
    /**
     * A `recommendations_enabled` block of options to enable or disable as defined below.
     * 
     */
    @Export(name="recommendationsEnabled", refs={SecuritySolutionRecommendationsEnabled.class}, tree="[0]")
    private Output<SecuritySolutionRecommendationsEnabled> recommendationsEnabled;

    /**
     * @return A `recommendations_enabled` block of options to enable or disable as defined below.
     * 
     */
    public Output<SecuritySolutionRecommendationsEnabled> recommendationsEnabled() {
        return this.recommendationsEnabled;
    }
    /**
     * Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
    public SecuritySolution(java.lang.String name) {
        this(name, SecuritySolutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecuritySolution(java.lang.String name, SecuritySolutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecuritySolution(java.lang.String name, SecuritySolutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/securitySolution:SecuritySolution", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecuritySolution(java.lang.String name, Output<java.lang.String> id, @Nullable SecuritySolutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/securitySolution:SecuritySolution", name, state, makeResourceOptions(options, id), false);
    }

    private static SecuritySolutionArgs makeArgs(SecuritySolutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecuritySolutionArgs.Empty : args;
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
    public static SecuritySolution get(java.lang.String name, Output<java.lang.String> id, @Nullable SecuritySolutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecuritySolution(name, id, state, options);
    }
}
