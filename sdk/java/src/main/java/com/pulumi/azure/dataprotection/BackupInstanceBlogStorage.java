// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs;
import com.pulumi.azure.dataprotection.inputs.BackupInstanceBlogStorageState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Backup Instance Blob Storage.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.dataprotection.BackupVault;
 * import com.pulumi.azure.dataprotection.BackupVaultArgs;
 * import com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.dataprotection.BackupPolicyBlobStorage;
 * import com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs;
 * import com.pulumi.azure.dataprotection.BackupInstanceBlogStorage;
 * import com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleBackupVault = new BackupVault(&#34;exampleBackupVault&#34;, BackupVaultArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .datastoreType(&#34;VaultStore&#34;)
 *             .redundancy(&#34;LocallyRedundant&#34;)
 *             .identity(BackupVaultIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAssignment = new Assignment(&#34;exampleAssignment&#34;, AssignmentArgs.builder()        
 *             .scope(exampleAccount.id())
 *             .roleDefinitionName(&#34;Storage Account Backup Contributor&#34;)
 *             .principalId(exampleBackupVault.identity().applyValue(identity -&gt; identity.principalId()))
 *             .build());
 * 
 *         var exampleBackupPolicyBlobStorage = new BackupPolicyBlobStorage(&#34;exampleBackupPolicyBlobStorage&#34;, BackupPolicyBlobStorageArgs.builder()        
 *             .vaultId(exampleBackupVault.id())
 *             .retentionDuration(&#34;P30D&#34;)
 *             .build());
 * 
 *         var exampleBackupInstanceBlogStorage = new BackupInstanceBlogStorage(&#34;exampleBackupInstanceBlogStorage&#34;, BackupInstanceBlogStorageArgs.builder()        
 *             .vaultId(exampleBackupVault.id())
 *             .location(exampleResourceGroup.location())
 *             .storageAccountId(exampleAccount.id())
 *             .backupPolicyId(exampleBackupPolicyBlobStorage.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAssignment)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Backup Instance Blob Storages can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupInstances/backupInstance1
 * ```
 * 
 */
@ResourceType(type="azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage")
public class BackupInstanceBlogStorage extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Backup Policy.
     * 
     */
    @Export(name="backupPolicyId", type=String.class, parameters={})
    private Output<String> backupPolicyId;

    /**
     * @return The ID of the Backup Policy.
     * 
     */
    public Output<String> backupPolicyId() {
        return this.backupPolicyId;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output<String> storageAccountId;

    /**
     * @return The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }
    /**
     * The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    @Export(name="vaultId", type=String.class, parameters={})
    private Output<String> vaultId;

    /**
     * @return The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupInstanceBlogStorage(String name) {
        this(name, BackupInstanceBlogStorageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupInstanceBlogStorage(String name, BackupInstanceBlogStorageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupInstanceBlogStorage(String name, BackupInstanceBlogStorageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage", name, args == null ? BackupInstanceBlogStorageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupInstanceBlogStorage(String name, Output<String> id, @Nullable BackupInstanceBlogStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage", name, state, makeResourceOptions(options, id));
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
    public static BackupInstanceBlogStorage get(String name, Output<String> id, @Nullable BackupInstanceBlogStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupInstanceBlogStorage(name, id, state, options);
    }
}