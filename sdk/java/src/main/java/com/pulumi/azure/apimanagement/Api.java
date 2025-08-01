// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.ApiArgs;
import com.pulumi.azure.apimanagement.inputs.ApiState;
import com.pulumi.azure.apimanagement.outputs.ApiContact;
import com.pulumi.azure.apimanagement.outputs.ApiImport;
import com.pulumi.azure.apimanagement.outputs.ApiLicense;
import com.pulumi.azure.apimanagement.outputs.ApiOauth2Authorization;
import com.pulumi.azure.apimanagement.outputs.ApiOpenidAuthentication;
import com.pulumi.azure.apimanagement.outputs.ApiSubscriptionKeyParameterNames;
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
 * Manages an API within an API Management Service.
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
 * import com.pulumi.azure.apimanagement.Api;
 * import com.pulumi.azure.apimanagement.ApiArgs;
 * import com.pulumi.azure.apimanagement.inputs.ApiImportArgs;
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
 *         var exampleApi = new Api("exampleApi", ApiArgs.builder()
 *             .name("example-api")
 *             .resourceGroupName(example.name())
 *             .apiManagementName(exampleService.name())
 *             .revision("1")
 *             .displayName("Example API")
 *             .path("example")
 *             .protocols("https")
 *             .import_(ApiImportArgs.builder()
 *                 .contentFormat("swagger-link-json")
 *                 .contentValue("https://raw.githubusercontent.com/hashicorp/terraform-provider-azurerm/refs/heads/main/internal/services/apimanagement/testdata/api_management_api_schema_swagger.json")
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
 * API Management API&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/api:Api example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/apis/api1;rev=1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/api:Api")
public class Api extends com.pulumi.resources.CustomResource {
    /**
     * The Name of the API Management Service where this API should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", refs={String.class}, tree="[0]")
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this API should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * Type of API. Possible values are `graphql`, `http`, `soap`, and `websocket`. Defaults to `http`.
     * 
     */
    @Export(name="apiType", refs={String.class}, tree="[0]")
    private Output<String> apiType;

    /**
     * @return Type of API. Possible values are `graphql`, `http`, `soap`, and `websocket`. Defaults to `http`.
     * 
     */
    public Output<String> apiType() {
        return this.apiType;
    }
    /**
     * A `contact` block as documented below.
     * 
     */
    @Export(name="contact", refs={ApiContact.class}, tree="[0]")
    private Output</* @Nullable */ ApiContact> contact;

    /**
     * @return A `contact` block as documented below.
     * 
     */
    public Output<Optional<ApiContact>> contact() {
        return Codegen.optional(this.contact);
    }
    /**
     * A description of the API Management API, which may include HTML formatting tags.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the API Management API, which may include HTML formatting tags.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of the API.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The display name of the API.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A `import` block as documented below.
     * 
     * &gt; **Note:** The `display_name`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * 
     */
    @Export(name="import", refs={ApiImport.class}, tree="[0]")
    private Output</* @Nullable */ ApiImport> import_;

    /**
     * @return A `import` block as documented below.
     * 
     * &gt; **Note:** The `display_name`, `description`, `contact`, and `license` fields can be imported by the `import` block, which might cause a drift if these fields are set along with the `import` block.
     * 
     */
    public Output<Optional<ApiImport>> import_() {
        return Codegen.optional(this.import_);
    }
    /**
     * Is this the current API Revision?
     * 
     */
    @Export(name="isCurrent", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isCurrent;

    /**
     * @return Is this the current API Revision?
     * 
     */
    public Output<Boolean> isCurrent() {
        return this.isCurrent;
    }
    /**
     * Is this API Revision online/accessible via the Gateway?
     * 
     */
    @Export(name="isOnline", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isOnline;

    /**
     * @return Is this API Revision online/accessible via the Gateway?
     * 
     */
    public Output<Boolean> isOnline() {
        return this.isOnline;
    }
    /**
     * A `license` block as documented below.
     * 
     */
    @Export(name="license", refs={ApiLicense.class}, tree="[0]")
    private Output</* @Nullable */ ApiLicense> license;

    /**
     * @return A `license` block as documented below.
     * 
     */
    public Output<Optional<ApiLicense>> license() {
        return Codegen.optional(this.license);
    }
    /**
     * The name of the API Management API. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the API Management API. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An `oauth2_authorization` block as documented below.
     * 
     */
    @Export(name="oauth2Authorization", refs={ApiOauth2Authorization.class}, tree="[0]")
    private Output</* @Nullable */ ApiOauth2Authorization> oauth2Authorization;

    /**
     * @return An `oauth2_authorization` block as documented below.
     * 
     */
    public Output<Optional<ApiOauth2Authorization>> oauth2Authorization() {
        return Codegen.optional(this.oauth2Authorization);
    }
    /**
     * An `openid_authentication` block as documented below.
     * 
     */
    @Export(name="openidAuthentication", refs={ApiOpenidAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ ApiOpenidAuthentication> openidAuthentication;

    /**
     * @return An `openid_authentication` block as documented below.
     * 
     */
    public Output<Optional<ApiOpenidAuthentication>> openidAuthentication() {
        return Codegen.optional(this.openidAuthentication);
    }
    /**
     * The Path for this API Management API, which is a relative URL which uniquely identifies this API and all of its resource paths within the API Management Service.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The Path for this API Management API, which is a relative URL which uniquely identifies this API and all of its resource paths within the API Management Service.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * A list of protocols the operations in this API can be invoked. Possible values are `http`, `https`, `ws`, and `wss`.
     * 
     * &gt; **Note:** `display_name`, `path` and `protocols` are required when `source_api_id` is not set.
     * 
     */
    @Export(name="protocols", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> protocols;

    /**
     * @return A list of protocols the operations in this API can be invoked. Possible values are `http`, `https`, `ws`, and `wss`.
     * 
     * &gt; **Note:** `display_name`, `path` and `protocols` are required when `source_api_id` is not set.
     * 
     */
    public Output<List<String>> protocols() {
        return this.protocols;
    }
    /**
     * The Name of the Resource Group where the API Management API exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management API exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Revision which used for this API. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="revision", refs={String.class}, tree="[0]")
    private Output<String> revision;

    /**
     * @return The Revision which used for this API. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> revision() {
        return this.revision;
    }
    /**
     * The description of the API Revision of the API Management API.
     * 
     */
    @Export(name="revisionDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> revisionDescription;

    /**
     * @return The description of the API Revision of the API Management API.
     * 
     */
    public Output<Optional<String>> revisionDescription() {
        return Codegen.optional(this.revisionDescription);
    }
    /**
     * Absolute URL of the backend service implementing this API.
     * 
     * &gt; **Note:** The `service_url` is required when `api_type` is specified as `websocket`.
     * 
     */
    @Export(name="serviceUrl", refs={String.class}, tree="[0]")
    private Output<String> serviceUrl;

    /**
     * @return Absolute URL of the backend service implementing this API.
     * 
     * &gt; **Note:** The `service_url` is required when `api_type` is specified as `websocket`.
     * 
     */
    public Output<String> serviceUrl() {
        return this.serviceUrl;
    }
    /**
     * The API id of the source API, which could be in format `azurerm_api_management_api.example.id` or in format `azurerm_api_management_api.example.id;rev=1`
     * 
     */
    @Export(name="sourceApiId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceApiId;

    /**
     * @return The API id of the source API, which could be in format `azurerm_api_management_api.example.id` or in format `azurerm_api_management_api.example.id;rev=1`
     * 
     */
    public Output<Optional<String>> sourceApiId() {
        return Codegen.optional(this.sourceApiId);
    }
    /**
     * A `subscription_key_parameter_names` block as documented below.
     * 
     */
    @Export(name="subscriptionKeyParameterNames", refs={ApiSubscriptionKeyParameterNames.class}, tree="[0]")
    private Output<ApiSubscriptionKeyParameterNames> subscriptionKeyParameterNames;

    /**
     * @return A `subscription_key_parameter_names` block as documented below.
     * 
     */
    public Output<ApiSubscriptionKeyParameterNames> subscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }
    /**
     * Should this API require a subscription key? Defaults to `true`.
     * 
     */
    @Export(name="subscriptionRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> subscriptionRequired;

    /**
     * @return Should this API require a subscription key? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> subscriptionRequired() {
        return Codegen.optional(this.subscriptionRequired);
    }
    /**
     * Absolute URL of the Terms of Service for the API.
     * 
     */
    @Export(name="termsOfServiceUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> termsOfServiceUrl;

    /**
     * @return Absolute URL of the Terms of Service for the API.
     * 
     */
    public Output<Optional<String>> termsOfServiceUrl() {
        return Codegen.optional(this.termsOfServiceUrl);
    }
    /**
     * The Version number of this API, if this API is versioned.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The Version number of this API, if this API is versioned.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The description of the API Version of the API Management API.
     * 
     */
    @Export(name="versionDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> versionDescription;

    /**
     * @return The description of the API Version of the API Management API.
     * 
     */
    public Output<Optional<String>> versionDescription() {
        return Codegen.optional(this.versionDescription);
    }
    /**
     * The ID of the Version Set which this API is associated with.
     * 
     * &gt; **Note:** When `version` is set, `version_set_id` must also be specified
     * 
     */
    @Export(name="versionSetId", refs={String.class}, tree="[0]")
    private Output<String> versionSetId;

    /**
     * @return The ID of the Version Set which this API is associated with.
     * 
     * &gt; **Note:** When `version` is set, `version_set_id` must also be specified
     * 
     */
    public Output<String> versionSetId() {
        return this.versionSetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Api(java.lang.String name) {
        this(name, ApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Api(java.lang.String name, ApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Api(java.lang.String name, ApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/api:Api", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Api(java.lang.String name, Output<java.lang.String> id, @Nullable ApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/api:Api", name, state, makeResourceOptions(options, id), false);
    }

    private static ApiArgs makeArgs(ApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApiArgs.Empty : args;
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
    public static Api get(java.lang.String name, Output<java.lang.String> id, @Nullable ApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Api(name, id, state, options);
    }
}
