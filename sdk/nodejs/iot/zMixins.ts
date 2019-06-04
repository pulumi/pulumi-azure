import * as pulumi from "@pulumi/pulumi";
import * as appservice from "../appservice";
import { IoTHub } from "./ioTHub";
import { EventHubBindingDefinition, EventHubContext, EventHubCallback, EventHubSubscriptionArgs } from '../eventhub';

declare module "./ioTHub" {
    interface IoTHub {
        /**
         * Subscribes to events logged to this Event Hub to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: EventHubCallback | EventHubSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): IoTHubEventSubscription;
    }
}

IoTHub.prototype.onEvent = function(this: IoTHub, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <EventHubSubscriptionArgs>{ callback: args }
        : args;

    return new IoTHubEventSubscription(name, this, functionArgs, opts);
}

export class IoTHubEventSubscription extends appservice.EventSubscription<EventHubContext, string, void> {
    readonly iotHub: IoTHub;

    constructor(
        name: string, iotHub: IoTHub,
        args: EventHubSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

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
            consumerGroup: "$Default", // Other consumer groups will be supported in future version 
            cardinality: args.cardinality,
            connection: bindingConnectionKey,
        }];

        // Place the mapping from the well known key name to the Event Hubs account connection string in
        // the 'app settings' object.

        const appSettings = pulumi.all([args.appSettings, iotHub.eventHubEventsEndpoint]).apply(
            ([appSettings,eventHubEventsEndpoint]) => ({ ...appSettings, [bindingConnectionKey]: eventHubEventsEndpoint }));

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