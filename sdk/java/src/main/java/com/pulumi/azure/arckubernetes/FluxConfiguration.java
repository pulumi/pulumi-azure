// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arckubernetes;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.arckubernetes.FluxConfigurationArgs;
import com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState;
import com.pulumi.azure.arckubernetes.outputs.FluxConfigurationBlobStorage;
import com.pulumi.azure.arckubernetes.outputs.FluxConfigurationBucket;
import com.pulumi.azure.arckubernetes.outputs.FluxConfigurationGitRepository;
import com.pulumi.azure.arckubernetes.outputs.FluxConfigurationKustomization;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Arc Kubernetes Flux Configuration.
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
 * import com.pulumi.azure.arckubernetes.Cluster;
 * import com.pulumi.azure.arckubernetes.ClusterArgs;
 * import com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.Filebase64Args;
 * import com.pulumi.azure.arckubernetes.ClusterExtension;
 * import com.pulumi.azure.arckubernetes.ClusterExtensionArgs;
 * import com.pulumi.azure.arckubernetes.FluxConfiguration;
 * import com.pulumi.azure.arckubernetes.FluxConfigurationArgs;
 * import com.pulumi.azure.arckubernetes.inputs.FluxConfigurationGitRepositoryArgs;
 * import com.pulumi.azure.arckubernetes.inputs.FluxConfigurationKustomizationArgs;
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
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleCluster = new Cluster("exampleCluster", ClusterArgs.builder()
 *             .name("example-akcc")
 *             .resourceGroupName(example.name())
 *             .location("West Europe")
 *             .agentPublicKeyCertificate(StdFunctions.filebase64(Filebase64Args.builder()
 *                 .input("testdata/public.cer")
 *                 .build()).result())
 *             .identity(ClusterIdentityArgs.builder()
 *                 .type("SystemAssigned")
 *                 .build())
 *             .tags(Map.of("ENV", "Test"))
 *             .build());
 * 
 *         var exampleClusterExtension = new ClusterExtension("exampleClusterExtension", ClusterExtensionArgs.builder()
 *             .name("example-ext")
 *             .clusterId(test.id())
 *             .extensionType("microsoft.flux")
 *             .build());
 * 
 *         var exampleFluxConfiguration = new FluxConfiguration("exampleFluxConfiguration", FluxConfigurationArgs.builder()
 *             .name("example-fc")
 *             .clusterId(test.id())
 *             .namespace("flux")
 *             .gitRepository(FluxConfigurationGitRepositoryArgs.builder()
 *                 .url("https://github.com/Azure/arc-k8s-demo")
 *                 .referenceType("branch")
 *                 .referenceValue("main")
 *                 .build())
 *             .kustomizations(FluxConfigurationKustomizationArgs.builder()
 *                 .name("kustomization-1")
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleClusterExtension)
 *                 .build());
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
 * * `Microsoft.KubernetesConfiguration`: 2023-05-01
 * 
 * ## Import
 * 
 * Arc Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:arckubernetes/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Kubernetes/connectedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
 * ```
 * 
 */
@ResourceType(type="azure:arckubernetes/fluxConfiguration:FluxConfiguration")
public class FluxConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * An `blob_storage` block as defined below.
     * 
     */
    @Export(name="blobStorage", refs={FluxConfigurationBlobStorage.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationBlobStorage> blobStorage;

    /**
     * @return An `blob_storage` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationBlobStorage>> blobStorage() {
        return Codegen.optional(this.blobStorage);
    }
    /**
     * A `bucket` block as defined below.
     * 
     */
    @Export(name="bucket", refs={FluxConfigurationBucket.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationBucket> bucket;

    /**
     * @return A `bucket` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationBucket>> bucket() {
        return Codegen.optional(this.bucket);
    }
    /**
     * Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
     * 
     */
    @Export(name="continuousReconciliationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> continuousReconciliationEnabled;

    /**
     * @return Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> continuousReconciliationEnabled() {
        return Codegen.optional(this.continuousReconciliationEnabled);
    }
    /**
     * A `git_repository` block as defined below.
     * 
     */
    @Export(name="gitRepository", refs={FluxConfigurationGitRepository.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationGitRepository> gitRepository;

    /**
     * @return A `git_repository` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationGitRepository>> gitRepository() {
        return Codegen.optional(this.gitRepository);
    }
    /**
     * A `kustomizations` block as defined below.
     * 
     */
    @Export(name="kustomizations", refs={List.class,FluxConfigurationKustomization.class}, tree="[0,1]")
    private Output<List<FluxConfigurationKustomization>> kustomizations;

    /**
     * @return A `kustomizations` block as defined below.
     * 
     */
    public Output<List<FluxConfigurationKustomization>> kustomizations() {
        return this.kustomizations;
    }
    /**
     * Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FluxConfiguration(java.lang.String name) {
        this(name, FluxConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FluxConfiguration(java.lang.String name, FluxConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FluxConfiguration(java.lang.String name, FluxConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:arckubernetes/fluxConfiguration:FluxConfiguration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FluxConfiguration(java.lang.String name, Output<java.lang.String> id, @Nullable FluxConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:arckubernetes/fluxConfiguration:FluxConfiguration", name, state, makeResourceOptions(options, id), false);
    }

    private static FluxConfigurationArgs makeArgs(FluxConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FluxConfigurationArgs.Empty : args;
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
    public static FluxConfiguration get(java.lang.String name, Output<java.lang.String> id, @Nullable FluxConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FluxConfiguration(name, id, state, options);
    }
}
