// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.EnrichmentArgs;
import com.pulumi.azure.iot.inputs.EnrichmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an IotHub Enrichment
 * 
 * &gt; **NOTE:** Enrichment can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.Enrichment` resources - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
 * 
 * ## Example Usage
 * 
 * ```java
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
 * import com.pulumi.azure.iot.IoTHub;
 * import com.pulumi.azure.iot.IoTHubArgs;
 * import com.pulumi.azure.iot.inputs.IoTHubSkuArgs;
 * import com.pulumi.azure.iot.EndpointStorageContainer;
 * import com.pulumi.azure.iot.EndpointStorageContainerArgs;
 * import com.pulumi.azure.iot.Route;
 * import com.pulumi.azure.iot.RouteArgs;
 * import com.pulumi.azure.iot.Enrichment;
 * import com.pulumi.azure.iot.EnrichmentArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleIoTHub = new IoTHub(&#34;exampleIoTHub&#34;, IoTHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .sku(IoTHubSkuArgs.builder()
 *                 .name(&#34;S1&#34;)
 *                 .capacity(&#34;1&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *         var exampleEndpointStorageContainer = new EndpointStorageContainer(&#34;exampleEndpointStorageContainer&#34;, EndpointStorageContainerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .iothubId(exampleIoTHub.id())
 *             .connectionString(exampleAccount.primaryBlobConnectionString())
 *             .batchFrequencyInSeconds(60)
 *             .maxChunkSizeInBytes(10485760)
 *             .containerName(exampleContainer.name())
 *             .encoding(&#34;Avro&#34;)
 *             .fileNameFormat(&#34;{iothub}/{partition}_{YYYY}_{MM}_{DD}_{HH}_{mm}&#34;)
 *             .build());
 * 
 *         var exampleRoute = new Route(&#34;exampleRoute&#34;, RouteArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .iothubName(exampleIoTHub.name())
 *             .source(&#34;DeviceMessages&#34;)
 *             .condition(&#34;true&#34;)
 *             .endpointNames(exampleEndpointStorageContainer.name())
 *             .enabled(true)
 *             .build());
 * 
 *         var exampleEnrichment = new Enrichment(&#34;exampleEnrichment&#34;, EnrichmentArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .iothubName(exampleIoTHub.name())
 *             .key(&#34;example&#34;)
 *             .value(&#34;my value&#34;)
 *             .endpointNames(exampleEndpointStorageContainer.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IoTHub Enrichment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:iot/enrichment:Enrichment enrichment1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/IotHubs/hub1/Enrichments/enrichment1
 * ```
 * 
 */
@ResourceType(type="azure:iot/enrichment:Enrichment")
public class Enrichment extends com.pulumi.resources.CustomResource {
    /**
     * The list of endpoints which will be enriched.
     * 
     */
    @Export(name="endpointNames", type=List.class, parameters={String.class})
    private Output<List<String>> endpointNames;

    /**
     * @return The list of endpoints which will be enriched.
     * 
     */
    public Output<List<String>> endpointNames() {
        return this.endpointNames;
    }
    @Export(name="iothubName", type=String.class, parameters={})
    private Output<String> iothubName;

    public Output<String> iothubName() {
        return this.iothubName;
    }
    /**
     * The key of the enrichment.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The key of the enrichment.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Enrichment(String name) {
        this(name, EnrichmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Enrichment(String name, EnrichmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Enrichment(String name, EnrichmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/enrichment:Enrichment", name, args == null ? EnrichmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Enrichment(String name, Output<String> id, @Nullable EnrichmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/enrichment:Enrichment", name, state, makeResourceOptions(options, id));
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
    public static Enrichment get(String name, Output<String> id, @Nullable EnrichmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Enrichment(name, id, state, options);
    }
}