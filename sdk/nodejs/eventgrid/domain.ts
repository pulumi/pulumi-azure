// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an EventGrid Domain
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleDomain = new azure.eventgrid.Domain("example", {
 *     name: "my-eventgrid-domain",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.EventGrid`: 2022-06-15
 *
 * ## Import
 *
 * EventGrid Domains can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:eventgrid/domain:Domain domain1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventGrid/domains/domain1
 * ```
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:eventgrid/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * Whether to create the domain topic when the first event subscription at the scope of the domain topic is created. Defaults to `true`.
     */
    public readonly autoCreateTopicWithFirstSubscription!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to delete the domain topic when the last event subscription at the scope of the domain topic is deleted. Defaults to `true`.
     */
    public readonly autoDeleteTopicWithLastSubscription!: pulumi.Output<boolean | undefined>;
    /**
     * The Endpoint associated with the EventGrid Domain.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.eventgrid.DomainIdentity | undefined>;
    /**
     * One or more `inboundIpRule` blocks as defined below.
     */
    public readonly inboundIpRules!: pulumi.Output<outputs.eventgrid.DomainInboundIpRule[] | undefined>;
    /**
     * A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly inputMappingDefaultValues!: pulumi.Output<outputs.eventgrid.DomainInputMappingDefaultValues | undefined>;
    /**
     * A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly inputMappingFields!: pulumi.Output<outputs.eventgrid.DomainInputMappingFields | undefined>;
    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     */
    public readonly inputSchema!: pulumi.Output<string | undefined>;
    /**
     * Whether local authentication methods is enabled for the EventGrid Domain. Defaults to `true`.
     */
    public readonly localAuthEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the EventGrid Domain resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Primary Shared Access Key associated with the EventGrid Domain.
     */
    public /*out*/ readonly primaryAccessKey!: pulumi.Output<string>;
    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the resource group in which the EventGrid Domain exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The Secondary Shared Access Key associated with the EventGrid Domain.
     */
    public /*out*/ readonly secondaryAccessKey!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["autoCreateTopicWithFirstSubscription"] = state ? state.autoCreateTopicWithFirstSubscription : undefined;
            resourceInputs["autoDeleteTopicWithLastSubscription"] = state ? state.autoDeleteTopicWithLastSubscription : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["inboundIpRules"] = state ? state.inboundIpRules : undefined;
            resourceInputs["inputMappingDefaultValues"] = state ? state.inputMappingDefaultValues : undefined;
            resourceInputs["inputMappingFields"] = state ? state.inputMappingFields : undefined;
            resourceInputs["inputSchema"] = state ? state.inputSchema : undefined;
            resourceInputs["localAuthEnabled"] = state ? state.localAuthEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryAccessKey"] = state ? state.primaryAccessKey : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["secondaryAccessKey"] = state ? state.secondaryAccessKey : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["autoCreateTopicWithFirstSubscription"] = args ? args.autoCreateTopicWithFirstSubscription : undefined;
            resourceInputs["autoDeleteTopicWithLastSubscription"] = args ? args.autoDeleteTopicWithLastSubscription : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["inboundIpRules"] = args ? args.inboundIpRules : undefined;
            resourceInputs["inputMappingDefaultValues"] = args ? args.inputMappingDefaultValues : undefined;
            resourceInputs["inputMappingFields"] = args ? args.inputMappingFields : undefined;
            resourceInputs["inputSchema"] = args ? args.inputSchema : undefined;
            resourceInputs["localAuthEnabled"] = args ? args.localAuthEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["primaryAccessKey"] = undefined /*out*/;
            resourceInputs["secondaryAccessKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:eventhub/domain:Domain" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        const secretOpts = { additionalSecretOutputs: ["primaryAccessKey", "secondaryAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * Whether to create the domain topic when the first event subscription at the scope of the domain topic is created. Defaults to `true`.
     */
    autoCreateTopicWithFirstSubscription?: pulumi.Input<boolean>;
    /**
     * Whether to delete the domain topic when the last event subscription at the scope of the domain topic is deleted. Defaults to `true`.
     */
    autoDeleteTopicWithLastSubscription?: pulumi.Input<boolean>;
    /**
     * The Endpoint associated with the EventGrid Domain.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.eventgrid.DomainIdentity>;
    /**
     * One or more `inboundIpRule` blocks as defined below.
     */
    inboundIpRules?: pulumi.Input<pulumi.Input<inputs.eventgrid.DomainInboundIpRule>[]>;
    /**
     * A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     */
    inputMappingDefaultValues?: pulumi.Input<inputs.eventgrid.DomainInputMappingDefaultValues>;
    /**
     * A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     */
    inputMappingFields?: pulumi.Input<inputs.eventgrid.DomainInputMappingFields>;
    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     */
    inputSchema?: pulumi.Input<string>;
    /**
     * Whether local authentication methods is enabled for the EventGrid Domain. Defaults to `true`.
     */
    localAuthEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the EventGrid Domain resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Primary Shared Access Key associated with the EventGrid Domain.
     */
    primaryAccessKey?: pulumi.Input<string>;
    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which the EventGrid Domain exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The Secondary Shared Access Key associated with the EventGrid Domain.
     */
    secondaryAccessKey?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Whether to create the domain topic when the first event subscription at the scope of the domain topic is created. Defaults to `true`.
     */
    autoCreateTopicWithFirstSubscription?: pulumi.Input<boolean>;
    /**
     * Whether to delete the domain topic when the last event subscription at the scope of the domain topic is deleted. Defaults to `true`.
     */
    autoDeleteTopicWithLastSubscription?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.eventgrid.DomainIdentity>;
    /**
     * One or more `inboundIpRule` blocks as defined below.
     */
    inboundIpRules?: pulumi.Input<pulumi.Input<inputs.eventgrid.DomainInboundIpRule>[]>;
    /**
     * A `inputMappingDefaultValues` block as defined below. Changing this forces a new resource to be created.
     */
    inputMappingDefaultValues?: pulumi.Input<inputs.eventgrid.DomainInputMappingDefaultValues>;
    /**
     * A `inputMappingFields` block as defined below. Changing this forces a new resource to be created.
     */
    inputMappingFields?: pulumi.Input<inputs.eventgrid.DomainInputMappingFields>;
    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     */
    inputSchema?: pulumi.Input<string>;
    /**
     * Whether local authentication methods is enabled for the EventGrid Domain. Defaults to `true`.
     */
    localAuthEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the EventGrid Domain resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which the EventGrid Domain exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
