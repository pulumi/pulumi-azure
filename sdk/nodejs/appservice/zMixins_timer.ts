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

/**
 * Creates an appropriate [Cron](https://en.wikipedia.org/wiki/Cron) format string that can be
 * used as the [recurrence] property of [ScheduleArgs]. Includes a component for seconds.
 */
function cronExpression(a: ScheduleArgs) {
    checkRange(a.second, "second", 0, 59);
    checkRange(a.minute, "minute", 0, 59);
    checkRange(a.hour, "hour", 0, 23);
    checkRange(a.dayOfMonth, "dayOfMonth", 1, 31);

    return `${val(a.second)} ${val(a.minute)} ${val(a.hour)} ${val(a.dayOfMonth)} ${month(a.month)} ${dayOfWeek(a.dayOfWeek)}`;

    function val(v: number | undefined) {
        return v === undefined ? "*" : v;
    }

    function dayOfWeek(v: DayOfWeek | undefined) {
        if (v === undefined || typeof v === "number") {
            checkRange(v, "dayOfWeek", 0, 7);
            return val(v);
        }

        switch (v) {
            case "Sunday": return 0;
            case "Monday": return 1;
            case "Tuesday": return 2;
            case "Wednesday": return 3;
            case "Thursday": return 4;
            case "Friday": return 5;
            case "Saturday": return 6;
            default: throw new Error(`Invalid day of week: ${v}`);
        }
    }

    function month(v: Month | undefined) {
        if (v === undefined || typeof v === "number") {
            checkRange(v, "month", 1, 12);
            return val(v);
        }

        switch (v) {
            case "January": return 1;
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: throw new Error(`Invalid month: ${v}`);
        }
    }

    function checkRange(
            val: number | undefined, name: keyof ScheduleArgs,
            minInclusive: number, maxInclusive: number) {
        if (val !== undefined) {
            if (val < minInclusive || val > maxInclusive) {
                throw new Error(`Value for [args.${name}] was not in the inclusive range [${minInclusive}, ${maxInclusive}].`);
            }
        }
    }
}

/**
 * If a number, it must be between 0 to 7 (inclusive). (0 and 7 both represent Sunday).
 */
export type DayOfWeek = number | "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" | "Saturday" | "Sunday";

/**
 * If a number, it must be between 1 to 12 (inclusive).
 */
export type Month = number |
    "January" | "February" | "March" | "April" | "May" | "June" |
    "July" | "August" | "September" | "October" | "November" | "December";

export interface ScheduleArgs {
    /** 0 to 59.  Leave undefined to indicate no specific value. */
    second?: number;

    /** 0 to 59.  Leave undefined to indicate no specific value. */
    minute?: number;

    /** 0 to 23.  Leave undefined to indicate no specific value.  All times UTC */
    hour?: number;

    /** 1 to 31.  Leave undefined to indicate no specific value. */
    dayOfMonth?: number;

    /** Month of the year to perform the scheduled action on.  Leave undefined to indicate no specific value. */
    month?: Month;

    /** Day of the week to perform the scheduled action on.  Leave undefined to indicate no specific value. */
    dayOfWeek?: DayOfWeek;
}

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
    schedule: pulumi.Input<string | ScheduleArgs>;

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

        const schedule = pulumi.output(args.schedule).apply(s => typeof s === "string" ? s : cronExpression(s));

        const bindings: TimerBindingDefinition[] = [{
            type: "timerTrigger",
            direction: "in",
            name: "timer",
            runOnStartup: args.runOnStartup,
            schedule,
        }];

        args.bindings = mod.mergeBindings(bindings, args.bindings);

        super("azure:appservice:TimerSubscription", name, {
            ...args,
            location,
            resourceGroupName,
        }, opts);

        this.registerOutputs();
    }
}
