// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media
{
    [AzureResourceType("azure:media/liveEventOutput:LiveEventOutput")]
    public partial class LiveEventOutput : Pulumi.CustomResource
    {
        [Output("archiveWindowDuration")]
        public Output<string> ArchiveWindowDuration { get; private set; } = null!;

        [Output("assetName")]
        public Output<string> AssetName { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("hlsFragmentsPerTsSegment")]
        public Output<int?> HlsFragmentsPerTsSegment { get; private set; } = null!;

        [Output("liveEventId")]
        public Output<string> LiveEventId { get; private set; } = null!;

        [Output("manifestName")]
        public Output<string> ManifestName { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("outputSnapTimeInSeconds")]
        public Output<int?> OutputSnapTimeInSeconds { get; private set; } = null!;


        /// <summary>
        /// Create a LiveEventOutput resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LiveEventOutput(string name, LiveEventOutputArgs args, CustomResourceOptions? options = null)
            : base("azure:media/liveEventOutput:LiveEventOutput", name, args ?? new LiveEventOutputArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LiveEventOutput(string name, Input<string> id, LiveEventOutputState? state = null, CustomResourceOptions? options = null)
            : base("azure:media/liveEventOutput:LiveEventOutput", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LiveEventOutput resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LiveEventOutput Get(string name, Input<string> id, LiveEventOutputState? state = null, CustomResourceOptions? options = null)
        {
            return new LiveEventOutput(name, id, state, options);
        }
    }

    public sealed class LiveEventOutputArgs : Pulumi.ResourceArgs
    {
        [Input("archiveWindowDuration", required: true)]
        public Input<string> ArchiveWindowDuration { get; set; } = null!;

        [Input("assetName", required: true)]
        public Input<string> AssetName { get; set; } = null!;

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("hlsFragmentsPerTsSegment")]
        public Input<int>? HlsFragmentsPerTsSegment { get; set; }

        [Input("liveEventId", required: true)]
        public Input<string> LiveEventId { get; set; } = null!;

        [Input("manifestName")]
        public Input<string>? ManifestName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputSnapTimeInSeconds")]
        public Input<int>? OutputSnapTimeInSeconds { get; set; }

        public LiveEventOutputArgs()
        {
        }
    }

    public sealed class LiveEventOutputState : Pulumi.ResourceArgs
    {
        [Input("archiveWindowDuration")]
        public Input<string>? ArchiveWindowDuration { get; set; }

        [Input("assetName")]
        public Input<string>? AssetName { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("hlsFragmentsPerTsSegment")]
        public Input<int>? HlsFragmentsPerTsSegment { get; set; }

        [Input("liveEventId")]
        public Input<string>? LiveEventId { get; set; }

        [Input("manifestName")]
        public Input<string>? ManifestName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputSnapTimeInSeconds")]
        public Input<int>? OutputSnapTimeInSeconds { get; set; }

        public LiveEventOutputState()
        {
        }
    }
}
