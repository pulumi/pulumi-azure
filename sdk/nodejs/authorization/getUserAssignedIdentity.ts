// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing User Assigned Identity.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.authorization.getUserAssignedIdentity({
 *     name: "name_of_user_assigned_identity",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const uaiClientId = example.then(example => example.clientId);
 * export const uaiPrincipalId = example.then(example => example.principalId);
 * export const uaiTenantId = example.then(example => example.tenantId);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ManagedIdentity`: 2023-01-31
 */
export function getUserAssignedIdentity(args: GetUserAssignedIdentityArgs, opts?: pulumi.InvokeOptions): Promise<GetUserAssignedIdentityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:authorization/getUserAssignedIdentity:getUserAssignedIdentity", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserAssignedIdentity.
 */
export interface GetUserAssignedIdentityArgs {
    /**
     * The name of the User Assigned Identity.
     */
    name: string;
    /**
     * The name of the Resource Group in which the User Assigned Identity exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getUserAssignedIdentity.
 */
export interface GetUserAssignedIdentityResult {
    /**
     * The Client ID of the User Assigned Identity.
     */
    readonly clientId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure location where the User Assigned Identity exists.
     */
    readonly location: string;
    readonly name: string;
    /**
     * The Service Principal ID of the User Assigned Identity.
     */
    readonly principalId: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the User Assigned Identity.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Tenant ID of the User Assigned Identity.
     */
    readonly tenantId: string;
}
/**
 * Use this data source to access information about an existing User Assigned Identity.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.authorization.getUserAssignedIdentity({
 *     name: "name_of_user_assigned_identity",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const uaiClientId = example.then(example => example.clientId);
 * export const uaiPrincipalId = example.then(example => example.principalId);
 * export const uaiTenantId = example.then(example => example.tenantId);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ManagedIdentity`: 2023-01-31
 */
export function getUserAssignedIdentityOutput(args: GetUserAssignedIdentityOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserAssignedIdentityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:authorization/getUserAssignedIdentity:getUserAssignedIdentity", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserAssignedIdentity.
 */
export interface GetUserAssignedIdentityOutputArgs {
    /**
     * The name of the User Assigned Identity.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the User Assigned Identity exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
