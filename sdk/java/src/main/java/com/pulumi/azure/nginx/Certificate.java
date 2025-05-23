// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.nginx.CertificateArgs;
import com.pulumi.azure.nginx.inputs.CertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Certificate for an NGINX Deployment.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.Filebase64Args;
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
 *             .managedResourceGroup("example")
 *             .diagnoseSupportEnabled(true)
 *             .frontendPublic(DeploymentFrontendPublicArgs.builder()
 *                 .ipAddresses(examplePublicIp.id())
 *                 .build())
 *             .networkInterfaces(DeploymentNetworkInterfaceArgs.builder()
 *                 .subnetId(exampleSubnet.id())
 *                 .build())
 *             .build());
 * 
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var exampleKeyVault = new KeyVault("exampleKeyVault", KeyVaultArgs.builder()
 *             .name("examplekeyvault")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tenantId(current.tenantId())
 *             .skuName("premium")
 *             .accessPolicies(KeyVaultAccessPolicyArgs.builder()
 *                 .tenantId(current.tenantId())
 *                 .objectId(current.objectId())
 *                 .certificatePermissions(                
 *                     "Create",
 *                     "Delete",
 *                     "DeleteIssuers",
 *                     "Get",
 *                     "GetIssuers",
 *                     "Import",
 *                     "List",
 *                     "ListIssuers",
 *                     "ManageContacts",
 *                     "ManageIssuers",
 *                     "SetIssuers",
 *                     "Update")
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificate = new com.pulumi.azure.keyvault.Certificate("exampleCertificate", com.pulumi.azure.keyvault.CertificateArgs.builder()
 *             .name("imported-cert")
 *             .keyVaultId(exampleKeyVault.id())
 *             .certificate(CertificateCertificateArgs.builder()
 *                 .contents(StdFunctions.filebase64(Filebase64Args.builder()
 *                     .input("certificate-to-import.pfx")
 *                     .build()).result())
 *                 .password("")
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificate2 = new com.pulumi.azure.nginx.Certificate("exampleCertificate2", com.pulumi.azure.nginx.CertificateArgs.builder()
 *             .name("examplecert")
 *             .nginxDeploymentId(exampleDeployment.id())
 *             .keyVirtualPath("/src/cert/soservermekey.key")
 *             .certificateVirtualPath("/src/cert/server.cert")
 *             .keyVaultSecretId(exampleCertificate.secretId())
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
 * An NGINX Certificate can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:nginx/certificate:Certificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/deploy1/certificates/cer1
 * ```
 * 
 */
@ResourceType(type="azure:nginx/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * Specify the path to the certificate file of this certificate.
     * 
     */
    @Export(name="certificateVirtualPath", refs={String.class}, tree="[0]")
    private Output<String> certificateVirtualPath;

    /**
     * @return Specify the path to the certificate file of this certificate.
     * 
     */
    public Output<String> certificateVirtualPath() {
        return this.certificateVirtualPath;
    }
    /**
     * Specify the ID of the Key Vault Secret for this certificate.
     * 
     */
    @Export(name="keyVaultSecretId", refs={String.class}, tree="[0]")
    private Output<String> keyVaultSecretId;

    /**
     * @return Specify the ID of the Key Vault Secret for this certificate.
     * 
     */
    public Output<String> keyVaultSecretId() {
        return this.keyVaultSecretId;
    }
    /**
     * Specify the path to the key file of this certificate.
     * 
     */
    @Export(name="keyVirtualPath", refs={String.class}, tree="[0]")
    private Output<String> keyVirtualPath;

    /**
     * @return Specify the path to the key file of this certificate.
     * 
     */
    public Output<String> keyVirtualPath() {
        return this.keyVirtualPath;
    }
    /**
     * The name which should be used for this NGINX Certificate. Changing this forces a new NGINX Certificate to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this NGINX Certificate. Changing this forces a new NGINX Certificate to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the NGINX Deployment that this Certificate should be associated with. Changing this forces a new NGINX Certificate to be created.
     * 
     */
    @Export(name="nginxDeploymentId", refs={String.class}, tree="[0]")
    private Output<String> nginxDeploymentId;

    /**
     * @return The ID of the NGINX Deployment that this Certificate should be associated with. Changing this forces a new NGINX Certificate to be created.
     * 
     */
    public Output<String> nginxDeploymentId() {
        return this.nginxDeploymentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(java.lang.String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(java.lang.String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(java.lang.String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:nginx/certificate:Certificate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Certificate(java.lang.String name, Output<java.lang.String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:nginx/certificate:Certificate", name, state, makeResourceOptions(options, id), false);
    }

    private static CertificateArgs makeArgs(CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CertificateArgs.Empty : args;
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
    public static Certificate get(java.lang.String name, Output<java.lang.String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}
