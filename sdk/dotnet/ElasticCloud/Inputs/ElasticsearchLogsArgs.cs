// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ElasticCloud.Inputs
{

    public sealed class ElasticsearchLogsArgs : global::Pulumi.ResourceArgs
    {
        [Input("filteringTags")]
        private InputList<Inputs.ElasticsearchLogsFilteringTagArgs>? _filteringTags;

        /// <summary>
        /// A list of `filtering_tag` blocks as defined above.
        /// </summary>
        public InputList<Inputs.ElasticsearchLogsFilteringTagArgs> FilteringTags
        {
            get => _filteringTags ?? (_filteringTags = new InputList<Inputs.ElasticsearchLogsFilteringTagArgs>());
            set => _filteringTags = value;
        }

        /// <summary>
        /// Specifies if the Azure Activity Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        /// </summary>
        [Input("sendActivityLogs")]
        public Input<bool>? SendActivityLogs { get; set; }

        /// <summary>
        /// Specifies if the AzureAD Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        /// </summary>
        [Input("sendAzureadLogs")]
        public Input<bool>? SendAzureadLogs { get; set; }

        /// <summary>
        /// Specifies if the Azure Subscription Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        /// </summary>
        [Input("sendSubscriptionLogs")]
        public Input<bool>? SendSubscriptionLogs { get; set; }

        public ElasticsearchLogsArgs()
        {
        }
        public static new ElasticsearchLogsArgs Empty => new ElasticsearchLogsArgs();
    }
}
