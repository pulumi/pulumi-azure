// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.notificationhub.AuthorizationRuleArgs;
import com.pulumi.azure.notificationhub.inputs.AuthorizationRuleState;
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
 * Manages an Authorization Rule associated with a Notification Hub within a Notification Hub Namespace.
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
 * import com.pulumi.azure.notificationhub.Namespace;
 * import com.pulumi.azure.notificationhub.NamespaceArgs;
 * import com.pulumi.azure.notificationhub.Hub;
 * import com.pulumi.azure.notificationhub.HubArgs;
 * import com.pulumi.azure.notificationhub.AuthorizationRule;
 * import com.pulumi.azure.notificationhub.AuthorizationRuleArgs;
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
 *             .name("notificationhub-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleNamespace = new Namespace("exampleNamespace", NamespaceArgs.builder()
 *             .name("myappnamespace")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .namespaceType("NotificationHub")
 *             .skuName("Free")
 *             .build());
 * 
 *         var exampleHub = new Hub("exampleHub", HubArgs.builder()
 *             .name("mynotificationhub")
 *             .namespaceName(exampleNamespace.name())
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .build());
 * 
 *         var exampleAuthorizationRule = new AuthorizationRule("exampleAuthorizationRule", AuthorizationRuleArgs.builder()
 *             .name("management-auth-rule")
 *             .notificationHubName(exampleHub.name())
 *             .namespaceName(exampleNamespace.name())
 *             .resourceGroupName(example.name())
 *             .manage(true)
 *             .send(true)
 *             .listen(true)
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
 * * `Microsoft.NotificationHubs`: 2023-09-01
 * 
 * ## Import
 * 
 * Notification Hub Authorization Rule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:notificationhub/authorizationRule:AuthorizationRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.NotificationHubs/namespaces/namespace1/notificationHubs/hub1/authorizationRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:notificationhub/authorizationRule:AuthorizationRule")
public class AuthorizationRule extends com.pulumi.resources.CustomResource {
    /**
     * Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
     * 
     */
    @Export(name="listen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> listen;

    /**
     * @return Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> listen() {
        return Codegen.optional(this.listen);
    }
    /**
     * Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
     * 
     * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
     * 
     */
    @Export(name="manage", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> manage;

    /**
     * @return Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
     * 
     * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
     * 
     */
    public Output<Optional<Boolean>> manage() {
        return Codegen.optional(this.manage);
    }
    /**
     * The name to use for this Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name to use for this Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="notificationHubName", refs={String.class}, tree="[0]")
    private Output<String> notificationHubName;

    /**
     * @return The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> notificationHubName() {
        return this.notificationHubName;
    }
    /**
     * The Primary Access Key associated with this Authorization Rule.
     * 
     */
    @Export(name="primaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> primaryAccessKey;

    /**
     * @return The Primary Access Key associated with this Authorization Rule.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * The Primary Connetion String associated with this Authorization Rule.
     * 
     */
    @Export(name="primaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> primaryConnectionString;

    /**
     * @return The Primary Connetion String associated with this Authorization Rule.
     * 
     */
    public Output<String> primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Secondary Access Key associated with this Authorization Rule.
     * 
     */
    @Export(name="secondaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> secondaryAccessKey;

    /**
     * @return The Secondary Access Key associated with this Authorization Rule.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * The Secondary Connetion String associated with this Authorization Rule.
     * 
     */
    @Export(name="secondaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> secondaryConnectionString;

    /**
     * @return The Secondary Connetion String associated with this Authorization Rule.
     * 
     */
    public Output<String> secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
     * 
     */
    @Export(name="send", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> send;

    /**
     * @return Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> send() {
        return Codegen.optional(this.send);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationRule(java.lang.String name) {
        this(name, AuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationRule(java.lang.String name, AuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationRule(java.lang.String name, AuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/authorizationRule:AuthorizationRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AuthorizationRule(java.lang.String name, Output<java.lang.String> id, @Nullable AuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/authorizationRule:AuthorizationRule", name, state, makeResourceOptions(options, id), false);
    }

    private static AuthorizationRuleArgs makeArgs(AuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AuthorizationRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "primaryAccessKey",
                "primaryConnectionString",
                "secondaryAccessKey",
                "secondaryConnectionString"
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
    public static AuthorizationRule get(java.lang.String name, Output<java.lang.String> id, @Nullable AuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationRule(name, id, state, options);
    }
}
