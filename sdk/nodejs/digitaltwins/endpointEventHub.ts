// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Digital Twins Event Hub Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example_resources",
 *     location: "West Europe",
 * });
 * const exampleInstance = new azure.digitaltwins.Instance("example", {
 *     name: "example-DT",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * const exampleEventHubNamespace = new azure.eventhub.EventHubNamespace("example", {
 *     name: "example-eh-ns",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "Standard",
 * });
 * const exampleEventHub = new azure.eventhub.EventHub("example", {
 *     name: "example-eh",
 *     namespaceName: exampleEventHubNamespace.name,
 *     resourceGroupName: example.name,
 *     partitionCount: 2,
 *     messageRetention: 1,
 * });
 * const exampleAuthorizationRule = new azure.eventhub.AuthorizationRule("example", {
 *     name: "example-ar",
 *     namespaceName: exampleEventHubNamespace.name,
 *     eventhubName: exampleEventHub.name,
 *     resourceGroupName: example.name,
 *     listen: false,
 *     send: true,
 *     manage: false,
 * });
 * const exampleEndpointEventHub = new azure.digitaltwins.EndpointEventHub("example", {
 *     name: "example-EH",
 *     digitalTwinsId: exampleInstance.id,
 *     eventhubPrimaryConnectionString: exampleAuthorizationRule.primaryConnectionString,
 *     eventhubSecondaryConnectionString: exampleAuthorizationRule.secondaryConnectionString,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DigitalTwins`: 2023-01-31
 *
 * ## Import
 *
 * Digital Twins Eventhub Endpoints can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:digitaltwins/endpointEventHub:EndpointEventHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1/endpoints/ep1
 * ```
 */
export class EndpointEventHub extends pulumi.CustomResource {
    /**
     * Get an existing EndpointEventHub resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EndpointEventHubState, opts?: pulumi.CustomResourceOptions): EndpointEventHub {
        return new EndpointEventHub(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:digitaltwins/endpointEventHub:EndpointEventHub';

    /**
     * Returns true if the given object is an instance of EndpointEventHub.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EndpointEventHub {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EndpointEventHub.__pulumiType;
    }

    /**
     * The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     */
    public readonly deadLetterStorageSecret!: pulumi.Output<string | undefined>;
    /**
     * The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    public readonly digitalTwinsId!: pulumi.Output<string>;
    /**
     * The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    public readonly eventhubPrimaryConnectionString!: pulumi.Output<string>;
    /**
     * The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    public readonly eventhubSecondaryConnectionString!: pulumi.Output<string>;
    /**
     * The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a EndpointEventHub resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EndpointEventHubArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EndpointEventHubArgs | EndpointEventHubState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EndpointEventHubState | undefined;
            resourceInputs["deadLetterStorageSecret"] = state ? state.deadLetterStorageSecret : undefined;
            resourceInputs["digitalTwinsId"] = state ? state.digitalTwinsId : undefined;
            resourceInputs["eventhubPrimaryConnectionString"] = state ? state.eventhubPrimaryConnectionString : undefined;
            resourceInputs["eventhubSecondaryConnectionString"] = state ? state.eventhubSecondaryConnectionString : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as EndpointEventHubArgs | undefined;
            if ((!args || args.digitalTwinsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'digitalTwinsId'");
            }
            if ((!args || args.eventhubPrimaryConnectionString === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventhubPrimaryConnectionString'");
            }
            if ((!args || args.eventhubSecondaryConnectionString === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventhubSecondaryConnectionString'");
            }
            resourceInputs["deadLetterStorageSecret"] = args?.deadLetterStorageSecret ? pulumi.secret(args.deadLetterStorageSecret) : undefined;
            resourceInputs["digitalTwinsId"] = args ? args.digitalTwinsId : undefined;
            resourceInputs["eventhubPrimaryConnectionString"] = args?.eventhubPrimaryConnectionString ? pulumi.secret(args.eventhubPrimaryConnectionString) : undefined;
            resourceInputs["eventhubSecondaryConnectionString"] = args?.eventhubSecondaryConnectionString ? pulumi.secret(args.eventhubSecondaryConnectionString) : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["deadLetterStorageSecret", "eventhubPrimaryConnectionString", "eventhubSecondaryConnectionString"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(EndpointEventHub.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EndpointEventHub resources.
 */
export interface EndpointEventHubState {
    /**
     * The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     */
    deadLetterStorageSecret?: pulumi.Input<string>;
    /**
     * The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    digitalTwinsId?: pulumi.Input<string>;
    /**
     * The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    eventhubPrimaryConnectionString?: pulumi.Input<string>;
    /**
     * The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    eventhubSecondaryConnectionString?: pulumi.Input<string>;
    /**
     * The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EndpointEventHub resource.
 */
export interface EndpointEventHubArgs {
    /**
     * The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     */
    deadLetterStorageSecret?: pulumi.Input<string>;
    /**
     * The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    digitalTwinsId: pulumi.Input<string>;
    /**
     * The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    eventhubPrimaryConnectionString: pulumi.Input<string>;
    /**
     * The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     */
    eventhubSecondaryConnectionString: pulumi.Input<string>;
    /**
     * The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     */
    name?: pulumi.Input<string>;
}
