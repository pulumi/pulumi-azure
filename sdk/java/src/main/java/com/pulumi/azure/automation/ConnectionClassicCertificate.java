// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.ConnectionClassicCertificateArgs;
import com.pulumi.azure.automation.inputs.ConnectionClassicCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Automation Connection with type `AzureClassicCertificate`.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.automation.Account;
 * import com.pulumi.azure.automation.AccountArgs;
 * import com.pulumi.azure.automation.ConnectionClassicCertificate;
 * import com.pulumi.azure.automation.ConnectionClassicCertificateArgs;
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
 *         final var exampleClientConfig = CoreFunctions.getClientConfig();
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;Basic&#34;)
 *             .build());
 * 
 *         var exampleConnectionClassicCertificate = new ConnectionClassicCertificate(&#34;exampleConnectionClassicCertificate&#34;, ConnectionClassicCertificateArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .automationAccountName(exampleAccount.name())
 *             .certificateAssetName(&#34;cert1&#34;)
 *             .subscriptionName(&#34;subs1&#34;)
 *             .subscriptionId(exampleClientConfig.applyValue(getClientConfigResult -&gt; getClientConfigResult.subscriptionId()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation Connection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:automation/connectionClassicCertificate:ConnectionClassicCertificate conn1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/connections/conn1
 * ```
 * 
 */
@ResourceType(type="azure:automation/connectionClassicCertificate:ConnectionClassicCertificate")
public class ConnectionClassicCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", type=String.class, parameters={})
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The name of the certificate asset.
     * 
     */
    @Export(name="certificateAssetName", type=String.class, parameters={})
    private Output<String> certificateAssetName;

    /**
     * @return The name of the certificate asset.
     * 
     */
    public Output<String> certificateAssetName() {
        return this.certificateAssetName;
    }
    /**
     * A description for this Connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The id of subscription.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The id of subscription.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The name of subscription.
     * 
     */
    @Export(name="subscriptionName", type=String.class, parameters={})
    private Output<String> subscriptionName;

    /**
     * @return The name of subscription.
     * 
     */
    public Output<String> subscriptionName() {
        return this.subscriptionName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionClassicCertificate(String name) {
        this(name, ConnectionClassicCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionClassicCertificate(String name, ConnectionClassicCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionClassicCertificate(String name, ConnectionClassicCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionClassicCertificate:ConnectionClassicCertificate", name, args == null ? ConnectionClassicCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionClassicCertificate(String name, Output<String> id, @Nullable ConnectionClassicCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionClassicCertificate:ConnectionClassicCertificate", name, state, makeResourceOptions(options, id));
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
    public static ConnectionClassicCertificate get(String name, Output<String> id, @Nullable ConnectionClassicCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionClassicCertificate(name, id, state, options);
    }
}