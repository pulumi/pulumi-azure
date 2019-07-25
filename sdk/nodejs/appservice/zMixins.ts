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
import { AzureServiceClient } from "@azure/ms-rest-azure-js";

import { FunctionApp } from "./functionApp";

import * as appservice from "../appservice";
import * as core from "../core";
import * as eventhubForTypesOnly from "../eventhub";
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
export type Callback<C extends Context<R>, E, R extends Result> = (context: C, event: E, ...inputs: any[]) => Promise<R> | void;

/**
 * CallbackFactory is the signature for a function that will be called once to produce the function
 * that Azure FunctionApps will call into.  It can be used to initialize expensive state once that
 * can then be used across all invocations of the FunctionApp (as long as the FunctionApp is using
 * the same warm node instance).
 */
export type CallbackFactory<C extends Context<R>, E, R extends Result> = () => Callback<C, E, R>;

/** Arguments to pass either a callback or a callback factory to be used as an Azure Function body. */
export interface CallbackArgs<C extends Context<R>, E, R extends Result> {
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

interface FunctionAppArgsBase {
    /**
     * The storage account to use where the zip-file blob for the FunctionApp will be located. If
     * not provided, a new storage account will create. It will be a 'Standard', 'LRS', 'StorageV2'
     * account.
     */
    readonly account?: storageForTypesOnly.Account;

    /**
     * A key-value pair of App Settings.
     */
    readonly appSettings?: pulumi.Input<{ [key: string]: any; }>;

    /**
     * Should the Function App send session affinity cookies, which route client requests in the same session to the same instance?
     */
    readonly clientAffinityEnabled?: pulumi.Input<boolean>;

    /**
     * Options to control which files and packages are included with the serialized FunctionApp code.
     */
    readonly codePathOptions?: pulumi.runtime.CodePathOptions;

    /**
     * An `connection_string` block as defined below.
     */
    readonly connectionStrings?: pulumi.Input<pulumi.Input<{ name: pulumi.Input<string>, type: pulumi.Input<string>, value: pulumi.Input<string> }>[]>;

    /**
     * The container to use where the zip-file blob for the FunctionApp will be located. If not
     * provided, the root container of the storage account will be used.
     */
    readonly container?: storageForTypesOnly.Container;

    /**
     * Should the built-in logging of this Function App be enabled? Defaults to `true`.
     */
    readonly enableBuiltinLogging?: pulumi.Input<boolean>;

    /**
     * Is the Function App enabled?
     */
    readonly enabled?: pulumi.Input<boolean>;

    /**
     * Host configuration options.
     */
    readonly hostSettings?: HostSettings;

    /**
     * Can the Function App only be accessed via HTTPS? Defaults to `false`.
     */
    readonly httpsOnly?: pulumi.Input<boolean>;

    /**
     * An `identity` block as defined below.
     */
    readonly identity?: pulumi.Input<{ principalId?: pulumi.Input<string>, tenantId?: pulumi.Input<string>, type: pulumi.Input<string> }>;

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    readonly location?: pulumi.Input<string>;

    /**
     * The name of the Function App.
     */
    readonly name?: pulumi.Input<string>;

    /**
     * Controls the value of WEBSITE_NODE_DEFAULT_VERSION in `appSettings`.  If not provided,
     * defaults to `8.11.1`.
     */
    readonly nodeVersion?: pulumi.Input<string>;

    /**
     * The App Service Plan within which to create this Function App. Changing this forces a new
     * resource to be created.
     *
     * If not provided, a default "Consumption" plan will be created.  See:
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-scale#consumption-plan for
     * more details.
     */
    readonly plan?: appservice.Plan;

    /**
     * The resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     */
    readonly resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     * Either [resourceGroupName] or [resourceGroup] must be supplied.
     */
    readonly resourceGroupName?: pulumi.Input<string>;

    /**
     * A `site_config` object as defined below.
     */
    readonly siteConfig?: pulumi.Input<{ alwaysOn?: pulumi.Input<boolean>, linuxFxVersion?: pulumi.Input<string>, use32BitWorkerProcess?: pulumi.Input<boolean>, websocketsEnabled?: pulumi.Input<boolean> }>;

    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{ [key: string]: any }>;

    /**
     * The runtime version associated with the Function App. Defaults to `~2`.
     */
    readonly version?: pulumi.Input<string>;
}

/**
 * Base arguments for all Azure Function components that are passed to MultiFunctionCallbackApp.
 */
export interface CallbackFunctionArgs<C extends Context<R>, E, R extends Result> extends InputOutputsArgs, CallbackArgs<C, E, R> {
}

/**
 * Base arguments for all single-Function subscription apps.
 */
export interface CallbackFunctionAppArgs<C extends Context<R>, E, R extends Result> extends CallbackFunctionArgs<C, E, R>, FunctionAppArgsBase {
}

/**
 * The host.json metadata file contains global configuration options that affect all functions for a
 * function app. These values can be provided here, or defaults will be used in their place.
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
        healthCheckWindow: string,
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
    /** Extension-specific configuration options. */
    extensions?: {
        http?: appservice.HttpHostExtensions,
        serviceBus?: eventhubForTypesOnly.ServiceBusHostExtensions,
        queues?: storageForTypesOnly.QueueHostExtensions,
    },
}

/**
 * Represents a Binding that will be emitted into the function.json config file for the FunctionApp.
 * Individual services will have more specific information they will define in their own bindings.
 */
export type BindingDefinition = azurefunctions.BindingDefinition;

/**
 * Base interface for input bindings.
 */
export interface InputBindingDefinition extends BindingDefinition {
    /**
     * The direction of the binding. Must be 'in' for an input binding.
     */
    direction: "in";
}

/**
 * Base interface for output bindings.
 */
export interface OutputBindingDefinition extends BindingDefinition {
    /**
     * The direction of the binding. Must be 'out' for an output binding.
     */
    direction: "out";
}

function serializeFunctionCallback<C extends Context<R>, E, R extends Result>(
    args: CallbackArgs<C, E, R>): Promise<pulumi.runtime.SerializedFunction> {

    if (args.callback && args.callbackFactory) {
        throw new Error("Cannot provide both [callback] and [callbackFactory]");
    }

    if (!args.callback && !args.callbackFactory) {
        throw new Error("One of [callback] or [callbackFactory] must be provided.");
    }

    const func = args.callback
        ? redirectConsoleOutput(args.callback)
        : () => redirectConsoleOutput(args.callbackFactory!());

    return pulumi.runtime.serializeFunction(func, { isFactoryFunction: !!args.callbackFactory });
}

function produceDeploymentArchive(args: MultiCallbackFunctionAppArgs): pulumi.Output<pulumi.asset.Archive> {
    return pulumi.output(produceDeploymentArchiveAsync(args));
}

async function produceDeploymentArchiveAsync(args: MultiCallbackFunctionAppArgs): Promise<pulumi.asset.AssetArchive> {
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

    for (const func of args.functions) {
        map[`${func.name}/function.json`] = pulumi.output(func.bindings).apply(bs => new pulumi.asset.StringAsset(JSON.stringify({
            disabled: false,
            bindings: bs,
        })));

        const body = await serializeFunctionCallback(func.callback);

        map[`${func.name}/index.js`] = new pulumi.asset.StringAsset(`module.exports = require("./handler").handler`);
        map[`${func.name}/handler.js`] = new pulumi.asset.StringAsset(body.text);
    }

    return new pulumi.asset.AssetArchive(map);
}

function combineFunctionAppSettings(args: MultiCallbackFunctionAppArgs): pulumi.Output<{ [key: string]: string }> {
    const applicationSetting = args.appSettings || {};
    const perFunctionSettings = args.functions !== undefined ? args.functions.map(c => c.appSettings || {}) : [];
    return combineAppSettings([applicationSetting, ...perFunctionSettings]);
}

function redirectConsoleOutput<C extends Context<R>, E, R extends Result>(callback: Callback<C, E, R>) {
    return (context: C, event: E, ...inputs: any[]) => {
        // Redirect console logging to context logging.
        console.log = context.log;
        console.error = context.log.error;
        console.warn = context.log.warn;
        // tslint:disable-next-line:no-console
        console.info = context.log.info;

        return callback(context, event, ...inputs);
    };
}

/**
 * Azure Function Binding with the required corresponding application settings (e.g., a connection string setting).
 */
export interface BindingSettings<T extends BindingDefinition> {
    /**
     * A binding definition.
     */
    readonly binding: pulumi.Input<T>;

    /**
     * A dictionary of application settings to be applied to the Function App.
     */
    readonly settings: pulumi.Input<{ [key: string]: any; }>;
}

export type InputBindingSettings = BindingSettings<InputBindingDefinition>;
export type OutputBindingSettings = BindingSettings<OutputBindingDefinition>;

// We might want to merge this into CallbackArgs hierachy when all function types support bindings
export interface InputOutputsArgs {
    /**
     * Input bindings.
     */
    inputs?: InputBindingSettings[];

    /**
     * Output bindings.
     */
    outputs?: OutputBindingSettings[];
}

/**
 * Type alias for a response coming from an Azure Function callback, which applies to most Function types
 * (HTTP being a notable exception).
 * 'void' is returned when a Function has no output bindings.
 * For each output binding, the callback should define a property in the response record with the property
 * name matching the binding name. For instance, for an output binding called 'myoutput', the response could
 * be '{ myoutput: "My Value" }'.
 */
export type FunctionDefaultResponse = void | Record<string, any>;

/**
 * Azure Function base class.
 */
export abstract class Function<C extends Context<R>, E, R extends Result> {
    /**
     * Function name.
     */
    public readonly name: string;

    /**
     * An array of function binding definitions.
     */
    public readonly bindings: pulumi.Input<BindingDefinition[]>;

    /**
     * Function callback.
     */
    public readonly callback: CallbackArgs<C, E, R>;

    /**
     * Application settings required by the function.
     */
    public readonly appSettings?: pulumi.Input<{ [key: string]: string }>;

    constructor(name: string,
                trigger: pulumi.Input<InputBindingDefinition>,
                args: CallbackFunctionArgs<C, E, R>,
                settings?: pulumi.Input<{ [key: string]: string }>) {
        const triggerSettings = { binding: trigger, settings: settings || {} };
        const { bindings, appSettings } = combineBindingSettings(triggerSettings, args.inputs, args.outputs);
        this.name = name;
        this.bindings = bindings;
        this.callback = args;
        this.appSettings = appSettings;
    }
}

/**
 * Arguments to create a Function App component with multiple callback functions in it.
 */
export interface MultiCallbackFunctionAppArgs extends FunctionAppArgsBase {
    /**
     * The functions to deploy as parts of this application. At least 1 function is required.
     */
    functions: Function<any, any, any>[];
};

/**
 * Arguments to create a Function App component and deploy the specified raw archive package.
 */
export interface ArchiveFunctionAppArgs extends FunctionAppArgsBase {
    /**
     * The deployment package of a Function App to deploy as-is.
     */
    archive: pulumi.Input<pulumi.asset.Archive>;
};

function createFunctionAppParts(name: string,
                                args: ArchiveFunctionAppArgs,
                                opts: pulumi.CustomResourceOptions = {}) {

    if (!args.archive) {
        throw new Error("Deployment [archive] must be provided.");
    }

    const { resourceGroupName, location } = getResourceGroupNameAndLocation(args, undefined);

    const resourceGroupArgs = { resourceGroupName, location };

    const plan = args.plan || new appservice.Plan(name, {
        ...resourceGroupArgs,

        kind: "FunctionApp",

        sku: {
            tier: "Dynamic",
            size: "Y1",
        },
    }, opts);

    const storageMod = <typeof storageForTypesOnly>require("../storage");
    const account = args.account || new storageMod.Account(makeSafeStorageAccountName(name), {
        ...resourceGroupArgs,

        accountKind: "StorageV2",
        accountTier: "Standard",
        accountReplicationType: "LRS",
    }, opts);

    const container = args.container || new storageMod.Container(makeSafeStorageContainerName(name), {
        storageAccountName: account.name,
        containerAccessType: "private",
    }, opts);

    const zipBlob = new storageMod.ZipBlob(name, {
        resourceGroupName,
        storageAccountName: account.name,
        storageContainerName: container.name,
        type: "block",
        content: args.archive,
    }, opts);

    const codeBlobUrl = storageMod.signedBlobReadUrl(zipBlob, account);

    const functionArgs: appservice.FunctionAppArgs = {
        ...args,
        ...resourceGroupArgs,

        appServicePlanId: plan.id,
        storageConnectionString: account.primaryConnectionString,
        version: args.version || "~2",

        appSettings: pulumi.output(args.appSettings).apply(settings => {
            return {
                ...settings,
                WEBSITE_RUN_FROM_PACKAGE: codeBlobUrl,
                WEBSITE_NODE_DEFAULT_VERSION: util.ifUndefined(args.nodeVersion, "8.11.1"),
            };
        }),
    };

    const routePrefix = args.hostSettings
        && args.hostSettings.extensions
        && args.hostSettings.extensions.http
        && args.hostSettings.extensions.http.routePrefix;
    const rootPath = routePrefix === "" ? "" : `${routePrefix === undefined ? "api" : routePrefix}/`;

    return { account, container, plan, zipBlob, functionArgs, rootPath };
}

/**
  * A CallbackFunctionApp is a special type of azure.appservice.FunctionApp that can be created out
  * of an actual JavaScript function instance.  The function instance will be analyzed and packaged
  * up (including dependencies) into a form that can be used by Azure Functions. See
  * https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for additional
  * details on this process.
 */
export class CallbackFunctionApp<C extends Context<R>, E, R extends Result> extends FunctionApp {
    /**
     * Storage account where the FunctionApp's zipBlob is uploaded to.
     */
    public readonly account: storageForTypesOnly.Account;
    /**
     * Storage container where the FunctionApp's zipBlob is uploaded to.
     */
    public readonly container: storageForTypesOnly.Container;
    /**
     * The blob containing all the code for this FunctionApp.
     */
    public readonly zipBlob: storageForTypesOnly.ZipBlob;
    /**
     * The plan this Function App runs under.
     */
    public readonly plan: appservice.Plan;
    /**
     * Root HTTP endpoint of the Function App.
     */
    public readonly endpoint: pulumi.Output<string>;

    constructor(name: string, bindingsOrFunc: pulumi.Input<BindingDefinition[]> | Function<C, E, R>,
                args: CallbackFunctionAppArgs<C, E, R>, opts: pulumi.CustomResourceOptions = {}) {

        const functions = bindingsOrFunc instanceof Function ? [bindingsOrFunc] : [<Function<C, E, R>>{ name, bindings: bindingsOrFunc, callback: args }];
        const parts = createFunctionAppParts(name, {
            ...args,
            archive: produceDeploymentArchive({ ...args, functions }),
            appSettings: combineFunctionAppSettings({ ...args, functions }),
        }, opts);

        super(name, parts.functionArgs, opts);

        this.account = parts.account;
        this.container = parts.container;
        this.plan = parts.plan;
        this.zipBlob = parts.zipBlob;
        this.endpoint = getEndpoint(this, parts.rootPath);
    }
}

function getEndpoint(app: FunctionApp, rootPath: string) {
    return pulumi.interpolate`https://${app.defaultHostname}/${rootPath}`;
}

/**
 * A base component for custom Function App components. It is required to provide a common parent
 * for all resources, so that they are logically grouped under the same root in the Pulumi resource
 * tree.
 */
export abstract class PackagedFunctionApp extends pulumi.ComponentResource {
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
     * The plan this Function App runs under.
     */
    public readonly plan: appservice.Plan;
    /**
     * The Function App which contains the functions from the archive.
     */
    public readonly functionApp: appservice.FunctionApp;
    /**
     * Root HTTP endpoint of the Function App.
     */
    public readonly endpoint: pulumi.Output<string>;

    constructor(type: string,
                name: string,
                args: ArchiveFunctionAppArgs,
                opts: pulumi.ComponentResourceOptions = {}) {
        super(type, name, undefined, opts);

        const parentOpts = { parent: this };
        const parts = createFunctionAppParts(name, args, parentOpts);

        this.account = parts.account;
        this.container = parts.container;
        this.zipBlob = parts.zipBlob;
        this.plan = parts.plan;
        this.functionApp = new FunctionApp(name, parts.functionArgs, parentOpts);
        this.endpoint = getEndpoint(this.functionApp, parts.rootPath);
    }
}

/**
  * A ArchiveFunctionApp is a component that instantiates a azure.appservice.FunctionApp and all the required
  * dependencies and deploys the specified archive into it. The archive must contain the full artifact to be deployed
  * into the Function App.
 */
export class ArchiveFunctionApp extends PackagedFunctionApp {
    constructor(name: string,
                args: ArchiveFunctionAppArgs,
                opts: pulumi.ComponentResourceOptions = {}) {
        super("azure:appservice:ArchiveFunctionApp", name, args, opts);
        this.registerOutputs();
    }
}

/**
  * A MultiCallbackFunctionApp is a component that instantiates a azure.appservice.FunctionApp and all the required
  * dependencies out of multiple actual JavaScript functions. At least 1 function is required. The function instances
  * will be analyzed and packaged up (including dependencies) into a form that can be used by Azure Functions. See
  * https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for additional
  * details on this process.
 */
export class MultiCallbackFunctionApp extends PackagedFunctionApp {
    constructor(name: string,
                args: MultiCallbackFunctionAppArgs,
                opts: pulumi.ComponentResourceOptions = {}) {

        if (args.functions.length == 0) {
            throw new Error("At least one function must be provided.");
        }

        const names = args.functions.map(f => f.name);
        const duplicates = names.filter((item, index) => names.indexOf(item) !== index);
        if (duplicates.length > 0) {
            const msg = [...new Set(duplicates)].map(s => `[${s}]`).join(", ");
            throw new Error(`Function names must be unique within a given Function App. Duplicate functions: ${msg}.`);
        }

        super("azure:appservice:MultiCallbackFunctionApp", name, {
            ...args,
            archive: produceDeploymentArchive(args),
            appSettings: combineFunctionAppSettings(args),
        }, opts);

        this.registerOutputs();
    }
}

/**
 * Base type for all subscription types.  An event subscription represents a connection between some
 * azure resource an an FunctionApp that will be triggered when something happens to that resource.
 */
export abstract class EventSubscription<C extends Context<R>, E, R extends Result> extends pulumi.ComponentResource {
    public readonly functionApp: CallbackFunctionApp<C, E, R>;

    constructor(type: string, name: string,
                bindingsOrFunc: pulumi.Input<BindingDefinition[]> | Function<C, E, R>,
                args: CallbackFunctionAppArgs<C, E, R>,
                opts: pulumi.ComponentResourceOptions = {}) {
        super(type, name, undefined, opts);

        this.functionApp = new CallbackFunctionApp(name, bindingsOrFunc, args, { parent: this });
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

    if (!args.resourceGroupName && !fallbackResourceGroupName) {
        throw new Error("Either [args.resourceGroup] or [args.resourceGroupName] must be provided.");
    }

    const resourceGroupName = util.ifUndefined(args.resourceGroupName, fallbackResourceGroupName!);
    const getResult = resourceGroupName.apply(n => core.getResourceGroup({ name: n }));
    return { resourceGroupName, location: getResult.location };
}

function combineAppSettings(settings: pulumi.Input<{[key: string]: string}>[]): pulumi.Output<{[key: string]: string}> {
    return pulumi.all(settings).apply(items => items.reduce((a, b) => ({ ...a, ...b }), {}));
}

function combineBindingSettings(trigger: BindingSettings<BindingDefinition>,
                                inputs?: InputBindingSettings[],
                                outputs?: OutputBindingSettings[]) {
    const all = [trigger, ...inputs || [], ...outputs || []];

    const bindings = pulumi.all(all.map(bs => bs.binding));
    const appSettings = combineAppSettings(all.map(bs => bs.settings));

    return { bindings, appSettings };
}

/**
 * Keys associated with a Function App.
 */
export interface FunctionHostKeys {
    /** Master key. */
    masterKey: string;
    /** A dictionary of system keys, e.g. for Durable Functions or Event Grid. */
    systemKeys: { [key: string]: string };
    /** Default function keys. */
    functionKeys: FunctionKeys;
}

/**
 * Keys associated with a single Function.
 */
export interface FunctionKeys {
    default: string;
    [key: string]: string;
}

declare module "./functionApp" {
    interface FunctionApp {
        /**
         * Retrieve the keys associated with the Function App.
         */
        getHostKeys(): pulumi.Output<FunctionHostKeys>;

        /**
         * Retrieve the keys associated with the given Function.
         */
        getFunctionKeys(functionName: pulumi.Input<string>): pulumi.Output<FunctionKeys>;
    }
}

FunctionApp.prototype.getHostKeys = function(this: FunctionApp) {
    return this.id.apply(async id => {
        const credentials = await core.getServiceClientCredentials();
        const client = new AzureServiceClient(credentials);
        const url = `https://management.azure.com${id}/host/default/listkeys?api-version=2018-02-01`;

        const response = await client.sendRequest({ method: "POST", url });
        if (response.status >= 400) {
            throw new Error(`Failed to retrieve the host keys: ${response.bodyAsText}`);
        }

        const body = response.parsedBody;
        if (body.masterKey === undefined || body.systemKeys === undefined || body.functionKeys === undefined) {
            throw new Error(`Wrong shape of the host keys response: ${response.bodyAsText}`);
        }

        return body as FunctionHostKeys;
    });
};

FunctionApp.prototype.getFunctionKeys = function(this: FunctionApp, functionName) {
    return pulumi.all([this.id, functionName]).apply(async ([id, functionName]) => {
        const credentials = await core.getServiceClientCredentials();
        const client = new AzureServiceClient(credentials);
        const url = `https://management.azure.com${id}/functions/${functionName}/listkeys?api-version=2018-02-01`;

        const response = await client.sendRequest({ method: "POST", url });
        if (response.status >= 400) {
            throw new Error(`Failed to retrieve the function keys: ${response.bodyAsText}`);
        }

        const body = response.parsedBody;
        if (body.default === undefined) {
            throw new Error(`Wrong shape of the function keys response: ${response.bodyAsText}`);
        }

        return body as FunctionKeys;
    });
};
