// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class FlowletDataFlowSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `dataset` block as defined below.
        /// </summary>
        [Input("dataset")]
        public Input<Inputs.FlowletDataFlowSourceDatasetGetArgs>? Dataset { get; set; }

        /// <summary>
        /// The description for the Data Flow Source.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A `flowlet` block as defined below.
        /// </summary>
        [Input("flowlet")]
        public Input<Inputs.FlowletDataFlowSourceFlowletGetArgs>? Flowlet { get; set; }

        /// <summary>
        /// A `linked_service` block as defined below.
        /// </summary>
        [Input("linkedService")]
        public Input<Inputs.FlowletDataFlowSourceLinkedServiceGetArgs>? LinkedService { get; set; }

        /// <summary>
        /// The name for the Data Flow Source.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A `schema_linked_service` block as defined below.
        /// </summary>
        [Input("schemaLinkedService")]
        public Input<Inputs.FlowletDataFlowSourceSchemaLinkedServiceGetArgs>? SchemaLinkedService { get; set; }

        public FlowletDataFlowSourceGetArgs()
        {
        }
        public static new FlowletDataFlowSourceGetArgs Empty => new FlowletDataFlowSourceGetArgs();
    }
}