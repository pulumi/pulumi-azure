// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the threshold observation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Name of the built-in Anomaly Alert Rule. Changing this forces a new Built-in Anomaly Alert Rule to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("supportedValues")]
        private InputList<string>? _supportedValues;

        /// <summary>
        /// A list of supported values of the single select observation.
        /// </summary>
        public InputList<string> SupportedValues
        {
            get => _supportedValues ?? (_supportedValues = new InputList<string>());
            set => _supportedValues = value;
        }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// A list of values of the single select observation.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs()
        {
        }
        public static new AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs Empty => new AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs();
    }
}