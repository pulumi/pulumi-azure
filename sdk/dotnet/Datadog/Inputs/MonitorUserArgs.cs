// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Inputs
{

    public sealed class MonitorUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email of the user used by Datadog for contacting them if needed. Changing this forces a new Datadog Monitor to be created.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this user_info.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Phone number of the user used by Datadog for contacting them if needed.
        /// </summary>
        [Input("phoneNumber")]
        public Input<string>? PhoneNumber { get; set; }

        public MonitorUserArgs()
        {
        }
        public static new MonitorUserArgs Empty => new MonitorUserArgs();
    }
}