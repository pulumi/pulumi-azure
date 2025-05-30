// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.AccountQueuePropertiesArgs;
import com.pulumi.azure.storage.inputs.AccountQueuePropertiesState;
import com.pulumi.azure.storage.outputs.AccountQueuePropertiesCorsRule;
import com.pulumi.azure.storage.outputs.AccountQueuePropertiesHourMetrics;
import com.pulumi.azure.storage.outputs.AccountQueuePropertiesLogging;
import com.pulumi.azure.storage.outputs.AccountQueuePropertiesMinuteMetrics;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the Queue Properties of an Azure Storage Account.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.AccountQueueProperties;
 * import com.pulumi.azure.storage.AccountQueuePropertiesArgs;
 * import com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs;
 * import com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs;
 * import com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs;
 * import com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs;
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
 *             .name("storageaccountname")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("GRS")
 *             .tags(Map.of("environment", "staging"))
 *             .build());
 * 
 *         var exampleAccountQueueProperties = new AccountQueueProperties("exampleAccountQueueProperties", AccountQueuePropertiesArgs.builder()
 *             .storageAccountId(exampleAccount.id())
 *             .corsRules(AccountQueuePropertiesCorsRuleArgs.builder()
 *                 .allowedOrigins("http://www.example.com")
 *                 .exposedHeaders("x-tempo-*")
 *                 .allowedHeaders("x-tempo-*")
 *                 .allowedMethods(                
 *                     "GET",
 *                     "PUT")
 *                 .maxAgeInSeconds(500)
 *                 .build())
 *             .logging(AccountQueuePropertiesLoggingArgs.builder()
 *                 .version("1.0")
 *                 .delete(true)
 *                 .read(true)
 *                 .write(true)
 *                 .retentionPolicyDays(7)
 *                 .build())
 *             .hourMetrics(AccountQueuePropertiesHourMetricsArgs.builder()
 *                 .version("1.0")
 *                 .retentionPolicyDays(7)
 *                 .build())
 *             .minuteMetrics(AccountQueuePropertiesMinuteMetricsArgs.builder()
 *                 .version("1.0")
 *                 .retentionPolicyDays(7)
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
 * Storage Account Queue Properties can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/accountQueueProperties:AccountQueueProperties queueprops /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount
 * ```
 * 
 */
@ResourceType(type="azure:storage/accountQueueProperties:AccountQueueProperties")
public class AccountQueueProperties extends com.pulumi.resources.CustomResource {
    /**
     * A `cors_rule` block as defined above.
     * 
     */
    @Export(name="corsRules", refs={List.class,AccountQueuePropertiesCorsRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccountQueuePropertiesCorsRule>> corsRules;

    /**
     * @return A `cors_rule` block as defined above.
     * 
     */
    public Output<Optional<List<AccountQueuePropertiesCorsRule>>> corsRules() {
        return Codegen.optional(this.corsRules);
    }
    /**
     * A `hour_metrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
     * 
     */
    @Export(name="hourMetrics", refs={AccountQueuePropertiesHourMetrics.class}, tree="[0]")
    private Output<AccountQueuePropertiesHourMetrics> hourMetrics;

    /**
     * @return A `hour_metrics` block as defined below.
     * 
     * &gt; **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
     * 
     */
    public Output<AccountQueuePropertiesHourMetrics> hourMetrics() {
        return this.hourMetrics;
    }
    /**
     * A `logging` block as defined below.
     * 
     */
    @Export(name="logging", refs={AccountQueuePropertiesLogging.class}, tree="[0]")
    private Output<AccountQueuePropertiesLogging> logging;

    /**
     * @return A `logging` block as defined below.
     * 
     */
    public Output<AccountQueuePropertiesLogging> logging() {
        return this.logging;
    }
    /**
     * A `minute_metrics` block as defined below.
     * 
     */
    @Export(name="minuteMetrics", refs={AccountQueuePropertiesMinuteMetrics.class}, tree="[0]")
    private Output<AccountQueuePropertiesMinuteMetrics> minuteMetrics;

    /**
     * @return A `minute_metrics` block as defined below.
     * 
     */
    public Output<AccountQueuePropertiesMinuteMetrics> minuteMetrics() {
        return this.minuteMetrics;
    }
    /**
     * The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", refs={String.class}, tree="[0]")
    private Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountQueueProperties(java.lang.String name) {
        this(name, AccountQueuePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountQueueProperties(java.lang.String name, AccountQueuePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountQueueProperties(java.lang.String name, AccountQueuePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/accountQueueProperties:AccountQueueProperties", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccountQueueProperties(java.lang.String name, Output<java.lang.String> id, @Nullable AccountQueuePropertiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/accountQueueProperties:AccountQueueProperties", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountQueuePropertiesArgs makeArgs(AccountQueuePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountQueuePropertiesArgs.Empty : args;
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
    public static AccountQueueProperties get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountQueuePropertiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountQueueProperties(name, id, state, options);
    }
}
