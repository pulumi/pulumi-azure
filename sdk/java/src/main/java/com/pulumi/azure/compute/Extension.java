// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.ExtensionArgs;
import com.pulumi.azure.compute.inputs.ExtensionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Machine Extension to provide post deployment configuration
 * and run automated tasks.
 * 
 * &gt; **NOTE:** Custom Script Extensions for Linux &amp; Windows require that the `commandToExecute` returns a `0` exit code to be classified as successfully deployed. You can achieve this by appending `exit 0` to the end of your `commandToExecute`.
 * 
 * &gt; **NOTE:** Custom Script Extensions require that the Azure Virtual Machine Guest Agent is running on the Virtual Machine.
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
 * import com.pulumi.azure.network.NetworkInterface;
 * import com.pulumi.azure.network.NetworkInterfaceArgs;
 * import com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.compute.VirtualMachine;
 * import com.pulumi.azure.compute.VirtualMachineArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineStorageOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileArgs;
 * import com.pulumi.azure.compute.inputs.VirtualMachineOsProfileLinuxConfigArgs;
 * import com.pulumi.azure.compute.Extension;
 * import com.pulumi.azure.compute.ExtensionArgs;
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
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .tags(Map.of(&#34;environment&#34;, &#34;staging&#34;))
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleVirtualMachine = new VirtualMachine(&#34;exampleVirtualMachine&#34;, VirtualMachineArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .vmSize(&#34;Standard_F2&#34;)
 *             .storageImageReference(VirtualMachineStorageImageReferenceArgs.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;UbuntuServer&#34;)
 *                 .sku(&#34;16.04-LTS&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .storageOsDisk(VirtualMachineStorageOsDiskArgs.builder()
 *                 .name(&#34;myosdisk1&#34;)
 *                 .vhdUri(Output.tuple(exampleAccount.primaryBlobEndpoint(), exampleContainer.name()).applyValue(values -&gt; {
 *                     var primaryBlobEndpoint = values.t1;
 *                     var name = values.t2;
 *                     return String.format(&#34;%s%s/myosdisk1.vhd&#34;, primaryBlobEndpoint,name);
 *                 }))
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .createOption(&#34;FromImage&#34;)
 *                 .build())
 *             .osProfile(VirtualMachineOsProfileArgs.builder()
 *                 .computerName(&#34;hostname&#34;)
 *                 .adminUsername(&#34;testadmin&#34;)
 *                 .adminPassword(&#34;Password1234!&#34;)
 *                 .build())
 *             .osProfileLinuxConfig(VirtualMachineOsProfileLinuxConfigArgs.builder()
 *                 .disablePasswordAuthentication(false)
 *                 .build())
 *             .tags(Map.of(&#34;environment&#34;, &#34;staging&#34;))
 *             .build());
 * 
 *         var exampleExtension = new Extension(&#34;exampleExtension&#34;, ExtensionArgs.builder()        
 *             .virtualMachineId(exampleVirtualMachine.id())
 *             .publisher(&#34;Microsoft.Azure.Extensions&#34;)
 *             .type(&#34;CustomScript&#34;)
 *             .typeHandlerVersion(&#34;2.0&#34;)
 *             .settings(&#34;&#34;&#34;
 * 	{
 * 		&#34;commandToExecute&#34;: &#34;hostname &amp;&amp; uptime&#34;
 * 	}
 *             &#34;&#34;&#34;)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Machine Extensions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/extension:Extension example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/myVM/extensions/extensionName
 * ```
 * 
 */
@ResourceType(type="azure:compute/extension:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * Specifies if the platform deploys
     * the latest minor version update to the `type_handler_version` specified.
     * 
     */
    @Export(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Specifies if the platform deploys
     * the latest minor version update to the `type_handler_version` specified.
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
     * The name of the virtual machine extension peering. Changing
     * this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the virtual machine extension peering. Changing
     * this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The protected_settings passed to the
     * extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    @Export(name="protectedSettings", type=String.class, parameters={})
    private Output</* @Nullable */ String> protectedSettings;

    /**
     * @return The protected_settings passed to the
     * extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    public Output<Optional<String>> protectedSettings() {
        return Codegen.optional(this.protectedSettings);
    }
    /**
     * The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="publisher", type=String.class, parameters={})
    private Output<String> publisher;

    /**
     * @return The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }
    /**
     * The settings passed to the extension, these are
     * specified as a JSON object in a string.
     * 
     */
    @Export(name="settings", type=String.class, parameters={})
    private Output</* @Nullable */ String> settings;

    /**
     * @return The settings passed to the extension, these are
     * specified as a JSON object in a string.
     * 
     */
    public Output<Optional<String>> settings() {
        return Codegen.optional(this.settings);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of extension, available types for a publisher can
     * be found using the Azure CLI.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of extension, available types for a publisher can
     * be found using the Azure CLI.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Specifies the version of the extension to
     * use, available versions can be found using the Azure CLI.
     * 
     */
    @Export(name="typeHandlerVersion", type=String.class, parameters={})
    private Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to
     * use, available versions can be found using the Azure CLI.
     * 
     */
    public Output<String> typeHandlerVersion() {
        return this.typeHandlerVersion;
    }
    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created
     * 
     */
    @Export(name="virtualMachineId", type=String.class, parameters={})
    private Output<String> virtualMachineId;

    /**
     * @return The ID of the Virtual Machine. Changing this forces a new resource to be created
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/extension:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/extension:Extension", name, state, makeResourceOptions(options, id));
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
    public static Extension get(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, state, options);
    }
}