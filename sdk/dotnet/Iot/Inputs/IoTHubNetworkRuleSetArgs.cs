// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Inputs
{

    public sealed class IoTHubNetworkRuleSetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines if Network Rule Set is also applied to the BuiltIn EventHub EndPoint of the IotHub. Defaults to `false`.
        /// </summary>
        [Input("applyToBuiltinEventhubEndpoint")]
        public Input<bool>? ApplyToBuiltinEventhubEndpoint { get; set; }

        /// <summary>
        /// Default Action for Network Rule Set. Possible values are `DefaultActionDeny`, `DefaultActionAllow`. Defaults to `DefaultActionDeny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipRules")]
        private InputList<Inputs.IoTHubNetworkRuleSetIpRuleArgs>? _ipRules;

        /// <summary>
        /// One or more `ip_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.IoTHubNetworkRuleSetIpRuleArgs> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<Inputs.IoTHubNetworkRuleSetIpRuleArgs>());
            set => _ipRules = value;
        }

        public IoTHubNetworkRuleSetArgs()
        {
        }
    }
}