// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Network Gateway Nat Rule.
 *
 * ## Import
 *
 * Virtual Network Gateway Nat Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:network/virtualNetworkGatewayNatRule:VirtualNetworkGatewayNatRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/virtualNetworkGateways/gw1/natRules/rule1
 * ```
 */
export class VirtualNetworkGatewayNatRule extends pulumi.CustomResource {
    /**
     * Get an existing VirtualNetworkGatewayNatRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualNetworkGatewayNatRuleState, opts?: pulumi.CustomResourceOptions): VirtualNetworkGatewayNatRule {
        return new VirtualNetworkGatewayNatRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/virtualNetworkGatewayNatRule:VirtualNetworkGatewayNatRule';

    /**
     * Returns true if the given object is an instance of VirtualNetworkGatewayNatRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualNetworkGatewayNatRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualNetworkGatewayNatRule.__pulumiType;
    }

    /**
     * One or more `externalMapping` blocks as documented below.
     */
    public readonly externalMappings!: pulumi.Output<outputs.network.VirtualNetworkGatewayNatRuleExternalMapping[]>;
    /**
     * One or more `internalMapping` blocks as documented below.
     */
    public readonly internalMappings!: pulumi.Output<outputs.network.VirtualNetworkGatewayNatRuleInternalMapping[]>;
    /**
     * The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
     */
    public readonly ipConfigurationId!: pulumi.Output<string | undefined>;
    /**
     * The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
     */
    public readonly virtualNetworkGatewayId!: pulumi.Output<string>;

    /**
     * Create a VirtualNetworkGatewayNatRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualNetworkGatewayNatRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualNetworkGatewayNatRuleArgs | VirtualNetworkGatewayNatRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualNetworkGatewayNatRuleState | undefined;
            resourceInputs["externalMappings"] = state ? state.externalMappings : undefined;
            resourceInputs["internalMappings"] = state ? state.internalMappings : undefined;
            resourceInputs["ipConfigurationId"] = state ? state.ipConfigurationId : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["virtualNetworkGatewayId"] = state ? state.virtualNetworkGatewayId : undefined;
        } else {
            const args = argsOrState as VirtualNetworkGatewayNatRuleArgs | undefined;
            if ((!args || args.externalMappings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalMappings'");
            }
            if ((!args || args.internalMappings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internalMappings'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.virtualNetworkGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualNetworkGatewayId'");
            }
            resourceInputs["externalMappings"] = args ? args.externalMappings : undefined;
            resourceInputs["internalMappings"] = args ? args.internalMappings : undefined;
            resourceInputs["ipConfigurationId"] = args ? args.ipConfigurationId : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["virtualNetworkGatewayId"] = args ? args.virtualNetworkGatewayId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualNetworkGatewayNatRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualNetworkGatewayNatRule resources.
 */
export interface VirtualNetworkGatewayNatRuleState {
    /**
     * One or more `externalMapping` blocks as documented below.
     */
    externalMappings?: pulumi.Input<pulumi.Input<inputs.network.VirtualNetworkGatewayNatRuleExternalMapping>[]>;
    /**
     * One or more `internalMapping` blocks as documented below.
     */
    internalMappings?: pulumi.Input<pulumi.Input<inputs.network.VirtualNetworkGatewayNatRuleInternalMapping>[]>;
    /**
     * The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
     */
    ipConfigurationId?: pulumi.Input<string>;
    /**
     * The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     */
    mode?: pulumi.Input<string>;
    /**
     * The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
     */
    virtualNetworkGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualNetworkGatewayNatRule resource.
 */
export interface VirtualNetworkGatewayNatRuleArgs {
    /**
     * One or more `externalMapping` blocks as documented below.
     */
    externalMappings: pulumi.Input<pulumi.Input<inputs.network.VirtualNetworkGatewayNatRuleExternalMapping>[]>;
    /**
     * One or more `internalMapping` blocks as documented below.
     */
    internalMappings: pulumi.Input<pulumi.Input<inputs.network.VirtualNetworkGatewayNatRuleInternalMapping>[]>;
    /**
     * The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
     */
    ipConfigurationId?: pulumi.Input<string>;
    /**
     * The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     */
    mode?: pulumi.Input<string>;
    /**
     * The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
     */
    virtualNetworkGatewayId: pulumi.Input<string>;
}