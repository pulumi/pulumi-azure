// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontendArgs;
import com.pulumi.azure.appconfiguration.inputs.LicationLoadBalancerFrontendState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Application Gateway for Containers Frontend.
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
 * import com.pulumi.azure.appconfiguration.LicationLoadBalancer;
 * import com.pulumi.azure.appconfiguration.LicationLoadBalancerArgs;
 * import com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontend;
 * import com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontendArgs;
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
 *         var example = new LicationLoadBalancer("example", LicationLoadBalancerArgs.builder()
 *             .name("example")
 *             .resourceGroupName("example")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleLicationLoadBalancerFrontend = new LicationLoadBalancerFrontend("exampleLicationLoadBalancerFrontend", LicationLoadBalancerFrontendArgs.builder()
 *             .name("example")
 *             .applicationLoadBalancerId(example.id())
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
 * * `Microsoft.ServiceNetworking`: 2023-11-01
 * 
 * ## Import
 * 
 * Application Gateway for Containers Frontend can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:appconfiguration/licationLoadBalancerFrontend:LicationLoadBalancerFrontend example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceNetworking/trafficControllers/alb1/frontends/frontend1
 * ```
 * 
 */
@ResourceType(type="azure:appconfiguration/licationLoadBalancerFrontend:LicationLoadBalancerFrontend")
public class LicationLoadBalancerFrontend extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="applicationLoadBalancerId", refs={String.class}, tree="[0]")
    private Output<String> applicationLoadBalancerId;

    /**
     * @return The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> applicationLoadBalancerId() {
        return this.applicationLoadBalancerId;
    }
    /**
     * The Fully Qualified Domain Name of the DNS record associated to an Application Gateway for Containers Frontend.
     * 
     */
    @Export(name="fullyQualifiedDomainName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedDomainName;

    /**
     * @return The Fully Qualified Domain Name of the DNS record associated to an Application Gateway for Containers Frontend.
     * 
     */
    public Output<String> fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * The name which should be used for this Application Gateway for Containers Frontend. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Application Gateway for Containers Frontend. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of tags which should be assigned to the Application Gateway for Containers Frontend.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Application Gateway for Containers Frontend.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LicationLoadBalancerFrontend(java.lang.String name) {
        this(name, LicationLoadBalancerFrontendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicationLoadBalancerFrontend(java.lang.String name, LicationLoadBalancerFrontendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicationLoadBalancerFrontend(java.lang.String name, LicationLoadBalancerFrontendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appconfiguration/licationLoadBalancerFrontend:LicationLoadBalancerFrontend", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LicationLoadBalancerFrontend(java.lang.String name, Output<java.lang.String> id, @Nullable LicationLoadBalancerFrontendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appconfiguration/licationLoadBalancerFrontend:LicationLoadBalancerFrontend", name, state, makeResourceOptions(options, id), false);
    }

    private static LicationLoadBalancerFrontendArgs makeArgs(LicationLoadBalancerFrontendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LicationLoadBalancerFrontendArgs.Empty : args;
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
    public static LicationLoadBalancerFrontend get(java.lang.String name, Output<java.lang.String> id, @Nullable LicationLoadBalancerFrontendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicationLoadBalancerFrontend(name, id, state, options);
    }
}
