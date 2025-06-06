// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class SlotLogsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `application_logs` block as defined below.
        /// </summary>
        [Input("applicationLogs")]
        public Input<Inputs.SlotLogsApplicationLogsArgs>? ApplicationLogs { get; set; }

        /// <summary>
        /// Should `Detailed error messages` be enabled on this App Service slot? Defaults to `false`.
        /// </summary>
        [Input("detailedErrorMessagesEnabled")]
        public Input<bool>? DetailedErrorMessagesEnabled { get; set; }

        /// <summary>
        /// Should `Failed request tracing` be enabled on this App Service slot? Defaults to `false`.
        /// </summary>
        [Input("failedRequestTracingEnabled")]
        public Input<bool>? FailedRequestTracingEnabled { get; set; }

        /// <summary>
        /// An `http_logs` block as defined below.
        /// </summary>
        [Input("httpLogs")]
        public Input<Inputs.SlotLogsHttpLogsArgs>? HttpLogs { get; set; }

        public SlotLogsArgs()
        {
        }
        public static new SlotLogsArgs Empty => new SlotLogsArgs();
    }
}
