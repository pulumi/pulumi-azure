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
import * as mod from ".";


export interface DurableOrchestratorFunctionContext extends mod.Context<mod.Result> {
    df: any
}

export interface DurableOrchestratorFunctionArgs extends mod.CallbackFunctionArgs<DurableOrchestratorFunctionContext, void, void> {
}

/**
 * Azure Durable Orchestrator Function
 */
export class DurableOrchestratorFunction extends mod.Function<DurableOrchestratorFunctionContext, void, void> {
    constructor(name: string, args: DurableOrchestratorFunctionArgs) {

        if(args.callback){
            throw new Error("Durable orchestrator functions need to use the [callbackFactory]");
        }
        
        const trigger = {
            name: "context",
            type: "orchestrationTrigger",
            direction: "in"
        } as mod.InputBindingDefinition;

        super(name, trigger, args);
    }
}

export interface DurableActivityFunctionContext<TActivityInputBinding> extends mod.Context<mod.Result> {
    bindings: {
        [key: string]: any;
    } & TActivityInputBinding
}

export interface DurableActivityFunctionArgs<TActivityInputBinding> extends mod.CallbackFunctionArgs<DurableActivityFunctionContext<TActivityInputBinding>, void, void> {
    activityInputName: keyof TActivityInputBinding
}

/**
 * Azure Durable Orchestrator Function
 */
export class DurableActivityFunction<TActivityInputBinding> extends mod.Function<DurableActivityFunctionContext<TActivityInputBinding>, void, void> {
    constructor(name: string, args: DurableActivityFunctionArgs<TActivityInputBinding>) {
        const trigger = {
            name: args.activityInputName,
            type: "activityTrigger",
            direction: "in"
        } as mod.InputBindingDefinition;

        super(name, trigger, args);
    }
}

export class DurableOrchestrationClientInputBindingSettings implements mod.InputBindingSettings {
    binding: pulumi.Input<mod.InputBindingDefinition>;
    settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string) {
        this.binding = {
            name,
            type: "orchestrationClient",
            direction: "in"
        }
        this.settings = {};
    }
}