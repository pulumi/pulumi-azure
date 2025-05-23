// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.ObjectReplicationArgs;
import com.pulumi.azure.storage.inputs.ObjectReplicationState;
import com.pulumi.azure.storage.outputs.ObjectReplicationRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Storage Object Replication.
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
 * import com.pulumi.azure.storage.inputs.AccountBlobPropertiesArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.storage.ObjectReplication;
 * import com.pulumi.azure.storage.ObjectReplicationArgs;
 * import com.pulumi.azure.storage.inputs.ObjectReplicationRuleArgs;
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
 *         var src = new ResourceGroup("src", ResourceGroupArgs.builder()
 *             .name("srcResourceGroupName")
 *             .location("West Europe")
 *             .build());
 * 
 *         var srcAccount = new Account("srcAccount", AccountArgs.builder()
 *             .name("srcstorageaccount")
 *             .resourceGroupName(src.name())
 *             .location(src.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .blobProperties(AccountBlobPropertiesArgs.builder()
 *                 .versioningEnabled(true)
 *                 .changeFeedEnabled(true)
 *                 .build())
 *             .build());
 * 
 *         var srcContainer = new Container("srcContainer", ContainerArgs.builder()
 *             .name("srcstrcontainer")
 *             .storageAccountName(srcAccount.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var dst = new ResourceGroup("dst", ResourceGroupArgs.builder()
 *             .name("dstResourceGroupName")
 *             .location("East US")
 *             .build());
 * 
 *         var dstAccount = new Account("dstAccount", AccountArgs.builder()
 *             .name("dststorageaccount")
 *             .resourceGroupName(dst.name())
 *             .location(dst.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .blobProperties(AccountBlobPropertiesArgs.builder()
 *                 .versioningEnabled(true)
 *                 .changeFeedEnabled(true)
 *                 .build())
 *             .build());
 * 
 *         var dstContainer = new Container("dstContainer", ContainerArgs.builder()
 *             .name("dststrcontainer")
 *             .storageAccountName(dstAccount.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var example = new ObjectReplication("example", ObjectReplicationArgs.builder()
 *             .sourceStorageAccountId(srcAccount.id())
 *             .destinationStorageAccountId(dstAccount.id())
 *             .rules(ObjectReplicationRuleArgs.builder()
 *                 .sourceContainerName(srcContainer.name())
 *                 .destinationContainerName(dstContainer.name())
 *                 .build())
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
 * Storage Object Replication Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/objectReplication:ObjectReplication example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Storage/storageAccounts/storageAccount1/objectReplicationPolicies/objectReplicationPolicy1;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group2/providers/Microsoft.Storage/storageAccounts/storageAccount2/objectReplicationPolicies/objectReplicationPolicy2
 * ```
 * 
 */
@ResourceType(type="azure:storage/objectReplication:ObjectReplication")
public class ObjectReplication extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Object Replication in the destination storage account.
     * 
     */
    @Export(name="destinationObjectReplicationId", refs={String.class}, tree="[0]")
    private Output<String> destinationObjectReplicationId;

    /**
     * @return The ID of the Object Replication in the destination storage account.
     * 
     */
    public Output<String> destinationObjectReplicationId() {
        return this.destinationObjectReplicationId;
    }
    /**
     * The ID of the destination storage account. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    @Export(name="destinationStorageAccountId", refs={String.class}, tree="[0]")
    private Output<String> destinationStorageAccountId;

    /**
     * @return The ID of the destination storage account. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    public Output<String> destinationStorageAccountId() {
        return this.destinationStorageAccountId;
    }
    /**
     * One or more `rules` blocks as defined below.
     * 
     */
    @Export(name="rules", refs={List.class,ObjectReplicationRule.class}, tree="[0,1]")
    private Output<List<ObjectReplicationRule>> rules;

    /**
     * @return One or more `rules` blocks as defined below.
     * 
     */
    public Output<List<ObjectReplicationRule>> rules() {
        return this.rules;
    }
    /**
     * The ID of the Object Replication in the source storage account.
     * 
     */
    @Export(name="sourceObjectReplicationId", refs={String.class}, tree="[0]")
    private Output<String> sourceObjectReplicationId;

    /**
     * @return The ID of the Object Replication in the source storage account.
     * 
     */
    public Output<String> sourceObjectReplicationId() {
        return this.sourceObjectReplicationId;
    }
    /**
     * The ID of the source storage account. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    @Export(name="sourceStorageAccountId", refs={String.class}, tree="[0]")
    private Output<String> sourceStorageAccountId;

    /**
     * @return The ID of the source storage account. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    public Output<String> sourceStorageAccountId() {
        return this.sourceStorageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectReplication(java.lang.String name) {
        this(name, ObjectReplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectReplication(java.lang.String name, ObjectReplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectReplication(java.lang.String name, ObjectReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/objectReplication:ObjectReplication", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ObjectReplication(java.lang.String name, Output<java.lang.String> id, @Nullable ObjectReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/objectReplication:ObjectReplication", name, state, makeResourceOptions(options, id), false);
    }

    private static ObjectReplicationArgs makeArgs(ObjectReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ObjectReplicationArgs.Empty : args;
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
    public static ObjectReplication get(java.lang.String name, Output<java.lang.String> id, @Nullable ObjectReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObjectReplication(name, id, state, options);
    }
}
