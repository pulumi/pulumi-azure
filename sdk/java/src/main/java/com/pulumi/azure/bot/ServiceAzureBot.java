// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.ServiceAzureBotArgs;
import com.pulumi.azure.bot.inputs.ServiceAzureBotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Bot Service.
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
 * import com.pulumi.azure.appinsights.Insights;
 * import com.pulumi.azure.appinsights.InsightsArgs;
 * import com.pulumi.azure.appinsights.ApiKey;
 * import com.pulumi.azure.appinsights.ApiKeyArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.bot.ServiceAzureBot;
 * import com.pulumi.azure.bot.ServiceAzureBotArgs;
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
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .applicationType(&#34;web&#34;)
 *             .build());
 * 
 *         var exampleApiKey = new ApiKey(&#34;exampleApiKey&#34;, ApiKeyArgs.builder()        
 *             .applicationInsightsId(exampleInsights.id())
 *             .readPermissions(            
 *                 &#34;aggregate&#34;,
 *                 &#34;api&#34;,
 *                 &#34;draft&#34;,
 *                 &#34;extendqueries&#34;,
 *                 &#34;search&#34;)
 *             .build());
 * 
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleServiceAzureBot = new ServiceAzureBot(&#34;exampleServiceAzureBot&#34;, ServiceAzureBotArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(&#34;global&#34;)
 *             .microsoftAppId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.clientId()))
 *             .sku(&#34;F0&#34;)
 *             .endpoint(&#34;https://example.com&#34;)
 *             .developerAppInsightsApiKey(exampleApiKey.apiKey())
 *             .developerAppInsightsApplicationId(exampleInsights.appId())
 *             .tags(Map.of(&#34;environment&#34;, &#34;test&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Bot Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:bot/serviceAzureBot:ServiceAzureBot example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.BotService/botServices/botService1
 * ```
 * 
 */
@ResourceType(type="azure:bot/serviceAzureBot:ServiceAzureBot")
public class ServiceAzureBot extends com.pulumi.resources.CustomResource {
    /**
     * The Application Insights API Key to associate with this Azure Bot Service.
     * 
     */
    @Export(name="developerAppInsightsApiKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> developerAppInsightsApiKey;

    /**
     * @return The Application Insights API Key to associate with this Azure Bot Service.
     * 
     */
    public Output<Optional<String>> developerAppInsightsApiKey() {
        return Codegen.optional(this.developerAppInsightsApiKey);
    }
    /**
     * The resource ID of the Application Insights instance to associate with this Azure Bot Service.
     * 
     */
    @Export(name="developerAppInsightsApplicationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> developerAppInsightsApplicationId;

    /**
     * @return The resource ID of the Application Insights instance to associate with this Azure Bot Service.
     * 
     */
    public Output<Optional<String>> developerAppInsightsApplicationId() {
        return Codegen.optional(this.developerAppInsightsApplicationId);
    }
    /**
     * The Application Insight Key to associate with this Azure Bot Service.
     * 
     */
    @Export(name="developerAppInsightsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> developerAppInsightsKey;

    /**
     * @return The Application Insight Key to associate with this Azure Bot Service.
     * 
     */
    public Output<Optional<String>> developerAppInsightsKey() {
        return Codegen.optional(this.developerAppInsightsKey);
    }
    /**
     * The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The Azure Bot Service endpoint.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return The Azure Bot Service endpoint.
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A list of LUIS App IDs to associate with this Azure Bot Service.
     * 
     */
    @Export(name="luisAppIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> luisAppIds;

    /**
     * @return A list of LUIS App IDs to associate with this Azure Bot Service.
     * 
     */
    public Output<Optional<List<String>>> luisAppIds() {
        return Codegen.optional(this.luisAppIds);
    }
    /**
     * The LUIS key to associate with this Azure Bot Service.
     * 
     */
    @Export(name="luisKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> luisKey;

    /**
     * @return The LUIS key to associate with this Azure Bot Service.
     * 
     */
    public Output<Optional<String>> luisKey() {
        return Codegen.optional(this.luisKey);
    }
    /**
     * The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="microsoftAppId", type=String.class, parameters={})
    private Output<String> microsoftAppId;

    /**
     * @return The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> microsoftAppId() {
        return this.microsoftAppId;
    }
    /**
     * The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="microsoftAppMsiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAppMsiId;

    /**
     * @return The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> microsoftAppMsiId() {
        return Codegen.optional(this.microsoftAppMsiId);
    }
    /**
     * The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="microsoftAppTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAppTenantId;

    /**
     * @return The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> microsoftAppTenantId() {
        return Codegen.optional(this.microsoftAppTenantId);
    }
    /**
     * The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="microsoftAppType", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAppType;

    /**
     * @return The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> microsoftAppType() {
        return Codegen.optional(this.microsoftAppType);
    }
    /**
     * The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output<String> sku;

    /**
     * @return The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }
    /**
     * Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
     * 
     */
    @Export(name="streamingEndpointEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> streamingEndpointEnabled;

    /**
     * @return Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> streamingEndpointEnabled() {
        return Codegen.optional(this.streamingEndpointEnabled);
    }
    /**
     * A mapping of tags which should be assigned to this Azure Bot Service.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to this Azure Bot Service.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAzureBot(String name) {
        this(name, ServiceAzureBotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAzureBot(String name, ServiceAzureBotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAzureBot(String name, ServiceAzureBotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/serviceAzureBot:ServiceAzureBot", name, args == null ? ServiceAzureBotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAzureBot(String name, Output<String> id, @Nullable ServiceAzureBotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/serviceAzureBot:ServiceAzureBot", name, state, makeResourceOptions(options, id));
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
    public static ServiceAzureBot get(String name, Output<String> id, @Nullable ServiceAzureBotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAzureBot(name, id, state, options);
    }
}