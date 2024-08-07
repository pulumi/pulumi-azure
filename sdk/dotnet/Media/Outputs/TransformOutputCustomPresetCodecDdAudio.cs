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
    public sealed class TransformOutputCustomPresetCodecDdAudio
    {
        /// <summary>
        /// The bitrate of the audio in bits per second. Default to `192000`.
        /// </summary>
        public readonly int? Bitrate;
        /// <summary>
        /// The number of audio channels. Default to `2`.
        /// </summary>
        public readonly int? Channels;
        /// <summary>
        /// Specifies the label for the codec. The label can be used to control muxing behavior.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// The sampling rate to use for encoding in Hertz. Default to `48000`.
        /// </summary>
        public readonly int? SamplingRate;

        [OutputConstructor]
        private TransformOutputCustomPresetCodecDdAudio(
            int? bitrate,

            int? channels,

            string? label,

            int? samplingRate)
        {
            Bitrate = bitrate;
            Channels = channels;
            Label = label;
            SamplingRate = samplingRate;
        }
    }
}
