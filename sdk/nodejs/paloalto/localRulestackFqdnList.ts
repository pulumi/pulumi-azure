// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Palo Alto Local Rulestack FQDN List.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "rg-example",
 *     location: "West Europe",
 * });
 * const exampleLocalRulestack = new azure.paloalto.LocalRulestack("example", {
 *     name: "example",
 *     resourceGroupName: exampleAzurermResrouceGroup.name,
 *     location: example.location,
 * });
 * const exampleLocalRulestackFqdnList = new azure.paloalto.LocalRulestackFqdnList("example", {
 *     name: "example",
 *     rulestackId: exampleLocalRulestack.id,
 *     fullyQualifiedDomainNames: ["contoso.com"],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `PaloAltoNetworks.Cloudngfw`: 2022-08-29
 *
 * ## Import
 *
 * Palo Alto Local Rulestack FQDN Lists can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:paloalto/localRulestackFqdnList:LocalRulestackFqdnList example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/localRulestacks/myLocalRulestack/fqdnLists/myFQDNList1
 * ```
 */
export class LocalRulestackFqdnList extends pulumi.CustomResource {
    /**
     * Get an existing LocalRulestackFqdnList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LocalRulestackFqdnListState, opts?: pulumi.CustomResourceOptions): LocalRulestackFqdnList {
        return new LocalRulestackFqdnList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:paloalto/localRulestackFqdnList:LocalRulestackFqdnList';

    /**
     * Returns true if the given object is an instance of LocalRulestackFqdnList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LocalRulestackFqdnList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LocalRulestackFqdnList.__pulumiType;
    }

    /**
     * The comment for Audit purposes.
     */
    public readonly auditComment!: pulumi.Output<string | undefined>;
    /**
     * The description for the FQDN List.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies a list of Fully Qualified Domain Names.
     */
    public readonly fullyQualifiedDomainNames!: pulumi.Output<string[]>;
    /**
     * The name which should be used for this Palo Alto Local Rulestack FQDN List.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
     */
    public readonly rulestackId!: pulumi.Output<string>;

    /**
     * Create a LocalRulestackFqdnList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LocalRulestackFqdnListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LocalRulestackFqdnListArgs | LocalRulestackFqdnListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LocalRulestackFqdnListState | undefined;
            resourceInputs["auditComment"] = state ? state.auditComment : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fullyQualifiedDomainNames"] = state ? state.fullyQualifiedDomainNames : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rulestackId"] = state ? state.rulestackId : undefined;
        } else {
            const args = argsOrState as LocalRulestackFqdnListArgs | undefined;
            if ((!args || args.fullyQualifiedDomainNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fullyQualifiedDomainNames'");
            }
            if ((!args || args.rulestackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulestackId'");
            }
            resourceInputs["auditComment"] = args ? args.auditComment : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fullyQualifiedDomainNames"] = args ? args.fullyQualifiedDomainNames : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rulestackId"] = args ? args.rulestackId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LocalRulestackFqdnList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LocalRulestackFqdnList resources.
 */
export interface LocalRulestackFqdnListState {
    /**
     * The comment for Audit purposes.
     */
    auditComment?: pulumi.Input<string>;
    /**
     * The description for the FQDN List.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies a list of Fully Qualified Domain Names.
     */
    fullyQualifiedDomainNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name which should be used for this Palo Alto Local Rulestack FQDN List.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
     */
    rulestackId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LocalRulestackFqdnList resource.
 */
export interface LocalRulestackFqdnListArgs {
    /**
     * The comment for Audit purposes.
     */
    auditComment?: pulumi.Input<string>;
    /**
     * The description for the FQDN List.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies a list of Fully Qualified Domain Names.
     */
    fullyQualifiedDomainNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name which should be used for this Palo Alto Local Rulestack FQDN List.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
     */
    rulestackId: pulumi.Input<string>;
}
