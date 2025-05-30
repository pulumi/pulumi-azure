// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.networkfunction;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.networkfunction.CollectorPolicyArgs;
import com.pulumi.azure.networkfunction.inputs.CollectorPolicyState;
import com.pulumi.azure.networkfunction.outputs.CollectorPolicyIpfxEmission;
import com.pulumi.azure.networkfunction.outputs.CollectorPolicyIpfxIngestion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Network Function Collector Policy.
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
 * import com.pulumi.azure.network.ExpressRoutePort;
 * import com.pulumi.azure.network.ExpressRoutePortArgs;
 * import com.pulumi.azure.network.ExpressRouteCircuit;
 * import com.pulumi.azure.network.ExpressRouteCircuitArgs;
 * import com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs;
 * import com.pulumi.azure.network.ExpressRouteCircuitPeering;
 * import com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs;
 * import com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs;
 * import com.pulumi.azure.networkfunction.AzureTrafficCollector;
 * import com.pulumi.azure.networkfunction.AzureTrafficCollectorArgs;
 * import com.pulumi.azure.networkfunction.CollectorPolicy;
 * import com.pulumi.azure.networkfunction.CollectorPolicyArgs;
 * import com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs;
 * import com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs;
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
 *             .name("example-resources")
 *             .location("West US 2")
 *             .build());
 * 
 *         var exampleExpressRoutePort = new ExpressRoutePort("exampleExpressRoutePort", ExpressRoutePortArgs.builder()
 *             .name("example-erp")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .peeringLocation("Equinix-Seattle-SE2")
 *             .bandwidthInGbps(10)
 *             .encapsulation("Dot1Q")
 *             .build());
 * 
 *         var exampleExpressRouteCircuit = new ExpressRouteCircuit("exampleExpressRouteCircuit", ExpressRouteCircuitArgs.builder()
 *             .name("example-erc")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .expressRoutePortId(exampleExpressRoutePort.id())
 *             .bandwidthInGbps(1.0)
 *             .sku(ExpressRouteCircuitSkuArgs.builder()
 *                 .tier("Standard")
 *                 .family("MeteredData")
 *                 .build())
 *             .build());
 * 
 *         var exampleExpressRouteCircuitPeering = new ExpressRouteCircuitPeering("exampleExpressRouteCircuitPeering", ExpressRouteCircuitPeeringArgs.builder()
 *             .peeringType("MicrosoftPeering")
 *             .expressRouteCircuitName(exampleExpressRouteCircuit.name())
 *             .resourceGroupName(example.name())
 *             .peerAsn(100)
 *             .primaryPeerAddressPrefix("192.168.199.0/30")
 *             .secondaryPeerAddressPrefix("192.168.200.0/30")
 *             .vlanId(300)
 *             .microsoftPeeringConfig(ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder()
 *                 .advertisedPublicPrefixes("123.6.0.0/24")
 *                 .build())
 *             .build());
 * 
 *         var exampleAzureTrafficCollector = new AzureTrafficCollector("exampleAzureTrafficCollector", AzureTrafficCollectorArgs.builder()
 *             .name("example-nfatc")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleExpressRouteCircuitPeering)
 *                 .build());
 * 
 *         var exampleCollectorPolicy = new CollectorPolicy("exampleCollectorPolicy", CollectorPolicyArgs.builder()
 *             .name("example-nfcp")
 *             .trafficCollectorId(exampleAzureTrafficCollector.id())
 *             .location(example.location())
 *             .ipfxEmission(CollectorPolicyIpfxEmissionArgs.builder()
 *                 .destinationTypes("AzureMonitor")
 *                 .build())
 *             .ipfxIngestion(CollectorPolicyIpfxIngestionArgs.builder()
 *                 .sourceResourceIds(exampleExpressRouteCircuit.id())
 *                 .build())
 *             .tags(Map.of("key", "value"))
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
 * * `Microsoft.NetworkFunction`: 2022-11-01
 * 
 * ## Import
 * 
 * Network Function Collector Policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:networkfunction/collectorPolicy:CollectorPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.NetworkFunction/azureTrafficCollectors/azureTrafficCollector1/collectorPolicies/collectorPolicy1
 * ```
 * 
 */
@ResourceType(type="azure:networkfunction/collectorPolicy:CollectorPolicy")
public class CollectorPolicy extends com.pulumi.resources.CustomResource {
    /**
     * An `ipfx_emission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="ipfxEmission", refs={CollectorPolicyIpfxEmission.class}, tree="[0]")
    private Output<CollectorPolicyIpfxEmission> ipfxEmission;

    /**
     * @return An `ipfx_emission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<CollectorPolicyIpfxEmission> ipfxEmission() {
        return this.ipfxEmission;
    }
    /**
     * An `ipfx_ingestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="ipfxIngestion", refs={CollectorPolicyIpfxIngestion.class}, tree="[0]")
    private Output<CollectorPolicyIpfxIngestion> ipfxIngestion;

    /**
     * @return An `ipfx_ingestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<CollectorPolicyIpfxIngestion> ipfxIngestion() {
        return this.ipfxIngestion;
    }
    /**
     * Specifies the Azure Region where the Network Function Collector Policy should exist. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Network Function Collector Policy should exist. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of tags which should be assigned to the Network Function Collector Policy.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Network Function Collector Policy.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Azure Traffic Collector ID of the Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="trafficCollectorId", refs={String.class}, tree="[0]")
    private Output<String> trafficCollectorId;

    /**
     * @return Specifies the Azure Traffic Collector ID of the Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> trafficCollectorId() {
        return this.trafficCollectorId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CollectorPolicy(java.lang.String name) {
        this(name, CollectorPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CollectorPolicy(java.lang.String name, CollectorPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CollectorPolicy(java.lang.String name, CollectorPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:networkfunction/collectorPolicy:CollectorPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CollectorPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable CollectorPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:networkfunction/collectorPolicy:CollectorPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static CollectorPolicyArgs makeArgs(CollectorPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CollectorPolicyArgs.Empty : args;
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
    public static CollectorPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable CollectorPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CollectorPolicy(name, id, state, options);
    }
}
