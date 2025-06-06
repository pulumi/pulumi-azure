// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatedns.ResolverOutboundEndpointArgs;
import com.pulumi.azure.privatedns.inputs.ResolverOutboundEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Private DNS Resolver Outbound Endpoint.
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
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.privatedns.Resolver;
 * import com.pulumi.azure.privatedns.ResolverArgs;
 * import com.pulumi.azure.privatedns.ResolverOutboundEndpoint;
 * import com.pulumi.azure.privatedns.ResolverOutboundEndpointArgs;
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
 *             .name("example-resources")
 *             .location("west europe")
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("example-vnet")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .addressSpaces("10.0.0.0/16")
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("outbounddns")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.0.64/28")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("Microsoft.Network.dnsResolvers")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .actions("Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .name("Microsoft.Network/dnsResolvers")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleResolver = new Resolver("exampleResolver", ResolverArgs.builder()
 *             .name("example-resolver")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .virtualNetworkId(exampleVirtualNetwork.id())
 *             .build());
 * 
 *         var exampleResolverOutboundEndpoint = new ResolverOutboundEndpoint("exampleResolverOutboundEndpoint", ResolverOutboundEndpointArgs.builder()
 *             .name("example-endpoint")
 *             .privateDnsResolverId(exampleResolver.id())
 *             .location(exampleResolver.location())
 *             .subnetId(exampleSubnet.id())
 *             .tags(Map.of("key", "value"))
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
 * * `Microsoft.Network`: 2022-07-01
 * 
 * ## Import
 * 
 * Private DNS Resolver Outbound Endpoint can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsResolvers/dnsResolver1/outboundEndpoints/outboundEndpoint1
 * ```
 * 
 */
@ResourceType(type="azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint")
public class ResolverOutboundEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    @Export(name="privateDnsResolverId", refs={String.class}, tree="[0]")
    private Output<String> privateDnsResolverId;

    /**
     * @return Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
     * 
     */
    public Output<String> privateDnsResolverId() {
        return this.privateDnsResolverId;
    }
    /**
     * The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverOutboundEndpoint(java.lang.String name) {
        this(name, ResolverOutboundEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverOutboundEndpoint(java.lang.String name, ResolverOutboundEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverOutboundEndpoint(java.lang.String name, ResolverOutboundEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ResolverOutboundEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable ResolverOutboundEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static ResolverOutboundEndpointArgs makeArgs(ResolverOutboundEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResolverOutboundEndpointArgs.Empty : args;
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
    public static ResolverOutboundEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable ResolverOutboundEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverOutboundEndpoint(name, id, state, options);
    }
}
