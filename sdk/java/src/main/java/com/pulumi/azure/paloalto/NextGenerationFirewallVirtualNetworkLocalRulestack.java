// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackState;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile;
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
 * Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack.
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
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.NetworkSecurityGroup;
 * import com.pulumi.azure.network.NetworkSecurityGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociation;
 * import com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs;
 * import com.pulumi.azure.paloalto.LocalRulestack;
 * import com.pulumi.azure.paloalto.LocalRulestackArgs;
 * import com.pulumi.azure.paloalto.LocalRulestackRule;
 * import com.pulumi.azure.paloalto.LocalRulestackRuleArgs;
 * import com.pulumi.azure.paloalto.inputs.LocalRulestackRuleDestinationArgs;
 * import com.pulumi.azure.paloalto.inputs.LocalRulestackRuleSourceArgs;
 * import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestack;
 * import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkLocalRulestackArgs;
 * import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs;
 * import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfigurationArgs;
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
 *             .name("example-resource-group")
 *             .location("westeurope")
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp("examplePublicIp", PublicIpArgs.builder()
 *             .name("example-public-ip")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .allocationMethod("Static")
 *             .sku("Standard")
 *             .build());
 * 
 *         var exampleNetworkSecurityGroup = new NetworkSecurityGroup("exampleNetworkSecurityGroup", NetworkSecurityGroupArgs.builder()
 *             .name("example-nsg")
 *             .location(test.location())
 *             .resourceGroupName(test.name())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("example-vnet")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tags(Map.of("environment", "Production"))
 *             .build());
 * 
 *         var trust = new Subnet("trust", SubnetArgs.builder()
 *             .name("example-trust-subnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.1.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("trusted")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("PaloAltoNetworks.Cloudngfw/firewalls")
 *                     .actions("Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var trustSubnetNetworkSecurityGroupAssociation = new SubnetNetworkSecurityGroupAssociation("trustSubnetNetworkSecurityGroupAssociation", SubnetNetworkSecurityGroupAssociationArgs.builder()
 *             .subnetId(trust.id())
 *             .networkSecurityGroupId(exampleNetworkSecurityGroup.id())
 *             .build());
 * 
 *         var untrust = new Subnet("untrust", SubnetArgs.builder()
 *             .name("example-untrust-subnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("untrusted")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("PaloAltoNetworks.Cloudngfw/firewalls")
 *                     .actions("Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var untrustSubnetNetworkSecurityGroupAssociation = new SubnetNetworkSecurityGroupAssociation("untrustSubnetNetworkSecurityGroupAssociation", SubnetNetworkSecurityGroupAssociationArgs.builder()
 *             .subnetId(untrust.id())
 *             .networkSecurityGroupId(exampleNetworkSecurityGroup.id())
 *             .build());
 * 
 *         var exampleLocalRulestack = new LocalRulestack("exampleLocalRulestack", LocalRulestackArgs.builder()
 *             .name("example-rulestack")
 *             .resourceGroupName(example.name())
 *             .location(example.locatio())
 *             .build());
 * 
 *         var exampleLocalRulestackRule = new LocalRulestackRule("exampleLocalRulestackRule", LocalRulestackRuleArgs.builder()
 *             .name("example-rulestack-rule")
 *             .rulestackId(exampleLocalRulestack.id())
 *             .priority(1001)
 *             .action("Allow")
 *             .applications("any")
 *             .destination(LocalRulestackRuleDestinationArgs.builder()
 *                 .cidrs("any")
 *                 .build())
 *             .source(LocalRulestackRuleSourceArgs.builder()
 *                 .cidrs("any")
 *                 .build())
 *             .build());
 * 
 *         var exampleNextGenerationFirewallVirtualNetworkLocalRulestack = new NextGenerationFirewallVirtualNetworkLocalRulestack("exampleNextGenerationFirewallVirtualNetworkLocalRulestack", NextGenerationFirewallVirtualNetworkLocalRulestackArgs.builder()
 *             .name("example-ngfwvn")
 *             .resourceGroupName(example.name())
 *             .rulestackId(exampleLocalRulestack.id())
 *             .networkProfile(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs.builder()
 *                 .publicIpAddressIds(examplePublicIp.id())
 *                 .vnetConfiguration(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfigurationArgs.builder()
 *                     .virtualNetworkId(exampleVirtualNetwork.id())
 *                     .trustedSubnetId(trust.id())
 *                     .untrustedSubnetId(untrust.id())
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
 * * `PaloAltoNetworks.Cloudngfw`: 2023-09-01, 2022-08-29
 * 
 * ## Import
 * 
 * Palo Alto Next Generation Firewall Virtual Network Local Rulestacks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetRulestackFW
 * ```
 * 
 */
@ResourceType(type="azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack")
public class NextGenerationFirewallVirtualNetworkLocalRulestack extends com.pulumi.resources.CustomResource {
    /**
     * One or more `destination_nat` blocks as defined below.
     * 
     */
    @Export(name="destinationNats", refs={List.class,NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>> destinationNats;

    /**
     * @return One or more `destination_nat` blocks as defined below.
     * 
     */
    public Output<Optional<List<NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>>> destinationNats() {
        return Codegen.optional(this.destinationNats);
    }
    /**
     * A `dns_settings` block as defined below.
     * 
     */
    @Export(name="dnsSettings", refs={NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings.class}, tree="[0]")
    private Output</* @Nullable */ NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings> dnsSettings;

    /**
     * @return A `dns_settings` block as defined below.
     * 
     */
    public Output<Optional<NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings>> dnsSettings() {
        return Codegen.optional(this.dnsSettings);
    }
    /**
     * The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="marketplaceOfferId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> marketplaceOfferId;

    /**
     * @return The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> marketplaceOfferId() {
        return Codegen.optional(this.marketplaceOfferId);
    }
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network_profile` block as defined below.
     * 
     */
    @Export(name="networkProfile", refs={NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile.class}, tree="[0]")
    private Output<NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile> networkProfile;

    /**
     * @return A `network_profile` block as defined below.
     * 
     */
    public Output<NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile> networkProfile() {
        return this.networkProfile;
    }
    /**
     * The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     * 
     * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
     * 
     */
    @Export(name="planId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> planId;

    /**
     * @return The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
     * 
     * &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
     * 
     */
    public Output<Optional<String>> planId() {
        return Codegen.optional(this.planId);
    }
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     * 
     */
    @Export(name="rulestackId", refs={String.class}, tree="[0]")
    private Output<String> rulestackId;

    /**
     * @return The ID of the Local Rulestack which will be used to configure this Firewall Resource.
     * 
     */
    public Output<String> rulestackId() {
        return this.rulestackId;
    }
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NextGenerationFirewallVirtualNetworkLocalRulestack(java.lang.String name) {
        this(name, NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NextGenerationFirewallVirtualNetworkLocalRulestack(java.lang.String name, NextGenerationFirewallVirtualNetworkLocalRulestackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NextGenerationFirewallVirtualNetworkLocalRulestack(java.lang.String name, NextGenerationFirewallVirtualNetworkLocalRulestackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NextGenerationFirewallVirtualNetworkLocalRulestack(java.lang.String name, Output<java.lang.String> id, @Nullable NextGenerationFirewallVirtualNetworkLocalRulestackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, state, makeResourceOptions(options, id), false);
    }

    private static NextGenerationFirewallVirtualNetworkLocalRulestackArgs makeArgs(NextGenerationFirewallVirtualNetworkLocalRulestackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NextGenerationFirewallVirtualNetworkLocalRulestackArgs.Empty : args;
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
    public static NextGenerationFirewallVirtualNetworkLocalRulestack get(java.lang.String name, Output<java.lang.String> id, @Nullable NextGenerationFirewallVirtualNetworkLocalRulestackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NextGenerationFirewallVirtualNetworkLocalRulestack(name, id, state, options);
    }
}
