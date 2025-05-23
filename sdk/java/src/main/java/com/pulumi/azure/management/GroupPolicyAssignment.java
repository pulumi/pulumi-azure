// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.management.GroupPolicyAssignmentArgs;
import com.pulumi.azure.management.inputs.GroupPolicyAssignmentState;
import com.pulumi.azure.management.outputs.GroupPolicyAssignmentIdentity;
import com.pulumi.azure.management.outputs.GroupPolicyAssignmentNonComplianceMessage;
import com.pulumi.azure.management.outputs.GroupPolicyAssignmentOverride;
import com.pulumi.azure.management.outputs.GroupPolicyAssignmentResourceSelector;
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
 * Manages a Policy Assignment to a Management Group.
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
 * import com.pulumi.azure.management.Group;
 * import com.pulumi.azure.management.GroupArgs;
 * import com.pulumi.azure.policy.Definition;
 * import com.pulumi.azure.policy.DefinitionArgs;
 * import com.pulumi.azure.management.GroupPolicyAssignment;
 * import com.pulumi.azure.management.GroupPolicyAssignmentArgs;
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
 *         var example = new Group("example", GroupArgs.builder()
 *             .displayName("Some Management Group")
 *             .build());
 * 
 *         var exampleDefinition = new Definition("exampleDefinition", DefinitionArgs.builder()
 *             .name("only-deploy-in-westeurope")
 *             .policyType("Custom")
 *             .mode("All")
 *             .displayName("my-policy-definition")
 *             .managementGroupId(example.id())
 *             .policyRule("""
 *  {
 *     "if": {
 *       "not": {
 *         "field": "location",
 *         "equals": "westeurope"
 *       }
 *     },
 *     "then": {
 *       "effect": "Deny"
 *     }
 *   }
 *             """)
 *             .build());
 * 
 *         var exampleGroupPolicyAssignment = new GroupPolicyAssignment("exampleGroupPolicyAssignment", GroupPolicyAssignmentArgs.builder()
 *             .name("example-policy")
 *             .policyDefinitionId(exampleDefinition.id())
 *             .managementGroupId(example.id())
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
 * * `Microsoft.Authorization`: 2022-06-01
 * 
 * ## Import
 * 
 * Management Group Policy Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:management/groupPolicyAssignment:GroupPolicyAssignment example /providers/Microsoft.Management/managementGroups/group1/providers/Microsoft.Authorization/policyAssignments/assignment1
 * ```
 * 
 */
@ResourceType(type="azure:management/groupPolicyAssignment:GroupPolicyAssignment")
public class GroupPolicyAssignment extends com.pulumi.resources.CustomResource {
    /**
     * A description which should be used for this Policy Assignment.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description which should be used for this Policy Assignment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Display Name for this Policy Assignment.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The Display Name for this Policy Assignment.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Specifies if this Policy should be enforced or not? Defaults to `true`.
     * 
     */
    @Export(name="enforce", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enforce;

    /**
     * @return Specifies if this Policy should be enforced or not? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enforce() {
        return Codegen.optional(this.enforce);
    }
    /**
     * An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * 
     */
    @Export(name="identity", refs={GroupPolicyAssignmentIdentity.class}, tree="[0]")
    private Output</* @Nullable */ GroupPolicyAssignmentIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * 
     */
    public Output<Optional<GroupPolicyAssignmentIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="managementGroupId", refs={String.class}, tree="[0]")
    private Output<String> managementGroupId;

    /**
     * @return The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }
    /**
     * A JSON mapping of any Metadata for this Policy.
     * 
     */
    @Export(name="metadata", refs={String.class}, tree="[0]")
    private Output<String> metadata;

    /**
     * @return A JSON mapping of any Metadata for this Policy.
     * 
     */
    public Output<String> metadata() {
        return this.metadata;
    }
    /**
     * The name which should be used for this Policy Assignment. Possible values must be between 3 and 24 characters in length. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Policy Assignment. Possible values must be between 3 and 24 characters in length. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `non_compliance_message` blocks as defined below.
     * 
     */
    @Export(name="nonComplianceMessages", refs={List.class,GroupPolicyAssignmentNonComplianceMessage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GroupPolicyAssignmentNonComplianceMessage>> nonComplianceMessages;

    /**
     * @return One or more `non_compliance_message` blocks as defined below.
     * 
     */
    public Output<Optional<List<GroupPolicyAssignmentNonComplianceMessage>>> nonComplianceMessages() {
        return Codegen.optional(this.nonComplianceMessages);
    }
    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    @Export(name="notScopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> notScopes;

    /**
     * @return Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    public Output<Optional<List<String>>> notScopes() {
        return Codegen.optional(this.notScopes);
    }
    /**
     * One or more `overrides` blocks as defined below. More detail about `overrides` and `resource_selectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
     * 
     */
    @Export(name="overrides", refs={List.class,GroupPolicyAssignmentOverride.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GroupPolicyAssignmentOverride>> overrides;

    /**
     * @return One or more `overrides` blocks as defined below. More detail about `overrides` and `resource_selectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
     * 
     */
    public Output<Optional<List<GroupPolicyAssignmentOverride>>> overrides() {
        return Codegen.optional(this.overrides);
    }
    /**
     * A JSON mapping of any Parameters for this Policy.
     * 
     */
    @Export(name="parameters", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parameters;

    /**
     * @return A JSON mapping of any Parameters for this Policy.
     * 
     */
    public Output<Optional<String>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="policyDefinitionId", refs={String.class}, tree="[0]")
    private Output<String> policyDefinitionId;

    /**
     * @return The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> policyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * One or more `resource_selectors` blocks as defined below to filter polices by resource properties.
     * 
     */
    @Export(name="resourceSelectors", refs={List.class,GroupPolicyAssignmentResourceSelector.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GroupPolicyAssignmentResourceSelector>> resourceSelectors;

    /**
     * @return One or more `resource_selectors` blocks as defined below to filter polices by resource properties.
     * 
     */
    public Output<Optional<List<GroupPolicyAssignmentResourceSelector>>> resourceSelectors() {
        return Codegen.optional(this.resourceSelectors);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicyAssignment(java.lang.String name) {
        this(name, GroupPolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicyAssignment(java.lang.String name, GroupPolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicyAssignment(java.lang.String name, GroupPolicyAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyAssignment:GroupPolicyAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GroupPolicyAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable GroupPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyAssignment:GroupPolicyAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static GroupPolicyAssignmentArgs makeArgs(GroupPolicyAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GroupPolicyAssignmentArgs.Empty : args;
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
    public static GroupPolicyAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable GroupPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicyAssignment(name, id, state, options);
    }
}
