// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.orbital;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.orbital.ContactProfileArgs;
import com.pulumi.azure.orbital.inputs.ContactProfileState;
import com.pulumi.azure.orbital.outputs.ContactProfileLink;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Contact profile.
 * 
 * &gt; **Note:** The `azure.orbital.ContactProfile` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
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
 * import com.pulumi.azure.orbital.ContactProfile;
 * import com.pulumi.azure.orbital.ContactProfileArgs;
 * import com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs;
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
 *             .name("rg-example")
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
 *             .name("testsubnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.1.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("orbitalgateway")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("Microsoft.Orbital/orbitalGateways")
 *                     .actions(                    
 *                         "Microsoft.Network/publicIPAddresses/join/action",
 *                         "Microsoft.Network/virtualNetworks/subnets/join/action",
 *                         "Microsoft.Network/virtualNetworks/read",
 *                         "Microsoft.Network/publicIPAddresses/read")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleContactProfile = new ContactProfile("exampleContactProfile", ContactProfileArgs.builder()
 *             .name("example-contact-profile")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .minimumVariableContactDuration("PT1M")
 *             .autoTracking("disabled")
 *             .links(ContactProfileLinkArgs.builder()
 *                 .channels(ContactProfileLinkChannelArgs.builder()
 *                     .name("channelname")
 *                     .bandwidthMhz(100.0)
 *                     .centerFrequencyMhz(101.0)
 *                     .endPoints(ContactProfileLinkChannelEndPointArgs.builder()
 *                         .endPointName("AQUA_command")
 *                         .ipAddress("10.0.1.0")
 *                         .port("49513")
 *                         .protocol("TCP")
 *                         .build())
 *                     .build())
 *                 .direction("Uplink")
 *                 .name("RHCP_UL")
 *                 .polarization("RHCP")
 *                 .build())
 *             .networkConfigurationSubnetId(exampleSubnet.id())
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
 * * `Microsoft.Orbital`: 2022-11-01
 * 
 * ## Import
 * 
 * Contact profile can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:orbital/contactProfile:ContactProfile example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/contactProfiles/contactProfile1
 * ```
 * 
 */
@ResourceType(type="azure:orbital/contactProfile:ContactProfile")
public class ContactProfile extends com.pulumi.resources.CustomResource {
    /**
     * Auto-tracking configurations for a spacecraft. Possible values are `disabled`, `xBand` and `sBand`.
     * 
     */
    @Export(name="autoTracking", refs={String.class}, tree="[0]")
    private Output<String> autoTracking;

    /**
     * @return Auto-tracking configurations for a spacecraft. Possible values are `disabled`, `xBand` and `sBand`.
     * 
     */
    public Output<String> autoTracking() {
        return this.autoTracking;
    }
    /**
     * ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the rights to send telemetry into the hub.
     * 
     */
    @Export(name="eventHubUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventHubUri;

    /**
     * @return ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the rights to send telemetry into the hub.
     * 
     */
    public Output<Optional<String>> eventHubUri() {
        return Codegen.optional(this.eventHubUri);
    }
    /**
     * A list of spacecraft links. A `links` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="links", refs={List.class,ContactProfileLink.class}, tree="[0,1]")
    private Output<List<ContactProfileLink>> links;

    /**
     * @return A list of spacecraft links. A `links` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<ContactProfileLink>> links() {
        return this.links;
    }
    /**
     * The location where the contact profile exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location where the contact profile exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    @Export(name="minimumElevationDegrees", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> minimumElevationDegrees;

    /**
     * @return Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    public Output<Optional<Double>> minimumElevationDegrees() {
        return Codegen.optional(this.minimumElevationDegrees);
    }
    /**
     * Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at a given ground station.
     * 
     */
    @Export(name="minimumVariableContactDuration", refs={String.class}, tree="[0]")
    private Output<String> minimumVariableContactDuration;

    /**
     * @return Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at a given ground station.
     * 
     */
    public Output<String> minimumVariableContactDuration() {
        return this.minimumVariableContactDuration;
    }
    /**
     * The name of the contact profile. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the contact profile. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ARM resource identifier of the subnet delegated to the Microsoft.Orbital/orbitalGateways. Needs to be at least a class C subnet, and should not have any IP created in it. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkConfigurationSubnetId", refs={String.class}, tree="[0]")
    private Output<String> networkConfigurationSubnetId;

    /**
     * @return ARM resource identifier of the subnet delegated to the Microsoft.Orbital/orbitalGateways. Needs to be at least a class C subnet, and should not have any IP created in it. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkConfigurationSubnetId() {
        return this.networkConfigurationSubnetId;
    }
    /**
     * The name of the Resource Group where the contact profile exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the contact profile exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactProfile(java.lang.String name) {
        this(name, ContactProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactProfile(java.lang.String name, ContactProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactProfile(java.lang.String name, ContactProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:orbital/contactProfile:ContactProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ContactProfile(java.lang.String name, Output<java.lang.String> id, @Nullable ContactProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:orbital/contactProfile:ContactProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static ContactProfileArgs makeArgs(ContactProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ContactProfileArgs.Empty : args;
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
    public static ContactProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable ContactProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContactProfile(name, id, state, options);
    }
}
