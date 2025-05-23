// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.CertificateArgs;
import com.pulumi.azure.automation.inputs.CertificateState;
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
 * Manages an Automation Certificate.
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
 * import com.pulumi.azure.automation.Account;
 * import com.pulumi.azure.automation.AccountArgs;
 * import com.pulumi.azure.automation.Certificate;
 * import com.pulumi.azure.automation.CertificateArgs;
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
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("account1")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("Basic")
 *             .build());
 * 
 *         var exampleCertificate = new Certificate("exampleCertificate", CertificateArgs.builder()
 *             .name("certificate1")
 *             .resourceGroupName(example.name())
 *             .automationAccountName(exampleAccount.name())
 *             .description("This is an example certificate")
 *             .base64(StdFunctions.filebase64(Filebase64Args.builder()
 *                 .input("certificate.pfx")
 *                 .build()).result())
 *             .exportable(true)
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
 * * `Microsoft.Automation`: 2023-11-01
 * 
 * ## Import
 * 
 * Automation Certificates can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:automation/certificate:Certificate certificate1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/certificates/certificate1
 * ```
 * 
 */
@ResourceType(type="azure:automation/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", refs={String.class}, tree="[0]")
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * Base64 encoded value of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="base64", refs={String.class}, tree="[0]")
    private Output<String> base64;

    /**
     * @return Base64 encoded value of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> base64() {
        return this.base64;
    }
    /**
     * The description of this Automation Certificate.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this Automation Certificate.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The is exportable flag of the certificate.
     * 
     */
    @Export(name="exportable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> exportable;

    /**
     * @return The is exportable flag of the certificate.
     * 
     */
    public Output<Optional<Boolean>> exportable() {
        return Codegen.optional(this.exportable);
    }
    /**
     * Specifies the name of the Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The thumbprint for the certificate.
     * 
     */
    @Export(name="thumbprint", refs={String.class}, tree="[0]")
    private Output<String> thumbprint;

    /**
     * @return The thumbprint for the certificate.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
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
        super("azure:automation/certificate:Certificate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Certificate(java.lang.String name, Output<java.lang.String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/certificate:Certificate", name, state, makeResourceOptions(options, id), false);
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
            .additionalSecretOutputs(List.of(
                "base64"
            ))
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
