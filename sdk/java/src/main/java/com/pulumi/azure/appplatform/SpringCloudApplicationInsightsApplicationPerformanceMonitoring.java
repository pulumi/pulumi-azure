// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudApplicationInsightsApplicationPerformanceMonitoringState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
 * 
 * Manages a Spring Cloud Application Performance Monitoring resource for Application Insights.
 * 
 * !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoring;
 * import com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs;
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
 *             .name("example")
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
 *         var exampleSpringCloudService = new SpringCloudService("exampleSpringCloudService", SpringCloudServiceArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("E0")
 *             .build());
 * 
 *         var exampleSpringCloudApplicationInsightsApplicationPerformanceMonitoring = new SpringCloudApplicationInsightsApplicationPerformanceMonitoring("exampleSpringCloudApplicationInsightsApplicationPerformanceMonitoring", SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs.builder()
 *             .name("example")
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .connectionString(exampleInsights.instrumentationKey())
 *             .globallyEnabled(true)
 *             .roleName("test-role")
 *             .roleInstance("test-instance")
 *             .samplingPercentage(50)
 *             .samplingRequestsPerSecond(10)
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
 * * `Microsoft.AppPlatform`: 2024-01-01-preview
 * 
 * ## Import
 * 
 * Spring Cloud Application Performance Monitoring resource for Application Insights can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:appplatform/springCloudApplicationInsightsApplicationPerformanceMonitoring:SpringCloudApplicationInsightsApplicationPerformanceMonitoring example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.AppPlatform/spring/service1/apms/apm1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudApplicationInsightsApplicationPerformanceMonitoring:SpringCloudApplicationInsightsApplicationPerformanceMonitoring")
public class SpringCloudApplicationInsightsApplicationPerformanceMonitoring extends com.pulumi.resources.CustomResource {
    /**
     * The instrumentation key used to push data to Application Insights.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionString;

    /**
     * @return The instrumentation key used to push data to Application Insights.
     * 
     */
    public Output<Optional<String>> connectionString() {
        return Codegen.optional(this.connectionString);
    }
    /**
     * Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
     * 
     */
    @Export(name="globallyEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> globallyEnabled;

    /**
     * @return Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> globallyEnabled() {
        return Codegen.optional(this.globallyEnabled);
    }
    /**
     * The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the cloud role instance.
     * 
     */
    @Export(name="roleInstance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleInstance;

    /**
     * @return Specifies the cloud role instance.
     * 
     */
    public Output<Optional<String>> roleInstance() {
        return Codegen.optional(this.roleInstance);
    }
    /**
     * Specifies the cloud role name used to label the component on the application map.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleName;

    /**
     * @return Specifies the cloud role name used to label the component on the application map.
     * 
     */
    public Output<Optional<String>> roleName() {
        return Codegen.optional(this.roleName);
    }
    /**
     * Specifies the percentage for fixed-percentage sampling.
     * 
     */
    @Export(name="samplingPercentage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> samplingPercentage;

    /**
     * @return Specifies the percentage for fixed-percentage sampling.
     * 
     */
    public Output<Optional<Integer>> samplingPercentage() {
        return Codegen.optional(this.samplingPercentage);
    }
    /**
     * Specifies the number of requests per second for the rate-limited sampling.
     * 
     */
    @Export(name="samplingRequestsPerSecond", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> samplingRequestsPerSecond;

    /**
     * @return Specifies the number of requests per second for the rate-limited sampling.
     * 
     */
    public Output<Optional<Integer>> samplingRequestsPerSecond() {
        return Codegen.optional(this.samplingRequestsPerSecond);
    }
    /**
     * The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="springCloudServiceId", refs={String.class}, tree="[0]")
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudApplicationInsightsApplicationPerformanceMonitoring(java.lang.String name) {
        this(name, SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudApplicationInsightsApplicationPerformanceMonitoring(java.lang.String name, SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudApplicationInsightsApplicationPerformanceMonitoring(java.lang.String name, SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudApplicationInsightsApplicationPerformanceMonitoring:SpringCloudApplicationInsightsApplicationPerformanceMonitoring", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SpringCloudApplicationInsightsApplicationPerformanceMonitoring(java.lang.String name, Output<java.lang.String> id, @Nullable SpringCloudApplicationInsightsApplicationPerformanceMonitoringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudApplicationInsightsApplicationPerformanceMonitoring:SpringCloudApplicationInsightsApplicationPerformanceMonitoring", name, state, makeResourceOptions(options, id), false);
    }

    private static SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs makeArgs(SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs.Empty : args;
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
    public static SpringCloudApplicationInsightsApplicationPerformanceMonitoring get(java.lang.String name, Output<java.lang.String> id, @Nullable SpringCloudApplicationInsightsApplicationPerformanceMonitoringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudApplicationInsightsApplicationPerformanceMonitoring(name, id, state, options);
    }
}
