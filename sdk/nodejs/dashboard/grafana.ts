// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a Dashboard Grafana.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleGrafana = new azure.dashboard.Grafana("exampleGrafana", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: "West Europe",
 *     apiKeyEnabled: true,
 *     deterministicOutboundIpEnabled: true,
 *     publicNetworkAccessEnabled: false,
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 *     tags: {
 *         key: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Dashboard Grafana can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:dashboard/grafana:Grafana example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Dashboard/grafana/workspace1
 * ```
 */
export class Grafana extends pulumi.CustomResource {
    /**
     * Get an existing Grafana resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrafanaState, opts?: pulumi.CustomResourceOptions): Grafana {
        return new Grafana(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:dashboard/grafana:Grafana';

    /**
     * Returns true if the given object is an instance of Grafana.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Grafana {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Grafana.__pulumiType;
    }

    /**
     * Whether to enable the api key setting of the Grafana instance. Defaults to `false`.
     */
    public readonly apiKeyEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Scope for dns deterministic name hash calculation. The only possible value is `TenantReuse`. Defaults to `TenantReuse`.
     */
    public readonly autoGeneratedDomainNameLabelScope!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the Grafana instance to use deterministic outbound IPs. Defaults to `false`.
     */
    public readonly deterministicOutboundIpEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The endpoint of the Grafana instance.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The Grafana software version.
     */
    public /*out*/ readonly grafanaVersion!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly identity!: pulumi.Output<outputs.dashboard.GrafanaIdentity | undefined>;
    /**
     * Specifies the Azure Region where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this Dashboard Grafana. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of outbound IPs if deterministicOutboundIP is enabled.
     */
    public /*out*/ readonly outboundIps!: pulumi.Output<string[]>;
    /**
     * Whether to enable traffic over the public interface. Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the Resource Group where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The name of the SKU used for the Grafana instance. The only possible value is `Standard`. Defaults to `Standard`. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly sku!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags which should be assigned to the Dashboard Grafana.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Whether to enable the zone redundancy setting of the Grafana instance. Defaults to `false`. Changing this forces a new Dashboard Grafana to be created.
     */
    public readonly zoneRedundancyEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Grafana resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrafanaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrafanaArgs | GrafanaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrafanaState | undefined;
            resourceInputs["apiKeyEnabled"] = state ? state.apiKeyEnabled : undefined;
            resourceInputs["autoGeneratedDomainNameLabelScope"] = state ? state.autoGeneratedDomainNameLabelScope : undefined;
            resourceInputs["deterministicOutboundIpEnabled"] = state ? state.deterministicOutboundIpEnabled : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["grafanaVersion"] = state ? state.grafanaVersion : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outboundIps"] = state ? state.outboundIps : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zoneRedundancyEnabled"] = state ? state.zoneRedundancyEnabled : undefined;
        } else {
            const args = argsOrState as GrafanaArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["apiKeyEnabled"] = args ? args.apiKeyEnabled : undefined;
            resourceInputs["autoGeneratedDomainNameLabelScope"] = args ? args.autoGeneratedDomainNameLabelScope : undefined;
            resourceInputs["deterministicOutboundIpEnabled"] = args ? args.deterministicOutboundIpEnabled : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zoneRedundancyEnabled"] = args ? args.zoneRedundancyEnabled : undefined;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["grafanaVersion"] = undefined /*out*/;
            resourceInputs["outboundIps"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Grafana.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Grafana resources.
 */
export interface GrafanaState {
    /**
     * Whether to enable the api key setting of the Grafana instance. Defaults to `false`.
     */
    apiKeyEnabled?: pulumi.Input<boolean>;
    /**
     * Scope for dns deterministic name hash calculation. The only possible value is `TenantReuse`. Defaults to `TenantReuse`.
     */
    autoGeneratedDomainNameLabelScope?: pulumi.Input<string>;
    /**
     * Whether to enable the Grafana instance to use deterministic outbound IPs. Defaults to `false`.
     */
    deterministicOutboundIpEnabled?: pulumi.Input<boolean>;
    /**
     * The endpoint of the Grafana instance.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The Grafana software version.
     */
    grafanaVersion?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     */
    identity?: pulumi.Input<inputs.dashboard.GrafanaIdentity>;
    /**
     * Specifies the Azure Region where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Dashboard Grafana. Changing this forces a new Dashboard Grafana to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * List of outbound IPs if deterministicOutboundIP is enabled.
     */
    outboundIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to enable traffic over the public interface. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Resource Group where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The name of the SKU used for the Grafana instance. The only possible value is `Standard`. Defaults to `Standard`. Changing this forces a new Dashboard Grafana to be created.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dashboard Grafana.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to enable the zone redundancy setting of the Grafana instance. Defaults to `false`. Changing this forces a new Dashboard Grafana to be created.
     */
    zoneRedundancyEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Grafana resource.
 */
export interface GrafanaArgs {
    /**
     * Whether to enable the api key setting of the Grafana instance. Defaults to `false`.
     */
    apiKeyEnabled?: pulumi.Input<boolean>;
    /**
     * Scope for dns deterministic name hash calculation. The only possible value is `TenantReuse`. Defaults to `TenantReuse`.
     */
    autoGeneratedDomainNameLabelScope?: pulumi.Input<string>;
    /**
     * Whether to enable the Grafana instance to use deterministic outbound IPs. Defaults to `false`.
     */
    deterministicOutboundIpEnabled?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     */
    identity?: pulumi.Input<inputs.dashboard.GrafanaIdentity>;
    /**
     * Specifies the Azure Region where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Dashboard Grafana. Changing this forces a new Dashboard Grafana to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to enable traffic over the public interface. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Resource Group where the Dashboard Grafana should exist. Changing this forces a new Dashboard Grafana to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The name of the SKU used for the Grafana instance. The only possible value is `Standard`. Defaults to `Standard`. Changing this forces a new Dashboard Grafana to be created.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dashboard Grafana.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to enable the zone redundancy setting of the Grafana instance. Defaults to `false`. Changing this forces a new Dashboard Grafana to be created.
     */
    zoneRedundancyEnabled?: pulumi.Input<boolean>;
}