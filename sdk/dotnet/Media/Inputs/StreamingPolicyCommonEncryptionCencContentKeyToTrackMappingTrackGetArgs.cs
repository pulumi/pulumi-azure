// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        private InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionGetArgs>? _conditions;

        /// <summary>
        /// One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionGetArgs>());
            set => _conditions = value;
        }

        public StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackGetArgs()
        {
        }
        public static new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackGetArgs Empty => new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackGetArgs();
    }
}