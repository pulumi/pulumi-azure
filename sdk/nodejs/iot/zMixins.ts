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
import * as appservice from "../appservice";
import { IoTHub } from "./ioTHub";
import { ConsumerGroup } from "./consumerGroup";
import { EventHubBindingDefinition, EventHubContext, EventHubCallback } from '../eventhub';
import * as util from "../util";

export type IoTHubSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<EventHubContext, any, void>, {
    /**
     * Optional Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup?: ConsumerGroup;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
}>;

declare module "./ioTHub" {
    interface IoTHub {
        /**
         * Subscribes to events logged to this Event Hub to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: EventHubCallback | IoTHubSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): IoTHubEventSubscription;
    }
}

IoTHub.prototype.onEvent = function(this: IoTHub, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <IoTHubSubscriptionArgs>{ callback: args }
        : args;

    return new IoTHubEventSubscription(name, this, functionArgs, opts);
}

export class IoTHubEventSubscription extends appservice.EventSubscription<EventHubContext, string, void> {
    readonly iotHub: IoTHub;

    constructor(
        name: string, iotHub: IoTHub,
        args: IoTHubSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: iotHub, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, iotHub.resourceGroupName);

        // The event hub binding does not store the Event Hubs connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = "BindingConnectionAppSettingsKey";

        const bindings: EventHubBindingDefinition[] = [{
            name: "eventHub",
            direction: "in",
            type: "eventHubTrigger",
            eventHubName: iotHub.name,
            consumerGroup: args.consumerGroup ? args.consumerGroup.name : "$Default",
            cardinality: args.cardinality,
            connection: bindingConnectionKey,
        }];

        pulumi.all([iotHub.fallbackRoute, iotHub.routes]).apply(([fallbackRoute, routes]) => {
            if (fallbackRoute && fallbackRoute.enabled) {
                return;
            }
            if (routes && routes.length > 0) {
                return;
            }
            throw new pulumi.ResourceError("IoT Hub must have a route or fallback route enabled.", opts.parent);
        });

        // Place the mapping from the well known key name to the Event Hubs account connection string in
        // the 'app settings' object.
        // The connection string is built from the IoT Hub "event hub compatible endpoint" 
        // and the iothubowner access policy key
        // see https://docs.microsoft.com/en-us/azure/iot-hub/iot-hub-devguide-messages-read-builtin
        const appSettings = pulumi.all([args.appSettings, iotHub.eventHubEventsEndpoint, iotHub.sharedAccessPolicies]).apply(
            ([appSettings, eventHubEventsEndpoint, sharedAccessPolicies]) => ({ 
                ...appSettings, 
                [bindingConnectionKey]: `Endpoint=${eventHubEventsEndpoint};SharedAccessKeyName=iothubowner;SharedAccessKey=${sharedAccessPolicies.find(p => p.keyName === "iothubowner")!.primaryKey}` 
            }));

        super("azure:eventhub:IoTHubEventSubscription", name, bindings, {
            ...args,
            resourceGroupName,
            location,
            appSettings
        }, opts);

        this.iotHub = iotHub;

        this.registerOutputs();
    }
}
