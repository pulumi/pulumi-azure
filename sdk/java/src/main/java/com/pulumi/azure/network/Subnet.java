// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.SubnetArgs;
import com.pulumi.azure.network.inputs.SubnetState;
import com.pulumi.azure.network.outputs.SubnetDelegation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a subnet. Subnets represent network segments within the IP space defined by the virtual network.
 * 
 * &gt; **NOTE on Virtual Networks and Subnet&#39;s:** This provider currently
 * provides both a standalone Subnet resource, and allows for Subnets to be defined in-line within the Virtual Network resource.
 * At this time you cannot use a Virtual Network with in-line Subnets in conjunction with any Subnet resources. Doing so will cause a conflict of Subnet configurations and will overwrite Subnets.
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
 *             .addressPrefixes("10.0.1.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("delegation")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("Microsoft.ContainerInstance/containerGroups")
 *                     .actions(                    
 *                         "Microsoft.Network/virtualNetworks/subnets/join/action",
 *                         "Microsoft.Network/virtualNetworks/subnets/prepareNetworkPolicies/action")
 *                     .build())
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
 * Subnets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:network/subnet:Subnet exampleSubnet /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/virtualNetworks/myvnet1/subnets/mysubnet1
 * ```
 * 
 */
@ResourceType(type="azure:network/subnet:Subnet")
public class Subnet extends com.pulumi.resources.CustomResource {
    /**
     * The address prefixes to use for the subnet.
     * 
     * &gt; **NOTE:** Currently only a single address prefix can be set as the [Multiple Subnet Address Prefixes Feature](https://github.com/Azure/azure-cli/issues/18194#issuecomment-880484269) is not yet in public preview or general availability.
     * 
     */
    @Export(name="addressPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> addressPrefixes;

    /**
     * @return The address prefixes to use for the subnet.
     * 
     * &gt; **NOTE:** Currently only a single address prefix can be set as the [Multiple Subnet Address Prefixes Feature](https://github.com/Azure/azure-cli/issues/18194#issuecomment-880484269) is not yet in public preview or general availability.
     * 
     */
    public Output<List<String>> addressPrefixes() {
        return this.addressPrefixes;
    }
    /**
     * Enable default outbound access to the internet for the subnet. Defaults to `true`.
     * 
     */
    @Export(name="defaultOutboundAccessEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultOutboundAccessEnabled;

    /**
     * @return Enable default outbound access to the internet for the subnet. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> defaultOutboundAccessEnabled() {
        return Codegen.optional(this.defaultOutboundAccessEnabled);
    }
    /**
     * One or more `delegation` blocks as defined below.
     * 
     */
    @Export(name="delegations", refs={List.class,SubnetDelegation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SubnetDelegation>> delegations;

    /**
     * @return One or more `delegation` blocks as defined below.
     * 
     */
    public Output<Optional<List<SubnetDelegation>>> delegations() {
        return Codegen.optional(this.delegations);
    }
    /**
     * The name of the subnet. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Enable or Disable network policies for the private endpoint on the subnet. Possible values are `Disabled`, `Enabled`, `NetworkSecurityGroupEnabled` and `RouteTableEnabled`. Defaults to `Disabled`.
     * 
     * &gt; **NOTE:** If you don&#39;t want to use network policies like user-defined Routes and Network Security Groups, you need to set `private_endpoint_network_policies` in the subnet to `Disabled`. This setting only applies to Private Endpoints in the Subnet and affects all Private Endpoints in the Subnet. For other resources in the Subnet, access is controlled based via the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource.
     * 
     * &gt; **NOTE:** If you want to use network policies like user-defined Routes and Network Security Groups, you need to set the `private_endpoint_network_policies` in the Subnet to `Enabled`/`NetworkSecurityGroupEnabled`/`RouteTableEnabled`. This setting only applies to Private Endpoints in the Subnet and affects all Private Endpoints in the Subnet. For other resources in the Subnet, access is controlled based via the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource.
     * 
     * &gt; **NOTE:** See more details from [Manage network policies for Private Endpoints](https://learn.microsoft.com/en-gb/azure/private-link/disable-private-endpoint-network-policy?tabs=network-policy-portal).
     * 
     */
    @Export(name="privateEndpointNetworkPolicies", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateEndpointNetworkPolicies;

    /**
     * @return Enable or Disable network policies for the private endpoint on the subnet. Possible values are `Disabled`, `Enabled`, `NetworkSecurityGroupEnabled` and `RouteTableEnabled`. Defaults to `Disabled`.
     * 
     * &gt; **NOTE:** If you don&#39;t want to use network policies like user-defined Routes and Network Security Groups, you need to set `private_endpoint_network_policies` in the subnet to `Disabled`. This setting only applies to Private Endpoints in the Subnet and affects all Private Endpoints in the Subnet. For other resources in the Subnet, access is controlled based via the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource.
     * 
     * &gt; **NOTE:** If you want to use network policies like user-defined Routes and Network Security Groups, you need to set the `private_endpoint_network_policies` in the Subnet to `Enabled`/`NetworkSecurityGroupEnabled`/`RouteTableEnabled`. This setting only applies to Private Endpoints in the Subnet and affects all Private Endpoints in the Subnet. For other resources in the Subnet, access is controlled based via the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource.
     * 
     * &gt; **NOTE:** See more details from [Manage network policies for Private Endpoints](https://learn.microsoft.com/en-gb/azure/private-link/disable-private-endpoint-network-policy?tabs=network-policy-portal).
     * 
     */
    public Output<Optional<String>> privateEndpointNetworkPolicies() {
        return Codegen.optional(this.privateEndpointNetworkPolicies);
    }
    /**
     * Enable or Disable network policies for the private link service on the subnet. Defaults to `true`.
     * 
     * &gt; **NOTE:** When configuring Azure Private Link service, the explicit setting `private_link_service_network_policies_enabled` must be set to `false` in the subnet since Private Link Service does not support network policies like user-defined Routes and Network Security Groups. This setting only affects the Private Link service. For other resources in the subnet, access is controlled based on the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource. See more details from [Manage network policies for Private Link Services](https://learn.microsoft.com/en-gb/azure/private-link/disable-private-link-service-network-policy?tabs=private-link-network-policy-powershell).
     * 
     */
    @Export(name="privateLinkServiceNetworkPoliciesEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateLinkServiceNetworkPoliciesEnabled;

    /**
     * @return Enable or Disable network policies for the private link service on the subnet. Defaults to `true`.
     * 
     * &gt; **NOTE:** When configuring Azure Private Link service, the explicit setting `private_link_service_network_policies_enabled` must be set to `false` in the subnet since Private Link Service does not support network policies like user-defined Routes and Network Security Groups. This setting only affects the Private Link service. For other resources in the subnet, access is controlled based on the Network Security Group which can be configured using the `azure.network.SubnetNetworkSecurityGroupAssociation` resource. See more details from [Manage network policies for Private Link Services](https://learn.microsoft.com/en-gb/azure/private-link/disable-private-link-service-network-policy?tabs=private-link-network-policy-powershell).
     * 
     */
    public Output<Optional<Boolean>> privateLinkServiceNetworkPoliciesEnabled() {
        return Codegen.optional(this.privateLinkServiceNetworkPoliciesEnabled);
    }
    /**
     * The name of the resource group in which to create the subnet. This must be the resource group that the virtual network resides in. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the subnet. This must be the resource group that the virtual network resides in. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The list of IDs of Service Endpoint Policies to associate with the subnet.
     * 
     */
    @Export(name="serviceEndpointPolicyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> serviceEndpointPolicyIds;

    /**
     * @return The list of IDs of Service Endpoint Policies to associate with the subnet.
     * 
     */
    public Output<Optional<List<String>>> serviceEndpointPolicyIds() {
        return Codegen.optional(this.serviceEndpointPolicyIds);
    }
    /**
     * The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage`, `Microsoft.Storage.Global` and `Microsoft.Web`.
     * 
     * &gt; **NOTE:** In order to use `Microsoft.Storage.Global` service endpoint (which allows access to virtual networks in other regions), you must enable the `AllowGlobalTagsForStorage` feature in your subscription. This is currently a preview feature, please see the [official documentation](https://learn.microsoft.com/en-us/azure/storage/common/storage-network-security?tabs=azure-cli#enabling-access-to-virtual-networks-in-other-regions-preview) for more information.
     * 
     */
    @Export(name="serviceEndpoints", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> serviceEndpoints;

    /**
     * @return The list of Service endpoints to associate with the subnet. Possible values include: `Microsoft.AzureActiveDirectory`, `Microsoft.AzureCosmosDB`, `Microsoft.ContainerRegistry`, `Microsoft.EventHub`, `Microsoft.KeyVault`, `Microsoft.ServiceBus`, `Microsoft.Sql`, `Microsoft.Storage`, `Microsoft.Storage.Global` and `Microsoft.Web`.
     * 
     * &gt; **NOTE:** In order to use `Microsoft.Storage.Global` service endpoint (which allows access to virtual networks in other regions), you must enable the `AllowGlobalTagsForStorage` feature in your subscription. This is currently a preview feature, please see the [official documentation](https://learn.microsoft.com/en-us/azure/storage/common/storage-network-security?tabs=azure-cli#enabling-access-to-virtual-networks-in-other-regions-preview) for more information.
     * 
     */
    public Output<Optional<List<String>>> serviceEndpoints() {
        return Codegen.optional(this.serviceEndpoints);
    }
    /**
     * The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualNetworkName", refs={String.class}, tree="[0]")
    private Output<String> virtualNetworkName;

    /**
     * @return The name of the virtual network to which to attach the subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subnet(java.lang.String name) {
        this(name, SubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subnet(java.lang.String name, SubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subnet(java.lang.String name, SubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/subnet:Subnet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Subnet(java.lang.String name, Output<java.lang.String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/subnet:Subnet", name, state, makeResourceOptions(options, id), false);
    }

    private static SubnetArgs makeArgs(SubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SubnetArgs.Empty : args;
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
    public static Subnet get(java.lang.String name, Output<java.lang.String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subnet(name, id, state, options);
    }
}
