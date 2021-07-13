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

/**
 * HTTP request object. Provided to your function when using HttpEventSubscription.
 */
export type HttpRequest = azurefunctions.HttpRequest;

/**
 * Represents an HTTP response including the status code and data.
 */
export type HttpResponse = azureessentials.HttpResponse;

/**
 * Host settings specific to the HTTP plugin.
 *
 * For more details see https://docs.microsoft.com/en-us/azure/azure-functions/functions-host-json#http
 */
export interface HttpHostExtensions {
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
export interface HttpHostSettings extends mod.HostSettings {
    extensions?: {
        http: HttpHostExtensions,
    }
}

/**
 * HTTP Response that may or may not contain extra output binding data.
 * For each output binding, the callback should define a property in the response record with the property
 * name matching the binding name. For instance, for an output binding called 'myoutput', the response could
 * be '{ response: { status: 200, body: "My Response" }, myoutput: "My Value" }'.
 */
export type ExtendedHttpResponse = HttpResponse | { response: HttpResponse; [key: string]: any };

export interface HttpFunctionArgs extends mod.CallbackFunctionArgs<mod.Context<HttpResponse>, HttpRequest, ExtendedHttpResponse | void> {
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
}

export interface HttpEventSubscriptionArgs extends HttpFunctionArgs, mod.CallbackFunctionAppArgs<mod.Context<HttpResponse>, HttpRequest, ExtendedHttpResponse | void> {
    /**
     * Host settings specific to the HTTP plugin. These values can be provided here, or defaults will
     * be used in their place.
     */
    hostSettings?: HttpHostSettings;
};

interface HttpBindingDefinition extends mod.BindingDefinition {
    authLevel?: "anonymous";
    route?: pulumi.Input<string>;
    methods?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * An Azure Function exposed via an HTTP endpoint that is implemented on top of a
 * JavaScript/TypeScript callback function.
 */
export class HttpEventSubscription extends mod.EventSubscription<mod.Context<HttpResponse>, HttpRequest, ExtendedHttpResponse | void> {
    /**
     * Endpoint where this FunctionApp can be invoked.
     */
    public readonly url: pulumi.Output<string>;

    constructor(name: string,
                args: HttpEventSubscriptionArgs,
                opts: pulumi.CustomResourceOptions = {}) {
        super("azure:appservice:HttpEventSubscription", name, new HttpFunction(name, args), args, opts);

        this.url = pulumi.interpolate`${this.functionApp.endpoint}${args.route || name}`;
        this.registerOutputs();
    }
}

/**
 * Azure Function triggered by HTTP requests.
 */
export class HttpFunction extends mod.Function<mod.Context<HttpResponse>, HttpRequest, ExtendedHttpResponse | void> {
    constructor(name: string, args: HttpFunctionArgs) {
        const trigger = {
            authLevel: "anonymous",
            type: "httpTrigger",
            direction: "in",
            name: "req",
            route: args.route,
            methods: args.methods,
        } as mod.InputBindingDefinition;

        // There are three modes to return an HTTP response:
        // 1. The caller already specified an output binding for http.
        //    In this case, we do not add our own.
        // 2. When there's no other output bindings, take the returned value of the callback,
        //    so the binding has to be named '$return' (mandated by Azure Functions)
        // 3. When there are other output bindings, it's a property of the returned value
        //    with a fixed name 'response' (picked by us)

        const callerDefinedOutputs = args.outputs || [];

        const extendedOutputs = pulumi.output(callerDefinedOutputs).apply(outputs => {
            if(outputs.some(o => o.binding.type.toLowerCase() === "http")){
                return outputs;
            }
            const response = {
                binding: {
                    type: "http",
                    direction: "out",
                    name: outputs && outputs.length > 0 ? "response" : "$return",
                } as mod.OutputBindingDefinition,
                settings: {},
            };

            return [response, ...outputs];
        });

        // Include HTTP response into the list of output bindings
        const extendedArgs = {
            ...args,
            outputs: extendedOutputs,
        };

        super(name, trigger, extendedArgs);
    }
}
