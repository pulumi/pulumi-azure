// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Inputs
{

    public sealed class IoTHubEnrichmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("endpointNames", required: true)]
        private InputList<string>? _endpointNames;

        /// <summary>
        /// The list of endpoints which will be enriched.
        /// </summary>
        public InputList<string> EndpointNames
        {
            get => _endpointNames ?? (_endpointNames = new InputList<string>());
            set => _endpointNames = value;
        }

        /// <summary>
        /// The key of the enrichment.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The value of the enrichment. Value can be any static string, the name of the IoT Hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public IoTHubEnrichmentArgs()
        {
        }
        public static new IoTHubEnrichmentArgs Empty => new IoTHubEnrichmentArgs();
    }
}
