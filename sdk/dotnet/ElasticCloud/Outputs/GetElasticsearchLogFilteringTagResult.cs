// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class GetElasticsearchLogFilteringTagResult
    {
        /// <summary>
        /// The type of action which is taken when the Tag matches the `name` and `value`.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The name of the Elasticsearch resource.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value of the Tag which should be filtered.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetElasticsearchLogFilteringTagResult(
            string action,

            string name,

            string value)
        {
            Action = action;
            Name = name;
            Value = value;
        }
    }
}