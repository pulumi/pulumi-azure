// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.keyvault.CertifiateArgs;
import com.pulumi.azure.keyvault.inputs.CertifiateState;
import com.pulumi.azure.keyvault.outputs.CertifiateCertificate;
import com.pulumi.azure.keyvault.outputs.CertifiateCertificateAttribute;
import com.pulumi.azure.keyvault.outputs.CertifiateCertificatePolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Key Vault Certificate.
 * 
 * ## Example Usage
 * 
 * ### Importing A PFX)
 * 
 * &gt; **Note:** this example assumed the PFX file is located in the same directory at `certificate-to-import.pfx`.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Certificate;
 * import com.pulumi.azure.keyvault.CertificateArgs;
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
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
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
 *                 .keyPermissions(                
 *                     "Backup",
 *                     "Create",
 *                     "Decrypt",
 *                     "Delete",
 *                     "Encrypt",
 *                     "Get",
 *                     "Import",
 *                     "List",
 *                     "Purge",
 *                     "Recover",
 *                     "Restore",
 *                     "Sign",
 *                     "UnwrapKey",
 *                     "Update",
 *                     "Verify",
 *                     "WrapKey")
 *                 .secretPermissions(                
 *                     "Backup",
 *                     "Delete",
 *                     "Get",
 *                     "List",
 *                     "Purge",
 *                     "Recover",
 *                     "Restore",
 *                     "Set")
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificate = new Certificate("exampleCertificate", CertificateArgs.builder()
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
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Generating a new certificate
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Certificate;
 * import com.pulumi.azure.keyvault.CertificateArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyIssuerParametersArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyKeyPropertiesArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicySecretPropertiesArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs;
 * import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs;
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
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault("exampleKeyVault", KeyVaultArgs.builder()
 *             .name("examplekeyvault")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tenantId(current.tenantId())
 *             .skuName("standard")
 *             .softDeleteRetentionDays(7)
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
 *                     "Purge",
 *                     "SetIssuers",
 *                     "Update")
 *                 .keyPermissions(                
 *                     "Backup",
 *                     "Create",
 *                     "Decrypt",
 *                     "Delete",
 *                     "Encrypt",
 *                     "Get",
 *                     "Import",
 *                     "List",
 *                     "Purge",
 *                     "Recover",
 *                     "Restore",
 *                     "Sign",
 *                     "UnwrapKey",
 *                     "Update",
 *                     "Verify",
 *                     "WrapKey")
 *                 .secretPermissions(                
 *                     "Backup",
 *                     "Delete",
 *                     "Get",
 *                     "List",
 *                     "Purge",
 *                     "Recover",
 *                     "Restore",
 *                     "Set")
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificate = new Certificate("exampleCertificate", CertificateArgs.builder()
 *             .name("generated-cert")
 *             .keyVaultId(exampleKeyVault.id())
 *             .certificatePolicy(CertificateCertificatePolicyArgs.builder()
 *                 .issuerParameters(CertificateCertificatePolicyIssuerParametersArgs.builder()
 *                     .name("Self")
 *                     .build())
 *                 .keyProperties(CertificateCertificatePolicyKeyPropertiesArgs.builder()
 *                     .exportable(true)
 *                     .keySize(2048)
 *                     .keyType("RSA")
 *                     .reuseKey(true)
 *                     .build())
 *                 .lifetimeActions(CertificateCertificatePolicyLifetimeActionArgs.builder()
 *                     .action(CertificateCertificatePolicyLifetimeActionActionArgs.builder()
 *                         .actionType("AutoRenew")
 *                         .build())
 *                     .trigger(CertificateCertificatePolicyLifetimeActionTriggerArgs.builder()
 *                         .daysBeforeExpiry(30)
 *                         .build())
 *                     .build())
 *                 .secretProperties(CertificateCertificatePolicySecretPropertiesArgs.builder()
 *                     .contentType("application/x-pkcs12")
 *                     .build())
 *                 .x509CertificateProperties(CertificateCertificatePolicyX509CertificatePropertiesArgs.builder()
 *                     .extendedKeyUsages("1.3.6.1.5.5.7.3.1")
 *                     .keyUsages(                    
 *                         "cRLSign",
 *                         "dataEncipherment",
 *                         "digitalSignature",
 *                         "keyAgreement",
 *                         "keyCertSign",
 *                         "keyEncipherment")
 *                     .subjectAlternativeNames(CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.builder()
 *                         .dnsNames(                        
 *                             "internal.contoso.com",
 *                             "domain.hello.world")
 *                         .build())
 *                     .subject("CN=hello-world")
 *                     .validityInMonths(12)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Key Vault Certificates can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:keyvault/certifiate:Certifiate example &#34;https://example-keyvault.vault.azure.net/certificates/example/fdf067c93bbb4b22bff4d8b7a9a56217&#34;
 * ```
 * 
 * @deprecated
 * azure.keyvault.Certifiate has been deprecated in favor of azure.keyvault.Certificate
 * 
 */
@Deprecated /* azure.keyvault.Certifiate has been deprecated in favor of azure.keyvault.Certificate */
@ResourceType(type="azure:keyvault/certifiate:Certifiate")
public class Certifiate extends com.pulumi.resources.CustomResource {
    /**
     * A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * 
     */
    @Export(name="certificate", refs={CertifiateCertificate.class}, tree="[0]")
    private Output</* @Nullable */ CertifiateCertificate> certificate;

    /**
     * @return A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * 
     */
    public Output<Optional<CertifiateCertificate>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * A `certificate_attribute` block as defined below.
     * 
     */
    @Export(name="certificateAttributes", refs={List.class,CertifiateCertificateAttribute.class}, tree="[0,1]")
    private Output<List<CertifiateCertificateAttribute>> certificateAttributes;

    /**
     * @return A `certificate_attribute` block as defined below.
     * 
     */
    public Output<List<CertifiateCertificateAttribute>> certificateAttributes() {
        return this.certificateAttributes;
    }
    /**
     * The raw Key Vault Certificate data represented as a hexadecimal string.
     * 
     */
    @Export(name="certificateData", refs={String.class}, tree="[0]")
    private Output<String> certificateData;

    /**
     * @return The raw Key Vault Certificate data represented as a hexadecimal string.
     * 
     */
    public Output<String> certificateData() {
        return this.certificateData;
    }
    /**
     * The Base64 encoded Key Vault Certificate data.
     * 
     */
    @Export(name="certificateDataBase64", refs={String.class}, tree="[0]")
    private Output<String> certificateDataBase64;

    /**
     * @return The Base64 encoded Key Vault Certificate data.
     * 
     */
    public Output<String> certificateDataBase64() {
        return this.certificateDataBase64;
    }
    /**
     * A `certificate_policy` block as defined below. Changing this (except the `lifetime_action` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificate_policy` is required. Provide `certificate` to import an existing certificate, `certificate_policy` to generate a new certificate.
     * 
     */
    @Export(name="certificatePolicy", refs={CertifiateCertificatePolicy.class}, tree="[0]")
    private Output<CertifiateCertificatePolicy> certificatePolicy;

    /**
     * @return A `certificate_policy` block as defined below. Changing this (except the `lifetime_action` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificate_policy` is required. Provide `certificate` to import an existing certificate, `certificate_policy` to generate a new certificate.
     * 
     */
    public Output<CertifiateCertificatePolicy> certificatePolicy() {
        return this.certificatePolicy;
    }
    /**
     * The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="keyVaultId", refs={String.class}, tree="[0]")
    private Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won&#39;t auto-rotate values if used in other Azure Services.
     * 
     */
    @Export(name="resourceManagerId", refs={String.class}, tree="[0]")
    private Output<String> resourceManagerId;

    /**
     * @return The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won&#39;t auto-rotate values if used in other Azure Services.
     * 
     */
    public Output<String> resourceManagerId() {
        return this.resourceManagerId;
    }
    /**
     * The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
     * 
     */
    @Export(name="resourceManagerVersionlessId", refs={String.class}, tree="[0]")
    private Output<String> resourceManagerVersionlessId;

    /**
     * @return The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
     * 
     */
    public Output<String> resourceManagerVersionlessId() {
        return this.resourceManagerVersionlessId;
    }
    /**
     * The ID of the associated Key Vault Secret.
     * 
     */
    @Export(name="secretId", refs={String.class}, tree="[0]")
    private Output<String> secretId;

    /**
     * @return The ID of the associated Key Vault Secret.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
     * 
     */
    @Export(name="thumbprint", refs={String.class}, tree="[0]")
    private Output<String> thumbprint;

    /**
     * @return The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }
    /**
     * The current version of the Key Vault Certificate.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The current version of the Key Vault Certificate.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The Base ID of the Key Vault Certificate.
     * 
     */
    @Export(name="versionlessId", refs={String.class}, tree="[0]")
    private Output<String> versionlessId;

    /**
     * @return The Base ID of the Key Vault Certificate.
     * 
     */
    public Output<String> versionlessId() {
        return this.versionlessId;
    }
    /**
     * The Base ID of the Key Vault Secret.
     * 
     */
    @Export(name="versionlessSecretId", refs={String.class}, tree="[0]")
    private Output<String> versionlessSecretId;

    /**
     * @return The Base ID of the Key Vault Secret.
     * 
     */
    public Output<String> versionlessSecretId() {
        return this.versionlessSecretId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certifiate(java.lang.String name) {
        this(name, CertifiateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certifiate(java.lang.String name, CertifiateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certifiate(java.lang.String name, CertifiateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/certifiate:Certifiate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Certifiate(java.lang.String name, Output<java.lang.String> id, @Nullable CertifiateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/certifiate:Certifiate", name, state, makeResourceOptions(options, id), false);
    }

    private static CertifiateArgs makeArgs(CertifiateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CertifiateArgs.Empty : args;
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
    public static Certifiate get(java.lang.String name, Output<java.lang.String> id, @Nullable CertifiateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certifiate(name, id, state, options);
    }
}
