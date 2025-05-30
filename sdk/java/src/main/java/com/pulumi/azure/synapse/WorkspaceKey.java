// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.WorkspaceKeyArgs;
import com.pulumi.azure.synapse.inputs.WorkspaceKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Synapse Workspace keys
 * 
 * &gt; **Note:** Keys that are actively protecting a workspace cannot be deleted. When the keys resource is deleted, if the key is inactive it will be deleted, if it is active it will not be deleted.
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
 * import com.pulumi.azure.storage.DataLakeGen2Filesystem;
 * import com.pulumi.azure.storage.DataLakeGen2FilesystemArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.AccessPolicy;
 * import com.pulumi.azure.keyvault.AccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Key;
 * import com.pulumi.azure.keyvault.KeyArgs;
 * import com.pulumi.azure.synapse.Workspace;
 * import com.pulumi.azure.synapse.WorkspaceArgs;
 * import com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs;
 * import com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs;
 * import com.pulumi.azure.synapse.WorkspaceKey;
 * import com.pulumi.azure.synapse.WorkspaceKeyArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplestorageacc")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .accountKind("StorageV2")
 *             .isHnsEnabled(true)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem("exampleDataLakeGen2Filesystem", DataLakeGen2FilesystemArgs.builder()
 *             .name("example")
 *             .storageAccountId(exampleAccount.id())
 *             .build());
 * 
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var exampleKeyVault = new KeyVault("exampleKeyVault", KeyVaultArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tenantId(current.tenantId())
 *             .skuName("standard")
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var deployer = new AccessPolicy("deployer", AccessPolicyArgs.builder()
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(current.tenantId())
 *             .objectId(current.objectId())
 *             .keyPermissions(            
 *                 "Create",
 *                 "Get",
 *                 "Delete",
 *                 "Purge",
 *                 "GetRotationPolicy")
 *             .build());
 * 
 *         var exampleKey = new Key("exampleKey", KeyArgs.builder()
 *             .name("workspaceEncryptionKey")
 *             .keyVaultId(exampleKeyVault.id())
 *             .keyType("RSA")
 *             .keySize(2048)
 *             .keyOpts(            
 *                 "unwrapKey",
 *                 "wrapKey")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(deployer)
 *                 .build());
 * 
 *         var exampleWorkspace = new Workspace("exampleWorkspace", WorkspaceArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.id())
 *             .sqlAdministratorLogin("sqladminuser")
 *             .sqlAdministratorLoginPassword("H}{@literal @}{@code Sh1CoR3!")
 *             .customerManagedKey(WorkspaceCustomerManagedKeyArgs.builder()
 *                 .keyVersionlessId(exampleKey.versionlessId())
 *                 .keyName("enckey")
 *                 .build())
 *             .identity(WorkspaceIdentityArgs.builder()
 *                 .type("SystemAssigned")
 *                 .build())
 *             .tags(Map.of("Env", "production"))
 *             .build());
 * 
 *         var workspacePolicy = new AccessPolicy("workspacePolicy", AccessPolicyArgs.builder()
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(exampleWorkspace.identity().applyValue(_identity -> _identity.tenantId()))
 *             .objectId(exampleWorkspace.identity().applyValue(_identity -> _identity.principalId()))
 *             .keyPermissions(            
 *                 "Get",
 *                 "WrapKey",
 *                 "UnwrapKey")
 *             .build());
 * 
 *         var exampleWorkspaceKey = new WorkspaceKey("exampleWorkspaceKey", WorkspaceKeyArgs.builder()
 *             .customerManagedKeyVersionlessId(exampleKey.versionlessId())
 *             .synapseWorkspaceId(exampleWorkspace.id())
 *             .active(true)
 *             .customerManagedKeyName("enckey")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(workspacePolicy)
 *                 .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Synapse Workspace Keys can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:synapse/workspaceKey:WorkspaceKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/keys/key1
 * ```
 * 
 */
@ResourceType(type="azure:synapse/workspaceKey:WorkspaceKey")
public class WorkspaceKey extends com.pulumi.resources.CustomResource {
    /**
     * Specifies if the workspace should be encrypted with this key.
     * 
     * &gt; **Note:** Only one key can actively encrypt a workspace. When performing a key rotation, setting a new key as the active key will disable existing keys.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return Specifies if the workspace should be encrypted with this key.
     * 
     * &gt; **Note:** Only one key can actively encrypt a workspace. When performing a key rotation, setting a new key as the active key will disable existing keys.
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * Specifies the name of the workspace key. Should match the name of the key in the synapse workspace.
     * 
     */
    @Export(name="customerManagedKeyName", refs={String.class}, tree="[0]")
    private Output<String> customerManagedKeyName;

    /**
     * @return Specifies the name of the workspace key. Should match the name of the key in the synapse workspace.
     * 
     */
    public Output<String> customerManagedKeyName() {
        return this.customerManagedKeyName;
    }
    /**
     * The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption
     * 
     */
    @Export(name="customerManagedKeyVersionlessId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerManagedKeyVersionlessId;

    /**
     * @return The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption
     * 
     */
    public Output<Optional<String>> customerManagedKeyVersionlessId() {
        return Codegen.optional(this.customerManagedKeyVersionlessId);
    }
    /**
     * The ID of the Synapse Workspace where the encryption key should be configured.
     * 
     */
    @Export(name="synapseWorkspaceId", refs={String.class}, tree="[0]")
    private Output<String> synapseWorkspaceId;

    /**
     * @return The ID of the Synapse Workspace where the encryption key should be configured.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceKey(java.lang.String name) {
        this(name, WorkspaceKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceKey(java.lang.String name, WorkspaceKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceKey(java.lang.String name, WorkspaceKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/workspaceKey:WorkspaceKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkspaceKey(java.lang.String name, Output<java.lang.String> id, @Nullable WorkspaceKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/workspaceKey:WorkspaceKey", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkspaceKeyArgs makeArgs(WorkspaceKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkspaceKeyArgs.Empty : args;
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
    public static WorkspaceKey get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkspaceKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceKey(name, id, state, options);
    }
}
