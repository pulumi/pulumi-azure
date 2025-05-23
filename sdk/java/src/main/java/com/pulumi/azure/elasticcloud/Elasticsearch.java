// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticcloud;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.elasticcloud.ElasticsearchArgs;
import com.pulumi.azure.elasticcloud.inputs.ElasticsearchState;
import com.pulumi.azure.elasticcloud.outputs.ElasticsearchLogs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Elasticsearch in Elastic Cloud.
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
 * import com.pulumi.azure.elasticcloud.Elasticsearch;
 * import com.pulumi.azure.elasticcloud.ElasticsearchArgs;
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
 *         var test = new ResourceGroup("test", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var testElasticsearch = new Elasticsearch("testElasticsearch", ElasticsearchArgs.builder()
 *             .name("example-elasticsearch")
 *             .resourceGroupName(test.name())
 *             .location(test.location())
 *             .skuName("ess-consumption-2024_Monthly")
 *             .elasticCloudEmailAddress("user}{@literal @}{@code example.com")
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
 * * `Microsoft.Elastic`: 2023-06-01
 * 
 * ## Import
 * 
 * Elasticsearch&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:elasticcloud/elasticsearch:Elasticsearch example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Elastic/monitors/monitor1
 * ```
 * 
 */
@ResourceType(type="azure:elasticcloud/elasticsearch:Elasticsearch")
public class Elasticsearch extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Deployment within Elastic Cloud.
     * 
     */
    @Export(name="elasticCloudDeploymentId", refs={String.class}, tree="[0]")
    private Output<String> elasticCloudDeploymentId;

    /**
     * @return The ID of the Deployment within Elastic Cloud.
     * 
     */
    public Output<String> elasticCloudDeploymentId() {
        return this.elasticCloudDeploymentId;
    }
    /**
     * Specifies the Email Address which should be associated with this Elasticsearch account. Changing this forces a new Elasticsearch to be created.
     * 
     */
    @Export(name="elasticCloudEmailAddress", refs={String.class}, tree="[0]")
    private Output<String> elasticCloudEmailAddress;

    /**
     * @return Specifies the Email Address which should be associated with this Elasticsearch account. Changing this forces a new Elasticsearch to be created.
     * 
     */
    public Output<String> elasticCloudEmailAddress() {
        return this.elasticCloudEmailAddress;
    }
    /**
     * The Default URL used for Single Sign On (SSO) to Elastic Cloud.
     * 
     */
    @Export(name="elasticCloudSsoDefaultUrl", refs={String.class}, tree="[0]")
    private Output<String> elasticCloudSsoDefaultUrl;

    /**
     * @return The Default URL used for Single Sign On (SSO) to Elastic Cloud.
     * 
     */
    public Output<String> elasticCloudSsoDefaultUrl() {
        return this.elasticCloudSsoDefaultUrl;
    }
    /**
     * The ID of the User Account within Elastic Cloud.
     * 
     */
    @Export(name="elasticCloudUserId", refs={String.class}, tree="[0]")
    private Output<String> elasticCloudUserId;

    /**
     * @return The ID of the User Account within Elastic Cloud.
     * 
     */
    public Output<String> elasticCloudUserId() {
        return this.elasticCloudUserId;
    }
    /**
     * The URL to the Elasticsearch Service associated with this Elasticsearch.
     * 
     */
    @Export(name="elasticsearchServiceUrl", refs={String.class}, tree="[0]")
    private Output<String> elasticsearchServiceUrl;

    /**
     * @return The URL to the Elasticsearch Service associated with this Elasticsearch.
     * 
     */
    public Output<String> elasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }
    /**
     * The URL to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    @Export(name="kibanaServiceUrl", refs={String.class}, tree="[0]")
    private Output<String> kibanaServiceUrl;

    /**
     * @return The URL to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    public Output<String> kibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }
    /**
     * The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    @Export(name="kibanaSsoUri", refs={String.class}, tree="[0]")
    private Output<String> kibanaSsoUri;

    /**
     * @return The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
     * 
     */
    public Output<String> kibanaSsoUri() {
        return this.kibanaSsoUri;
    }
    /**
     * The Azure Region where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `logs` block as defined below.
     * 
     */
    @Export(name="logs", refs={ElasticsearchLogs.class}, tree="[0]")
    private Output</* @Nullable */ ElasticsearchLogs> logs;

    /**
     * @return A `logs` block as defined below.
     * 
     */
    public Output<Optional<ElasticsearchLogs>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * Specifies if the Elasticsearch should have monitoring configured? Defaults to `true`. Changing this forces a new Elasticsearch to be created.
     * 
     */
    @Export(name="monitoringEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> monitoringEnabled;

    /**
     * @return Specifies if the Elasticsearch should have monitoring configured? Defaults to `true`. Changing this forces a new Elasticsearch to be created.
     * 
     */
    public Output<Optional<Boolean>> monitoringEnabled() {
        return Codegen.optional(this.monitoringEnabled);
    }
    /**
     * The name which should be used for this Elasticsearch resource. Changing this forces a new Elasticsearch to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Elasticsearch resource. Changing this forces a new Elasticsearch to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the name of the SKU for this Elasticsearch. Changing this forces a new Elasticsearch to be created.
     * 
     * &gt; **Note:** The SKU depends on the Elasticsearch Plans available for your account and is a combination of PlanID_Term.
     * Ex: If the plan ID is &#34;planXYZ&#34; and term is &#34;Yearly&#34;, the SKU will be &#34;planXYZ_Yearly&#34;.
     * You may find your eligible plans [here](https://portal.azure.com/#view/Microsoft_Azure_Marketplace/GalleryItemDetailsBladeNopdl/id/elastic.ec-azure-pp) or in the online documentation [here](https://azuremarketplace.microsoft.com/en-us/marketplace/apps/elastic.ec-azure-pp?tab=PlansAndPrice) for more details or in case of any issues with the SKU.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return Specifies the name of the SKU for this Elasticsearch. Changing this forces a new Elasticsearch to be created.
     * 
     * &gt; **Note:** The SKU depends on the Elasticsearch Plans available for your account and is a combination of PlanID_Term.
     * Ex: If the plan ID is &#34;planXYZ&#34; and term is &#34;Yearly&#34;, the SKU will be &#34;planXYZ_Yearly&#34;.
     * You may find your eligible plans [here](https://portal.azure.com/#view/Microsoft_Azure_Marketplace/GalleryItemDetailsBladeNopdl/id/elastic.ec-azure-pp) or in the online documentation [here](https://azuremarketplace.microsoft.com/en-us/marketplace/apps/elastic.ec-azure-pp?tab=PlansAndPrice) for more details or in case of any issues with the SKU.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the Elasticsearch resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Elasticsearch resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Elasticsearch(java.lang.String name) {
        this(name, ElasticsearchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Elasticsearch(java.lang.String name, ElasticsearchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Elasticsearch(java.lang.String name, ElasticsearchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:elasticcloud/elasticsearch:Elasticsearch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Elasticsearch(java.lang.String name, Output<java.lang.String> id, @Nullable ElasticsearchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:elasticcloud/elasticsearch:Elasticsearch", name, state, makeResourceOptions(options, id), false);
    }

    private static ElasticsearchArgs makeArgs(ElasticsearchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ElasticsearchArgs.Empty : args;
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
    public static Elasticsearch get(java.lang.String name, Output<java.lang.String> id, @Nullable ElasticsearchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Elasticsearch(name, id, state, options);
    }
}
