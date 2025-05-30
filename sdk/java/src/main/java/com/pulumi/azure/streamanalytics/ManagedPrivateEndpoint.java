// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.streamanalytics.ManagedPrivateEndpointArgs;
import com.pulumi.azure.streamanalytics.inputs.ManagedPrivateEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Stream Analytics Managed Private Endpoint.
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
 * import com.pulumi.azure.streamanalytics.Cluster;
 * import com.pulumi.azure.streamanalytics.ClusterArgs;
 * import com.pulumi.azure.streamanalytics.ManagedPrivateEndpoint;
 * import com.pulumi.azure.streamanalytics.ManagedPrivateEndpointArgs;
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
 *             .name("examplestorageacc")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .accountKind("StorageV2")
 *             .isHnsEnabled(true)
 *             .build());
 * 
 *         var exampleCluster = new Cluster("exampleCluster", ClusterArgs.builder()
 *             .name("examplestreamanalyticscluster")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .streamingCapacity(36)
 *             .build());
 * 
 *         var exampleManagedPrivateEndpoint = new ManagedPrivateEndpoint("exampleManagedPrivateEndpoint", ManagedPrivateEndpointArgs.builder()
 *             .name("exampleprivateendpoint")
 *             .resourceGroupName(example.name())
 *             .streamAnalyticsClusterName(exampleCluster.name())
 *             .targetResourceId(exampleAccount.id())
 *             .subresourceName("blob")
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
 * * `Microsoft.StreamAnalytics`: 2020-03-01
 * 
 * ## Import
 * 
 * Stream Analytics Private Endpoints can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.StreamAnalytics/clusters/cluster1/privateEndpoints/endpoint1
 * ```
 * 
 */
@ResourceType(type="azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint")
public class ManagedPrivateEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this Stream Analytics Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Stream Analytics Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Stream Analytics Managed Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Managed Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the Stream Analytics Cluster where the Managed Private Endpoint should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="streamAnalyticsClusterName", refs={String.class}, tree="[0]")
    private Output<String> streamAnalyticsClusterName;

    /**
     * @return The name of the Stream Analytics Cluster where the Managed Private Endpoint should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsClusterName() {
        return this.streamAnalyticsClusterName;
    }
    /**
     * Specifies the sub resource name which the Stream Analytics Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subresourceName", refs={String.class}, tree="[0]")
    private Output<String> subresourceName;

    /**
     * @return Specifies the sub resource name which the Stream Analytics Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subresourceName() {
        return this.subresourceName;
    }
    /**
     * The ID of the Private Link Enabled Remote Resource which this Stream Analytics Private endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="targetResourceId", refs={String.class}, tree="[0]")
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Private Link Enabled Remote Resource which this Stream Analytics Private endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPrivateEndpoint(java.lang.String name) {
        this(name, ManagedPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrivateEndpoint(java.lang.String name, ManagedPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrivateEndpoint(java.lang.String name, ManagedPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedPrivateEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedPrivateEndpointArgs makeArgs(ManagedPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedPrivateEndpointArgs.Empty : args;
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
    public static ManagedPrivateEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrivateEndpoint(name, id, state, options);
    }
}
