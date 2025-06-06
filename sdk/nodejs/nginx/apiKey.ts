// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Dataplane API Key for an Nginx Deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-rg",
 *     location: "West Europe",
 * });
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     allocationMethod: "Static",
 *     sku: "Standard",
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vnet",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "example-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 *     delegations: [{
 *         name: "delegation",
 *         serviceDelegation: {
 *             name: "NGINX.NGINXPLUS/nginxDeployments",
 *             actions: ["Microsoft.Network/virtualNetworks/subnets/join/action"],
 *         },
 *     }],
 * });
 * const exampleDeployment = new azure.nginx.Deployment("example", {
 *     name: "example-nginx",
 *     resourceGroupName: example.name,
 *     sku: "standardv2_Monthly",
 *     location: example.location,
 *     automaticUpgradeChannel: "stable",
 *     frontendPublic: {
 *         ipAddresses: [examplePublicIp.id],
 *     },
 *     networkInterfaces: [{
 *         subnetId: exampleSubnet.id,
 *     }],
 *     capacity: 20,
 *     email: "user@test.com",
 * });
 * const exampleApiKey = new azure.nginx.ApiKey("example", {
 *     name: "example-api-key",
 *     nginxDeploymentId: exampleDeployment.id,
 *     secretText: "727c8642-6807-4254-9d02-ae93bfad21de",
 *     endDateTime: "2027-01-01T00:00:00Z",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Nginx.NginxPlus`: 2024-11-01-preview
 *
 * ## Import
 *
 * An NGINX Dataplane API Key can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:nginx/apiKey:ApiKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/deploy1/apiKeys/key1
 * ```
 */
export class ApiKey extends pulumi.CustomResource {
    /**
     * Get an existing ApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiKeyState, opts?: pulumi.CustomResourceOptions): ApiKey {
        return new ApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:nginx/apiKey:ApiKey';

    /**
     * Returns true if the given object is an instance of ApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiKey.__pulumiType;
    }

    /**
     * The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
     */
    public readonly endDateTime!: pulumi.Output<string>;
    /**
     * The first three characters of the secret text to help identify it in use.
     */
    public /*out*/ readonly hint!: pulumi.Output<string>;
    /**
     * The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
     */
    public readonly nginxDeploymentId!: pulumi.Output<string>;
    /**
     * The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
     */
    public readonly secretText!: pulumi.Output<string>;

    /**
     * Create a ApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiKeyArgs | ApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiKeyState | undefined;
            resourceInputs["endDateTime"] = state ? state.endDateTime : undefined;
            resourceInputs["hint"] = state ? state.hint : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nginxDeploymentId"] = state ? state.nginxDeploymentId : undefined;
            resourceInputs["secretText"] = state ? state.secretText : undefined;
        } else {
            const args = argsOrState as ApiKeyArgs | undefined;
            if ((!args || args.endDateTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endDateTime'");
            }
            if ((!args || args.nginxDeploymentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nginxDeploymentId'");
            }
            if ((!args || args.secretText === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretText'");
            }
            resourceInputs["endDateTime"] = args ? args.endDateTime : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nginxDeploymentId"] = args ? args.nginxDeploymentId : undefined;
            resourceInputs["secretText"] = args?.secretText ? pulumi.secret(args.secretText) : undefined;
            resourceInputs["hint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretText"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiKey resources.
 */
export interface ApiKeyState {
    /**
     * The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
     */
    endDateTime?: pulumi.Input<string>;
    /**
     * The first three characters of the secret text to help identify it in use.
     */
    hint?: pulumi.Input<string>;
    /**
     * The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
     */
    nginxDeploymentId?: pulumi.Input<string>;
    /**
     * The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
     */
    secretText?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiKey resource.
 */
export interface ApiKeyArgs {
    /**
     * The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
     */
    endDateTime: pulumi.Input<string>;
    /**
     * The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
     */
    nginxDeploymentId: pulumi.Input<string>;
    /**
     * The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
     */
    secretText: pulumi.Input<string>;
}
