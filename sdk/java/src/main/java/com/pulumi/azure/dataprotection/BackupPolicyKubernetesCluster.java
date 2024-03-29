// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs;
import com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState;
import com.pulumi.azure.dataprotection.outputs.BackupPolicyKubernetesClusterDefaultRetentionRule;
import com.pulumi.azure.dataprotection.outputs.BackupPolicyKubernetesClusterRetentionRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Backup Policy to back up Kubernetes Cluster.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.dataprotection.BackupVault;
 * import com.pulumi.azure.dataprotection.BackupVaultArgs;
 * import com.pulumi.azure.dataprotection.BackupPolicyKubernetesCluster;
 * import com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs;
 * import com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs;
 * import com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs;
 * import com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs;
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .name(&#34;example-resources&#34;)
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleBackupVault = new BackupVault(&#34;exampleBackupVault&#34;, BackupVaultArgs.builder()        
 *             .name(&#34;example-backup-vault&#34;)
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .datastoreType(&#34;VaultStore&#34;)
 *             .redundancy(&#34;LocallyRedundant&#34;)
 *             .build());
 * 
 *         var exampleBackupPolicyKubernetesCluster = new BackupPolicyKubernetesCluster(&#34;exampleBackupPolicyKubernetesCluster&#34;, BackupPolicyKubernetesClusterArgs.builder()        
 *             .name(&#34;example-backup-policy&#34;)
 *             .resourceGroupName(example.name())
 *             .vaultName(exampleBackupVault.name())
 *             .backupRepeatingTimeIntervals(&#34;R/2021-05-23T02:30:00+00:00/P1W&#34;)
 *             .timeZone(&#34;India Standard Time&#34;)
 *             .defaultRetentionDuration(&#34;P4M&#34;)
 *             .retentionRules(BackupPolicyKubernetesClusterRetentionRuleArgs.builder()
 *                 .name(&#34;Daily&#34;)
 *                 .priority(25)
 *                 .lifeCycles(BackupPolicyKubernetesClusterRetentionRuleLifeCycleArgs.builder()
 *                     .duration(&#34;P84D&#34;)
 *                     .dataStoreType(&#34;OperationalStore&#34;)
 *                     .build())
 *                 .criteria(BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs.builder()
 *                     .absoluteCriteria(&#34;FirstOfDay&#34;)
 *                     .build())
 *                 .build())
 *             .defaultRetentionRule(BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.builder()
 *                 .lifeCycles(BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleArgs.builder()
 *                     .duration(&#34;P7D&#34;)
 *                     .dataStoreType(&#34;OperationalStore&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Backup Policy Kubernetes Cluster&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:dataprotection/backupPolicyKubernetesCluster:BackupPolicyKubernetesCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupPolicies/backupPolicy1
 * ```
 * 
 */
@ResourceType(type="azure:dataprotection/backupPolicyKubernetesCluster:BackupPolicyKubernetesCluster")
public class BackupPolicyKubernetesCluster extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="backupRepeatingTimeIntervals", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> backupRepeatingTimeIntervals;

    /**
     * @return Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<String>> backupRepeatingTimeIntervals() {
        return this.backupRepeatingTimeIntervals;
    }
    /**
     * A `default_retention_rule` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="defaultRetentionRule", refs={BackupPolicyKubernetesClusterDefaultRetentionRule.class}, tree="[0]")
    private Output<BackupPolicyKubernetesClusterDefaultRetentionRule> defaultRetentionRule;

    /**
     * @return A `default_retention_rule` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<BackupPolicyKubernetesClusterDefaultRetentionRule> defaultRetentionRule() {
        return this.defaultRetentionRule;
    }
    /**
     * The name which should be used for the Backup Policy Kubernetes Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for the Backup Policy Kubernetes Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Backup Policy Kubernetes Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Backup Policy Kubernetes Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `retention_rule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="retentionRules", refs={List.class,BackupPolicyKubernetesClusterRetentionRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BackupPolicyKubernetesClusterRetentionRule>> retentionRules;

    /**
     * @return One or more `retention_rule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<BackupPolicyKubernetesClusterRetentionRule>>> retentionRules() {
        return Codegen.optional(this.retentionRules);
    }
    /**
     * Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeZone;

    /**
     * @return Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> timeZone() {
        return Codegen.optional(this.timeZone);
    }
    /**
     * The name of the Backup Vault where the Backup Policy Kubernetes Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vaultName", refs={String.class}, tree="[0]")
    private Output<String> vaultName;

    /**
     * @return The name of the Backup Vault where the Backup Policy Kubernetes Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPolicyKubernetesCluster(String name) {
        this(name, BackupPolicyKubernetesClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPolicyKubernetesCluster(String name, BackupPolicyKubernetesClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicyKubernetesCluster(String name, BackupPolicyKubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dataprotection/backupPolicyKubernetesCluster:BackupPolicyKubernetesCluster", name, args == null ? BackupPolicyKubernetesClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupPolicyKubernetesCluster(String name, Output<String> id, @Nullable BackupPolicyKubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dataprotection/backupPolicyKubernetesCluster:BackupPolicyKubernetesCluster", name, state, makeResourceOptions(options, id));
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
    public static BackupPolicyKubernetesCluster get(String name, Output<String> id, @Nullable BackupPolicyKubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicyKubernetesCluster(name, id, state, options);
    }
}
