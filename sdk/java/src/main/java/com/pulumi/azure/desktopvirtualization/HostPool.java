// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.desktopvirtualization.HostPoolArgs;
import com.pulumi.azure.desktopvirtualization.inputs.HostPoolState;
import com.pulumi.azure.desktopvirtualization.outputs.HostPoolScheduledAgentUpdates;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Desktop Host Pool.
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
 * import com.pulumi.azure.desktopvirtualization.HostPool;
 * import com.pulumi.azure.desktopvirtualization.HostPoolArgs;
 * import com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs;
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
 *         var exampleHostPool = new HostPool("exampleHostPool", HostPoolArgs.builder()
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .name("pooleddepthfirst")
 *             .friendlyName("pooleddepthfirst")
 *             .validateEnvironment(true)
 *             .startVmOnConnect(true)
 *             .customRdpProperties("audiocapturemode:i:1;audiomode:i:0;")
 *             .description("Acceptance Test: A pooled host pool - pooleddepthfirst")
 *             .type("Pooled")
 *             .maximumSessionsAllowed(50)
 *             .loadBalancerType("DepthFirst")
 *             .scheduledAgentUpdates(HostPoolScheduledAgentUpdatesArgs.builder()
 *                 .enabled(true)
 *                 .schedules(HostPoolScheduledAgentUpdatesScheduleArgs.builder()
 *                     .dayOfWeek("Saturday")
 *                     .hourOfDay(2)
 *                     .build())
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
 * * `Microsoft.DesktopVirtualization`: 2024-04-03
 * 
 * ## Import
 * 
 * Virtual Desktop Host Pools can be imported using the `resource id`, e.g.
 * 
 * text
 * 
 * ```sh
 * $ pulumi import azure:desktopvirtualization/hostPool:HostPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.DesktopVirtualization/hostPools/myhostpool
 * ```
 * 
 */
@ResourceType(type="azure:desktopvirtualization/hostPool:HostPool")
public class HostPool extends com.pulumi.resources.CustomResource {
    /**
     * A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
     * 
     */
    @Export(name="customRdpProperties", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customRdpProperties;

    /**
     * @return A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
     * 
     */
    public Output<Optional<String>> customRdpProperties() {
        return Codegen.optional(this.customRdpProperties);
    }
    /**
     * A description for the Virtual Desktop Host Pool.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Virtual Desktop Host Pool.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A friendly name for the Virtual Desktop Host Pool.
     * 
     */
    @Export(name="friendlyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return A friendly name for the Virtual Desktop Host Pool.
     * 
     */
    public Output<Optional<String>> friendlyName() {
        return Codegen.optional(this.friendlyName);
    }
    /**
     * `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool. Possible values are `BreadthFirst`, `DepthFirst` and `Persistent`.
     * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
     * `Persistent` should be used if the host pool type is `Personal`
     * 
     */
    @Export(name="loadBalancerType", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerType;

    /**
     * @return `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool. Possible values are `BreadthFirst`, `DepthFirst` and `Persistent`.
     * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
     * `Persistent` should be used if the host pool type is `Personal`
     * 
     */
    public Output<String> loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The location/region where the Virtual Desktop Host Pool is located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location/region where the Virtual Desktop Host Pool is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
     * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
     * 
     */
    @Export(name="maximumSessionsAllowed", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maximumSessionsAllowed;

    /**
     * @return A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
     * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
     * 
     */
    public Output<Optional<Integer>> maximumSessionsAllowed() {
        return Codegen.optional(this.maximumSessionsAllowed);
    }
    /**
     * The name of the Virtual Desktop Host Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Virtual Desktop Host Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `Automatic` assignment – The service will select an available host and assign it to an user. Possible values are `Automatic` and `Direct`. `Direct` Assignment – Admin selects a specific host to assign to an user. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `personal_desktop_assignment_type` is required if the `type` of your Virtual Desktop Host Pool is `Personal`
     * 
     */
    @Export(name="personalDesktopAssignmentType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> personalDesktopAssignmentType;

    /**
     * @return `Automatic` assignment – The service will select an available host and assign it to an user. Possible values are `Automatic` and `Direct`. `Direct` Assignment – Admin selects a specific host to assign to an user. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `personal_desktop_assignment_type` is required if the `type` of your Virtual Desktop Host Pool is `Personal`
     * 
     */
    public Output<Optional<String>> personalDesktopAssignmentType() {
        return Codegen.optional(this.personalDesktopAssignmentType);
    }
    /**
     * Option to specify the preferred Application Group type for the Virtual Desktop Host Pool. Valid options are `None`, `Desktop` or `RailApplications`. Default is `Desktop`.
     * 
     */
    @Export(name="preferredAppGroupType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> preferredAppGroupType;

    /**
     * @return Option to specify the preferred Application Group type for the Virtual Desktop Host Pool. Valid options are `None`, `Desktop` or `RailApplications`. Default is `Desktop`.
     * 
     */
    public Output<Optional<String>> preferredAppGroupType() {
        return Codegen.optional(this.preferredAppGroupType);
    }
    /**
     * Whether public network access is allowed for the Virtual Desktop Host Pool. Possible values are `Enabled`, `Disabled`, `EnabledForClientsOnly` and `EnabledForSessionHostsOnly`. Defaults to `Enabled`.
     * 
     */
    @Export(name="publicNetworkAccess", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether public network access is allowed for the Virtual Desktop Host Pool. Possible values are `Enabled`, `Disabled`, `EnabledForClientsOnly` and `EnabledForSessionHostsOnly`. Defaults to `Enabled`.
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * The name of the resource group in which to create the Virtual Desktop Host Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Virtual Desktop Host Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * 
     */
    @Export(name="scheduledAgentUpdates", refs={HostPoolScheduledAgentUpdates.class}, tree="[0]")
    private Output</* @Nullable */ HostPoolScheduledAgentUpdates> scheduledAgentUpdates;

    /**
     * @return A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * 
     */
    public Output<Optional<HostPoolScheduledAgentUpdates>> scheduledAgentUpdates() {
        return Codegen.optional(this.scheduledAgentUpdates);
    }
    /**
     * Enables or disables the Start VM on Connection Feature. Defaults to `false`.
     * 
     */
    @Export(name="startVmOnConnect", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startVmOnConnect;

    /**
     * @return Enables or disables the Start VM on Connection Feature. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> startVmOnConnect() {
        return Codegen.optional(this.startVmOnConnect);
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
     * The type of the Virtual Desktop Host Pool. Valid options are `Personal` or `Pooled`. Changing the type forces a new resource to be created.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the Virtual Desktop Host Pool. Valid options are `Personal` or `Pooled`. Changing the type forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Allows you to test service changes before they are deployed to production. Defaults to `false`.
     * 
     */
    @Export(name="validateEnvironment", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> validateEnvironment;

    /**
     * @return Allows you to test service changes before they are deployed to production. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> validateEnvironment() {
        return Codegen.optional(this.validateEnvironment);
    }
    /**
     * A VM template for session hosts configuration within hostpool. This is a JSON string.
     * 
     */
    @Export(name="vmTemplate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vmTemplate;

    /**
     * @return A VM template for session hosts configuration within hostpool. This is a JSON string.
     * 
     */
    public Output<Optional<String>> vmTemplate() {
        return Codegen.optional(this.vmTemplate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostPool(java.lang.String name) {
        this(name, HostPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostPool(java.lang.String name, HostPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostPool(java.lang.String name, HostPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:desktopvirtualization/hostPool:HostPool", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HostPool(java.lang.String name, Output<java.lang.String> id, @Nullable HostPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:desktopvirtualization/hostPool:HostPool", name, state, makeResourceOptions(options, id), false);
    }

    private static HostPoolArgs makeArgs(HostPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HostPoolArgs.Empty : args;
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
    public static HostPool get(java.lang.String name, Output<java.lang.String> id, @Nullable HostPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostPool(name, id, state, options);
    }
}
