// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an API Management API Policy
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.apimanagement.getApi({
 *     name: "my-api",
 *     apiManagementName: "example-apim",
 *     resourceGroupName: "search-service",
 *     revision: "2",
 * });
 * const exampleApiPolicy = new azure.apimanagement.ApiPolicy("example", {
 *     apiName: example.then(example => example.name),
 *     apiManagementName: example.then(example => example.apiManagementName),
 *     resourceGroupName: example.then(example => example.resourceGroupName),
 *     xmlContent: `<policies>
 *   <inbound>
 *     <find-and-replace from="xyz" to="abc" />
 *   </inbound>
 * </policies>
 * `,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.ApiManagement`: 2022-08-01
 *
 * ## Import
 *
 * API Management API Policy can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:apimanagement/apiPolicy:ApiPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/apis/exampleId
 * ```
 */
export class ApiPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ApiPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiPolicyState, opts?: pulumi.CustomResourceOptions): ApiPolicy {
        return new ApiPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:apimanagement/apiPolicy:ApiPolicy';

    /**
     * Returns true if the given object is an instance of ApiPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiPolicy.__pulumiType;
    }

    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     */
    public readonly apiManagementName!: pulumi.Output<string>;
    /**
     * The ID of the API Management API within the API Management Service. Changing this forces a new resource to be created.
     */
    public readonly apiName!: pulumi.Output<string>;
    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The XML Content for this Policy as a string.
     */
    public readonly xmlContent!: pulumi.Output<string>;
    /**
     * A link to a Policy XML Document, which must be publicly available.
     */
    public readonly xmlLink!: pulumi.Output<string | undefined>;

    /**
     * Create a ApiPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiPolicyArgs | ApiPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiPolicyState | undefined;
            resourceInputs["apiManagementName"] = state ? state.apiManagementName : undefined;
            resourceInputs["apiName"] = state ? state.apiName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["xmlContent"] = state ? state.xmlContent : undefined;
            resourceInputs["xmlLink"] = state ? state.xmlLink : undefined;
        } else {
            const args = argsOrState as ApiPolicyArgs | undefined;
            if ((!args || args.apiManagementName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiManagementName'");
            }
            if ((!args || args.apiName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["apiManagementName"] = args ? args.apiManagementName : undefined;
            resourceInputs["apiName"] = args ? args.apiName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["xmlContent"] = args ? args.xmlContent : undefined;
            resourceInputs["xmlLink"] = args ? args.xmlLink : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiPolicy resources.
 */
export interface ApiPolicyState {
    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     */
    apiManagementName?: pulumi.Input<string>;
    /**
     * The ID of the API Management API within the API Management Service. Changing this forces a new resource to be created.
     */
    apiName?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The XML Content for this Policy as a string.
     */
    xmlContent?: pulumi.Input<string>;
    /**
     * A link to a Policy XML Document, which must be publicly available.
     */
    xmlLink?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiPolicy resource.
 */
export interface ApiPolicyArgs {
    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     */
    apiManagementName: pulumi.Input<string>;
    /**
     * The ID of the API Management API within the API Management Service. Changing this forces a new resource to be created.
     */
    apiName: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The XML Content for this Policy as a string.
     */
    xmlContent?: pulumi.Input<string>;
    /**
     * A link to a Policy XML Document, which must be publicly available.
     */
    xmlLink?: pulumi.Input<string>;
}
