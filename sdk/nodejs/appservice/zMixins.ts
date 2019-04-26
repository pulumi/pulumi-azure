// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import * as pulumi from "@pulumi/pulumi";

import * as azureessentials from "azure-functions-ts-essentials";
import * as azurefunctions from "@azure/functions";
import * as azurestorage from "azure-storage";

import { FunctionAppArgs, FunctionApp } from "./functionApp";

import * as appservice from "../appservice";
import * as core from "../core";
import * as storageForTypesOnly from "../storage";
import * as util from "../util";
/**
 * An object containing output binding data. This value will be passed to JSON.stringify unless it
 * is a string, Buffer, ArrayBufferView, or number.
 *
 * `void` can be specified as the Result type indicating that no value need be provided.
 */
export type Result = string | Buffer | ArrayBufferView | number | object | void;

export interface Context<R extends Result> extends azurefunctions.Context {
    /**
     * A callback function that signals to the runtime that your code has completed. If your
     * function is synchronous, you must call context.done at the end of execution. If your function
     * is asynchronous, you should not use this callback.
     *
     * @param err A user-defined error to pass back to the runtime. If present, your function
     * execution will fail.
     * @param result An object containing output binding data. `result` will be passed to
     *  JSON.stringify unless it is a string, Buffer, ArrayBufferView, or number.
     */
    done(err?: Error | string | null, result?: R): void;
}

/**
 * `Callback` is the signature for an Azure FunctionApp entrypoint.
 *
 * [context] Azure uses this parameter to provide details of your FunctionApp's execution. For more
 * information, see https://docs.microsoft.com/en-us/azure/azure-functions/functions-reference-node
 *
 * [event] is the data passed in by specific services calling the FunctionApp (like `eventhub` or
 * `storage`).  The shape of it will be specific to individual services.
 *
 * This function can be synchronous or asynchronous function, though async is only supported with an
 * FunctionApps v2 or higher.  On v1 runtimes the function must be synchronous.  To signal
 * completion synchronously, call `context.done()` passing in an optional error or result value as
 * appropriate.  For async functions, `context.done()` does not need to be called, and instead a Promise
 * containing the result can be returned.
 */
export type Callback<C extends Context<R>, E, R extends Result> = (context: C, event: E) => Promise<R> | void;

/**
 * CallbackFactory is the signature for a function that will be called once to produce the function
 * that Azure FunctionApps will call into.  It can be used to initialize expensive state once that
 * can then be used across all invocations of the FunctionApp (as long as the FunctionApp is using
 * the same warm node instance).
 */
export type CallbackFactory<C extends Context<R>, E, R extends Result> = () => Callback<C, E, R>;

export type CallbackFunctionAppArgs<C extends Context<R>, E, R extends Result> = util.Overwrite<FunctionAppArgs, {
    /**
     * The Javascript function instance to use as the entrypoint for the Azure FunctionApp.  Either
     * [callback] or [callbackFactory] must be provided.
     */
    callback?: Callback<C, E, R>;

    /**
     * The Javascript function instance that will be called to produce the function that is the
     * entrypoint for the Azure FunctionApp. Either [callback] or [callbackFactory] must be
     * provided.
     *
     * This form is useful when there is expensive initialization work that should only be executed
     * once.  The factory-function will be invoked once when the final Azure FunctionApp module is
     * loaded. It can run whatever code it needs, and will end by returning the actual function that
     * the Azure will call into each time the FunctionApp it is is invoked.
     */
    callbackFactory?: CallbackFactory<C, E, R>;

    /**
     * The name of the resource group in which to create the Function App.
     */
    resourceGroupName: pulumi.Input<string>;

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location: pulumi.Input<string>;

    /**
     * The App Service Plan within which to create this Function App. Changing this forces a new
     * resource to be created.
     *
     * If not provided, a default "Consumption" plan will be created.  See:
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-scale#consumption-plan for
     * more details.
     */
    plan?: appservice.Plan;

    /**
     * The storage account to use where the zip-file blob for the FunctionApp will be located. If
     * not provided, a new storage account will create. It will be a 'Standard', 'LRS', 'StorageV2'
     * account.
     */
    account?: storageForTypesOnly.Account;

    /**
     * Not used.  The storage connection string is determined based on the ZipBlob that is created
     * for all the code for the Function.
     */
    storageConnectionString?: never;

    /**
     * Not used, provide [plan] instead.
     */
    appServicePlanId?: never;

    /**
     * The container to use where the zip-file blob for the FunctionApp will be located. If not
     * provided, the root container of the storage account will be used.
     */
    container?: storageForTypesOnly.Container;

    /**
     * A key-value pair of App Settings.
     */
    appSettings?: pulumi.Input<{ [key: string]: any; }>

    /**
     * Controls the value of WEBSITE_NODE_DEFAULT_VERSION in `appSettings`.  If not provided,
     * defaults to `8.11.1`.
     */
    nodeVersion?: pulumi.Input<string>;

    /**
     * Options to control which files and packages are included with the serialized FunctionApp code.
     */
    codePathOptions?: pulumi.runtime.CodePathOptions;
}>;

/**
 * Represents a Binding that will be emitted into the function.json config file for the FunctionApp.
 * Individual services will have more specific information they will define in their own bindings.
 */
export interface Binding {
    authLevel?: pulumi.Input<string>;
    type: pulumi.Input<string>;
    direction: pulumi.Input<string>;
    name: pulumi.Input<string>;
}

/**
 * Takes in a callback and a set of bindings, and produces the right AssetMap layout that Azure
 * FunctionApps expect.
 */
function serializeCallback<C extends Context<R>, E, R extends Result>(
        name: string,
        args: CallbackFunctionAppArgs<C, E, R>,
        bindings: pulumi.Input<pulumi.Input<Binding>[]>): pulumi.Output<pulumi.asset.AssetMap> {

    if (args.callback && args.callbackFactory) {
        throw new pulumi.RunError("Cannot provide both [callback] and [callbackFactory]");
    }


    if (!args.callback && !args.callbackFactory) {
        throw new Error("One of [callback] or [callbackFactory] must be provided.");
    }

    const func = args.callback
        ? redirectConsoleOutput(args.callback)
        : () => redirectConsoleOutput(args.callbackFactory!());

    const serializedFunc = pulumi.runtime.serializeFunction(
        func, { isFactoryFunction: !!args.callbackFactory });

    return pulumi.all([bindings, serializedFunc]).apply(async ([bindings, serializedFunc]) => {
        const map: pulumi.asset.AssetMap = {};
        map["host.json"] = new pulumi.asset.StringAsset(JSON.stringify({
            version: "2.0",
            tracing: { consoleLevel: "verbose" },
            extensionBundle: {
                id: "Microsoft.Azure.Functions.ExtensionBundle",
                version: "[1.*, 2.0.0)"
            },
        }));

        map[`${name}/function.json`] = new pulumi.asset.StringAsset(JSON.stringify({
            disabled: false,
            bindings: bindings,
        }));

        map[`${name}/index.js`] = new pulumi.asset.StringAsset(`module.exports = require("./handler").handler`),
        map[`${name}/handler.js`] = new pulumi.asset.StringAsset(serializedFunc.text);

        const pathSet = await pulumi.runtime.computeCodePaths(args.codePathOptions);
        for (const [path, value] of pathSet.entries()) {
            map[name + "/" + path] = value;
        }

        return map;
    });
}

function redirectConsoleOutput<C extends Context<R>, E, R extends Result>(callback: Callback<C, E, R>) {
    return (context: C, event: E) => {
        // Redirect console logging to context logging.
        console.log = context.log;
        console.error = context.log.error;
        console.warn = context.log.warn;
        // tslint:disable-next-line:no-console
        console.info = context.log.info;

        return callback(context, event);
    };
}


/**
 * Base type for all subscription types.
 */
export class CallbackFunctionApp<C extends Context<R>, E, R extends Result> extends FunctionApp {
    /**
     * Storage account where the FunctionApp's zipbBlob is uploaded to.
     */
    public readonly account: storageForTypesOnly.Account;
    /**
     * Storage container where the FunctionApp's zipbBlob is uploaded to.
     */
    public readonly container: storageForTypesOnly.Container;
    /**
     * The blob containing all the code for this FunctionApp.
     */
    public readonly zipBlob: storageForTypesOnly.ZipBlob;
    /**
     * The plan this FunctionApp runs under.
     */
    public readonly plan: appservice.Plan;

    constructor(name: string, bindings: pulumi.Input<pulumi.Input<Binding>[]>,
                args: CallbackFunctionAppArgs<C, E, R>, opts: pulumi.CustomResourceOptions = {}) {

        if (!args.resourceGroupName) {
            throw new pulumi.ResourceError("[args.resourceGroupName] must be provided", opts.parent);
        }

        if (!args.location) {
            throw new pulumi.ResourceError("[args.location] must be provided", opts.parent);
        }

        const resourceGroupArgs = {
            resourceGroupName: args.resourceGroupName,
            location: args.location,
        };

        let plan = args.plan;
        if (!plan) {
            plan = new appservice.Plan(name, {
                ...resourceGroupArgs,

                kind: "FunctionApp",

                sku: {
                    tier: "Dynamic",
                    size: "Y1",
                },
            }, opts);
        }

        const storageMod = <typeof storageForTypesOnly>require("../storage");
        const account = args.account || new storageMod.Account(makeSafeStorageAccountName(name), {
            ...resourceGroupArgs,

            accountKind: "StorageV2",
            accountTier: "Standard",
            accountReplicationType: "LRS",
        }, opts);

        const container = args.container || new storageMod.Container(makeSafeStorageContainerName(name), {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: account.name,
            containerAccessType: "private",
        }, opts);

        const assetMap = serializeCallback(name, args, bindings);
        const zipBlob = new storageMod.ZipBlob(name, {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: account.name,
            storageContainerName: container.name,
            type: "block",
            content: assetMap.apply(m => new pulumi.asset.AssetArchive(m)),
        }, opts);

        const codeBlobUrl = signedBlobReadUrl(zipBlob, account, container);
        super(name, {
            ...args,
            ...resourceGroupArgs,

            version: "~2",
            appServicePlanId: plan.id,
            storageConnectionString: account.primaryConnectionString,

            appSettings: pulumi.output(args.appSettings).apply(settings => {
                settings = settings || {};
                return {
                    ...settings,
                    WEBSITE_RUN_FROM_ZIP: codeBlobUrl,
                    WEBSITE_NODE_DEFAULT_VERSION: util.ifUndefined(args.nodeVersion, "8.11.1"),
                };
            }),
        }, opts);

        this.account = account;
        this.container = container;
        this.plan = plan;
        this.zipBlob = zipBlob;
    }
}

/**
 * Base type for all subscription types.  An event subscription represents a connection between some
 * azure resource an an FunctionApp that will be triggered when something happens to that resource.
 */
export abstract class EventSubscription<C extends Context<R>, E, R extends Result> extends pulumi.ComponentResource {
    public readonly functionApp: CallbackFunctionApp<C, E, R>;

    constructor(type: string, name: string,
                bindings: pulumi.Input<pulumi.Input<Binding>[]>,
                args: CallbackFunctionAppArgs<C, E, R>,
                opts: pulumi.ComponentResourceOptions = {}) {
        super(type, name, undefined, opts);

        this.functionApp = new CallbackFunctionApp(name, bindings, args, { parent: this });
    }
}

// http callback functions.

/**
 * HTTP request object. Provided to your function when using HttpEventSubscription.
 */
export type HttpRequest = azurefunctions.HttpRequest;

/**
 * Represents an HTTP response including the status code and data.
 */
export type HttpResponse = azureessentials.HttpResponse;

export type HttpEventSubscriptionArgs = util.Overwrite<CallbackFunctionAppArgs<Context<HttpResponse>, HttpRequest, HttpResponse>, {
    /**
     * The resource group in which to create the event subscription.  Either [resourceGroupName] or
     * [resourceGroup] must be supplied.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription.  Either
     * [resourceGroupName] or [resourceGroup] must be supplied.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new
     * resource to be created.  If not supplied, the location of the provided ResourceGroup will be
     * used.
     */
    location?: pulumi.Input<string>;
}>;

/**
 * An Azure Function exposed via an HTTP endpoint that is implemented on top of a
 * JavaScript/TypeScript callback function.
 */
export class HttpEventSubscription extends EventSubscription<Context<HttpResponse>, HttpRequest, HttpResponse> {
    /**
     * Endpoint where this FunctionApp can be invoked.
     */
    public readonly url: pulumi.Output<string>;

    constructor(name: string,
                args: HttpEventSubscriptionArgs,
                opts: pulumi.CustomResourceOptions = {}) {

        const { resourceGroupName, location } = getResourceGroupNameAndLocation(args, undefined);

        const bindings = [{
            authLevel: "anonymous",
            type: "httpTrigger",
            direction: "in",
            name: "req",
        }, {
            type: "http",
            direction: "out",
            name: "$return",
        }];

        super("azure:appservice:HttpEventSubscription", name, bindings, {
            ...args,
            location,
            resourceGroupName,
        }, opts);

        this.url = pulumi.interpolate`https://${this.functionApp.defaultHostname}/api/${name}`;

        this.registerOutputs();
    }
}

function makeSafeStorageAccountName(prefix: string) {
    // Account name needs to be at max 24 chars (minus the extra 8 random chars);
    // not exceed the max length of 24.
    // Name must be alphanumeric.
    return prefix.replace(/[^a-zA-Z0-9]/g, "").toLowerCase().substr(0, 24 - 8);
}

function makeSafeStorageContainerName(prefix: string) {
    // Account name needs to be at max 63 chars (minus the extra 8 random chars);
    // Name must be alphanumeric (and hyphens).
    return prefix.replace(/[^a-zA-Z0-9-]/g, "").toLowerCase().substr(0, 63 - 8);
}

/** @internal */
export function signedBlobReadUrl(
    blob: storageForTypesOnly.Blob | storageForTypesOnly.ZipBlob,
    account: storageForTypesOnly.Account,
    container: storageForTypesOnly.Container): pulumi.Output<string> {

    // Choose a fixed, far-future expiration date for signed blob URLs. The shared access signature
    // (SAS) we generate for the Azure storage blob must remain valid for as long as the Function
    // App is deployed, since new instances will download the code on startup. By using a fixed
    // date, rather than (e.g.) "today plus ten years", the signing operation is idempotent.
    const signatureExpiration = new Date(2100, 1);

    return pulumi.all([account.primaryConnectionString, container.name, blob.name]).apply(
        ([connectionString, containerName, blobName]) => {
            const blobService = new azurestorage.BlobService(connectionString);
            const signature = blobService.generateSharedAccessSignature(
                containerName,
                blobName,
                {
                    AccessPolicy: {
                        Expiry: signatureExpiration,
                        Permissions: azurestorage.BlobUtilities.SharedAccessPermissions.READ,
                    },
                },
            );

            return blobService.getUrl(containerName, blobName, signature);
        });
}

interface BaseSubscriptionArgs {
    resourceGroup?: core.ResourceGroup;
    resourceGroupName?: pulumi.Input<string>;
    location?: pulumi.Input<string>;
}

/** @internal */
export function getResourceGroupNameAndLocation(
        args: BaseSubscriptionArgs, fallbackResourceGroupName: pulumi.Output<string> | undefined) {

    if (!args.resourceGroup && !fallbackResourceGroupName) {
        throw new Error("Either [args.resourceGroup] or [args.resourceGroupName] must be provided.");
    }

    const resourceGroup = getResourceGroup(args, fallbackResourceGroupName);
    const location = util.ifUndefined(args.location, resourceGroup.location);

    return { resourceGroupName: resourceGroup.name, location };
}

function getResourceGroup(args: BaseSubscriptionArgs, fallbackResourceGroupName: pulumi.Output<string>) {
    if (args.resourceGroup) {
        return { name: args.resourceGroup.name, location: args.resourceGroup.location };
    }

    const resourceGroupName = util.ifUndefined(args.resourceGroupName, fallbackResourceGroupName);
    const getResult = resourceGroupName.apply(n => core.getResourceGroup({ name: n }));
    return { name: getResult.name, location: getResult.location };
}