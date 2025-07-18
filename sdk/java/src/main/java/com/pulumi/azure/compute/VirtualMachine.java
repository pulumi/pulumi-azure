// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.VirtualMachineArgs;
import com.pulumi.azure.compute.inputs.VirtualMachineState;
import com.pulumi.azure.compute.outputs.VirtualMachineAdditionalCapabilities;
import com.pulumi.azure.compute.outputs.VirtualMachineBootDiagnostics;
import com.pulumi.azure.compute.outputs.VirtualMachineIdentity;
import com.pulumi.azure.compute.outputs.VirtualMachineOsProfile;
import com.pulumi.azure.compute.outputs.VirtualMachineOsProfileLinuxConfig;
import com.pulumi.azure.compute.outputs.VirtualMachineOsProfileSecret;
import com.pulumi.azure.compute.outputs.VirtualMachineOsProfileWindowsConfig;
import com.pulumi.azure.compute.outputs.VirtualMachinePlan;
import com.pulumi.azure.compute.outputs.VirtualMachineStorageDataDisk;
import com.pulumi.azure.compute.outputs.VirtualMachineStorageImageReference;
import com.pulumi.azure.compute.outputs.VirtualMachineStorageOsDisk;
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
 * Manages a Virtual Machine.
 * 
 * ## Disclaimers
 * 
 * &gt; **Note:** The `azure.compute.VirtualMachine` resource has been superseded by the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources. The existing `azure.compute.VirtualMachine` resource will continue to be available throughout the 2.x releases however is in a feature-frozen state to maintain compatibility - new functionality will instead be added to the `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources.
 * 
 * &gt; **Note:** Data Disks can be attached either directly on the `azure.compute.VirtualMachine` resource, or using the `azure.compute.DataDiskAttachment` resource - but the two cannot be used together. If both are used against the same Virtual Machine, spurious changes will occur.
 * 
 * ## Example Usage
 * 
 * ### From An Azure Platform Image)
 * 
 * This example provisions a Virtual Machine with Managed Disks.
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
 * import com.pulumi.azure.compute.VirtualMachine;
 * import com.pulumi.azure.compute.VirtualMachineArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs;
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
 *         final var config = ctx.config();
 *         final var prefix = config.get("prefix").orElse("tfvmex");
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name(String.format("%s-resources", prefix))
 *             .location("West Europe")
 *             .build());
 * 
 *         var main = new VirtualNetwork("main", VirtualNetworkArgs.builder()
 *             .name(String.format("%s-network", prefix))
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var internal = new Subnet("internal", SubnetArgs.builder()
 *             .name("internal")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(main.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .build());
 * 
 *         var mainNetworkInterface = new NetworkInterface("mainNetworkInterface", NetworkInterfaceArgs.builder()
 *             .name(String.format("%s-nic", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name("testconfiguration1")
 *                 .subnetId(internal.id())
 *                 .privateIpAddressAllocation("Dynamic")
 *                 .build())
 *             .build());
 * 
 *         var mainVirtualMachine = new VirtualMachine("mainVirtualMachine", VirtualMachineArgs.builder()
 *             .name(String.format("%s-vm", prefix))
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .networkInterfaceIds(mainNetworkInterface.id())
 *             .vmSize("Standard_DS1_v2")
 *             .storageImageReference(VirtualMachineStorageImageReferenceArgs.builder()
 *                 .publisher("Canonical")
 *                 .offer("0001-com-ubuntu-server-jammy")
 *                 .sku("22_04-lts")
 *                 .version("latest")
 *                 .build())
 *             .storageOsDisk(VirtualMachineStorageOsDiskArgs.builder()
 *                 .name("myosdisk1")
 *                 .caching("ReadWrite")
 *                 .createOption("FromImage")
 *                 .managedDiskType("Standard_LRS")
 *                 .build())
 *             .osProfile(VirtualMachineOsProfileArgs.builder()
 *                 .computerName("hostname")
 *                 .adminUsername("testadmin")
 *                 .adminPassword("Password1234!")
 *                 .build())
 *             .osProfileLinuxConfig(VirtualMachineOsProfileLinuxConfigArgs.builder()
 *                 .disablePasswordAuthentication(false)
 *                 .build())
 *             .tags(Map.of("environment", "staging"))
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
 * * `Microsoft.Compute`: 2024-03-01, 2023-04-02
 * 
 * * `Microsoft.Network`: 2024-05-01
 * 
 * ## Import
 * 
 * Virtual Machines can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:compute/virtualMachine:VirtualMachine example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/machine1
 * ```
 * 
 */
@ResourceType(type="azure:compute/virtualMachine:VirtualMachine")
public class VirtualMachine extends com.pulumi.resources.CustomResource {
    /**
     * An `additional_capabilities` block as defined below.
     * 
     */
    @Export(name="additionalCapabilities", refs={VirtualMachineAdditionalCapabilities.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineAdditionalCapabilities> additionalCapabilities;

    /**
     * @return An `additional_capabilities` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachineAdditionalCapabilities>> additionalCapabilities() {
        return Codegen.optional(this.additionalCapabilities);
    }
    /**
     * The ID of the Availability Set in which the Virtual Machine should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="availabilitySetId", refs={String.class}, tree="[0]")
    private Output<String> availabilitySetId;

    /**
     * @return The ID of the Availability Set in which the Virtual Machine should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> availabilitySetId() {
        return this.availabilitySetId;
    }
    /**
     * A `boot_diagnostics` block as defined below.
     * 
     */
    @Export(name="bootDiagnostics", refs={VirtualMachineBootDiagnostics.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineBootDiagnostics> bootDiagnostics;

    /**
     * @return A `boot_diagnostics` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachineBootDiagnostics>> bootDiagnostics() {
        return Codegen.optional(this.bootDiagnostics);
    }
    /**
     * Should the Data Disks (either the Managed Disks / VHD Blobs) be deleted when the Virtual Machine is destroyed? Defaults to `false`.
     * 
     * &gt; **Note:** This setting works when instance is deleted via the provider only and don&#39;t forget to delete disks manually if you deleted VM manually. It can increase spending.
     * 
     */
    @Export(name="deleteDataDisksOnTermination", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteDataDisksOnTermination;

    /**
     * @return Should the Data Disks (either the Managed Disks / VHD Blobs) be deleted when the Virtual Machine is destroyed? Defaults to `false`.
     * 
     * &gt; **Note:** This setting works when instance is deleted via the provider only and don&#39;t forget to delete disks manually if you deleted VM manually. It can increase spending.
     * 
     */
    public Output<Optional<Boolean>> deleteDataDisksOnTermination() {
        return Codegen.optional(this.deleteDataDisksOnTermination);
    }
    /**
     * Should the OS Disk (either the Managed Disk / VHD Blob) be deleted when the Virtual Machine is destroyed? Defaults to `false`.
     * 
     * &gt; **Note:** This setting works when instance is deleted via the provider only and don&#39;t forget to delete disks manually if you deleted VM manually. It can increase spending.
     * 
     */
    @Export(name="deleteOsDiskOnTermination", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteOsDiskOnTermination;

    /**
     * @return Should the OS Disk (either the Managed Disk / VHD Blob) be deleted when the Virtual Machine is destroyed? Defaults to `false`.
     * 
     * &gt; **Note:** This setting works when instance is deleted via the provider only and don&#39;t forget to delete disks manually if you deleted VM manually. It can increase spending.
     * 
     */
    public Output<Optional<Boolean>> deleteOsDiskOnTermination() {
        return Codegen.optional(this.deleteOsDiskOnTermination);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", refs={VirtualMachineIdentity.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachineIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Specifies the BYOL Type for this Virtual Machine. This is only applicable to Windows Virtual Machines. Possible values are `Windows_Client` and `Windows_Server`.
     * 
     */
    @Export(name="licenseType", refs={String.class}, tree="[0]")
    private Output<String> licenseType;

    /**
     * @return Specifies the BYOL Type for this Virtual Machine. This is only applicable to Windows Virtual Machines. Possible values are `Windows_Client` and `Windows_Server`.
     * 
     */
    public Output<String> licenseType() {
        return this.licenseType;
    }
    /**
     * Specifies the Azure Region where the Virtual Machine exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Virtual Machine exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of Network Interface IDs which should be associated with the Virtual Machine.
     * 
     */
    @Export(name="networkInterfaceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return A list of Network Interface IDs which should be associated with the Virtual Machine.
     * 
     */
    public Output<List<String>> networkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * An `os_profile` block as defined below. Required when `create_option` in the `storage_os_disk` block is set to `FromImage`.
     * 
     */
    @Export(name="osProfile", refs={VirtualMachineOsProfile.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineOsProfile> osProfile;

    /**
     * @return An `os_profile` block as defined below. Required when `create_option` in the `storage_os_disk` block is set to `FromImage`.
     * 
     */
    public Output<Optional<VirtualMachineOsProfile>> osProfile() {
        return Codegen.optional(this.osProfile);
    }
    /**
     * (Required, when a Linux machine) An `os_profile_linux_config` block as defined below.
     * 
     */
    @Export(name="osProfileLinuxConfig", refs={VirtualMachineOsProfileLinuxConfig.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineOsProfileLinuxConfig> osProfileLinuxConfig;

    /**
     * @return (Required, when a Linux machine) An `os_profile_linux_config` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachineOsProfileLinuxConfig>> osProfileLinuxConfig() {
        return Codegen.optional(this.osProfileLinuxConfig);
    }
    /**
     * One or more `os_profile_secrets` blocks as defined below.
     * 
     */
    @Export(name="osProfileSecrets", refs={List.class,VirtualMachineOsProfileSecret.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineOsProfileSecret>> osProfileSecrets;

    /**
     * @return One or more `os_profile_secrets` blocks as defined below.
     * 
     */
    public Output<Optional<List<VirtualMachineOsProfileSecret>>> osProfileSecrets() {
        return Codegen.optional(this.osProfileSecrets);
    }
    /**
     * (Required, when a Windows machine) An `os_profile_windows_config` block as defined below.
     * 
     */
    @Export(name="osProfileWindowsConfig", refs={VirtualMachineOsProfileWindowsConfig.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineOsProfileWindowsConfig> osProfileWindowsConfig;

    /**
     * @return (Required, when a Windows machine) An `os_profile_windows_config` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachineOsProfileWindowsConfig>> osProfileWindowsConfig() {
        return Codegen.optional(this.osProfileWindowsConfig);
    }
    /**
     * A `plan` block as defined below.
     * 
     */
    @Export(name="plan", refs={VirtualMachinePlan.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachinePlan> plan;

    /**
     * @return A `plan` block as defined below.
     * 
     */
    public Output<Optional<VirtualMachinePlan>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * The ID of the Network Interface (which must be attached to the Virtual Machine) which should be the Primary Network Interface for this Virtual Machine.
     * 
     */
    @Export(name="primaryNetworkInterfaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> primaryNetworkInterfaceId;

    /**
     * @return The ID of the Network Interface (which must be attached to the Virtual Machine) which should be the Primary Network Interface for this Virtual Machine.
     * 
     */
    public Output<Optional<String>> primaryNetworkInterfaceId() {
        return Codegen.optional(this.primaryNetworkInterfaceId);
    }
    /**
     * The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created
     * 
     */
    @Export(name="proximityPlacementGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupId() {
        return Codegen.optional(this.proximityPlacementGroupId);
    }
    /**
     * Specifies the name of the Resource Group in which the Virtual Machine should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Virtual Machine should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `storage_data_disk` blocks as defined below.
     * 
     * &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * 
     */
    @Export(name="storageDataDisks", refs={List.class,VirtualMachineStorageDataDisk.class}, tree="[0,1]")
    private Output<List<VirtualMachineStorageDataDisk>> storageDataDisks;

    /**
     * @return One or more `storage_data_disk` blocks as defined below.
     * 
     * &gt; **Please Note:** Data Disks can also be attached either using this block or the `azure.compute.DataDiskAttachment` resource - but not both.
     * 
     */
    public Output<List<VirtualMachineStorageDataDisk>> storageDataDisks() {
        return this.storageDataDisks;
    }
    /**
     * A `storage_image_reference` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageImageReference", refs={VirtualMachineStorageImageReference.class}, tree="[0]")
    private Output<VirtualMachineStorageImageReference> storageImageReference;

    /**
     * @return A `storage_image_reference` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<VirtualMachineStorageImageReference> storageImageReference() {
        return this.storageImageReference;
    }
    /**
     * A `storage_os_disk` block as defined below.
     * 
     */
    @Export(name="storageOsDisk", refs={VirtualMachineStorageOsDisk.class}, tree="[0]")
    private Output<VirtualMachineStorageOsDisk> storageOsDisk;

    /**
     * @return A `storage_os_disk` block as defined below.
     * 
     */
    public Output<VirtualMachineStorageOsDisk> storageOsDisk() {
        return this.storageOsDisk;
    }
    /**
     * A mapping of tags to assign to the Virtual Machine.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Virtual Machine.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the [size of the Virtual Machine](https://docs.microsoft.com/azure/virtual-machines/sizes-general). See also [Azure VM Naming Conventions](https://docs.microsoft.com/azure/virtual-machines/vm-naming-conventions).
     * 
     */
    @Export(name="vmSize", refs={String.class}, tree="[0]")
    private Output<String> vmSize;

    /**
     * @return Specifies the [size of the Virtual Machine](https://docs.microsoft.com/azure/virtual-machines/sizes-general). See also [Azure VM Naming Conventions](https://docs.microsoft.com/azure/virtual-machines/vm-naming-conventions).
     * 
     */
    public Output<String> vmSize() {
        return this.vmSize;
    }
    /**
     * A list of a single item of the Availability Zone which the Virtual Machine should be allocated in. Changing this forces a new resource to be created.
     * 
     * &gt; **Please Note:** Availability Zones are [only supported in several regions at this time](https://docs.microsoft.com/azure/availability-zones/az-overview).
     * 
     * For more information on the different example configurations, please check out the [Azure documentation](https://docs.microsoft.com/en-gb/rest/api/compute/virtualmachines/createorupdate#examples)
     * 
     */
    @Export(name="zones", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zones;

    /**
     * @return A list of a single item of the Availability Zone which the Virtual Machine should be allocated in. Changing this forces a new resource to be created.
     * 
     * &gt; **Please Note:** Availability Zones are [only supported in several regions at this time](https://docs.microsoft.com/azure/availability-zones/az-overview).
     * 
     * For more information on the different example configurations, please check out the [Azure documentation](https://docs.microsoft.com/en-gb/rest/api/compute/virtualmachines/createorupdate#examples)
     * 
     */
    public Output<Optional<String>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachine(java.lang.String name) {
        this(name, VirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachine(java.lang.String name, VirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(java.lang.String name, VirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/virtualMachine:VirtualMachine", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VirtualMachine(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/virtualMachine:VirtualMachine", name, state, makeResourceOptions(options, id), false);
    }

    private static VirtualMachineArgs makeArgs(VirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VirtualMachineArgs.Empty : args;
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
    public static VirtualMachine get(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, state, options);
    }
}
