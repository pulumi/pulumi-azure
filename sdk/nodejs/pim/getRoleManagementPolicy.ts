// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource.
 *
 * ## Example Usage
 *
 * ### Resource Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.core.getResourceGroup({
 *     name: "example-rg",
 * });
 * const rgContributor = example.then(example => azure.authorization.getRoleDefinition({
 *     name: "Contributor",
 *     scope: example.id,
 * }));
 * const exampleGetRoleManagementPolicy = azure.pim.getRoleManagementPolicy({
 *     scope: test.id,
 *     roleDefinitionId: contributor.id,
 * });
 * ```
 *
 * ### Management Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.management.getGroup({
 *     name: "example-group",
 * });
 * const mgContributor = azure.authorization.getRoleDefinition({
 *     name: "Contributor",
 *     scope: exampleAzurermManagementGroup.id,
 * });
 * const exampleGetRoleManagementPolicy = Promise.all([example, mgContributor]).then(([example, mgContributor]) => azure.pim.getRoleManagementPolicy({
 *     scope: example.id,
 *     roleDefinitionId: mgContributor.id,
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Authorization`: 2020-10-01
 */
export function getRoleManagementPolicy(args: GetRoleManagementPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleManagementPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:pim/getRoleManagementPolicy:getRoleManagementPolicy", {
        "roleDefinitionId": args.roleDefinitionId,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoleManagementPolicy.
 */
export interface GetRoleManagementPolicyArgs {
    /**
     * The scoped Role Definition ID of the role for which this policy applies.
     */
    roleDefinitionId: string;
    /**
     * The scope to which this Role Management Policy applies. Can refer to a management group, a subscription, a resource group or a resource.
     */
    scope: string;
}

/**
 * A collection of values returned by getRoleManagementPolicy.
 */
export interface GetRoleManagementPolicyResult {
    /**
     * An `activationRules` block as defined below.
     */
    readonly activationRules: outputs.pim.GetRoleManagementPolicyActivationRule[];
    /**
     * An `activeAssignmentRules` block as defined below.
     */
    readonly activeAssignmentRules: outputs.pim.GetRoleManagementPolicyActiveAssignmentRule[];
    /**
     * (String) The description of this policy.
     */
    readonly description: string;
    /**
     * An `eligibleAssignmentRules` block as defined below.
     */
    readonly eligibleAssignmentRules: outputs.pim.GetRoleManagementPolicyEligibleAssignmentRule[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (String) The name of this policy, which is typically a UUID and may change over time.
     */
    readonly name: string;
    /**
     * A `notificationRules` block as defined below.
     */
    readonly notificationRules: outputs.pim.GetRoleManagementPolicyNotificationRule[];
    readonly roleDefinitionId: string;
    readonly scope: string;
}
/**
 * Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource.
 *
 * ## Example Usage
 *
 * ### Resource Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.core.getResourceGroup({
 *     name: "example-rg",
 * });
 * const rgContributor = example.then(example => azure.authorization.getRoleDefinition({
 *     name: "Contributor",
 *     scope: example.id,
 * }));
 * const exampleGetRoleManagementPolicy = azure.pim.getRoleManagementPolicy({
 *     scope: test.id,
 *     roleDefinitionId: contributor.id,
 * });
 * ```
 *
 * ### Management Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.management.getGroup({
 *     name: "example-group",
 * });
 * const mgContributor = azure.authorization.getRoleDefinition({
 *     name: "Contributor",
 *     scope: exampleAzurermManagementGroup.id,
 * });
 * const exampleGetRoleManagementPolicy = Promise.all([example, mgContributor]).then(([example, mgContributor]) => azure.pim.getRoleManagementPolicy({
 *     scope: example.id,
 *     roleDefinitionId: mgContributor.id,
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Authorization`: 2020-10-01
 */
export function getRoleManagementPolicyOutput(args: GetRoleManagementPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRoleManagementPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:pim/getRoleManagementPolicy:getRoleManagementPolicy", {
        "roleDefinitionId": args.roleDefinitionId,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoleManagementPolicy.
 */
export interface GetRoleManagementPolicyOutputArgs {
    /**
     * The scoped Role Definition ID of the role for which this policy applies.
     */
    roleDefinitionId: pulumi.Input<string>;
    /**
     * The scope to which this Role Management Policy applies. Can refer to a management group, a subscription, a resource group or a resource.
     */
    scope: pulumi.Input<string>;
}
