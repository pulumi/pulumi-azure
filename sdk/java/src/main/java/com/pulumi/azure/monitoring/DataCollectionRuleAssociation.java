// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs;
import com.pulumi.azure.monitoring.inputs.DataCollectionRuleAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Data Collection Rule Association.
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
 * import com.pulumi.azure.network.NetworkInterface;
 * import com.pulumi.azure.network.NetworkInterfaceArgs;
 * import com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs;
 * import com.pulumi.azure.compute.LinuxVirtualMachine;
 * import com.pulumi.azure.compute.LinuxVirtualMachineArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs;
 * import com.pulumi.azure.monitoring.DataCollectionRule;
 * import com.pulumi.azure.monitoring.DataCollectionRuleArgs;
 * import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs;
 * import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsAzureMonitorMetricsArgs;
 * import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs;
 * import com.pulumi.azure.monitoring.DataCollectionEndpoint;
 * import com.pulumi.azure.monitoring.DataCollectionEndpointArgs;
 * import com.pulumi.azure.monitoring.DataCollectionRuleAssociation;
 * import com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("virtualnetwork")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("subnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface("exampleNetworkInterface", NetworkInterfaceArgs.builder()
 *             .name("nic")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name("internal")
 *                 .subnetId(exampleSubnet.id())
 *                 .privateIpAddressAllocation("Dynamic")
 *                 .build())
 *             .build());
 * 
 *         var exampleLinuxVirtualMachine = new LinuxVirtualMachine("exampleLinuxVirtualMachine", LinuxVirtualMachineArgs.builder()
 *             .name("machine")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .size("Standard_B1ls")
 *             .adminUsername("adminuser")
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .adminPassword("example-Password}{@literal @}{@code 7890")
 *             .disablePasswordAuthentication(false)
 *             .osDisk(LinuxVirtualMachineOsDiskArgs.builder()
 *                 .caching("ReadWrite")
 *                 .storageAccountType("Standard_LRS")
 *                 .build())
 *             .sourceImageReference(LinuxVirtualMachineSourceImageReferenceArgs.builder()
 *                 .publisher("Canonical")
 *                 .offer("0001-com-ubuntu-server-jammy")
 *                 .sku("22_04-lts")
 *                 .version("latest")
 *                 .build())
 *             .build());
 * 
 *         var exampleDataCollectionRule = new DataCollectionRule("exampleDataCollectionRule", DataCollectionRuleArgs.builder()
 *             .name("example-dcr")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .destinations(DataCollectionRuleDestinationsArgs.builder()
 *                 .azureMonitorMetrics(DataCollectionRuleDestinationsAzureMonitorMetricsArgs.builder()
 *                     .name("example-destination-metrics")
 *                     .build())
 *                 .build())
 *             .dataFlows(DataCollectionRuleDataFlowArgs.builder()
 *                 .streams("Microsoft-InsightsMetrics")
 *                 .destinations("example-destination-metrics")
 *                 .build())
 *             .build());
 * 
 *         var exampleDataCollectionEndpoint = new DataCollectionEndpoint("exampleDataCollectionEndpoint", DataCollectionEndpointArgs.builder()
 *             .name("example-dce")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .build());
 * 
 *         // associate to a Data Collection Rule
 *         var example1 = new DataCollectionRuleAssociation("example1", DataCollectionRuleAssociationArgs.builder()
 *             .name("example1-dcra")
 *             .targetResourceId(exampleLinuxVirtualMachine.id())
 *             .dataCollectionRuleId(exampleDataCollectionRule.id())
 *             .description("example")
 *             .build());
 * 
 *         // associate to a Data Collection Endpoint
 *         var example2 = new DataCollectionRuleAssociation("example2", DataCollectionRuleAssociationArgs.builder()
 *             .targetResourceId(exampleLinuxVirtualMachine.id())
 *             .dataCollectionEndpointId(exampleDataCollectionEndpoint.id())
 *             .description("example")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Insights`: 2023-03-11
 * 
 * ## Import
 * 
 * Data Collection Rules Association can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:monitoring/dataCollectionRuleAssociation:DataCollectionRuleAssociation example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/rg1/providers/Microsoft.Compute/virtualMachines/vm1/providers/Microsoft.Insights/dataCollectionRuleAssociations/dca1
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/dataCollectionRuleAssociation:DataCollectionRuleAssociation")
public class DataCollectionRuleAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Data Collection Endpoint which will be associated to the target resource.
     * 
     */
    @Export(name="dataCollectionEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataCollectionEndpointId;

    /**
     * @return The ID of the Data Collection Endpoint which will be associated to the target resource.
     * 
     */
    public Output<Optional<String>> dataCollectionEndpointId() {
        return Codegen.optional(this.dataCollectionEndpointId);
    }
    /**
     * The ID of the Data Collection Rule which will be associated to the target resource.
     * 
     * &gt; **Note:** Exactly one of `data_collection_endpoint_id` and `data_collection_rule_id` blocks must be specified.
     * 
     */
    @Export(name="dataCollectionRuleId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataCollectionRuleId;

    /**
     * @return The ID of the Data Collection Rule which will be associated to the target resource.
     * 
     * &gt; **Note:** Exactly one of `data_collection_endpoint_id` and `data_collection_rule_id` blocks must be specified.
     * 
     */
    public Output<Optional<String>> dataCollectionRuleId() {
        return Codegen.optional(this.dataCollectionRuleId);
    }
    /**
     * The description of the Data Collection Rule Association.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Data Collection Rule Association.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name which should be used for this Data Collection Rule Association. Changing this forces a new Data Collection Rule Association to be created. Defaults to `configurationAccessEndpoint`.
     * 
     * &gt; **Note:** `name` is required when `data_collection_rule_id` is specified. And when `data_collection_endpoint_id` is specified, the `name` is populated with `configurationAccessEndpoint`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Data Collection Rule Association. Changing this forces a new Data Collection Rule Association to be created. Defaults to `configurationAccessEndpoint`.
     * 
     * &gt; **Note:** `name` is required when `data_collection_rule_id` is specified. And when `data_collection_endpoint_id` is specified, the `name` is populated with `configurationAccessEndpoint`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Azure Resource which to associate to a Data Collection Rule or a Data Collection Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="targetResourceId", refs={String.class}, tree="[0]")
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Azure Resource which to associate to a Data Collection Rule or a Data Collection Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCollectionRuleAssociation(java.lang.String name) {
        this(name, DataCollectionRuleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCollectionRuleAssociation(java.lang.String name, DataCollectionRuleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCollectionRuleAssociation(java.lang.String name, DataCollectionRuleAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/dataCollectionRuleAssociation:DataCollectionRuleAssociation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataCollectionRuleAssociation(java.lang.String name, Output<java.lang.String> id, @Nullable DataCollectionRuleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/dataCollectionRuleAssociation:DataCollectionRuleAssociation", name, state, makeResourceOptions(options, id), false);
    }

    private static DataCollectionRuleAssociationArgs makeArgs(DataCollectionRuleAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataCollectionRuleAssociationArgs.Empty : args;
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
    public static DataCollectionRuleAssociation get(java.lang.String name, Output<java.lang.String> id, @Nullable DataCollectionRuleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataCollectionRuleAssociation(name, id, state, options);
    }
}
