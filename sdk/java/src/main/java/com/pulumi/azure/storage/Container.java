// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.ContainerArgs;
import com.pulumi.azure.storage.inputs.ContainerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Container within an Azure Storage Account.
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
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
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
 *             .name("examplestoraccount")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .tags(Map.of("environment", "staging"))
 *             .build());
 * 
 *         var exampleContainer = new Container("exampleContainer", ContainerArgs.builder()
 *             .name("vhds")
 *             .storageAccountId(exampleAccount.id())
 *             .containerAccessType("private")
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
 * Storage Containers can be imported using the `resource manager id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:storage/container:Container container1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount/blobServices/default/containers/mycontainer
 * ```
 * 
 */
@ResourceType(type="azure:storage/container:Container")
public class Container extends com.pulumi.resources.CustomResource {
    /**
     * The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
     * 
     * &gt; **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
     * 
     */
    @Export(name="containerAccessType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> containerAccessType;

    /**
     * @return The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
     * 
     * &gt; **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
     * 
     */
    public Output<Optional<String>> containerAccessType() {
        return Codegen.optional(this.containerAccessType);
    }
    /**
     * The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="defaultEncryptionScope", refs={String.class}, tree="[0]")
    private Output<String> defaultEncryptionScope;

    /**
     * @return The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> defaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }
    /**
     * Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="encryptionScopeOverrideEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionScopeOverrideEnabled;

    /**
     * @return Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> encryptionScopeOverrideEnabled() {
        return Codegen.optional(this.encryptionScopeOverrideEnabled);
    }
    /**
     * Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    @Export(name="hasImmutabilityPolicy", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasImmutabilityPolicy;

    /**
     * @return Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    public Output<Boolean> hasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    /**
     * Is there a Legal Hold configured on this Storage Container?
     * 
     */
    @Export(name="hasLegalHold", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasLegalHold;

    /**
     * @return Is there a Legal Hold configured on this Storage Container?
     * 
     */
    public Output<Boolean> hasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * A mapping of MetaData for this Container. All metadata keys should be lowercase.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> metadata;

    /**
     * @return A mapping of MetaData for this Container. All metadata keys should be lowercase.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Resource Manager ID of this Storage Container.
     * 
     * @deprecated
     * this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.
     * 
     */
    @Deprecated /* this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider. */
    @Export(name="resourceManagerId", refs={String.class}, tree="[0]")
    private Output<String> resourceManagerId;

    /**
     * @return The Resource Manager ID of this Storage Container.
     * 
     */
    public Output<String> resourceManagerId() {
        return this.resourceManagerId;
    }
    /**
     * The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
     * 
     */
    @Export(name="storageAccountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
     * 
     */
    public Output<Optional<String>> storageAccountId() {
        return Codegen.optional(this.storageAccountId);
    }
    /**
     * The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
     * 
     * &gt; **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
     * 
     * @deprecated
     * the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.
     * 
     */
    @Deprecated /* the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider. */
    @Export(name="storageAccountName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageAccountName;

    /**
     * @return The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
     * 
     * &gt; **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
     * 
     */
    public Output<Optional<String>> storageAccountName() {
        return Codegen.optional(this.storageAccountName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Container(java.lang.String name) {
        this(name, ContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Container(java.lang.String name, @Nullable ContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Container(java.lang.String name, @Nullable ContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/container:Container", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Container(java.lang.String name, Output<java.lang.String> id, @Nullable ContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/container:Container", name, state, makeResourceOptions(options, id), false);
    }

    private static ContainerArgs makeArgs(@Nullable ContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ContainerArgs.Empty : args;
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
    public static Container get(java.lang.String name, Output<java.lang.String> id, @Nullable ContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Container(name, id, state, options);
    }
}
