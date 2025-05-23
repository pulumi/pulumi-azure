// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.hdinsight.SparkClusterArgs;
import com.pulumi.azure.hdinsight.inputs.SparkClusterState;
import com.pulumi.azure.hdinsight.outputs.SparkClusterComponentVersion;
import com.pulumi.azure.hdinsight.outputs.SparkClusterComputeIsolation;
import com.pulumi.azure.hdinsight.outputs.SparkClusterDiskEncryption;
import com.pulumi.azure.hdinsight.outputs.SparkClusterExtension;
import com.pulumi.azure.hdinsight.outputs.SparkClusterGateway;
import com.pulumi.azure.hdinsight.outputs.SparkClusterMetastores;
import com.pulumi.azure.hdinsight.outputs.SparkClusterMonitor;
import com.pulumi.azure.hdinsight.outputs.SparkClusterNetwork;
import com.pulumi.azure.hdinsight.outputs.SparkClusterPrivateLinkConfiguration;
import com.pulumi.azure.hdinsight.outputs.SparkClusterRoles;
import com.pulumi.azure.hdinsight.outputs.SparkClusterSecurityProfile;
import com.pulumi.azure.hdinsight.outputs.SparkClusterStorageAccount;
import com.pulumi.azure.hdinsight.outputs.SparkClusterStorageAccountGen2;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a HDInsight Spark Cluster.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.hdinsight.SparkCluster;
 * import com.pulumi.azure.hdinsight.SparkClusterArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterComponentVersionArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterGatewayArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs;
 * import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeArgs;
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
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("hdinsightstor")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleContainer = new Container("exampleContainer", ContainerArgs.builder()
 *             .name("hdinsight")
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var exampleSparkCluster = new SparkCluster("exampleSparkCluster", SparkClusterArgs.builder()
 *             .name("example-hdicluster")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .clusterVersion("3.6")
 *             .tier("Standard")
 *             .componentVersion(SparkClusterComponentVersionArgs.builder()
 *                 .spark("2.3")
 *                 .build())
 *             .gateway(SparkClusterGatewayArgs.builder()
 *                 .username("acctestusrgw")
 *                 .password("Password123!")
 *                 .build())
 *             .storageAccounts(SparkClusterStorageAccountArgs.builder()
 *                 .storageContainerId(exampleContainer.id())
 *                 .storageAccountKey(exampleAccount.primaryAccessKey())
 *                 .isDefault(true)
 *                 .build())
 *             .roles(SparkClusterRolesArgs.builder()
 *                 .headNode(SparkClusterRolesHeadNodeArgs.builder()
 *                     .vmSize("Standard_A3")
 *                     .username("acctestusrvm")
 *                     .password("AccTestvdSC4daf986!")
 *                     .build())
 *                 .workerNode(SparkClusterRolesWorkerNodeArgs.builder()
 *                     .vmSize("Standard_A3")
 *                     .username("acctestusrvm")
 *                     .password("AccTestvdSC4daf986!")
 *                     .targetInstanceCount(3)
 *                     .build())
 *                 .zookeeperNode(SparkClusterRolesZookeeperNodeArgs.builder()
 *                     .vmSize("Medium")
 *                     .username("acctestusrvm")
 *                     .password("AccTestvdSC4daf986!")
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
 * * `Microsoft.HDInsight`: 2021-06-01
 * 
 * ## Import
 * 
 * HDInsight Spark Clusters can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:hdinsight/sparkCluster:SparkCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.HDInsight/clusters/cluster1
 * ```
 * 
 */
@ResourceType(type="azure:hdinsight/sparkCluster:SparkCluster")
public class SparkCluster extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="clusterVersion", refs={String.class}, tree="[0]")
    private Output<String> clusterVersion;

    /**
     * @return Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * A `component_version` block as defined below.
     * 
     */
    @Export(name="componentVersion", refs={SparkClusterComponentVersion.class}, tree="[0]")
    private Output<SparkClusterComponentVersion> componentVersion;

    /**
     * @return A `component_version` block as defined below.
     * 
     */
    public Output<SparkClusterComponentVersion> componentVersion() {
        return this.componentVersion;
    }
    /**
     * A `compute_isolation` block as defined below.
     * 
     */
    @Export(name="computeIsolation", refs={SparkClusterComputeIsolation.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterComputeIsolation> computeIsolation;

    /**
     * @return A `compute_isolation` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterComputeIsolation>> computeIsolation() {
        return Codegen.optional(this.computeIsolation);
    }
    /**
     * One or more `disk_encryption` block as defined below.
     * 
     */
    @Export(name="diskEncryptions", refs={List.class,SparkClusterDiskEncryption.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SparkClusterDiskEncryption>> diskEncryptions;

    /**
     * @return One or more `disk_encryption` block as defined below.
     * 
     */
    public Output<Optional<List<SparkClusterDiskEncryption>>> diskEncryptions() {
        return Codegen.optional(this.diskEncryptions);
    }
    /**
     * Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="encryptionInTransitEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionInTransitEnabled;

    /**
     * @return Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> encryptionInTransitEnabled() {
        return Codegen.optional(this.encryptionInTransitEnabled);
    }
    /**
     * An `extension` block as defined below.
     * 
     */
    @Export(name="extension", refs={SparkClusterExtension.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterExtension> extension;

    /**
     * @return An `extension` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterExtension>> extension() {
        return Codegen.optional(this.extension);
    }
    /**
     * A `gateway` block as defined below.
     * 
     */
    @Export(name="gateway", refs={SparkClusterGateway.class}, tree="[0]")
    private Output<SparkClusterGateway> gateway;

    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public Output<SparkClusterGateway> gateway() {
        return this.gateway;
    }
    /**
     * The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
     * 
     */
    @Export(name="httpsEndpoint", refs={String.class}, tree="[0]")
    private Output<String> httpsEndpoint;

    /**
     * @return The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
     * 
     */
    public Output<String> httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `metastores` block as defined below.
     * 
     */
    @Export(name="metastores", refs={SparkClusterMetastores.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterMetastores> metastores;

    /**
     * @return A `metastores` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterMetastores>> metastores() {
        return Codegen.optional(this.metastores);
    }
    /**
     * A `monitor` block as defined below.
     * 
     */
    @Export(name="monitor", refs={SparkClusterMonitor.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterMonitor> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterMonitor>> monitor() {
        return Codegen.optional(this.monitor);
    }
    /**
     * Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network` block as defined below.
     * 
     */
    @Export(name="network", refs={SparkClusterNetwork.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterNetwork> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterNetwork>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * A `private_link_configuration` block as defined below.
     * 
     */
    @Export(name="privateLinkConfiguration", refs={SparkClusterPrivateLinkConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterPrivateLinkConfiguration> privateLinkConfiguration;

    /**
     * @return A `private_link_configuration` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterPrivateLinkConfiguration>> privateLinkConfiguration() {
        return Codegen.optional(this.privateLinkConfiguration);
    }
    /**
     * Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `roles` block as defined below.
     * 
     */
    @Export(name="roles", refs={SparkClusterRoles.class}, tree="[0]")
    private Output<SparkClusterRoles> roles;

    /**
     * @return A `roles` block as defined below.
     * 
     */
    public Output<SparkClusterRoles> roles() {
        return this.roles;
    }
    /**
     * A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="securityProfile", refs={SparkClusterSecurityProfile.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterSecurityProfile> securityProfile;

    /**
     * @return A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<SparkClusterSecurityProfile>> securityProfile() {
        return Codegen.optional(this.securityProfile);
    }
    /**
     * The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
     * 
     */
    @Export(name="sshEndpoint", refs={String.class}, tree="[0]")
    private Output<String> sshEndpoint;

    /**
     * @return The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
     * 
     */
    public Output<String> sshEndpoint() {
        return this.sshEndpoint;
    }
    /**
     * A `storage_account_gen2` block as defined below.
     * 
     */
    @Export(name="storageAccountGen2", refs={SparkClusterStorageAccountGen2.class}, tree="[0]")
    private Output</* @Nullable */ SparkClusterStorageAccountGen2> storageAccountGen2;

    /**
     * @return A `storage_account_gen2` block as defined below.
     * 
     */
    public Output<Optional<SparkClusterStorageAccountGen2>> storageAccountGen2() {
        return Codegen.optional(this.storageAccountGen2);
    }
    /**
     * One or more `storage_account` block as defined below.
     * 
     */
    @Export(name="storageAccounts", refs={List.class,SparkClusterStorageAccount.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SparkClusterStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` block as defined below.
     * 
     */
    public Output<Optional<List<SparkClusterStorageAccount>>> storageAccounts() {
        return Codegen.optional(this.storageAccounts);
    }
    /**
     * A map of Tags which should be assigned to this HDInsight Spark Cluster.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of Tags which should be assigned to this HDInsight Spark Cluster.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tier", refs={String.class}, tree="[0]")
    private Output<String> tier;

    /**
     * @return Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    @Export(name="tlsMinVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tlsMinVersion;

    /**
     * @return The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    public Output<Optional<String>> tlsMinVersion() {
        return Codegen.optional(this.tlsMinVersion);
    }
    /**
     * A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SparkCluster(java.lang.String name) {
        this(name, SparkClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SparkCluster(java.lang.String name, SparkClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SparkCluster(java.lang.String name, SparkClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:hdinsight/sparkCluster:SparkCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SparkCluster(java.lang.String name, Output<java.lang.String> id, @Nullable SparkClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:hdinsight/sparkCluster:SparkCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static SparkClusterArgs makeArgs(SparkClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SparkClusterArgs.Empty : args;
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
    public static SparkCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable SparkClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SparkCluster(name, id, state, options);
    }
}
