// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Inputs
{

    public sealed class SoftwareUpdateConfigurationPreTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Specifies a map of parameters for the task.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The name of the runbook for the pre task.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        public SoftwareUpdateConfigurationPreTaskArgs()
        {
        }
        public static new SoftwareUpdateConfigurationPreTaskArgs Empty => new SoftwareUpdateConfigurationPreTaskArgs();
    }
}
