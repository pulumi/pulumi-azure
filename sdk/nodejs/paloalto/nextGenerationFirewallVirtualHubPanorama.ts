// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Palo Alto Next Generation Firewall VHub Panorama.
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
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "acceptanceTestPublicIp1",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     allocationMethod: "Static",
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const exampleVirtualWan = new azure.network.VirtualWan("example", {
 *     name: "example-virtualwan",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * const exampleVirtualHub = new azure.network.VirtualHub("example", {
 *     name: "example-virtualhub",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     virtualWanId: exampleVirtualWan.id,
 *     addressPrefix: "10.0.0.0/23",
 *     tags: {
 *         hubSaaSPreview: "true",
 *     },
 * });
 * const exampleVirtualNetworkAppliance = new azure.paloalto.VirtualNetworkAppliance("example", {
 *     name: "example-appliance",
 *     virtualHubId: exampleVirtualHub.id,
 * });
 * const exampleNextGenerationFirewallVirtualHubPanorama = new azure.paloalto.NextGenerationFirewallVirtualHubPanorama("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     networkProfile: {
 *         publicIpAddressIds: [examplePublicIp.id],
 *         virtualHubId: exampleVirtualHub.id,
 *         networkVirtualApplianceId: exampleVirtualNetworkAppliance.id,
 *     },
 *     panoramaBase64Config: "VGhpcyBpcyBub3QgYSByZWFsIGNvbmZpZywgcGxlYXNlIHVzZSB5b3VyIFBhbm9yYW1hIHNlcnZlciB0byBnZW5lcmF0ZSBhIHJlYWwgdmFsdWUgZm9yIHRoaXMgcHJvcGVydHkhCg==",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `PaloAltoNetworks.Cloudngfw`: 2023-09-01
 *
 * ## Import
 *
 * Palo Alto Next Generation Firewall VHub Panoramas can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVhubPanoramaFW
 * ```
 */
export class NextGenerationFirewallVirtualHubPanorama extends pulumi.CustomResource {
    /**
     * Get an existing NextGenerationFirewallVirtualHubPanorama resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NextGenerationFirewallVirtualHubPanoramaState, opts?: pulumi.CustomResourceOptions): NextGenerationFirewallVirtualHubPanorama {
        return new NextGenerationFirewallVirtualHubPanorama(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama';

    /**
     * Returns true if the given object is an instance of NextGenerationFirewallVirtualHubPanorama.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NextGenerationFirewallVirtualHubPanorama {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NextGenerationFirewallVirtualHubPanorama.__pulumiType;
    }

    /**
     * One or more `destinationNat` blocks as defined below.
     */
    public readonly destinationNats!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDestinationNat[] | undefined>;
    /**
     * A `dnsSettings` block as defined below.
     */
    public readonly dnsSettings!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDnsSettings | undefined>;
    /**
     * The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    public readonly marketplaceOfferId!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    public readonly networkProfile!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubPanoramaNetworkProfile>;
    /**
     * The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
     */
    public readonly panoramaBase64Config!: pulumi.Output<string>;
    public /*out*/ readonly panoramas!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubPanoramaPanorama[]>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    public readonly planId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a NextGenerationFirewallVirtualHubPanorama resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NextGenerationFirewallVirtualHubPanoramaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NextGenerationFirewallVirtualHubPanoramaArgs | NextGenerationFirewallVirtualHubPanoramaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NextGenerationFirewallVirtualHubPanoramaState | undefined;
            resourceInputs["destinationNats"] = state ? state.destinationNats : undefined;
            resourceInputs["dnsSettings"] = state ? state.dnsSettings : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["marketplaceOfferId"] = state ? state.marketplaceOfferId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkProfile"] = state ? state.networkProfile : undefined;
            resourceInputs["panoramaBase64Config"] = state ? state.panoramaBase64Config : undefined;
            resourceInputs["panoramas"] = state ? state.panoramas : undefined;
            resourceInputs["planId"] = state ? state.planId : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NextGenerationFirewallVirtualHubPanoramaArgs | undefined;
            if ((!args || args.networkProfile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkProfile'");
            }
            if ((!args || args.panoramaBase64Config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'panoramaBase64Config'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["destinationNats"] = args ? args.destinationNats : undefined;
            resourceInputs["dnsSettings"] = args ? args.dnsSettings : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["marketplaceOfferId"] = args ? args.marketplaceOfferId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkProfile"] = args ? args.networkProfile : undefined;
            resourceInputs["panoramaBase64Config"] = args ? args.panoramaBase64Config : undefined;
            resourceInputs["planId"] = args ? args.planId : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["panoramas"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NextGenerationFirewallVirtualHubPanorama.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NextGenerationFirewallVirtualHubPanorama resources.
 */
export interface NextGenerationFirewallVirtualHubPanoramaState {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDnsSettings>;
    /**
     * The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaNetworkProfile>;
    /**
     * The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
     */
    panoramaBase64Config?: pulumi.Input<string>;
    panoramas?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaPanorama>[]>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NextGenerationFirewallVirtualHubPanorama resource.
 */
export interface NextGenerationFirewallVirtualHubPanoramaArgs {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaDnsSettings>;
    /**
     * The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubPanoramaNetworkProfile>;
    /**
     * The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
     */
    panoramaBase64Config: pulumi.Input<string>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
