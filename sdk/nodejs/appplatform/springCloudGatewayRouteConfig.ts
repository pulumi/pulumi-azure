// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a Spring Cloud Gateway Route Config.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleSpringCloudService = new azure.appplatform.SpringCloudService("exampleSpringCloudService", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     skuName: "E0",
 * });
 * const exampleSpringCloudGateway = new azure.appplatform.SpringCloudGateway("exampleSpringCloudGateway", {springCloudServiceId: exampleSpringCloudService.id});
 * const exampleSpringCloudGatewayRouteConfig = new azure.appplatform.SpringCloudGatewayRouteConfig("exampleSpringCloudGatewayRouteConfig", {
 *     springCloudGatewayId: exampleSpringCloudGateway.id,
 *     springCloudAppId: azurerm_spring_cloud_app.example.id,
 *     routes: [{
 *         description: "example description",
 *         filters: [
 *             "StripPrefix=2",
 *             "RateLimit=1,1s",
 *         ],
 *         order: 1,
 *         predicates: ["Path=/api5/customer/**"],
 *         ssoValidationEnabled: true,
 *         title: "myApp route config",
 *         tokenRelay: true,
 *         uri: "https://www.example.com",
 *         classificationTags: [
 *             "tag1",
 *             "tag2",
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Spring Cloud Gateway Route Configs can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudGatewayRouteConfig:SpringCloudGatewayRouteConfig example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/gateways/gateway1/routeConfigs/routeConfig1
 * ```
 */
export class SpringCloudGatewayRouteConfig extends pulumi.CustomResource {
    /**
     * Get an existing SpringCloudGatewayRouteConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpringCloudGatewayRouteConfigState, opts?: pulumi.CustomResourceOptions): SpringCloudGatewayRouteConfig {
        return new SpringCloudGatewayRouteConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appplatform/springCloudGatewayRouteConfig:SpringCloudGatewayRouteConfig';

    /**
     * Returns true if the given object is an instance of SpringCloudGatewayRouteConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpringCloudGatewayRouteConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpringCloudGatewayRouteConfig.__pulumiType;
    }

    /**
     * The name which should be used for this Spring Cloud Gateway Route Config. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    public readonly routes!: pulumi.Output<outputs.appplatform.SpringCloudGatewayRouteConfigRoute[] | undefined>;
    /**
     * The ID of the Spring Cloud App.
     */
    public readonly springCloudAppId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Spring Cloud Gateway. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    public readonly springCloudGatewayId!: pulumi.Output<string>;

    /**
     * Create a SpringCloudGatewayRouteConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpringCloudGatewayRouteConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpringCloudGatewayRouteConfigArgs | SpringCloudGatewayRouteConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpringCloudGatewayRouteConfigState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routes"] = state ? state.routes : undefined;
            resourceInputs["springCloudAppId"] = state ? state.springCloudAppId : undefined;
            resourceInputs["springCloudGatewayId"] = state ? state.springCloudGatewayId : undefined;
        } else {
            const args = argsOrState as SpringCloudGatewayRouteConfigArgs | undefined;
            if ((!args || args.springCloudGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'springCloudGatewayId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["routes"] = args ? args.routes : undefined;
            resourceInputs["springCloudAppId"] = args ? args.springCloudAppId : undefined;
            resourceInputs["springCloudGatewayId"] = args ? args.springCloudGatewayId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpringCloudGatewayRouteConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpringCloudGatewayRouteConfig resources.
 */
export interface SpringCloudGatewayRouteConfigState {
    /**
     * The name which should be used for this Spring Cloud Gateway Route Config. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.appplatform.SpringCloudGatewayRouteConfigRoute>[]>;
    /**
     * The ID of the Spring Cloud App.
     */
    springCloudAppId?: pulumi.Input<string>;
    /**
     * The ID of the Spring Cloud Gateway. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    springCloudGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SpringCloudGatewayRouteConfig resource.
 */
export interface SpringCloudGatewayRouteConfigArgs {
    /**
     * The name which should be used for this Spring Cloud Gateway Route Config. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.appplatform.SpringCloudGatewayRouteConfigRoute>[]>;
    /**
     * The ID of the Spring Cloud App.
     */
    springCloudAppId?: pulumi.Input<string>;
    /**
     * The ID of the Spring Cloud Gateway. Changing this forces a new Spring Cloud Gateway Route Config to be created.
     */
    springCloudGatewayId: pulumi.Input<string>;
}