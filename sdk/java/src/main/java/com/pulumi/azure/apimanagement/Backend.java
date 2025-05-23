// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.BackendArgs;
import com.pulumi.azure.apimanagement.inputs.BackendState;
import com.pulumi.azure.apimanagement.outputs.BackendCredentials;
import com.pulumi.azure.apimanagement.outputs.BackendProxy;
import com.pulumi.azure.apimanagement.outputs.BackendServiceFabricCluster;
import com.pulumi.azure.apimanagement.outputs.BackendTls;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a backend within an API Management Service.
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
 * import com.pulumi.azure.apimanagement.Service;
 * import com.pulumi.azure.apimanagement.ServiceArgs;
 * import com.pulumi.azure.apimanagement.Backend;
 * import com.pulumi.azure.apimanagement.BackendArgs;
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
 *         var exampleService = new Service("exampleService", ServiceArgs.builder()
 *             .name("example-apim")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .publisherName("My Company")
 *             .publisherEmail("company}{@literal @}{@code exmaple.com")
 *             .skuName("Developer_1")
 *             .build());
 * 
 *         var exampleBackend = new Backend("exampleBackend", BackendArgs.builder()
 *             .name("example-backend")
 *             .resourceGroupName(example.name())
 *             .apiManagementName(exampleService.name())
 *             .protocol("http")
 *             .url("https://backend.com/api")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.ApiManagement`: 2022-08-01
 * 
 * ## Import
 * 
 * API Management backends can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/backend:Backend example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/backends/backend1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/backend:Backend")
public class Backend extends com.pulumi.resources.CustomResource {
    /**
     * The Name of the API Management Service where this backend should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", refs={String.class}, tree="[0]")
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this backend should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * A `credentials` block as documented below.
     * 
     */
    @Export(name="credentials", refs={BackendCredentials.class}, tree="[0]")
    private Output</* @Nullable */ BackendCredentials> credentials;

    /**
     * @return A `credentials` block as documented below.
     * 
     */
    public Output<Optional<BackendCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The description of the backend.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the backend.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the API Management backend. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the API Management backend. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The protocol used by the backend host. Possible values are `http` or `soap`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The protocol used by the backend host. Possible values are `http` or `soap`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * A `proxy` block as documented below.
     * 
     */
    @Export(name="proxy", refs={BackendProxy.class}, tree="[0]")
    private Output</* @Nullable */ BackendProxy> proxy;

    /**
     * @return A `proxy` block as documented below.
     * 
     */
    public Output<Optional<BackendProxy>> proxy() {
        return Codegen.optional(this.proxy);
    }
    /**
     * The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The management URI of the backend host in an external system. This URI can be the ARM Resource ID of Logic Apps, Function Apps or API Apps, or the management endpoint of a Service Fabric cluster.
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The management URI of the backend host in an external system. This URI can be the ARM Resource ID of Logic Apps, Function Apps or API Apps, or the management endpoint of a Service Fabric cluster.
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    /**
     * A `service_fabric_cluster` block as documented below.
     * 
     */
    @Export(name="serviceFabricCluster", refs={BackendServiceFabricCluster.class}, tree="[0]")
    private Output</* @Nullable */ BackendServiceFabricCluster> serviceFabricCluster;

    /**
     * @return A `service_fabric_cluster` block as documented below.
     * 
     */
    public Output<Optional<BackendServiceFabricCluster>> serviceFabricCluster() {
        return Codegen.optional(this.serviceFabricCluster);
    }
    /**
     * The title of the backend.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    /**
     * @return The title of the backend.
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    /**
     * A `tls` block as documented below.
     * 
     */
    @Export(name="tls", refs={BackendTls.class}, tree="[0]")
    private Output</* @Nullable */ BackendTls> tls;

    /**
     * @return A `tls` block as documented below.
     * 
     */
    public Output<Optional<BackendTls>> tls() {
        return Codegen.optional(this.tls);
    }
    /**
     * The backend host URL should be specified in the format `&#34;https://backend.com/api&#34;`, avoiding trailing slashes (/) to minimize misconfiguration risks. Azure API Management instance will append the backend resource name to this URL. This URL typically serves as the `base-url` in the [`set-backend-service`](https://learn.microsoft.com/azure/api-management/set-backend-service-policy) policy, enabling seamless transitions from frontend to backend.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The backend host URL should be specified in the format `&#34;https://backend.com/api&#34;`, avoiding trailing slashes (/) to minimize misconfiguration risks. Azure API Management instance will append the backend resource name to this URL. This URL typically serves as the `base-url` in the [`set-backend-service`](https://learn.microsoft.com/azure/api-management/set-backend-service-policy) policy, enabling seamless transitions from frontend to backend.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backend(java.lang.String name) {
        this(name, BackendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backend(java.lang.String name, BackendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backend(java.lang.String name, BackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/backend:Backend", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Backend(java.lang.String name, Output<java.lang.String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/backend:Backend", name, state, makeResourceOptions(options, id), false);
    }

    private static BackendArgs makeArgs(BackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BackendArgs.Empty : args;
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
    public static Backend get(java.lang.String name, Output<java.lang.String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Backend(name, id, state, options);
    }
}
