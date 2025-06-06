// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentState;
import com.pulumi.azure.pim.outputs.EligibleRoleAssignmentSchedule;
import com.pulumi.azure.pim.outputs.EligibleRoleAssignmentTicket;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a PIM Eligible Role Assignment.
 * 
 * ## Example Usage
 * 
 * ### Subscription)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.inputs.GetSubscriptionArgs;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumiverse.time.Static;
 * import com.pulumi.azure.pim.EligibleRoleAssignment;
 * import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs;
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
 *         final var primary = CoreFunctions.getSubscription(GetSubscriptionArgs.builder()
 *             .build());
 * 
 *         final var example = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         final var exampleGetRoleDefinition = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name("Reader")
 *             .build());
 * 
 *         var exampleStatic = new Static("exampleStatic");
 * 
 *         var exampleEligibleRoleAssignment = new EligibleRoleAssignment("exampleEligibleRoleAssignment", EligibleRoleAssignmentArgs.builder()
 *             .scope(primary.id())
 *             .roleDefinitionId(String.format("%s%s", primary.id(),exampleGetRoleDefinition.id()))
 *             .principalId(example.objectId())
 *             .schedule(EligibleRoleAssignmentScheduleArgs.builder()
 *                 .startDateTime(exampleStatic.rfc3339())
 *                 .expiration(EligibleRoleAssignmentScheduleExpirationArgs.builder()
 *                     .durationHours(8)
 *                     .build())
 *                 .build())
 *             .justification("Expiration Duration Set")
 *             .ticket(EligibleRoleAssignmentTicketArgs.builder()
 *                 .number("1")
 *                 .system("example ticket system")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Management Group)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.azure.management.Group;
 * import com.pulumi.azure.management.GroupArgs;
 * import com.pulumiverse.time.Static;
 * import com.pulumi.azure.pim.EligibleRoleAssignment;
 * import com.pulumi.azure.pim.EligibleRoleAssignmentArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs;
 * import com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs;
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
 *         final var example = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         final var exampleGetRoleDefinition = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name("Reader")
 *             .build());
 * 
 *         var exampleGroup = new Group("exampleGroup", GroupArgs.builder()
 *             .name("Example-Management-Group")
 *             .build());
 * 
 *         var exampleStatic = new Static("exampleStatic");
 * 
 *         var exampleEligibleRoleAssignment = new EligibleRoleAssignment("exampleEligibleRoleAssignment", EligibleRoleAssignmentArgs.builder()
 *             .scope(exampleGroup.id())
 *             .roleDefinitionId(exampleGetRoleDefinition.id())
 *             .principalId(example.objectId())
 *             .schedule(EligibleRoleAssignmentScheduleArgs.builder()
 *                 .startDateTime(exampleStatic.rfc3339())
 *                 .expiration(EligibleRoleAssignmentScheduleExpirationArgs.builder()
 *                     .durationHours(8)
 *                     .build())
 *                 .build())
 *             .justification("Expiration Duration Set")
 *             .ticket(EligibleRoleAssignmentTicketArgs.builder()
 *                 .number("1")
 *                 .system("example ticket system")
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
 * * `Microsoft.Authorization`: 2020-10-01
 * 
 * ## Import
 * 
 * PIM Eligible Role Assignments can be imported using the following composite resource ID, e.g.
 * 
 * ```sh
 * $ pulumi import azure:pim/eligibleRoleAssignment:EligibleRoleAssignment example /subscriptions/00000000-0000-0000-0000-000000000000|/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/roleDefinitions/00000000-0000-0000-0000-000000000000|00000000-0000-0000-0000-000000000000
 * ```
 * 
 */
@ResourceType(type="azure:pim/eligibleRoleAssignment:EligibleRoleAssignment")
public class EligibleRoleAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The condition that limits the resources that the role can be assigned to. See the [official conditions documentation](https://learn.microsoft.com/en-us/azure/role-based-access-control/conditions-overview#what-are-role-assignment-conditions) for details. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="condition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> condition;

    /**
     * @return The condition that limits the resources that the role can be assigned to. See the [official conditions documentation](https://learn.microsoft.com/en-us/azure/role-based-access-control/conditions-overview#what-are-role-assignment-conditions) for details. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * The version of the condition. Supported values include `2.0`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `condition_version` is required when specifying `condition` and vice versa.
     * 
     */
    @Export(name="conditionVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> conditionVersion;

    /**
     * @return The version of the condition. Supported values include `2.0`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `condition_version` is required when specifying `condition` and vice versa.
     * 
     */
    public Output<Optional<String>> conditionVersion() {
        return Codegen.optional(this.conditionVersion);
    }
    /**
     * The justification of the role assignment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="justification", refs={String.class}, tree="[0]")
    private Output<String> justification;

    /**
     * @return The justification of the role assignment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> justification() {
        return this.justification;
    }
    /**
     * Object ID of the principal for this eligible role assignment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="principalId", refs={String.class}, tree="[0]")
    private Output<String> principalId;

    /**
     * @return Object ID of the principal for this eligible role assignment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * Type of principal to which the role will be assigned.
     * 
     */
    @Export(name="principalType", refs={String.class}, tree="[0]")
    private Output<String> principalType;

    /**
     * @return Type of principal to which the role will be assigned.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }
    /**
     * The role definition ID for this eligible role assignment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="roleDefinitionId", refs={String.class}, tree="[0]")
    private Output<String> roleDefinitionId;

    /**
     * @return The role definition ID for this eligible role assignment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * A `schedule` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="schedule", refs={EligibleRoleAssignmentSchedule.class}, tree="[0]")
    private Output<EligibleRoleAssignmentSchedule> schedule;

    /**
     * @return A `schedule` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<EligibleRoleAssignmentSchedule> schedule() {
        return this.schedule;
    }
    /**
     * The scope for this eligible role assignment, should be a valid resource ID. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope for this eligible role assignment, should be a valid resource ID. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * A `ticket` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ticket", refs={EligibleRoleAssignmentTicket.class}, tree="[0]")
    private Output<EligibleRoleAssignmentTicket> ticket;

    /**
     * @return A `ticket` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<EligibleRoleAssignmentTicket> ticket() {
        return this.ticket;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EligibleRoleAssignment(java.lang.String name) {
        this(name, EligibleRoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EligibleRoleAssignment(java.lang.String name, EligibleRoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EligibleRoleAssignment(java.lang.String name, EligibleRoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EligibleRoleAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable EligibleRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/eligibleRoleAssignment:EligibleRoleAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static EligibleRoleAssignmentArgs makeArgs(EligibleRoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EligibleRoleAssignmentArgs.Empty : args;
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
    public static EligibleRoleAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable EligibleRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EligibleRoleAssignment(name, id, state, options);
    }
}
