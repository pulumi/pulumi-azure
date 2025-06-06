// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class DataFlowTransformationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `dataset` block as defined below.
        /// </summary>
        [Input("dataset")]
        public Input<Inputs.DataFlowTransformationDatasetGetArgs>? Dataset { get; set; }

        /// <summary>
        /// The description for the Data Flow transformation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A `flowlet` block as defined below.
        /// </summary>
        [Input("flowlet")]
        public Input<Inputs.DataFlowTransformationFlowletGetArgs>? Flowlet { get; set; }

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Input("linkedService")]
        public Input<Inputs.DataFlowTransformationLinkedServiceGetArgs>? LinkedService { get; set; }

        /// <summary>
        /// The name for the Data Flow transformation.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public DataFlowTransformationGetArgs()
        {
        }
        public static new DataFlowTransformationGetArgs Empty => new DataFlowTransformationGetArgs();
    }
}
