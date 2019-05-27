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

import * as azurefunctions from "@azure/functions";

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

    hostSettings?: HostSettings;
}>;

/**
 * The host.json metadata file contains global configuration options that affect all functions for a
 * function app.  These values can be provided here, or defaults will be used in their place.
 *
 * For more details see https://docs.microsoft.com/en-us/azure/azure-functions/functions-host-json
 */
export interface HostSettings {
    /**
     * Specifies how many function invocations are aggregated when calculating metrics for
     * Application Insights.
     *
     * See https://docs.microsoft.com/en-us/azure/azure-functions/functions-host-json#aggregator for
     * more details.
     */
    aggregator?: {
        /** Maximum number of requests to aggregate. Defaults to 1000 */
        batchSize: number,
        /** Maximum time period to aggregate.  Defaults to "00:00:30" */
        flushTimeout: string,
    },
    /**
     * Indicates the timeout duration for all functions. In a serverless Consumption plan, the valid
     * range is from 1 second to 10 minutes, and the default value is 5 minutes. In an App Service
     * plan, there is no overall limit and the default depends on the runtime version. In version
     * 2.x, the default value for an App Service plan is 30 minutes.
     */
    functionTimeout?: string,

    /**
     * Configuration settings for
     * [host-health-monitor](https://github.com/Azure/azure-webjobs-sdk-script/wiki/Host-Health-Monitor).
     */
    healthMonitor?: {
        /** Specifies whether the feature is enabled. Defaults to `true` */
        enabled: boolean,
        /** The time interval between the periodic background health checks. Defaults to 10 seconds. */
        healthCheckInterval: string,
        /**
         * A sliding time window used in conjunction with the `healthCheckThreshold` setting.
         * Defaults to 2 minutes.
         */
        healthCheckWindow:string,
        /**
         * Maximum number of times the health check can fail before a host recycle is initiated.  Defaults to `6`.
         */
        healthCheckThreshold: number,
        /**
         * The threshold at which a performance counter will be considered unhealthy.  Defaults to `0.80`.
         */
        counterThreshold: number
    },
    /** Controls the logging behaviors of the function app, including Application Insights. */
    logging?: {
        /** Defines what level of file logging is enabled.  Defaults to `debugOnly` */
        fileLoggingMode: "never" | "only" | "debugOnly",
        logLevel: {
            default: string
        },
        /** Controls the sampling feature in Application Insights. */
        applicationInsights: {
            samplingSettings: {
                /** Enables or disables sampling.  Defaults to `true` */
                isEnabled: boolean,
                /** The threshold at which sampling begins. Defaults to `5` */
                maxTelemetryItemsPerSecond: number,
            },
        },
    },
    /**
     * Configuration settings for Singleton lock behavior. For more information, see
     * [GitHub-issue](https://github.com/Azure/azure-webjobs-sdk-script/issues/912) about singleton
     * support.
     */
    singleton?: {
        /** The period that function level locks are taken for. The locks auto-renew. */
        lockPeriod: string,
        /** The period that listener locks are taken for. */
        listenerLockPeriod: string,
        /** The time interval used for listener lock recovery if a listener lock couldn't be
         * acquired on startup. */
        listenerLockRecoveryPollingInterval: string,
        /** The maximum amount of time the runtime will try to acquire a lock. */
        lockAcquisitionTimeout: string,
        /** The interval between lock acquisition attempts. */
        lockAcquisitionPollingInterval: string
    },
}

/**
 * Represents a Binding that will be emitted into the function.json config file for the FunctionApp.
 * Individual services will have more specific information they will define in their own bindings.
 */
export type BindingDefinition = azurefunctions.BindingDefinition;

/**
 * Takes in a callback and a set of bindings, and produces the right AssetMap layout that Azure
 * FunctionApps expect.
 */
function serializeCallback<C extends Context<R>, E, R extends Result>(
        name: string,
        args: CallbackFunctionAppArgs<C, E, R>,
        bindings: pulumi.Input<BindingDefinition[]>): pulumi.Output<pulumi.asset.AssetMap> {

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
            ...args.hostSettings,
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
  * A CallbackFunctionApp is a special type of azure.appservice.FunctionApp that can be created out
  * of an actual JavaScript function instance.  The function instance will be analyzed and packaged
  * up (including dependencies) into a form that can be used by AWS Lambda.  See
  * https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for additional
  * details on this process.
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

    constructor(name: string, bindings: pulumi.Input<BindingDefinition[]>,
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

        const codeBlobUrl = storageMod.signedBlobReadUrl(zipBlob, account);
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
                bindings: pulumi.Input<BindingDefinition[]>,
                args: CallbackFunctionAppArgs<C, E, R>,
                opts: pulumi.ComponentResourceOptions = {}) {
        super(type, name, undefined, opts);

        this.functionApp = new CallbackFunctionApp(name, bindings, args, { parent: this });
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

interface BaseSubscriptionArgs {
    resourceGroup?: core.ResourceGroup;
    resourceGroupName?: pulumi.Input<string>;
    location?: pulumi.Input<string>;
}

/** @internal */
export function getResourceGroupNameAndLocation(
        args: BaseSubscriptionArgs, fallbackResourceGroupName: pulumi.Output<string> | undefined) {

    if (args.resourceGroup) {
        return { resourceGroupName: args.resourceGroup.name, location: args.resourceGroup.location };
    }

    if (!fallbackResourceGroupName) {
        throw new Error("Either [args.resourceGroup] or [args.resourceGroupName] must be provided.");
    }

    const resourceGroupName = util.ifUndefined(args.resourceGroupName, fallbackResourceGroupName);
    const getResult = resourceGroupName.apply(n => core.getResourceGroup({ name: n }));
    return { resourceGroupName, location: getResult.location };
}

export type CallbackArgs<C extends Context<R>, E, R extends Result> = {
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
}

export function serializeFunctionCallback<C extends Context<R>, E, R extends Result>(
    args: CallbackArgs<C, E, R>): pulumi.Output<pulumi.runtime.SerializedFunction> {

    if (args.callback && args.callbackFactory) {
        throw new pulumi.RunError("Cannot provide both [callback] and [callbackFactory]");
    }

    if (!args.callback && !args.callbackFactory) {
        throw new Error("One of [callback] or [callbackFactory] must be provided.");
    }

    const func = args.callback
        ? redirectConsoleOutput(args.callback)
        : () => redirectConsoleOutput(args.callbackFactory!());

    return pulumi.output(pulumi.runtime.serializeFunction(func, { isFactoryFunction: !!args.callbackFactory }));
}

export interface AzureFunctionArgs {
    name: string;
    bindings: BindingDefinition[];
    func: pulumi.runtime.SerializedFunction;
    appSettings?: { [key: string]: string };
}

// TODO: Should we inherit from pulumi.ComponentResource? If so, we should probably set parent to the Function App, but
// how do we do so if Functions are created before the app (see the sample).
export abstract class AzureFunction {
    public readonly definition: pulumi.Output<AzureFunctionArgs>;

    constructor(definition: pulumi.Output<AzureFunctionArgs>) {

        this.definition = definition;
    }
}

export interface AzureFunctionOutputBinding {
    readonly definition: pulumi.Output<BindingDefinition>;
    readonly appSettings: pulumi.Output<{ [key: string]: string }>;
}

function produceDeploymentPackage(args: MultiFunctionAppArgs): pulumi.Output<pulumi.asset.AssetMap> {
    
    if (args.functions === undefined) {
        throw new Error("Can not serialize undefined Azure Functions");
    }

    return pulumi.all(args.functions.map(f => f.definition)).apply(async functions => {

        const map: pulumi.asset.AssetMap = {};
        map["host.json"] = new pulumi.asset.StringAsset(JSON.stringify({
            version: "2.0",
            tracing: { consoleLevel: "verbose" },
            extensionBundle: {
                id: "Microsoft.Azure.Functions.ExtensionBundle",
                version: "[1.*, 2.0.0)"
            },
            ...args.hostSettings,
        }));

        const pathSet = await pulumi.runtime.computeCodePaths(args.codePathOptions);
        for (const [path, value] of pathSet.entries()) {
            map[path] = value;
        }

        for (const func of functions) {
            map[`${func.name}/function.json`] = new pulumi.asset.StringAsset(JSON.stringify({
                disabled: false,
                bindings: func.bindings,
            }));

            map[`${func.name}/index.js`] = new pulumi.asset.StringAsset(`module.exports = require("./handler").handler`),
            map[`${func.name}/handler.js`] = new pulumi.asset.StringAsset(func.func.text);
        }

        return map;
    });
}

function combineAppSettings(args: MultiFunctionAppArgs): pulumi.Output<{[key: string]: string}> {
    
    const perFunctionSettings = args.functions !== undefined ? args.functions.map(c => c.definition.apply(b => b.appSettings)) : [];
    return pulumi.all([args.appSettings, ...perFunctionSettings]).apply(items => items.reduce((a, b) => ({ ...a, ...b }), {}));
}

export type MultiFunctionAppArgs = util.Overwrite<FunctionAppArgs, {

    /**
     * The functions to deploy as parts of this application.
     */
    functions?: AzureFunction[];

    /**
     * The deployment package to deploy as-is (ignoring the 'functions' property).
     */
    archive?: pulumi.Input<pulumi.asset.Archive>;

    /**
     * The name of the resource group in which to create the Function App.
     */
    resourceGroupName: pulumi.Input<string>;

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

    hostSettings?: HostSettings;

    /**
     * Not used.  The storage connection string is determined based on the ZipBlob that is created
     * for all the code for the Function.
     */
    storageConnectionString?: never;

    /**
     * Not used, provide [plan] instead.
     */
    appServicePlanId?: never;
}>;

// TODO: Better name? Move to azure.functions.*?
export class MultiFunctionApp extends FunctionApp {
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

    constructor(name: string,
                args: MultiFunctionAppArgs, opts: pulumi.CustomResourceOptions = {}) {

        let plan = args.plan;
        if (!plan) {
            plan = new appservice.Plan(name, {
                resourceGroupName: args.resourceGroupName,

                kind: "FunctionApp",

                sku: {
                    tier: "Dynamic",
                    size: "Y1",
                },
            }, opts);
        }

        const storageMod = <typeof storageForTypesOnly>require("../storage");
        const account = args.account || new storageMod.Account(makeSafeStorageAccountName(name), {
            resourceGroupName: args.resourceGroupName,

            accountKind: "StorageV2",
            accountTier: "Standard",
            accountReplicationType: "LRS",
        }, opts);

        const container = args.container || new storageMod.Container(makeSafeStorageContainerName(name), {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: account.name,
            containerAccessType: "private",
        }, opts);

        const archive = args.archive !== undefined 
            ? args.archive
            : produceDeploymentPackage(args).apply(m => new pulumi.asset.AssetArchive(m));
        const zipBlob = new storageMod.ZipBlob(name, {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: account.name,
            storageContainerName: container.name,
            type: "block",
            content: archive,
        }, opts);

        const codeBlobUrl = signedBlobReadUrl(zipBlob, account, container);
        super(name, {
            ...args,

            version: "~2",
            appServicePlanId: plan.id,
            storageConnectionString: account.primaryConnectionString,

            appSettings: combineAppSettings(args).apply(settings => {
                return {
                    ...settings,
                    WEBSITE_RUN_FROM_PACKAGE: codeBlobUrl,
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
