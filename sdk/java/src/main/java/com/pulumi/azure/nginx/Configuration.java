// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.nginx.ConfigurationArgs;
import com.pulumi.azure.nginx.inputs.ConfigurationState;
import com.pulumi.azure.nginx.outputs.ConfigurationConfigFile;
import com.pulumi.azure.nginx.outputs.ConfigurationProtectedFile;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the configuration for a Nginx Deployment.
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
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.nginx.Deployment;
 * import com.pulumi.azure.nginx.DeploymentArgs;
 * import com.pulumi.azure.nginx.inputs.DeploymentFrontendPublicArgs;
 * import com.pulumi.azure.nginx.inputs.DeploymentNetworkInterfaceArgs;
 * import com.pulumi.azure.nginx.Configuration;
 * import com.pulumi.azure.nginx.ConfigurationArgs;
 * import com.pulumi.azure.nginx.inputs.ConfigurationConfigFileArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.Base64encodeArgs;
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
 *             .name("example-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp("examplePublicIp", PublicIpArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .allocationMethod("Static")
 *             .sku("Standard")
 *             .tags(Map.of("environment", "Production"))
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
 *             .name("example-vnet")
 *             .addressSpaces("10.0.0.0/16")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
 *             .name("example-subnet")
 *             .resourceGroupName(example.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes("10.0.2.0/24")
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name("delegation")
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name("NGINX.NGINXPLUS/nginxDeployments")
 *                     .actions("Microsoft.Network/virtualNetworks/subnets/join/action")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDeployment = new Deployment("exampleDeployment", DeploymentArgs.builder()
 *             .name("example-nginx")
 *             .resourceGroupName(example.name())
 *             .sku("publicpreview_Monthly_gmz7xq9ge3py")
 *             .location(example.location())
 *             .diagnoseSupportEnabled(true)
 *             .frontendPublic(DeploymentFrontendPublicArgs.builder()
 *                 .ipAddresses(examplePublicIp.id())
 *                 .build())
 *             .networkInterfaces(DeploymentNetworkInterfaceArgs.builder()
 *                 .subnetId(exampleSubnet.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleConfiguration = new Configuration("exampleConfiguration", ConfigurationArgs.builder()
 *             .nginxDeploymentId(exampleDeployment.id())
 *             .rootFile("/etc/nginx/nginx.conf")
 *             .configFiles(            
 *                 ConfigurationConfigFileArgs.builder()
 *                     .content(StdFunctions.base64encode(Base64encodeArgs.builder()
 *                         .input("""
 * http {
 *     server {
 *         listen 80;
 *         location / {
 *             default_type text/html;
 *             return 200 '<!doctype html><html lang="en"><head></head><body>
 *                 <div>this one will be updated</div>
 *                 <div>at 10:38 am</div>
 *             </body></html>';
 *         }
 *         include site/*.conf;
 *     }
 * }
 *                         """)
 *                         .build()).result())
 *                     .virtualPath("/etc/nginx/nginx.conf")
 *                     .build(),
 *                 ConfigurationConfigFileArgs.builder()
 *                     .content(StdFunctions.base64encode(Base64encodeArgs.builder()
 *                         .input("""
 * location /bbb {
 *  default_type text/html;
 *  return 200 '<!doctype html><html lang="en"><head></head><body>
 *   <div>this one will be updated</div>
 *   <div>at 10:38 am</div>
 *  </body></html>';
 * }
 *                         """)
 *                         .build()).result())
 *                     .virtualPath("/etc/nginx/site/b.conf")
 *                     .build())
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
 * * `Nginx.NginxPlus`: 2024-11-01-preview
 * 
 * ## Import
 * 
 * An Nginx Configuration can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:nginx/configuration:Configuration example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/dep1/configurations/default
 * ```
 * 
 */
@ResourceType(type="azure:nginx/configuration:Configuration")
public class Configuration extends com.pulumi.resources.CustomResource {
    /**
     * One or more `config_file` blocks as defined below.
     * 
     */
    @Export(name="configFiles", refs={List.class,ConfigurationConfigFile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConfigurationConfigFile>> configFiles;

    /**
     * @return One or more `config_file` blocks as defined below.
     * 
     */
    public Output<Optional<List<ConfigurationConfigFile>>> configFiles() {
        return Codegen.optional(this.configFiles);
    }
    /**
     * The ID of the Nginx Deployment. Changing this forces a new Nginx Configuration to be created.
     * 
     */
    @Export(name="nginxDeploymentId", refs={String.class}, tree="[0]")
    private Output<String> nginxDeploymentId;

    /**
     * @return The ID of the Nginx Deployment. Changing this forces a new Nginx Configuration to be created.
     * 
     */
    public Output<String> nginxDeploymentId() {
        return this.nginxDeploymentId;
    }
    /**
     * Specifies the package data for this configuration.
     * 
     */
    @Export(name="packageData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> packageData;

    /**
     * @return Specifies the package data for this configuration.
     * 
     */
    public Output<Optional<String>> packageData() {
        return Codegen.optional(this.packageData);
    }
    /**
     * One or more `protected_file` blocks with sensitive information as defined below. If specified `config_file` must also be specified.
     * 
     */
    @Export(name="protectedFiles", refs={List.class,ConfigurationProtectedFile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConfigurationProtectedFile>> protectedFiles;

    /**
     * @return One or more `protected_file` blocks with sensitive information as defined below. If specified `config_file` must also be specified.
     * 
     */
    public Output<Optional<List<ConfigurationProtectedFile>>> protectedFiles() {
        return Codegen.optional(this.protectedFiles);
    }
    /**
     * Specifies the root file path of this Nginx Configuration.
     * 
     */
    @Export(name="rootFile", refs={String.class}, tree="[0]")
    private Output<String> rootFile;

    /**
     * @return Specifies the root file path of this Nginx Configuration.
     * 
     */
    public Output<String> rootFile() {
        return this.rootFile;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(java.lang.String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(java.lang.String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(java.lang.String name, ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:nginx/configuration:Configuration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Configuration(java.lang.String name, Output<java.lang.String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:nginx/configuration:Configuration", name, state, makeResourceOptions(options, id), false);
    }

    private static ConfigurationArgs makeArgs(ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConfigurationArgs.Empty : args;
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
    public static Configuration get(java.lang.String name, Output<java.lang.String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
