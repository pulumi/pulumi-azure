// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.TrafficManager.Outputs
{

    [OutputType]
    public sealed class ProfileMonitorConfigCustomHeader
    {
        /// <summary>
        /// The name of the custom header.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value of custom header. Applicable for HTTP and HTTPS protocol.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private ProfileMonitorConfigCustomHeader(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}
