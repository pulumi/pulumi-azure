// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appinsights.StandardWebTestArgs;
import com.pulumi.azure.appinsights.inputs.StandardWebTestState;
import com.pulumi.azure.appinsights.outputs.StandardWebTestRequest;
import com.pulumi.azure.appinsights.outputs.StandardWebTestValidationRules;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Application Insights Standard WebTest.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.appinsights.Insights;
 * import com.pulumi.azure.appinsights.InsightsArgs;
 * import com.pulumi.azure.appinsights.StandardWebTest;
 * import com.pulumi.azure.appinsights.StandardWebTestArgs;
 * import com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("rg-example")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleInsights = new Insights("exampleInsights", InsightsArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .applicationType("web")
 *             .build());
 * 
 *         var exampleStandardWebTest = new StandardWebTest("exampleStandardWebTest", StandardWebTestArgs.builder()
 *             .name("example-test")
 *             .resourceGroupName(example.name())
 *             .location("West Europe")
 *             .applicationInsightsId(exampleInsights.id())
 *             .geoLocations("example")
 *             .request(StandardWebTestRequestArgs.builder()
 *                 .url("http://www.example.com")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
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
 * 
 */
@ResourceType(type="azure:appinsights/standardWebTest:StandardWebTest")
public class StandardWebTest extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Application Insights instance on which the WebTest operates. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    @Export(name="applicationInsightsId", refs={String.class}, tree="[0]")
    private Output<String> applicationInsightsId;

    /**
     * @return The ID of the Application Insights instance on which the WebTest operates. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    public Output<String> applicationInsightsId() {
        return this.applicationInsightsId;
    }
    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Purpose/user defined descriptive test for this WebTest.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Should the WebTest be enabled?
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should the WebTest be enabled?
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     * 
     */
    @Export(name="frequency", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> frequency;

    /**
     * @return Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     * 
     */
    public Output<Optional<Integer>> frequency() {
        return Codegen.optional(this.frequency);
    }
    /**
     * Specifies a list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     * &gt; **Note:** [Valid options for geo locations are described here](https://docs.microsoft.com/azure/azure-monitor/app/monitor-web-app-availability#location-population-tags)
     * 
     */
    @Export(name="geoLocations", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> geoLocations;

    /**
     * @return Specifies a list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     * &gt; **Note:** [Valid options for geo locations are described here](https://docs.microsoft.com/azure/azure-monitor/app/monitor-web-app-availability#location-population-tags)
     * 
     */
    public Output<List<String>> geoLocations() {
        return this.geoLocations;
    }
    /**
     * The Azure Region where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created. It needs to correlate with location of the parent resource (azurerm_application_insights)
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created. It needs to correlate with location of the parent resource (azurerm_application_insights)
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Application Insights Standard WebTest. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Application Insights Standard WebTest. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `request` block as defined below.
     * 
     */
    @Export(name="request", refs={StandardWebTestRequest.class}, tree="[0]")
    private Output<StandardWebTestRequest> request;

    /**
     * @return A `request` block as defined below.
     * 
     */
    public Output<StandardWebTestRequest> request() {
        return this.request;
    }
    /**
     * The name of the Resource Group where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Application Insights Standard WebTest should exist. Changing this forces a new Application Insights Standard WebTest to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Should the retry on WebTest failure be enabled?
     * 
     */
    @Export(name="retryEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> retryEnabled;

    /**
     * @return Should the retry on WebTest failure be enabled?
     * 
     */
    public Output<Optional<Boolean>> retryEnabled() {
        return Codegen.optional(this.retryEnabled);
    }
    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    @Export(name="syntheticMonitorId", refs={String.class}, tree="[0]")
    private Output<String> syntheticMonitorId;

    /**
     * @return Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    public Output<String> syntheticMonitorId() {
        return this.syntheticMonitorId;
    }
    /**
     * A mapping of tags which should be assigned to the Application Insights Standard WebTest.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Application Insights Standard WebTest.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Seconds until this WebTest will timeout and fail. Default is `30`.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return Seconds until this WebTest will timeout and fail. Default is `30`.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * A `validation_rules` block as defined below.
     * 
     */
    @Export(name="validationRules", refs={StandardWebTestValidationRules.class}, tree="[0]")
    private Output</* @Nullable */ StandardWebTestValidationRules> validationRules;

    /**
     * @return A `validation_rules` block as defined below.
     * 
     */
    public Output<Optional<StandardWebTestValidationRules>> validationRules() {
        return Codegen.optional(this.validationRules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StandardWebTest(java.lang.String name) {
        this(name, StandardWebTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StandardWebTest(java.lang.String name, StandardWebTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StandardWebTest(java.lang.String name, StandardWebTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/standardWebTest:StandardWebTest", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StandardWebTest(java.lang.String name, Output<java.lang.String> id, @Nullable StandardWebTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/standardWebTest:StandardWebTest", name, state, makeResourceOptions(options, id), false);
    }

    private static StandardWebTestArgs makeArgs(StandardWebTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StandardWebTestArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StandardWebTest get(java.lang.String name, Output<java.lang.String> id, @Nullable StandardWebTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StandardWebTest(name, id, state, options);
    }
}
