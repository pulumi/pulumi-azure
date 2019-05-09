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

import * as core from "../core";
import * as util from "../util";

interface TimerBindingDefinition extends mod.BindingDefinition {
    /**
     * The name of the variable that represents the timer object in function code.
     */
    name: string;

    /**
     * The type of a timer binding.  Must be 'timerTrigger'.
     */
    type: "timerTrigger";

    /**
     * The direction of the binding. Timers can only be inputs.
     */
    direction: "in";

    /**
     * A CRON expression for the timer schedule, e.g. '0 * * * * *'.
     */
    schedule: pulumi.Input<string>;

    /**
     * If true, the function is invoked when the runtime starts.
     */
    runOnStartup?: pulumi.Input<boolean>;

    /**
     * Set to true or false to indicate whether the schedule should be monitored. Schedule monitoring persists schedule occurrences
     * to aid in ensuring the schedule is maintained correctly even when function app instances restart. If not set explicitly, the
     * default is true for schedules that have a recurrence interval greater than 1 minute. For schedules that trigger more than once
     * per minute, the default is false.
     */
    useMonitor?: pulumi.Input<boolean>;
}

/**
 * Timer event data that will be passed to the timer callback.
 */
export interface TimerInfo {
    Schedule: {
        AdjustForDST: boolean;
    };
    ScheduleStatus: {
        Last: string;
        Next: string;
        LastUpdated: string;
    };
    IsPastDue: boolean;
}

/**
 * Data that will be passed along in the context object to the timer callback.
 */
export interface TimerContext extends mod.Context<void> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { timer: TimerInfo };
    bindingData: {
        timerTrigger: string;
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

export type TimerSubscriptionArgs = util.Overwrite<mod.CallbackFunctionAppArgs<TimerContext, TimerInfo, void>, {
    /**
     * The resource group in which to create the timer subscription. Either [resourceGroupName] or
     * [resourceGroup] must be supplied.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the timer subscription. Either
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
     * A CRON expression for the timer schedule, e.g. '0 * * * * *'.
     */
    schedule: pulumi.Input<string>;

    /**
     * If true, the function is invoked when the runtime starts.
     */
    runOnStartup?: pulumi.Input<boolean>;
}>;

export class TimerSubscription extends mod.EventSubscription<TimerContext, TimerInfo, void> {
    constructor(name: string,
                args: TimerSubscriptionArgs,
                opts: pulumi.CustomResourceOptions = {}) {

        const { resourceGroupName, location } = mod.getResourceGroupNameAndLocation(args, undefined);

        const bindings: TimerBindingDefinition[] = [{
            type: "timerTrigger",
            direction: "in",
            name: "timer",
            schedule: args.schedule,
            runOnStartup: args.runOnStartup,
        }];

        super("azure:appservice:TimerSubscription", name, bindings, {
            ...args,
            location,
            resourceGroupName,
        }, opts);

        this.registerOutputs();
    }
}
