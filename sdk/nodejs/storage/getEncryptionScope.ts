// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Storage Encryption Scope.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.storage.getAccount({
 *     name: "storageaccountname",
 *     resourceGroupName: "resourcegroupname",
 * });
 * const exampleGetEncryptionScope = example.then(example => azure.storage.getEncryptionScope({
 *     name: "existingStorageES",
 *     storageAccountId: example.id,
 * }));
 * export const id = exampleGetEncryptionScope.then(exampleGetEncryptionScope => exampleGetEncryptionScope.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Storage`: 2023-05-01
 */
export function getEncryptionScope(args: GetEncryptionScopeArgs, opts?: pulumi.InvokeOptions): Promise<GetEncryptionScopeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:storage/getEncryptionScope:getEncryptionScope", {
        "name": args.name,
        "storageAccountId": args.storageAccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionScope.
 */
export interface GetEncryptionScopeArgs {
    /**
     * The name of this Storage Encryption Scope.
     */
    name: string;
    /**
     * The ID of the Storage Account where this Storage Encryption Scope exists.
     */
    storageAccountId: string;
}

/**
 * A collection of values returned by getEncryptionScope.
 */
export interface GetEncryptionScopeResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the Key Vault Key.
     */
    readonly keyVaultKeyId: string;
    readonly name: string;
    /**
     * The source of the Storage Encryption Scope.
     */
    readonly source: string;
    readonly storageAccountId: string;
}
/**
 * Use this data source to access information about an existing Storage Encryption Scope.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.storage.getAccount({
 *     name: "storageaccountname",
 *     resourceGroupName: "resourcegroupname",
 * });
 * const exampleGetEncryptionScope = example.then(example => azure.storage.getEncryptionScope({
 *     name: "existingStorageES",
 *     storageAccountId: example.id,
 * }));
 * export const id = exampleGetEncryptionScope.then(exampleGetEncryptionScope => exampleGetEncryptionScope.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Storage`: 2023-05-01
 */
export function getEncryptionScopeOutput(args: GetEncryptionScopeOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEncryptionScopeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:storage/getEncryptionScope:getEncryptionScope", {
        "name": args.name,
        "storageAccountId": args.storageAccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionScope.
 */
export interface GetEncryptionScopeOutputArgs {
    /**
     * The name of this Storage Encryption Scope.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the Storage Account where this Storage Encryption Scope exists.
     */
    storageAccountId: pulumi.Input<string>;
}
