// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.ApiTagArgs;
import com.pulumi.azure.apimanagement.inputs.ApiTagState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages the Assignment of an API Management API Tag to an API.
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
 * import com.pulumi.azure.apimanagement.ApimanagementFunctions;
 * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
 * import com.pulumi.azure.apimanagement.Api;
 * import com.pulumi.azure.apimanagement.ApiArgs;
 * import com.pulumi.azure.apimanagement.Tag;
 * import com.pulumi.azure.apimanagement.TagArgs;
 * import com.pulumi.azure.apimanagement.ApiTag;
 * import com.pulumi.azure.apimanagement.ApiTagArgs;
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
 *         final var exampleService = ApimanagementFunctions.getService(GetServiceArgs.builder()
 *             .name(&#34;example-apim&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleApi = new Api(&#34;exampleApi&#34;, ApiArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .apiManagementName(exampleService.applyValue(getServiceResult -&gt; getServiceResult).applyValue(exampleService -&gt; exampleService.applyValue(getServiceResult -&gt; getServiceResult.name())))
 *             .revision(&#34;1&#34;)
 *             .build());
 * 
 *         var exampleTag = new Tag(&#34;exampleTag&#34;, TagArgs.builder()        
 *             .apiManagementId(exampleService.applyValue(getServiceResult -&gt; getServiceResult).applyValue(exampleService -&gt; exampleService.applyValue(getServiceResult -&gt; getServiceResult.id())))
 *             .build());
 * 
 *         var exampleApiTag = new ApiTag(&#34;exampleApiTag&#34;, ApiTagArgs.builder()        
 *             .apiId(exampleApi.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management API Tags can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/apiTag:ApiTag example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/apis/api1/tags/tag1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/apiTag:ApiTag")
public class ApiTag extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiTag(String name) {
        this(name, ApiTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiTag(String name, ApiTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiTag(String name, ApiTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiTag:ApiTag", name, args == null ? ApiTagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiTag(String name, Output<String> id, @Nullable ApiTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiTag:ApiTag", name, state, makeResourceOptions(options, id));
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
    public static ApiTag get(String name, Output<String> id, @Nullable ApiTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiTag(name, id, state, options);
    }
}