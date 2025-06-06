// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.AccountNetworkRulesArgs;
import com.pulumi.azure.storage.inputs.AccountNetworkRulesState;
import com.pulumi.azure.storage.outputs.AccountNetworkRulesPrivateLinkAccessRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages network rules inside of a Azure Storage Account.
 * 
 * &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. Spurious changes will occur if both are used against the same Storage Account.
 * 
 * &gt; **Note:** Only one `azure.storage.AccountNetworkRules` can be tied to an `azure.storage.Account`. Spurious changes will occur if more than `azure.storage.AccountNetworkRules` is tied to the same `azure.storage.Account`.
 * 
 * &gt; **Note:** Deleting this resource updates the storage account back to the default values it had when the storage account was created.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.AccountNetworkRules;
 * import com.pulumi.azure.storage.AccountNetworkRulesArgs;
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
 *             .name("example-vnet")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("example-subnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .serviceEndpoints("Microsoft.Storage")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("storageaccountname")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("GRS")
 *             .tags(Map.of("environment", "staging"))
 *             .build());
 * 
 *         var exampleAccountNetworkRules = new AccountNetworkRules("exampleAccountNetworkRules", AccountNetworkRulesArgs.builder()
 *             .storageAccountId(exampleAccount.id())
 *             .defaultAction("Allow")
 *             .ipRules("127.0.0.1")
 *             .virtualNetworkSubnetIds(exampleSubnet.id())
 *             .bypasses("Metrics")
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
 * * `Microsoft.Storage`: 2023-05-01
 * 
 * ## Import
 * 
 * Storage Account Network Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/accountNetworkRules:AccountNetworkRules storageAcc1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount
 * ```
 * 
 */
@ResourceType(type="azure:storage/accountNetworkRules:AccountNetworkRules")
public class AccountNetworkRules extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Valid options are any combination of `Logging`, `Metrics`, `AzureServices`, or `None`. Defaults to `[&#34;AzureServices&#34;]`.
     * 
     * &gt; **Note:** User has to explicitly set `bypass` to empty slice (`[]`) to remove it.
     * 
     */
    @Export(name="bypasses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> bypasses;

    /**
     * @return Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Valid options are any combination of `Logging`, `Metrics`, `AzureServices`, or `None`. Defaults to `[&#34;AzureServices&#34;]`.
     * 
     * &gt; **Note:** User has to explicitly set `bypass` to empty slice (`[]`) to remove it.
     * 
     */
    public Output<List<String>> bypasses() {
        return this.bypasses;
    }
    /**
     * Specifies the default action of allow or deny when no other rules match. Valid options are `Deny` or `Allow`.
     * 
     */
    @Export(name="defaultAction", refs={String.class}, tree="[0]")
    private Output<String> defaultAction;

    /**
     * @return Specifies the default action of allow or deny when no other rules match. Valid options are `Deny` or `Allow`.
     * 
     */
    public Output<String> defaultAction() {
        return this.defaultAction;
    }
    /**
     * List of public IP or IP ranges in CIDR Format. Only IPv4 addresses are allowed. Private IP address ranges (as defined in [RFC 1918](https://tools.ietf.org/html/rfc1918#section-3)) are not allowed.
     * 
     * &gt; **Note:** Small address ranges using &#34;/31&#34; or &#34;/32&#34; prefix sizes are not supported. These ranges should be configured using individual IP address rules without prefix specified.
     * 
     * &gt; **Note:** IP network rules have no effect on requests originating from the same Azure region as the storage account. Use Virtual network rules to allow same-region requests. Services deployed in the same region as the storage account use private Azure IP addresses for communication. Thus, you cannot restrict access to specific Azure services based on their public outbound IP address range.
     * 
     * &gt; **Note:** User has to explicitly set `ip_rules` to empty slice (`[]`) to remove it.
     * 
     */
    @Export(name="ipRules", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipRules;

    /**
     * @return List of public IP or IP ranges in CIDR Format. Only IPv4 addresses are allowed. Private IP address ranges (as defined in [RFC 1918](https://tools.ietf.org/html/rfc1918#section-3)) are not allowed.
     * 
     * &gt; **Note:** Small address ranges using &#34;/31&#34; or &#34;/32&#34; prefix sizes are not supported. These ranges should be configured using individual IP address rules without prefix specified.
     * 
     * &gt; **Note:** IP network rules have no effect on requests originating from the same Azure region as the storage account. Use Virtual network rules to allow same-region requests. Services deployed in the same region as the storage account use private Azure IP addresses for communication. Thus, you cannot restrict access to specific Azure services based on their public outbound IP address range.
     * 
     * &gt; **Note:** User has to explicitly set `ip_rules` to empty slice (`[]`) to remove it.
     * 
     */
    public Output<Optional<List<String>>> ipRules() {
        return Codegen.optional(this.ipRules);
    }
    /**
     * One or more `private_link_access` block as defined below.
     * 
     */
    @Export(name="privateLinkAccessRules", refs={List.class,AccountNetworkRulesPrivateLinkAccessRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccountNetworkRulesPrivateLinkAccessRule>> privateLinkAccessRules;

    /**
     * @return One or more `private_link_access` block as defined below.
     * 
     */
    public Output<Optional<List<AccountNetworkRulesPrivateLinkAccessRule>>> privateLinkAccessRules() {
        return Codegen.optional(this.privateLinkAccessRules);
    }
    /**
     * Specifies the ID of the storage account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", refs={String.class}, tree="[0]")
    private Output<String> storageAccountId;

    /**
     * @return Specifies the ID of the storage account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }
    /**
     * A list of virtual network subnet ids to secure the storage account.
     * 
     * &gt; **Note:** User has to explicitly set `virtual_network_subnet_ids` to empty slice (`[]`) to remove it.
     * 
     */
    @Export(name="virtualNetworkSubnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> virtualNetworkSubnetIds;

    /**
     * @return A list of virtual network subnet ids to secure the storage account.
     * 
     * &gt; **Note:** User has to explicitly set `virtual_network_subnet_ids` to empty slice (`[]`) to remove it.
     * 
     */
    public Output<Optional<List<String>>> virtualNetworkSubnetIds() {
        return Codegen.optional(this.virtualNetworkSubnetIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountNetworkRules(java.lang.String name) {
        this(name, AccountNetworkRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountNetworkRules(java.lang.String name, AccountNetworkRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountNetworkRules(java.lang.String name, AccountNetworkRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/accountNetworkRules:AccountNetworkRules", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccountNetworkRules(java.lang.String name, Output<java.lang.String> id, @Nullable AccountNetworkRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/accountNetworkRules:AccountNetworkRules", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountNetworkRulesArgs makeArgs(AccountNetworkRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountNetworkRulesArgs.Empty : args;
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
    public static AccountNetworkRules get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountNetworkRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountNetworkRules(name, id, state, options);
    }
}
