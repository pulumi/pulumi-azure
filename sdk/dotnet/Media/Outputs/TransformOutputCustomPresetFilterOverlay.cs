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
    public sealed class TransformOutputCustomPresetFilterOverlay
    {
        /// <summary>
        /// An `audio` block as defined above.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetFilterOverlayAudio? Audio;
        /// <summary>
        /// A `video` block as defined below.
        /// 
        /// &gt; **NOTE:** Each overlay can only have one type: `audio` or `video`. If you need to apply different type you must create one overlay for each one.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetFilterOverlayVideo? Video;

        [OutputConstructor]
        private TransformOutputCustomPresetFilterOverlay(
            Outputs.TransformOutputCustomPresetFilterOverlayAudio? audio,

            Outputs.TransformOutputCustomPresetFilterOverlayVideo? video)
        {
            Audio = audio;
            Video = video;
        }
    }
}