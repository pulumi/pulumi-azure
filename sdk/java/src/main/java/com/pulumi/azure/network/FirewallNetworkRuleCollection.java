// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs;
import com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState;
import com.pulumi.azure.network.outputs.FirewallNetworkRuleCollectionRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Network Rule Collection within an Azure Firewall.
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
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.Firewall;
 * import com.pulumi.azure.network.FirewallArgs;
 * import com.pulumi.azure.network.inputs.FirewallIpConfigurationArgs;
 * import com.pulumi.azure.network.FirewallNetworkRuleCollection;
 * import com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs;
 * import com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionRuleArgs;
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
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("testvnet")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("AzureFirewallSubnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.1.0/24")
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp("examplePublicIp", PublicIpArgs.builder()
 *             .name("testpip")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .allocationMethod("Static")
 *             .sku("Standard")
 *             .build());
 * 
 *         var exampleFirewall = new Firewall("exampleFirewall", FirewallArgs.builder()
 *             .name("testfirewall")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("AZFW_VNet")
 *             .skuTier("Standard")
 *             .ipConfigurations(FirewallIpConfigurationArgs.builder()
 *                 .name("configuration")
 *                 .subnetId(exampleSubnet.id())
 *                 .publicIpAddressId(examplePublicIp.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleFirewallNetworkRuleCollection = new FirewallNetworkRuleCollection("exampleFirewallNetworkRuleCollection", FirewallNetworkRuleCollectionArgs.builder()
 *             .name("testcollection")
 *             .azureFirewallName(exampleFirewall.name())
 *             .resourceGroupName(example.name())
 *             .priority(100)
 *             .action("Allow")
 *             .rules(FirewallNetworkRuleCollectionRuleArgs.builder()
 *                 .name("testrule")
 *                 .sourceAddresses("10.0.0.0/16")
 *                 .destinationPorts("53")
 *                 .destinationAddresses(                
 *                     "8.8.8.8",
 *                     "8.8.4.4")
 *                 .protocols(                
 *                     "TCP",
 *                     "UDP")
 *                 .build())
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
 * Azure Firewall Network Rule Collections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/azureFirewalls/myfirewall/networkRuleCollections/mycollection
 * ```
 * 
 */
@ResourceType(type="azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection")
public class FirewallNetworkRuleCollection extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * Specifies the name of the Firewall in which the Network Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="azureFirewallName", refs={String.class}, tree="[0]")
    private Output<String> azureFirewallName;

    /**
     * @return Specifies the name of the Firewall in which the Network Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> azureFirewallName() {
        return this.azureFirewallName;
    }
    /**
     * Specifies the name of the Network Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Network Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `rule` blocks as defined below.
     * 
     */
    @Export(name="rules", refs={List.class,FirewallNetworkRuleCollectionRule.class}, tree="[0,1]")
    private Output<List<FirewallNetworkRuleCollectionRule>> rules;

    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    public Output<List<FirewallNetworkRuleCollectionRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallNetworkRuleCollection(java.lang.String name) {
        this(name, FirewallNetworkRuleCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallNetworkRuleCollection(java.lang.String name, FirewallNetworkRuleCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallNetworkRuleCollection(java.lang.String name, FirewallNetworkRuleCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FirewallNetworkRuleCollection(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallNetworkRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection", name, state, makeResourceOptions(options, id), false);
    }

    private static FirewallNetworkRuleCollectionArgs makeArgs(FirewallNetworkRuleCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirewallNetworkRuleCollectionArgs.Empty : args;
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
    public static FirewallNetworkRuleCollection get(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallNetworkRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallNetworkRuleCollection(name, id, state, options);
    }
}
