// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datadog.MonitorSsoConfigurationArgs;
import com.pulumi.azure.datadog.inputs.MonitorSsoConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages SingleSignOn on the datadog Monitor.
 * 
 * ## Example Usage
 * ### Enabling SSO on monitor
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.datadog.MonitorSsoConfiguration;
 * import com.pulumi.azure.datadog.MonitorSsoConfigurationArgs;
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West US 2&#34;)
 *             .build());
 * 
 *         var test = new MonitorSsoConfiguration(&#34;test&#34;, MonitorSsoConfigurationArgs.builder()        
 *             .datadogMonitorId(azurerm_datadog_monitor.example().id())
 *             .singleSignOnEnabled(&#34;Enable&#34;)
 *             .enterpriseApplicationId(&#34;XXXX&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SingleSignOn on the Datadog Monitor can be imported using the `signle sign on resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Datadog/monitors/monitor1/singleSignOnConfigurations/default
 * ```
 * 
 */
@ResourceType(type="azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration")
public class MonitorSsoConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
     * 
     */
    @Export(name="datadogMonitorId", type=String.class, parameters={})
    private Output<String> datadogMonitorId;

    /**
     * @return The Datadog Monitor Id which should be used for this Datadog Monitor SSO Configuration. Changing this forces a new Datadog Monitor SSO Configuration to be created.
     * 
     */
    public Output<String> datadogMonitorId() {
        return this.datadogMonitorId;
    }
    /**
     * The application Id to perform SSO operation.
     * 
     */
    @Export(name="enterpriseApplicationId", type=String.class, parameters={})
    private Output<String> enterpriseApplicationId;

    /**
     * @return The application Id to perform SSO operation.
     * 
     */
    public Output<String> enterpriseApplicationId() {
        return this.enterpriseApplicationId;
    }
    /**
     * The SingleSignOn URL to login to Datadog org.
     * 
     */
    @Export(name="loginUrl", type=String.class, parameters={})
    private Output<String> loginUrl;

    /**
     * @return The SingleSignOn URL to login to Datadog org.
     * 
     */
    public Output<String> loginUrl() {
        return this.loginUrl;
    }
    /**
     * The name of the SingleSignOn configuration. Defaults to `default`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SingleSignOn configuration. Defaults to `default`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The state of SingleSignOn configuration.
     * 
     */
    @Export(name="singleSignOnEnabled", type=String.class, parameters={})
    private Output<String> singleSignOnEnabled;

    /**
     * @return The state of SingleSignOn configuration.
     * 
     */
    public Output<String> singleSignOnEnabled() {
        return this.singleSignOnEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorSsoConfiguration(String name) {
        this(name, MonitorSsoConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorSsoConfiguration(String name, MonitorSsoConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorSsoConfiguration(String name, MonitorSsoConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration", name, args == null ? MonitorSsoConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitorSsoConfiguration(String name, Output<String> id, @Nullable MonitorSsoConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datadog/monitorSsoConfiguration:MonitorSsoConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static MonitorSsoConfiguration get(String name, Output<String> id, @Nullable MonitorSsoConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorSsoConfiguration(name, id, state, options);
    }
}