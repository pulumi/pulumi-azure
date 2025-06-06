// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.DscConfigurationArgs;
import com.pulumi.azure.automation.inputs.DscConfigurationState;
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
 * Manages a Automation DSC Configuration.
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
 * import com.pulumi.azure.automation.DscConfiguration;
 * import com.pulumi.azure.automation.DscConfigurationArgs;
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
 *         var exampleDscConfiguration = new DscConfiguration("exampleDscConfiguration", DscConfigurationArgs.builder()
 *             .name("test")
 *             .resourceGroupName(example.name())
 *             .automationAccountName(exampleAccount.name())
 *             .location(example.location())
 *             .contentEmbedded("configuration test {}")
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
 * Automation DSC Configuration&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:automation/dscConfiguration:DscConfiguration configuration1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/configurations/configuration1
 * ```
 * 
 */
@ResourceType(type="azure:automation/dscConfiguration:DscConfiguration")
public class DscConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the DSC Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", refs={String.class}, tree="[0]")
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the DSC Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The PowerShell DSC Configuration script.
     * 
     */
    @Export(name="contentEmbedded", refs={String.class}, tree="[0]")
    private Output<String> contentEmbedded;

    /**
     * @return The PowerShell DSC Configuration script.
     * 
     */
    public Output<String> contentEmbedded() {
        return this.contentEmbedded;
    }
    /**
     * Description to go with DSC Configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description to go with DSC Configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Must be the same location as the Automation Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Must be the same location as the Automation Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Verbose log option.
     * 
     */
    @Export(name="logVerbose", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logVerbose;

    /**
     * @return Verbose log option.
     * 
     */
    public Output<Optional<Boolean>> logVerbose() {
        return Codegen.optional(this.logVerbose);
    }
    /**
     * Specifies the name of the DSC Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the DSC Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the DSC Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the DSC Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    public Output<String> state() {
        return this.state;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DscConfiguration(java.lang.String name) {
        this(name, DscConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DscConfiguration(java.lang.String name, DscConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DscConfiguration(java.lang.String name, DscConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/dscConfiguration:DscConfiguration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DscConfiguration(java.lang.String name, Output<java.lang.String> id, @Nullable DscConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/dscConfiguration:DscConfiguration", name, state, makeResourceOptions(options, id), false);
    }

    private static DscConfigurationArgs makeArgs(DscConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DscConfigurationArgs.Empty : args;
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
    public static DscConfiguration get(java.lang.String name, Output<java.lang.String> id, @Nullable DscConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DscConfiguration(name, id, state, options);
    }
}
