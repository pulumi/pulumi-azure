// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs;
import com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Customer Managed Key for a EventHub Namespace.
 * 
 * !&gt; **Note:** In 2.x versions of the Azure Provider during deletion this resource will **delete and recreate the parent EventHub Namespace which may involve data loss** as it&#39;s not possible to remove the Customer Managed Key from the EventHub Namespace once it&#39;s been added. Version 3.0 of the Azure Provider will change this so that the Delete operation is a noop, requiring the parent EventHub Namespace is deleted/recreated to remove the Customer Managed Key.
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
 * import com.pulumi.azure.eventhub.Cluster;
 * import com.pulumi.azure.eventhub.ClusterArgs;
 * import com.pulumi.azure.eventhub.EventHubNamespace;
 * import com.pulumi.azure.eventhub.EventHubNamespaceArgs;
 * import com.pulumi.azure.eventhub.inputs.EventHubNamespaceIdentityArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.AccessPolicy;
 * import com.pulumi.azure.keyvault.AccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Key;
 * import com.pulumi.azure.keyvault.KeyArgs;
 * import com.pulumi.azure.eventhub.NamespaceCustomerManagedKey;
 * import com.pulumi.azure.eventhub.NamespaceCustomerManagedKeyArgs;
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
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .skuName(&#34;Dedicated_1&#34;)
 *             .build());
 * 
 *         var exampleEventHubNamespace = new EventHubNamespace(&#34;exampleEventHubNamespace&#34;, EventHubNamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .dedicatedClusterId(exampleCluster.id())
 *             .identity(EventHubNamespaceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var exampleAccessPolicy = new AccessPolicy(&#34;exampleAccessPolicy&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(exampleEventHubNamespace.identity().applyValue(identity -&gt; identity.tenantId()))
 *             .objectId(exampleEventHubNamespace.identity().applyValue(identity -&gt; identity.principalId()))
 *             .keyPermissions(            
 *                 &#34;Get&#34;,
 *                 &#34;UnwrapKey&#34;,
 *                 &#34;WrapKey&#34;)
 *             .build());
 * 
 *         var example2 = new AccessPolicy(&#34;example2&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .objectId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .keyPermissions(            
 *                 &#34;Create&#34;,
 *                 &#34;Delete&#34;,
 *                 &#34;Get&#34;,
 *                 &#34;List&#34;,
 *                 &#34;Purge&#34;,
 *                 &#34;Recover&#34;)
 *             .build());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;decrypt&#34;,
 *                 &#34;encrypt&#34;,
 *                 &#34;sign&#34;,
 *                 &#34;unwrapKey&#34;,
 *                 &#34;verify&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     exampleAccessPolicy,
 *                     example2)
 *                 .build());
 * 
 *         var exampleNamespaceCustomerManagedKey = new NamespaceCustomerManagedKey(&#34;exampleNamespaceCustomerManagedKey&#34;, NamespaceCustomerManagedKeyArgs.builder()        
 *             .eventhubNamespaceId(exampleEventHubNamespace.id())
 *             .keyVaultKeyIds(exampleKey.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Customer Managed Keys for a EventHub Namespace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/namespaceCustomerManagedKey:NamespaceCustomerManagedKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/namespaceCustomerManagedKey:NamespaceCustomerManagedKey")
public class NamespaceCustomerManagedKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubNamespaceId", type=String.class, parameters={})
    private Output<String> eventhubNamespaceId;

    /**
     * @return The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubNamespaceId() {
        return this.eventhubNamespaceId;
    }
    /**
     * The list of keys of Key Vault.
     * 
     */
    @Export(name="keyVaultKeyIds", type=List.class, parameters={String.class})
    private Output<List<String>> keyVaultKeyIds;

    /**
     * @return The list of keys of Key Vault.
     * 
     */
    public Output<List<String>> keyVaultKeyIds() {
        return this.keyVaultKeyIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceCustomerManagedKey(String name) {
        this(name, NamespaceCustomerManagedKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceCustomerManagedKey(String name, NamespaceCustomerManagedKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceCustomerManagedKey(String name, NamespaceCustomerManagedKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceCustomerManagedKey:NamespaceCustomerManagedKey", name, args == null ? NamespaceCustomerManagedKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceCustomerManagedKey(String name, Output<String> id, @Nullable NamespaceCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/namespaceCustomerManagedKey:NamespaceCustomerManagedKey", name, state, makeResourceOptions(options, id));
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
    public static NamespaceCustomerManagedKey get(String name, Output<String> id, @Nullable NamespaceCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceCustomerManagedKey(name, id, state, options);
    }
}