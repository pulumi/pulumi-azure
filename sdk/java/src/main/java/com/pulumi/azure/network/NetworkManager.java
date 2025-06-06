// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.NetworkManagerArgs;
import com.pulumi.azure.network.inputs.NetworkManagerState;
import com.pulumi.azure.network.outputs.NetworkManagerCrossTenantScope;
import com.pulumi.azure.network.outputs.NetworkManagerScope;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Network Manager.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.inputs.GetSubscriptionArgs;
 * import com.pulumi.azure.network.NetworkManager;
 * import com.pulumi.azure.network.NetworkManagerArgs;
 * import com.pulumi.azure.network.inputs.NetworkManagerScopeArgs;
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
 *             .location("West Europe")
 *             .build());
 * 
 *         final var current = CoreFunctions.getSubscription(GetSubscriptionArgs.builder()
 *             .build());
 * 
 *         var exampleNetworkManager = new NetworkManager("exampleNetworkManager", NetworkManagerArgs.builder()
 *             .name("example-network-manager")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .scope(NetworkManagerScopeArgs.builder()
 *                 .subscriptionIds(current.id())
 *                 .build())
 *             .scopeAccesses(            
 *                 "Connectivity",
 *                 "SecurityAdmin")
 *             .description("example network manager")
 *             .tags(Map.of("foo", "bar"))
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
 * Network Manager can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:network/networkManager:NetworkManager example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/networkManagers/networkManager1
 * ```
 * 
 */
@ResourceType(type="azure:network/networkManager:NetworkManager")
public class NetworkManager extends com.pulumi.resources.CustomResource {
    /**
     * One or more `cross_tenant_scopes` blocks as defined below.
     * 
     */
    @Export(name="crossTenantScopes", refs={List.class,NetworkManagerCrossTenantScope.class}, tree="[0,1]")
    private Output<List<NetworkManagerCrossTenantScope>> crossTenantScopes;

    /**
     * @return One or more `cross_tenant_scopes` blocks as defined below.
     * 
     */
    public Output<List<NetworkManagerCrossTenantScope>> crossTenantScopes() {
        return this.crossTenantScopes;
    }
    /**
     * A description of the Network Manager.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the Network Manager.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `scope` block as defined below.
     * 
     */
    @Export(name="scope", refs={NetworkManagerScope.class}, tree="[0]")
    private Output<NetworkManagerScope> scope;

    /**
     * @return A `scope` block as defined below.
     * 
     */
    public Output<NetworkManagerScope> scope() {
        return this.scope;
    }
    /**
     * A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
     * 
     */
    @Export(name="scopeAccesses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scopeAccesses;

    /**
     * @return A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
     * 
     */
    public Output<Optional<List<String>>> scopeAccesses() {
        return Codegen.optional(this.scopeAccesses);
    }
    /**
     * A mapping of tags which should be assigned to the Network Manager.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Network Manager.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkManager(java.lang.String name) {
        this(name, NetworkManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkManager(java.lang.String name, NetworkManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkManager(java.lang.String name, NetworkManagerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkManager:NetworkManager", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkManager(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkManagerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkManager:NetworkManager", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkManagerArgs makeArgs(NetworkManagerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkManagerArgs.Empty : args;
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
    public static NetworkManager get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkManagerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkManager(name, id, state, options);
    }
}
