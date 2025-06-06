// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Azure Container Registry Cache Rule.
 *
 * > **Note:** All arguments including the access key will be stored in the raw state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
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
 * const acr = new azure.containerservice.Registry("acr", {
 *     name: "containerRegistry1",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     sku: "Basic",
 * });
 * const cacheRule = new azure.containerservice.RegistryCacheRule("cache_rule", {
 *     name: "cacherule",
 *     containerRegistryId: acr.id,
 *     targetRepo: "target",
 *     sourceRepo: "docker.io/hello-world",
 *     credentialSetId: pulumi.interpolate`${acr.id}/credentialSets/example`,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.ContainerRegistry`: 2023-07-01
 *
 * ## Import
 *
 * Container Registry Cache Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:containerservice/registryCacheRule:RegistryCacheRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/cacheRules/myCacheRule
 * ```
 */
export class RegistryCacheRule extends pulumi.CustomResource {
    /**
     * Get an existing RegistryCacheRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryCacheRuleState, opts?: pulumi.CustomResourceOptions): RegistryCacheRule {
        return new RegistryCacheRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:containerservice/registryCacheRule:RegistryCacheRule';

    /**
     * Returns true if the given object is an instance of RegistryCacheRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegistryCacheRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegistryCacheRule.__pulumiType;
    }

    /**
     * The ID of the Container Registry where the Cache Rule should apply. Changing this forces a new resource to be created.
     */
    public readonly containerRegistryId!: pulumi.Output<string>;
    /**
     * The ARM resource ID of the Credential Store which is associated with the Cache Rule.
     */
    public readonly credentialSetId!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name of the Container Registry Cache Rule. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the source repository path. Changing this forces a new resource to be created.
     */
    public readonly sourceRepo!: pulumi.Output<string>;
    /**
     * The name of the new repository path to store artifacts. Changing this forces a new resource to be created.
     */
    public readonly targetRepo!: pulumi.Output<string>;

    /**
     * Create a RegistryCacheRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegistryCacheRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegistryCacheRuleArgs | RegistryCacheRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegistryCacheRuleState | undefined;
            resourceInputs["containerRegistryId"] = state ? state.containerRegistryId : undefined;
            resourceInputs["credentialSetId"] = state ? state.credentialSetId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["sourceRepo"] = state ? state.sourceRepo : undefined;
            resourceInputs["targetRepo"] = state ? state.targetRepo : undefined;
        } else {
            const args = argsOrState as RegistryCacheRuleArgs | undefined;
            if ((!args || args.containerRegistryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerRegistryId'");
            }
            if ((!args || args.sourceRepo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceRepo'");
            }
            if ((!args || args.targetRepo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetRepo'");
            }
            resourceInputs["containerRegistryId"] = args ? args.containerRegistryId : undefined;
            resourceInputs["credentialSetId"] = args ? args.credentialSetId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sourceRepo"] = args ? args.sourceRepo : undefined;
            resourceInputs["targetRepo"] = args ? args.targetRepo : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegistryCacheRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegistryCacheRule resources.
 */
export interface RegistryCacheRuleState {
    /**
     * The ID of the Container Registry where the Cache Rule should apply. Changing this forces a new resource to be created.
     */
    containerRegistryId?: pulumi.Input<string>;
    /**
     * The ARM resource ID of the Credential Store which is associated with the Cache Rule.
     */
    credentialSetId?: pulumi.Input<string>;
    /**
     * Specifies the name of the Container Registry Cache Rule. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the source repository path. Changing this forces a new resource to be created.
     */
    sourceRepo?: pulumi.Input<string>;
    /**
     * The name of the new repository path to store artifacts. Changing this forces a new resource to be created.
     */
    targetRepo?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegistryCacheRule resource.
 */
export interface RegistryCacheRuleArgs {
    /**
     * The ID of the Container Registry where the Cache Rule should apply. Changing this forces a new resource to be created.
     */
    containerRegistryId: pulumi.Input<string>;
    /**
     * The ARM resource ID of the Credential Store which is associated with the Cache Rule.
     */
    credentialSetId?: pulumi.Input<string>;
    /**
     * Specifies the name of the Container Registry Cache Rule. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the source repository path. Changing this forces a new resource to be created.
     */
    sourceRepo: pulumi.Input<string>;
    /**
     * The name of the new repository path to store artifacts. Changing this forces a new resource to be created.
     */
    targetRepo: pulumi.Input<string>;
}
