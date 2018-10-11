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

import * as storage from "../storage";
import * as utils from "../utils";
import { Plan } from "./plan";
import { FunctionApp, FunctionAppArgs } from "./functionApp";
import * as azurefunctions from "azure-functions-ts-essentials";
import * as azurestorage from "azure-storage";

/**
 * Context is the shape of the context object passed to a FunctionApp callback.
 */
export interface Context extends azurefunctions.Context {
    log: {
        (...message: Array<any>): void;
        error(...message: Array<any>): void;
        warn(...message: Array<any>): void;
        info(...message: Array<any>): void;
        verbose(...message: Array<any>): void;
        metric(...message: Array<any>): void;
    };
}

/**
 * A synchronous function that can be converted into an Azure FunctionApp. This callback should
 * return nothing, and should signal that it is done by calling `context.Done()`. Errors can be
 * signified by calling `context.Done(err)`
 */
export type Callback<C extends Context, Data> = (context: C, data: Data) => void;

/**
 * CallbackFactory is the signature for a function that will be called once to produce the function
 * that Azure FunctionApps will call into.  It can be used to initialize expensive state once that
 * can then be used across all invocations of the FunctionApp (as long as the FunctionApp is using
 * the same warm Node instance).
 */
export type CallbackFactory<C extends Context, Data> = () => Callback<C, Data>;

/**
 * An EventHandler is either a JavaScript callback or an appservice.FunctionApp that can be used to
 * handle an event triggered by some resource.  If just a JavaScript callback is provided the
 * appservice.FunctionApp will be created by creating a new CallbackFunctionApp from it.  If more
 * control over the resultant FunctionApp, clients can instantiate a new CallbackFunctionApp instant
 * directly and pass the result of that to any code that needs an EventHandler.
 */
export type EventHandler<C extends Context, Data> = Callback<C, Data> | FunctionApp;

/**
 * CallbackFunctionArgs provides configuration options for the serverless FunctionApp.  It is
 * effectively equivalent to [appservice.FunctionArgs] except with a few important differences
 * documented at the property level.
 */
export type CallbackFunctionArgs<C extends Context, Data> = utils.Overwrite<FunctionAppArgs, {
    /**
     * Binding values that will be emitted into the function.json config file for the FunctionApp.
     * Used by Azure to control which services will invoke the FunctionApp.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-triggers-bindings for more
     * details.
     */
    bindings?: pulumi.Input<Binding[]>;

    /**
     * The Javascript callback to use as the entrypoint for the Azure FunctionApp out of.  Either
     * [callback] or [callbackFactory] must be provided.
     */
    callback?: Callback<C, Data>;

    /**
     * The Javascript function instance that will be called to produce the callback function that is
     * the entrypoint for the Azure FunctionApp. Either [callback] or [callbackFactory] must be
     * provided.
     *
     * This form is useful when there is expensive initialization work that should only be executed
     * once.  The factory-function will be invoked once when the final FunctionApp module is loaded.
     * It can run whatever code it needs, and will end by returning the actual function that the
     * FunctionApp will call into each time it is invoked.
     */
    callbackFactory?: CallbackFactory<C, Data>;

    /**
     * The ID of the App Service Plan within which to create this Function App. Changing this forces
     * a new resource to be created.
     *
     * If not provided, a default "Consumption" plan will be created.  See:
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-scale#consumption-plan for
     * more details.
     */
    appServicePlanId?: pulumi.Input<string>;

    /**
     * The storage account to use where the zip-file blob for the FunctionApp will be located. If
     * not provided, a new storage account will create. It will be a 'Standard', 'LRS', 'StorageV2'
     * account.
     */
    storageAccount?: storage.Account;

    /**
     * Not used.  The storage connection string is determined based on the ZipBlob that is created
     * for all the code for the Function.
     */
    storageConnectionString?: never;

    /**
     * The container to use where the zip-file blob for the FunctionApp will be located. If not
     * provided, the root container of the storage account will be used.
     */
    storageContainer?: storage.Container;

    /**
     * Whether or not console output of the actual function code should be automatically redirected
     * to the Context log stream. True if not specified.
     */
    redirectConsoleOutput?: boolean;

    /**
     * A key-value pair of App Settings.
     */
    appSettings?: pulumi.Input<{[key: string]: any}>;

    /**
     * Specifies the supported Azure location where the resource exists.
     */
    location?: pulumi.Input<string>;

    /**
     * The name of the resource group in which to create the Function App.
     */
    resourceGroupName?: pulumi.Input<string>;

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
    type: string;
    direction: string;
    name: string;
}

/* @internal */ export function createFunctionAppFromEventHandler<C extends Context, Data>(
    name: string, handler: EventHandler<C, Data>, bindings: pulumi.Input<Binding[]>,
    location: pulumi.Input<string>, resourceGroupName: pulumi.Input<string>,
    opts: pulumi.ResourceOptions): FunctionApp {

    if (handler instanceof Function) {
        return new CallbackFunctionApp(name, {
            callback: handler,
            bindings: bindings,
            location: location,
            resourceGroupName: resourceGroupName,
        }, opts);
    }
    else {
        return handler;
    }
}

/**
* A CallbackFunction is a special type of appservice.FunctionApp that can be created out of an
* actual JavaScript function instance.  The function instance will be analyzed and packaged up
* (including dependencies) into a form that can be used by Azure.  See
* https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for additional
* details on this process.
*/
export class CallbackFunction<C extends Context, Data> extends FunctionApp {
    readonly storageAccount: storage.Account;
    readonly storageContainer: storage.Container;

    constructor(name: string, args: CallbackFunctionArgs<C, Data>, opts: pulumi.ResourceOptions = {}) {
        if (!args.resourceGroupName) {
            throw new pulumi.ResourceError("[resourceGroupName] must be provided in [args]", opts.parent);
        }

        if (!args.location) {
            throw new pulumi.ResourceError("[location] must be provided in [args]", opts.parent);
        }

        const resourceGroupArgs = {
            resourceGroupName: args.resourceGroupName,
            location: args.location,
        };

        let appServicePlanId = args.appServicePlanId;
        if (!appServicePlanId) {
            const plan = new Plan(name, {
                ...resourceGroupArgs,

                kind: "FunctionApp",

                sku: {
                    tier: "Dynamic",
                    size: "Y1",
                },
            }, opts);
            appServicePlanId = plan.id;
        }

        const storageAccount = args.storageAccount || new storage.Account(makeSafeStorageAccountName(name), {
            ...resourceGroupArgs,

            accountKind: "StorageV2",
            accountTier: "Standard",
            accountReplicationType: "LRS",
        }, opts);

        const storageContainer = args.storageContainer || new storage.Container(makeSafeStorageContainerName(name), {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: storageAccount.name,
            containerAccessType: "private",
        }, opts);

        const assetMap = serializeCallback(name, args, args.bindings);
        const blob = new storage.ZipBlob(name, {
            resourceGroupName: args.resourceGroupName,
            storageAccountName: storageAccount.name,
            storageContainerName: storageContainer.name,
            type: "block",
            content: assetMap.apply(m => new pulumi.asset.AssetArchive(m)),
        }, opts);

        const codeBlobUrl = signedBlobReadUrl(blob, storageAccount, storageContainer);

        const functionAppArgs = {
            ...args,
            ...resourceGroupArgs,

            appServicePlanId: appServicePlanId,
            storageConnectionString: storageAccount.primaryConnectionString,

            appSettings: pulumi.output(args.appSettings).apply(settings => {
                settings = settings || {};
                return {
                    ...settings,
                    "WEBSITE_RUN_FROM_ZIP": codeBlobUrl,
                };
            }),
        };

        super(name, functionAppArgs, opts);
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

function redirectConsoleOutput<C extends Context, Data>(callback: Callback<C, Data>) {
    return (context: C, data: Data) => {
        // Redirect console logging to context logging.
        console.log = context.log;
        console.error = context.log.error;
        console.warn = context.log.warn;
        // tslint:disable-next-line:no-console
        console.info = context.log.info;

        return callback(context, data);
    };
}

/**
 * Takes in a callback and a set of bindings, and produces the right AssetMap layout that Azure
 * FunctionApps expect.
 */
function serializeCallback<C extends Context, Data>(
        name: string,
        args: CallbackFunctionAppArgs<C, Data>,
        bindingsInput: pulumi.Input<Binding[]>,
    ): pulumi.Output<pulumi.asset.AssetMap> {

    if (args.callback && args.callbackFactory) {
        throw new pulumi.RunError("Cannot provide both [callback] and [callbackFactory]");
    }

    if (!args.callback && !args.callbackFactory) {
        throw new Error("Missing required function callback");
    }

    let func: Function;
    if (args.redirectConsoleOutput !== false) {
        if (args.callback) {
            func = redirectConsoleOutput(args.callback);
        }
        else {
            func = () => {
                const innerFunc = args.callbackFactory!();
                return redirectConsoleOutput(innerFunc);
            };
        }
    }
    else {
        func = args.callback || args.callbackFactory;
    }

    const serializedHandlerPromise = pulumi.runtime.serializeFunction(
        func, { isFactoryFunction: !!args.callbackFactory });

    const pathSetPromise = pulumi.runtime.computeCodePaths(args.codePathOptions);

    return pulumi.output(bindingsInput).apply(async (bindings) => {
        const map: pulumi.asset.AssetMap = {};
        map["host.json"] = new pulumi.asset.StringAsset(JSON.stringify({
            "tracing": {
                "consoleLevel": "verbose",
            },
        }));

        map[`${name}/function.json`] = new pulumi.asset.StringAsset(JSON.stringify({
            "disabled": false,
            "bindings": bindings,
        }));

        const serializedHandler = await serializedHandlerPromise;
        map[`${name}/index.js`] = new pulumi.asset.StringAsset(`module.exports = require("./handler").handler`),
        map[`${name}/handler.js`] = new pulumi.asset.StringAsset(serializedHandler.text);

        // TODO: unify this code with aws-serverless instead of straight copying.
        // For each of the required paths, add the corresponding FileArchive or FileAsset to the AssetMap.
        const pathSet = await pathSetPromise;
        for (const [path, value] of pathSet.entries()) {
            map[name + "/" + path] = value;
        }

        return map;
    });
}

export function signedBlobReadUrl(
    blob: storage.Blob | storage.ZipBlob,
    account: storage.Account,
    container: storage.Container): pulumi.Output<string> {

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
