// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Logic App Integration Account Agreement.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as std from "@pulumi/std";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const test = new azure.logicapps.IntegrationAccount("test", {
 *     name: "example-ia",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "Standard",
 * });
 * const host = new azure.logicapps.IntegrationAccountPartner("host", {
 *     name: "example-hostpartner",
 *     resourceGroupName: example.name,
 *     integrationAccountName: test.name,
 *     businessIdentities: [{
 *         qualifier: "AS2Identity",
 *         value: "FabrikamNY",
 *     }],
 * });
 * const guest = new azure.logicapps.IntegrationAccountPartner("guest", {
 *     name: "example-guestpartner",
 *     resourceGroupName: example.name,
 *     integrationAccountName: test.name,
 *     businessIdentities: [{
 *         qualifier: "AS2Identity",
 *         value: "FabrikamDC",
 *     }],
 * });
 * const testIntegrationAccountAgreement = new azure.logicapps.IntegrationAccountAgreement("test", {
 *     name: "example-agreement",
 *     resourceGroupName: example.name,
 *     integrationAccountName: test.name,
 *     agreementType: "AS2",
 *     hostPartnerName: host.name,
 *     guestPartnerName: guest.name,
 *     content: std.file({
 *         input: "testdata/integration_account_agreement_content_as2.json",
 *     }).then(invoke => invoke.result),
 *     hostIdentity: {
 *         qualifier: "AS2Identity",
 *         value: "FabrikamNY",
 *     },
 *     guestIdentity: {
 *         qualifier: "AS2Identity",
 *         value: "FabrikamDC",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Logic`: 2019-05-01
 *
 * ## Import
 *
 * Logic App Integration Account Agreements can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:logicapps/integrationAccountAgreement:IntegrationAccountAgreement example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1/agreements/agreement1
 * ```
 */
export class IntegrationAccountAgreement extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationAccountAgreement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationAccountAgreementState, opts?: pulumi.CustomResourceOptions): IntegrationAccountAgreement {
        return new IntegrationAccountAgreement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:logicapps/integrationAccountAgreement:IntegrationAccountAgreement';

    /**
     * Returns true if the given object is an instance of IntegrationAccountAgreement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationAccountAgreement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationAccountAgreement.__pulumiType;
    }

    /**
     * The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
     */
    public readonly agreementType!: pulumi.Output<string>;
    /**
     * The content of the Logic App Integration Account Agreement.
     */
    public readonly content!: pulumi.Output<string>;
    /**
     * A `guestIdentity` block as documented below.
     */
    public readonly guestIdentity!: pulumi.Output<outputs.logicapps.IntegrationAccountAgreementGuestIdentity>;
    /**
     * The name of the guest Logic App Integration Account Partner.
     */
    public readonly guestPartnerName!: pulumi.Output<string>;
    /**
     * A `hostIdentity` block as documented below.
     */
    public readonly hostIdentity!: pulumi.Output<outputs.logicapps.IntegrationAccountAgreementHostIdentity>;
    /**
     * The name of the host Logic App Integration Account Partner.
     */
    public readonly hostPartnerName!: pulumi.Output<string>;
    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     */
    public readonly integrationAccountName!: pulumi.Output<string>;
    /**
     * The metadata of the Logic App Integration Account Agreement.
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;

    /**
     * Create a IntegrationAccountAgreement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationAccountAgreementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationAccountAgreementArgs | IntegrationAccountAgreementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationAccountAgreementState | undefined;
            resourceInputs["agreementType"] = state ? state.agreementType : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["guestIdentity"] = state ? state.guestIdentity : undefined;
            resourceInputs["guestPartnerName"] = state ? state.guestPartnerName : undefined;
            resourceInputs["hostIdentity"] = state ? state.hostIdentity : undefined;
            resourceInputs["hostPartnerName"] = state ? state.hostPartnerName : undefined;
            resourceInputs["integrationAccountName"] = state ? state.integrationAccountName : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
        } else {
            const args = argsOrState as IntegrationAccountAgreementArgs | undefined;
            if ((!args || args.agreementType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agreementType'");
            }
            if ((!args || args.content === undefined) && !opts.urn) {
                throw new Error("Missing required property 'content'");
            }
            if ((!args || args.guestIdentity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'guestIdentity'");
            }
            if ((!args || args.guestPartnerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'guestPartnerName'");
            }
            if ((!args || args.hostIdentity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostIdentity'");
            }
            if ((!args || args.hostPartnerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostPartnerName'");
            }
            if ((!args || args.integrationAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'integrationAccountName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["agreementType"] = args ? args.agreementType : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["guestIdentity"] = args ? args.guestIdentity : undefined;
            resourceInputs["guestPartnerName"] = args ? args.guestPartnerName : undefined;
            resourceInputs["hostIdentity"] = args ? args.hostIdentity : undefined;
            resourceInputs["hostPartnerName"] = args ? args.hostPartnerName : undefined;
            resourceInputs["integrationAccountName"] = args ? args.integrationAccountName : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationAccountAgreement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationAccountAgreement resources.
 */
export interface IntegrationAccountAgreementState {
    /**
     * The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
     */
    agreementType?: pulumi.Input<string>;
    /**
     * The content of the Logic App Integration Account Agreement.
     */
    content?: pulumi.Input<string>;
    /**
     * A `guestIdentity` block as documented below.
     */
    guestIdentity?: pulumi.Input<inputs.logicapps.IntegrationAccountAgreementGuestIdentity>;
    /**
     * The name of the guest Logic App Integration Account Partner.
     */
    guestPartnerName?: pulumi.Input<string>;
    /**
     * A `hostIdentity` block as documented below.
     */
    hostIdentity?: pulumi.Input<inputs.logicapps.IntegrationAccountAgreementHostIdentity>;
    /**
     * The name of the host Logic App Integration Account Partner.
     */
    hostPartnerName?: pulumi.Input<string>;
    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     */
    integrationAccountName?: pulumi.Input<string>;
    /**
     * The metadata of the Logic App Integration Account Agreement.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationAccountAgreement resource.
 */
export interface IntegrationAccountAgreementArgs {
    /**
     * The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
     */
    agreementType: pulumi.Input<string>;
    /**
     * The content of the Logic App Integration Account Agreement.
     */
    content: pulumi.Input<string>;
    /**
     * A `guestIdentity` block as documented below.
     */
    guestIdentity: pulumi.Input<inputs.logicapps.IntegrationAccountAgreementGuestIdentity>;
    /**
     * The name of the guest Logic App Integration Account Partner.
     */
    guestPartnerName: pulumi.Input<string>;
    /**
     * A `hostIdentity` block as documented below.
     */
    hostIdentity: pulumi.Input<inputs.logicapps.IntegrationAccountAgreementHostIdentity>;
    /**
     * The name of the host Logic App Integration Account Partner.
     */
    hostPartnerName: pulumi.Input<string>;
    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     */
    integrationAccountName: pulumi.Input<string>;
    /**
     * The metadata of the Logic App Integration Account Agreement.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
}
