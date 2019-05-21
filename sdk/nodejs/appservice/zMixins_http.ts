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

import * as mod from ".";

import * as core from "../core";
import * as util from "../util";

/**
 * HTTP request object. Provided to your function when using HttpEventSubscription.
 */
export type HttpRequest = azurefunctions.HttpRequest;

/**
 * Represents an HTTP response including the status code and data.
 */
export type HttpResponse = azureessentials.HttpResponse;
export type ExtendedHttpResponse = {
    response: azureessentials.HttpResponse;
    [key: string]: any;
}

/**
 * Host settings specific to the HTTP plugin.
 *
 * For more details see https://docs.microsoft.com/en-us/azure/azure-functions/functions-host-json#http
 */
export interface HttpHostSettings extends mod.HostSettings {
    extensions?: {
        http: {
            /** The route prefix that applies to all routes. Use an empty string to remove the default prefix. */
            routePrefix?: string,
        
            /** The maximum number of outstanding requests that are held at any given time. */
            maxOutstandingRequests?: number,
        
            /** The maximum number of http functions that will be executed in parallel. */
            maxConcurrentRequests?: number,
        
            /**
             * When enabled, this setting causes the request processing pipeline to periodically check system performance 
             * counters like connections/threads/processes/memory/cpu/etc. and if any of those counters are over a built-in 
             * high threshold (80%), requests will be rejected with a 429 "Too Busy" response until the counter(s) return 
             * to normal levels.
             */
            dynamicThrottlesEnabled?: boolean,
        }
    }    
}

export type HttpEventSubscriptionArgs = util.Overwrite<mod.CallbackFunctionAppArgs<mod.Context<HttpResponse>, HttpRequest, HttpResponse>, {
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

    /**
     * Defines the route template, controlling to which request URLs your function responds. The
     * default value if none is provided is <functionname>.
     */
    route?: pulumi.Input<string>;

    /**
     * An array of the HTTP methods to which the function responds. If not specified, the function
     * responds to all HTTP methods.
     */
    methods?: pulumi.Input<pulumi.Input<string>[]>;

    /** 
     * Host settings specific to the HTTP plugin. These values can be provided here, or defaults will 
     * be used in their place. 
     */
    hostSettings?: HttpHostSettings;
}>;

interface HttpBindingDefinition extends mod.BindingDefinition {
    authLevel?: "anonymous";
    route?: pulumi.Input<string>;
    methods?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * An Azure Function exposed via an HTTP endpoint that is implemented on top of a
 * JavaScript/TypeScript callback function.
 */
export class HttpEventSubscription extends mod.EventSubscription<mod.Context<HttpResponse>, HttpRequest, HttpResponse> {
    /**
     * Endpoint where this FunctionApp can be invoked.
     */
    public readonly url: pulumi.Output<string>;

    constructor(name: string,
                args: HttpEventSubscriptionArgs,
                opts: pulumi.CustomResourceOptions = {}) {

        const { resourceGroupName, location } = mod.getResourceGroupNameAndLocation(args, undefined);

        const bindings: HttpBindingDefinition[] = [{
                    authLevel: "anonymous",
                    type: "httpTrigger",
                    direction: "in",
                    name: "req",
                    route: args.route,
                    methods: args.methods,
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

        const routePrefix = args.hostSettings && args.hostSettings.extensions && args.hostSettings.extensions.http.routePrefix;
        const rootPath = routePrefix === "" ? "" : `${routePrefix === undefined ? "api" : routePrefix}/`;

        const functionPath = args.route === undefined ? name : `{${args.route}}`;

        this.url = pulumi.interpolate`https://${this.functionApp.defaultHostname}/${rootPath}${functionPath}`;

        this.registerOutputs();
    }
}

export type HttpFunctionArgs = util.Overwrite<mod.CallbackArgs<mod.Context<HttpResponse>, HttpRequest, HttpResponse | ExtendedHttpResponse>, {
    /**
     * Defines the route template, controlling to which request URLs your function responds. The
     * default value if none is provided is <functionname>.
     */
    route?: pulumi.Input<string>;

    /**
     * An array of the HTTP methods to which the function responds. If not specified, the function
     * responds to all HTTP methods.
     */
    methods?: pulumi.Input<pulumi.Input<string>[]>;

    outputBindings?: mod.AzureFunctionOutputBinding[];
}>;

export class HttpFunction extends mod.AzureFunction {
    
    constructor(name: string, args: HttpFunctionArgs) {

        const outputBindings = args.outputBindings !== undefined ? args.outputBindings.map(b => b.definition) : [];

        const bindings: HttpBindingDefinition[] = [{
            authLevel: "anonymous",
            type: "httpTrigger",
            direction: "in",
            name: "req",
            route: args.route,
            methods: args.methods,
        }, {
            type: "http",
            direction: "out",
            name: outputBindings.length > 0 ? "response" : "$return",
        }];

    
        const definition = pulumi.all([mod.serializeFunctionCallback(args), outputBindings]).apply(
            ([func, outputs]) => ({ name, bindings: bindings.concat(outputs), func }));

        super(definition);
    }
}
