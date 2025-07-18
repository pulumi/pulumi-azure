// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualNetworkPeeringArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkPeeringState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a virtual network peering which allows resources to access other
 * resources in the linked virtual network.
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
 * import com.pulumi.azure.network.VirtualNetworkPeering;
 * import com.pulumi.azure.network.VirtualNetworkPeeringArgs;
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
 *             .name("peeredvnets-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var example_1 = new VirtualNetwork("example-1", VirtualNetworkArgs.builder()
 *             .name("peternetwork1")
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.0.1.0/24")
 *             .location(example.location())
 *             .build());
 * 
 *         var example_2 = new VirtualNetwork("example-2", VirtualNetworkArgs.builder()
 *             .name("peternetwork2")
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.0.2.0/24")
 *             .location(example.location())
 *             .build());
 * 
 *         var example_1VirtualNetworkPeering = new VirtualNetworkPeering("example-1VirtualNetworkPeering", VirtualNetworkPeeringArgs.builder()
 *             .name("peer1to2")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(example_1.name())
 *             .remoteVirtualNetworkId(example_2.id())
 *             .build());
 * 
 *         var example_2VirtualNetworkPeering = new VirtualNetworkPeering("example-2VirtualNetworkPeering", VirtualNetworkPeeringArgs.builder()
 *             .name("peer2to1")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(example_2.name())
 *             .remoteVirtualNetworkId(example_1.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Triggers)
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
 * import com.pulumi.azure.network.VirtualNetworkPeering;
 * import com.pulumi.azure.network.VirtualNetworkPeeringArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.JoinArgs;
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
 *             .name("peeredvnets-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var example_1 = new VirtualNetwork("example-1", VirtualNetworkArgs.builder()
 *             .name("peternetwork1")
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.0.1.0/24")
 *             .location(example.location())
 *             .build());
 * 
 *         var example_2 = new VirtualNetwork("example-2", VirtualNetworkArgs.builder()
 *             .name("peternetwork2")
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.0.2.0/24")
 *             .location(example.location())
 *             .build());
 * 
 *         var example_1VirtualNetworkPeering = new VirtualNetworkPeering("example-1VirtualNetworkPeering", VirtualNetworkPeeringArgs.builder()
 *             .name("peer1to2")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(example_1.name())
 *             .remoteVirtualNetworkId(example_2.id())
 *             .triggers(Map.of("remote_address_space", example_2.addressSpaces().applyValue(_addressSpaces -> StdFunctions.join(JoinArgs.builder()
 *                 .separator(",")
 *                 .input(_addressSpaces)
 *                 .build())).applyValue(_invoke -> _invoke.result())))
 *             .build());
 * 
 *         var example_2VirtualNetworkPeering = new VirtualNetworkPeering("example-2VirtualNetworkPeering", VirtualNetworkPeeringArgs.builder()
 *             .name("peer2to1")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(example_2.name())
 *             .remoteVirtualNetworkId(example_1.id())
 *             .triggers(Map.of("remote_address_space", example_1.addressSpaces().applyValue(_addressSpaces -> StdFunctions.join(JoinArgs.builder()
 *                 .separator(",")
 *                 .input(_addressSpaces)
 *                 .build())).applyValue(_invoke -> _invoke.result())))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Note
 * 
 * Virtual Network peerings cannot be created, updated or deleted concurrently.
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
 * Virtual Network Peerings can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:network/virtualNetworkPeering:VirtualNetworkPeering examplePeering /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/virtualNetworks/myvnet1/virtualNetworkPeerings/myvnet1peering
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualNetworkPeering:VirtualNetworkPeering")
public class VirtualNetworkPeering extends com.pulumi.resources.CustomResource {
    /**
     * Controls if forwarded traffic from VMs in the remote virtual network is allowed. Defaults to `false`.
     * 
     */
    @Export(name="allowForwardedTraffic", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowForwardedTraffic;

    /**
     * @return Controls if forwarded traffic from VMs in the remote virtual network is allowed. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> allowForwardedTraffic() {
        return Codegen.optional(this.allowForwardedTraffic);
    }
    /**
     * Controls gatewayLinks can be used in the remote virtual network’s link to the local virtual network. Defaults to `false`.
     * 
     */
    @Export(name="allowGatewayTransit", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowGatewayTransit;

    /**
     * @return Controls gatewayLinks can be used in the remote virtual network’s link to the local virtual network. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> allowGatewayTransit() {
        return Codegen.optional(this.allowGatewayTransit);
    }
    /**
     * Controls if the traffic from the local virtual network can reach the remote virtual network. Defaults to `true`.
     * 
     */
    @Export(name="allowVirtualNetworkAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowVirtualNetworkAccess;

    /**
     * @return Controls if the traffic from the local virtual network can reach the remote virtual network. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> allowVirtualNetworkAccess() {
        return Codegen.optional(this.allowVirtualNetworkAccess);
    }
    /**
     * A list of local Subnet names that are Subnet peered with remote Virtual Network.
     * 
     */
    @Export(name="localSubnetNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> localSubnetNames;

    /**
     * @return A list of local Subnet names that are Subnet peered with remote Virtual Network.
     * 
     */
    public Output<Optional<List<String>>> localSubnetNames() {
        return Codegen.optional(this.localSubnetNames);
    }
    /**
     * The name of the virtual network peering. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the virtual network peering. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether only IPv6 address space is peered for Subnet peering. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="onlyIpv6PeeringEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onlyIpv6PeeringEnabled;

    /**
     * @return Specifies whether only IPv6 address space is peered for Subnet peering. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> onlyIpv6PeeringEnabled() {
        return Codegen.optional(this.onlyIpv6PeeringEnabled);
    }
    /**
     * Specifies whether complete Virtual Network address space is peered. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="peerCompleteVirtualNetworksEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> peerCompleteVirtualNetworksEnabled;

    /**
     * @return Specifies whether complete Virtual Network address space is peered. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> peerCompleteVirtualNetworksEnabled() {
        return Codegen.optional(this.peerCompleteVirtualNetworksEnabled);
    }
    /**
     * A list of remote Subnet names from remote Virtual Network that are Subnet peered.
     * 
     */
    @Export(name="remoteSubnetNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> remoteSubnetNames;

    /**
     * @return A list of remote Subnet names from remote Virtual Network that are Subnet peered.
     * 
     */
    public Output<Optional<List<String>>> remoteSubnetNames() {
        return Codegen.optional(this.remoteSubnetNames);
    }
    /**
     * The full Azure resource ID of the remote virtual network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="remoteVirtualNetworkId", refs={String.class}, tree="[0]")
    private Output<String> remoteVirtualNetworkId;

    /**
     * @return The full Azure resource ID of the remote virtual network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> remoteVirtualNetworkId() {
        return this.remoteVirtualNetworkId;
    }
    /**
     * The name of the resource group in which to create the virtual network peering. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the virtual network peering. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of key values pairs that can be used to sync network routes from the remote virtual network to the local virtual network. See the trigger example for an example on how to set it up.
     * 
     */
    @Export(name="triggers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> triggers;

    /**
     * @return A mapping of key values pairs that can be used to sync network routes from the remote virtual network to the local virtual network. See the trigger example for an example on how to set it up.
     * 
     */
    public Output<Optional<Map<String,String>>> triggers() {
        return Codegen.optional(this.triggers);
    }
    /**
     * Controls if remote gateways can be used on the local virtual network. If the flag is set to `true`, and `allow_gateway_transit` on the remote peering is also `true`, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to `true`. This flag cannot be set if virtual network already has a gateway. Defaults to `false`.
     * 
     * &gt; **Note:** `use_remote_gateways` must be set to `false` if using Global Virtual Network Peerings.
     * 
     */
    @Export(name="useRemoteGateways", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useRemoteGateways;

    /**
     * @return Controls if remote gateways can be used on the local virtual network. If the flag is set to `true`, and `allow_gateway_transit` on the remote peering is also `true`, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to `true`. This flag cannot be set if virtual network already has a gateway. Defaults to `false`.
     * 
     * &gt; **Note:** `use_remote_gateways` must be set to `false` if using Global Virtual Network Peerings.
     * 
     */
    public Output<Optional<Boolean>> useRemoteGateways() {
        return Codegen.optional(this.useRemoteGateways);
    }
    /**
     * The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualNetworkName", refs={String.class}, tree="[0]")
    private Output<String> virtualNetworkName;

    /**
     * @return The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkPeering(java.lang.String name) {
        this(name, VirtualNetworkPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkPeering(java.lang.String name, VirtualNetworkPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkPeering(java.lang.String name, VirtualNetworkPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkPeering:VirtualNetworkPeering", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VirtualNetworkPeering(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualNetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkPeering:VirtualNetworkPeering", name, state, makeResourceOptions(options, id), false);
    }

    private static VirtualNetworkPeeringArgs makeArgs(VirtualNetworkPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VirtualNetworkPeeringArgs.Empty : args;
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
    public static VirtualNetworkPeering get(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualNetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkPeering(name, id, state, options);
    }
}
