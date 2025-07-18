// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.IPGroupCIDRArgs;
import com.pulumi.azure.network.inputs.IPGroupCIDRState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages IP Group CIDR records.
 * 
 * &gt; **Note:** Warning Do not use this resource at the same time as the `cidrs` property of the
 * `azure.network.IPGroup` resource for the same IP Group. Doing so will cause a conflict and
 * CIDRS will be removed.
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
 * import com.pulumi.azure.network.IPGroup;
 * import com.pulumi.azure.network.IPGroupArgs;
 * import com.pulumi.azure.network.IPGroupCIDR;
 * import com.pulumi.azure.network.IPGroupCIDRArgs;
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
 *             .name("test-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleIPGroup = new IPGroup("exampleIPGroup", IPGroupArgs.builder()
 *             .name("test-ipgroup")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleIPGroupCIDR = new IPGroupCIDR("exampleIPGroupCIDR", IPGroupCIDRArgs.builder()
 *             .ipGroupId(exampleIPGroup.id())
 *             .cidr("10.10.10.0/24")
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
 * * `Microsoft.Network`: 2024-05-01
 * 
 * ## Import
 * 
 * IP Group CIDRs can be imported using the `resource id` of the IP Group and
 * 
 * the CIDR value (`/` characters have to be replaced by `_`), e.g.
 * 
 * ```sh
 * $ pulumi import azure:network/iPGroupCIDR:IPGroupCIDR example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/ipGroups/test-ipgroup/cidrs/10.1.0.0_24
 * ```
 * 
 */
@ResourceType(type="azure:network/iPGroupCIDR:IPGroupCIDR")
public class IPGroupCIDR extends com.pulumi.resources.CustomResource {
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    @Export(name="ipGroupId", refs={String.class}, tree="[0]")
    private Output<String> ipGroupId;

    /**
     * @return The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    public Output<String> ipGroupId() {
        return this.ipGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPGroupCIDR(java.lang.String name) {
        this(name, IPGroupCIDRArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPGroupCIDR(java.lang.String name, IPGroupCIDRArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPGroupCIDR(java.lang.String name, IPGroupCIDRArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/iPGroupCIDR:IPGroupCIDR", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IPGroupCIDR(java.lang.String name, Output<java.lang.String> id, @Nullable IPGroupCIDRState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/iPGroupCIDR:IPGroupCIDR", name, state, makeResourceOptions(options, id), false);
    }

    private static IPGroupCIDRArgs makeArgs(IPGroupCIDRArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IPGroupCIDRArgs.Empty : args;
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
    public static IPGroupCIDR get(java.lang.String name, Output<java.lang.String> id, @Nullable IPGroupCIDRState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IPGroupCIDR(name, id, state, options);
    }
}
