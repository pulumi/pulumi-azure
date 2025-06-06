// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class TriggerCustomEventPipelineGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Data Factory Pipeline name that the trigger will act on.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// The Data Factory Pipeline parameters that the trigger will act on.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        public TriggerCustomEventPipelineGetArgs()
        {
        }
        public static new TriggerCustomEventPipelineGetArgs Empty => new TriggerCustomEventPipelineGetArgs();
    }
}
