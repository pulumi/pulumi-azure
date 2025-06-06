// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resource-group",
 *     location: "westeurope",
 * });
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "example-public-ip",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     allocationMethod: "Static",
 *     sku: "Standard",
 * });
 * const exampleNetworkSecurityGroup = new azure.network.NetworkSecurityGroup("example", {
 *     name: "example-nsg",
 *     location: test.location,
 *     resourceGroupName: test.name,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vnet",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const trust = new azure.network.Subnet("trust", {
 *     name: "example-trust-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.1.0/24"],
 *     delegations: [{
 *         name: "trusted",
 *         serviceDelegation: {
 *             name: "PaloAltoNetworks.Cloudngfw/firewalls",
 *             actions: ["Microsoft.Network/virtualNetworks/subnets/join/action"],
 *         },
 *     }],
 * });
 * const trustSubnetNetworkSecurityGroupAssociation = new azure.network.SubnetNetworkSecurityGroupAssociation("trust", {
 *     subnetId: trust.id,
 *     networkSecurityGroupId: exampleNetworkSecurityGroup.id,
 * });
 * const untrust = new azure.network.Subnet("untrust", {
 *     name: "example-untrust-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 *     delegations: [{
 *         name: "untrusted",
 *         serviceDelegation: {
 *             name: "PaloAltoNetworks.Cloudngfw/firewalls",
 *             actions: ["Microsoft.Network/virtualNetworks/subnets/join/action"],
 *         },
 *     }],
 * });
 * const untrustSubnetNetworkSecurityGroupAssociation = new azure.network.SubnetNetworkSecurityGroupAssociation("untrust", {
 *     subnetId: untrust.id,
 *     networkSecurityGroupId: exampleNetworkSecurityGroup.id,
 * });
 * const exampleLocalRulestack = new azure.paloalto.LocalRulestack("example", {
 *     name: "example-rulestack",
 *     resourceGroupName: example.name,
 *     location: example.locatio,
 * });
 * const exampleLocalRulestackRule = new azure.paloalto.LocalRulestackRule("example", {
 *     name: "example-rulestack-rule",
 *     rulestackId: exampleLocalRulestack.id,
 *     priority: 1001,
 *     action: "Allow",
 *     applications: ["any"],
 *     destination: {
 *         cidrs: ["any"],
 *     },
 *     source: {
 *         cidrs: ["any"],
 *     },
 * });
 * const exampleNextGenerationFirewallVirtualNetworkLocalRulestack = new azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestack("example", {
 *     name: "example-ngfwvn",
 *     resourceGroupName: example.name,
 *     rulestackId: exampleLocalRulestack.id,
 *     networkProfile: {
 *         publicIpAddressIds: [examplePublicIp.id],
 *         vnetConfiguration: {
 *             virtualNetworkId: exampleVirtualNetwork.id,
 *             trustedSubnetId: trust.id,
 *             untrustedSubnetId: untrust.id,
 *         },
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
 * Palo Alto Next Generation Firewall Virtual Network Local Rulestacks can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetRulestackFW
 * ```
 */
export class NextGenerationFirewallVirtualNetworkLocalRulestack extends pulumi.CustomResource {
    /**
     * Get an existing NextGenerationFirewallVirtualNetworkLocalRulestack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NextGenerationFirewallVirtualNetworkLocalRulestackState, opts?: pulumi.CustomResourceOptions): NextGenerationFirewallVirtualNetworkLocalRulestack {
        return new NextGenerationFirewallVirtualNetworkLocalRulestack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack';

    /**
     * Returns true if the given object is an instance of NextGenerationFirewallVirtualNetworkLocalRulestack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NextGenerationFirewallVirtualNetworkLocalRulestack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NextGenerationFirewallVirtualNetworkLocalRulestack.__pulumiType;
    }

    /**
     * One or more `destinationNat` blocks as defined below.
     */
    public readonly destinationNats!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat[] | undefined>;
    /**
     * A `dnsSettings` block as defined below.
     */
    public readonly dnsSettings!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings | undefined>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    public readonly marketplaceOfferId!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    public readonly networkProfile!: pulumi.Output<outputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    public readonly planId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    public readonly rulestackId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a NextGenerationFirewallVirtualNetworkLocalRulestack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NextGenerationFirewallVirtualNetworkLocalRulestackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NextGenerationFirewallVirtualNetworkLocalRulestackArgs | NextGenerationFirewallVirtualNetworkLocalRulestackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NextGenerationFirewallVirtualNetworkLocalRulestackState | undefined;
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
            const args = argsOrState as NextGenerationFirewallVirtualNetworkLocalRulestackArgs | undefined;
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
        super(NextGenerationFirewallVirtualNetworkLocalRulestack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NextGenerationFirewallVirtualNetworkLocalRulestack resources.
 */
export interface NextGenerationFirewallVirtualNetworkLocalRulestackState {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    rulestackId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NextGenerationFirewallVirtualNetworkLocalRulestack resource.
 */
export interface NextGenerationFirewallVirtualNetworkLocalRulestackArgs {
    /**
     * One or more `destinationNat` blocks as defined below.
     */
    destinationNats?: pulumi.Input<pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>[]>;
    /**
     * A `dnsSettings` block as defined below.
     */
    dnsSettings?: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings>;
    /**
     * The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
     */
    marketplaceOfferId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkProfile` block as defined below.
     */
    networkProfile: pulumi.Input<inputs.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile>;
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     *
     * > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     */
    rulestackId: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
