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

import * as eventgrid from "azure-eventgrid/lib/models";
import fetch from "node-fetch";
import * as appservice from "../appservice";
import { ResourceGroup } from "../core";
import { Account } from "../storage";
import { EventSubscription } from "./eventSubscription";

/**
 * Event that will be passed along to the EventGridCallback.
 */
export interface EventGridEvent<T> extends eventgrid.EventGridEvent {
    data: T;
}

/**
 * Data that will be passed along in the context object to the EventGridCallback.
 */
export interface EventGridContext<T> extends appservice.Context<appservice.FunctionDefaultResponse> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { message: EventGridEvent<T> };
    bindingData: {
        data: T,
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

export interface EventGridFunctionArgs<T> extends appservice.CallbackFunctionArgs<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
}

/**
 * Azure Function triggered by a Event Grid Topic.
 */
export class EventGridFunction<T> extends appservice.Function<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: EventGridFunctionArgs<T>) {
        const trigger = {
            name: "message",
            direction: "in",
            type: "eventGridTrigger",
        } as appservice.InputBindingDefinition;

        super(name, trigger, args);
    }
}

export interface EventGridCallbackSubscriptionArgs<T> extends appservice.CallbackFunctionAppArgs<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence
     * over [resourceGroupName]. If none of the two is supplied, the Queue's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * A list of applicable event types that need to be part of the event subscription.
     */
    readonly includedEventTypes?: pulumi.Input<pulumi.Input<string>[]>;

    /**
     * A retry policy block as defined below.
     */
    readonly retryPolicy?: pulumi.Input<{ eventTimeToLive: pulumi.Input<number>, maxDeliveryAttempts: pulumi.Input<number> }>;

    /**
     * A subject filter block as defined below.
     */
    readonly subjectFilter?: pulumi.Input<{ caseSensitive?: pulumi.Input<boolean>, subjectBeginsWith?: pulumi.Input<string>, subjectEndsWith?: pulumi.Input<string> }>;
}

/**
 * Resource properties to scope an Event Grid subscription to. The shape fits most Azure resources,
 * so they can be passed directly.
 */
export interface EventGridScope {
    /**
     * Resource group name to create subscription at, if another resource group is not explicitly
     * passed in subscription arguments.
     */
    resourceGroupName: pulumi.Input<string>;

    /**
     * Azure Resource ID.
     */
    id: pulumi.Input<string>;
}

/**
 * A callback-based subscription to events coming from Event Grid. Creates an Azure Function and
 * an Event Grid Event Subscription with the webhook URL pointing to the Azure Function.
 */
export class EventGridCallbackSubscription<T> extends appservice.EventSubscription<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    public readonly subscription: EventSubscription;

    constructor(name: string,
                scope: EventGridScope,
                args: EventGridCallbackSubscriptionArgs<T>,
                opts: pulumi.ComponentResourceOptions = {}) {

        const resourceGroupName = appservice.getResourceGroupName(args, pulumi.output(scope.resourceGroupName));

        super("azure:eventgrid:EventGridCallbackSubscription",
              name,
              new EventGridFunction(name, args),
              { ...args, resourceGroupName },
              pulumi.mergeOptions(opts, {
                  aliases: [{ type: "azure:eventhub:EventGridCallbackSubscription" }],
              }));

        const keys = pulumi.output(this.functionApp.getHostKeys());
        const key = keys.systemKeys["eventgrid_extension"];
        const url = pulumi.interpolate`https://${this.functionApp.defaultHostname}/runtime/webhooks/eventgrid?functionName=${name}&code=${key}`;
        const liveUrl = url.apply(u => waitUntilEndpointIsUp(this, u));

        this.subscription = new EventSubscription(name, {
            webhookEndpoint: { url: liveUrl },
            scope: scope.id,
            ...args,
        }, { ...opts, parent: this });

        this.registerOutputs();
    }
}

async function waitUntilEndpointIsUp(resource: pulumi.Resource, url: string): Promise<string> {
    if (pulumi.runtime.isDryRun()) {
        return url;
    }

    // Prepare a sample webhook validation call.
    const headers = { "aeg-event-type": "SubscriptionValidation" };
    const body = "[{ \"data\": { \"validationCode\": \"pulumi-create\" }, \"eventType\": \"Microsoft.EventGrid.SubscriptionValidationEvent\" }]";

    // Wait for up to 5 minutes
    for (let i = 0; i < 30; i++) {
        let status;
        try {
            const response = await fetch(url, { method: "POST", headers, body });
            if (response.ok) {
                return url;
            }
            status = `${response.status}: ${response.statusText}`;
        } catch (e) {
            status = `Error: ${e}`;
        }
        pulumi.log.info(`Waiting for Webhook ${url} to become available (${status}, ${i})`, resource);
        // Wait for 10s between polls
        await new Promise(r => setTimeout(r, 10000));
    }

    throw new Error("timed out waiting for Webhook to become up");
}

export interface StorageAccountEventGridCallbackSubscriptionArgs<T> extends EventGridCallbackSubscriptionArgs<T> {
    /**
     * Storage Account to subscribe to. Event Grid events for this account trigger the callback execution.
     */
    readonly storageAccount: Account;
}

/**
 * Possible types of Event Grid events for a Resource Group.
 */
type ResourceGroupEvent =
    eventgrid.ResourceActionCancelData |
    eventgrid.ResourceActionFailureData |
    eventgrid.ResourceActionSuccessData |
    eventgrid.ResourceDeleteCancelData |
    eventgrid.ResourceDeleteFailureData |
    eventgrid.ResourceDeleteSuccessData |
    eventgrid.ResourceWriteCancelData |
    eventgrid.ResourceWriteFailureData |
    eventgrid.ResourceWriteSuccessData;

export interface ResourceGroupEventGridCallbackSubscriptionArgs extends EventGridCallbackSubscriptionArgs<ResourceGroupEvent> {
    /**
     * Resource Group to subscribe to. Event Grid events for this resource group trigger the callback execution.
     */
    readonly resourceGroup: ResourceGroup;
}

/**
 * Contains hooks to subscribe to different kinds of Event Grid events.
 */
export namespace events {
    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * a new Blob is created in a container of the Storage Account.
     */
    export function onGridBlobCreated(name: string,
                                      args: StorageAccountEventGridCallbackSubscriptionArgs<eventgrid.StorageBlobCreatedEventData>,
                                      opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<eventgrid.StorageBlobCreatedEventData> {
        return new EventGridCallbackSubscription(
            name, args.storageAccount, { ...args, includedEventTypes: ["Microsoft.Storage.BlobCreated"] },
            { parent: args.storageAccount, ...opts });

    }

    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * a Blob is deleted from a container of the Storage Account.
     */
    export function onGridBlobDeleted(name: string,
                                      args: StorageAccountEventGridCallbackSubscriptionArgs<eventgrid.StorageBlobDeletedEventData>,
                                      opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<eventgrid.StorageBlobDeletedEventData> {
        return new EventGridCallbackSubscription(
            name, args.storageAccount, { ...args, includedEventTypes: ["Microsoft.Storage.BlobDeleted"] },
            { parent: args.storageAccount, ...opts });
    }

    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * an event associated with the Resource Group fires.
     */
    export function onResourceGroupEvent(name: string,
                                         args: ResourceGroupEventGridCallbackSubscriptionArgs,
                                         opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<ResourceGroupEvent> {
        return new EventGridCallbackSubscription(
            name, { id: args.resourceGroup.id, resourceGroupName: args.resourceGroup.name },
            args, { parent: args.resourceGroup, ...opts });
    };
}
