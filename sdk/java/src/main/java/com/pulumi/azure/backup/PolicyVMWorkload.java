// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.backup.PolicyVMWorkloadArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadState;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadProtectionPolicy;
import com.pulumi.azure.backup.outputs.PolicyVMWorkloadSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an Azure VM Workload Backup Policy within a Recovery Services vault.
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
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.backup.PolicyVMWorkload;
 * import com.pulumi.azure.backup.PolicyVMWorkloadArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs;
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
 *             .name("example-bpvmw")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleVault = new Vault("exampleVault", VaultArgs.builder()
 *             .name("example-rsv")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku("Standard")
 *             .softDeleteEnabled(false)
 *             .build());
 * 
 *         var examplePolicyVMWorkload = new PolicyVMWorkload("examplePolicyVMWorkload", PolicyVMWorkloadArgs.builder()
 *             .name("example-bpvmw")
 *             .resourceGroupName(example.name())
 *             .recoveryVaultName(exampleVault.name())
 *             .workloadType("SQLDataBase")
 *             .settings(PolicyVMWorkloadSettingsArgs.builder()
 *                 .timeZone("UTC")
 *                 .compressionEnabled(false)
 *                 .build())
 *             .protectionPolicies(            
 *                 PolicyVMWorkloadProtectionPolicyArgs.builder()
 *                     .policyType("Full")
 *                     .backup(PolicyVMWorkloadProtectionPolicyBackupArgs.builder()
 *                         .frequency("Daily")
 *                         .time("15:00")
 *                         .build())
 *                     .retentionDaily(PolicyVMWorkloadProtectionPolicyRetentionDailyArgs.builder()
 *                         .count(8)
 *                         .build())
 *                     .build(),
 *                 PolicyVMWorkloadProtectionPolicyArgs.builder()
 *                     .policyType("Log")
 *                     .backup(PolicyVMWorkloadProtectionPolicyBackupArgs.builder()
 *                         .frequencyInMinutes(15)
 *                         .build())
 *                     .simpleRetention(PolicyVMWorkloadProtectionPolicySimpleRetentionArgs.builder()
 *                         .count(8)
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
 * ## Import
 * 
 * Azure VM Workload Backup Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:backup/policyVMWorkload:PolicyVMWorkload policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/vault1/backupPolicies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:backup/policyVMWorkload:PolicyVMWorkload")
public class PolicyVMWorkload extends com.pulumi.resources.CustomResource {
    /**
     * The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `protection_policy` blocks as defined below.
     * 
     */
    @Export(name="protectionPolicies", refs={List.class,PolicyVMWorkloadProtectionPolicy.class}, tree="[0,1]")
    private Output<List<PolicyVMWorkloadProtectionPolicy>> protectionPolicies;

    /**
     * @return One or more `protection_policy` blocks as defined below.
     * 
     */
    public Output<List<PolicyVMWorkloadProtectionPolicy>> protectionPolicies() {
        return this.protectionPolicies;
    }
    /**
     * The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultName", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }
    /**
     * The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `settings` block as defined below.
     * 
     */
    @Export(name="settings", refs={PolicyVMWorkloadSettings.class}, tree="[0]")
    private Output<PolicyVMWorkloadSettings> settings;

    /**
     * @return A `settings` block as defined below.
     * 
     */
    public Output<PolicyVMWorkloadSettings> settings() {
        return this.settings;
    }
    /**
     * The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="workloadType", refs={String.class}, tree="[0]")
    private Output<String> workloadType;

    /**
     * @return The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> workloadType() {
        return this.workloadType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyVMWorkload(java.lang.String name) {
        this(name, PolicyVMWorkloadArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyVMWorkload(java.lang.String name, PolicyVMWorkloadArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyVMWorkload(java.lang.String name, PolicyVMWorkloadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/policyVMWorkload:PolicyVMWorkload", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PolicyVMWorkload(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyVMWorkloadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/policyVMWorkload:PolicyVMWorkload", name, state, makeResourceOptions(options, id), false);
    }

    private static PolicyVMWorkloadArgs makeArgs(PolicyVMWorkloadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PolicyVMWorkloadArgs.Empty : args;
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
    public static PolicyVMWorkload get(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyVMWorkloadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyVMWorkload(name, id, state, options);
    }
}
