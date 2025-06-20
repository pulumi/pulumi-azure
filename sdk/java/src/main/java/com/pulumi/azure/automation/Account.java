// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.AccountArgs;
import com.pulumi.azure.automation.inputs.AccountState;
import com.pulumi.azure.automation.outputs.AccountEncryption;
import com.pulumi.azure.automation.outputs.AccountIdentity;
import com.pulumi.azure.automation.outputs.AccountPrivateEndpointConnection;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Automation Account.
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
 *             .name("example-account")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .skuName("Basic")
 *             .tags(Map.of("environment", "development"))
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
 * * `Microsoft.Automation`: 2023-11-01, 2019-06-01
 * 
 * ## Import
 * 
 * Automation Accounts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:automation/account:Account account1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1
 * ```
 * 
 */
@ResourceType(type="azure:automation/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The Primary Access Key for the DSC Endpoint associated with this Automation Account.
     * 
     */
    @Export(name="dscPrimaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> dscPrimaryAccessKey;

    /**
     * @return The Primary Access Key for the DSC Endpoint associated with this Automation Account.
     * 
     */
    public Output<String> dscPrimaryAccessKey() {
        return this.dscPrimaryAccessKey;
    }
    /**
     * The Secondary Access Key for the DSC Endpoint associated with this Automation Account.
     * 
     */
    @Export(name="dscSecondaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> dscSecondaryAccessKey;

    /**
     * @return The Secondary Access Key for the DSC Endpoint associated with this Automation Account.
     * 
     */
    public Output<String> dscSecondaryAccessKey() {
        return this.dscSecondaryAccessKey;
    }
    /**
     * The DSC Server Endpoint associated with this Automation Account.
     * 
     */
    @Export(name="dscServerEndpoint", refs={String.class}, tree="[0]")
    private Output<String> dscServerEndpoint;

    /**
     * @return The DSC Server Endpoint associated with this Automation Account.
     * 
     */
    public Output<String> dscServerEndpoint() {
        return this.dscServerEndpoint;
    }
    /**
     * An `encryption` block as defined below.
     * 
     */
    @Export(name="encryptions", refs={List.class,AccountEncryption.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccountEncryption>> encryptions;

    /**
     * @return An `encryption` block as defined below.
     * 
     */
    public Output<Optional<List<AccountEncryption>>> encryptions() {
        return Codegen.optional(this.encryptions);
    }
    /**
     * The URL of automation hybrid service which is used for hybrid worker on-boarding With this Automation Account.
     * 
     */
    @Export(name="hybridServiceUrl", refs={String.class}, tree="[0]")
    private Output<String> hybridServiceUrl;

    /**
     * @return The URL of automation hybrid service which is used for hybrid worker on-boarding With this Automation Account.
     * 
     */
    public Output<String> hybridServiceUrl() {
        return this.hybridServiceUrl;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", refs={AccountIdentity.class}, tree="[0]")
    private Output</* @Nullable */ AccountIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<AccountIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Whether requests using non-AAD authentication are blocked. Defaults to `true`.
     * 
     */
    @Export(name="localAuthenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> localAuthenticationEnabled;

    /**
     * @return Whether requests using non-AAD authentication are blocked. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> localAuthenticationEnabled() {
        return Codegen.optional(this.localAuthenticationEnabled);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Automation Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Automation Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="privateEndpointConnections", refs={List.class,AccountPrivateEndpointConnection.class}, tree="[0,1]")
    private Output<List<AccountPrivateEndpointConnection>> privateEndpointConnections;

    public Output<List<AccountPrivateEndpointConnection>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Whether public network access is allowed for the automation account. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is allowed for the automation account. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the resource group in which the Automation Account is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Automation Account is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU of the account. Possible values are `Basic` and `Free`.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return The SKU of the account. Possible values are `Basic` and `Free`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
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
    public Account(java.lang.String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(java.lang.String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(java.lang.String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/account:Account", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Account(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/account:Account", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountArgs makeArgs(AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "dscPrimaryAccessKey",
                "dscSecondaryAccessKey"
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
    public static Account get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
