// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.postgresql.VirtualNetworkRuleArgs;
import com.pulumi.azure.postgresql.inputs.VirtualNetworkRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a PostgreSQL Virtual Network Rule.
 * 
 * &gt; **Note:** PostgreSQL Virtual Network Rules [can only be used with SKU Tiers of `GeneralPurpose` or `MemoryOptimized`](https://docs.microsoft.com/azure/postgresql/concepts-data-access-and-security-vnet)
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
 * import com.pulumi.azure.postgresql.Server;
 * import com.pulumi.azure.postgresql.ServerArgs;
 * import com.pulumi.azure.postgresql.VirtualNetworkRule;
 * import com.pulumi.azure.postgresql.VirtualNetworkRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("example-vnet")
 *             .addressSpaces("10.7.29.0/29")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var internal = new Subnet("internal", SubnetArgs.builder()
 *             .name("internal")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.7.29.0/29")
 *             .serviceEndpoints("Microsoft.Sql")
 *             .build());
 * 
 *         var exampleServer = new Server("exampleServer", ServerArgs.builder()
 *             .name("postgresql-server-1")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("GP_Gen5_2")
 *             .storageMb(5120)
 *             .backupRetentionDays(7)
 *             .administratorLogin("psqladmin")
 *             .administratorLoginPassword("H}{@literal @}{@code Sh1CoR3!")
 *             .version("9.5")
 *             .sslEnforcementEnabled(true)
 *             .build());
 * 
 *         var exampleVirtualNetworkRule = new VirtualNetworkRule("exampleVirtualNetworkRule", VirtualNetworkRuleArgs.builder()
 *             .name("postgresql-vnet-rule")
 *             .resourceGroupName(example.name())
 *             .serverName(exampleServer.name())
 *             .subnetId(internal.id())
 *             .ignoreMissingVnetServiceEndpoint(true)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.DBforPostgreSQL`: 2017-12-01
 * 
 * ## Import
 * 
 * PostgreSQL Virtual Network Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:postgresql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DBforPostgreSQL/servers/myserver/virtualNetworkRules/vnetrulename
 * ```
 * 
 */
@ResourceType(type="azure:postgresql/virtualNetworkRule:VirtualNetworkRule")
public class VirtualNetworkRule extends com.pulumi.resources.CustomResource {
    /**
     * Should the Virtual Network Rule be created before the Subnet has the Virtual Network Service Endpoint enabled?
     * 
     */
    @Export(name="ignoreMissingVnetServiceEndpoint", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Should the Virtual Network Rule be created before the Subnet has the Virtual Network Service Endpoint enabled?
     * 
     */
    public Output<Optional<Boolean>> ignoreMissingVnetServiceEndpoint() {
        return Codegen.optional(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * The name of the PostgreSQL virtual network rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     * 
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the PostgreSQL virtual network rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     * 
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group where the PostgreSQL server resides. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the PostgreSQL server resides. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the SQL Server to which this PostgreSQL virtual network rule will be applied to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverName", refs={String.class}, tree="[0]")
    private Output<String> serverName;

    /**
     * @return The name of the SQL Server to which this PostgreSQL virtual network rule will be applied to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }
    /**
     * The ID of the subnet that the PostgreSQL server will be connected to.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet that the PostgreSQL server will be connected to.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkRule(java.lang.String name) {
        this(name, VirtualNetworkRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkRule(java.lang.String name, VirtualNetworkRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkRule(java.lang.String name, VirtualNetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/virtualNetworkRule:VirtualNetworkRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VirtualNetworkRule(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualNetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/virtualNetworkRule:VirtualNetworkRule", name, state, makeResourceOptions(options, id), false);
    }

    private static VirtualNetworkRuleArgs makeArgs(VirtualNetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VirtualNetworkRuleArgs.Empty : args;
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
    public static VirtualNetworkRule get(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualNetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkRule(name, id, state, options);
    }
}
