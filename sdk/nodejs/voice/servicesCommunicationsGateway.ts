// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Voice Services Communications Gateways.
 *
 * !> **NOTE:** You must have signed an Operator Connect agreement with Microsoft to use this resource. For more information, see [`Prerequisites`](https://learn.microsoft.com/en-us/azure/communications-gateway/prepare-to-deploy#prerequisites).
 *
 * !> **NOTE:** Access to Azure Communications Gateway is restricted, see [`Get access to Azure Communications Gateway for your Azure subscription`](https://learn.microsoft.com/en-us/azure/communications-gateway/prepare-to-deploy#9-get-access-to-azure-communications-gateway-for-your-azure-subscription) for details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleServicesCommunicationsGateway = new azure.voice.ServicesCommunicationsGateway("exampleServicesCommunicationsGateway", {
 *     location: "West Europe",
 *     resourceGroupName: exampleResourceGroup.name,
 *     connectivity: "PublicAddress",
 *     codecs: "PCMA",
 *     e911Type: "DirectToEsrp",
 *     platforms: [
 *         "OperatorConnect",
 *         "TeamsPhoneMobile",
 *     ],
 *     serviceLocations: [
 *         {
 *             location: "eastus",
 *             allowedMediaSourceAddressPrefixes: ["10.1.2.0/24"],
 *             allowedSignalingSourceAddressPrefixes: ["10.1.1.0/24"],
 *             esrpAddresses: ["198.51.100.3"],
 *             operatorAddresses: ["198.51.100.1"],
 *         },
 *         {
 *             location: "eastus2",
 *             allowedMediaSourceAddressPrefixes: ["10.2.2.0/24"],
 *             allowedSignalingSourceAddressPrefixes: ["10.2.1.0/24"],
 *             esrpAddresses: ["198.51.100.4"],
 *             operatorAddresses: ["198.51.100.2"],
 *         },
 *     ],
 *     autoGeneratedDomainNameLabelScope: "SubscriptionReuse",
 *     apiBridge: JSON.stringify({}),
 *     emergencyDialStrings: [
 *         "911",
 *         "933",
 *     ],
 *     onPremMcpEnabled: false,
 *     tags: {
 *         key: "value",
 *     },
 *     microsoftTeamsVoicemailPilotNumber: "1",
 * });
 * ```
 *
 * ## Import
 *
 * Voice Services Communications Gateways can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:voice/servicesCommunicationsGateway:ServicesCommunicationsGateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.VoiceServices/communicationsGateways/communicationsGateway1
 * ```
 */
export class ServicesCommunicationsGateway extends pulumi.CustomResource {
    /**
     * Get an existing ServicesCommunicationsGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicesCommunicationsGatewayState, opts?: pulumi.CustomResourceOptions): ServicesCommunicationsGateway {
        return new ServicesCommunicationsGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:voice/servicesCommunicationsGateway:ServicesCommunicationsGateway';

    /**
     * Returns true if the given object is an instance of ServicesCommunicationsGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicesCommunicationsGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicesCommunicationsGateway.__pulumiType;
    }

    /**
     * Details of API bridge functionality, if required.
     */
    public readonly apiBridge!: pulumi.Output<string | undefined>;
    /**
     * Specifies the scope at which the auto-generated domain name can be re-used. Possible values are `TenantReuse`, `SubscriptionReuse`, `ResourceGroupReuse` and `NoReuse` . Changing this forces a new resource to be created.
     */
    public readonly autoGeneratedDomainNameLabelScope!: pulumi.Output<string | undefined>;
    /**
     * The voice codecs expected for communication with Teams. Possible values are `PCMA`, `PCMU`,`G722`,`G722_2`,`SILK_8` and `SILK_16`.
     */
    public readonly codecs!: pulumi.Output<string>;
    /**
     * How to connect back to the operator network, e.g. MAPS. Possible values is `PublicAddress`. Changing this forces a new Voice Services Communications Gateways to be created.
     */
    public readonly connectivity!: pulumi.Output<string>;
    /**
     * How to handle 911 calls. Possible values are `Standard` and `DirectToEsrp`.
     */
    public readonly e911Type!: pulumi.Output<string>;
    /**
     * A list of dial strings used for emergency calling.
     */
    public readonly emergencyDialStrings!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the Azure Region where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * This number is used in Teams Phone Mobile scenarios for access to the voicemail IVR from the native dialer.
     * ---
     */
    public readonly microsoftTeamsVoicemailPilotNumber!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name which should be used for this Voice Services Communications Gateways. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether an on-premises Mobile Control Point is in use.
     */
    public readonly onPremMcpEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Voice Services Communications GatewaysAvailable supports platform types. Possible values are `OperatorConnect`, `TeamsPhoneMobile`.
     */
    public readonly platforms!: pulumi.Output<string[]>;
    /**
     * Specifies the name of the Resource Group where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `serviceLocation` block as defined below.
     */
    public readonly serviceLocations!: pulumi.Output<outputs.voice.ServicesCommunicationsGatewayServiceLocation[]>;
    /**
     * A mapping of tags which should be assigned to the Voice Services Communications Gateways.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a ServicesCommunicationsGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicesCommunicationsGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicesCommunicationsGatewayArgs | ServicesCommunicationsGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicesCommunicationsGatewayState | undefined;
            resourceInputs["apiBridge"] = state ? state.apiBridge : undefined;
            resourceInputs["autoGeneratedDomainNameLabelScope"] = state ? state.autoGeneratedDomainNameLabelScope : undefined;
            resourceInputs["codecs"] = state ? state.codecs : undefined;
            resourceInputs["connectivity"] = state ? state.connectivity : undefined;
            resourceInputs["e911Type"] = state ? state.e911Type : undefined;
            resourceInputs["emergencyDialStrings"] = state ? state.emergencyDialStrings : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["microsoftTeamsVoicemailPilotNumber"] = state ? state.microsoftTeamsVoicemailPilotNumber : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["onPremMcpEnabled"] = state ? state.onPremMcpEnabled : undefined;
            resourceInputs["platforms"] = state ? state.platforms : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serviceLocations"] = state ? state.serviceLocations : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ServicesCommunicationsGatewayArgs | undefined;
            if ((!args || args.codecs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'codecs'");
            }
            if ((!args || args.connectivity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectivity'");
            }
            if ((!args || args.e911Type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'e911Type'");
            }
            if ((!args || args.platforms === undefined) && !opts.urn) {
                throw new Error("Missing required property 'platforms'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serviceLocations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceLocations'");
            }
            resourceInputs["apiBridge"] = args ? args.apiBridge : undefined;
            resourceInputs["autoGeneratedDomainNameLabelScope"] = args ? args.autoGeneratedDomainNameLabelScope : undefined;
            resourceInputs["codecs"] = args ? args.codecs : undefined;
            resourceInputs["connectivity"] = args ? args.connectivity : undefined;
            resourceInputs["e911Type"] = args ? args.e911Type : undefined;
            resourceInputs["emergencyDialStrings"] = args ? args.emergencyDialStrings : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["microsoftTeamsVoicemailPilotNumber"] = args ? args.microsoftTeamsVoicemailPilotNumber : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["onPremMcpEnabled"] = args ? args.onPremMcpEnabled : undefined;
            resourceInputs["platforms"] = args ? args.platforms : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serviceLocations"] = args ? args.serviceLocations : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicesCommunicationsGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicesCommunicationsGateway resources.
 */
export interface ServicesCommunicationsGatewayState {
    /**
     * Details of API bridge functionality, if required.
     */
    apiBridge?: pulumi.Input<string>;
    /**
     * Specifies the scope at which the auto-generated domain name can be re-used. Possible values are `TenantReuse`, `SubscriptionReuse`, `ResourceGroupReuse` and `NoReuse` . Changing this forces a new resource to be created.
     */
    autoGeneratedDomainNameLabelScope?: pulumi.Input<string>;
    /**
     * The voice codecs expected for communication with Teams. Possible values are `PCMA`, `PCMU`,`G722`,`G722_2`,`SILK_8` and `SILK_16`.
     */
    codecs?: pulumi.Input<string>;
    /**
     * How to connect back to the operator network, e.g. MAPS. Possible values is `PublicAddress`. Changing this forces a new Voice Services Communications Gateways to be created.
     */
    connectivity?: pulumi.Input<string>;
    /**
     * How to handle 911 calls. Possible values are `Standard` and `DirectToEsrp`.
     */
    e911Type?: pulumi.Input<string>;
    /**
     * A list of dial strings used for emergency calling.
     */
    emergencyDialStrings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the Azure Region where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * This number is used in Teams Phone Mobile scenarios for access to the voicemail IVR from the native dialer.
     * ---
     */
    microsoftTeamsVoicemailPilotNumber?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Voice Services Communications Gateways. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether an on-premises Mobile Control Point is in use.
     */
    onPremMcpEnabled?: pulumi.Input<boolean>;
    /**
     * The Voice Services Communications GatewaysAvailable supports platform types. Possible values are `OperatorConnect`, `TeamsPhoneMobile`.
     */
    platforms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the Resource Group where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `serviceLocation` block as defined below.
     */
    serviceLocations?: pulumi.Input<pulumi.Input<inputs.voice.ServicesCommunicationsGatewayServiceLocation>[]>;
    /**
     * A mapping of tags which should be assigned to the Voice Services Communications Gateways.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ServicesCommunicationsGateway resource.
 */
export interface ServicesCommunicationsGatewayArgs {
    /**
     * Details of API bridge functionality, if required.
     */
    apiBridge?: pulumi.Input<string>;
    /**
     * Specifies the scope at which the auto-generated domain name can be re-used. Possible values are `TenantReuse`, `SubscriptionReuse`, `ResourceGroupReuse` and `NoReuse` . Changing this forces a new resource to be created.
     */
    autoGeneratedDomainNameLabelScope?: pulumi.Input<string>;
    /**
     * The voice codecs expected for communication with Teams. Possible values are `PCMA`, `PCMU`,`G722`,`G722_2`,`SILK_8` and `SILK_16`.
     */
    codecs: pulumi.Input<string>;
    /**
     * How to connect back to the operator network, e.g. MAPS. Possible values is `PublicAddress`. Changing this forces a new Voice Services Communications Gateways to be created.
     */
    connectivity: pulumi.Input<string>;
    /**
     * How to handle 911 calls. Possible values are `Standard` and `DirectToEsrp`.
     */
    e911Type: pulumi.Input<string>;
    /**
     * A list of dial strings used for emergency calling.
     */
    emergencyDialStrings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the Azure Region where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * This number is used in Teams Phone Mobile scenarios for access to the voicemail IVR from the native dialer.
     * ---
     */
    microsoftTeamsVoicemailPilotNumber?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Voice Services Communications Gateways. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether an on-premises Mobile Control Point is in use.
     */
    onPremMcpEnabled?: pulumi.Input<boolean>;
    /**
     * The Voice Services Communications GatewaysAvailable supports platform types. Possible values are `OperatorConnect`, `TeamsPhoneMobile`.
     */
    platforms: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the Resource Group where the Voice Services Communications Gateways should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `serviceLocation` block as defined below.
     */
    serviceLocations: pulumi.Input<pulumi.Input<inputs.voice.ServicesCommunicationsGatewayServiceLocation>[]>;
    /**
     * A mapping of tags which should be assigned to the Voice Services Communications Gateways.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}