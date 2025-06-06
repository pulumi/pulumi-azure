// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ElasticCloud
{
    /// <summary>
    /// Manages an Elasticsearch in Elastic Cloud.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Azure.Core.ResourceGroup("test", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var testElasticsearch = new Azure.ElasticCloud.Elasticsearch("test", new()
    ///     {
    ///         Name = "example-elasticsearch",
    ///         ResourceGroupName = test.Name,
    ///         Location = test.Location,
    ///         SkuName = "ess-consumption-2024_Monthly",
    ///         ElasticCloudEmailAddress = "user@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.Elastic`: 2023-06-01
    /// 
    /// ## Import
    /// 
    /// Elasticsearch's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:elasticcloud/elasticsearch:Elasticsearch example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Elastic/monitors/monitor1
    /// ```
    /// </summary>
    [AzureResourceType("azure:elasticcloud/elasticsearch:Elasticsearch")]
    public partial class Elasticsearch : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Deployment within Elastic Cloud.
        /// </summary>
        [Output("elasticCloudDeploymentId")]
        public Output<string> ElasticCloudDeploymentId { get; private set; } = null!;

        /// <summary>
        /// Specifies the Email Address which should be associated with this Elasticsearch account. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Output("elasticCloudEmailAddress")]
        public Output<string> ElasticCloudEmailAddress { get; private set; } = null!;

        /// <summary>
        /// The Default URL used for Single Sign On (SSO) to Elastic Cloud.
        /// </summary>
        [Output("elasticCloudSsoDefaultUrl")]
        public Output<string> ElasticCloudSsoDefaultUrl { get; private set; } = null!;

        /// <summary>
        /// The ID of the User Account within Elastic Cloud.
        /// </summary>
        [Output("elasticCloudUserId")]
        public Output<string> ElasticCloudUserId { get; private set; } = null!;

        /// <summary>
        /// The URL to the Elasticsearch Service associated with this Elasticsearch.
        /// </summary>
        [Output("elasticsearchServiceUrl")]
        public Output<string> ElasticsearchServiceUrl { get; private set; } = null!;

        /// <summary>
        /// The URL to the Kibana Dashboard associated with this Elasticsearch.
        /// </summary>
        [Output("kibanaServiceUrl")]
        public Output<string> KibanaServiceUrl { get; private set; } = null!;

        /// <summary>
        /// The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
        /// </summary>
        [Output("kibanaSsoUri")]
        public Output<string> KibanaSsoUri { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// A `logs` block as defined below.
        /// </summary>
        [Output("logs")]
        public Output<Outputs.ElasticsearchLogs?> Logs { get; private set; } = null!;

        /// <summary>
        /// Specifies if the Elasticsearch should have monitoring configured? Defaults to `true`. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Output("monitoringEnabled")]
        public Output<bool?> MonitoringEnabled { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Elasticsearch resource. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the SKU for this Elasticsearch. Changing this forces a new Elasticsearch to be created.
        /// 
        /// &gt; **Note:** The SKU depends on the Elasticsearch Plans available for your account and is a combination of PlanID_Term.
        /// Ex: If the plan ID is "planXYZ" and term is "Yearly", the SKU will be "planXYZ_Yearly".
        /// You may find your eligible plans [here](https://portal.azure.com/#view/Microsoft_Azure_Marketplace/GalleryItemDetailsBladeNopdl/id/elastic.ec-azure-pp) or in the online documentation [here](https://azuremarketplace.microsoft.com/en-us/marketplace/apps/elastic.ec-azure-pp?tab=PlansAndPrice) for more details or in case of any issues with the SKU.
        /// </summary>
        [Output("skuName")]
        public Output<string> SkuName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Elasticsearch resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Elasticsearch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Elasticsearch(string name, ElasticsearchArgs args, CustomResourceOptions? options = null)
            : base("azure:elasticcloud/elasticsearch:Elasticsearch", name, args ?? new ElasticsearchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Elasticsearch(string name, Input<string> id, ElasticsearchState? state = null, CustomResourceOptions? options = null)
            : base("azure:elasticcloud/elasticsearch:Elasticsearch", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Elasticsearch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Elasticsearch Get(string name, Input<string> id, ElasticsearchState? state = null, CustomResourceOptions? options = null)
        {
            return new Elasticsearch(name, id, state, options);
        }
    }

    public sealed class ElasticsearchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Email Address which should be associated with this Elasticsearch account. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("elasticCloudEmailAddress", required: true)]
        public Input<string> ElasticCloudEmailAddress { get; set; } = null!;

        /// <summary>
        /// The Azure Region where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A `logs` block as defined below.
        /// </summary>
        [Input("logs")]
        public Input<Inputs.ElasticsearchLogsArgs>? Logs { get; set; }

        /// <summary>
        /// Specifies if the Elasticsearch should have monitoring configured? Defaults to `true`. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("monitoringEnabled")]
        public Input<bool>? MonitoringEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this Elasticsearch resource. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the SKU for this Elasticsearch. Changing this forces a new Elasticsearch to be created.
        /// 
        /// &gt; **Note:** The SKU depends on the Elasticsearch Plans available for your account and is a combination of PlanID_Term.
        /// Ex: If the plan ID is "planXYZ" and term is "Yearly", the SKU will be "planXYZ_Yearly".
        /// You may find your eligible plans [here](https://portal.azure.com/#view/Microsoft_Azure_Marketplace/GalleryItemDetailsBladeNopdl/id/elastic.ec-azure-pp) or in the online documentation [here](https://azuremarketplace.microsoft.com/en-us/marketplace/apps/elastic.ec-azure-pp?tab=PlansAndPrice) for more details or in case of any issues with the SKU.
        /// </summary>
        [Input("skuName", required: true)]
        public Input<string> SkuName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Elasticsearch resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ElasticsearchArgs()
        {
        }
        public static new ElasticsearchArgs Empty => new ElasticsearchArgs();
    }

    public sealed class ElasticsearchState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Deployment within Elastic Cloud.
        /// </summary>
        [Input("elasticCloudDeploymentId")]
        public Input<string>? ElasticCloudDeploymentId { get; set; }

        /// <summary>
        /// Specifies the Email Address which should be associated with this Elasticsearch account. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("elasticCloudEmailAddress")]
        public Input<string>? ElasticCloudEmailAddress { get; set; }

        /// <summary>
        /// The Default URL used for Single Sign On (SSO) to Elastic Cloud.
        /// </summary>
        [Input("elasticCloudSsoDefaultUrl")]
        public Input<string>? ElasticCloudSsoDefaultUrl { get; set; }

        /// <summary>
        /// The ID of the User Account within Elastic Cloud.
        /// </summary>
        [Input("elasticCloudUserId")]
        public Input<string>? ElasticCloudUserId { get; set; }

        /// <summary>
        /// The URL to the Elasticsearch Service associated with this Elasticsearch.
        /// </summary>
        [Input("elasticsearchServiceUrl")]
        public Input<string>? ElasticsearchServiceUrl { get; set; }

        /// <summary>
        /// The URL to the Kibana Dashboard associated with this Elasticsearch.
        /// </summary>
        [Input("kibanaServiceUrl")]
        public Input<string>? KibanaServiceUrl { get; set; }

        /// <summary>
        /// The URI used for SSO to the Kibana Dashboard associated with this Elasticsearch.
        /// </summary>
        [Input("kibanaSsoUri")]
        public Input<string>? KibanaSsoUri { get; set; }

        /// <summary>
        /// The Azure Region where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A `logs` block as defined below.
        /// </summary>
        [Input("logs")]
        public Input<Inputs.ElasticsearchLogsGetArgs>? Logs { get; set; }

        /// <summary>
        /// Specifies if the Elasticsearch should have monitoring configured? Defaults to `true`. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("monitoringEnabled")]
        public Input<bool>? MonitoringEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this Elasticsearch resource. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Elasticsearch resource should exist. Changing this forces a new Elasticsearch to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Specifies the name of the SKU for this Elasticsearch. Changing this forces a new Elasticsearch to be created.
        /// 
        /// &gt; **Note:** The SKU depends on the Elasticsearch Plans available for your account and is a combination of PlanID_Term.
        /// Ex: If the plan ID is "planXYZ" and term is "Yearly", the SKU will be "planXYZ_Yearly".
        /// You may find your eligible plans [here](https://portal.azure.com/#view/Microsoft_Azure_Marketplace/GalleryItemDetailsBladeNopdl/id/elastic.ec-azure-pp) or in the online documentation [here](https://azuremarketplace.microsoft.com/en-us/marketplace/apps/elastic.ec-azure-pp?tab=PlansAndPrice) for more details or in case of any issues with the SKU.
        /// </summary>
        [Input("skuName")]
        public Input<string>? SkuName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Elasticsearch resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ElasticsearchState()
        {
        }
        public static new ElasticsearchState Empty => new ElasticsearchState();
    }
}
