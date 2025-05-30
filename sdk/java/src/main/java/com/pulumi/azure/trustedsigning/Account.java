// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.trustedsigning;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.trustedsigning.AccountArgs;
import com.pulumi.azure.trustedsigning.inputs.AccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Trusted Signing Account.
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
 * import com.pulumi.azure.trustedsigning.Account;
 * import com.pulumi.azure.trustedsigning.AccountArgs;
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
 *             .name("example")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("example-account")
 *             .resourceGroupName(example.name())
 *             .location("West Europe")
 *             .skuName("Basic")
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
 * * `Microsoft.CodeSigning`: 2024-09-30-preview
 * 
 * ## Import
 * 
 * Trusted Signing Accounts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:trustedsigning/account:Account example /subscriptions/0000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.CodeSigning/codeSigningAccounts/example-account
 * ```
 * 
 */
@ResourceType(type="azure:trustedsigning/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The URI of the Trusted Signing Account which is used during signing files.
     * 
     */
    @Export(name="accountUri", refs={String.class}, tree="[0]")
    private Output<String> accountUri;

    /**
     * @return The URI of the Trusted Signing Account which is used during signing files.
     * 
     */
    public Output<String> accountUri() {
        return this.accountUri;
    }
    /**
     * The Azure Region where the Trusted Signing Account should exist. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Trusted Signing Account should exist. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Trusted Signing Account. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Trusted Signing Account. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Trusted Signing Account should exist. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Trusted Signing Account should exist. Changing this forces a new Trusted Signing Account to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The sku name of this Trusted Signing Account. Possible values are `Basic` and `Premium`.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return The sku name of this Trusted Signing Account. Possible values are `Basic` and `Premium`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the Trusted Signing Account.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Trusted Signing Account.
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
        super("azure:trustedsigning/account:Account", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Account(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:trustedsigning/account:Account", name, state, makeResourceOptions(options, id), false);
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
