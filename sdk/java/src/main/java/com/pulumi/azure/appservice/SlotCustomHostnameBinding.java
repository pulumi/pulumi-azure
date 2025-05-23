// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.SlotCustomHostnameBindingArgs;
import com.pulumi.azure.appservice.inputs.SlotCustomHostnameBindingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Hostname Binding within an App Service Slot.
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
 * import com.pulumi.azure.appservice.Plan;
 * import com.pulumi.azure.appservice.PlanArgs;
 * import com.pulumi.azure.appservice.inputs.PlanSkuArgs;
 * import com.pulumi.azure.appservice.AppService;
 * import com.pulumi.azure.appservice.AppServiceArgs;
 * import com.pulumi.azure.appservice.Slot;
 * import com.pulumi.azure.appservice.SlotArgs;
 * import com.pulumi.azure.appservice.SlotCustomHostnameBinding;
 * import com.pulumi.azure.appservice.SlotCustomHostnameBindingArgs;
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
 *             .name("some-resource-group")
 *             .location("West Europe")
 *             .build());
 * 
 *         var examplePlan = new Plan("examplePlan", PlanArgs.builder()
 *             .name("some-app-service-plan")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku(PlanSkuArgs.builder()
 *                 .tier("Standard")
 *                 .size("S1")
 *                 .build())
 *             .build());
 * 
 *         var exampleAppService = new AppService("exampleAppService", AppServiceArgs.builder()
 *             .name("some-app-service")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .appServicePlanId(examplePlan.id())
 *             .build());
 * 
 *         var exampleSlot = new Slot("exampleSlot", SlotArgs.builder()
 *             .name("staging")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .appServiceName(exampleAppService.name())
 *             .appServicePlanId(examplePlan.id())
 *             .build());
 * 
 *         var exampleSlotCustomHostnameBinding = new SlotCustomHostnameBinding("exampleSlotCustomHostnameBinding", SlotCustomHostnameBindingArgs.builder()
 *             .appServiceSlotId(exampleSlot.id())
 *             .hostname("www.mywebsite.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * App Service Custom Hostname Bindings can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding mywebsite /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/sites/instance1/slots/staging/hostNameBindings/mywebsite.com
 * ```
 * 
 */
@ResourceType(type="azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding")
public class SlotCustomHostnameBinding extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the App Service Slot. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="appServiceSlotId", refs={String.class}, tree="[0]")
    private Output<String> appServiceSlotId;

    /**
     * @return The ID of the App Service Slot. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceSlotId() {
        return this.appServiceSlotId;
    }
    /**
     * Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sslState", refs={String.class}, tree="[0]")
    private Output<String> sslState;

    /**
     * @return The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sslState() {
        return this.sslState;
    }
    /**
     * The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
     * 
     */
    @Export(name="thumbprint", refs={String.class}, tree="[0]")
    private Output<String> thumbprint;

    /**
     * @return The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }
    /**
     * The virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    @Export(name="virtualIp", refs={String.class}, tree="[0]")
    private Output<String> virtualIp;

    /**
     * @return The virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    public Output<String> virtualIp() {
        return this.virtualIp;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SlotCustomHostnameBinding(java.lang.String name) {
        this(name, SlotCustomHostnameBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SlotCustomHostnameBinding(java.lang.String name, SlotCustomHostnameBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SlotCustomHostnameBinding(java.lang.String name, SlotCustomHostnameBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SlotCustomHostnameBinding(java.lang.String name, Output<java.lang.String> id, @Nullable SlotCustomHostnameBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding", name, state, makeResourceOptions(options, id), false);
    }

    private static SlotCustomHostnameBindingArgs makeArgs(SlotCustomHostnameBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SlotCustomHostnameBindingArgs.Empty : args;
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
    public static SlotCustomHostnameBinding get(java.lang.String name, Output<java.lang.String> id, @Nullable SlotCustomHostnameBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SlotCustomHostnameBinding(name, id, state, options);
    }
}
