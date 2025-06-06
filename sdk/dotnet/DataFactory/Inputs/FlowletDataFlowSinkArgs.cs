// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class FlowletDataFlowSinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `dataset` block as defined below.
        /// </summary>
        [Input("dataset")]
        public Input<Inputs.FlowletDataFlowSinkDatasetArgs>? Dataset { get; set; }

        /// <summary>
        /// The description for the Data Flow Source.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A `flowlet` block as defined below.
        /// </summary>
        [Input("flowlet")]
        public Input<Inputs.FlowletDataFlowSinkFlowletArgs>? Flowlet { get; set; }

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Input("linkedService")]
        public Input<Inputs.FlowletDataFlowSinkLinkedServiceArgs>? LinkedService { get; set; }

        /// <summary>
        /// The name for the Data Flow Source.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A `rejected_linked_service` block as defined below.
        /// </summary>
        [Input("rejectedLinkedService")]
        public Input<Inputs.FlowletDataFlowSinkRejectedLinkedServiceArgs>? RejectedLinkedService { get; set; }

        /// <summary>
        /// A `schema_linked_service` block as defined below.
        /// </summary>
        [Input("schemaLinkedService")]
        public Input<Inputs.FlowletDataFlowSinkSchemaLinkedServiceArgs>? SchemaLinkedService { get; set; }

        public FlowletDataFlowSinkArgs()
        {
        }
        public static new FlowletDataFlowSinkArgs Empty => new FlowletDataFlowSinkArgs();
    }
}
