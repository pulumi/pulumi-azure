// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudGatewayArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState;
import com.pulumi.azure.appplatform.outputs.SpringCloudGatewayApiMetadata;
import com.pulumi.azure.appplatform.outputs.SpringCloudGatewayCors;
import com.pulumi.azure.appplatform.outputs.SpringCloudGatewayQuota;
import com.pulumi.azure.appplatform.outputs.SpringCloudGatewaySso;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** This resource is applicable only for Spring Cloud Service with enterprise tier.
 * 
 * Manages a Spring Cloud Gateway.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudGateway;
 * import com.pulumi.azure.appplatform.SpringCloudGatewayArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs;
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;E0&#34;)
 *             .build());
 * 
 *         var exampleSpringCloudGateway = new SpringCloudGateway(&#34;exampleSpringCloudGateway&#34;, SpringCloudGatewayArgs.builder()        
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .httpsOnly(false)
 *             .publicNetworkAccessEnabled(true)
 *             .instanceCount(2)
 *             .apiMetadata(SpringCloudGatewayApiMetadataArgs.builder()
 *                 .description(&#34;example description&#34;)
 *                 .documentationUrl(&#34;https://www.example.com/docs&#34;)
 *                 .serverUrl(&#34;https://wwww.example.com&#34;)
 *                 .title(&#34;example title&#34;)
 *                 .version(&#34;1.0&#34;)
 *                 .build())
 *             .cors(SpringCloudGatewayCorsArgs.builder()
 *                 .credentialsAllowed(false)
 *                 .allowedHeaders(&#34;*&#34;)
 *                 .allowedMethods(&#34;PUT&#34;)
 *                 .allowedOrigins(&#34;example.com&#34;)
 *                 .exposedHeaders(&#34;x-example-header&#34;)
 *                 .maxAgeSeconds(86400)
 *                 .build())
 *             .quota(SpringCloudGatewayQuotaArgs.builder()
 *                 .cpu(&#34;1&#34;)
 *                 .memory(&#34;2Gi&#34;)
 *                 .build())
 *             .sso(SpringCloudGatewaySsoArgs.builder()
 *                 .clientId(&#34;example id&#34;)
 *                 .clientSecret(&#34;example secret&#34;)
 *                 .issuerUri(&#34;https://www.test.com/issueToken&#34;)
 *                 .scopes(&#34;read&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Gateways can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudGateway:SpringCloudGateway example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/gateways/gateway1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudGateway:SpringCloudGateway")
public class SpringCloudGateway extends com.pulumi.resources.CustomResource {
    /**
     * A `api_metadata` block as defined below.
     * 
     */
    @Export(name="apiMetadata", type=SpringCloudGatewayApiMetadata.class, parameters={})
    private Output</* @Nullable */ SpringCloudGatewayApiMetadata> apiMetadata;

    /**
     * @return A `api_metadata` block as defined below.
     * 
     */
    public Output<Optional<SpringCloudGatewayApiMetadata>> apiMetadata() {
        return Codegen.optional(this.apiMetadata);
    }
    /**
     * A `cors` block as defined below.
     * 
     */
    @Export(name="cors", type=SpringCloudGatewayCors.class, parameters={})
    private Output</* @Nullable */ SpringCloudGatewayCors> cors;

    /**
     * @return A `cors` block as defined below.
     * 
     */
    public Output<Optional<SpringCloudGatewayCors>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * is only https is allowed?
     * 
     */
    @Export(name="httpsOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return is only https is allowed?
     * 
     */
    public Output<Optional<Boolean>> httpsOnly() {
        return Codegen.optional(this.httpsOnly);
    }
    /**
     * Specifies the required instance count of the Spring Cloud Gateway. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceCount;

    /**
     * @return Specifies the required instance count of the Spring Cloud Gateway. Possible Values are between `1` and `500`. Defaults to `1` if not specified.
     * 
     */
    public Output<Optional<Integer>> instanceCount() {
        return Codegen.optional(this.instanceCount);
    }
    /**
     * The name which should be used for this Spring Cloud Gateway. Changing this forces a new Spring Cloud Gateway to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Gateway. Changing this forces a new Spring Cloud Gateway to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * A `quota` block as defined below.
     * 
     */
    @Export(name="quota", type=SpringCloudGatewayQuota.class, parameters={})
    private Output<SpringCloudGatewayQuota> quota;

    /**
     * @return A `quota` block as defined below.
     * 
     */
    public Output<SpringCloudGatewayQuota> quota() {
        return this.quota;
    }
    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Gateway to be created.
     * 
     */
    @Export(name="springCloudServiceId", type=String.class, parameters={})
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Gateway to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }
    /**
     * A `sso` block as defined below.
     * 
     */
    @Export(name="sso", type=SpringCloudGatewaySso.class, parameters={})
    private Output</* @Nullable */ SpringCloudGatewaySso> sso;

    /**
     * @return A `sso` block as defined below.
     * 
     */
    public Output<Optional<SpringCloudGatewaySso>> sso() {
        return Codegen.optional(this.sso);
    }
    /**
     * URL of the Spring Cloud Gateway, exposed when &#39;public_network_access_enabled&#39; is true.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return URL of the Spring Cloud Gateway, exposed when &#39;public_network_access_enabled&#39; is true.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudGateway(String name) {
        this(name, SpringCloudGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudGateway(String name, SpringCloudGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudGateway(String name, SpringCloudGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudGateway:SpringCloudGateway", name, args == null ? SpringCloudGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudGateway(String name, Output<String> id, @Nullable SpringCloudGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudGateway:SpringCloudGateway", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudGateway get(String name, Output<String> id, @Nullable SpringCloudGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudGateway(name, id, state, options);
    }
}