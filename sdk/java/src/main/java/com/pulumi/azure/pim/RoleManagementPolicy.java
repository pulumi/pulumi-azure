// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.pim.RoleManagementPolicyArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyState;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyActivationRules;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyActiveAssignmentRules;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyEligibleAssignmentRules;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRules;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manage a role policy for an Azure Management Group, Subscription, Resource Group or resource.
 * 
 * ## Example Usage
 * 
 * ### Resource Group
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
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.azuread.AzureadFunctions;
 * import com.pulumi.azuread.inputs.GetGroupArgs;
 * import com.pulumi.azure.pim.RoleManagementPolicy;
 * import com.pulumi.azure.pim.RoleManagementPolicyArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStageArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-rg")
 *             .location("East US")
 *             .build());
 * 
 *         final var rgContributor = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name("Contributor")
 *             .scope(example.id())
 *             .build());
 * 
 *         final var approvers = AzureadFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName("Example Approver Group")
 *             .build());
 * 
 *         var exampleRoleManagementPolicy = new RoleManagementPolicy("exampleRoleManagementPolicy", RoleManagementPolicyArgs.builder()
 *             .scope(test.id())
 *             .roleDefinitionId(contributor.id())
 *             .activeAssignmentRules(RoleManagementPolicyActiveAssignmentRulesArgs.builder()
 *                 .expireAfter("P365D")
 *                 .build())
 *             .eligibleAssignmentRules(RoleManagementPolicyEligibleAssignmentRulesArgs.builder()
 *                 .expirationRequired(false)
 *                 .build())
 *             .activationRules(RoleManagementPolicyActivationRulesArgs.builder()
 *                 .maximumDuration("PT1H")
 *                 .requireApproval(true)
 *                 .approvalStage(RoleManagementPolicyActivationRulesApprovalStageArgs.builder()
 *                     .primaryApprovers(RoleManagementPolicyActivationRulesApprovalStagePrimaryApproverArgs.builder()
 *                         .objectId(approvers.objectId())
 *                         .type("Group")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .notificationRules(RoleManagementPolicyNotificationRulesArgs.builder()
 *                 .eligibleAssignments(RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.builder()
 *                     .approverNotifications(RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs.builder()
 *                         .notificationLevel("Critical")
 *                         .defaultRecipients(false)
 *                         .additionalRecipients("someone}{@literal @}{@code example.com")
 *                         .build())
 *                     .build())
 *                 .eligibleActivations(RoleManagementPolicyNotificationRulesEligibleActivationsArgs.builder()
 *                     .assigneeNotifications(RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs.builder()
 *                         .notificationLevel("All")
 *                         .defaultRecipients(true)
 *                         .additionalRecipients("someone.else}{@literal @}{@code example.com")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Management Group
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.management.Group;
 * import com.pulumi.azure.management.GroupArgs;
 * import com.pulumi.azure.authorization.AuthorizationFunctions;
 * import com.pulumi.azure.authorization.inputs.GetRoleDefinitionArgs;
 * import com.pulumi.azure.pim.RoleManagementPolicy;
 * import com.pulumi.azure.pim.RoleManagementPolicyArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs;
 * import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotificationsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new Group("example", GroupArgs.builder()
 *             .name("example-group")
 *             .build());
 * 
 *         final var mgContributor = AuthorizationFunctions.getRoleDefinition(GetRoleDefinitionArgs.builder()
 *             .name("Contributor")
 *             .scope(example.id())
 *             .build());
 * 
 *         var exampleRoleManagementPolicy = new RoleManagementPolicy("exampleRoleManagementPolicy", RoleManagementPolicyArgs.builder()
 *             .scope(example.id())
 *             .roleDefinitionId(mgContributor.applyValue(_mgContributor -> _mgContributor.id()))
 *             .eligibleAssignmentRules(RoleManagementPolicyEligibleAssignmentRulesArgs.builder()
 *                 .expirationRequired(false)
 *                 .build())
 *             .activeAssignmentRules(RoleManagementPolicyActiveAssignmentRulesArgs.builder()
 *                 .expireAfter("P90D")
 *                 .build())
 *             .activationRules(RoleManagementPolicyActivationRulesArgs.builder()
 *                 .maximumDuration("PT1H")
 *                 .requireApproval(true)
 *                 .build())
 *             .notificationRules(RoleManagementPolicyNotificationRulesArgs.builder()
 *                 .activeAssignments(RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.builder()
 *                     .adminNotifications(RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotificationsArgs.builder()
 *                         .notificationLevel("Critical")
 *                         .defaultRecipients(false)
 *                         .additionalRecipients("someone}{@literal @}{@code example.com")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
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
 * Because these policies are created automatically by Azure, they will auto-import on first use. They can be imported using the `resource id` of the role definition, combined with the scope id, e.g.
 * 
 * ```sh
 * $ pulumi import azure:pim/roleManagementPolicy:RoleManagementPolicy example &#34;/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/roleDefinitions/00000000-0000-0000-0000-000000000000|&lt;scope&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="azure:pim/roleManagementPolicy:RoleManagementPolicy")
public class RoleManagementPolicy extends com.pulumi.resources.CustomResource {
    /**
     * An `activation_rules` block as defined below.
     * 
     */
    @Export(name="activationRules", refs={RoleManagementPolicyActivationRules.class}, tree="[0]")
    private Output<RoleManagementPolicyActivationRules> activationRules;

    /**
     * @return An `activation_rules` block as defined below.
     * 
     */
    public Output<RoleManagementPolicyActivationRules> activationRules() {
        return this.activationRules;
    }
    /**
     * An `active_assignment_rules` block as defined below.
     * 
     */
    @Export(name="activeAssignmentRules", refs={RoleManagementPolicyActiveAssignmentRules.class}, tree="[0]")
    private Output<RoleManagementPolicyActiveAssignmentRules> activeAssignmentRules;

    /**
     * @return An `active_assignment_rules` block as defined below.
     * 
     */
    public Output<RoleManagementPolicyActiveAssignmentRules> activeAssignmentRules() {
        return this.activeAssignmentRules;
    }
    /**
     * (String) The description of this policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return (String) The description of this policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * An `eligible_assignment_rules` block as defined below.
     * 
     */
    @Export(name="eligibleAssignmentRules", refs={RoleManagementPolicyEligibleAssignmentRules.class}, tree="[0]")
    private Output<RoleManagementPolicyEligibleAssignmentRules> eligibleAssignmentRules;

    /**
     * @return An `eligible_assignment_rules` block as defined below.
     * 
     */
    public Output<RoleManagementPolicyEligibleAssignmentRules> eligibleAssignmentRules() {
        return this.eligibleAssignmentRules;
    }
    /**
     * (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `notification_rules` block as defined below.
     * 
     */
    @Export(name="notificationRules", refs={RoleManagementPolicyNotificationRules.class}, tree="[0]")
    private Output<RoleManagementPolicyNotificationRules> notificationRules;

    /**
     * @return A `notification_rules` block as defined below.
     * 
     */
    public Output<RoleManagementPolicyNotificationRules> notificationRules() {
        return this.notificationRules;
    }
    /**
     * The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="roleDefinitionId", refs={String.class}, tree="[0]")
    private Output<String> roleDefinitionId;

    /**
     * @return The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleManagementPolicy(java.lang.String name) {
        this(name, RoleManagementPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleManagementPolicy(java.lang.String name, RoleManagementPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleManagementPolicy(java.lang.String name, RoleManagementPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/roleManagementPolicy:RoleManagementPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RoleManagementPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable RoleManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:pim/roleManagementPolicy:RoleManagementPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static RoleManagementPolicyArgs makeArgs(RoleManagementPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RoleManagementPolicyArgs.Empty : args;
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
    public static RoleManagementPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable RoleManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleManagementPolicy(name, id, state, options);
    }
}
