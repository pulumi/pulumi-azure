// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.ScaleSetPacketCaptureArgs;
import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureFilter;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureMachineScope;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureStorageLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configures Network Packet Capturing against a Virtual Machine Scale Set using a Network Watcher.
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
 * import com.pulumi.azure.network.NetworkWatcher;
 * import com.pulumi.azure.network.NetworkWatcherArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSet;
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtension;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs;
 * import com.pulumi.azure.compute.ScaleSetPacketCapture;
 * import com.pulumi.azure.compute.ScaleSetPacketCaptureArgs;
 * import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs;
 * import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleNetworkWatcher = new NetworkWatcher("exampleNetworkWatcher", NetworkWatcherArgs.builder()
 *             .name("example-nw")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("example-vn")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("internal")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .build());
 * 
 *         var exampleLinuxVirtualMachineScaleSet = new LinuxVirtualMachineScaleSet("exampleLinuxVirtualMachineScaleSet", LinuxVirtualMachineScaleSetArgs.builder()
 *             .name("example-vmss")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .sku("Standard_F2")
 *             .instances(4)
 *             .adminUsername("adminuser")
 *             .adminPassword("P}{@literal @}{@code ssword1234!")
 *             .computerNamePrefix("my-linux-computer-name-prefix")
 *             .upgradeMode("Automatic")
 *             .disablePasswordAuthentication(false)
 *             .sourceImageReference(LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder()
 *                 .publisher("Canonical")
 *                 .offer("0001-com-ubuntu-server-jammy")
 *                 .sku("22_04-lts")
 *                 .version("latest")
 *                 .build())
 *             .osDisk(LinuxVirtualMachineScaleSetOsDiskArgs.builder()
 *                 .storageAccountType("Standard_LRS")
 *                 .caching("ReadWrite")
 *                 .build())
 *             .networkInterfaces(LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder()
 *                 .name("example")
 *                 .primary(true)
 *                 .ipConfigurations(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder()
 *                     .name("internal")
 *                     .primary(true)
 *                     .subnetId(exampleSubnet.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachineScaleSetExtension = new VirtualMachineScaleSetExtension("exampleVirtualMachineScaleSetExtension", VirtualMachineScaleSetExtensionArgs.builder()
 *             .name("network-watcher")
 *             .virtualMachineScaleSetId(exampleLinuxVirtualMachineScaleSet.id())
 *             .publisher("Microsoft.Azure.NetworkWatcher")
 *             .type("NetworkWatcherAgentLinux")
 *             .typeHandlerVersion("1.4")
 *             .autoUpgradeMinorVersion(true)
 *             .automaticUpgradeEnabled(true)
 *             .build());
 * 
 *         var exampleScaleSetPacketCapture = new ScaleSetPacketCapture("exampleScaleSetPacketCapture", ScaleSetPacketCaptureArgs.builder()
 *             .name("example-pc")
 *             .networkWatcherId(exampleNetworkWatcher.id())
 *             .virtualMachineScaleSetId(exampleLinuxVirtualMachineScaleSet.id())
 *             .storageLocation(ScaleSetPacketCaptureStorageLocationArgs.builder()
 *                 .filePath("/var/captures/packet.cap")
 *                 .build())
 *             .machineScope(ScaleSetPacketCaptureMachineScopeArgs.builder()
 *                 .includeInstanceIds("0")
 *                 .excludeInstanceIds("1")
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleVirtualMachineScaleSetExtension)
 *                 .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **Note:** This Resource requires that [the Network Watcher Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine Scale Set before capturing can be enabled which can be installed via the `azure.compute.VirtualMachineScaleSetExtension` resource.
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Network`: 2024-05-01
 * 
 * ## Import
 * 
 * Virtual Machine Scale Set Packet Captures can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
 * ```
 * 
 */
@ResourceType(type="azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture")
public class ScaleSetPacketCapture extends com.pulumi.resources.CustomResource {
    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="filters", refs={List.class,ScaleSetPacketCaptureFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ScaleSetPacketCaptureFilter>> filters;

    /**
     * @return One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<ScaleSetPacketCaptureFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * A `machine_scope` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="machineScope", refs={ScaleSetPacketCaptureMachineScope.class}, tree="[0]")
    private Output</* @Nullable */ ScaleSetPacketCaptureMachineScope> machineScope;

    /**
     * @return A `machine_scope` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<ScaleSetPacketCaptureMachineScope>> machineScope() {
        return Codegen.optional(this.machineScope);
    }
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerPacket", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maximumBytesPerPacket;

    /**
     * @return The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerPacket() {
        return Codegen.optional(this.maximumBytesPerPacket);
    }
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerSession", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maximumBytesPerSession;

    /**
     * @return Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerSession() {
        return Codegen.optional(this.maximumBytesPerSession);
    }
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumCaptureDurationInSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maximumCaptureDurationInSeconds;

    /**
     * @return The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumCaptureDurationInSeconds() {
        return Codegen.optional(this.maximumCaptureDurationInSeconds);
    }
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkWatcherId", refs={String.class}, tree="[0]")
    private Output<String> networkWatcherId;

    /**
     * @return The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkWatcherId() {
        return this.networkWatcherId;
    }
    /**
     * A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageLocation", refs={ScaleSetPacketCaptureStorageLocation.class}, tree="[0]")
    private Output<ScaleSetPacketCaptureStorageLocation> storageLocation;

    /**
     * @return A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<ScaleSetPacketCaptureStorageLocation> storageLocation() {
        return this.storageLocation;
    }
    /**
     * The resource ID of the Virtual Machine Scale Set to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineScaleSetId", refs={String.class}, tree="[0]")
    private Output<String> virtualMachineScaleSetId;

    /**
     * @return The resource ID of the Virtual Machine Scale Set to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineScaleSetId() {
        return this.virtualMachineScaleSetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScaleSetPacketCapture(java.lang.String name) {
        this(name, ScaleSetPacketCaptureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScaleSetPacketCapture(java.lang.String name, ScaleSetPacketCaptureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScaleSetPacketCapture(java.lang.String name, ScaleSetPacketCaptureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ScaleSetPacketCapture(java.lang.String name, Output<java.lang.String> id, @Nullable ScaleSetPacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture", name, state, makeResourceOptions(options, id), false);
    }

    private static ScaleSetPacketCaptureArgs makeArgs(ScaleSetPacketCaptureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ScaleSetPacketCaptureArgs.Empty : args;
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
    public static ScaleSetPacketCapture get(java.lang.String name, Output<java.lang.String> id, @Nullable ScaleSetPacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScaleSetPacketCapture(name, id, state, options);
    }
}
