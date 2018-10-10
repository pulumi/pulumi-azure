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
import { FunctionApp, FunctionAppArgs } from "./functionApp";
import * as azurefunctions from "azure-functions-ts-essentials";

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
 * CallbackFunctionAppArgs provides configuration options for the serverless FunctionApp.  It is
 * effectively equivalent to [appservice.FunctionArgs] except with a few important differences
 * documented at the property level.
 */
export type CallbackFunctionAppArgs<C extends Context, Data> = utils.Overwrite<FunctionAppArgs, {
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
     * Options to control which files and packages are included with the serialized FunctionApp code.
     */
    codePathOptions?: pulumi.runtime.CodePathOptions;
}>;
