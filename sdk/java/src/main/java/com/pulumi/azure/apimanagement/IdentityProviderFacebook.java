// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs;
import com.pulumi.azure.apimanagement.inputs.IdentityProviderFacebookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an API Management Facebook Identity Provider.
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
 * import com.pulumi.azure.apimanagement.IdentityProviderFacebook;
 * import com.pulumi.azure.apimanagement.IdentityProviderFacebookArgs;
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
 *             .publisherEmail("company}{@literal @}{@code mycompany.io")
 *             .skuName("Developer_1")
 *             .build());
 * 
 *         var exampleIdentityProviderFacebook = new IdentityProviderFacebook("exampleIdentityProviderFacebook", IdentityProviderFacebookArgs.builder()
 *             .resourceGroupName(example.name())
 *             .apiManagementName(exampleService.name())
 *             .appId("00000000000000000000000000000000")
 *             .appSecret("00000000000000000000000000000000")
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
 * API Management Facebook Identity Provider can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/identityProviderFacebook:IdentityProviderFacebook example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/identityProviders/facebook
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/identityProviderFacebook:IdentityProviderFacebook")
public class IdentityProviderFacebook extends com.pulumi.resources.CustomResource {
    /**
     * The Name of the API Management Service where this Facebook Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", refs={String.class}, tree="[0]")
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this Facebook Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * App ID for Facebook.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return App ID for Facebook.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * App Secret for Facebook.
     * 
     */
    @Export(name="appSecret", refs={String.class}, tree="[0]")
    private Output<String> appSecret;

    /**
     * @return App Secret for Facebook.
     * 
     */
    public Output<String> appSecret() {
        return this.appSecret;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityProviderFacebook(java.lang.String name) {
        this(name, IdentityProviderFacebookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityProviderFacebook(java.lang.String name, IdentityProviderFacebookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityProviderFacebook(java.lang.String name, IdentityProviderFacebookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/identityProviderFacebook:IdentityProviderFacebook", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IdentityProviderFacebook(java.lang.String name, Output<java.lang.String> id, @Nullable IdentityProviderFacebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/identityProviderFacebook:IdentityProviderFacebook", name, state, makeResourceOptions(options, id), false);
    }

    private static IdentityProviderFacebookArgs makeArgs(IdentityProviderFacebookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IdentityProviderFacebookArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "appSecret"
            ))
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
    public static IdentityProviderFacebook get(java.lang.String name, Output<java.lang.String> id, @Nullable IdentityProviderFacebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProviderFacebook(name, id, state, options);
    }
}
