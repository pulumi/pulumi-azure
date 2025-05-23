// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.ConnectionCertificateArgs;
import com.pulumi.azure.automation.inputs.ConnectionCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Automation Connection with type `Azure`.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.automation.Account;
 * import com.pulumi.azure.automation.AccountArgs;
 * import com.pulumi.azure.automation.Certificate;
 * import com.pulumi.azure.automation.CertificateArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.Filebase64Args;
 * import com.pulumi.azure.automation.ConnectionCertificate;
 * import com.pulumi.azure.automation.ConnectionCertificateArgs;
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
 *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
 *             .name("resourceGroup-example")
 *             .location("West Europe")
 *             .build());
 * 
 *         final var example = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("account-example")
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName("Basic")
 *             .build());
 * 
 *         var exampleCertificate = new Certificate("exampleCertificate", CertificateArgs.builder()
 *             .name("certificate-example")
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .automationAccountName(exampleAccount.name())
 *             .base64(StdFunctions.filebase64(Filebase64Args.builder()
 *                 .input("certificate.pfx")
 *                 .build()).result())
 *             .build());
 * 
 *         var exampleConnectionCertificate = new ConnectionCertificate("exampleConnectionCertificate", ConnectionCertificateArgs.builder()
 *             .name("connection-example")
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .automationAccountName(exampleAccount.name())
 *             .automationCertificateName(exampleCertificate.name())
 *             .subscriptionId(example.subscriptionId())
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
 * Automation Connection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:automation/connectionCertificate:ConnectionCertificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/connections/conn1
 * ```
 * 
 */
@ResourceType(type="azure:automation/connectionCertificate:ConnectionCertificate")
public class ConnectionCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", refs={String.class}, tree="[0]")
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The name of the automation certificate.
     * 
     */
    @Export(name="automationCertificateName", refs={String.class}, tree="[0]")
    private Output<String> automationCertificateName;

    /**
     * @return The name of the automation certificate.
     * 
     */
    public Output<String> automationCertificateName() {
        return this.automationCertificateName;
    }
    /**
     * A description for this Connection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this Connection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The id of subscription where the automation certificate exists.
     * 
     */
    @Export(name="subscriptionId", refs={String.class}, tree="[0]")
    private Output<String> subscriptionId;

    /**
     * @return The id of subscription where the automation certificate exists.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionCertificate(java.lang.String name) {
        this(name, ConnectionCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionCertificate(java.lang.String name, ConnectionCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionCertificate(java.lang.String name, ConnectionCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionCertificate:ConnectionCertificate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectionCertificate(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionCertificate:ConnectionCertificate", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionCertificateArgs makeArgs(ConnectionCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionCertificateArgs.Empty : args;
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
    public static ConnectionCertificate get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionCertificate(name, id, state, options);
    }
}
