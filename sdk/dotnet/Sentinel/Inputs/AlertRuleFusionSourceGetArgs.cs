// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class AlertRuleFusionSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this source signal is enabled or disabled in Fusion detection? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the Fusion source signal. Refer to Fusion alert rule template for supported values.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("subTypes")]
        private InputList<Inputs.AlertRuleFusionSourceSubTypeGetArgs>? _subTypes;

        /// <summary>
        /// One or more `sub_type` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleFusionSourceSubTypeGetArgs> SubTypes
        {
            get => _subTypes ?? (_subTypes = new InputList<Inputs.AlertRuleFusionSourceSubTypeGetArgs>());
            set => _subTypes = value;
        }

        public AlertRuleFusionSourceGetArgs()
        {
        }
        public static new AlertRuleFusionSourceGetArgs Empty => new AlertRuleFusionSourceGetArgs();
    }
}