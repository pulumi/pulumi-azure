// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.CredentialServicePrincipalArgs;
import com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalState;
import com.pulumi.azure.datafactory.outputs.CredentialServicePrincipalServicePrincipalKey;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage a Data Factory Service Principal credential resource. These resources are used by Data Factory to access data sources.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Secret;
 * import com.pulumi.azure.keyvault.SecretArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceKeyVault;
 * import com.pulumi.azure.datafactory.LinkedServiceKeyVaultArgs;
 * import com.pulumi.azure.datafactory.CredentialServicePrincipal;
 * import com.pulumi.azure.datafactory.CredentialServicePrincipalArgs;
 * import com.pulumi.azure.datafactory.inputs.CredentialServicePrincipalServicePrincipalKeyArgs;
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
 *             .location("westeurope")
 *             .build());
 * 
 *         var exampleFactory = new Factory("exampleFactory", FactoryArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault("exampleKeyVault", KeyVaultArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tenantId(current.tenantId())
 *             .skuName("premium")
 *             .softDeleteRetentionDays(7)
 *             .accessPolicies(KeyVaultAccessPolicyArgs.builder()
 *                 .tenantId(current.tenantId())
 *                 .objectId(current.objectId())
 *                 .keyPermissions(                
 *                     "Create",
 *                     "Get")
 *                 .secretPermissions(                
 *                     "Set",
 *                     "Get",
 *                     "Delete",
 *                     "Purge",
 *                     "Recover")
 *                 .build())
 *             .build());
 * 
 *         var exampleSecret = new Secret("exampleSecret", SecretArgs.builder()
 *             .name("example")
 *             .value("example-secret")
 *             .keyVaultId(exampleKeyVault.id())
 *             .build());
 * 
 *         var exampleLinkedServiceKeyVault = new LinkedServiceKeyVault("exampleLinkedServiceKeyVault", LinkedServiceKeyVaultArgs.builder()
 *             .name("example")
 *             .dataFactoryId(exampleFactory.id())
 *             .keyVaultId(exampleKeyVault.id())
 *             .build());
 * 
 *         var exampleCredentialServicePrincipal = new CredentialServicePrincipal("exampleCredentialServicePrincipal", CredentialServicePrincipalArgs.builder()
 *             .name("example")
 *             .description("example description")
 *             .dataFactoryId(exampleFactory.id())
 *             .tenantId(current.tenantId())
 *             .servicePrincipalId(current.clientId())
 *             .servicePrincipalKey(CredentialServicePrincipalServicePrincipalKeyArgs.builder()
 *                 .linkedServiceName(exampleLinkedServiceKeyVault.name())
 *                 .secretName(exampleSecret.name())
 *                 .secretVersion(exampleSecret.version())
 *                 .build())
 *             .annotations(            
 *                 "1",
 *                 "2")
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
 * * `Microsoft.DataFactory`: 2018-06-01
 * 
 * ## Import
 * 
 * Data Factory Credentials can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:datafactory/credentialServicePrincipal:CredentialServicePrincipal example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.DataFactory/factories/example/credentials/credential1
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/credentialServicePrincipal:CredentialServicePrincipal")
public class CredentialServicePrincipal extends com.pulumi.resources.CustomResource {
    /**
     * List of tags that can be used for describing the Data Factory Credential.
     * 
     */
    @Export(name="annotations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Credential.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The Data Factory ID in which to associate the Credential with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", refs={String.class}, tree="[0]")
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Credential with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Credential.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Credential.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the name of the Credential. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Credential. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Client ID of the Service Principal.
     * 
     */
    @Export(name="servicePrincipalId", refs={String.class}, tree="[0]")
    private Output<String> servicePrincipalId;

    /**
     * @return The Client ID of the Service Principal.
     * 
     */
    public Output<String> servicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * A `service_principal_key` block as defined below.
     * 
     */
    @Export(name="servicePrincipalKey", refs={CredentialServicePrincipalServicePrincipalKey.class}, tree="[0]")
    private Output</* @Nullable */ CredentialServicePrincipalServicePrincipalKey> servicePrincipalKey;

    /**
     * @return A `service_principal_key` block as defined below.
     * 
     */
    public Output<Optional<CredentialServicePrincipalServicePrincipalKey>> servicePrincipalKey() {
        return Codegen.optional(this.servicePrincipalKey);
    }
    /**
     * The Tenant ID of the Service Principal.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The Tenant ID of the Service Principal.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CredentialServicePrincipal(java.lang.String name) {
        this(name, CredentialServicePrincipalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CredentialServicePrincipal(java.lang.String name, CredentialServicePrincipalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CredentialServicePrincipal(java.lang.String name, CredentialServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/credentialServicePrincipal:CredentialServicePrincipal", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CredentialServicePrincipal(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/credentialServicePrincipal:CredentialServicePrincipal", name, state, makeResourceOptions(options, id), false);
    }

    private static CredentialServicePrincipalArgs makeArgs(CredentialServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CredentialServicePrincipalArgs.Empty : args;
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
    public static CredentialServicePrincipal get(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CredentialServicePrincipal(name, id, state, options);
    }
}
