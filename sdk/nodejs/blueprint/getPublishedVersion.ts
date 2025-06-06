// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Blueprint Published Version
 *
 * > **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.core.getSubscription({});
 * const test = current.then(current => azure.blueprint.getPublishedVersion({
 *     scopeId: current.id,
 *     blueprintName: "exampleBluePrint",
 *     version: "dev_v2.3",
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Blueprint`: 2018-11-01-preview
 */
export function getPublishedVersion(args: GetPublishedVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetPublishedVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:blueprint/getPublishedVersion:getPublishedVersion", {
        "blueprintName": args.blueprintName,
        "scopeId": args.scopeId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublishedVersion.
 */
export interface GetPublishedVersionArgs {
    /**
     * The name of the Blueprint Definition
     */
    blueprintName: string;
    /**
     * The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     */
    scopeId: string;
    /**
     * The Version name of the Published Version of the Blueprint Definition
     */
    version: string;
}

/**
 * A collection of values returned by getPublishedVersion.
 */
export interface GetPublishedVersionResult {
    readonly blueprintName: string;
    /**
     * The description of the Blueprint Published Version
     */
    readonly description: string;
    /**
     * The display name of the Blueprint Published Version
     */
    readonly displayName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lastModified: string;
    readonly scopeId: string;
    /**
     * The target scope
     */
    readonly targetScope: string;
    readonly timeCreated: string;
    /**
     * The type of the Blueprint
     */
    readonly type: string;
    readonly version: string;
}
/**
 * Use this data source to access information about an existing Blueprint Published Version
 *
 * > **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.core.getSubscription({});
 * const test = current.then(current => azure.blueprint.getPublishedVersion({
 *     scopeId: current.id,
 *     blueprintName: "exampleBluePrint",
 *     version: "dev_v2.3",
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Blueprint`: 2018-11-01-preview
 */
export function getPublishedVersionOutput(args: GetPublishedVersionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPublishedVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:blueprint/getPublishedVersion:getPublishedVersion", {
        "blueprintName": args.blueprintName,
        "scopeId": args.scopeId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublishedVersion.
 */
export interface GetPublishedVersionOutputArgs {
    /**
     * The name of the Blueprint Definition
     */
    blueprintName: pulumi.Input<string>;
    /**
     * The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     */
    scopeId: pulumi.Input<string>;
    /**
     * The Version name of the Published Version of the Blueprint Definition
     */
    version: pulumi.Input<string>;
}
