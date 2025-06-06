// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoringArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudNewRelicApplicationPerformanceMonitoringState;
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
 * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
 * 
 * Manages a Spring Cloud Application Performance Monitoring resource for New Relic.
 * 
 * !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoring;
 * import com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoringArgs;
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
 *         var exampleSpringCloudService = new SpringCloudService("exampleSpringCloudService", SpringCloudServiceArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("E0")
 *             .build());
 * 
 *         var exampleSpringCloudNewRelicApplicationPerformanceMonitoring = new SpringCloudNewRelicApplicationPerformanceMonitoring("exampleSpringCloudNewRelicApplicationPerformanceMonitoring", SpringCloudNewRelicApplicationPerformanceMonitoringArgs.builder()
 *             .name("example")
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .appName("example-app-name")
 *             .licenseKey("example-license-key")
 *             .appServerPort(8080)
 *             .labels(Map.ofEntries(
 *                 Map.entry("tagName1", "tagValue1"),
 *                 Map.entry("tagName2", "tagValue2")
 *             ))
 *             .globallyEnabled(true)
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
 * Spring Cloud Application Performance Monitoring resource for New Relic can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:appplatform/springCloudNewRelicApplicationPerformanceMonitoring:SpringCloudNewRelicApplicationPerformanceMonitoring example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.AppPlatform/spring/service1/apms/apm1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudNewRelicApplicationPerformanceMonitoring:SpringCloudNewRelicApplicationPerformanceMonitoring")
public class SpringCloudNewRelicApplicationPerformanceMonitoring extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether enable the agent. Defaults to `true`.
     * 
     */
    @Export(name="agentEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> agentEnabled;

    /**
     * @return Specifies whether enable the agent. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> agentEnabled() {
        return Codegen.optional(this.agentEnabled);
    }
    /**
     * Specifies the application name used to report data to New Relic.
     * 
     */
    @Export(name="appName", refs={String.class}, tree="[0]")
    private Output<String> appName;

    /**
     * @return Specifies the application name used to report data to New Relic.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }
    /**
     * Specifies the port number to differentiate JVMs for the same app on the same machine.
     * 
     */
    @Export(name="appServerPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> appServerPort;

    /**
     * @return Specifies the port number to differentiate JVMs for the same app on the same machine.
     * 
     */
    public Output<Optional<Integer>> appServerPort() {
        return Codegen.optional(this.appServerPort);
    }
    /**
     * Specifies whether enable plain text logging of all data sent to New Relic to the agent logfile. Defaults to `false`.
     * 
     */
    @Export(name="auditModeEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> auditModeEnabled;

    /**
     * @return Specifies whether enable plain text logging of all data sent to New Relic to the agent logfile. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> auditModeEnabled() {
        return Codegen.optional(this.auditModeEnabled);
    }
    /**
     * Specifies whether enable the reporting of data separately for each web app. Defaults to `false`.
     * 
     */
    @Export(name="autoAppNamingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoAppNamingEnabled;

    /**
     * @return Specifies whether enable the reporting of data separately for each web app. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> autoAppNamingEnabled() {
        return Codegen.optional(this.autoAppNamingEnabled);
    }
    /**
     * Specifies whether enable the component-based transaction naming. Defaults to `true`.
     * 
     */
    @Export(name="autoTransactionNamingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoTransactionNamingEnabled;

    /**
     * @return Specifies whether enable the component-based transaction naming. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> autoTransactionNamingEnabled() {
        return Codegen.optional(this.autoTransactionNamingEnabled);
    }
    /**
     * Specifies whether enable all instrumentation using an `{@literal @}Trace` annotation. Disabling this causes `{@literal @}Trace` annotations to be ignored. Defaults to `true`.
     * 
     */
    @Export(name="customTracingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> customTracingEnabled;

    /**
     * @return Specifies whether enable all instrumentation using an `{@literal @}Trace` annotation. Disabling this causes `{@literal @}Trace` annotations to be ignored. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> customTracingEnabled() {
        return Codegen.optional(this.customTracingEnabled);
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
     * Specifies a mapping of labels to be added to the New Relic application.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Specifies a mapping of labels to be added to the New Relic application.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Specifies the license key associated with the New Relic account. This key binds your agent&#39;s data to your account in New Relic service.
     * 
     */
    @Export(name="licenseKey", refs={String.class}, tree="[0]")
    private Output<String> licenseKey;

    /**
     * @return Specifies the license key associated with the New Relic account. This key binds your agent&#39;s data to your account in New Relic service.
     * 
     */
    public Output<String> licenseKey() {
        return this.licenseKey;
    }
    /**
     * The name which should be used for this Spring Cloud Application Performance Monitoring resource for New Relic. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Application Performance Monitoring resource for New Relic. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public SpringCloudNewRelicApplicationPerformanceMonitoring(java.lang.String name) {
        this(name, SpringCloudNewRelicApplicationPerformanceMonitoringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudNewRelicApplicationPerformanceMonitoring(java.lang.String name, SpringCloudNewRelicApplicationPerformanceMonitoringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudNewRelicApplicationPerformanceMonitoring(java.lang.String name, SpringCloudNewRelicApplicationPerformanceMonitoringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudNewRelicApplicationPerformanceMonitoring:SpringCloudNewRelicApplicationPerformanceMonitoring", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SpringCloudNewRelicApplicationPerformanceMonitoring(java.lang.String name, Output<java.lang.String> id, @Nullable SpringCloudNewRelicApplicationPerformanceMonitoringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudNewRelicApplicationPerformanceMonitoring:SpringCloudNewRelicApplicationPerformanceMonitoring", name, state, makeResourceOptions(options, id), false);
    }

    private static SpringCloudNewRelicApplicationPerformanceMonitoringArgs makeArgs(SpringCloudNewRelicApplicationPerformanceMonitoringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SpringCloudNewRelicApplicationPerformanceMonitoringArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "licenseKey"
            ))
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
    public static SpringCloudNewRelicApplicationPerformanceMonitoring get(java.lang.String name, Output<java.lang.String> id, @Nullable SpringCloudNewRelicApplicationPerformanceMonitoringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudNewRelicApplicationPerformanceMonitoring(name, id, state, options);
    }
}
