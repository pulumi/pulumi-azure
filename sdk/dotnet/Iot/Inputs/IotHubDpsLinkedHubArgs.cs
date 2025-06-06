// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Inputs
{

    public sealed class IotHubDpsLinkedHubArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The weight applied to the IoT Hub. Defaults to `1`.
        /// </summary>
        [Input("allocationWeight")]
        public Input<int>? AllocationWeight { get; set; }

        /// <summary>
        /// Determines whether to apply allocation policies to the IoT Hub. Defaults to `true`.
        /// </summary>
        [Input("applyAllocationPolicy")]
        public Input<bool>? ApplyAllocationPolicy { get; set; }

        [Input("connectionString", required: true)]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string to connect to the IoT Hub.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The IoT Hub hostname.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The location of the IoT hub.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        public IotHubDpsLinkedHubArgs()
        {
        }
        public static new IotHubDpsLinkedHubArgs Empty => new IotHubDpsLinkedHubArgs();
    }
}
