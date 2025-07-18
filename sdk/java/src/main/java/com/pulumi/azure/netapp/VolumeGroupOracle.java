// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.netapp.VolumeGroupOracleArgs;
import com.pulumi.azure.netapp.inputs.VolumeGroupOracleState;
import com.pulumi.azure.netapp.outputs.VolumeGroupOracleVolume;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.azure.netapp.Account;
 * import com.pulumi.azure.netapp.AccountArgs;
 * import com.pulumi.azure.netapp.Pool;
 * import com.pulumi.azure.netapp.PoolArgs;
 * import com.pulumi.azure.netapp.VolumeGroupOracle;
 * import com.pulumi.azure.netapp.VolumeGroupOracleArgs;
 * import com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *             .name(String.format("%s-resources", prefix))
 *             .location(location)
 *             .tags(Map.of("SkipNRMSNSG", "true"))
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name(String.format("%s-vnet", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.88.0.0/16")
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name(String.format("%s-delegated-subnet", prefix))
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.88.2.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("exampledelegation")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("Microsoft.Netapp/volumes")
 *                     .actions(                    
 *                         "Microsoft.Network/networkinterfaces/*",
 *                         "Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name(String.format("%s-netapp-account", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleSubnet)
 *                 .build());
 * 
 *         var examplePool = new Pool("examplePool", PoolArgs.builder()
 *             .name(String.format("%s-netapp-pool", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .accountName(exampleAccount.name())
 *             .serviceLevel("Standard")
 *             .sizeInTb(4)
 *             .qosType("Manual")
 *             .build());
 * 
 *         var exampleVolumeGroupOracle = new VolumeGroupOracle("exampleVolumeGroupOracle", VolumeGroupOracleArgs.builder()
 *             .name(String.format("%s-NetAppVolumeGroupOracle", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .accountName(exampleAccount.name())
 *             .groupDescription("Example volume group for Oracle")
 *             .applicationIdentifier("TST")
 *             .volumes(            
 *                 VolumeGroupOracleVolumeArgs.builder()
 *                     .name(String.format("%s-volume-ora1", prefix))
 *                     .volumePath(String.format("%s-my-unique-file-ora-path-1", prefix))
 *                     .serviceLevel("Standard")
 *                     .capacityPoolId(examplePool.id())
 *                     .subnetId(exampleSubnet.id())
 *                     .zone("1")
 *                     .volumeSpecName("ora-data1")
 *                     .storageQuotaInGb(1024)
 *                     .throughputInMibps(24.0)
 *                     .protocols("NFSv4.1")
 *                     .securityStyle("unix")
 *                     .snapshotDirectoryVisible(false)
 *                     .exportPolicyRules(VolumeGroupOracleVolumeExportPolicyRuleArgs.builder()
 *                         .ruleIndex(1)
 *                         .allowedClients("0.0.0.0/0")
 *                         .nfsv3Enabled(false)
 *                         .nfsv41Enabled(true)
 *                         .unixReadOnly(false)
 *                         .unixReadWrite(true)
 *                         .rootAccessEnabled(false)
 *                         .build())
 *                     .build(),
 *                 VolumeGroupOracleVolumeArgs.builder()
 *                     .name(String.format("%s-volume-oraLog", prefix))
 *                     .volumePath(String.format("%s-my-unique-file-oralog-path", prefix))
 *                     .serviceLevel("Standard")
 *                     .capacityPoolId(examplePool.id())
 *                     .subnetId(exampleSubnet.id())
 *                     .zone("1")
 *                     .volumeSpecName("ora-log")
 *                     .storageQuotaInGb(1024)
 *                     .throughputInMibps(24.0)
 *                     .protocols("NFSv4.1")
 *                     .securityStyle("unix")
 *                     .snapshotDirectoryVisible(false)
 *                     .exportPolicyRules(VolumeGroupOracleVolumeExportPolicyRuleArgs.builder()
 *                         .ruleIndex(1)
 *                         .allowedClients("0.0.0.0/0")
 *                         .nfsv3Enabled(false)
 *                         .nfsv41Enabled(true)
 *                         .unixReadOnly(false)
 *                         .unixReadWrite(true)
 *                         .rootAccessEnabled(false)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Cross-Region Replication
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
 * import com.pulumi.azure.netapp.Account;
 * import com.pulumi.azure.netapp.AccountArgs;
 * import com.pulumi.azure.netapp.Pool;
 * import com.pulumi.azure.netapp.PoolArgs;
 * import com.pulumi.azure.netapp.VolumeGroupOracle;
 * import com.pulumi.azure.netapp.VolumeGroupOracleArgs;
 * import com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs;
 * import com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionReplicationArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *             .name(String.format("%s-resources", prefix))
 *             .location(location)
 *             .tags(Map.of("SkipNRMSNSG", "true"))
 *             .build());
 * 
 *         // Primary region networking
 *         var examplePrimary = new VirtualNetwork("examplePrimary", VirtualNetworkArgs.builder()
 *             .name(String.format("%s-vnet-primary", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.47.0.0/16")
 *             .build());
 * 
 *         var examplePrimarySubnet = new Subnet("examplePrimarySubnet", SubnetArgs.builder()
 *             .name(String.format("%s-delegated-subnet-primary", prefix))
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(examplePrimary.name())
 *             .addressPrefixes("10.47.2.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("exampledelegation")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("Microsoft.Netapp/volumes")
 *                     .actions(                    
 *                         "Microsoft.Network/networkinterfaces/*",
 *                         "Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Secondary region networking
 *         var exampleSecondary = new VirtualNetwork("exampleSecondary", VirtualNetworkArgs.builder()
 *             .name(String.format("%s-vnet-secondary", prefix))
 *             .location(altLocation)
 *             .resourceGroupName(example.name())
 *             .addressSpaces("10.48.0.0/16")
 *             .build());
 * 
 *         var exampleSecondarySubnet = new Subnet("exampleSecondarySubnet", SubnetArgs.builder()
 *             .name(String.format("%s-delegated-subnet-secondary", prefix))
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleSecondary.name())
 *             .addressPrefixes("10.48.2.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("exampledelegation")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("Microsoft.Netapp/volumes")
 *                     .actions(                    
 *                         "Microsoft.Network/networkinterfaces/*",
 *                         "Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Primary region NetApp infrastructure
 *         var examplePrimaryAccount = new Account("examplePrimaryAccount", AccountArgs.builder()
 *             .name(String.format("%s-netapp-account-primary", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(examplePrimarySubnet)
 *                 .build());
 * 
 *         var examplePrimaryPool = new Pool("examplePrimaryPool", PoolArgs.builder()
 *             .name(String.format("%s-netapp-pool-primary", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .accountName(examplePrimaryAccount.name())
 *             .serviceLevel("Standard")
 *             .sizeInTb(4)
 *             .qosType("Manual")
 *             .build());
 * 
 *         // Secondary region NetApp infrastructure
 *         var exampleSecondaryAccount = new Account("exampleSecondaryAccount", AccountArgs.builder()
 *             .name(String.format("%s-netapp-account-secondary", prefix))
 *             .location(altLocation)
 *             .resourceGroupName(example.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleSecondarySubnet)
 *                 .build());
 * 
 *         var exampleSecondaryPool = new Pool("exampleSecondaryPool", PoolArgs.builder()
 *             .name(String.format("%s-netapp-pool-secondary", prefix))
 *             .location(altLocation)
 *             .resourceGroupName(example.name())
 *             .accountName(exampleSecondaryAccount.name())
 *             .serviceLevel("Standard")
 *             .sizeInTb(4)
 *             .qosType("Manual")
 *             .build());
 * 
 *         // Primary Oracle volume group
 *         var examplePrimaryVolumeGroupOracle = new VolumeGroupOracle("examplePrimaryVolumeGroupOracle", VolumeGroupOracleArgs.builder()
 *             .name(String.format("%s-NetAppVolumeGroupOracle-primary", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .accountName(examplePrimaryAccount.name())
 *             .groupDescription("Primary Oracle volume group for CRR")
 *             .applicationIdentifier("TST")
 *             .volumes(VolumeGroupOracleVolumeArgs.builder()
 *                 .name(String.format("%s-volume-ora1-primary", prefix))
 *                 .volumePath(String.format("%s-my-unique-file-ora-path-1-primary", prefix))
 *                 .serviceLevel("Standard")
 *                 .capacityPoolId(examplePrimaryPool.id())
 *                 .subnetId(examplePrimarySubnet.id())
 *                 .volumeSpecName("ora-data1")
 *                 .storageQuotaInGb(1024)
 *                 .throughputInMibps(24.0)
 *                 .protocols("NFSv4.1")
 *                 .securityStyle("unix")
 *                 .snapshotDirectoryVisible(false)
 *                 .exportPolicyRules(VolumeGroupOracleVolumeExportPolicyRuleArgs.builder()
 *                     .ruleIndex(1)
 *                     .allowedClients("0.0.0.0/0")
 *                     .nfsv3Enabled(false)
 *                     .nfsv41Enabled(true)
 *                     .unixReadOnly(false)
 *                     .unixReadWrite(true)
 *                     .rootAccessEnabled(false)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Secondary Oracle volume group with CRR
 *         var exampleSecondaryVolumeGroupOracle = new VolumeGroupOracle("exampleSecondaryVolumeGroupOracle", VolumeGroupOracleArgs.builder()
 *             .name(String.format("%s-NetAppVolumeGroupOracle-secondary", prefix))
 *             .location(altLocation)
 *             .resourceGroupName(example.name())
 *             .accountName(exampleSecondaryAccount.name())
 *             .groupDescription("Secondary Oracle volume group for CRR")
 *             .applicationIdentifier("TST")
 *             .volumes(VolumeGroupOracleVolumeArgs.builder()
 *                 .name(String.format("%s-volume-ora1-secondary", prefix))
 *                 .volumePath(String.format("%s-my-unique-file-ora-path-1-secondary", prefix))
 *                 .serviceLevel("Standard")
 *                 .capacityPoolId(exampleSecondaryPool.id())
 *                 .subnetId(exampleSecondarySubnet.id())
 *                 .volumeSpecName("ora-data1")
 *                 .storageQuotaInGb(1024)
 *                 .throughputInMibps(24.0)
 *                 .protocols("NFSv4.1")
 *                 .securityStyle("unix")
 *                 .snapshotDirectoryVisible(false)
 *                 .exportPolicyRules(VolumeGroupOracleVolumeExportPolicyRuleArgs.builder()
 *                     .ruleIndex(1)
 *                     .allowedClients("0.0.0.0/0")
 *                     .nfsv3Enabled(false)
 *                     .nfsv41Enabled(true)
 *                     .unixReadOnly(false)
 *                     .unixReadWrite(true)
 *                     .rootAccessEnabled(false)
 *                     .build())
 *                 .dataProtectionReplication(VolumeGroupOracleVolumeDataProtectionReplicationArgs.builder()
 *                     .endpointType("dst")
 *                     .remoteVolumeLocation(example.location())
 *                     .remoteVolumeResourceId(examplePrimaryVolumeGroupOracle.volumes().applyValue(_volumes -> _volumes[0].id()))
 *                     .replicationFrequency("10minutes")
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(examplePrimaryVolumeGroupOracle)
 *                 .build());
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
 * * `Microsoft.NetApp`: 2025-01-01
 * 
 * ## Import
 * 
 * Application Volume Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:netapp/volumeGroupOracle:VolumeGroupOracle example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mytest-rg/providers/Microsoft.NetApp/netAppAccounts/netapp-account-test/volumeGroups/netapp-volumegroup-test
 * ```
 * 
 */
@ResourceType(type="azure:netapp/volumeGroupOracle:VolumeGroupOracle")
public class VolumeGroupOracle extends com.pulumi.resources.CustomResource {
    /**
     * Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The SAP System ID, maximum 3 characters, e.g. `OR1`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="applicationIdentifier", refs={String.class}, tree="[0]")
    private Output<String> applicationIdentifier;

    /**
     * @return The SAP System ID, maximum 3 characters, e.g. `OR1`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> applicationIdentifier() {
        return this.applicationIdentifier;
    }
    /**
     * Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="groupDescription", refs={String.class}, tree="[0]")
    private Output<String> groupDescription;

    /**
     * @return Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> groupDescription() {
        return this.groupDescription;
    }
    /**
     * The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `volume` blocks as defined below.
     * 
     */
    @Export(name="volumes", refs={List.class,VolumeGroupOracleVolume.class}, tree="[0,1]")
    private Output<List<VolumeGroupOracleVolume>> volumes;

    /**
     * @return One or more `volume` blocks as defined below.
     * 
     */
    public Output<List<VolumeGroupOracleVolume>> volumes() {
        return this.volumes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeGroupOracle(java.lang.String name) {
        this(name, VolumeGroupOracleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeGroupOracle(java.lang.String name, VolumeGroupOracleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeGroupOracle(java.lang.String name, VolumeGroupOracleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:netapp/volumeGroupOracle:VolumeGroupOracle", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VolumeGroupOracle(java.lang.String name, Output<java.lang.String> id, @Nullable VolumeGroupOracleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:netapp/volumeGroupOracle:VolumeGroupOracle", name, state, makeResourceOptions(options, id), false);
    }

    private static VolumeGroupOracleArgs makeArgs(VolumeGroupOracleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VolumeGroupOracleArgs.Empty : args;
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
    public static VolumeGroupOracle get(java.lang.String name, Output<java.lang.String> id, @Nullable VolumeGroupOracleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeGroupOracle(name, id, state, options);
    }
}
