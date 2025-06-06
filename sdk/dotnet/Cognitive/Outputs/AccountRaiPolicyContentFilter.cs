// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cognitive.Outputs
{

    [OutputType]
    public sealed class AccountRaiPolicyContentFilter
    {
        /// <summary>
        /// Whether the filter should block content. Possible values are `true` or `false`.
        /// </summary>
        public readonly bool BlockEnabled;
        /// <summary>
        /// Whether the filter is enabled. Possible values are `true` or `false`.
        /// </summary>
        public readonly bool FilterEnabled;
        /// <summary>
        /// The name of the content filter.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The severity threshold for the filter. Possible values are `Low`, `Medium` or `High`.
        /// </summary>
        public readonly string SeverityThreshold;
        /// <summary>
        /// Content source to apply the content filter. Possible values are `Prompt` or `Completion`.
        /// </summary>
        public readonly string Source;

        [OutputConstructor]
        private AccountRaiPolicyContentFilter(
            bool blockEnabled,

            bool filterEnabled,

            string name,

            string severityThreshold,

            string source)
        {
            BlockEnabled = blockEnabled;
            FilterEnabled = filterEnabled;
            Name = name;
            SeverityThreshold = severityThreshold;
            Source = source;
        }
    }
}
