// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Automation Hybrid Runbook Worker Group.
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
 * const exampleAccount = new azure.automation.Account("example", {
 *     name: "example-account",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "Basic",
 * });
 * const exampleHybridRunbookWorkerGroup = new azure.automation.HybridRunbookWorkerGroup("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     automationAccountName: exampleAccount.name,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Automation`: 2023-11-01
 *
 * ## Import
 *
 * Automations can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/hybridRunbookWorkerGroups/grp1
 * ```
 */
export class HybridRunbookWorkerGroup extends pulumi.CustomResource {
    /**
     * Get an existing HybridRunbookWorkerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HybridRunbookWorkerGroupState, opts?: pulumi.CustomResourceOptions): HybridRunbookWorkerGroup {
        return new HybridRunbookWorkerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup';

    /**
     * Returns true if the given object is an instance of HybridRunbookWorkerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HybridRunbookWorkerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HybridRunbookWorkerGroup.__pulumiType;
    }

    /**
     * The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
     */
    public readonly automationAccountName!: pulumi.Output<string>;
    /**
     * The name of resource type `azure.automation.Credential` to use for hybrid worker.
     */
    public readonly credentialName!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;

    /**
     * Create a HybridRunbookWorkerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HybridRunbookWorkerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HybridRunbookWorkerGroupArgs | HybridRunbookWorkerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HybridRunbookWorkerGroupState | undefined;
            resourceInputs["automationAccountName"] = state ? state.automationAccountName : undefined;
            resourceInputs["credentialName"] = state ? state.credentialName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
        } else {
            const args = argsOrState as HybridRunbookWorkerGroupArgs | undefined;
            if ((!args || args.automationAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["automationAccountName"] = args ? args.automationAccountName : undefined;
            resourceInputs["credentialName"] = args ? args.credentialName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HybridRunbookWorkerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HybridRunbookWorkerGroup resources.
 */
export interface HybridRunbookWorkerGroupState {
    /**
     * The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
     */
    automationAccountName?: pulumi.Input<string>;
    /**
     * The name of resource type `azure.automation.Credential` to use for hybrid worker.
     */
    credentialName?: pulumi.Input<string>;
    /**
     * The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HybridRunbookWorkerGroup resource.
 */
export interface HybridRunbookWorkerGroupArgs {
    /**
     * The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
     */
    automationAccountName: pulumi.Input<string>;
    /**
     * The name of resource type `azure.automation.Credential` to use for hybrid worker.
     */
    credentialName?: pulumi.Input<string>;
    /**
     * The name which should be used for this Automation Account Runbook Worker Group. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    resourceGroupName: pulumi.Input<string>;
}
