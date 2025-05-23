// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.ManagementPolicyArgs;
import com.pulumi.azure.storage.inputs.ManagementPolicyState;
import com.pulumi.azure.storage.outputs.ManagementPolicyRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Storage Account Management Policy.
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
 * import com.pulumi.azure.storage.ManagementPolicy;
 * import com.pulumi.azure.storage.ManagementPolicyArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsBaseBlobArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsSnapshotArgs;
 * import com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsVersionArgs;
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
 *             .name("resourceGroupName")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("storageaccountname")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .accountKind("BlobStorage")
 *             .build());
 * 
 *         var exampleManagementPolicy = new ManagementPolicy("exampleManagementPolicy", ManagementPolicyArgs.builder()
 *             .storageAccountId(exampleAccount.id())
 *             .rules(            
 *                 ManagementPolicyRuleArgs.builder()
 *                     .name("rule1")
 *                     .enabled(true)
 *                     .filters(ManagementPolicyRuleFiltersArgs.builder()
 *                         .prefixMatches("container1/prefix1")
 *                         .blobTypes("blockBlob")
 *                         .matchBlobIndexTags(ManagementPolicyRuleFiltersMatchBlobIndexTagArgs.builder()
 *                             .name("tag1")
 *                             .operation("==")
 *                             .value("val1")
 *                             .build())
 *                         .build())
 *                     .actions(ManagementPolicyRuleActionsArgs.builder()
 *                         .baseBlob(ManagementPolicyRuleActionsBaseBlobArgs.builder()
 *                             .tierToCoolAfterDaysSinceModificationGreaterThan(10)
 *                             .tierToArchiveAfterDaysSinceModificationGreaterThan(50)
 *                             .deleteAfterDaysSinceModificationGreaterThan(100)
 *                             .build())
 *                         .snapshot(ManagementPolicyRuleActionsSnapshotArgs.builder()
 *                             .deleteAfterDaysSinceCreationGreaterThan(30)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 ManagementPolicyRuleArgs.builder()
 *                     .name("rule2")
 *                     .enabled(false)
 *                     .filters(ManagementPolicyRuleFiltersArgs.builder()
 *                         .prefixMatches(                        
 *                             "container2/prefix1",
 *                             "container2/prefix2")
 *                         .blobTypes("blockBlob")
 *                         .build())
 *                     .actions(ManagementPolicyRuleActionsArgs.builder()
 *                         .baseBlob(ManagementPolicyRuleActionsBaseBlobArgs.builder()
 *                             .tierToCoolAfterDaysSinceModificationGreaterThan(11)
 *                             .tierToArchiveAfterDaysSinceModificationGreaterThan(51)
 *                             .deleteAfterDaysSinceModificationGreaterThan(101)
 *                             .build())
 *                         .snapshot(ManagementPolicyRuleActionsSnapshotArgs.builder()
 *                             .changeTierToArchiveAfterDaysSinceCreation(90)
 *                             .changeTierToCoolAfterDaysSinceCreation(23)
 *                             .deleteAfterDaysSinceCreationGreaterThan(31)
 *                             .build())
 *                         .version(ManagementPolicyRuleActionsVersionArgs.builder()
 *                             .changeTierToArchiveAfterDaysSinceCreation(9)
 *                             .changeTierToCoolAfterDaysSinceCreation(90)
 *                             .deleteAfterDaysSinceCreation(3)
 *                             .build())
 *                         .build())
 *                     .build())
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
 * * `Microsoft.Storage`: 2023-05-01
 * 
 * ## Import
 * 
 * Storage Account Management Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/managementPolicy:ManagementPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Storage/storageAccounts/myaccountname/managementPolicies/default
 * ```
 * 
 */
@ResourceType(type="azure:storage/managementPolicy:ManagementPolicy")
public class ManagementPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A `rule` block as documented below.
     * 
     */
    @Export(name="rules", refs={List.class,ManagementPolicyRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagementPolicyRule>> rules;

    /**
     * @return A `rule` block as documented below.
     * 
     */
    public Output<Optional<List<ManagementPolicyRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Specifies the id of the storage account to apply the management policy to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", refs={String.class}, tree="[0]")
    private Output<String> storageAccountId;

    /**
     * @return Specifies the id of the storage account to apply the management policy to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementPolicy(java.lang.String name) {
        this(name, ManagementPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementPolicy(java.lang.String name, ManagementPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementPolicy(java.lang.String name, ManagementPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/managementPolicy:ManagementPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagementPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/managementPolicy:ManagementPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagementPolicyArgs makeArgs(ManagementPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagementPolicyArgs.Empty : args;
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
    public static ManagementPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementPolicy(name, id, state, options);
    }
}
