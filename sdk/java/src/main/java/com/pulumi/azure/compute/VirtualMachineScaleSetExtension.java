// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs;
import com.pulumi.azure.compute.inputs.VirtualMachineScaleSetExtensionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Extension for a Virtual Machine Scale Set.
 * 
 * &gt; **NOTE:** This resource is not intended to be used with the `azure.compute.ScaleSet` resource - instead it&#39;s intended for this to be used with the `azure.compute.LinuxVirtualMachineScaleSet` and `azure.compute.WindowsVirtualMachineScaleSet` resources.
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
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSet;
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtension;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleLinuxVirtualMachineScaleSet = new LinuxVirtualMachineScaleSet(&#34;exampleLinuxVirtualMachineScaleSet&#34;, LinuxVirtualMachineScaleSetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .sku(&#34;Standard_F2&#34;)
 *             .adminUsername(&#34;adminuser&#34;)
 *             .instances(1)
 *             .networkInterfaces(LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder()
 *                 .name(&#34;example&#34;)
 *                 .ipConfigurations(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder()
 *                     .name(&#34;internal&#34;)
 *                     .build())
 *                 .build())
 *             .osDisk(LinuxVirtualMachineScaleSetOsDiskArgs.builder()
 *                 .storageAccountType(&#34;Standard_LRS&#34;)
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachineScaleSetExtension = new VirtualMachineScaleSetExtension(&#34;exampleVirtualMachineScaleSetExtension&#34;, VirtualMachineScaleSetExtensionArgs.builder()        
 *             .virtualMachineScaleSetId(exampleLinuxVirtualMachineScaleSet.id())
 *             .publisher(&#34;Microsoft.Azure.Extensions&#34;)
 *             .type(&#34;CustomScript&#34;)
 *             .typeHandlerVersion(&#34;2.0&#34;)
 *             .settings(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;commandToExecute&#34;, &#34;echo $HOSTNAME&#34;)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Machine Scale Set Extensions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/virtualMachineScaleSetExtension:VirtualMachineScaleSetExtension test /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/virtualMachineScaleSets/scaleSet1/extensions/extension1
 * ```
 * 
 */
@ResourceType(type="azure:compute/virtualMachineScaleSetExtension:VirtualMachineScaleSetExtension")
public class VirtualMachineScaleSetExtension extends com.pulumi.resources.CustomResource {
    /**
     * Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    @Export(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> autoUpgradeMinorVersion() {
        return Codegen.optional(this.autoUpgradeMinorVersion);
    }
    /**
     * Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    @Export(name="automaticUpgradeEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticUpgradeEnabled;

    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> automaticUpgradeEnabled() {
        return Codegen.optional(this.automaticUpgradeEnabled);
    }
    /**
     * A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    public Output<Optional<String>> forceUpdateTag() {
        return Codegen.optional(this.forceUpdateTag);
    }
    /**
     * The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    @Export(name="protectedSettings", type=String.class, parameters={})
    private Output</* @Nullable */ String> protectedSettings;

    /**
     * @return A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    public Output<Optional<String>> protectedSettings() {
        return Codegen.optional(this.protectedSettings);
    }
    /**
     * An ordered list of Extension names which this should be provisioned after.
     * 
     */
    @Export(name="provisionAfterExtensions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> provisionAfterExtensions;

    /**
     * @return An ordered list of Extension names which this should be provisioned after.
     * 
     */
    public Output<Optional<List<String>>> provisionAfterExtensions() {
        return Codegen.optional(this.provisionAfterExtensions);
    }
    /**
     * Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="publisher", type=String.class, parameters={})
    private Output<String> publisher;

    /**
     * @return Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }
    /**
     * A JSON String which specifies Settings for the Extension.
     * 
     */
    @Export(name="settings", type=String.class, parameters={})
    private Output</* @Nullable */ String> settings;

    /**
     * @return A JSON String which specifies Settings for the Extension.
     * 
     */
    public Output<Optional<String>> settings() {
        return Codegen.optional(this.settings);
    }
    /**
     * Specifies the Type of the Extension. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the Type of the Extension. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    @Export(name="typeHandlerVersion", type=String.class, parameters={})
    private Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    public Output<String> typeHandlerVersion() {
        return this.typeHandlerVersion;
    }
    /**
     * The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineScaleSetId", type=String.class, parameters={})
    private Output<String> virtualMachineScaleSetId;

    /**
     * @return The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineScaleSetId() {
        return this.virtualMachineScaleSetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineScaleSetExtension(String name) {
        this(name, VirtualMachineScaleSetExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSetExtension(String name, VirtualMachineScaleSetExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSetExtension(String name, VirtualMachineScaleSetExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/virtualMachineScaleSetExtension:VirtualMachineScaleSetExtension", name, args == null ? VirtualMachineScaleSetExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineScaleSetExtension(String name, Output<String> id, @Nullable VirtualMachineScaleSetExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/virtualMachineScaleSetExtension:VirtualMachineScaleSetExtension", name, state, makeResourceOptions(options, id));
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
    public static VirtualMachineScaleSetExtension get(String name, Output<String> id, @Nullable VirtualMachineScaleSetExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSetExtension(name, id, state, options);
    }
}