// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs;
import com.pulumi.azure.siterecovery.inputs.HyperVReplicationPolicyAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.siterecovery.HyperVSite;
 * import com.pulumi.azure.siterecovery.HyperVSiteArgs;
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicy;
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs;
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociation;
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs;
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
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var vault = new Vault(&#34;vault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleHyperVSite = new HyperVSite(&#34;exampleHyperVSite&#34;, HyperVSiteArgs.builder()        
 *             .recoveryVaultId(azurerm_recovery_services_vault.example().id())
 *             .build());
 * 
 *         var policy = new HyperVReplicationPolicy(&#34;policy&#34;, HyperVReplicationPolicyArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(vault.name())
 *             .recoveryPointRetentionInHours(2)
 *             .applicationConsistentSnapshotFrequencyInHours(1)
 *             .replicationIntervalInSeconds(300)
 *             .build());
 * 
 *         var exampleHyperVReplicationPolicyAssociation = new HyperVReplicationPolicyAssociation(&#34;exampleHyperVReplicationPolicyAssociation&#34;, HyperVReplicationPolicyAssociationArgs.builder()        
 *             .hypervSiteId(exampleHyperVSite.id())
 *             .policyId(azurerm_site_recovery_hyperv_replication_policy.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Site Recovery Replication Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation")
public class HyperVReplicationPolicyAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
     * 
     */
    @Export(name="hypervSiteId", type=String.class, parameters={})
    private Output<String> hypervSiteId;

    /**
     * @return The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
     * 
     */
    public Output<String> hypervSiteId() {
        return this.hypervSiteId;
    }
    /**
     * The name of the replication policy association. Changing this forces a new association to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the replication policy association. Changing this forces a new association to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperVReplicationPolicyAssociation(String name) {
        this(name, HyperVReplicationPolicyAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperVReplicationPolicyAssociation(String name, HyperVReplicationPolicyAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperVReplicationPolicyAssociation(String name, HyperVReplicationPolicyAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation", name, args == null ? HyperVReplicationPolicyAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HyperVReplicationPolicyAssociation(String name, Output<String> id, @Nullable HyperVReplicationPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation", name, state, makeResourceOptions(options, id));
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
    public static HyperVReplicationPolicyAssociation get(String name, Output<String> id, @Nullable HyperVReplicationPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HyperVReplicationPolicyAssociation(name, id, state, options);
    }
}