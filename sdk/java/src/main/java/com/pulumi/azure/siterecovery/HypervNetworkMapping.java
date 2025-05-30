// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.HypervNetworkMappingArgs;
import com.pulumi.azure.siterecovery.inputs.HypervNetworkMappingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure.
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
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.siterecovery.HypervNetworkMapping;
 * import com.pulumi.azure.siterecovery.HypervNetworkMappingArgs;
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
 *         var target = new ResourceGroup("target", ResourceGroupArgs.builder()
 *             .name("tfex-network-mapping")
 *             .location("East US")
 *             .build());
 * 
 *         var vault = new Vault("vault", VaultArgs.builder()
 *             .name("example-recovery-vault")
 *             .location(target.location())
 *             .resourceGroupName(target.name())
 *             .sku("Standard")
 *             .build());
 * 
 *         var targetVirtualNetwork = new VirtualNetwork("targetVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("network")
 *             .resourceGroupName(target.name())
 *             .addressSpaces("192.168.2.0/24")
 *             .location(target.location())
 *             .build());
 * 
 *         var recovery_mapping = new HypervNetworkMapping("recovery-mapping", HypervNetworkMappingArgs.builder()
 *             .name("recovery-network-mapping")
 *             .recoveryVaultId(vault.id())
 *             .sourceSystemCenterVirtualMachineManagerName("my-vmm-server")
 *             .sourceNetworkName("my-vmm-network")
 *             .targetNetworkId(targetVirtualNetwork.id())
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
 * * `Microsoft.RecoveryServices`: 2024-04-01
 * 
 * ## Import
 * 
 * Site Recovery Network Mapping can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping  azurerm_site_recovery_hyperv_network_mapping.mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/primary-fabric-name/replicationNetworks/azureNetwork/replicationNetworkMappings/mapping-name
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping")
public class HypervNetworkMapping extends com.pulumi.resources.CustomResource {
    /**
     * The name of the HyperV network mapping. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the HyperV network mapping. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultId", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultId;

    /**
     * @return The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }
    /**
     * The Name of the primary network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceNetworkName", refs={String.class}, tree="[0]")
    private Output<String> sourceNetworkName;

    /**
     * @return The Name of the primary network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourceNetworkName() {
        return this.sourceNetworkName;
    }
    /**
     * Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceSystemCenterVirtualMachineManagerName", refs={String.class}, tree="[0]")
    private Output<String> sourceSystemCenterVirtualMachineManagerName;

    /**
     * @return Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourceSystemCenterVirtualMachineManagerName() {
        return this.sourceSystemCenterVirtualMachineManagerName;
    }
    /**
     * The id of the recovery network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="targetNetworkId", refs={String.class}, tree="[0]")
    private Output<String> targetNetworkId;

    /**
     * @return The id of the recovery network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HypervNetworkMapping(java.lang.String name) {
        this(name, HypervNetworkMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HypervNetworkMapping(java.lang.String name, HypervNetworkMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HypervNetworkMapping(java.lang.String name, HypervNetworkMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HypervNetworkMapping(java.lang.String name, Output<java.lang.String> id, @Nullable HypervNetworkMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping", name, state, makeResourceOptions(options, id), false);
    }

    private static HypervNetworkMappingArgs makeArgs(HypervNetworkMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HypervNetworkMappingArgs.Empty : args;
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
    public static HypervNetworkMapping get(java.lang.String name, Output<java.lang.String> id, @Nullable HypervNetworkMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HypervNetworkMapping(name, id, state, options);
    }
}
