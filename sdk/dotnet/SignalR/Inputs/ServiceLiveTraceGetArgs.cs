// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR.Inputs
{

    public sealed class ServiceLiveTraceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the log category `ConnectivityLogs` is enabled? Defaults to `true`
        /// </summary>
        [Input("connectivityLogsEnabled")]
        public Input<bool>? ConnectivityLogsEnabled { get; set; }

        /// <summary>
        /// Whether the live trace is enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether the log category `HttpRequestLogs` is enabled? Defaults to `true`
        /// </summary>
        [Input("httpRequestLogsEnabled")]
        public Input<bool>? HttpRequestLogsEnabled { get; set; }

        /// <summary>
        /// Whether the log category `MessagingLogs` is enabled? Defaults to `true`
        /// </summary>
        [Input("messagingLogsEnabled")]
        public Input<bool>? MessagingLogsEnabled { get; set; }

        public ServiceLiveTraceGetArgs()
        {
        }
        public static new ServiceLiveTraceGetArgs Empty => new ServiceLiveTraceGetArgs();
    }
}