// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.hdinsight.KafkaClusterArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterState;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterComponentVersion;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterComputeIsolation;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterDiskEncryption;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterExtension;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterGateway;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterMetastores;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterMonitor;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterNetwork;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterPrivateLinkConfiguration;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterRestProxy;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterRoles;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterSecurityProfile;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterStorageAccount;
import com.pulumi.azure.hdinsight.outputs.KafkaClusterStorageAccountGen2;
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
 * Manages a HDInsight Kafka Cluster.
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
 * import com.pulumi.azure.hdinsight.KafkaCluster;
 * import com.pulumi.azure.hdinsight.KafkaClusterArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeArgs;
 * import com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeArgs;
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
 *         var exampleKafkaCluster = new KafkaCluster("exampleKafkaCluster", KafkaClusterArgs.builder()
 *             .name("example-hdicluster")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .clusterVersion("4.0")
 *             .tier("Standard")
 *             .componentVersion(KafkaClusterComponentVersionArgs.builder()
 *                 .kafka("2.1")
 *                 .build())
 *             .gateway(KafkaClusterGatewayArgs.builder()
 *                 .username("acctestusrgw")
 *                 .password("Password123!")
 *                 .build())
 *             .storageAccounts(KafkaClusterStorageAccountArgs.builder()
 *                 .storageContainerId(exampleContainer.id())
 *                 .storageAccountKey(exampleAccount.primaryAccessKey())
 *                 .isDefault(true)
 *                 .build())
 *             .roles(KafkaClusterRolesArgs.builder()
 *                 .headNode(KafkaClusterRolesHeadNodeArgs.builder()
 *                     .vmSize("Standard_D3_V2")
 *                     .username("acctestusrvm")
 *                     .password("AccTestvdSC4daf986!")
 *                     .build())
 *                 .workerNode(KafkaClusterRolesWorkerNodeArgs.builder()
 *                     .vmSize("Standard_D3_V2")
 *                     .username("acctestusrvm")
 *                     .password("AccTestvdSC4daf986!")
 *                     .numberOfDisksPerNode(3)
 *                     .targetInstanceCount(3)
 *                     .build())
 *                 .zookeeperNode(KafkaClusterRolesZookeeperNodeArgs.builder()
 *                     .vmSize("Standard_D3_V2")
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
 * HDInsight Kafka Clusters can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:hdinsight/kafkaCluster:KafkaCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.HDInsight/clusters/cluster1
 * ```
 * 
 */
@ResourceType(type="azure:hdinsight/kafkaCluster:KafkaCluster")
public class KafkaCluster extends com.pulumi.resources.CustomResource {
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
    @Export(name="componentVersion", refs={KafkaClusterComponentVersion.class}, tree="[0]")
    private Output<KafkaClusterComponentVersion> componentVersion;

    /**
     * @return A `component_version` block as defined below.
     * 
     */
    public Output<KafkaClusterComponentVersion> componentVersion() {
        return this.componentVersion;
    }
    /**
     * A `compute_isolation` block as defined below.
     * 
     */
    @Export(name="computeIsolation", refs={KafkaClusterComputeIsolation.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterComputeIsolation> computeIsolation;

    /**
     * @return A `compute_isolation` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterComputeIsolation>> computeIsolation() {
        return Codegen.optional(this.computeIsolation);
    }
    /**
     * One or more `disk_encryption` block as defined below.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    @Export(name="diskEncryptions", refs={List.class,KafkaClusterDiskEncryption.class}, tree="[0,1]")
    private Output</* @Nullable */ List<KafkaClusterDiskEncryption>> diskEncryptions;

    /**
     * @return One or more `disk_encryption` block as defined below.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    public Output<Optional<List<KafkaClusterDiskEncryption>>> diskEncryptions() {
        return Codegen.optional(this.diskEncryptions);
    }
    /**
     * Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="encryptionInTransitEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionInTransitEnabled;

    /**
     * @return Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> encryptionInTransitEnabled() {
        return Codegen.optional(this.encryptionInTransitEnabled);
    }
    /**
     * An `extension` block as defined below.
     * 
     */
    @Export(name="extension", refs={KafkaClusterExtension.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterExtension> extension;

    /**
     * @return An `extension` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterExtension>> extension() {
        return Codegen.optional(this.extension);
    }
    /**
     * A `gateway` block as defined below.
     * 
     */
    @Export(name="gateway", refs={KafkaClusterGateway.class}, tree="[0]")
    private Output<KafkaClusterGateway> gateway;

    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public Output<KafkaClusterGateway> gateway() {
        return this.gateway;
    }
    /**
     * The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Export(name="httpsEndpoint", refs={String.class}, tree="[0]")
    private Output<String> httpsEndpoint;

    /**
     * @return The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Output<String> httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Export(name="kafkaRestProxyEndpoint", refs={String.class}, tree="[0]")
    private Output<String> kafkaRestProxyEndpoint;

    /**
     * @return The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Output<String> kafkaRestProxyEndpoint() {
        return this.kafkaRestProxyEndpoint;
    }
    /**
     * Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `metastores` block as defined below.
     * 
     */
    @Export(name="metastores", refs={KafkaClusterMetastores.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterMetastores> metastores;

    /**
     * @return A `metastores` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterMetastores>> metastores() {
        return Codegen.optional(this.metastores);
    }
    /**
     * A `monitor` block as defined below.
     * 
     */
    @Export(name="monitor", refs={KafkaClusterMonitor.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterMonitor> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterMonitor>> monitor() {
        return Codegen.optional(this.monitor);
    }
    /**
     * Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network` block as defined below.
     * 
     */
    @Export(name="network", refs={KafkaClusterNetwork.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterNetwork> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterNetwork>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * A `private_link_configuration` block as defined below.
     * 
     */
    @Export(name="privateLinkConfiguration", refs={KafkaClusterPrivateLinkConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterPrivateLinkConfiguration> privateLinkConfiguration;

    /**
     * @return A `private_link_configuration` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterPrivateLinkConfiguration>> privateLinkConfiguration() {
        return Codegen.optional(this.privateLinkConfiguration);
    }
    /**
     * Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `rest_proxy` block as defined below.
     * 
     */
    @Export(name="restProxy", refs={KafkaClusterRestProxy.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterRestProxy> restProxy;

    /**
     * @return A `rest_proxy` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterRestProxy>> restProxy() {
        return Codegen.optional(this.restProxy);
    }
    /**
     * A `roles` block as defined below.
     * 
     */
    @Export(name="roles", refs={KafkaClusterRoles.class}, tree="[0]")
    private Output<KafkaClusterRoles> roles;

    /**
     * @return A `roles` block as defined below.
     * 
     */
    public Output<KafkaClusterRoles> roles() {
        return this.roles;
    }
    /**
     * A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="securityProfile", refs={KafkaClusterSecurityProfile.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterSecurityProfile> securityProfile;

    /**
     * @return A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<KafkaClusterSecurityProfile>> securityProfile() {
        return Codegen.optional(this.securityProfile);
    }
    /**
     * The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Export(name="sshEndpoint", refs={String.class}, tree="[0]")
    private Output<String> sshEndpoint;

    /**
     * @return The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Output<String> sshEndpoint() {
        return this.sshEndpoint;
    }
    /**
     * A `storage_account_gen2` block as defined below.
     * 
     */
    @Export(name="storageAccountGen2", refs={KafkaClusterStorageAccountGen2.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterStorageAccountGen2> storageAccountGen2;

    /**
     * @return A `storage_account_gen2` block as defined below.
     * 
     */
    public Output<Optional<KafkaClusterStorageAccountGen2>> storageAccountGen2() {
        return Codegen.optional(this.storageAccountGen2);
    }
    /**
     * One or more `storage_account` block as defined below.
     * 
     */
    @Export(name="storageAccounts", refs={List.class,KafkaClusterStorageAccount.class}, tree="[0,1]")
    private Output</* @Nullable */ List<KafkaClusterStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` block as defined below.
     * 
     */
    public Output<Optional<List<KafkaClusterStorageAccount>>> storageAccounts() {
        return Codegen.optional(this.storageAccounts);
    }
    /**
     * A map of Tags which should be assigned to this HDInsight Kafka Cluster.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of Tags which should be assigned to this HDInsight Kafka Cluster.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tier", refs={String.class}, tree="[0]")
    private Output<String> tier;

    /**
     * @return Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tlsMinVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tlsMinVersion;

    /**
     * @return The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> tlsMinVersion() {
        return Codegen.optional(this.tlsMinVersion);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaCluster(java.lang.String name) {
        this(name, KafkaClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaCluster(java.lang.String name, KafkaClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaCluster(java.lang.String name, KafkaClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:hdinsight/kafkaCluster:KafkaCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KafkaCluster(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:hdinsight/kafkaCluster:KafkaCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static KafkaClusterArgs makeArgs(KafkaClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KafkaClusterArgs.Empty : args;
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
    public static KafkaCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaCluster(name, id, state, options);
    }
}
