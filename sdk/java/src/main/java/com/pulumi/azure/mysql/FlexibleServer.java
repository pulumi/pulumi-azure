// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mysql.FlexibleServerArgs;
import com.pulumi.azure.mysql.inputs.FlexibleServerState;
import com.pulumi.azure.mysql.outputs.FlexibleServerHighAvailability;
import com.pulumi.azure.mysql.outputs.FlexibleServerMaintenanceWindow;
import com.pulumi.azure.mysql.outputs.FlexibleServerStorage;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a MySQL Flexible Server.
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
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.privatedns.Zone;
 * import com.pulumi.azure.privatedns.ZoneArgs;
 * import com.pulumi.azure.privatedns.ZoneVirtualNetworkLink;
 * import com.pulumi.azure.privatedns.ZoneVirtualNetworkLinkArgs;
 * import com.pulumi.azure.mysql.FlexibleServer;
 * import com.pulumi.azure.mysql.FlexibleServerArgs;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .serviceEndpoints(&#34;Microsoft.Storage&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;fs&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.DBforMySQL/flexibleServers&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleZoneVirtualNetworkLink = new ZoneVirtualNetworkLink(&#34;exampleZoneVirtualNetworkLink&#34;, ZoneVirtualNetworkLinkArgs.builder()        
 *             .privateDnsZoneName(exampleZone.name())
 *             .virtualNetworkId(exampleVirtualNetwork.id())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleFlexibleServer = new FlexibleServer(&#34;exampleFlexibleServer&#34;, FlexibleServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .administratorLogin(&#34;psqladmin&#34;)
 *             .administratorPassword(&#34;H@Sh1CoR3!&#34;)
 *             .backupRetentionDays(7)
 *             .delegatedSubnetId(exampleSubnet.id())
 *             .privateDnsZoneId(exampleZone.id())
 *             .skuName(&#34;GP_Standard_D2ds_v4&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleZoneVirtualNetworkLink)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * MySQL Flexible Servers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mysql/flexibleServer:FlexibleServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DBforMySQL/flexibleServers/flexibleServer1
 * ```
 * 
 */
@ResourceType(type="azure:mysql/flexibleServer:FlexibleServer")
public class FlexibleServer extends com.pulumi.resources.CustomResource {
    /**
     * The Administrator login for the MySQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="administratorLogin", type=String.class, parameters={})
    private Output<String> administratorLogin;

    /**
     * @return The Administrator login for the MySQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<String> administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * The Password associated with the `administrator_login` for the MySQL Flexible Server. Required when `create_mode` is `Default`.
     * 
     */
    @Export(name="administratorPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorPassword;

    /**
     * @return The Password associated with the `administrator_login` for the MySQL Flexible Server. Required when `create_mode` is `Default`.
     * 
     */
    public Output<Optional<String>> administratorPassword() {
        return Codegen.optional(this.administratorPassword);
    }
    /**
     * The backup retention days for the MySQL Flexible Server. Possible values are between `1` and `35` days. Defaults to `7`.
     * 
     */
    @Export(name="backupRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> backupRetentionDays;

    /**
     * @return The backup retention days for the MySQL Flexible Server. Possible values are between `1` and `35` days. Defaults to `7`.
     * 
     */
    public Output<Optional<Integer>> backupRetentionDays() {
        return Codegen.optional(this.backupRetentionDays);
    }
    /**
     * The creation mode which can be used to restore or replicate existing servers. Possible values are `Default`, `PointInTimeRestore`, `GeoRestore`, and `Replica`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="createMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> createMode;

    /**
     * @return The creation mode which can be used to restore or replicate existing servers. Possible values are `Default`, `PointInTimeRestore`, `GeoRestore`, and `Replica`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<String>> createMode() {
        return Codegen.optional(this.createMode);
    }
    /**
     * The ID of the virtual network subnet to create the MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="delegatedSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> delegatedSubnetId;

    /**
     * @return The ID of the virtual network subnet to create the MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<String>> delegatedSubnetId() {
        return Codegen.optional(this.delegatedSubnetId);
    }
    /**
     * The fully qualified domain name of the MySQL Flexible Server.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The fully qualified domain name of the MySQL Flexible Server.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Should geo redundant backup enabled? Defaults to `false`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="geoRedundantBackupEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> geoRedundantBackupEnabled;

    /**
     * @return Should geo redundant backup enabled? Defaults to `false`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<Boolean>> geoRedundantBackupEnabled() {
        return Codegen.optional(this.geoRedundantBackupEnabled);
    }
    /**
     * A `high_availability` block as defined below.
     * 
     */
    @Export(name="highAvailability", type=FlexibleServerHighAvailability.class, parameters={})
    private Output</* @Nullable */ FlexibleServerHighAvailability> highAvailability;

    /**
     * @return A `high_availability` block as defined below.
     * 
     */
    public Output<Optional<FlexibleServerHighAvailability>> highAvailability() {
        return Codegen.optional(this.highAvailability);
    }
    /**
     * The Azure Region where the MySQL Flexible Server should exist. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the MySQL Flexible Server should exist. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `maintenance_window` block as defined below.
     * 
     */
    @Export(name="maintenanceWindow", type=FlexibleServerMaintenanceWindow.class, parameters={})
    private Output</* @Nullable */ FlexibleServerMaintenanceWindow> maintenanceWindow;

    /**
     * @return A `maintenance_window` block as defined below.
     * 
     */
    public Output<Optional<FlexibleServerMaintenanceWindow>> maintenanceWindow() {
        return Codegen.optional(this.maintenanceWindow);
    }
    /**
     * The name which should be used for this MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="pointInTimeRestoreTimeInUtc", type=String.class, parameters={})
    private Output</* @Nullable */ String> pointInTimeRestoreTimeInUtc;

    /**
     * @return The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<String>> pointInTimeRestoreTimeInUtc() {
        return Codegen.optional(this.pointInTimeRestoreTimeInUtc);
    }
    /**
     * The ID of the private DNS zone to create the MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="privateDnsZoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateDnsZoneId;

    /**
     * @return The ID of the private DNS zone to create the MySQL Flexible Server. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<String>> privateDnsZoneId() {
        return Codegen.optional(this.privateDnsZoneId);
    }
    /**
     * Is the public network access enabled?
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Is the public network access enabled?
     * 
     */
    public Output<Boolean> publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    /**
     * The maximum number of replicas that a primary MySQL Flexible Server can have.
     * 
     */
    @Export(name="replicaCapacity", type=Integer.class, parameters={})
    private Output<Integer> replicaCapacity;

    /**
     * @return The maximum number of replicas that a primary MySQL Flexible Server can have.
     * 
     */
    public Output<Integer> replicaCapacity() {
        return this.replicaCapacity;
    }
    /**
     * The replication role. Possible value is `None`.
     * 
     */
    @Export(name="replicationRole", type=String.class, parameters={})
    private Output<String> replicationRole;

    /**
     * @return The replication role. Possible value is `None`.
     * 
     */
    public Output<String> replicationRole() {
        return this.replicationRole;
    }
    /**
     * The name of the Resource Group where the MySQL Flexible Server should exist. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the MySQL Flexible Server should exist. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU Name for the MySQL Flexible Server.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The SKU Name for the MySQL Flexible Server.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * The resource ID of the source MySQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`, `GeoRestore`, and `Replica`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="sourceServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceServerId;

    /**
     * @return The resource ID of the source MySQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`, `GeoRestore`, and `Replica`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<Optional<String>> sourceServerId() {
        return Codegen.optional(this.sourceServerId);
    }
    /**
     * A `storage` block as defined below.
     * 
     */
    @Export(name="storage", type=FlexibleServerStorage.class, parameters={})
    private Output<FlexibleServerStorage> storage;

    /**
     * @return A `storage` block as defined below.
     * 
     */
    public Output<FlexibleServerStorage> storage() {
        return this.storage;
    }
    /**
     * A mapping of tags which should be assigned to the MySQL Flexible Server.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the MySQL Flexible Server.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The version of the MySQL Flexible Server to use. Possible values are `5.7`, and `8.0.21`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the MySQL Flexible Server to use. Possible values are `5.7`, and `8.0.21`. Changing this forces a new MySQL Flexible Server to be created.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * Specifies the Availability Zone in which this MySQL Flexible Server should be located. Possible values are `1`, `2` and `3`.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    /**
     * @return Specifies the Availability Zone in which this MySQL Flexible Server should be located. Possible values are `1`, `2` and `3`.
     * 
     */
    public Output<Optional<String>> zone() {
        return Codegen.optional(this.zone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleServer(String name) {
        this(name, FlexibleServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleServer(String name, FlexibleServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleServer(String name, FlexibleServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mysql/flexibleServer:FlexibleServer", name, args == null ? FlexibleServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlexibleServer(String name, Output<String> id, @Nullable FlexibleServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mysql/flexibleServer:FlexibleServer", name, state, makeResourceOptions(options, id));
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
    public static FlexibleServer get(String name, Output<String> id, @Nullable FlexibleServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleServer(name, id, state, options);
    }
}