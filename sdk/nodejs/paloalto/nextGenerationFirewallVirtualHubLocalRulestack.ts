// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Palo Alto Next Generation Firewall VHub Local Rulestack.
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
 * const exampleNextGenerationFirewallVirtualHubLocalRulestack = new azure.paloalto.NextGenerationFirewallVirtualHubLocalRulestack("example", {
 *     name: "example-ngfwvn",
 *     resourceGroupName: example.name,
 *     rulestackId: exampleAzurermPaloAltoLocalRulestack.id,
 *     networkProfile: {
 *         publicIpAddressIds: [examplePublicIp.id],
 *         virtualHubId: exampleVirtualHub.id,
 *         networkVirtualApplianceId: exampleVirtualNetworkAppliance.id,
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `PaloAltoNetworks.Cloudngfw`: 2023-09-01, 2022-08-29
 *
 * ## Import
 *
 * Palo Alto Next Generation Firewall VHub Local Rulestacks can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVhubRulestackFW
 * ```
 */
export class NextGenerationFirewallVirtualHubLocalRulestack extends pulumi.CustomResource {
    /**
     * Get an existing NextGenerationFirewallVirtualHubLocalRulestack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NextGenerationFirewallVirtualHubLocalRulestackState, opts?: pulumi.CustomResourceOptions): NextGenerationFirewallVirtualHubLocalRulestack {
        return new NextGenerationFirewallVirtualHubLocalRulestack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack';

    /**
     * Returns true if the given object is an instance of NextGenerationFirewallVirtualHubLocalRulestack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NextGenerationFirewallVirtualHubLocalRulestack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NextGenerationFirewallVirtualHubLocalRulestack.__pulumiType;
    }

    /**
     * One or more `destinationNat` blocks as defined below.
     */
    public readonly destinationNats!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDestinationNat[] | undefined>;
    /**
     * A `dnsSettings` block as defined below.
     */
    public readonly dnsSettings!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDnsSettings | undefined>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    public readonly marketplaceOfferId!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    public readonly networkProfile!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    public readonly planId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the Local Rulestack to be used for this Next Generation Firewall.
     */
    public readonly rulestackId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a NextGenerationFirewallVirtualHubLocalRulestack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NextGenerationFirewallVirtualHubLocalRulestackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NextGenerationFirewallVirtualHubLocalRulestackArgs | NextGenerationFirewallVirtualHubLocalRulestackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NextGenerationFirewallVirtualHubLocalRulestackState | undefined;
            resourceInputs["destinationNats"] = state ? state.destinationNats : undefined;
            resourceInputs["dnsSettings"] = state ? state.dnsSettings : undefined;
            resourceInputs["marketplaceOfferId"] = state ? state.marketplaceOfferId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkProfile"] = state ? state.networkProfile : undefined;
            resourceInputs["planId"] = state ? state.planId : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["rulestackId"] = state ? state.rulestackId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NextGenerationFirewallVirtualHubLocalRulestackArgs | undefined;
            if ((!args || args.networkProfile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkProfile'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.rulestackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulestackId'");
            }
            resourceInputs["destinationNats"] = args ? args.destinationNats : undefined;
            resourceInputs["dnsSettings"] = args ? args.dnsSettings : undefined;
            resourceInputs["marketplaceOfferId"] = args ? args.marketplaceOfferId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkProfile"] = args ? args.networkProfile : undefined;
            resourceInputs["planId"] = args ? args.planId : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["rulestackId"] = args ? args.rulestackId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NextGenerationFirewallVirtualHubLocalRulestack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NextGenerationFirewallVirtualHubLocalRulestack resources.
 */
export interface NextGenerationFirewallVirtualHubLocalRulestackState {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDnsSettings>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack to be used for this Next Generation Firewall.
     */
    rulestackId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NextGenerationFirewallVirtualHubLocalRulestack resource.
 */
export interface NextGenerationFirewallVirtualHubLocalRulestackArgs {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackDnsSettings>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack to be used for this Next Generation Firewall.
     */
    rulestackId: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
