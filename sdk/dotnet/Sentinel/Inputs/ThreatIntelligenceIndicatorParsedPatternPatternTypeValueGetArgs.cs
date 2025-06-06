// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class ThreatIntelligenceIndicatorParsedPatternPatternTypeValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of the parsed pattern type.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The type of the value of the parsed pattern type value.
        /// </summary>
        [Input("valueType")]
        public Input<string>? ValueType { get; set; }

        public ThreatIntelligenceIndicatorParsedPatternPatternTypeValueGetArgs()
        {
        }
        public static new ThreatIntelligenceIndicatorParsedPatternPatternTypeValueGetArgs Empty => new ThreatIntelligenceIndicatorParsedPatternPatternTypeValueGetArgs();
    }
}
