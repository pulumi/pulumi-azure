// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.ResourceGroupPolicyExemptionArgs;
import com.pulumi.azure.core.inputs.ResourceGroupPolicyExemptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Resource Group Policy Exemption.
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
 * import com.pulumi.azure.policy.PolicyFunctions;
 * import com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs;
 * import com.pulumi.azure.core.ResourceGroupPolicyAssignment;
 * import com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs;
 * import com.pulumi.azure.core.ResourceGroupPolicyExemption;
 * import com.pulumi.azure.core.ResourceGroupPolicyExemptionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
 *             .name("resourceGroup1")
 *             .location("westus")
 *             .build());
 * 
 *         final var example = PolicyFunctions.getPolicyDefintion(GetPolicyDefintionArgs.builder()
 *             .displayName("Allowed locations")
 *             .build());
 * 
 *         var exampleResourceGroupPolicyAssignment = new ResourceGroupPolicyAssignment("exampleResourceGroupPolicyAssignment", ResourceGroupPolicyAssignmentArgs.builder()
 *             .name("exampleAssignment")
 *             .resourceGroupId(exampleResourceGroup.id())
 *             .policyDefinitionId(example.id())
 *             .parameters(exampleResourceGroup.location().applyValue(_location -> serializeJson(
 *                 jsonObject(
 *                     jsonProperty("listOfAllowedLocations", jsonObject(
 *                         jsonProperty("value", jsonArray(_location))
 *                     ))
 *                 ))))
 *             .build());
 * 
 *         var exampleResourceGroupPolicyExemption = new ResourceGroupPolicyExemption("exampleResourceGroupPolicyExemption", ResourceGroupPolicyExemptionArgs.builder()
 *             .name("exampleExemption")
 *             .resourceGroupId(exampleResourceGroup.id())
 *             .policyAssignmentId(exampleResourceGroupPolicyAssignment.id())
 *             .exemptionCategory("Mitigated")
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
 * Policy Exemptions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:core/resourceGroupPolicyExemption:ResourceGroupPolicyExemption exemption1 /subscriptions/00000000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Authorization/policyExemptions/exemption1
 * ```
 * 
 */
@ResourceType(type="azure:core/resourceGroupPolicyExemption:ResourceGroupPolicyExemption")
public class ResourceGroupPolicyExemption extends com.pulumi.resources.CustomResource {
    /**
     * A description to use for this Policy Exemption.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description to use for this Policy Exemption.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A friendly display name to use for this Policy Exemption.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A friendly display name to use for this Policy Exemption.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
     * 
     */
    @Export(name="exemptionCategory", refs={String.class}, tree="[0]")
    private Output<String> exemptionCategory;

    /**
     * @return The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
     * 
     */
    public Output<String> exemptionCategory() {
        return this.exemptionCategory;
    }
    /**
     * The expiration date and time in UTC ISO 8601 format of this policy exemption.
     * 
     */
    @Export(name="expiresOn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expiresOn;

    /**
     * @return The expiration date and time in UTC ISO 8601 format of this policy exemption.
     * 
     */
    public Output<Optional<String>> expiresOn() {
        return Codegen.optional(this.expiresOn);
    }
    /**
     * The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
     * 
     */
    @Export(name="metadata", refs={String.class}, tree="[0]")
    private Output<String> metadata;

    /**
     * @return The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
     * 
     */
    public Output<String> metadata() {
        return this.metadata;
    }
    /**
     * The name of the Policy Exemption. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Policy Exemption. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="policyAssignmentId", refs={String.class}, tree="[0]")
    private Output<String> policyAssignmentId;

    /**
     * @return The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    @Export(name="policyDefinitionReferenceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> policyDefinitionReferenceIds;

    /**
     * @return The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    public Output<Optional<List<String>>> policyDefinitionReferenceIds() {
        return Codegen.optional(this.policyDefinitionReferenceIds);
    }
    /**
     * The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceGroupPolicyExemption(java.lang.String name) {
        this(name, ResourceGroupPolicyExemptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceGroupPolicyExemption(java.lang.String name, ResourceGroupPolicyExemptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceGroupPolicyExemption(java.lang.String name, ResourceGroupPolicyExemptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceGroupPolicyExemption:ResourceGroupPolicyExemption", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ResourceGroupPolicyExemption(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupPolicyExemptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourceGroupPolicyExemption:ResourceGroupPolicyExemption", name, state, makeResourceOptions(options, id), false);
    }

    private static ResourceGroupPolicyExemptionArgs makeArgs(ResourceGroupPolicyExemptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResourceGroupPolicyExemptionArgs.Empty : args;
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
    public static ResourceGroupPolicyExemption get(java.lang.String name, Output<java.lang.String> id, @Nullable ResourceGroupPolicyExemptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroupPolicyExemption(name, id, state, options);
    }
}
