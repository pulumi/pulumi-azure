// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetworkFunction.Inputs
{

    public sealed class CollectorPolicyIpfxIngestionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("sourceResourceIds", required: true)]
        private InputList<string>? _sourceResourceIds;

        /// <summary>
        /// A list of ingestion source resource IDs. Changing this forces a new Network Function Collector Policy to be created.
        /// </summary>
        public InputList<string> SourceResourceIds
        {
            get => _sourceResourceIds ?? (_sourceResourceIds = new InputList<string>());
            set => _sourceResourceIds = value;
        }

        public CollectorPolicyIpfxIngestionGetArgs()
        {
        }
        public static new CollectorPolicyIpfxIngestionGetArgs Empty => new CollectorPolicyIpfxIngestionGetArgs();
    }
}
