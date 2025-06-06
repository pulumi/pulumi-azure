// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid.Outputs
{

    [OutputType]
    public sealed class NamespaceTopicSpacesConfigurationDynamicRoutingEnrichment
    {
        /// <summary>
        /// The enrichment key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The enrichment value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private NamespaceTopicSpacesConfigurationDynamicRoutingEnrichment(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
