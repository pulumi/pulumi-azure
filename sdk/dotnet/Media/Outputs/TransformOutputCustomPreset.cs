// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class TransformOutputCustomPreset
    {
        /// <summary>
        /// One or more `codec` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.TransformOutputCustomPresetCodec> Codecs;
        /// <summary>
        /// Dictionary containing key value pairs for parameters not exposed in the preset itself.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ExperimentalOptions;
        /// <summary>
        /// A `filter` block as defined below.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetFilter? Filter;
        /// <summary>
        /// One or more `format` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.TransformOutputCustomPresetFormat> Formats;

        [OutputConstructor]
        private TransformOutputCustomPreset(
            ImmutableArray<Outputs.TransformOutputCustomPresetCodec> codecs,

            ImmutableDictionary<string, string>? experimentalOptions,

            Outputs.TransformOutputCustomPresetFilter? filter,

            ImmutableArray<Outputs.TransformOutputCustomPresetFormat> formats)
        {
            Codecs = codecs;
            ExperimentalOptions = experimentalOptions;
            Filter = filter;
            Formats = formats;
        }
    }
}
