// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewayProbe
    {
        /// <summary>
        /// The Hostname used for this Probe. If the Application Gateway is configured for a single site, by default the Host name should be specified as `127.0.0.1`, unless otherwise configured in custom probe. Cannot be set if `pick_host_name_from_backend_http_settings` is set to `true`.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The Interval between two consecutive probes in seconds. Possible values range from 1 second to a maximum of 86,400 seconds.
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// A `match` block as defined above.
        /// </summary>
        public readonly Outputs.ApplicationGatewayProbeMatch? Match;
        /// <summary>
        /// The minimum number of servers that are always marked as healthy. Defaults to `0`.
        /// </summary>
        public readonly int? MinimumServers;
        /// <summary>
        /// The Name of the Probe.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Path used for this Probe.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Whether the host header should be picked from the backend HTTP settings. Defaults to `false`.
        /// </summary>
        public readonly bool? PickHostNameFromBackendHttpSettings;
        /// <summary>
        /// Custom port which will be used for probing the backend servers. The valid value ranges from 1 to 65535. In case not set, port from HTTP settings will be used. This property is valid for Basic, Standard_v2 and WAF_v2 only.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The Protocol used for this Probe. Possible values are `Http` and `Https`.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// The Timeout used for this Probe, which indicates when a probe becomes unhealthy. Possible values range from 1 second to a maximum of 86,400 seconds.
        /// </summary>
        public readonly int Timeout;
        /// <summary>
        /// The Unhealthy Threshold for this Probe, which indicates the amount of retries which should be attempted before a node is deemed unhealthy. Possible values are from 1 to 20.
        /// </summary>
        public readonly int UnhealthyThreshold;

        [OutputConstructor]
        private ApplicationGatewayProbe(
            string? host,

            string? id,

            int interval,

            Outputs.ApplicationGatewayProbeMatch? match,

            int? minimumServers,

            string name,

            string path,

            bool? pickHostNameFromBackendHttpSettings,

            int? port,

            string protocol,

            int timeout,

            int unhealthyThreshold)
        {
            Host = host;
            Id = id;
            Interval = interval;
            Match = match;
            MinimumServers = minimumServers;
            Name = name;
            Path = path;
            PickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            Port = port;
            Protocol = protocol;
            Timeout = timeout;
            UnhealthyThreshold = unhealthyThreshold;
        }
    }
}
