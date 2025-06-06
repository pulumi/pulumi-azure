// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.ApiVersionSetArgs;
import com.pulumi.azure.apimanagement.inputs.ApiVersionSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API Version Set within an API Management Service.
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
 * import com.pulumi.azure.apimanagement.ApiVersionSet;
 * import com.pulumi.azure.apimanagement.ApiVersionSetArgs;
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
 *             .skuName("Developer_1")
 *             .build());
 * 
 *         var exampleApiVersionSet = new ApiVersionSet("exampleApiVersionSet", ApiVersionSetArgs.builder()
 *             .name("example-apimapi-1_0_0")
 *             .resourceGroupName(example.name())
 *             .apiManagementName(exampleService.name())
 *             .displayName("ExampleAPIVersionSet")
 *             .versioningScheme("Segment")
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
 * API Version Set can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/apiVersionSet:ApiVersionSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/apiVersionSets/set1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/apiVersionSet:ApiVersionSet")
public class ApiVersionSet extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service in which the API Version Set should exist. May only contain alphanumeric characters and dashes up to 50 characters in length. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", refs={String.class}, tree="[0]")
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the API Version Set should exist. May only contain alphanumeric characters and dashes up to 50 characters in length. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The description of API Version Set.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of API Version Set.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of this API Version Set.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The display name of this API Version Set.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The name of the API Version Set. May only contain alphanumeric characters and dashes up to 80 characters in length. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the API Version Set. May only contain alphanumeric characters and dashes up to 80 characters in length. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group in which the parent API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the parent API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the Header which should be read from Inbound Requests which defines the API Version.
     * 
     * &gt; **Note:** This must be specified when `versioning_scheme` is set to `Header`.
     * 
     */
    @Export(name="versionHeaderName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> versionHeaderName;

    /**
     * @return The name of the Header which should be read from Inbound Requests which defines the API Version.
     * 
     * &gt; **Note:** This must be specified when `versioning_scheme` is set to `Header`.
     * 
     */
    public Output<Optional<String>> versionHeaderName() {
        return Codegen.optional(this.versionHeaderName);
    }
    /**
     * The name of the Query String which should be read from Inbound Requests which defines the API Version.
     * 
     * &gt; **Note:** This must be specified when `versioning_scheme` is set to `Query`.
     * 
     */
    @Export(name="versionQueryName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> versionQueryName;

    /**
     * @return The name of the Query String which should be read from Inbound Requests which defines the API Version.
     * 
     * &gt; **Note:** This must be specified when `versioning_scheme` is set to `Query`.
     * 
     */
    public Output<Optional<String>> versionQueryName() {
        return Codegen.optional(this.versionQueryName);
    }
    /**
     * Specifies where in an Inbound HTTP Request that the API Version should be read from. Possible values are `Header`, `Query` and `Segment`.
     * 
     */
    @Export(name="versioningScheme", refs={String.class}, tree="[0]")
    private Output<String> versioningScheme;

    /**
     * @return Specifies where in an Inbound HTTP Request that the API Version should be read from. Possible values are `Header`, `Query` and `Segment`.
     * 
     */
    public Output<String> versioningScheme() {
        return this.versioningScheme;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiVersionSet(java.lang.String name) {
        this(name, ApiVersionSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiVersionSet(java.lang.String name, ApiVersionSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiVersionSet(java.lang.String name, ApiVersionSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiVersionSet:ApiVersionSet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ApiVersionSet(java.lang.String name, Output<java.lang.String> id, @Nullable ApiVersionSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiVersionSet:ApiVersionSet", name, state, makeResourceOptions(options, id), false);
    }

    private static ApiVersionSetArgs makeArgs(ApiVersionSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApiVersionSetArgs.Empty : args;
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
    public static ApiVersionSet get(java.lang.String name, Output<java.lang.String> id, @Nullable ApiVersionSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiVersionSet(name, id, state, options);
    }
}
