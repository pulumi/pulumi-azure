// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.VirtualNetworkRuleArgs;
import com.pulumi.azure.mssql.inputs.VirtualNetworkRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network.
 * 
 * ## Example Usage
 * ```java
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
 * import com.pulumi.azure.mssql.Server;
 * import com.pulumi.azure.mssql.ServerArgs;
 * import com.pulumi.azure.mssql.VirtualNetworkRule;
 * import com.pulumi.azure.mssql.VirtualNetworkRuleArgs;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.7.29.0/29&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.7.29.0/29&#34;)
 *             .serviceEndpoints(&#34;Microsoft.Sql&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetworkRule = new VirtualNetworkRule(&#34;exampleVirtualNetworkRule&#34;, VirtualNetworkRuleArgs.builder()        
 *             .serverId(exampleServer.id())
 *             .subnetId(exampleSubnet.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SQL Virtual Network Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/virtualNetworkRules/vnetrulename
 * ```
 * 
 */
@ResourceType(type="azure:mssql/virtualNetworkRule:VirtualNetworkRule")
public class VirtualNetworkRule extends com.pulumi.resources.CustomResource {
    /**
     * Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     * 
     */
    @Export(name="ignoreMissingVnetServiceEndpoint", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> ignoreMissingVnetServiceEndpoint() {
        return Codegen.optional(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * The ID of the subnet from which the SQL server will accept communications.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet from which the SQL server will accept communications.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkRule(String name) {
        this(name, VirtualNetworkRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/virtualNetworkRule:VirtualNetworkRule", name, args == null ? VirtualNetworkRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkRule(String name, Output<String> id, @Nullable VirtualNetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/virtualNetworkRule:VirtualNetworkRule", name, state, makeResourceOptions(options, id));
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
    public static VirtualNetworkRule get(String name, Output<String> id, @Nullable VirtualNetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkRule(name, id, state, options);
    }
}