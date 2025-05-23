// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.GatewayArgs;
import com.pulumi.azure.apimanagement.inputs.GatewayState;
import com.pulumi.azure.apimanagement.outputs.GatewayLocationData;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API Management Gateway.
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
 * import com.pulumi.azure.apimanagement.Gateway;
 * import com.pulumi.azure.apimanagement.GatewayArgs;
 * import com.pulumi.azure.apimanagement.inputs.GatewayLocationDataArgs;
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
 *             .publisherName("pub1")
 *             .publisherEmail("pub1}{@literal @}{@code email.com")
 *             .skuName("Consumption_0")
 *             .build());
 * 
 *         var exampleGateway = new Gateway("exampleGateway", GatewayArgs.builder()
 *             .name("example-gateway")
 *             .apiManagementId(exampleService.id())
 *             .description("Example API Management gateway")
 *             .locationData(GatewayLocationDataArgs.builder()
 *                 .name("example name")
 *                 .city("example city")
 *                 .district("example district")
 *                 .region("example region")
 *                 .build())
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
 * API Management Gateways can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/gateway:Gateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/gateways/gateway1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
     * 
     */
    @Export(name="apiManagementId", refs={String.class}, tree="[0]")
    private Output<String> apiManagementId;

    /**
     * @return The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
     * 
     */
    public Output<String> apiManagementId() {
        return this.apiManagementId;
    }
    /**
     * The description of the API Management Gateway.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the API Management Gateway.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A `location_data` block as documented below.
     * 
     */
    @Export(name="locationData", refs={GatewayLocationData.class}, tree="[0]")
    private Output<GatewayLocationData> locationData;

    /**
     * @return A `location_data` block as documented below.
     * 
     */
    public Output<GatewayLocationData> locationData() {
        return this.locationData;
    }
    /**
     * The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(java.lang.String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(java.lang.String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(java.lang.String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/gateway:Gateway", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Gateway(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/gateway:Gateway", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewayArgs makeArgs(GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewayArgs.Empty : args;
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
    public static Gateway get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
