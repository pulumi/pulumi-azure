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
    public sealed class TransformOutputCustomPresetCodec
    {
        /// <summary>
        /// A `aac_audio` block as defined above.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecAacAudio? AacAudio;
        /// <summary>
        /// A `copy_audio` block as defined below.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecCopyAudio? CopyAudio;
        /// <summary>
        /// A `copy_video` block as defined below.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecCopyVideo? CopyVideo;
        /// <summary>
        /// A `dd_audio` block as defined below.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecDdAudio? DdAudio;
        /// <summary>
        /// A `h264_video` block as defined below.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecH264Video? H264Video;
        /// <summary>
        /// A `h265_video` block as defined below.
        /// 
        /// &gt; **NOTE:** Each codec can only have one type: `aac_audio`, `copy_audio`, `copy_video`, `dd_audio`, `h264_video` or `h265_video`. If you need to apply different codec you must create one codec for each one.
        /// </summary>
        public readonly Outputs.TransformOutputCustomPresetCodecH265Video? H265Video;

        [OutputConstructor]
        private TransformOutputCustomPresetCodec(
            Outputs.TransformOutputCustomPresetCodecAacAudio? aacAudio,

            Outputs.TransformOutputCustomPresetCodecCopyAudio? copyAudio,

            Outputs.TransformOutputCustomPresetCodecCopyVideo? copyVideo,

            Outputs.TransformOutputCustomPresetCodecDdAudio? ddAudio,

            Outputs.TransformOutputCustomPresetCodecH264Video? h264Video,

            Outputs.TransformOutputCustomPresetCodecH265Video? h265Video)
        {
            AacAudio = aacAudio;
            CopyAudio = copyAudio;
            CopyVideo = copyVideo;
            DdAudio = ddAudio;
            H264Video = h264Video;
            H265Video = h265Video;
        }
    }
}