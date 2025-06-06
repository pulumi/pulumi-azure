// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Application Insights Standard WebTest.
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
 * const exampleInsights = new azure.appinsights.Insights("example", {
 *     name: "example",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     applicationType: "web",
 * });
 * const exampleStandardWebTest = new azure.appinsights.StandardWebTest("example", {
 *     name: "example-test",
 *     resourceGroupName: example.name,
 *     location: "West Europe",
 *     applicationInsightsId: exampleInsights.id,
 *     geoLocations: ["example"],
 *     request: {
 *         url: "http://www.example.com",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Insights`: 2022-06-15
 *
 * ## Import
 *
 * Application Insights Standard WebTests can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:appinsights/standardWebTest:StandardWebTest example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Insights/webTests/appinsightswebtest
 * ```
 */
export class StandardWebTest extends pulumi.CustomResource {
    /**
     * Get an existing StandardWebTest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StandardWebTestState, opts?: pulumi.CustomResourceOptions): StandardWebTest {
        return new StandardWebTest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appinsights/standardWebTest:StandardWebTest';

    /**
     * Returns true if the given object is an instance of StandardWebTest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StandardWebTest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StandardWebTest.__pulumiType;
    }

    /**
     * The ID of the Application Insights instance on which the WebTest operates. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    public readonly applicationInsightsId!: pulumi.Output<string>;
    /**
     * Purpose/user defined descriptive test for this WebTest.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Should the WebTest be enabled?
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     */
    public readonly frequency!: pulumi.Output<number | undefined>;
    /**
     * Specifies a list of where to physically run the tests from to give global coverage for accessibility of your application.
     *
     * > **Note:** [Valid options for geo locations are described here](https://docs.microsoft.com/azure/azure-monitor/app/monitor-web-app-availability#location-population-tags)
     */
    public readonly geoLocations!: pulumi.Output<string[]>;
    /**
     * The Azure Region where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created. It needs to correlate with location of the parent resource (azurerm_application_insights)
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Application Insights Standard WebTest. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `request` block as defined below.
     */
    public readonly request!: pulumi.Output<outputs.appinsights.StandardWebTestRequest>;
    /**
     * The name of the Resource Group where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Should the retry on WebTest failure be enabled?
     */
    public readonly retryEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     */
    public /*out*/ readonly syntheticMonitorId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Standard WebTest.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Seconds until this WebTest will timeout and fail. Default is `30`.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * A `validationRules` block as defined below.
     */
    public readonly validationRules!: pulumi.Output<outputs.appinsights.StandardWebTestValidationRules | undefined>;

    /**
     * Create a StandardWebTest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StandardWebTestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StandardWebTestArgs | StandardWebTestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StandardWebTestState | undefined;
            resourceInputs["applicationInsightsId"] = state ? state.applicationInsightsId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["geoLocations"] = state ? state.geoLocations : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["request"] = state ? state.request : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["retryEnabled"] = state ? state.retryEnabled : undefined;
            resourceInputs["syntheticMonitorId"] = state ? state.syntheticMonitorId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["validationRules"] = state ? state.validationRules : undefined;
        } else {
            const args = argsOrState as StandardWebTestArgs | undefined;
            if ((!args || args.applicationInsightsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationInsightsId'");
            }
            if ((!args || args.geoLocations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'geoLocations'");
            }
            if ((!args || args.request === undefined) && !opts.urn) {
                throw new Error("Missing required property 'request'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["applicationInsightsId"] = args ? args.applicationInsightsId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["frequency"] = args ? args.frequency : undefined;
            resourceInputs["geoLocations"] = args ? args.geoLocations : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["request"] = args ? args.request : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["retryEnabled"] = args ? args.retryEnabled : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["validationRules"] = args ? args.validationRules : undefined;
            resourceInputs["syntheticMonitorId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StandardWebTest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StandardWebTest resources.
 */
export interface StandardWebTestState {
    /**
     * The ID of the Application Insights instance on which the WebTest operates. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    applicationInsightsId?: pulumi.Input<string>;
    /**
     * Purpose/user defined descriptive test for this WebTest.
     */
    description?: pulumi.Input<string>;
    /**
     * Should the WebTest be enabled?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     */
    frequency?: pulumi.Input<number>;
    /**
     * Specifies a list of where to physically run the tests from to give global coverage for accessibility of your application.
     *
     * > **Note:** [Valid options for geo locations are described here](https://docs.microsoft.com/azure/azure-monitor/app/monitor-web-app-availability#location-population-tags)
     */
    geoLocations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Azure Region where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created. It needs to correlate with location of the parent resource (azurerm_application_insights)
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Application Insights Standard WebTest. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `request` block as defined below.
     */
    request?: pulumi.Input<inputs.appinsights.StandardWebTestRequest>;
    /**
     * The name of the Resource Group where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Should the retry on WebTest failure be enabled?
     */
    retryEnabled?: pulumi.Input<boolean>;
    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     */
    syntheticMonitorId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Standard WebTest.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Seconds until this WebTest will timeout and fail. Default is `30`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * A `validationRules` block as defined below.
     */
    validationRules?: pulumi.Input<inputs.appinsights.StandardWebTestValidationRules>;
}

/**
 * The set of arguments for constructing a StandardWebTest resource.
 */
export interface StandardWebTestArgs {
    /**
     * The ID of the Application Insights instance on which the WebTest operates. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    applicationInsightsId: pulumi.Input<string>;
    /**
     * Purpose/user defined descriptive test for this WebTest.
     */
    description?: pulumi.Input<string>;
    /**
     * Should the WebTest be enabled?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     */
    frequency?: pulumi.Input<number>;
    /**
     * Specifies a list of where to physically run the tests from to give global coverage for accessibility of your application.
     *
     * > **Note:** [Valid options for geo locations are described here](https://docs.microsoft.com/azure/azure-monitor/app/monitor-web-app-availability#location-population-tags)
     */
    geoLocations: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Azure Region where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created. It needs to correlate with location of the parent resource (azurerm_application_insights)
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Application Insights Standard WebTest. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `request` block as defined below.
     */
    request: pulumi.Input<inputs.appinsights.StandardWebTestRequest>;
    /**
     * The name of the Resource Group where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Should the retry on WebTest failure be enabled?
     */
    retryEnabled?: pulumi.Input<boolean>;
    /**
     * A mapping of tags which should be assigned to the Application Insights Standard WebTest.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Seconds until this WebTest will timeout and fail. Default is `30`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * A `validationRules` block as defined below.
     */
    validationRules?: pulumi.Input<inputs.appinsights.StandardWebTestValidationRules>;
}
