// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs;
import com.pulumi.azure.network.inputs.NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages the association between a Network Interface and a Application Gateway&#39;s Backend Address Pool.
 * 
 * ## Import
 * 
 * Associations between Network Interfaces and Application Gateway Backend Address Pools can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation:NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation association1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.network/networkInterfaces/nic1/ipConfigurations/example|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/applicationGateways/gateway1/backendAddressPools/pool1
 * ```
 * 
 */
@ResourceType(type="azure:network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation:NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation")
public class NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Application Gateway&#39;s Backend Address Pool which this Network Interface which should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="backendAddressPoolId", type=String.class, parameters={})
    private Output<String> backendAddressPoolId;

    /**
     * @return The ID of the Application Gateway&#39;s Backend Address Pool which this Network Interface which should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> backendAddressPoolId() {
        return this.backendAddressPoolId;
    }
    /**
     * The Name of the IP Configuration within the Network Interface which should be connected to the Backend Address Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ipConfigurationName", type=String.class, parameters={})
    private Output<String> ipConfigurationName;

    /**
     * @return The Name of the IP Configuration within the Network Interface which should be connected to the Backend Address Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> ipConfigurationName() {
        return this.ipConfigurationName;
    }
    /**
     * The ID of the Network Interface. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the Network Interface. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(String name) {
        this(name, NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(String name, NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(String name, NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation:NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation", name, args == null ? NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(String name, Output<String> id, @Nullable NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation:NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation", name, state, makeResourceOptions(options, id));
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
    public static NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation get(String name, Output<String> id, @Nullable NetworkInterfaceApplicationGatewayBackendAddressPoolAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation(name, id, state, options);
    }
}